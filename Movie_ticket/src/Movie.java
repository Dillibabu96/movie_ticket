
import java.util.*;

public class Movie {
	public int[][] seat=new int[6][8];
	static Scanner sc = new Scanner(System.in);
	public void book() {
		int option=1;
		while(option!=0){
			System.out.print("Enter your row and column");
			int row= sc.nextInt();
			int column =sc.nextInt();
			if(seat[row][column]==0) {
				seat[row][column] = 1;
				System.out.println("ticket booked successfuly.");
				option=0;
			}
			else {
				System.out.println("seat already filled.");
				option=0;
			}
			
			}
		}
	public void bookFront() {
			int f = 0;
			for(int i =0;i<=6-1;i++) {
				for(int j=0;j<=8-1;j++) {
					if(f==1) {
						break;
					}
					if(seat[i][j]==0) {
						System.out.println("seat booked seat no: "+(i+1)+" "+(j+1));
						seat[i][j]=1;
						f++;
					}
					else {
						if(i==5&&j==7) {
							System.out.println("seat are fulled.");	
						}
					}
				}
				if(f==1) {
					break;
				}
			}
	}
	public void bookBack() {
		int f = 0;
		for(int i =5;i>=0;i--) {
			for(int j=6;j>=0;j--) {
				if(f==1) {
					break;
				}
				if(seat[i][j]==0) {
					System.out.println("seat booked seat no: "+(i)+" "+(j));
					seat[i][j]=1;
					f++;
				}
				else {
					if(i==0&&j==0) {
						System.out.println("seat are fulled.");
					}
				}
			}
			if(f==1) {
				break;
			}
		}
}
	public static void main(String[] args) {
		Movie ticket = new Movie();
		boolean n=true;
		while(n) {
			System.out.println("Book your seat press :1");
			System.out.println("Book your seat front :2");
			System.out.println("Book your seat back :3");
			System.out.println("exit :0");
			int option = sc.nextInt();
			switch(option) {
			case 1:	ticket.book();
					boolean i=true;
					while(i) {
						System.out.println("if u book another one press:1 or go main manu press=2 or press:0");
						option=sc.nextInt();
						if(option==1) {
							ticket.book();
						}
						else if(option==2) {
							i=false;
						}
						else {
							i=false;
							n=false;
							System.out.println("THANK YOU...");
						}
					}
					break;
			case 2: ticket.bookFront();
					boolean j=true;
					while(j) {
						System.out.println("if u book another one press:1 or go main manu press=2 or press:0");
						option=sc.nextInt();
						if(option==1) {
						ticket.bookFront();
						}
						else if(option==2) {
							j=false;
						}
						else {
							j=false;
							n=false;
							System.out.println("THANK YOU...");
						}
					}
					break;
			case 3:	ticket.bookBack();
					boolean k=true;
					while(k) {
						System.out.println("if u book another one press:1 or go main manu press=2 or press:0");
					option=sc.nextInt();
					if(option==1) {
						ticket.bookBack();
					}
					else if(option==2) {
						k=false;
					}
					else {
						k=false;
						n=false;
						System.out.println("THANK YOU...");
						}
					}
					break;
			default:
		        System.out.println("THANK YOU...");
		        n=false;
		        break;		
			}
		}

	}

}
