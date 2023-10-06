
import fatec.poo.model.Retangulo;
import java.util.Scanner;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        Retangulo objRet = new Retangulo(); //Instanciação do objeto
        Scanner entrada = new Scanner(System.in);
        double medBase, medAlt;
        int opcao;
        
        //Montar o Retangulo
        System.out.println("Digite a medida da base do retângulo: ");
        medBase = entrada.nextDouble();
        System.out.println("Digite a medida da altura do retângulo: ");
        medAlt = entrada.nextDouble();
        
        objRet.setBase(medBase);
        objRet.setAltura(medAlt);
        
        do{
            System.out.println("\n\n1-Consultar área do retângulo");
            System.out.println("2-Consultar perímetro do retângulo");
            System.out.println("3-Consultar diagonal do retângulo");
            System.out.println("4-Sair");
            System.out.print("\n\tDigite a opção: ");            
            opcao = entrada.nextInt();
            
            if (opcao == 1){
                System.out.println("\nMedida da altura do retângulo: " + objRet.getAltura());
                System.out.println("Medida da base do retângulo: " + objRet.getBase());
                System.out.println("Medida da área: " + objRet.calcArea());
            }else
               if (opcao == 2){
                   System.out.println("\nMedida da altura do retângulo: " + objRet.getAltura());
                   System.out.println("Medida da base do retângulo: " + objRet.getBase());
                   System.out.println("Medida do perímetro: " + objRet.calcPerimetro());
               }else
                   if (opcao == 3){
                   System.out.println("\nMedida da altura do retângulo: " + objRet.getAltura());
                   System.out.println("Medida da base do retângulo: " + objRet.getBase());
                   System.out.println("Medida da diagonal: " + objRet.calcDiagonal());
               }
        }while(opcao < 4);
    }
    
}
