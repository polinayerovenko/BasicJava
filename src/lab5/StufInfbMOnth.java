package lab5;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class StufInfbMOnth {
    private static final String URL = "jdbc:h2:tcp://localhost/~/students";
    private static final String USER = "User";
    private static final String PASSWORD = "Password";

    public static void main(String[] args) {
        try {

            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            Scanner scanner = new Scanner(System.in);
            int birthMonth;


            do {
                System.out.print("Enter the birth month (1-12): ");
                birthMonth = scanner.nextInt();


                if (birthMonth < 1 || birthMonth > 12) {
                    System.out.println("Invalid month! Please enter a number between 1 and 12.");
                }
            } while (birthMonth < 1 || birthMonth > 12);


            String query = "SELECT * FROM students WHERE MONTH(\"Date of birth\") = ?\n";


            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, birthMonth);


            ResultSet resultSet = statement.executeQuery();


            boolean found = false;
            while (resultSet.next()) {
                found = true;
                String id = resultSet.getString("ID");
                String firstName = resultSet.getString("First name");
                String lastName = resultSet.getString("Second name");
                String patronymic = resultSet.getString("Patronymic");
                String birthdate = resultSet.getString("Date of birth");
                String bookNumber = resultSet.getString("Book number");
                System.out.println("ID: " + id);
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Patronymic: " + patronymic);
                System.out.println("Birthdate: " + birthdate);
                System.out.println("Book Number: " + bookNumber);
                System.out.println("-----------------------");
            }


            if (!found) {
                System.out.println("No students found for the specified birth month.");
            }


            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
