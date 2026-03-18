package estacaojob;
import java.util.Scanner;
public class job2 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("digite o numero 1 : ");
		int n1= entrada.nextInt();
		System.out.print("digite o numero 2 : ");
		int n2= entrada.nextInt();
		System.out.println("");
		
		int soma=n1+n2;
		int divisao=n1/n2;
		int subtracao=n1-n2;
		int multiplicacao=n1*n2;
		
		System.out.printf("soma: %d ", soma);
		System.out.println("");
		System.out.printf("divisao: %d ", divisao);
		System.out.println("");
		System.out.printf("subtracao: %d ", subtracao);
		System.out.println("");
		System.out.printf("multiplicacao: %d", multiplicacao);
	}

}
