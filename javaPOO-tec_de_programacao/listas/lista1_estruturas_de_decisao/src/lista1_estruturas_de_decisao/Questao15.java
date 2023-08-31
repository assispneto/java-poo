// Questao 15
// Verifique se o valor de A é menor que 10. Se essa afirmação for
// verdadeira, imprima "A < 10". Em seguida, verifique se a soma de A e B
// é igual a 20. Se essa afirmação for verdadeira, imprima "A + B == 20".
// Caso nenhuma das afirmações seja verdadeira, imprima "número não
// válido

package lista1_estruturas_de_decisao;
import java.util.Scanner;

public class Questao15 {
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
		
		if (a<10) {
			System.out.println("# A<10");
			if (a+b==20) {
				System.out.println("# A+B = 20");
			}
		} else {
			System.out.println("# Numero nao valido");
		}
	}
}


