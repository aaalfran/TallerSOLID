/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Adicionales.Aderezo;
import Adicionales.CREMA;
import Adicionales.FRUTILLA;
import Postres.*;
import Procesos.*;
import Leche.*;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Descremada
        // Finalmente mostrar el precio final de cada uno
        LecheEntera leche = new LecheDeslactosada();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        
        // Producir Helado
        Helado helado_vainilla = new Helado("Vainilla");
        
        CREMA C = new CREMA();
        FRUTILLA F = new FRUTILLA();
        
        helado_vainilla.anadirAderezo(C);
        helado_vainilla.anadirAderezo(F);
        System.out.println(helado_vainilla);
        mnj_leche.cambiarTipoLeche(leche, helado_vainilla); //1
        System.out.println(helado_vainilla.showPrecioFinal());
        
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        pastel_chocolate.quitarAderezo(C);
        pastel_chocolate.anadirAderezo(F);
        System.out.println(pastel_chocolate);
        mnj_leche.cambiarTipoLeche(leche, pastel_chocolate); //1
        System.out.println(helado_vainilla.showPrecioFinal());
        
        
    }
}
