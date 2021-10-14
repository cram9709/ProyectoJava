/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Categoria;
import Modelo.Producto;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PC_Daniel
 */
public class ControlProducto {
    //ATRIBUTOS: 
    private Producto objProducto = new Producto(); 
    
    //METODOS: 
    public void crear(String nombre, String cantidad, String precio,
                        Categoria categoria){
        
        try{
            objProducto.setNombre(nombre);
            objProducto.setCantidad(Integer.parseInt(cantidad));
            objProducto.setPrecio(Integer.parseInt(precio));
            objProducto.setCategoria(categoria);
            
            objProducto.crearProducto();
            
        }
        catch(Exception error){
            JOptionPane.showMessageDialog(null, "ERROR: "+error);
        }
        
    }
    
    public ArrayList listar(){
        try{
            ResultSet consulta = objProducto.listarProductos(); 
            ArrayList<Producto> listaProducto = new ArrayList<>(); 
            
            while(consulta.next()){
                objProducto = new Producto(); 
                objProducto.setId(consulta.getInt(1));
                objProducto.setNombre(consulta.getString(2));
                objProducto.setCantidad(consulta.getInt(3));
                objProducto.setPrecio(consulta.getInt(4));
                
                listaProducto.add(objProducto); 
            }
            
            return listaProducto; 
        }
        catch(Exception error){
            JOptionPane.showMessageDialog(null, "ERROR: "+error);
            return null; 
        }   
    }
    
    
    public void actualizar(String id, String nombre, String 
                            cantidad, String precio){
        
        try{
            objProducto.setNombre(nombre);
            objProducto.setCantidad(Integer.parseInt(cantidad));
            objProducto.setPrecio(Integer.parseInt(precio));
            objProducto.setId(Integer.parseInt(id));
            
            objProducto.actualizarProducto();
            
        }
        catch(Exception error){
            JOptionPane.showMessageDialog(null, "ERROR: "+error);
        }
        
    }
    
    public void eliminar(String id){
        
        try{
            objProducto.setId(Integer.parseInt(id));
            
            objProducto.eliminarProducto();
            
        }
        catch(Exception error){
            JOptionPane.showMessageDialog(null, "ERROR: "+error);
        }
        
    }
    
    public ArrayList consultar(String nombre){
        try{
            objProducto.setNombre(nombre);
            ResultSet consulta = objProducto.consultarProducto(); 
            ArrayList<Producto> consultaProducto = new ArrayList<>(); 
            
            while(consulta.next()){
                objProducto = new Producto(); 
                objProducto.setId(consulta.getInt(1));
                objProducto.setNombre(consulta.getString(2));
                objProducto.setCantidad(consulta.getInt(3));
                objProducto.setPrecio(consulta.getInt(4));
                
                consultaProducto.add(objProducto); 
            }
            
            return consultaProducto; 
        }
        catch(Exception error){
            JOptionPane.showMessageDialog(null, "ERROR: "+error);
            return null; 
        }   
    }
}
