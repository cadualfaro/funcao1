/*
Atividade 1
Criar uma função que recebe 3 notas (números com vírgula) e retorna a media aritmética delas
Modifique a função para retornar a media harmônica
 */
package funcao1;
import java.util.Scanner;
public class Funcao1 {
    
    static double media(double a, double b, double c){
        double resultado = (a+b+c)/3;
            return resultado;
    }
    
        static double mediharmonica(double a, double b, double c){
        double resul = 3/(1/a+1/b+1/c);
            return resul;
    }
        
    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in);
        
        int valor = 1;
        
        System.out.print("Entre com o "+valor+"º valor: ");
            double primeiro = my_scan.nextDouble();
                System.out.println("");
                valor += 1;
                
        System.out.print("Entre com o "+valor+"º valor: ");
            double segundo = my_scan.nextDouble();
                System.out.println("");
                valor += 1;
                
        System.out.print("Entre com o "+valor+"º valor: ");
            double terceiro = my_scan.nextDouble();
                System.out.println("");
        
        double resultado = media(primeiro,segundo,terceiro);
        System.out.println("A media aritmetica entre os valores digitados e: ");
        System.out.println(""+resultado);
        System.out.println("\n");
        
        double resul = mediharmonica(primeiro,segundo,terceiro);
        System.out.println("A media harmonica entre os valores digitados e: ");
        System.out.println(""+resul);
        System.out.println("\n");
    }
    
}
        