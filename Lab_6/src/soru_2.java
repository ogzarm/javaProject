import java.util.Scanner;


public class soru_2 {

	
	public static void main(String[] args) {
		int n,kuvvet;
		Scanner scan = new Scanner(System.in);
		System.out.print("Dizi kapasitesi icin bir N degeri giriniz: ");
		while(true){
			n = scan.nextInt();
			if(n<0){
				System.out.println("Yanlis giris");
			}
			else{
				break;
			}
		}
		
		double[] sayi = new double[n];
		for(int i=0;i<sayi.length;i++){
			System.out.print((i+1)+". elemani giriniz:");
			sayi[i] = scan.nextDouble(); 
		}
		System.out.print("Kacýncý dereceden kuvvet alalim? ");
		while(true){
			kuvvet = scan.nextInt();
			if(n<0){
				System.out.println("Yanlis giris");
			}
			else{
				break;
			}
		}
		
		System.out.println("Ýndeks \t Sayi \t "+kuvvet+".kuvveti");
		double[] kuvvet_sayi = new double[n];
		for(int i=0;i<kuvvet_sayi.length;i++){
			kuvvet_sayi[i]=Math.pow(sayi[i], kuvvet);
			System.out.println((i+1)+"\t"+sayi[i]+"\t"+kuvvet_sayi[i]);
			
		}
	}

}
