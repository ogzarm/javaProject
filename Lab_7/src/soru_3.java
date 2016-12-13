
public class soru_3 {

	
	public static void main(String[] args) {
		//21 adet tek corap
		//S,B,M,P
		//21 elmanlý adetlik dizi 
		char [] corap_dizi = new char[21];
		int random_variable,beyaz_sayisi=0,siyah_sayisi=0,mavi_sayisi=0,pembe_sayisi=0;
		for(int i=0;i<corap_dizi.length;i++){
			random_variable = 1+(int)(Math.random()*4);
			switch (random_variable) {
			case 1:
				corap_dizi[i]='S';
				siyah_sayisi++;
				break;
			case 2:
				corap_dizi[i]='B';
				beyaz_sayisi++;
				break;
			case 3:
				corap_dizi[i]='M';
				mavi_sayisi++;
				break;
			case 4:
				corap_dizi[i]='P';
				pembe_sayisi++;
				break;
			}
		}
		System.out.print("Coraplarin renkleri: ");
		for(int i=0;i<corap_dizi.length;i++){
			System.out.print(corap_dizi[i]+" ");
		}
		System.out.println();
		System.out.println("Beyaz corap sayisi: "+beyaz_sayisi);
		System.out.println("Siyah corap sayisi: "+siyah_sayisi);
		System.out.println("Pembe corap sayisi: "+pembe_sayisi);
		System.out.println("Mavi corap sayisi: "+mavi_sayisi);
		
		if(beyaz_sayisi%2==1){
			System.out.println("Beyaz corap eksik!!!");
		}
		if(siyah_sayisi%2==1){
			System.out.println("Siyah corap eksik!!!");
		}
		if(mavi_sayisi%2==1){
			System.out.println("Mavi corap eksik!!!");
		}
		if(pembe_sayisi%2==1){
			System.out.println("Pembe corap eksik!!!");
		}
	}

}
