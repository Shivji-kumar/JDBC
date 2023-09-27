package JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Updatedemo {

	public static void main(String[] args) throws Exception {
		String city="pune";
		String name="Gopal Singh";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///SmartProgram","root","1234");
		
		PreparedStatement ps= con.prepareStatement("update register set city=? where name=?");
		
		ps.setString(1,city);
		
		ps.setString(2, name);
		
		int c=ps.executeUpdate();
		if(c>0) {
			System.out.println("Update Success");
		}else
		{
			System.out.println("Updation Failed");
		}
		ps.close();
	}

}
