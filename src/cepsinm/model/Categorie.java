/*
 * Correspondant au premier niveau de sélectionCorrespondant au premier niveau 
 * de sélection.
 */
package cepsinm.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author mvbag
 */
public class Categorie {
    private SimpleIntegerProperty id;
    private SimpleStringProperty charac;
    private SimpleStringProperty code;

    public Categorie() {//constructeur par défaut
        this.id = new SimpleIntegerProperty ();
        this.charac = new SimpleStringProperty();
        this.code = new SimpleStringProperty();
    }

    public Categorie(int id, String charac, String code) {
        this.id = new SimpleIntegerProperty(id);
        this.charac = new SimpleStringProperty(charac);
        this.code = new SimpleStringProperty(code);
    }

    public int getid() {
        return this.id.get();
    }

    public void setid(int id) {
        this.id.set(id);
    }

    public String getcharac() {
        return this.charac.get();
    }

    public void setcharac(String charac) {
        this.charac.set(charac);
    }

    public String getcode() {
        return this.code.get();
    }

    public void setcode(String code) {
        this.code.set(code);
    }

    @Override
    public String toString() {
        return "Categorie{" + "id=" + id + ", charac=" + charac + ", code=" + code + '}';
    }
   
}
