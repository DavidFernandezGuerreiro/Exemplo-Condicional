
package exemplo.condicional1;

/**
 *
 * @author dfernandezguerreiro
 */
public class ExemploCondicional1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1=7, num2=7;
        
        //CONDICIONAL DOBLE:
        /*if (num1 > num2){
            System.out.println("7 es mayor que 4");
        }
        else{
            System.out.println("4 es menor que 7");
        }
        
        //TAMEN SE PODE:
        /*String resposta= (num1 > num2)?"7 es mayor que 4":"4 es menor que 7"; 
        System.out.println(resposta);*/
        
        //CONDICIONAIS MÚLTIPLES OU ANIMAIS:
        if (num1 > num2){
            System.out.println("7 es mayor que 4");
        }
        else if (num1 > num2){
            System.out.println("4 es menor que 7");
            }
            else{
                System.out.println("es igual");
        }
    }
    
}
