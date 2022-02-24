



import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;


public class SinavOlustur extends SoruIslemleri{
	static Soru soruOzellik =new Soru();
	public static Vector<Soru> SinavSorulari = new Vector<Soru>();
	static Random random = new Random();
	static ArrayList<Integer> arrayList = new ArrayList<Integer>();
	static ArrayList<String> Ocevap = new ArrayList<String>();
	public static int sinavTur;

	static Scanner asd=new Scanner(System.in);
	
	
	public static void sinavconsole() {
	
		int secim;
		do{
			
		System.out.println("~~~~~~~~~~~SINAV OLUSTUR~~~~~~~~~~~~");
		
		System.out.println("1=)Test sinav olustur");
		System.out.println("2=)Karisik sinav olustur");
		System.out.println("3=)Klasik sinav olustur");
		System.out.println("4=)Sinav ol");
		System.out.println("5=)Cikis");
		secim=asd.nextInt();
		
		switch(secim) {
		case 1:testsinavOlustur(); break;
		case 2:karisikSinav(); break;
		case 3:klasikSinavOlustur(); break;
		case 4:sinaviGoster(); break;
		case 5: break;
		default : sinavconsole();

		}
		
		
		}while(secim!=5);
	}
		

	
	
	public static void testsinavOlustur() {
		
		sinavTur =1;
		
		SinavSorulari.removeAllElements();
		
		
		    while (arrayList.size() < Sorular.size()) {
		        int a = random.nextInt(Sorular.size()); 

		        if (!arrayList.contains(a)) {
		            arrayList.add(a);
		        }
		    }
		int sayi=0,puan=0;
		for(int i=0;i<Sorular.size();i++) {
			
			sayi=arrayList.get(i);

			Soru d=Sorular.get(sayi);
			if(d.getTur()==1||d.getTur()==3) {
				if(puan<100&&puan+d.getPuan()<110) {
					puan+=d.getPuan();
					
					SinavSorulari.add(d);
					
					
			}
			
		}
	}
		
		
	}
	
	public static void klasikSinavOlustur() 
	{
		SinavSorulari.removeAllElements(); //Sýnav tekrar oluþturulduðunda üst üste sorularýn binmesini önlemek icin.
		while (arrayList.size() < Sorular.size()) {
		        int a = random.nextInt(Sorular.size());

		        if (!arrayList.contains(a)) {
		            arrayList.add(a);
		        }
		    }
		
		int sayi=0,puan=0;
		
		for(int i=0;i<Sorular.size();i++) {
			
			sayi=arrayList.get(i);

			Soru a=Sorular.get(sayi);
			if(a.getTur()==2) {
				if(puan<100&&puan+a.getPuan()<110) {
					puan+=a.getPuan();
					
					SinavSorulari.add(a);
				}
			}
		}			
	}	
		
	static public void karisikSinav() 
	{
		SinavSorulari.removeAllElements();

		while (arrayList.size() < Sorular.size()) {
	        int a = random.nextInt(Sorular.size()); 

	        if (!arrayList.contains(a)) {
	            arrayList.add(a);
	        }
	    }
		int sayi=0,puan=0;
		
		for(int i=0;i<Sorular.size();i++) {
			
			sayi=arrayList.get(i);

			Soru a=Sorular.get(sayi);
			
			if(puan<100&&puan+a.getPuan()<110) {
					puan+=a.getPuan();
					
					SinavSorulari.add(a);
				}
			}
					
	}	

	public static void sinaviGoster()  {
	
		
		String ogrenciCevap;
		int i =1,Opuan=0;
		
		for (Soru soru : SinavSorulari) {
			
			if(soru.getTur()==1) 
			{
				System.out.println(i+"=)"+soru.getSoru());
				System.out.println("A=)"+soru.getCevapa());
				System.out.println("B=)"+soru.getCevapb());
				System.out.println("C=)"+soru.getCevapc());
				System.out.println("D=)"+soru.getCevapd());
				System.out.println("cevabý yazýnýz ");
				ogrenciCevap=asd.next().trim().toLowerCase();
				Ocevap.add(ogrenciCevap);
				
			
				if(Ocevap.get(i-1).equals(soru.getDogrucevap())) {
					Opuan=Opuan+soru.getPuan();
					
					
				}
				
			}
			if(soru.getTur()==2) //Klasik 
			{ 
				System.out.println(i+"=)"+soru.getSoru());
				System.out.println("cevabý yazýnýz ");
				ogrenciCevap=asd.next();
				Ocevap.add(ogrenciCevap);
			}
			if(soru.getTur()==3) //dogru yanlis
			{
				System.out.println(i+"=)"+soru.getSoru());
				System.out.println("D or Y");
				System.out.println("cevabý yazýnýz ");
				ogrenciCevap=asd.next().toLowerCase();
				Ocevap.add(ogrenciCevap);
				if(Ocevap.get(i-1).equals(soru.getDogrucevap())) {
					Opuan=Opuan+soru.getPuan();
					
					
				}
			}
			i=i+1;
		}
		
		if(sinavTur == 1) 
		{
		System.out.println("puanýnýz "+Opuan);
		sinavTur = 0;
		}
		
		
		dosyaYaz();
		
	}
	
	public static void dosyaYaz() {
		int i=0;
		try {
		      FileWriter myWriter = new FileWriter("Sinav.txt");
		      for (Soru soru : SinavSorulari) {
		    	  if(soru.getTur()==1) 
					{
		    	  myWriter.write((i+1)+"=)"+soru.getSoru()+"\n"+"A=)"+soru.getCevapa()+"\n"+"B=)"+soru.getCevapb()+"\n"+"C=)"+soru.getCevapc()+"\n"+"D=)"+soru.getCevapd()+"\n"+"ogrenci cevabý= "+Ocevap.get(i)
		    	  +"	sorunun cevabý "+soru.getDogrucevap()+"\n"+"sorunun puaný "+soru.getPuan()+"\n");
					}
		    	  if(soru.getTur()==2) 
					{
		    		  
		    		  myWriter.write((i+1)+"=)"+soru.getSoru()+"\n Ogrencinin Cevabi= "+Ocevap.get(i)+"\n"+" sorunun puaný "+soru.getPuan()+"\n");
		    		  
					}
		    	  if(soru.getTur()==3) 
					{
		    		  
		    		  myWriter.write((i+1)+"=)"+soru.getSoru()+"\n"+" ogrenci cevabý = "+Ocevap.get(i)+" dogru cevap = "+soru.getDogrucevap()+"\n"+" sorunun puaný "+soru.getPuan()+"\n");

		    		  
					}
		    	  
		    	  i++;
			}
		    
		      myWriter.close();
		      System.out.println("Sinaviniz basariyla kaydedilmistir iyi gunler.");
		    } catch (IOException e) {
		      System.out.println("Bir hata meydana geldi.");
		      e.printStackTrace();
		    }
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

