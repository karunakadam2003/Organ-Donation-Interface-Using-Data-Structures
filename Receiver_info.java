import java.util.Scanner;

public class Receiver_info {

	String receiverName;
	String receiverBloodGroup;
	String birthDate;
	char gender;
	double weight;
	String organ;
	String addr;
	long contactNum;
	int emergency;
	boolean correct;
	Scanner sc=new Scanner(System.in);
	Area user_r ;
	String hosp_name;
	
	boolean valid_w = false;
	boolean valid_age = false;
	void AcceptInfo()
	{
		boolean correct = false;
		while(!correct) {
			try {
				System.out.println("Enter Name :");
				receiverName=sc.next();
				if(receiverName.isEmpty()) {
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
					receiverBloodGroup = "A+";
					break;
				case 2:
					receiverBloodGroup = "A-";
					break;
				case 3:
					receiverBloodGroup = "B+";
					break;
				case 4:
					receiverBloodGroup = "AB+";
					break;
				case 5:
					receiverBloodGroup = "B-";
					break;
				case 6:
					receiverBloodGroup = "O+";
					break;
				case 7:
					receiverBloodGroup = "AB-";
					break;
				case 8:
					receiverBloodGroup = "O-";
					break;
				}

				if(receiverBloodGroup.isEmpty())
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
						throw new User_exception("You are Under Weight");
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
						System.out.println("Enter Hospital name where you are registered:\n1.Kothrud\n2.Katraj\n3.Hadapsar\n4.Kondhwa\n5.Swargate");

						int ch = sc.nextInt();
						switch(ch) {
						case 1:
							user_r = new Area("Kothrud",104);
							break;
						case 2:
							user_r = new Area("Katraj",101);
							break;

						case 3:
							user_r = new Area("Hadapsar",102);
							break;
						case 4:
							user_r = new Area("Kondhwa",103);
							break;
						case 5:
							user_r = new Area("Swargate",105);
							break;
						}
						if(user_r==null)
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

				try {
					System.out.println("Emergency (1 to 10):");
					emergency=sc.nextInt();
					if(emergency>10 || emergency<1)
					{
						throw new User_exception("Please Enter valid Emergency bit");
					}

				}catch(User_exception e8)
				{
					System.out.println(e8.getMessage());
				}

				/*
				 * Receiver(String receiverName, String receiverBloodGroup, String birthDate, char gender, double weight,
			Area areaOfReceiver, long contactNum, int emergency, boolean approvedReceiver)
				 */
				Receiver user=new Receiver(receiverName, receiverBloodGroup, birthDate, gender, weight, areaOfReceiver, contactNum,emergency,approvedReceiver);
			}
		}

		if (!valid_age || !valid_w) {
			System.out.println("Sorry you are not elligible ");
		}
	}
}

