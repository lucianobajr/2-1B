package pkg2.pkg1b.model.User;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import pkg2.pkg1b.model.Enviroment.Enviroment;
import pkg2.pkg1b.model.Mask;

public class NormalUser extends User { 
    private int TypeUser; // 1 normal user - 2 emplyed user -> so vai mudar o ambiente 
    private int Desease_history_score;  
    private int TempoPermanenciaLocal;   
    private double score; 
    // define a mascara que o usuario está usando 
    Mask TypeMask = new Mask();   
    // define o ambiente  que o usuario esta
    Enviroment UserEnv = new Enviroment();  
    Scanner getK = new Scanner(System.in); 
     
    public NormalUser(String name, int age,Sex sex) {
        super(name, age,sex);
    } 
     
    
    public int getTempoPermanenciaLocal(){ 
        return this.TempoPermanenciaLocal;
    } 
    public void setTempoPermanciaLocal(int tempo){ 
        this.TempoPermanenciaLocal = tempo; 
    } 
    public int getScoreMask(){ 
        return this.TypeMask.getRisk(); 
    } 
    public int getScoreDesease(){ 
        return this.Desease_history_score; 
    } 
    public int getScoreEnvi(){ 
        return this.UserEnv.getRisk(); 
    }  
    public void setDesease(int value ){ 
        this.Desease_history_score = value;
    } 
    public void setMask(String mask){ 
        int id = 1;  
        this.TypeMask.setId(id);
        this.TypeMask.setDescrição(mask);  
        
        
    } 
    public void setEnvi(String Envi){ 
        this.UserEnv.setName(Envi);  
        this.UserEnv.setRisk();
    } 
    public void setTime(int Time){ 
        this.TempoPermanenciaLocal = Time; 
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
        System.out.println("Mask protection: "+ this.getScoreMask()); 
        System.out.println("Local: "+ this.UserEnv.getName()); 
        System.out.println("Local Risco: "+ this.UserEnv.getRisk());
        
    } 
   

  
}
