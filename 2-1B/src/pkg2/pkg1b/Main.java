package pkg2.pkg1b;
import pkg2.pkg1b.User.Sex;

import java.io.FileNotFoundException;
import java.util.Scanner;
/** 
 * @author Cláudio,Guilherme e Luciano
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException { 
        String name, Ssex;   
        int age;  
        Sex sex;   
        
        Scanner getK = new Scanner(System.in);
        System.out.println("Digite 1- Nomral User / 2- Employed User"); 
        if(getK.nextInt() == 1){
            NormalUser luciano = new NormalUser("Luciano",21,Sex.Male);
            System.out.println("O usuário "+luciano.getName()+" tem "+luciano.getAge()+" anos"); 
        }
        else if(getK.nextInt() == 2){  
            // error 
            System.out.println("Nome: "); 
            name = getK.nextLine(); 
            System.out.println("Idade:"); 
            age = getK.nextInt();  
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
