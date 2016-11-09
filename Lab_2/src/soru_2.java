import java.util.Scanner;


public class soru_2 {

	public static void main(String[] args) {
		double x,y,result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir x sayisi giriniz: ");
		x = scan.nextDouble();
		System.out.println("Lutfen bir y sayisi giriniz: ");
		y = scan.nextDouble();
		
		if(x<=2 && y<=-1){
			result = Math.max((x-5)/(y-1), (y+1)/(3-x));
		}
		if(x>2 && y<=-1){
			result = (Math.pow(x, Math.PI*y))*-1;
		}
		if(x<=2 && y>-1){
			result = -1*Math.abs(((Math.sqrt(3)*y)-(x/2)));
		}
		if(x>2 && y>-1){
			result = Math.sqrt((2*x+y));
		}
		System.out.println("x: " + x + " y: " + y + " icin sonuc: " + result);
		
		
		
	}

}
