import java.util.Scanner;

public class Cas4Zad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// korsnik unosi interval od n do m [n,m]
		// potrebno je ispisati sve brojeve u tom intervalu ukljucujuci i ta dva
		// ukoliko naidjemo na broj koji je deljiv sa 17 potrebno je zavrsiti petlju

		int n, m;
		System.out.println("Unesite dva broja intervala");
		n = sc.nextInt();
		m = sc.nextInt();
		int br = n;
		if (n < m) {
			/*
			 while(br<=m) {
			
			 System.out.println(br);
			 if(br % 17 == 0) {
			 break;
			 }
			 br++;
			 }
			 for(int br = n; br <=m; br++) {
			 System.out.println(br);
			 if(br % 17 == 0) {
			 break;
			
			 }
			 }
			 */
			/*
			//ispisati sve brojeve u intervalu od n do m koji nisu deljivi sa 5
			while (br <= m) {

				if (br % 5 == 0) {
					br++;
					continue;
				}

				System.out.println(br);

				br++;

			}
			*/
			{
				
			}
			/*
			// potrebno je napisati program koji ucitava brojeve i kada se prvi put unese
			// negativan broj izlazi iz petlje
			boolean uslov  =  true;
			while(uslov) {
				System.out.println("Unesiste broj koji je pozitivan");
				n = sc.nextInt();
				if(n>= 0) {
					System.out.println(n);
					continue;
				}
				uslov = false;
//				if(n < 0) {
//					break;
//				}
			}
			
			*/

		} else {
			System.out.println("Neispravan interval");
		}

	}

}
