/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.Connection; 
import java.sql.DriverManager; 
import javax.swing.JOptionPane; 
/**
 *
 * @author PC_Daniel
 */
public class Conexion {
    //ATRIBUTOS: 
    public Connection conn; 
    private String host="localhost:3306";
    private String database = "productosmisiontic3";
    private String usuario = "root"; 
    private String password = ""; 
    
    // METODOS: 
    public void conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); 
            conn = DriverManager.getConnection("jdbc:mysql://"+this.host+"/"+this.database+"?zeroDateTimeBehavior=CONVERT_TO_NULL",this.usuario,this.password); 
            //JOptionPane.showMessageDialog(null, "CONEXION CORRECTA!!");
        }
        catch(Exception error){
            JOptionPane.showMessageDialog(null, "ERROR: "+error);
        }
    }
    
    public void desconectar(){
        conn = null; 
    }
}
