public class MinhaClasse{

    public static void main(String[] args) {
// declarando variaveis

String primeiroNome = "Ricardo";
String segundoNome = "Martines";
int minhaIdade = 39;
double salarioEsperado = 15689.99;


// declarando metodos
String nomeInteiro = nomeCompleto(primeiroNome, segundoNome);

//saída

System.out.println(nomeInteiro);
System.out.println("Idade: "+ minhaIdade);
System.out.println("Vai ganha de salario em 2025: R$" + salarioEsperado);





// TipoRteorno NomeObjetivo Parametros()
}
public static String nomeCompleto (String primeiroNome, String segundoNome){    // metodo sempre precisa ser tipado veja a aplicação do String

    return primeiroNome.concat(" ").concat(segundoNome);
}


    }

