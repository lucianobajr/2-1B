package pkg2.pkg1b.controller;

import pkg2.pkg1b.model.User.NormalUser;
import java.util.Scanner;  
import pkg2.pkg1b.model.User.User.Sex;

public class NormalUserController {
    public void init_new_user(){  
        String Name;  
        int Age ;  
        Sex SS; 
        String PreSS;    
////////////////////////////////////////
        // isso vai ficar na parte grafica  
        ////////////////////////////////////////
        // pode ser tela futuramente (uma das primeiras)
        Scanner get = new Scanner(System.in);
        // todos os prints serao substituidos por comandos tela  
        System.out.println("Nome:"); 
        Name = get.nextLine();  
        System.out.println("Idade:");
        Age = get.nextInt();   
        
        get.nextLine();
        
        System.out.println("Sexo (ex.: masculino): ");
         PreSS = get.nextLine();
            if(PreSS.equals("masculino"))
                SS = Sex.Male;
            else
                SS = Sex.Female;
    
        
        NormalUser newUser = new NormalUser(Name,Age,SS); 
        
        newUser.init_NormalUser_verification();  
        
        newUser.show_user(); 
    }
}
