import java.util.*;
public class soru_4 {

	
	public static void main(String[] args) {
		int dogum_yil,dogum_ay,dogum_gun,gunToplamKisi,gunToplamBugun,yasYil,yasAy,yasGun;
		int BUGUN_YIL=2016,BUGUN_AY=10,BUGUN_GUN=11;
		String isim;
		Scanner scan = new Scanner(System.in);
		System.out.print("�sminiz:");
		isim=scan.next();
		System.out.print("Do�um Y�l�n�z:");
		dogum_yil = scan.nextInt();
		System.out.print("Do�um Ay�n�z:");
		dogum_ay = scan.nextInt();
		System.out.print("Do�um G�n�n�z:");
		dogum_gun = scan.nextInt();
		
		gunToplamKisi=(dogum_yil*365) + (dogum_ay*12) ;
		gunToplamBugun=(BUGUN_YIL*365) + (BUGUN_AY*12) ;
		
		yasYil =(gunToplamBugun-gunToplamKisi)/365;
		yasAy = ((gunToplamBugun-gunToplamKisi)%365)/30;
		yasGun =(((gunToplamBugun-gunToplamKisi)%365))%30;
		System.out.println("Merhaba"+ isim + "Girdi�in bilgilere g�re ya��n " + yasYil + " y�l "+yasAy+" ay"+yasGun+" g�nd�r.");
		
		
		
		
		

	}

}
