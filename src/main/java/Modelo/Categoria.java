/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author PC_Daniel
 */
public class Categoria {
    //ATRIBUTOS: 
    private int idCategoria; 
    private String nombreCategoria; 
    
    //CONSTRUCTOR: 
    public Categoria() {
    }
    
    //ENCAPSULAR: 
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    
    //METODO: 
    public ResultSet consultarCategoria(){
        Conexion objConector = new Conexion(); 
        objConector.conectar();
        
        try{
            String sql = "SELECT nombreCategoria FROM categoria; ";
            PreparedStatement stmt; 
            stmt = objConector.conn.prepareStatement(sql); 
            ResultSet consulta = stmt.executeQuery(); 
            objConector.desconectar();

            return consulta; 
        }
        catch(Exception error){
            JOptionPane.showMessageDialog(null, "ERROR: "+error);
            objConector.desconectar(); 
            return null; 
        }   
    }
}
