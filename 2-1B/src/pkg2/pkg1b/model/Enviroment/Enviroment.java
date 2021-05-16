package pkg2.pkg1b.model.Enviroment;
import java.util.Scanner;
public class Enviroment{   
    private int NumberPeopleProjection;  
    private String Name;  
    private int id;  
    private int risk;   
    public CommonEnvironments AllEnv =  new CommonEnvironments();  
       
    private enum enviromentType{ 
        Closed, Opened
    }  
    
    public void init_projection(){   
        
        Scanner get = new Scanner(System.in); 
        System.out.println("Quantas pessoas estao no local, não é necessário o valor exato."); 
        setNumberPeopleProjection(get.nextInt());   

    }

    public int getNumberPeopleProjection() {
        return NumberPeopleProjection;
    }

    public void setNumberPeopleProjection(int numberPeopleProjection) {
        this.NumberPeopleProjection = numberPeopleProjection;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk() { 
        this.risk = this.AllEnv.getRisk(this.Name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public boolean setName(String name) {
        if(this.AllEnv.verify(name) == true){
            this.Name = name; 
            return true; 
        }
        else
            return false; 
            
            
    } 


}; 