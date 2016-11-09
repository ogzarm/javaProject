import java.util.Scanner;


public class soru_1 {


	public static void main(String[] args) {
		double etiket_fiyati,yeni_fiyat = 0,aylik_taksit = 0;
		String secim;
		int taksit_sayisi;
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen urunun etiket fiyatini giriniz : ");
		etiket_fiyati = scan.nextDouble();
		System.out.print("Lutfen odeme secenegini giriniz(Nakit icin 'n'-Taksit icin 't'");
		secim = scan.next();
		if(secim.equals("n")){
			yeni_fiyat=etiket_fiyati*0.8;
			System.out.print("Urunun yeni fiyati : "+yeni_fiyat);
		}
		else if(secim.equals("t")){
			System.out.print("Lutfen taksit sayisini giriniz");
			taksit_sayisi = scan.nextInt();
			if(taksit_sayisi<=6){
				yeni_fiyat = etiket_fiyati;
				System.out.println("Urunun yeni fiyati : "+yeni_fiyat);
				aylik_taksit =yeni_fiyat/taksit_sayisi;
				System.out.println("Aylik taksit tutari :"+aylik_taksit);
			}
			else if(taksit_sayisi>7 && taksit_sayisi<=12){
				yeni_fiyat =etiket_fiyati*1.1;
				System.out.println("Urunun yeni fiyati : "+yeni_fiyat);
				aylik_taksit =yeni_fiyat/taksit_sayisi;
				System.out.println("Aylik taksit tutari :"+aylik_taksit);
			}
			else if(taksit_sayisi>13 && taksit_sayisi<=24){
				yeni_fiyat = etiket_fiyati *1.2;
				System.out.println("Urunun yeni fiyati : "+yeni_fiyat);
				aylik_taksit =yeni_fiyat/taksit_sayisi;
				System.out.print("Aylik taksit tutari :"+aylik_taksit);
			}
		}
		
	}

}
