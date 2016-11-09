import java.util.*;
public class soru_1 {

	
	public static void main(String[] args) {
		String name;
		int yil;
		int yas;
		String kizlik_soyadi;
		String sifre;
		Scanner scan = new Scanner(System.in);
		System.out.println("Merhaba");
		System.out.print("Ýsminiz: ");
		name = scan.next();
		System.out.println("Hoþgeldin "+name);
		System.out.print("Doðum yýlýnýz: ");
		yil = scan.nextInt();
		yas = 2016-yil;
		System.out.println("Yaþýnýz: "+ yas);
		System.out.print("Annenizin kýzlýk soyadýný yazýnýz: ");
		kizlik_soyadi = scan.next();
		System.out.println("3. ve 1. harfler : "+ kizlik_soyadi.charAt(2)+ kizlik_soyadi.charAt(0));
		sifre = " " + kizlik_soyadi.charAt(2)+ name + yas;
		System.out.println("Sizin için otomatik oluþturulan þifre : '" +sifre+"'");
	}

}
