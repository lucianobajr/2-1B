package pkg2.pkg1b.model.Enviroment;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CommonEnvironments {
    private String[] AvaiablePlaces = {"Hospital", "Transporte Publico", "Banco", "Loteria","Elevador","Cinema","Academia","Feira Livre", "Supermecado","Restaurante","Consultorio","Drogaria","Via Publica","Veiculo Particula","Casa"}; 
    
    public boolean verify(String Name){ 
        for(String i: AvaiablePlaces){ 
            if(i.equals(Name)) 
                return true; 
        } 
        return false; 
    }  
    public int getRisk(String name){ 
        int risk = 15 ; 
        for(String i: AvaiablePlaces){ 
            risk--; 
            if(i.equals(name)) 
               return risk; 
        }
        return 0; 
    } 
   
} 

