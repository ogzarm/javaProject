import java.util.Scanner;


public class soru_2 {

	
	public static void main(String[] args) {
		double a,b,c,d,x,sonuc;
	
		Scanner scan = new Scanner(System.in);
		System.out.print("a katsay�s�n� giriniz : ");
		a = scan.nextDouble();
		System.out.print("b katsay�s�n� giriniz : ");
		b = scan.nextDouble();
		System.out.print("c katsay�s�n� giriniz : ");
		c = scan.nextDouble();
		System.out.print("d katsay�s�n� giriniz : ");
		d = scan.nextDouble();
		
		System.out.println("Girilen katsay�lar ile olu�an f(x) = "+a+"x^3 + " + b +"sin(2*pi*" + b +"x) + " + c +"e^(-x-"+(c*c)+")+" +(d/5)+" �eklindedir.");
		System.out.print("Hangi x de�erinde f(x) hesaplans�n?");
		x = scan.nextDouble();
		sonuc = (a*Math.pow(x, 3)) + (b*Math.sin(2*Math.PI*b*x)) + (c*Math.exp(-(x-Math.pow(c,2)))+ (d/5));
		System.out.println("f(" + x + ")="+sonuc);
		
		

	}

}
