import java.util.Scanner;


public class soru_1 {

	
	public static void main(String[] args) {
		String choice,answer_go;
		double result = 0,num1,num2;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		
		while(true){
			System.out.println("Yapmak istedi�iniz i�lem nedir?");
			System.out.print("'Toplama','Cikarma','Carpma','Bolme'...");
			choice = scan.next();
					
		switch(choice){
		case "Toplama" :
			System.out.print("Lutfen islem yapilacak ilk sayiyi giriniz:");
			num1 = scan.nextDouble();
			System.out.print("Lutfen islem yapilacak ikinci sayiyi giriniz:");
			num2 = scan.nextDouble();
			result = num1 + num2;
			System.out.println("Se�ilen i�lem: " + choice + " Sonu�:" + result);
			break;
		case "Cikarma":
			System.out.print("Lutfen islem yapilacak ilk sayiyi giriniz:");
			num1 = scan.nextDouble();
			System.out.print("Lutfen islem yapilacak ikinci sayiyi giriniz:");
			num2 = scan.nextDouble();
			result = num1-num2;
			System.out.println("Se�ilen i�lem: " + choice + " Sonu�:" + result);
			break;
		case "Carpma":
			System.out.print("Lutfen islem yapilacak ilk sayiyi giriniz:");
			num1 = scan.nextDouble();
			System.out.print("Lutfen islem yapilacak ikinci sayiyi giriniz:");
			num2 = scan.nextDouble();
			result = num1*num2;
			System.out.println("Se�ilen i�lem: " + choice + " Sonu�:" + result);
			break;
		case "Bolme":
			System.out.print("Lutfen islem yapilacak ilk sayiyi giriniz:");
			num1 = scan.nextDouble();
			System.out.print("Lutfen islem yapilacak ikinci sayiyi giriniz:");
			num2 = scan.nextDouble();
			result = num1/num2;
			System.out.println("Secilen i�lem: " + choice + " Sonu�:" + result);
			break;
		default:	
			System.out.println("Tan�mlanamayan girdi. ��lem sonland�r�ld�.");
			
		}
		
		
		System.out.println("Devam etmek istiyor musunuz?(e/h)");
		answer_go = scan.next();
		if(answer_go.equals("h")){
			System.out.println("�stedi�iniz �zerine i�lemler sonland�r�ld�.");
			break;
		}
		else if(answer_go.equals("e")){
			System.out.println("��lemlere devam ediliyor...");
		}
		}
		
	}

}
