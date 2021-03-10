/*
 Permettre faire le connection DB XXXXXXX
 */
package cepsinm.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mvbag
 */
public class DBConnect {

    public static Connection connect() {
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbinm", "root", "");
            System.out.println("Connexion réussie !");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return conn;
    }

}
