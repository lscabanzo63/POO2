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
public class AvesTruz extends Ave {

   public static final Logger logger= LoggerFactory.getLogger(Canario.class);
        public AvesTruz(){
            logger.debug("Instanciando AvesTruz");
            this.setTipoSonido(new SinCanto());
            this.setTipoVuelo(new SinVuelo());
        }

    
    
}
