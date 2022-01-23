import java.sql.*;

public class Main {

  public static void main(String[] args) throws ClassNotFoundException, SQLException {

    // new CardPayment();
    // new Homepage2();
  new Login( new IDAndPassword().getInfo());
    // new HomePage();
    // // new Signup();
   // new AddUser();

    String url = "jdbc:mysql://localhost:3306/group_project";

    Connection connection = DriverManager.getConnection(url, "root", "password");



  }
}
