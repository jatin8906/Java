import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionExample {

    public static void main(String[] args) {

    	Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
      
   
    }
}
