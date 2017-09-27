package Lt_duomenis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Agurkai {
    public static final String DB_HOST_NAME = "jdbc:mysql://localhost:3306/kcs";
    public static final String DB_USER_NAME = "root";
    public static final String DB_PASSWORD = "";

    private Connection _connection;

    public Agurkai() {
        try {

            Class.forName("com.mysql.jdbc.Driver");

            _connection = DriverManager.getConnection(DB_HOST_NAME, DB_USER_NAME, DB_PASSWORD);

        } catch (Exception klaida) {
            System.out.println("Sum ting wong" + klaida.getLocalizedMessage());
        }

    }

    public void simplePrintSELECT(String uzklausa) {
        try {
            System.out.println("++++++++++++++++++++++++++++++++");
            System.out.println("uzklausa");
            System.out.println("++++++++++++++++++++++++++++++++");

            Statement statement = _connection.createStatement();

            ResultSet resultSet = statement.executeQuery(uzklausa);

            int columCount = resultSet.getMetaData().getColumnCount();

            while (resultSet.next()) {

                for (int i = 1; i <= columCount; i++) {
                    System.out.print(resultSet.getString(i));
                    System.out.print("\t\t");
                }
                System.out.print("\n");

            }
            System.out.println("================================");

        } catch (Exception klaida) {
            System.out.println(klaida.getMessage());
        }
    }

    public void simpleUpdate(String uzklausa) {
        try {
            Statement statement = _connection.createStatement();
            statement.execute (uzklausa);
        }catch (Exception klaida){
            System.out.println(klaida.getMessage());
        }
    }

}
