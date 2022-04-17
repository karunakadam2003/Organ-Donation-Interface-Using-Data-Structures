
import java.util.*;
import java.sql.*;

public class General_info{
	 Scanner sc = new Scanner(System.in);
	 static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	 static final String DB_URL = "jdbc:mysql://localhost:3306/OrganDonation";
	 static final String USER = "root";
	 static final String PASS = "priyanka2240";
	 Connection con;
	 Set <Integer> hospitals = new HashSet<Integer>();
	 ArrayList<Hospital> all_hospitals = new ArrayList<Hospital>();
	 ArrayList<Integer> elligible_hospitals = new ArrayList<Integer>(); //list of hospital codes having at least one receiver
	 int[][] adjMat;
	 int n;
	 Hospital ref []; //Array to remember index numbers

	 
	 void establish_connection(){
		 try {
		   Class.forName(JDBC_DRIVER);
		   con=DriverManager.getConnection(DB_URL,USER,PASS);
		 }
		 catch(ClassNotFoundException e) {
			 e.printStackTrace();
		 }
		 catch(SQLException e) {
		     System.out.println("Not found");
		     e.printStackTrace();
		 }
	 }
	 void extract_allhospital() {
		 try {
			 String query = "select * from Hospital";
			 PreparedStatement preparedStmt1;
			 preparedStmt1 = con.prepareStatement(query);
			 ResultSet rs = preparedStmt1.executeQuery(query);

			 while(rs.next()) {
				 int h_code = rs.getInt("hospitalCode");
				 String h_name = rs.getString("hospitalName");
				 int area_code = rs.getInt("areaCode");
				 int city_code = rs.getInt("cityCode");
				 Hospital h = new Hospital(h_code,h_name,area_code,city_code);
				 all_hospitals.add(h);
			 }

			
			 
		 }
		 catch(SQLException e) {
		     System.out.println("Not found");
		     e.printStackTrace();
		 }
	 }
	 void createUsingAdjMat()
		{
			int i =0;
			n = all_hospitals.size();
			adjMat = new int [n][n];
			ref = new Hospital [n];
			for(i=0;i<n;i++) {
				ref[i] = all_hospitals.get(i);
			}
			try {
				PreparedStatement preparedStmt1;
				
				String query = "select * from Hospital_edges";
				preparedStmt1 = con.prepareStatement(query);
				ResultSet rs = preparedStmt1.executeQuery(query);
				while(rs.next()) {
					 int h1_code = rs.getInt("Hospital1_code");
					 int h2_code = rs.getInt("Hospital2_code");
					 int dist= rs.getInt("distance");
					 addedge(h1_code,h2_code,dist);
					 addedge(h2_code,h1_code,dist);
				 }
			}
			 catch(SQLException e) {
			     System.out.println("Not found");
			     e.printStackTrace();
			 }
			
		}
	 
	   void addedge(int h1, int h2,int d) {
			int i =0,firsthospital=0,secondhospital=0;
			for (i=0;i<n;i++) {
				if (ref[i].getHospitalCode() == h1) {
					firsthospital = i;
				}
				else if (ref[i].getHospitalCode()== h2) {
					secondhospital = i;
				}
			}
			adjMat[firsthospital][secondhospital]=d;
		}
	   
	   void displayAdjMat() {
			int i =0,j=0;
			for (i=0;i<n;i++) {
				System.out.println();
				for (j=0;j<n;j++) {
					System.out.print(adjMat[i][j]+" ");
				}
			}
		}
	   
	   void elligible_hospitals() { //hospitals having at least one receiver
		   try {
				 String query = "select count(Hospital_reg),hospital_reg from Receiver group by Hospital_reg";
				 PreparedStatement preparedStmt1;
				 preparedStmt1 = con.prepareStatement(query);
				 ResultSet rs = preparedStmt1.executeQuery(query);

				 while(rs.next()) {
					 int h_code = rs.getInt("Hospital_reg");
					 elligible_hospitals.add(h_code);
				 }
				 
			 }
			 catch(SQLException e) {
			     e.printStackTrace();
			 }
	   }
}
