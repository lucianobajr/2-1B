package model.Enviroment;

public class BusinessEnvironment extends Enviroment{
    private String Name;  
    private float Dimension;  
    public void setname(String name){
        this.Name = name; 
    } 
    public void setDimension(float dimension){ 
        this.Dimension = dimension; 
    } 
    public String gatname(){
        return this.Name;  
    } 
    public float getDimension(){ 
        return this.Dimension; 
    }
    
}
