/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Categoria;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PC_Daniel
 */
public class ControlCategoriaTest {
    
    public ControlCategoriaTest() {
    }

    @Test
    public void testCargarCbox() {
        ControlCategoria objCtrCategoria = new ControlCategoria(); 
        ArrayList<Categoria> lista = new ArrayList<>(); 
        
        assertEquals(objCtrCategoria.cargarCbox().getClass(), lista.getClass()); 
    }
    
}
