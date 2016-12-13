import java.util.Scanner;


public class soru_1 {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir N sayisi giriniz: ");
		n = scan.nextInt();
		int[] tek_sayi=new int[n];
		int temp=1;
		for(int i=0;i<tek_sayi.length;i++){
			tek_sayi[i]=temp;
			temp+=2;
				
		}
		for(int i:tek_sayi){
			System.out.println(i);
		}
		System.out.println("Asal Sayýlar");
		int[] asal_sayi = new int [n];
		int sayi=2;
		int kalan=0;
		for(int i=0;i<asal_sayi.length;i++){
			if(sayi==2){
				asal_sayi[i]=sayi;
			}
			else{
				for(int j=2;j<sayi;j++){
					kalan=sayi%j;
					if(kalan==0){
						break;
					}
				}
				if(kalan!=0){
					asal_sayi[i]=sayi;
				}
				else{
					i--;
				}
			}
			sayi++;
		}
		for(int i:asal_sayi){
			System.out.println(i);
		}
		
	}

}
