import java.util.Scanner;


public class AlýsverisSepeti {


	public static void main(String[] args) throws InterruptedException {
		int anamenu_secim,urun_secim,adet;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		//Marketteki Urun nesnesi olusturuldu.
		MarkettekiUrun muz = new MarkettekiUrun(1, "Muz(Anamur)", 5);
		MarkettekiUrun muzIth = new MarkettekiUrun(2,"Muz(Ital)", 3);
		MarkettekiUrun elma = new MarkettekiUrun(3,"Elma(Amasya)", 5);
		MarkettekiUrun apple = new MarkettekiUrun(4,"Apple(Ipad)", 20);
		MarkettekiUrun kalem = new MarkettekiUrun(5,"Kalem(FaberC)", 2);
		//urun ekleme 
		Market migros = new Market();
		migros.urunEkle(muz);
		migros.urunEkle(muzIth);
		migros.urunEkle(elma);
		migros.urunEkle(apple);
		migros.urunEkle(kalem);
		
		
		
		SepettekiUrun sepetteki_urun = null;		
		Sepet sepetim=new Sepet();
		
	
		
		
		while(true){
			anamenu_secim=AnaEkranGoruntusu();//Secim menusu
			switch (anamenu_secim) {
			case 0:
				System.out.println("****************************************");
				System.out.println("* SEPETIMIZIN MEVCUT HALI	*");
				if(sepetteki_urun==null){
					System.out.println("Sepetinizde Suanda  Urun Bulunmamaktadir.");
				}
				else{
					if(muz.adet_urun!=0){
						sepetteki_urun.setAdet(muz.adet_urun);
						sepetim.yazdir(sepetteki_urun, muz);
					}	
					if(muzIth.adet_urun!=0){
						sepetteki_urun.setAdet(muzIth.adet_urun);
						sepetim.yazdir(sepetteki_urun, muzIth);
					}
						
					if(elma.adet_urun!=0){
						sepetteki_urun.setAdet(elma.adet_urun);
						sepetim.yazdir(sepetteki_urun, elma);
					}
					if(apple.adet_urun!=0){
						sepetteki_urun.setAdet(apple.adet_urun);
						sepetim.yazdir(sepetteki_urun, apple);
					}
					if(kalem.adet_urun!=0){
						sepetteki_urun.setAdet(kalem.adet_urun);
						sepetim.yazdir(sepetteki_urun, kalem);
					}
						
					
				}
				break;
			case 1:	
				System.out.println("****************************************");
				System.out.println("Sepete Urun Ekleme Paneline Hosgeldiniz");
				System.out.println("Suan Magazada ki Mevcut Malzemeler Asagida Gorunmektedir:");
				migros.urunleriYazdir(muz);
				migros.urunleriYazdir(muzIth);
				migros.urunleriYazdir(elma);
				migros.urunleriYazdir(apple);
				migros.urunleriYazdir(kalem);
				System.out.println("Sepetinize eklemek istediginiz urunun kodunu yaziniz(1-5 arasinda): ");
				urun_secim = scan.nextInt();
				System.out.println("****************************************");
				switch (urun_secim) {
				case 1:
					System.out.println("****************************************");
					System.out.println("Kac adet istersiniz");
					adet=scan.nextInt();
					muz.adet_urun+=adet;
					sepetteki_urun = new SepettekiUrun(muz, adet);
					sepetim.urunEkle(sepetteki_urun, muz);
					break;
				case 2:
					System.out.println("****************************************");
					System.out.println("Kac adet istersiniz");
					adet=scan.nextInt();
					muzIth.adet_urun+=adet;
					sepetteki_urun = new SepettekiUrun(muzIth, adet);
					sepetteki_urun.setAdet(adet);
					sepetim.urunEkle(sepetteki_urun, muzIth);
					break;
				case 3:
					System.out.println("****************************************");
					System.out.println("Kac adet istersiniz");
					adet=scan.nextInt();
					elma.adet_urun+=adet;
					sepetteki_urun = new SepettekiUrun(elma, adet);
					sepetteki_urun.setAdet(adet);
					sepetim.urunEkle(sepetteki_urun, elma);
					break;
				case 4:
					System.out.println("****************************************");
					System.out.println("Kac adet istersiniz");
					adet=scan.nextInt();
					apple.adet_urun+=adet;
					sepetteki_urun = new SepettekiUrun(apple, adet);
					sepetteki_urun.setAdet(adet);
					sepetim.urunEkle(sepetteki_urun, apple);
					break;
				case 5:
					System.out.println("****************************************");
					System.out.println("Kac adet istersiniz");
					adet=scan.nextInt();
					kalem.adet_urun+=adet;
					sepetteki_urun = new SepettekiUrun(kalem, adet);
					sepetteki_urun.setAdet(adet);
					sepetim.urunEkle(sepetteki_urun, kalem);
					break;

				default:
					break;
				}
				
				break;
			case 2:
				System.out.println("****************************************");
				System.out.println("*Toplam Ucret Kismina Hosgeldiniz	*");
				System.out.println("*Suana Kadar Olan Harcaman:"+sepetim.sepet_harcamasi+"		*");
				System.out.println("****************************************");
				break;
			case 3:
				System.out.println("Uygulamayi Kullandiginiz Icin Tesekkurler");
				System.out.println("HOSCAKALIN");
				System.exit(0);
				break;
			default:
				break;
			}
			Thread.sleep(1000);
		}
		
		
	}
	public static int AnaEkranGoruntusu(){
		/*
		 * Ilk acilis goruntusu
		 */
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("****************************************");
		System.out.println("* NE YAPMAK ÝSTERSÝNÝZ?			*");
		System.out.println("* 0)Alisveris Sepetini Goster		*");
		System.out.println("* 1)Sepetine Yeni Urun Ekle		*");
		System.out.println("* 2)Toplam Harcamami Goster		*");
		System.out.println("* 3)Cikis				*");
		System.out.println("****************************************");
		System.out.println();
		System.out.print("Lutfen Secimini Giriniz: ");
		int anamenu_secim = scan.nextInt();
		return anamenu_secim;
	}

	
}
