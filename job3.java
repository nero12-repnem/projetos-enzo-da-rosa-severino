package estacaojob;
import java.util.Scanner;
public class job3 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("me diga seu nome: ");
		String nome=entrada.nextLine();
		
		System.out.print("me diga sua nota 1: ");
		double n1=entrada.nextDouble();
		
		System.out.print("me diga sua nota 2: ");
		double n2=entrada.nextDouble();
		
		System.out.print("me diga sua nota 3: ");
		double n3=entrada.nextDouble();
		
		double media=(n1+n2+n3)/3;
		
		System.out.printf("%s", nome);
		System.out.println("");
		System.out.printf("sua media é: %.2f", media);
		System.out.println("");
		
		if(media>=7) {
			System.out.println("passou");
		}else if(media>=5) {
			System.out.println("recuperar");
		}else {
			System.out.println("reprovou");
		}
		
	}

}
