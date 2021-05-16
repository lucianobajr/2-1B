package pkg2.pkg1b.model.User;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import pkg2.pkg1b.model.Enviroment.Enviroment;
import pkg2.pkg1b.model.Mask;

public class NormalUser extends User { 
    private int TypeUser; // 1 normal user - 2 emplyed user -> so vai mudar o ambiente 
    private int Desease_history_score; 
    // define a mascara que o usuario está usando 
    Mask TypeMask = new Mask();   
    // define o ambiente  que o usuario esta
    Enviroment UserEnv = new Enviroment();  
    Scanner getK = new Scanner(System.in); 
     
    public NormalUser(String name, int age,Sex sex) {
        super(name, age,sex);
    } 
     
    public void init_NormalUser_verification(){ 
        //System.out.println("Digite 1 para sim ou 2 para não para cada uma das doenças abaixo"); 
            
            desease_verification();     
            Mask_verification();
            
    } 
    private void desease_verification(){  
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
    
    private void  Mask_verification(){ 
        // return mask Score  
        int id = 1 ; // vai vir do butão da parte grafica   
        System.out.println("Tipos de mascaras:"); 
        
        if(id == 1){ 
            TypeMask.setId(id);
            TypeMask.setDescrição("Mascara cirurgica"); 
            TypeMask.setGrauDeProtecao(3);
        } 
        else if(id == 2 ){   
            
            TypeMask.setId(id);
            TypeMask.setDescrição("Mascara N95"); 
            TypeMask.setGrauDeProtecao(4);
        } 
        else if(id == 3){ 
           
            TypeMask.setId(id);
            TypeMask.setDescrição("Mascara PFF2"); 
            TypeMask.setGrauDeProtecao(4);
        } 
        else if(id == 4){   
            
            TypeMask.setId(id);
            TypeMask.setDescrição("Mascara Tecido"); 
            TypeMask.setGrauDeProtecao(2);
        
        }  
        else if(id == 5){  
            
            TypeMask.setId(id);
            TypeMask.setDescrição("NoMask"); 
            TypeMask.setGrauDeProtecao(0);
        }
        else{ 
            System.out.println("Mascara nao existe");
        }
        
        
    } 
    
    private void enviroment_verification(){  
        String nameEnvi; 
        System.out.println("Entre com o ambiente:"); 
        nameEnvi = getK.nextLine();    
        this.UserEnv.setName(nameEnvi);  
        this.UserEnv.setRisk();
       
        
    }
     
   
    public void show_user(){ 
        System.out.println("---------------------------------");
        System.out.println("Dados do usuario:"); 
        System.out.println("Nome: "+ getName()); 
        System.out.println("Idade: "+ getAge());  
        System.out.println("Sexo: " + this.show_sex() );
        System.out.println("Pontuação em grupo de risco: " + this.Desease_history_score);  
        if(Desease_history_score >= 1)
            System.out.println("Sua pontuação de risco é superior a 1 é recomendado que tome cuidados!");
        System.out.println("Mask: "+ this.TypeMask.getDescrição()); 
        System.out.println("Mask protection: "+ this.TypeMask.getGrauDeProtecao()); 
        System.out.println("Local: "+ this.UserEnv.getName()); 
        System.out.println("Local Risco: "+ this.UserEnv.getRisk());
        System.out.println("---------------------------------");

    } 
    private String toStringNormalUser(){  
        // se der problema de linha a mais tirar o /n
        return getName()+" "+getAge()+" "+getSex()+" "+this.Desease_history_score +"\n"; 
    } 

  
}
