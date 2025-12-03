package exo2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActionsBD implements AutoCloseable {

    private final String url;
    private final String user;
    private final String pass;
    private Connection cnx;

    public ActionsBD(String url, String user, String pass) {
        this.url = url;
        this.user = user;
        this.pass = pass;
    }

    // Ouvrir la connexion
    public void open() throws SQLException {
        if (cnx == null || cnx.isClosed()) {
            cnx = DriverManager.getConnection(url, user, pass);
        }
    }

    // Fermer la connexion
    @Override
    public void close() {
        try {
            if (cnx != null && !cnx.isClosed()) cnx.close();
        } catch (SQLException e) {
            System.out.println("Erreur lors de la fermeture de la connexion : " + e.getMessage());
        }
    }

    // Récupérer tous les programmeurs
    public List<Programmeur> getProgrammeurs() {
        List<Programmeur> liste = new ArrayList<>();
        String sql = "SELECT NOM, PRENOM, ANNAISSANCE, SALAIRE, PRIME, PSEUDO FROM programmeur";

        try (PreparedStatement ps = cnx.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                String nom = rs.getString("NOM");
                String prenom = rs.getString("PRENOM");
                int an = Integer.parseInt(rs.getString("ANNAISSANCE"));
                int salaire = Integer.parseInt(rs.getString("SALAIRE"));
                int prime = Integer.parseInt(rs.getString("PRIME"));
                String pseudo = rs.getString("PSEUDO");

                Programmeur p = new Programmeur(nom, prenom, an, salaire, prime, pseudo);
                liste.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la récupération : " + e.getMessage());
        }
        return liste;
    }

    // Récupérer les programmeurs dont le nom n’est pas celui passé en paramètre
    public List<Programmeur> getProgrammeursNomDifferentDe(String nomExclu) {
        List<Programmeur> liste = new ArrayList<>();
        String sql = "SELECT NOM, PRENOM, ANNAISSANCE, SALAIRE, PRIME, PSEUDO " +
                "FROM programmeur WHERE UPPER(NOM) <> UPPER(?)";

        try (PreparedStatement ps = cnx.prepareStatement(sql)) {
            ps.setString(1, nomExclu);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    String nom = rs.getString("NOM");
                    String prenom = rs.getString("PRENOM");
                    int an = Integer.parseInt(rs.getString("ANNAISSANCE"));
                    int salaire = Integer.parseInt(rs.getString("SALAIRE"));
                    int prime = Integer.parseInt(rs.getString("PRIME"));
                    String pseudo = rs.getString("PSEUDO");

                    Programmeur p = new Programmeur(nom, prenom, an, salaire, prime, pseudo);
                    liste.add(p);
                }
            }

        } catch (SQLException e) {
            System.out.println("Erreur lors de la récupération filtrée : " + e.getMessage());
        }
        return liste;
    }
}
