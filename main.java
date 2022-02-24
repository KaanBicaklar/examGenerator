
import java.util.Scanner;
public class main {
	 public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		consoleIslemleri();
		
	}

	
	
	

	public static void consoleIslemleri() {	
			try {
				System.out.println("~~~~~~~~SORU ÝÞLEMLERÝ~~~~~~~~");
				System.out.println("1=)Soru ekle");
				System.out.println("2=)Sorularý listeleme seçenekleri");
				System.out.println("3=)Soru silme");
				System.out.println("4=)Sinav olustur");
				System.out.println("5=)Cikis");
				System.out.print("Seçiminiz: ");
				
				int secim = Integer.parseInt(input.nextLine());

				
				switch(secim) {
				case 1: SoruIslemleri.Soruekle();			consoleIslemleri();break;
				case 2: SoruIslemleri.SorulariListele();	consoleIslemleri();break;
				case 3: SoruIslemleri.soruSil();			consoleIslemleri();break;
				case 4: SinavOlustur.sinavconsole();		consoleIslemleri();break;
				case 5: break;
				default:consoleIslemleri();
				}
			}
			catch(Exception e) {
				
				consoleIslemleri();	
				}
			
		}
	
}
