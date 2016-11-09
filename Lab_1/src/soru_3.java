import java.util.Scanner;


public class soru_3 {

	
	public static void main(String[] args) {
		double x1,y1,z1,x2,y2,z2,x3,y3,z3,uzaklik_1ve2,uzaklik_1ve3,uzaklik_2_3,x0,y0,z0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. Nokta için giriþler yapýlacaktýr...");
		System.out.print("x : ");
		x1=scan.nextDouble();
		System.out.print("y : ");
		y1=scan.nextDouble();
		System.out.print("z : ");
		z1=scan.nextDouble();
		
		System.out.println("2. Nokta için giriþler yapýlacaktýr...");
		System.out.print("x : ");
		x2=scan.nextDouble();
		System.out.print("y : ");
		y2=scan.nextDouble();
		System.out.print("z : ");
		z2=scan.nextDouble();
		
		System.out.println("3. Nokta için giriþler yapýlacaktýr...");
		System.out.print("x : ");
		x3=scan.nextDouble();
		System.out.print("y : ");
		y3=scan.nextDouble();
		System.out.print("z : ");
		z3=scan.nextDouble();
		
		uzaklik_1ve2 = Math.abs(Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2) + Math.pow(z2-z1,2)));
		System.out.println("(" + x1 +"," + y1 + "," + z1 +") ile (" + x2 + "," + y2 + "," + z1 +") arasý uzaklýk :" +uzaklik_1ve2);
		
		uzaklik_1ve3 =Math.abs(Math.sqrt(Math.pow(x3-x1,2) + Math.pow(y3-y1,2) + Math.pow(z3-z1,2)));
		System.out.println("(" + x1 +"," + y1 + "," + z1 +") ile (" + x3 + "," + y3 + "," + z3 +") arasý uzaklýk :" +uzaklik_1ve3);
		
		uzaklik_2_3 = Math.abs(Math.sqrt(Math.pow(x3-x2,2) + Math.pow(y3-y2,2) + Math.pow(z3-z2,2)));
		System.out.println("(" + x2 +"," + y2 + "," + z2 +") ile (" + x3 + "," + y3 + "," + z3 +") arasý uzaklýk :" +uzaklik_2_3);
		
		x0 = (x1 + x2 + x3)/3 ;
		y0 = (y1 + y2 + y3)/3 ;
		z0 = (z1 + z2 + z3)/3 ;
		
		System.out.println("Üçgenin aðýrlýk merkezi koordinatý (" + x0 +"," + y0 +","+ z0+")");
		
	}

}
