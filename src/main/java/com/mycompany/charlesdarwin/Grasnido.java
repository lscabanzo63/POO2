/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.charlesdarwin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author santi
 */
public class Grasnido implements TipoSonido {
    public static final Logger logger= LoggerFactory.getLogger(Grasnido.class);
    

    @Override
    public void makeSound() {
        logger.debug("grasnando");
        System.out.println("grasnando");
        
        
        
    }
    
    
}
