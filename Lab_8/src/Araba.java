import java.util.Scanner;

public class Araba {
	String marka,renk;
	int beygir,model,motor_hacmi;
	boolean onden_cekis;
	Scanner scan=new Scanner(System.in);
	public void bilgi_Al(){
		System.out.print("Arabaniz hangi markadir? ");
		this.marka=scan.next();
		System.out.print("Arabaniz kac beygirdir gucundedir? ");
		this.beygir=scan.nextInt();
		System.out.print("Arabaniz kac modeldir? ");
		this.model=scan.nextInt();
		System.out.print("Arabanizin motor hacmi nedir? ");
		this.motor_hacmi=scan.nextInt();
		System.out.print("Arabaniz onden cekisli midir? ");
		this.onden_cekis=scan.nextBoolean();
		System.out.print("Arabanizin rengi nedir? ");
		this.renk=scan.next();
	}
	public void yazdir(){
		System.out.println("Arabanizin bilgileri yazdiriliyor...");
		System.out.println("Marka:"+this.marka);
		System.out.println("Beygir Gucu:"+this.beygir);
		System.out.println("Model:"+this.model);
		System.out.println("Motor Hacmi:"+this.motor_hacmi);
		System.out.println("Onden Cekisli :"+this.onden_cekis);
		System.out.println("Renk:"+this.renk);
		System.out.println("-------------------------------------");
		
	}
}
