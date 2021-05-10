package model.Enviroment;
import java.util.Scanner;
public class Enviroment{   
    //private String[]
    private int NumberPeopleProjection;  
       
    private enum enviromentType{ 
        Closed, Opened
    }  
    
    public void init_projection(){   
        
        Scanner get = new Scanner(System.in); 
        System.out.println("Quantas pessoas estao no local, não é necessário o valor exato."); 
        NumberPeopleProjection = get.nextInt();   

    } 


}; 