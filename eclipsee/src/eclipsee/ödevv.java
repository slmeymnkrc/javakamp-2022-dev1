package eclipsee;

public class ödevv {

	public static void main(String[] args) {
		// if blokları
		int sayi = 20;

		if (sayi < 20) {

			System.out.println("sayı 20 den küçüktür");

		}

		if (sayi > 20) {

			System.out.println("sayı 20 den büyüktür");
		}

		// else yapısı

		if (sayi < 20) {

			System.out.println("sayı 20 den küçüktür");

		} else {
			System.out.println("sayı 20 den büyüktür");

		}

		// if else if

		if (sayi < 20) {

			System.out.println("sayı 20 den küçüktür");

		} else if (sayi == 20)

		{
			System.out.println("sayı 20'ye eşittir");

		} else {
			System.out.println("sayı 20 den büyüktür");

		}

		// elimizdeki üç tane sayıdan en büyüğünü bulmak için ne yapılır;

		// recapDemo1

		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 26;
		int enBüyük = sayi1;

		if (enBüyük < sayi2) {
			enBüyük = sayi2;
		}

		if (enBüyük < sayi3) {
			enBüyük = sayi3;

		}

		System.out.println("enbüyük=" + enBüyük);

		// switch blokları- çok daha az kullanılır

		// grade not demek

		char grade = 'F';
		switch (grade) {
		case 'A':
			System.out.println("mükemmel: Geçtiniz");
			break;
		case 'B':
			System.out.println("iyi: Geçtiniz");
			break;
		case 'C':
			System.out.println("Fena Değil: Geçtiniz");
			break;
		case 'D':
			System.out.println("olmadı: büte kaldınız");
			break;
		case 'F':
			System.out.println("maalesef: kaldınız");
			break;
		// geçersiz bilgi girişi için default kullanılır.
		default:
			System.out.println("geçersiz not girdiniz");
		}

		// diyelim ki C ve B için aynı sonuçları almak istersek case 'B' den sonra gelen
		// dizini sil
		
		char Grade = 'B';
		switch (Grade) {
		case 'A':
			System.out.println("mükemmel: Geçtiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("Fena Değil: Geçtiniz");
			break;
		case 'D':
			System.out.println("olmadı: büte kaldınız");
			break;
		case 'F':
			System.out.println("maalesef: kaldınız");
			break;
		// geçersiz bilgi girişi için default kullanılır.
		default:
			System.out.println("geçersiz not girdiniz");
		}

		// for döngüsü ile çalışmak için birbirine benzeyen işlemleri tekrarlamaya yarar

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

		}

		System.out.println(" for döngü bitti");

		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);

		}

		// while döngüsü belli bir şart sağlanana kadar işlemi yapmaya yarar

		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;

		}
		System.out.println(" while döngü bitti");

		// do while döngüsü ile çalışmak yazdırılmak istenen süslü parantez içinde
		// olacak
		// şart uymasa bile do işlemi çalışacaktır
		int j = 1;
		do {

			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println(" do-while döngü bitti");

		// dizilerle çalışmak "arrays"
		String ogrenci1 = "engin";
		String ogrenci2 = "derin";
		String ogrenci3 = "salih";
		String ogrenci4 = "ahmet ";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);

		System.out.println("---------------------------------------------");

		// yeni bir öğrenci eldiğinde öğrenci ismi eklenmesi için
		// [] liste için kullanılır

		String[] ogrenciler = new String[3];// kaç elemandan oluşacağı için 3 yazdık

		ogrenciler[0] = "engin";
		ogrenciler[1] = "derin";
		ogrenciler[2] = "salih";

		for (int l = 0; l < ogrenciler.length; l++) {
			System.out.println(ogrenciler[l]);
		}
		System.out.println("---------------------------------------------");

		for (String ogrenci : ogrenciler) { // ogrenciler dizisindeki her bir elemanı gezmesi için yazıldı
			System.out.println(ogrenci);
		}
		System.out.println("---------------------------------------------");
		// array reCapDemo2

		// double [] myList=new.double[4]; diğer yönetmi

		double[] myList = { 1.2, 6.2, 4.3, 5.6 };

		double total = 0;

		double max = myList[0];

		for (double number : myList) {// listedeki tüm elemanları çekmesi için

			if (max < number) {// en büyük sayıyı bulmak için yapıldı
				max = number;
			}
			total = total + number;// tüm sayıların toplamını alır
			System.out.println(number);// listedeki tüm elemanları yazdırmak için
		}

		System.out.println("Toplam=" + total);
		System.out.println("En Büyük=" + max);
		
		//multidimensional
		
		String [][] sehirler=new String[3][3];
		sehirler[0][0]="istanbul";
		sehirler[0][1]="Bursa";
		sehirler[0][2]="Bilecik";
		sehirler[1][0]="ankara";
		sehirler[1][1]="konya";
		sehirler[1][2]="eskişehir";
		sehirler[2][0]="urfa";
		sehirler[2][1]="antep";
		sehirler[2][2]="maraş";
		
		for(int k=0;k<=2;k++){
			System.out.println("--------------------");
			for(int m=0;m<=2;m++){
				System.out.println(sehirler[k][m]);
				
			}
		}
		System.out.println("--------------------");
		//string ifadelerle çalışmak
		String mesaj="          Bugün hava çok güzel.      ";
			
		System.out.println(mesaj);
		System.out.println("Eleman Sayısı="+mesaj.length());
		System.out.println("5.inci eleman="+mesaj.charAt(4));
		System.out.println(mesaj.concat("yaşasın!"));// cümleye kelime eklemek için yapıldı
		System.out.println(mesaj.startsWith("B")); // B harfi ile başlıyor mu diye sorar ve true ya da false döndürür
		System.out.println(mesaj.endsWith(".")); // . ile bitiyor mu diye sorar. case sensitive dil olduğuna dikkat et. 
		
		// 0. ve 5. karakter arasını yazdırmak 
		
		char[] kısmiKelime=new char[5];
		mesaj.getChars(0, 4, kısmiKelime, 0);
		System.out.println(kısmiKelime);
		
		//a harfi kaçıncı sırada göstermesi için 
		
		System.out.println(mesaj.indexOf("a"));
		System.out.println(mesaj.indexOf("av"));
		
		// a harfi sondan kaçıncı sırada
		System.out.println(mesaj.lastIndexOf("a"));
		
		// Replace
		System.out.println(mesaj.replace(" ","-"));
		
		String yenimesaj=mesaj.replace(" ","-");
		System.out.println(yenimesaj);
		
		// bir metnin içinden parça almak için 
		
		System.out.println(mesaj.substring(2));// metnin ikinci indexinden itibaren yazdır.
		System.out.println(mesaj.substring(2,5));// 2. indexden başlayıp 4. index dahil etmeden yazdır
		
		//split fonksiyonu bir cümle içindeki kelimeleri ayırır
		
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
			
		}
		
		// toLowerCase toUpperCase Metindeki tüm harfleri küçük harfe veya büyük harfe çevirmeyi sağlar
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		
		// Trim  Metnin önünde ve sonundaki boşlukları silerek yazmak için 
		
		System.out.println(mesaj.trim());
		
		//asal sayı  mıdır?
		
		//bug mantıksal ve sistemsel hatalara denir.
		
		int nnumber=4;
		int remainder=nnumber%2;
		//System.out.println(remainder);
		
	    boolean isPrime =true;
	    
	    if(nnumber==1) {
	    	System.out.println("sayı asal değildir");
	    	return;// eğer asal değilse aşağıdaki döngüye girmesini engellemek
	    }
	    
	    if (nnumber<1) {
	    System.out.println("geçersiz sayı");   
	    
	    }
	    
	    for(int e=2; e<nnumber; e++) {
	    	if (nnumber %e==0) {
	    		isPrime =false;
	    	}
	    }
	    
			if (isPrime) {
				System.out.println("Sayı asaldır.");
			}else {
				System.out.println("sayı asal değildir.");
			}
			
			
			// Bir harfin kalın mı ince mi olduğunu bulmak istyorsam eğer
			
			char harf='Ü';
			
			switch (harf) {
			case 'A':
			case 'O':
			case'U':
			case'I':
				System.out.println("kalın sesli harftir.");
				break;
			
			default:
				System.out.println("ince sesli harftir.");
			
			}
			
			//mükemmel sayı olup olmadığını bulmak 
			
			// Kendinden başka pozitif tüm tam bölenlerin toplamı kendisine eşit olanlara denir.
			
			int nummber=28;
			
			int ttotal=0;
			
			for(int d=1;d<nummber;d++) {
				if (nummber%d==0) {
					total=total+d;
				}
			}
			
			if (total==nummber) {
				System.out.println("mükemmel sayıdır.");
			
			}else {
				System.out.println("mükemmel sayı değildir.");
			}
			
			
			// arkadaş sayılar
			
			//220-284 kendileri hariç pozitif tam bölenlerin toplamı birbirne eşit olan sayılara denir. 
			
			int sayii1=220;
			int sayii2=284;
			int toplam1=0;
			int toplam2=0;
			
			for(int f=1;f<sayii1;f++) {
				if(sayii1 %1==0) {
					toplam1=toplam1+1;
				}
			}
			
			for(int g=1;g<sayii2;g++) {
				if(sayii2%1==0) {
					toplam2=toplam2+g;
				}
			}
			 
			if(sayii1==toplam2 && sayii2==toplam1) {
				System.out.println("bu iki sayı arkadaştır");
			}else {
				System.out.println("bu iki sayı arkadaş değildir.");
			}
			
			//sayi bulma
			
			int[] sayilar=new int[] {1,2,5,7,9,0};
			int aranacak=5;
			boolean varMi=false;
			
			for (int sayı:sayilar) {
				if(sayi==aranacak) {
					varMi=true;
					break;
					
				}
			}
			
			if(varMi) {
				System.out.println("Sayi mevcuttur");
				
			}else {
				System.out.println("sayı mevcut değildir.");
			}


	}

}
