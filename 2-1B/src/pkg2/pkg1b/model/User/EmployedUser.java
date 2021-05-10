package model.User;
import java.io.FileWriter;
import java.io.IOException;
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
        try {
            write_user_in_file();
        } catch (IOException e) {
            e.printStackTrace();
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
    public void write_user_in_file() throws IOException{ 
        FileWriter myWriter = new FileWriter("/Users/Macbook/Documents/2-1B/2-1B/src/pkg2/pkg1b/employed_data.txt", true);
        try{  
            myWriter.write(toStringEmployed()); 
            myWriter.close();
        } 
        catch(IOException e){ 
            System.err.println("Erro no arquivo"); 
            e.printStackTrace();
        }
    }  
    private String toStringEmployed(){  
        // se der problema de linha a mais tirar o /n
        return getName()+" "+getAge()+" "+getSex()+" "+this.Desease_history_score +"\n"; 
    }  

  
}