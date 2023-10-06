
import fatec.poo.model.Retangulo;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
       Retangulo objRet;
       
       objRet = new Retangulo();//instanciação do objeto da classe Retangulo
       
       //Mecanismo de passagem de passagens
       objRet.setAltura(5.0);
       objRet.setBase(8.0);
       System.out.println("Medida de área: " + objRet.calcArea());
       System.out.println("Medida do perímetro: " + objRet.calcPerimetro());
    }
    
}
