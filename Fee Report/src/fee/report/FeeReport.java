package fee.report;
import java.sql.*;
public class FeeReport {
    public static String query( String nString,String pString,String eString, String cString)  {
        String qr="insert into admin values (?,?,?,?)";
    
   try{
       Class.forName("org.h2.Driver");
Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","123");
   PreparedStatement st = con.prepareStatement(qr);
   st.setString(1, nString);
   st.setString(2, pString);
   st.setString(3, eString);
   st.setString(4, cString);
   st.executeUpdate();
   con.close();
   
   }
     catch(Exception e){
     
         System.out.println(e); 
     }       
        return null;
        
    }
}

       

