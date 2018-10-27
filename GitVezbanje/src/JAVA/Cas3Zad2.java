import java.util.Scanner;

public class Cas3Zad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Unesite broj n");
		n = sc.nextInt();
		
		// %
		// primer: 5 % 2 =1 , 2 % 2 = 0
		// vrednost ove operacije je 
		// 0 ukoliko je broj n deljiv sa nekim brojem(nema ostatak pri deljenju)
		// proveriti da li je broj deljiv sa 200
		// i ispisati vrednosti na semaforu

		if (n % 200 == 0) {

			System.out.println("START");

			int brojac = 1;
			int suma = 0;

			int brojKrugova = n / 200;
			while (brojac <= brojKrugova) {
				suma += 200;
				System.out.println(suma + "m");
				brojac += 1;
			}

			System.out.println("CILJ");
		} else {
			System.out.println("Broj nije deljiv sa 200");
		}
	}

}
