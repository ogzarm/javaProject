
public class Market {
	public int urun_adedi;
	
	
	public void urunEkle(MarkettekiUrun nesne){
		nesne= new MarkettekiUrun(nesne.kod,nesne.isim, nesne.birim_fiyat);
		urun_adedi++;
		
	}
	public void urunleriYazdir(MarkettekiUrun nesne){
			System.out.println(nesne.kod + ")" + nesne.isim + " - Birim Fiyat: " + nesne.birim_fiyat + " TL");
	}
	
}
