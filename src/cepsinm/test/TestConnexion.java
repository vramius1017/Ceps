/*
 * Permettre faire le preuve de connection a la DB Mysql/dbinm
 */
package cepsinm.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * @author mvbag
 */
public class TestConnexion {

    public static void main(String[] args) throws SQLException {
        try {
// Chargement de la classe du driver JDBC de MySQL
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Classe de driver introuvable " + ex.getMessage());
            System.exit(0);
        }
        Connection connexion = null;
        Statement instruction = null;
        ResultSet resultat = null;

// Ouverture de la connexion avec MySQL tournant sur la même machine
        try{
        connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbinm", "root", "");
        System.out.println("Connexion réussie ...");
        }catch(SQLException exc){
            System.out.println("Connexion echouée ..." + exc.getMessage());
//        System.out.println(p);
        // *************** Connexion *************//
//        Connection conn = DBConnect.connect(); //ok si connexion réussie
        }
    }

}
