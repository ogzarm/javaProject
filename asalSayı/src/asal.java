import java.util.Scanner;

/**
 * 
 */

/**
 * @author oguzhanarm
 *
 */
public class asal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Asal say� olup olmad�g�n� ogrenmek istediginiz say�y� giriniz?");
		Scanner input=new Scanner(System.in);
		int asalsayi;
		asalsayi=input.nextInt();
		int i=2;
		int kalansayi=0;
		while(i<asalsayi/2)
		{
			i=i+1;
			kalansayi=asalsayi%i;
			if(kalansayi==0)
				break;
			
		}
		if(kalansayi==0)
		{
			System.out.println(Integer.toString(asalsayi) +"  "+"Asal Degildir!");			
		}
		else
		{
			System.out.println(Integer.toString(asalsayi) +"  "+"Asald�r!");	
		}
	}
		

}
