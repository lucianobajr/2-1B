package pkg2.pkg1b;



public class User {
    public enum Sex {
        Male, Female
    }
    
    private String name;
    private int age;
    private Sex sex;    
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public Sex getSex(){
        return this.sex;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setSex(Sex sex){
      this.sex = sex;  
    }
    
    public User(String name,int age,Sex sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
