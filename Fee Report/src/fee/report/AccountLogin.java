package fee.report;
import java.sql.*;
public class AccountLogin {
    public static String qString(String nString, String pString ){
    
        try {
            Class.forName("org.h2.Driver");
Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","123");
  PreparedStatement st = con.prepareStatement("Select name, pass from admin where name=?");
  st.setString(1, nString);
ResultSet rs;
rs = st.executeQuery();
String name1=" ", pass1="";
while(rs.next()){
name1=rs.getString("nString");
pass1=rs.getString("pString");
} 

con.close();
   
        } catch (Exception e) {
        }
 
    return null;
    }
}
