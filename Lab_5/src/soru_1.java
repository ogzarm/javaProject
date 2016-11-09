import java.util.Scanner;


public class soru_1 {

	
	public static void main(String[] args) {
		String text;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir isim giriniz:");
		text = scan.next();
		char[] dizi = new char[text.length()];
		for(int i=0;i<dizi.length;i++){
			dizi[i]=text.charAt(i);
			System.out.println(dizi[i]);
		}
	}

}
