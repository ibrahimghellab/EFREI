package exo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class exo1 {
    public static void main(String[] args) {
        System.out.println("Hello from exo2.exo1!");

        String databaseUrl = "jdbc:mysql://localhost:3306/bdtpjava";
        String username = "root";
        String password = "root";
        System.out.println("Database URL: " + databaseUrl);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        try {
            Connection c = DriverManager.getConnection(
                    databaseUrl,
                    username,
                    password);
            Statement stmnt = c.createStatement();
            ResultSet rs = stmnt.executeQuery("SELECT * from PROGRAMMEUR");
            while (rs.next()) {
                System.out.println("NOM: " + rs.getString("NOM") +
                        ", PRENOM: " + rs.getString("PRENOM") +
                        ", ANNAISSANCE: " + rs.getInt("ANNAISSANCE") +
                        ", SALAIRE: " + rs.getInt("SALAIRE") +
                        ", PRIME : " + rs.getInt("PRIME") +
                        ", PSEUDO: " + rs.getString("PSEUDO"));
            }
        } catch (Exception e) {
            e.printStackTrace();

        }


    }
}
