 
package DataAnalyticsHub;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author 
 */
public class database {
    
    public static Connection connectDb(){
        
        try{
        
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection connect = 
                DriverManager.getConnection("jdbc:mysql://localhost/db_analytics_hub?useSSL=false&verifyServerCertificate=false", "root", "vanshvansh1!");
            
            return connect;
            
        }catch(Exception e){e.printStackTrace();} 
        
        return null;
    }
    
}
