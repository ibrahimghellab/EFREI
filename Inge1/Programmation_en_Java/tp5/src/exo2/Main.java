package exo2;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdtpjava", "root", "root");
        PreparedStatement ps = con.prepareStatement("SELECT NOM, PRENOM, ANNAISSANCE, SALAIRE, PRIME, PSEUDO FROM programmeur");
        ResultSet rs = ps.executeQuery();
        ListeProgrammeurs programmeurs = new ListeProgrammeurs();

        while (rs.next()) {
            String nom = rs.getString("NOM");
            String prenom = rs.getString("PRENOM");
            int an = Integer.parseInt(rs.getString("ANNAISSANCE"));
            int salaire = Integer.parseInt(rs.getString("SALAIRE"));
            int prime = Integer.parseInt(rs.getString("PRIME"));
            String pseudo = rs.getString("PSEUDO");

            Programmeur p = new Programmeur(nom, prenom, an, salaire, prime, pseudo);
            programmeurs.add(p);
        }
        System.out.println("Programmeurs avant filtrage :");
        for(Programmeur p : programmeurs.getData()){
            System.out.println(p);
        }

        ListeProgrammeurs programmeursFiltres = programmeurs.filtrerNomDifferentDe("Simpson");
        System.out.println("\nProgrammeurs après filtrage (nom différent de 'Simpson') :");
        for(Programmeur p : programmeursFiltres.getData()) {
            System.out.println(p);
        }

    }
}
