import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookDB {
    public static int save(String callno,String name,String author,String publisher,int quantity){
	int status=0;
	try{
		Connection con=DB.getConnection();
                System.out.println("a");
		PreparedStatement ps=con.prepareStatement("insert into books(callno,name,author,publisher,quantity) values(?,?,?,?,?)");
		ps.setString(1,callno);
		ps.setString(2,name);
		ps.setString(3,author);
		ps.setString(4,publisher);
		ps.setInt(5,quantity);
		status=ps.executeUpdate();
		con.close();
                System.out.println("b");
	}catch(Exception e){System.out.println(e);}
	return status;
    }
}