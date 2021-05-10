package controller;  

import java.util.Scanner;

import model.User.EmployedUser;
import model.User.NormalUser;
import model.User.User.Sex;
public class BasicController {
    public void init_controller(){  
        String name, Ssex;
        int age;
        Sex sex;
        int answer = 0 ;
    
        Scanner getK = new Scanner(System.in);
        System.out.println("Digite 1- Nomral User |  2- Employed User");
        answer = getK.nextInt();
    
        if(answer==1 ){
            NormalUser luciano = new NormalUser("Luciano",21,Sex.Male);
            System.out.println("O usuário "+luciano.getName()+" tem "+luciano.getAge()+" anos");
    
        }
    
        if(answer==2){
    
            // error
            getK.nextLine();
            System.out.println("Nome: ");
            name = getK.nextLine();
            System.out.println("Idade:");
            age = getK.nextInt();
            getK.nextLine();
    
            System.out.println("Sexo (ex.: masculino): ");
            Ssex = getK.nextLine();
            if(Ssex.equals("masculino"))
                sex = Sex.Male;
            else
                sex = Sex.Female;
    
            EmployedUser EUser = new EmployedUser(name, age, sex);
            EUser.init_employe_verification();
            EUser.show_user();
        }
    
    }
  



}
