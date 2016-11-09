import java.util.Scanner;


public class soru_2 {

	
	public static void main(String[] args) {
		double a,b,c,d,x,sonuc;
	
		Scanner scan = new Scanner(System.in);
		System.out.print("a katsayýsýný giriniz : ");
		a = scan.nextDouble();
		System.out.print("b katsayýsýný giriniz : ");
		b = scan.nextDouble();
		System.out.print("c katsayýsýný giriniz : ");
		c = scan.nextDouble();
		System.out.print("d katsayýsýný giriniz : ");
		d = scan.nextDouble();
		
		System.out.println("Girilen katsayýlar ile oluþan f(x) = "+a+"x^3 + " + b +"sin(2*pi*" + b +"x) + " + c +"e^(-x-"+(c*c)+")+" +(d/5)+" þeklindedir.");
		System.out.print("Hangi x deðerinde f(x) hesaplansýn?");
		x = scan.nextDouble();
		sonuc = (a*Math.pow(x, 3)) + (b*Math.sin(2*Math.PI*b*x)) + (c*Math.exp(-(x-Math.pow(c,2)))+ (d/5));
		System.out.println("f(" + x + ")="+sonuc);
		
		

	}

}
