// Questao 13
// Verifique se A é maior que 10, se verdade imprima: "A > 10". Ainda,
// verifique se o A mais B é igual a 20, se verdade imprima: "A + B == 20”.
// Caso as afirmações não sejam verdadeiras, imprima: "números não
// válidos"

package lista1_estruturas_de_decisao;
import java.util.Scanner;

public class Questao13 {
	public static void main(String[] args) {
		Scanner valorA = new Scanner(System.in);
		Scanner valorB = new Scanner(System.in);
		int a = 0;
		int b = 0;
		 
		System.out.print("Digite o valor A > ");
		a = valorA.nextInt();
		System.out.print("Digite o valor B > ");
		b = valorB.nextInt();
		
		System.out.print("\n");
		 
		if (a>10) {
			System.out.println("# A>10");
			if (a+b==20) {
				System.out.println("# A+B = 20");
			}
		} else {
			System.out.println("# Numeros nao validos");
		}
	}
}


