	import java.sql.*;
	import java.util.Scanner;

	public class jdbc_crud {
		
		static int sid;
		static String fname,Lname,email;
		static long mobile;
		
		public static Connection create_connection() {
			Connection conn = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
			}catch(Exception e) {
				e.printStackTrace();
			}
			return conn;
		}
		public static void insertdata() throws SQLException{
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Your First Name : ");
			fname = sc.next();
			System.out.print("Enter Your Last Name : ");
			Lname = sc.next();
			System.out.print("Enter E-mail : ");
			email = sc.next();
			System.out.print("Enter mobile no : ");
			mobile = sc.nextLong();
			Connection conn = create_connection();
			String sql = "insert into student(fname,Lname,email,mobile) values (?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, fname);
			pst.setString(2, Lname);
			pst.setString(3, email);
			pst.setLong(4, mobile);
			pst.executeUpdate();
			System.out.println("Data inserted Successfully");
		}
		public static void searchdata() throws SQLException{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the student id : ");
			int sid = sc.nextInt();
			Connection conn = create_connection();
			String sql = "select * from student where sid = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, sid);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				
			System.out.println("First name : "+rs.getString("fname"));
			System.out.println("Last name : "+rs.getString("Lname"));
			System.out.println("Email : "+rs.getString("email"));
			System.out.println("mobile : "+rs.getString("mobile"));
			
			}else {
				System.out.println("Student ID not Registered :)");
				
			}
			
		}
		public static void updateData() throws SQLException{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the student id : ");
			int sid = sc.nextInt();
			Connection conn = create_connection();
			String sql = "select * from student where sid = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, sid);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				
			System.out.println("First name : "+rs.getString("fname"));
			System.out.println("Last name : "+rs.getString("Lname"));
			System.out.println("Email : "+rs.getString("email"));
			System.out.println("mobile : "+rs.getString("mobile"));
			System.out.println("**********************************************************************");
			System.out.print("Enter New First Name : ");
			fname=sc.next();
			System.out.print("Enter New Last Name : ");
			Lname=sc.next();
			System.out.print("Enter New email-id : ");
			email=sc.next();
			System.out.print("Enter New Mobile : ");
			mobile=sc.nextLong();
			
			String sql1 = "update student set fname=?,Lname=?,email=?,mobile=? where sid =?";
			PreparedStatement pst1 = conn.prepareStatement(sql1);
			pst1.setString(1, fname);
			pst1.setString(2, Lname);
			pst1.setString(3, email);
			pst1.setLong(4, mobile);
			pst1.setInt(5, sid);
			pst1.executeUpdate();
			System.out.println("Data updated Successfully");
			
			
			
			}
			else {
				System.out.println("Student Id is not registered :) ");
			}
			
			
			
		}
		public static void deletedata() throws SQLException {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the student id : ");
			int sid = sc.nextInt();
			Connection conn = create_connection();
			String sql = "select * from student where sid = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, sid);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				String sql1 = "delete from student where sid = ?";
				PreparedStatement pst1 = conn.prepareStatement(sql1);
				pst1.setInt(1, sid);
				pst1.executeUpdate();
				System.out.println("Data deleted Succesfully");
			}
			else {
				System.out.println("Student Id Not Registered");
			}
			
		}
		
		
		public static void main(String[] args) throws SQLException{
			do {

				System.out.println("**********************************************************************");
				System.out.println("1.Insert");
				System.out.println("2.Search");
				System.out.println("3.Update");
				System.out.println("4.Delete");
				System.out.println("5.Exit");
				System.out.println("**********************************************************************");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Your Choice : ");
				int choice = sc.nextInt();
				System.out.println("**********************************************************************");
				if(choice == 1) {
					insertdata();
				}
				else if(choice == 2){
					searchdata();
				}
				
	            else if(choice == 3){
					updateData();
				}
	            else if(choice == 4){
					deletedata();
				}
	            else if(choice == 5){
	            	System.out.println("Thank you For using our Service");
	            	
	            	System.out.println("**********************************************************************");
	            	break;
					
				}
				
				
				
				
			}while(true);

}
	
		

}
