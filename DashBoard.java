import java.util.Scanner;

public class DashBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO KIDNEY TRANSPLANT CENTER");
		System.out.println("1-register as a donor");
		System.out.println("2-register as a receiver");
		int ch=sc.nextInt();
		switch(ch){
			case 1:
				//take input info
				//insert donor into db
				//show nearest hospitals
				Donor_info d1 = new Donor_info();
				d1.AcceptInfo();
				
				break;
			case 2:
				
				break;
				
		}
		

	}
}