package SQLConnection;

import java.sql.SQLException;

public class sqlTest {
    public static void main(String[] args) throws SQLException {
       MySQLConnection.getConnection();

    // check if the connection is closed or not 
    //    if(MySQLConnection.getConnection().isClosed()){
    //     System.out.println("The connection is closed");
    //     return;
    //    }


    }
}
