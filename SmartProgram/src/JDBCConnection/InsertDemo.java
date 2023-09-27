package JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {

	public static void main(String[] args) throws Exception {
		
		String name="Kanhaiya";
		String email="kanhaiya1232@gmail.com";
		String city="Bihar Sharif";
		String phone="8928587400";
		String gender="Male";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql:///SmartProgram","root","1234");
		
		//PreparedStatement ps=con.prepareStatement("insert into register values('Shuruchi Singh','shuruchi0012@gmail.com','Bihar Sharif','8912500544','Female')");
		//PreparedStatement ps=con.prepareStatement("insert into register values('"+name+"','"+email+"','"+city+"','"+phone+"','"+gender+"')");
		  PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, city);
		ps.setString(4, phone);
		ps.setString(5, gender);
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("Success");
		}else {
			System.out.println("Failed");
		}
		ps.close();
	}

}
