package pkg2.pkg1b_usercompany;

public class UserCompany {
    
    //      ATTRIBUTES
    String name;
    String plan;
    Address address; //depende de como usaremos 
    int numEmployees;
    boolean activePlan;
    EmployeeList  employee_List; //adicionar a lista de empregados ou verificar conexao BD
    String departments;         // sera uma lista de ambientes especificos
    
   
    
    //      FUNCTIONS    
    
    



    //      GET AND SET

    public String getName() {      return name;    }

    public void setName(String name) {        this.name = name;    }

    public String getPlan() {        return plan;    }

    public void setPlan(String plan) {        this.plan = plan;    }
    
    public int getNumEmployees() {        return numEmployees;    }

    public void setNumEmployees(int numEmployees) {        this.numEmployees = numEmployees;    }

    public boolean isActivePlan() {        return activePlan;    }

    public void setActivePlan(boolean activePlan) {        this.activePlan = activePlan;    }
   
    public String getDepartments() {        return departments;    }

    public void setDepartments(String departments) {        this.departments = departments;    }
    

    
    
    
    
    
    
}

/*
public class Address {
    
    //attributes 
    String city;
    String county;
    String country;
    int number;
}
*/
