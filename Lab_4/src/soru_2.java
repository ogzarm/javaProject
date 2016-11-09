import java.util.Scanner;


public class soru_2 {

	public static void main(String[] args) throws InterruptedException{
		String self_password="1234",password;
		int wrong_counter=0;
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("Sifreyi giriniz: ");
			password = scan.next();	
			if(password.charAt(0)=='*'){
				self_password=password.substring(1);
			}
		
			else if(self_password.equals(password)){
				System.out.println("Sifre dogru!!!");
				break;
			}
			else if(self_password.equals(password)!=true && password.equals("-1")!=true){
				System.out.println("Yanlis sifre!!!");
				wrong_counter++;
				if(wrong_counter==1)
					Thread.sleep(3000);
				else if(wrong_counter==2)
					Thread.sleep(10000);
				else if(wrong_counter==3){
					System.out.println("Sistem kilitlenmistir, gecmis olsun");
					break;
				}
					
				System.out.println("Tekrar deneyiniz.");
			}
			else if(password.equals("-1")){
				System.out.println("Sistem kapatiliyor");
				break;
			}
		}

	}

}
