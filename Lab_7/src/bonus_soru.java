import java.util.Scanner;


public class bonus_soru {

	public static void main(String[] args) throws InterruptedException{
		int bolge_en,x,y;
		Scanner scan = new Scanner(System.in);
		System.out.print("Karantinaya alinacak bolgenin enini giriniz: ");
		bolge_en = scan.nextInt();
		System.out.println("Virus ilk hangi koordinata bulasti?");
		System.out.print("x: ");
		x=scan.nextInt()-1;
		System.out.print("y: ");
		y=scan.nextInt()-1;
		
		int[][] alan_dizisi = new int[bolge_en][bolge_en];
		int[][] alan_dizisi2 = new int[bolge_en][bolge_en];
		alan_dizisi[x][y]=1;
		copyArray(alan_dizisi2, alan_dizisi);
		
		//////////////////////////////////////
		displayArray(alan_dizisi);
		Thread.sleep(2000);
		System.out.println("2 gun sonra ...");
		findOne(alan_dizisi2,alan_dizisi);
		copyArray(alan_dizisi, alan_dizisi2);
		if(isEveryOne(alan_dizisi)==1){
			System.exit(0);
		}
		
		//////////////////////////////////////
		displayArray(alan_dizisi);
		Thread.sleep(2000);
		System.out.println("2 gun sonra ...");
		findOne(alan_dizisi2,alan_dizisi);
		copyArray(alan_dizisi, alan_dizisi2);
		if(isEveryOne(alan_dizisi)==1){
			System.exit(0);
		}
		
		//////////////////////////////////////
		displayArray(alan_dizisi);
		Thread.sleep(2000);
		System.out.println("2 gun sonra ...");
		findOne(alan_dizisi2,alan_dizisi);
		copyArray(alan_dizisi, alan_dizisi2);
		
		if(isEveryOne(alan_dizisi)==1){
			displayArray(alan_dizisi);
			System.exit(0);
		}
		//////////////////////////////////////
		displayArray(alan_dizisi);
		Thread.sleep(2000);
		System.out.println("2 gun sonra ...");
		findOne(alan_dizisi2,alan_dizisi);
		copyArray(alan_dizisi, alan_dizisi2);
		
		if(isEveryOne(alan_dizisi)==1){
			displayArray(alan_dizisi);
			System.exit(0);
		}
		//////////////////////////////////////
		displayArray(alan_dizisi);
		Thread.sleep(2000);
		System.out.println("2 gun sonra ...");
		findOne(alan_dizisi2,alan_dizisi);
		copyArray(alan_dizisi, alan_dizisi2);
		
		if(isEveryOne(alan_dizisi)==1){
			displayArray(alan_dizisi);
			System.exit(0);
		}
		//////////////////////////////////////
		displayArray(alan_dizisi);
		Thread.sleep(2000);
		System.out.println("2 gun sonra ...");
		findOne(alan_dizisi2,alan_dizisi);
		copyArray(alan_dizisi, alan_dizisi2);
		
		if(isEveryOne(alan_dizisi)==1){
			displayArray(alan_dizisi);
			System.exit(0);
		}
		//////////////////////////////////////
		displayArray(alan_dizisi);
		Thread.sleep(2000);
		System.out.println("2 gun sonra ...");
		findOne(alan_dizisi2,alan_dizisi);
		copyArray(alan_dizisi, alan_dizisi2);
		displayArray(alan_dizisi);
		if(isEveryOne(alan_dizisi)==1){
			displayArray(alan_dizisi);
			System.exit(0);
		}
		
}
	public static int isEveryOne(int[][] alan_dizisi){
		int zero=0;
		for(int i=0;i<alan_dizisi.length;i++){
			for(int j=0;j<alan_dizisi.length;j++){
				if(alan_dizisi[i][j]==0){
					zero=1;
				}
			}
		}
		if(zero==1){
			return 0;
		}
		else{
			return 1;
		}
	}
	public static void findOne(int[][] alan_dizisi2,int[][] alan_dizisi){

		for(int i=0;i<alan_dizisi.length-1;i++){
			for(int j=0;j<alan_dizisi.length-1;j++){
				if(alan_dizisi[i][j]==1){
					if(i>0){
						alan_dizisi2[i-1][j]=1;
					}
					if(i<alan_dizisi.length){
						alan_dizisi2[i+1][j]=1;
					}
					if(j<alan_dizisi.length){
						alan_dizisi2[i][j+1]=1;
					}
					if(j>0){
						alan_dizisi2[i][j-1]=1;
					}
				}
			}	
		}
		
	}
	public static void copyArray(int[][]dizi1,int[][]dizi2){
		for(int i=0;i<dizi1.length;i++){
			for(int j=0;j<dizi1.length;j++){
				dizi1[i][j]=dizi2[i][j];
			}
		}
	}
	
	public static void displayArray(int[][]dizi){
		for(int i=0;i<dizi.length;i++){
			for(int j=0;j<dizi.length;j++){
				System.out.print(dizi[i][j]+" ");
			}
			System.out.println();
		}
	}

}
