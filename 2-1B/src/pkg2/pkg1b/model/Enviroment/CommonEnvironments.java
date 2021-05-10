package model.Enviroment;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CommonEnvironments {
    private String[] AvaiablePlaces = {"Hospital", "Transporte Bublico", "Banco", "Loteria","Elevador","Cinema","Academia","Feira Livre", "Supermecado","Restaurante","Consultorio","Drogaria","Via Publica","Veiculo Particula","Casa"}; 
    private ArrayList<Enviroment> CommonEviromentList = new ArrayList<Enviroment>();  
    
    // os ambientes so serao criados a medida que o usuario os insira  
    private void init_set_commons_environment(){ 
        int Risk_by_Count = AvaiablePlaces.length ; 
        int Count_to_Id = 0 ;
        for(String i:AvaiablePlaces){ 
            Enviroment Env = new Enviroment();  
            Env.setName(i); 
            Env.setRisk(Risk_by_Count); 
            Env.setId(Count_to_Id); 
            Risk_by_Count -=1;  
            Count_to_Id +=1; 
            CommonEviromentList.add(Env);   
            
        } 

    }
    private boolean Verify_Enviroment(String Name){ 
        for(Enviroment E: CommonEviromentList){ 
            if(E.getName().equals(Name)) return true; 
        } 
        return false;
    }
}
