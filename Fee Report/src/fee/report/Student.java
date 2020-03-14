package fee.report;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Student {
    public  static  String query(String id,String name, String email, String course ,String fees ,
            String paid ,String due,String add,String city ,String state ,String country ,String contact){
        String qr="insert into Student values (?,?,?,?,?,?,?,?,?,?,?,?)";
 try{
       Class.forName("org.h2.Driver");
Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","123");
   PreparedStatement st = con.prepareStatement(qr);
   st.setString(1, id);
   st.setString(2, name);
   st.setString(3, email);
   st.setString(4, course);
   st.setString(5, fees);
   st.setString(6, paid);
   st.setString(7, due);
   st.setString(8, add);
   st.setString(9, city);
   st.setString(10, state);
   st.setString(11, country);
 st.setString(12, contact);
   st.executeUpdate();
   con.close();
   
   }
     catch(Exception e){
     
         System.out.println(e); 
     }       
        return null;
  
    
    
    
    }
    
}
