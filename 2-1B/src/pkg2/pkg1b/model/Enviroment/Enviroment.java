package model.Enviroment;
import java.util.Scanner;
public class Enviroment{   
    private int NumberPeopleProjection;  
    private String Name;  
    private int id;  
    private int risk;  
       
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

    public void setRisk(int risk) {
        this.risk = risk;
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

    public void setName(String name) {
        this.Name = name;
    } 


}; 