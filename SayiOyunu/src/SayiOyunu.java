import java.util.Scanner;


public class SayiOyunu {

	
	public static void main(String[] args) {
		//count kac el surecegini tutar.
		//devam_secimi tekrar oynamak kararinin evet/hayir oldugunu tutar.
		int count=0;
		String devam_secimi;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		//while sonsuz dongu tekrar oynamayi saglamak icin
		while(true){
			Sayi hedef = new Sayi(); //hedef nesnesi bilgisayarýn sayi nesnesidir.                
			System.out.println("OYUN BASLIYOOOOR!");  
			hedef.SayiOlustur();  		
			System.out.println("Bilgisayar sayisini tuttu.");       
			//hedef.SayiYazdir(); //test asamasinda kullanilmistir.
			Sayi kullanici = new Sayi(); //kullanicinin sayi nesnesidir.
			
			do{                
			kullanici.SayiIste();  
			count++;
			}while(hedef.Analiz(kullanici,hedef));
			System.out.println("Tebrikler KAZANDINIZ!");
			System.out.println("Sayiyi " + count + " tahminde bildiniz!");
			System.out.println("Bir daha oynamak ister misiniz(evet/hayir):");
			devam_secimi = scan.next();
			if(!devam_secimi.equals("evet")){
				System.out.println("BY BY");
				break;
			}
		}
		
		
		

	}

}
