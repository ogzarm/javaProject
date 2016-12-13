import java.util.Scanner;


public class soru_1 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Araba a1 = new Araba();
		a1.marka="BMW";
		a1.beygir= 120;
		a1.model= 2010;
		a1.motor_hacmi=2000;
		a1.onden_cekis=true;
		a1.renk="Siyah";
		
		Araba a2 = new Araba();
		System.out.print("Arabaniz hangi markadir? ");
		a2.marka=scan.next();
		System.out.print("Arabaniz kac beygirdir gucundedir? ");
		a2.beygir=scan.nextInt();
		System.out.print("Arabaniz kac modeldir? ");
		a2.model=scan.nextInt();
		System.out.print("Arabanizin motor hacmi nedir? ");
		a2.motor_hacmi=scan.nextInt();
		System.out.print("Arabaniz onden cekisli midir? ");
		a2.onden_cekis=scan.nextBoolean();
		System.out.print("Arabanizin rengi nedir? ");
		a2.renk=scan.next();
		Araba a3 = new Araba();
		a3.bilgi_Al();
		
		Araba[] arabaDizisi = new Araba[3];
		arabaDizisi[0]=a1;
		arabaDizisi[1]=a2;
		arabaDizisi[2]=a3;
		a1.yazdir();
		a2.yazdir();
		a3.yazdir();
		scan.close();
	}

}
