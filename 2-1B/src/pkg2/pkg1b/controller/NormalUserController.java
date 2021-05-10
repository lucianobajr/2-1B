package controller;

import model.User.NormalUser;
import model.User.User.Sex;

import java.util.Scanner;  

public class NormalUserController {
    public void init_new_user(){  
        String Name;  
        int Age ;  
        Sex SS; 
        String PreSS;    

        // pode ser tela futuramente (uma das primeiras)
        Scanner get = new Scanner(System.in);
        // todos os prints serao substituidos por comandos tela  
        System.out.println("Nome:"); 
        Name = get.nextLine();  
        System.out.println("Idade:");
        Age = get.nextInt();   

        System.out.println("Sexo (ex.: masculino): ");
            PreSS = get.nextLine();
            if(PreSS.equals("masculino"))
                SS = Sex.Male;
            else
                SS = Sex.Female;
    
        
        NormalUser newUser = new NormalUser(Name,Age,SS);
        System.out.println("O usuário "+newUser.getName()+" tem "+newUser.getAge()+" anos");

    }
}
