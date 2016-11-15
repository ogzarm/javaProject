import java.util.Scanner;


public class soru_1 {

	
	public static void main(String[] args) {
		String dizgi;
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir dizgi giriniz: ");
		dizgi = scan.next();
		dizgi = dizgi.toUpperCase();
		for(int i=0;i<dizgi.length();i++){
			
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			System.out.println(dizgi.charAt(i));
			
		}
	}

}
