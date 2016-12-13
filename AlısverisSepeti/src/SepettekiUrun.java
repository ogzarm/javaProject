
public class SepettekiUrun {
	
	//degiskenler
	public int kod, toplam_fiyat;
	private int adet;
	
	public SepettekiUrun(MarkettekiUrun nesne,int adet) {
		this.kod = nesne.kod;
		this.adet = adet;
		this.toplam_fiyat = adet*nesne.birim_fiyat;
	}
	public int getAdet() {
		return adet;
	}
	public void setAdet(int adet) {
		this.adet = adet;
	}
	
}
