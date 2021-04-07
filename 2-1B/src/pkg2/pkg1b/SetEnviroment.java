package pkg2.pkg1b; 
import java.io.File ;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.io.FileNotFoundException; 

public class SetEnviroment{  
    List<BusinessEnvironment> SetEnvi = new ArrayList<>(); 
    private int totalEnv = 0 ; 

    public void read_enviroments() throws FileNotFoundException {
        String[] parts; 
        String name, enviroment ;  
        float dimension;  
        int  n = 0 ;   
        BusinessEnvironment aux; 
        File fl = new File("/Users/Macbook/Documents/2-1B/2-1B/src/pkg2/pkg1b/Enviroments.txt");  
        Scanner get = new Scanner(fl);   
       

        do{ 
        
        enviroment = get.nextLine(); 
        parts = enviroment.split(" "); 
        name = parts[0];  
        dimension = Float.parseFloat(parts[1]);    
        aux = new BusinessEnvironment();
        aux.setname(name); 
        aux.setDimension(dimension); 
        SetEnvi.add(aux);  


        }while(get.hasNextLine());
   
    } 
    public void ShowSetEnviroments(){  
        for (BusinessEnvironment element : SetEnvi){ 
            System.out.println("Ambiente: "+ element.gatname() + " dimensao: " + element.getDimension());
        }
    }   

}; 