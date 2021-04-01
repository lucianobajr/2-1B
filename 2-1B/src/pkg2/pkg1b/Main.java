package pkg2.pkg1b;
import pkg2.pkg1b.User.Sex;

/** 
 * @author Cláudio,Guilherme e Luciano
 */
public class Main {
    public static void main(String[] args) {
        NormalUser luciano = new NormalUser("Luciano",21,Sex.Male);
        
        System.out.println("O usuário "+luciano.getName()+" tem "+luciano.getAge()+" anos");
    }
}
