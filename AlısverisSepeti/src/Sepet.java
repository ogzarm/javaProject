
public class Sepet {
	
	public int urun_adedi;
	public int sepet_harcamasi;
	
	public void urunEkle(SepettekiUrun nesne,MarkettekiUrun nesneMarket){
		nesne = new SepettekiUrun(nesneMarket,nesne.getAdet());
		urun_adedi++;
		sepet_harcamasi+=nesne.toplam_fiyat;
	}
	
	

	public void yazdir(SepettekiUrun nesne,MarkettekiUrun nesneMarket){
		
		nesne = new SepettekiUrun(nesneMarket,nesne.getAdet() );
		System.out.println(nesne.kod+"kodlu urun toplam fiyatý--->>> "+nesne.toplam_fiyat);
		
	}
}
