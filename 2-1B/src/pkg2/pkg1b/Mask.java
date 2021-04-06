package entidades;

public class Mask {
    
    int id;
    String descrição;
    Double grauDeProtecao;  

    
    
        //CONTRUTOR
    
    public Mask() {    }

    public Mask(int id, String descrição, Double grauDeProtecao) {
        this.id = id;
        this.descrição = descrição;
        this.grauDeProtecao = grauDeProtecao;
    }
    
   
    

    //GET AND SET

    public int getId() {        return id;    }

    public void setId(int id) {        this.id = id;    }

    public String getDescrição() {        return descrição;    }

    public void setDescrição(String descrição) {        this.descrição = descrição;    }

    public Double getGrauDeProtecao() {        return grauDeProtecao;    }

    public void setGrauDeProtecao(Double grauDeProtecao) {        this.grauDeProtecao = grauDeProtecao;    }

    @Override
    public String toString() {
        return "id=" + id + ", descri\u00e7\u00e3o=" + descrição + ", grauDeProtecao=" + grauDeProtecao ;
    }
    
    
    
}

