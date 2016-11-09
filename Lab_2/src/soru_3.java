import java.util.Scanner;


public class soru_3 {

	
	public static void main(String[] args) {
		double para;
		int ikiyuz_para,yuz_para,elli_para,yirmi_para,on_para,bes_para,bozuk_para;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Cekmek istediginiz para miktarini giriniz: ");
		para = scan.nextDouble();
		if(para%1!=0){
			System.out.println("SU ANDA SADECE TAM SAYILI PARALAR VEREBİLİYORUM.");
			System.exit(1);
		}
		ikiyuz_para = (int)para/200;
		
		if(ikiyuz_para>2){
			
			ikiyuz_para=2;
		}
		para=para-(ikiyuz_para*200);
		yuz_para = (int)para/100;
		
		if(yuz_para>3){
			
			yuz_para=3;
		}
		para=para-(yuz_para*100);
		
		elli_para = (((int)para%200)%100)/50;
		yirmi_para = ((((int)para%200)%100)%50)/20;
		on_para = (((((int)para%200)%100)%50)%20)/10;
		bes_para =((((((int)para%200)%100)%50)%20)%10)/5;
		bozuk_para = (((((((int)para%200)%100)%50)%20)%10)%5)/1;
		

		
		
	
		
		
		
		if(ikiyuz_para!=0){
			System.out.println(ikiyuz_para + " adet 200 TL'lik banknot");
		}
		if(yuz_para!=0){
			System.out.println(yuz_para + " adet 100 TL'lik banknot");
		}
		if(elli_para!=0){
			System.out.println(elli_para + " adet 50 TL'lik banknot");
		}
		if(yirmi_para!=0){
			System.out.println(yirmi_para + " adet 20 TL'lik banknot");
		}
		if(on_para!=0){
			System.out.println(on_para + " adet 10 TL'lik banknot");
		}
		if(bes_para!=0){
			System.out.println(bes_para + " adet 5 TL'lik banknot");
		}
		if(bozuk_para!=0){
			System.out.print(bozuk_para + " adet 1 TL'lik bozukluk verilecektir.");
		}
		
		
	}

}
