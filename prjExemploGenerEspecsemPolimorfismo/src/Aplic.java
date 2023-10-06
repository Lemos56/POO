
import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;
import java.text.DecimalFormat;


/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
       DecimalFormat df = new DecimalFormat("#,##0.00");
       //Instanciação de um objeto da classe Aluno
       Aluno objAlu = new Aluno(1010,
                                "Carlos Silveira", 
                                "15/03/1978");
    
      //passagem de mensagens   
      objAlu.setMensalidade(1500);
      System.out.println("Registro escolar: " + objAlu.getRegEscolar());
      System.out.println("Nome: " + objAlu.getNome());
      System.out.println("Data de Nascimento: " + objAlu.getDataNascimento());
      System.out.println("Mensalidade: " + df.format(objAlu.getMensalidade()));
    
      //Instanciação de um objeto da classe Professor
      Professor objProf = new Professor(123, 
                                        "Antonio Guedes", 
                                        "11/03/1958");
      
      //passagem de mensagens   
      objProf.setSalario(2780);
      System.out.println("\n\nRegistro funcional: " + objProf.getRegFuncional());
      System.out.println("Nome: " + objProf.getNome());
      System.out.println("Data de Nascimento: " + objProf.getDataNascimento());
      System.out.println("Salário: " + df.format(objProf.getSalario()));
    }
}
