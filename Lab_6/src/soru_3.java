import java.util.Scanner;


public class soru_3 {

	public static void main(String[] args) throws InterruptedException{
		int parkur_uzunluk;
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen parkur uzunlugunu giriniz: ");
		parkur_uzunluk = scan.nextInt();
		int[][] dizi = new int[2][((parkur_uzunluk+1)/2)+1]; 
		int [] tavsan= new int[((parkur_uzunluk+1)/2)+1];
		int [] kaplumbaga= new int[((parkur_uzunluk+1)/2)+1];
		for(int i=0;i<tavsan.length;i++){
			tavsan[i]=(int)(Math.random()*5);
			kaplumbaga[i] = 2;
		}
		
		for(int i=0;i<((parkur_uzunluk+1)/2)+1;i++){
			
			if(i==0){
				dizi[0][i]=kaplumbaga[i];
				dizi[1][i]=tavsan[i];
			}
			else{
				dizi[0][i]=kaplumbaga[i]+dizi[0][i-1];
				dizi[1][i]=tavsan[i]+dizi[0][i-1];
			}
			
			
		}
		System.out.print("Kaplumbaga: ");
		for(int i=0;i<((parkur_uzunluk+1)/2)+1;i++){
			if(dizi[0][i]>15) {
				break;
			}
			System.out.print(dizi[0][i]+"  ");
			
		}
		
		System.out.println();
		System.out.print("Tavsan: ");
		for(int i=0;i<((parkur_uzunluk+1)/2)+1;i++){
			if( dizi[1][i]>15){
				break;
			}
			System.out.print(dizi[1][i]+"  ");
			
		}
		System.out.println();
		if(dizi[0][(parkur_uzunluk+1)/2]<dizi[1][(parkur_uzunluk+1)/2]){
			System.out.println("Tavsan kazandi");
		}
		else if(dizi[0][(parkur_uzunluk+1)/2]>dizi[1][(parkur_uzunluk+1)/2]){
			System.out.println("Kaplumbaga kazandi kazandi");
			
		}
		else{
			System.out.println("Berabere");
		}
		
		///////////////////////////////2.kisim
	
		for(int i=0;i<((parkur_uzunluk+1)/2)+1;i++){
			System.out.print("Kaplumbaga:");
			int count=dizi[0][i];
			int count2=dizi[1][i];
			while(count>0){
				System.out.print("*");
				count--;
			}
			System.out.println("  ");
			System.out.print("Tavsan:");
			while(count2>0){
				System.out.print("*");
				count2--;
			}
			System.out.println("  ");
			System.out.println("--------------");
			Thread.sleep(2000);
		}
		if(dizi[0][(parkur_uzunluk+1)/2]<dizi[1][(parkur_uzunluk+1)/2]){
			System.out.println("Tavsan kazandi");
		}
		else if(dizi[0][(parkur_uzunluk+1)/2]>dizi[1][(parkur_uzunluk+1)/2]){
			System.out.println("Kaplumbaga kazandi kazandi");
			
		}
		else{
			System.out.println("Berabere");
		}
	}

}
