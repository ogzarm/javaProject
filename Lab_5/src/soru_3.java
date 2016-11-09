import java.util.Scanner;


public class soru_3 {

	public static void main(String[] args) {
		int uzunluk,genislik,n;
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<5;i++){
			for(int j=0;j<2*i;j++){
				System.out.print(" ");
			}
			System.out.println("**");
			
			
		}
		//Bosluk satir yapar.
		for(int i=0;i<4;i++){
			System.out.println();
		}
		
		System.out.print("Lutfen dikdortgenin uzunlugunu giriniz:");
		while(true){
			uzunluk = scan.nextInt();
			if(uzunluk<=0){
				System.out.println("Lutfen uzunluk icin 0'dan buyuk deger giriniz:");
			}
			else{
				break;
			}
		}
		
		System.out.print("Lutfen dikdortgenin genisligini giriniz:");
		while(true){
			genislik = scan.nextInt();
			if(genislik<=0){
				System.out.println("Lutfen genislik icin 0'dan buyuk deger giriniz:");
			}
			else{
				break;
			}
		}
		for(int i=0;i<uzunluk;i++){
			for(int j=0;j<genislik;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Bosluk satir yapar.
		for(int i=0;i<4;i++){
			System.out.println();
		}
		
		System.out.print("Lutfen ucgen icin boyut giriniz: ");
		while(true){
			n = scan.nextInt();
			if(n<=2){
				System.out.println("Lutfen boyut icin 2'den buyuk deger giriniz:");
			}
			else{
				break;
			}
		}
		for(int i=0;i<n-1;i++){
			System.out.print("*");
			for(int j=0;j<i-1;j++){
				
				System.out.print(" ");
				
			}
			
			if(i!=0)
			System.out.print("*");
			
			System.out.println();
		}
		for(int i=0;i<n;i++){
			System.out.print("*");
		}
		//Bosluk satir yapar.
		for(int i=0;i<4;i++){
			System.out.println();
		}
		int sayi;
		System.out.print("Lutfen ucgen icin boyut giriniz: ");
		while(true){
			sayi=scan.nextInt();
			if(sayi<=2){
				System.out.print("Lutfen boyut icin 2'den buyuk deger giriniz:");
			}
			else{
				break;
			}
		}
		for(int i=0;i<sayi-1;i++){
			
			for(int j=0;j<sayi-i;j++){
				System.out.print(" ");
			}
			System.out.print("*");
			for(int k=0;k<2*i;k++){
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		System.out.print(" ");
		for(int i=0;i<2*sayi;i++){
			System.out.print("*");
		}
		
				
		
		

	}

}
