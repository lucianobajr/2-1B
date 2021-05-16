package pkg2.pkg1b.model;

public class Mask {
    
    int id;
    String descrição;
    int grauDeProtecao;  

    
    
        //CONTRUTOR
    

    //GET AND SET

    public int getId() {        return id;    }

    public void setId(int id) {        this.id = id;    }

    public String getDescrição() {        return descrição;    }

    public void setDescrição(String descrição) {        this.descrição = descrição;    }

    public int getGrauDeProtecao() {        return grauDeProtecao;    }

    public void setGrauDeProtecao(int grauDeProtecao) {        this.grauDeProtecao = grauDeProtecao;    }

    @Override
    public String toString() {
        return "id=" + id + ", descri\u00e7\u00e3o=" + descrição + ", grauDeProtecao=" + grauDeProtecao ;
    }
    
    
    
}

