package estacaojob;
import java.util.Scanner;
public class job1 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("digite seu nome: ");
		String nome= entrada.nextLine();
		System.out.println("qual sua idade: ");
		int idade= entrada.nextInt();
		entrada.nextLine();//use quando precisar usar um nexline apos um int pois nao funciona se nao tiver isso
		System.out.println("o que voce sente?: ");
		String sentimento= entrada.nextLine();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.printf("seu nome é: %s", nome);//diz o nome do usuario
		
		System.out.println("");
		
		System.out.printf("sua idade é: %d", idade);// fala a idade 
		
		System.out.println("");
		System.out.printf("voce sente : %s", sentimento);//fala oq ele sente
	}

}
