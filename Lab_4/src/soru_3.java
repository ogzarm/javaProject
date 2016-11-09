
public class soru_3 {

	
	public static void main(String[] args) {
		int one = 0,two = 0,third = 0,four = 0,five = 0,six = 0,number;
		
		for(int i=0;i<2100;i++){
			number = (int)(Math.random()*21+1);
			switch (number) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				one++;
				break;
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
				two++;
				break;
			case 12:
			case 13:
			case 14:
			case 15:
				third++;
				break;
			case 16:
			case 17:
			case 18:
				four++;
				break;
			case 19:
			case 20:
				five++;
				break;
			case 21:
				six++;
				break;
			}
			
		}
		System.out.println("1 gelme sayisi: " + one);
		System.out.println("2 gelme sayisi: " + two);
		System.out.println("3 gelme sayisi: " + third);
		System.out.println("4 gelme sayisi: " + four);
		System.out.println("5 gelme sayisi: " + five);
		System.out.println("6 gelme sayisi: " + six);
		
	}

}
