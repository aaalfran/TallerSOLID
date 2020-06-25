/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Postres.Postre;

/**
 *
 * @author CDHTN
 */
public class ManejadorDePrecio {
    
    public static double calcularPrecioFinal(Postre postre){
        double precioFinal;
        precioFinal=(postre.getPrecioParcial()+(postre.getPrecioParcial()*0.12))+(postre.getAderezos().size()*0.50);
        return precioFinal;
    }
    
    public static String showPrecioFinal(Postre postre){   
        return "Precio Final: $ " + calcularPrecioFinal(postre);
    } 
   
}
