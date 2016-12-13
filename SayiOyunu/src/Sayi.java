import java.util.*;

public class Sayi {
	private int[] sayi_dizi=new int[4];//4 elemanli dizi olusturuldu.
	Scanner scan = new Scanner(System.in);
	public void SayiOlustur() {
		/* Diziye random sayilar atanacak.
		   Dizinin 1. elemani "0" olmayacak.
		   Dizinin elemanlari birbirinden farkli olacak.
		*/
		for(int i=0; i<sayi_dizi.length; i++){
			if(i==0){
				sayi_dizi[i] = numGenForZero(sayi_dizi); 
			}
			else{
				sayi_dizi[i] = numGen(sayi_dizi);
			}
			
		}
		
	}

	public void SayiIste() {
		/*
		 * Rakamlarý farkli bir sayi olacak.
		 * "0" ile baslamayacak
		 */
		System.out.print("Rakamlari farkli bir sayi giriniz: ");
		String girilen_sayi;
		while(true){
			girilen_sayi=scan.next();
			if(girilen_sayi.length()==4 && girilen_sayi.charAt(0)!=girilen_sayi.charAt(1)&&girilen_sayi.charAt(0)!=girilen_sayi.charAt(2)&&girilen_sayi.charAt(0)!=girilen_sayi.charAt(3)&&girilen_sayi.charAt(1)!=girilen_sayi.charAt(2)&&girilen_sayi.charAt(1)!=girilen_sayi.charAt(3)&&girilen_sayi.charAt(2)!=girilen_sayi.charAt(3)){
				break;
			}
			else{
				System.out.print("Lutfen tekrar (4 basamakli - farkli rakamli)bir sayi giriniz:");
			}
		}
		for(int i=0; i<girilen_sayi.length(); i++){
			sayi_dizi[i]=Character.getNumericValue(girilen_sayi.charAt(i));
		}
		
		
	}

	public boolean Analiz(Sayi kullanici,Sayi hedef) {
		int dogruIndex=0,yanlisIndex=0;
		for(int i=0; i<sayi_dizi.length; i++){
			if(kullanici.sayi_dizi[i]==hedef.sayi_dizi[i]){
				dogruIndex++;
			}
		}
		for(int i=0; i<4; i++){
			for(int j=0;j<4;j++){
				if(i==j){
					continue;
				}
				if(hedef.sayi_dizi[i]==kullanici.sayi_dizi[j]){
					yanlisIndex++;
				}
			}
		}
		System.out.print("Sonuc: ");
		if(dogruIndex==0&&yanlisIndex==0){
			System.out.println(dogruIndex);
		}
		else if(dogruIndex==0){
			System.out.println("-"+yanlisIndex);
		}
		else if(yanlisIndex==0){
			System.out.println("+"+dogruIndex);
		}
		else{
			System.out.println("+"+ dogruIndex+ "-"+ yanlisIndex);
		}
		
		if(dogruIndex==4){
			return false;
		}
		
		return true;
	}

	public int[] getSayi_dizi() {
		return sayi_dizi;
	}

	public void setSayi_dizi(int[] sayi_dizi) {
		this.sayi_dizi = sayi_dizi;
	}
	
	
	public static int numGenForZero(int Array[])
	{

	    int random = (int)(1+Math.random()*9);

	    for(int loop = 0; loop <Array.length ; loop++)
	    {
	        if(Array[loop] == random)
	        {
	            return numGenForZero(Array);
	        } 
	    }


	    return random;
	}
	public static int numGen(int Array[])
	{

	    int random = (int)(Math.random()*10);

	    for(int loop = 0; loop <Array.length ; loop++)
	    {
	        if(Array[loop] == random)
	        {
	            return numGen(Array);
	        } 
	    }
	    return random;
	}
	
	//Test etmek icin yazdim.
	public void SayiYazdir() {
		// TODO Auto-generated method stub
		for(int i=0; i<sayi_dizi.length; i++){
			System.out.print(sayi_dizi[i] + " ");
		}
	}

}
