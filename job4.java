package estacaojob;
import java.util.Scanner;
public class job4 {

	public static void main(String[] args) {
		Scanner leon= new Scanner(System.in);
		
		char opcao;

		do {
		System.out.println("ola");
		
		System.out.println("por favor fale qual calculo voce quer?");
		
		System.out.println("1- fahreheit para celsius");
		System.out.println("2- celsiu para farenheit");
		System.out.println("3- volume de um liquido");
		
		double fahreheit;
		double celsius;
		
		int calculo=leon.nextInt();
		
		switch(calculo){
			case 1:
				System.out.print("digite qual a temperatura em fareheit: ");
				fahreheit=leon.nextDouble();
				celsius=5*(fahreheit-32)/9;
				System.out.printf("a conversão é: %.2f graus", celsius);
				break;
				
			case 2:
				System.out.print("digite qual a temperatura em celsius: ");
				celsius=leon.nextDouble();
				fahreheit=(9*celsius+160)/5;
				System.out.printf("a conversão é: %.2f graus", fahreheit);
				break;
				
			case 3:
				System.out.println("digite qual o raio: ");
				double raio=leon.nextDouble();
				System.out.println("digite a altura: ");
				double altura=leon.nextDouble();
				double volume=3.14159*(raio*raio)*altura;
				System.out.printf(" %f de volume", volume);
				break;
				
				default:
					System.out.println("este comando não existe");
					System.out.println("por favor digite uma opcao correta");
		}
		System.out.print("\nDeseja fazer outro cálculo? (s/n): ");
		opcao = leon.next().charAt(0);
		
	}
		while (opcao == 's' || opcao == 'S');

		System.out.println("Programa encerrado.");

		leon.close();

          }
}
