import java.util.Scanner;


public class soru_1 {

	
	public static void main(String[] args) {
		String choice,answer_go;
		double result = 0,num1,num2;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		
		while(true){
			System.out.println("Yapmak istediðiniz iþlem nedir?");
			System.out.print("'Toplama','Cikarma','Carpma','Bolme'...");
			choice = scan.next();
					
		switch(choice){
		case "Toplama" :
			System.out.print("Lutfen islem yapilacak ilk sayiyi giriniz:");
			num1 = scan.nextDouble();
			System.out.print("Lutfen islem yapilacak ikinci sayiyi giriniz:");
			num2 = scan.nextDouble();
			result = num1 + num2;
			System.out.println("Seçilen iþlem: " + choice + " Sonuç:" + result);
			break;
		case "Cikarma":
			System.out.print("Lutfen islem yapilacak ilk sayiyi giriniz:");
			num1 = scan.nextDouble();
			System.out.print("Lutfen islem yapilacak ikinci sayiyi giriniz:");
			num2 = scan.nextDouble();
			result = num1-num2;
			System.out.println("Seçilen iþlem: " + choice + " Sonuç:" + result);
			break;
		case "Carpma":
			System.out.print("Lutfen islem yapilacak ilk sayiyi giriniz:");
			num1 = scan.nextDouble();
			System.out.print("Lutfen islem yapilacak ikinci sayiyi giriniz:");
			num2 = scan.nextDouble();
			result = num1*num2;
			System.out.println("Seçilen iþlem: " + choice + " Sonuç:" + result);
			break;
		case "Bolme":
			System.out.print("Lutfen islem yapilacak ilk sayiyi giriniz:");
			num1 = scan.nextDouble();
			System.out.print("Lutfen islem yapilacak ikinci sayiyi giriniz:");
			num2 = scan.nextDouble();
			result = num1/num2;
			System.out.println("Secilen iþlem: " + choice + " Sonuç:" + result);
			break;
		default:	
			System.out.println("Tanýmlanamayan girdi. Ýþlem sonlandýrýldý.");
			
		}
		
		
		System.out.println("Devam etmek istiyor musunuz?(e/h)");
		answer_go = scan.next();
		if(answer_go.equals("h")){
			System.out.println("Ýstediðiniz üzerine iþlemler sonlandýrýldý.");
			break;
		}
		else if(answer_go.equals("e")){
			System.out.println("Ýþlemlere devam ediliyor...");
		}
		}
		
	}

}
