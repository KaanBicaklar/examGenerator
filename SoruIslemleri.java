

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class SoruIslemleri {
	
	public static Vector<Soru> Sorular = new Vector<Soru>();
	static Scanner asd=new Scanner(System.in);
	static int idekle=1;
	public static void  Soruekle() {
		
			System.out.println("soru puan�n� girin");
			int puan=asd.nextInt();
			System.out.println("soru zorlu�unu girin "
					+ "0-kolay "
					+ "1-orta "
					+ "2-zor ");
			int zorluk=asd.nextInt();
			System.out.println("soru tipi se�in "
					+"1=) test "
					+"2=) klasik "
					+"3=) dogru/yanl�s ");
			int tur=asd.nextInt();
			switch(tur) {
			case 1:
					System.out.println("soru girin");
					String soru1=asd.next().toLowerCase();
					System.out.println("A sikkini girin");
					String cevapa=asd.next().toLowerCase();				
					System.out.println("b sikkini girin");
					String cevapb=asd.next().toLowerCase();
					System.out.println("c sikkini girin");
					String cevapc=asd.next().toLowerCase();
					System.out.println("d sikkini girin");
					String cevapd=asd.next().toLowerCase();
					System.out.println("do�ru cevab� girin ");
					String dogrucevap1=asd.next().trim().toLowerCase();
					Soru sorsa1=new Soru(idekle,puan,zorluk,tur,soru1,cevapa,cevapb,cevapc,cevapd,dogrucevap1);
					Sorular.add(sorsa1);
					idekle=idekle+1;
					break;
				
			case 2: 
					System.out.println("soru girin");
					String soru2=asd.next().toLowerCase();
					
					Soru sorsa2=new Soru(idekle,puan,zorluk,tur,soru2);
					Sorular.add(sorsa2);
					idekle=idekle+1;
					break;
			case 3:
					System.out.println("soru girin");
					String soru=asd.next().toLowerCase();
				
					System.out.println("do�ru cevab� girin ");
					String dogrucevap=asd.next().trim().toLowerCase();
					Soru sorsa3=new Soru(idekle,puan,zorluk,tur,soru,dogrucevap);
					Sorular.add(sorsa3);
					idekle=idekle+1;
					break;
				
			default: Soruekle(); 
			
			}
	
		
		
	}
	public static void SorulariListele() {

		
		int secim;
		do{
			
		System.out.println("sorular� neye g�re listelemek istersiniz");
		
		System.out.println("1=)Soru metni i�inde arama");
		System.out.println("2=)Soru ��klar�n�n metinleri i�inde");
		System.out.println("3=)Do�ru ��klar� �zerinden arama");
		System.out.println("4=)Puana g�re Listeleme");
		System.out.println("5=)Zorluk derecesi �zerinden listeleme");
		System.out.println("6=)cikis");
		secim=asd.nextInt();
		
		switch(secim) {
		case 1: kelimeyeGoreSorulistele(); break;
		case 2: cevaplarIcindeAra();break;
		case 3: dogruCevaplarUzerindeara();break;
		case 4: puanaGoreListele();break;
		case 5: zorlugaGoreListele();break;
		case 6: break;
		default: SorulariListele();
		
		}
		
		
		}while(secim!=6);
	}
	
	
	
	public static void zorlugaGoreListele() {
		int as;
        
        System.out.println("zorluk se�"
        		+ "0-kolay "
				+ "1-orta "
				+ "2-zor ");
        as=asd.nextInt();
        
        Collections.sort(Sorular);
        for (Soru d : Sorular) {
            
            
            
                if(d.getZorluk()==as)
                {
                
                	if(d.getTur()==1) 
    				{
    				System.out.println(d);
    				}
    				else if(d.getTur()==2) 
    				{
    				System.out.println("Soru [id=" + d.getId() + ", puan=" + d.getPuan() + ", zorluk=" + d.getZorluk() + ", tur=" + d.getTur() +", soru=" + d.getSoru() + "]");
    				
    				}
    				else if(d.getTur()==3) 
    				{
    				System.out.println("Soru [id=" + d.getId() + ", puan=" + d.getPuan() + ", zorluk=" + d.getZorluk() + ", tur=" + d.getTur() +", soru=" + d.getSoru() + "cevap" + d.getDogrucevap()+ "]");	
    				}	

                }
        }
	}
	
	public static void dogruCevaplarUzerindeara() {
		
		 String as;
        
         System.out.println("Do�ru ��klar� �zerinden arama ");
         as=asd.next().toLowerCase();
         
         Collections.sort(Sorular);
         for (Soru d : Sorular) {
             
             
             
                 if(d.getDogrucevap().indexOf(as)!=-1)
                 {
                 
                	 if(d.getTur()==1) 
     				{
     				System.out.println(d);
     				}
     				else if(d.getTur()==2) 
     				{
     				System.out.println("Soru [id=" + d.getId() + ", puan=" + d.getPuan() + ", zorluk=" + d.getZorluk() + ", tur=" + d.getTur() +", soru=" + d.getSoru() + "]");
     				
     				}
     				else if(d.getTur()==3) 
     				{
     				System.out.println("Soru [id=" + d.getId() + ", puan=" + d.getPuan() + ", zorluk=" + d.getZorluk() + ", tur=" + d.getTur() +", soru=" + d.getSoru() + "cevap" + d.getDogrucevap()+ "]");	
     				}	

                 }
         }
	}
		
		
	
	
		public static void puanaGoreListele() {
			Collections.sort(Sorular);
			for (Soru soru : Sorular) {
				if(soru.getTur()==1) 
				{
				System.out.println(soru);
				}
				else if(soru.getTur()==2) 
				{
				System.out.println("Soru [id=" + soru.getId() + ", puan=" + soru.getPuan() + ", zorluk=" + soru.getZorluk() + ", tur=" + soru.getTur() +", soru=" + soru.getSoru() + "]");
				
				}
				else if(soru.getTur()==3) 
				{
				System.out.println("Soru [id=" + soru.getId() + ", puan=" + soru.getPuan() + ", zorluk=" + soru.getZorluk() + ", tur=" + soru.getTur() +", soru=" + soru.getSoru() + "cevap" + soru.getDogrucevap()+ "]");	
				}	
			}
			
	}
		public static int  kelimeyeGoreSorulistele() {
				
	            String as;
	           
	            System.out.println("listelemek istedi�in sorunun i�inde ge�en kelime");
	            as=asd.next().toLowerCase();
	            
	            Collections.sort(Sorular);
	            	            	
	            	for (Soru d : Sorular) {
	                
	                
	                
	                    if(d.getSoru().indexOf(as) != -1) {
	                    
	                    	if(d.getTur()==1) 
	        				{
	        				System.out.println(d);
	        				}
	        				else if(d.getTur()==2) 
	        				{
	        				System.out.println("Soru [id=" + d.getId() + ", puan=" + d.getPuan() + ", zorluk=" + d.getZorluk() + ", tur=" + d.getTur() +", soru=" + d.getSoru() + "]");
	        				
	        				}
	        				else if(d.getTur()==3) 
	        				{
	        					
	        				System.out.println("Soru [id=" + d.getId() + ", puan=" + d.getPuan() + ", zorluk=" + d.getZorluk() + ", tur=" + d.getTur() +", soru=" + d.getSoru() + " cevap=" + d.getDogrucevap()+ "]");	
	        				}	
	                    	return 1; 
	                     
	                    
	                    }
	                    else {
	                    	System.out.println("soru bulunamad�");
	                    	return 0;
	                    }
	                 
			
			
	            }
	            	   return 2;
			
		}
		public static void cevaplarIcindeAra() {
			
			 String as;
	            
	            System.out.println("listelemek istedi�in cevaplar�n  i�inde ge�en kelime");
	            as=asd.next().toLowerCase();
	            
	            Collections.sort(Sorular);
	            for (Soru d : Sorular) {
	                
	                
	                
	                    if(d.getCevapa().indexOf(as) != -1||d.getCevapb().indexOf(as) != -1||d.getCevapc().indexOf(as) != -1||d.getCevapd().indexOf(as) != -1)
	                    {
	                    
	                    	if(d.getTur()==1) 
	        				{
	        				System.out.println(d);
	        				}
	        				
  
	                    }
	            }
		}
		
		
		
		
public static void soruSil() {
            int kontrol,varmi;

          varmi=  kelimeyeGoreSorulistele();
            if(0!=Sorular.size()&&1==varmi) {

            System.out.println("Silmek istedi�iniz sorunun id sini giriniz");
            if(true)
            {
                kontrol = asd.nextInt();
                
                for(Soru s : Sorular) 
                {
                    System.out.println(s.getId());
                    if(s.getId() == kontrol) 
                    {
                        Sorular.remove(s);
                        System.out.println("Soru ba�ar�yla kald�r�ld�");
                        break;
                    } 
                    else {
                    	System.out.println("Soru silinirken  hata olu�tu");
                    }
                }
   
             }
            }
            else{
            	System.out.println("listelencek soru bulunamad�");
            }
        }

}
