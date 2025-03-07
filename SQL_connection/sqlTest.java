import java.sql.Connection;

public class sqlTest {
    public static void main(String[] args) {
        Connection connection = MySQLConnection.getConnection();
    }
}
