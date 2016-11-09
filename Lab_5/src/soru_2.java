import java.util.Scanner;


public class soru_2 {

	public static void main(String[] args) {
		int n;
		double pi=0.0,hata_degeri;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir N giriniz : ");
		n = scan.nextInt();
		for(int i=0;i<=n;i++){
			pi=((Math.pow(-1,i))/(2*i+1)*4)+pi;
		}
		System.out.println("N=" + n + "icin pi sayisi: " + pi);
		hata_degeri = Math.abs(((Math.PI-pi)/Math.PI));
		System.out.println("Hata Degeri:"+hata_degeri);
		pi=Math.PI-(1000000*Math.PI);
	}

}
