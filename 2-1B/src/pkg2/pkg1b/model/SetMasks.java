/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg1b.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
/**
 *
 * @author Guilherme
 */
public class SetMasks {
     private String[] AvaiableMasks = {"Sem Mascara", "Mascara Tecido", "Mascara cirurgica", "Mascara N95", "Mascara PFF2"};

      public int getRisk(String name){  
          // ao contrario 
        int risk = 4 ; 
        for(String i: AvaiableMasks){ 
            if(risk< 2) risk = 1;
            if(i.equals(name)) 
               return risk; 
            risk--;
        }
        return 0; 
    }
}
