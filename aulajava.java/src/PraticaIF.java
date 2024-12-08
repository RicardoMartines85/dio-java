
import java.util.Locale;
import java.util.Scanner;

public class PraticaIF {
    
//caixa eletronico

public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       
   double saldo = 25.0;
    
    System.out.println("Quanto quer sacar? Digite o valor");
    double saque = scanner.nextDouble();


    if(saldo>=saque){

        System.out.println("Aqui está seu dinheiro ;)");
    }else{
        System.out.println("Xii deu ruim!, corre! Não da pra gastar!");

    }



}
}