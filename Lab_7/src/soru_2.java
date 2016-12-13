import java.util.Scanner;


public class soru_2 {

	public static void main(String[] args) {
		int n;
		double temp;//temporary variable for sorting
		boolean degisim;
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir N degeri giriniz: ");
		n = scan.nextInt();
		System.out.println("10-100 arasinda(100 dahil degil) "+n+" adet sayi uretildi...");
		//creating array of rasgele_sayi
		double[] rastgele_sayi = new double[n];
		
		for(int i=0;i<n;i++){
			rastgele_sayi[i]=10+(Math.random()*90);
		}
		
		for(int i=0;i<n;i++){
			System.out.println(rastgele_sayi[i]);
		}
		BubbleSort(rastgele_sayi);
		System.out.println("Siralama yapiliyor...");
		for(int i=0;i<n;i++){
			System.out.println(rastgele_sayi[i]);
		}
		
	

	}
	public static void BubbleSort( double [ ] num )
	{
	    
	     boolean flag = true;   // set flag to true to begin first pass
	     double temp;   //holding variable

	     while ( flag )
	     {
	            flag= false;    //set flag to false awaiting a possible swap
	            for( int j=0;  j < num.length -1;  j++ )
	            {
	                   if ( num[ j ] > num[j+1] )   // change to > for ascending sort
	                   {
	                           temp = num[ j ];                //swap elements
	                           num[ j ] = num[ j+1 ];
	                           num[ j+1 ] = temp;
	                          flag = true;              //shows a swap occurred  
	                  } 
	            } 
	      } 
	} 
}