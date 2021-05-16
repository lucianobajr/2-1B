package pkg2.pkg1b.model.User;

import java.io.FileNotFoundException;

import pkg2.pkg1b.model.Enviroment.Address;
import pkg2.pkg1b.model.Enviroment.SetEnviroment;

public class UserCompany {
    
    //      ATTRIBUTES
    private String name;
    private String plan;
    private Address address; 
    private int numEmployees;
    private boolean activePlan;  
    SetEnviroment SE = new SetEnviroment(); 
    //private EmployeeList  employee_List; //adicionar a lista de empregados ou verificar conexao BD
    //private String departments;         // sera uma lista de ambientes especificos
    
   
    
    //      FUNCTIONS    
    
    



    //      GET AND SET
    
    public Address getAddress() {      return address;    }
    
    public void setAddress(Address address) {        this.address = address;    }

    public String getName() {        return name;    }

    public void setName(String name) {        this.name = name;    }

    public String getPlan() {        return plan;    }

    public void setPlan(String plan) {        this.plan = plan;    }
    
    public int getNumEmployees() {        return numEmployees;    }

    public void setNumEmployees(int numEmployees) {        this.numEmployees = numEmployees;    }

    public boolean isActivePlan() {        return activePlan;    }

    public void setActivePlan(boolean activePlan) {        this.activePlan = activePlan;    }
   
    //public String getDepartments() {        return departments;    }

    //public void setDepartments(String departments) {        this.departments = departments;    }
    public void init_enviroment(){  
        try {
            SE.read_enviroments();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  
        // at this moment the enviroment file fill  is a external task, out of the programm scope
        SE.ShowSetEnviroments();
    }  
    
    void read_employers(){ 

    }
    
    
    
    
    
}

