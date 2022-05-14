import java.sql.Connection;
import java.util.*;
class User_exception extends Exception{
	public User_exception(String s)
	{
		super(s);
	}
}
public class Donor_info {


	String donarName;
	String donarBloodGroup;
	String birthDate;
	char gender;
	double weight;
	String organ;
	String addr;
	long contactNum;
	Scanner sc=new Scanner(System.in);
	Area user_a ;
	Donor d;
	boolean valid_w = false;
	boolean valid_age = false;
	void AcceptInfo()
	{
	    boolean correct = false;
	    while(!correct) {
	    	try {
				System.out.println("Enter Name :");
				donarName=sc.next();
				if(donarName.isEmpty()) {
					throw new User_exception("Please enter valid name");
				}
				else {
					correct = true;
				}

			} catch (User_exception e) {
				System.out.println(e.getMessage());
			}
	    }
		correct = false;
		while(!correct) {
			 try {
					System.out.println("Enter Blood Group :\n1.A+\n2.A-\n3.B+\n4.AB+\n5.B-\n6.O+\n7.AB-\n8.O-");
					int ch = sc.nextInt();
					switch(ch) {
					case 1:
						donarBloodGroup = "A+";
						break;
					case 2:
						donarBloodGroup = "A-";
						break;
					case 3:
						donarBloodGroup = "B+";
						break;
					case 4:
						donarBloodGroup = "AB+";
						break;
					case 5:
						donarBloodGroup = "B-";
						break;
					case 6:
						donarBloodGroup = "O+";
						break;
					case 7:
						donarBloodGroup = "AB-";
						break;
					case 8:
						donarBloodGroup = "O-";
						break;
					}
					
					if(donarBloodGroup.isEmpty())
					{
						throw new User_exception("Please Enter valid Blood Group");
					}
					else {
						correct = true;
					}

				} catch (User_exception e1) {
					System.out.println(e1.getMessage());
				}
		 }
		correct = false;
		while(!correct) {
			try {
				System.out.println("Enter Birth  year :");
				birthDate=sc.next();
				int date=Integer.parseInt(birthDate);
				if(2022-date<18)
				{
					valid_age = false;
					break;
				}
				else if (2022-date<0) {
					throw new User_exception("Enter valid age ");
				}
				else {
					valid_age = true;
					correct = true;
				}
			} catch (User_exception e2) {
				System.out.println(e2.getMessage());
			}
		}
		if (valid_age) {
			correct = false;
			while(!correct) {
				try {
					System.out.println("Enter Gender (M) or (F) :");
					gender=sc.next().charAt(0);
					System.out.println(gender=='F');
					if(gender == 'F' || gender=='M')
					{
						correct = true;
						
					}
					else {
						
						throw new User_exception("Enter valid Gender");
					}
				} catch (User_exception e3) {
					System.out.println(e3.getMessage());
				}
			}
			
			
			correct = false;
			while(!correct) {
				try {
					System.out.println("Enter Weight :");
					weight=sc.nextDouble();
					if(weight<0)
					{
						throw new User_exception("You are Under Weight, Not eligible to donate");
					}
					else if(weight<50 || weight>100) {
						break;
					}
					else {
						valid_w = true;
						correct = true;
					}
				} catch (User_exception e4) {
					System.out.println(e4.getMessage());
				}
			}
			
			if(valid_w) {
				correct = false;
				while(!correct) {
					try {
						System.out.println("Enter organ :\n1.Kidney\n2.Liver");
						int ch = sc.nextInt();
						switch(ch) {
						case 1:
							organ = "Kidney";
							break;
						case 2:
							organ = "Liver";
							break;
						
						}
						if(organ.isEmpty())
						{
							throw new User_exception("Please enter a valid option.");
						}
						else {
							correct = true;
						}
					} catch (User_exception e5) {
						System.out.println(e5.getMessage());
					}
				}
				
				correct = false;
				while(!correct) {
					try {
						System.out.println("Enter Area:\n1.Kothrud\n2.Katraj\n3.Hadapsar\n4.Kondhwa\n5.Swargate");
						
						int ch = sc.nextInt();
						switch(ch) {
						case 1:
							user_a = new Area("Kothrud",104);
							break;
						case 2:
							user_a = new Area("Katraj",101);
							break;
						
						case 3:
							user_a = new Area("Hadapsar",102);
							break;
						case 4:
							user_a = new Area("Kondhwa",103);
							break;
						case 5:
							user_a = new Area("Swargate",105);
							break;
						}
						if(user_a==null)
						{
							throw new User_exception("Enter valid option");
						}
						else {
							correct = true;
						}
					} catch (User_exception e6) {
						System.out.println(e6.getMessage());
					}
				}
				
				correct = false;
				while(!correct) {
					try {
						System.out.println("Enter Contact number :");
						contactNum=sc.nextLong();
						if(Long.toString(contactNum).length()<10 || Long.toString(contactNum).length()>10 )
						{
							throw new User_exception("Please enter correct phone no.");
						}
						else {
							correct = true;
						}
					} catch (User_exception e7) {
						System.out.println(e7.getMessage());
					}
				}
				
				/*
				 * Donor(String donorName, String donorBloodGroup, String birthDate, char gender, double weight, String org,
					Area areaOfDonor, long contactNo)
				 */
				d = new Donor(donarName, donarBloodGroup ,birthDate,gender, weight,organ,user_a,contactNum);
			}
		}
		
		if (!valid_age || !valid_w) {
			System.out.println("Sorry you are not elligible for organ donation");
		}
		

	}
   
	public static void main(String[] args) {
		
		Donor_info di = new Donor_info();
		di.AcceptInfo();
		System.out.println(di.d.getDonorName());
		System.out.println(di.d.getAreaOfDonor());
	}

}
