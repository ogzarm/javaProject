import java.util.Scanner;


public class soru_1 {

	public static void main(String[] args) {
		int number,temp,reverse=0;
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("Lutfen 100 ile 10000000 arasinda bir sayi giriniz: ");
			number = scan.nextInt();
			if(number<10000000 && number>100){
				break;
			}
			else{
				System.out.println("Yanlis bir deger girdiniz.");
			}
		}
		temp=number;
		while( temp != 0 ){
			reverse = reverse * 10;
			reverse = reverse + temp%10;
			temp = temp/10;
		}
		System.out.println("Girilen sayi: " + number);  
		System.out.println("Girilen sayinin tersi: " + reverse);  
		System.out.println("Oran: " + ((double)reverse/number));
	}

}
