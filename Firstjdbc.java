package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Firstjdbc {

	public Firstjdbc() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shamim","root","root");
			
			Statement stm=con.createStatement();
			stm.executeUpdate("delete from student_1 where id=98");
			 System.out.println("success");

//			PreparedStatement stm=con.prepareStatement("insert into student_1 values(?,?,?,?)");
//			
//			System.out.println("Enter your Name");
//			String name=sc.nextLine();
//			
//			System.out.println("Enter your id");
//			int id=sc.nextInt();
//			
//			sc.nextLine();
//			
//			System.out.println("Enter your email");
//			String email=sc.nextLine();
//			
//			
//			System.out.println("Enter your round");
//			int round=sc.nextInt();
//			
//			stm.setInt(1, id);
//			stm.setString(2, name);
//			stm.setString(3, email);
//			stm.setInt(4, round);
//		
//			stm.executeUpdate();
			System.out.println("success");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
