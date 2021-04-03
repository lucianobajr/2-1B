package pkg2.pkg1b; 
import java.util.Scanner; 
public class EmployedUser extends User{ 
    private int Desease_history_score;   
     

    public EmployedUser(String name, int age, Sex sex){   
        super(name,age,sex); 
    }   
    public void init_employe_verification(){  
        Scanner getK = new Scanner(System.in); 
        System.out.println("Digite 1 para sim ou 2 para não para cada uma das doenças abaixo"); 
        System.out.println("Diabetes"); 
        if(getK.nextInt()==1) { 
            this.Desease_history_score +=1 ; 
        } 
        System.out.println("Hipertensao"); 
        if(getK.nextInt()==1) { 
            this.Desease_history_score +=1 ; 
        }
        System.out.println("Qualquer doença cardiaca"); 
        if(getK.nextInt()==1) { 
            this.Desease_history_score +=1 ; 
        }  
        System.out.println("Qualquer doença pulmonar"); 
        if(getK.nextInt()==1) { 
            this.Desease_history_score +=1 ; 
        }  
    }
    public void show_user(){ 
        System.out.println("---------------------------------");
        System.out.println("Dados do usuario:"); 
        System.out.println("Nome: "+ getName()); 
        System.out.println("Idade: "+ getAge()); 
        System.out.println("Pontuação em grupo de risco: " + this.Desease_history_score);  
        if(Desease_history_score >= 1)
            System.out.println("Sua pontuação de risco é superior a 1 é recomendado que tome cuidados!");
        
            System.out.println("---------------------------------");

    }  

  
}