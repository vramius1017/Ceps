/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cepsinm.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Mar.BELTRAN
 */
public class DBCategorie {

    public static List<Region> getAll() {
        List<Region> regions = new ArrayList<>();//variable locale
      
        try {
            String query = "SELECT  CodeReg, Libelle, PopulationReg2018 "
                    + "FROM region "
                    + "ORDER BY PopulationReg2018 DESC ";
        // La requête est executée et le résultat est placé dans un ResultSet
            ResultSet resultSet = DBConnect.connect().createStatement().
                    executeQuery(query);
            while (resultSet.next()) {//on parcourt le resulSet
                Region r = new Region();
                r.setCodeReg(resultSet.getInt(1));
                r.setLibelle(resultSet.getString(2));
                r.setPopulationReg2018(resultSet.getInt(3)); 
                regions.add(r);
            }
        } catch (SQLException ex) {
        } finally {
            return regions;  // on renvoie la liste des regions extraites de la table
        }
    }
    
    public static Region get(int code) {
        Region region = new Region();//variable locale
      
        try {
            String query = "SELECT  CodeReg, Libelle, PopulationReg2018 "
                    + "FROM region WHERE codeReg=" + code 
                    + " ORDER BY PopulationReg2018 DESC ";
        // La requête est executée et le résultat est placé dans un ResultSet
            ResultSet resultSet = DBConnect.connect().createStatement().
                    executeQuery(query);
            while (resultSet.next()) {//on parcourt le resulSet
                region.setCodeReg(resultSet.getInt(1));
                region.setLibelle(resultSet.getString(2));
                region.setPopulationReg2018(resultSet.getInt(3)); 

            }
        } catch (SQLException ex) {
        } finally {
            return region;  // on renvoie la liste des regions extraites de la table
        }
    }
}
