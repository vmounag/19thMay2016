import java.sql.*;
public class MysqlCon {

	public static void main(String[] args) {
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","password" );
					System.out.println("connection established");
					Statement stmt=con.createStatement();
					stmt.executeUpdate("create table employee"+"(empid int not NULL,"+"name varchar(255),"+"PRIMARY KEY(empid))");
					System.out.println("table created");
					
					stmt.executeUpdate("insert into employee values(1,'mouna'),(2,'anu'),(3,'prati'),(4,'ravali')");
					System.out.println("inserted suscessfully");
					
					
					
					ResultSet rs=stmt.executeQuery("select * from employee");
					while(rs.next())
					{
					System.out.println(rs.getInt("empid")+ rs.getString("name"));
					}
					int a=stmt.executeUpdate("delete from employee where empid in (3,4)");
					System.out.println(a+ "deleted ");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ClassNotFoundException e)
		{ System.out.println(e.getMessage());
			
		}
		finally{
			try{
					
			con.close();
		}
			catch(SQLException e)
		{ System.out.println(e.getMessage());
			
		}
		}
			
		}
	}




