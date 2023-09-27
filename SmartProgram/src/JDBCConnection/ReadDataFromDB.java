package JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReadDataFromDB {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///SmartProgram","root","1234");
		
		PreparedStatement ps= con.prepareStatement("select *from register");
		 ResultSet rs=ps.executeQuery();
		 while(rs.next()) {
			String name1=rs.getString("name");
			System.out.println("Name "+name1);
			String email1=rs.getString("email");
			System.out.println("Email "+email1);
			String city1=rs.getString("city");
			System.out.println("City "+city1);
			String phone1=rs.getString("phone");
			System.out.println("Phone "+phone1);
			String gender1=rs.getString("gender");
			System.out.println("Gender "+gender1);
			System.out.println("----------------------------");
			
			//System.out.println(name1+,+email1+,+city1+,+phone1+,+gender);
			
		 }
		ps.close();
	}

}
