/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author Administrateur
 */
public class Coordonnees {
    public int id;
    private String nom;
    private String prenom;
    private String telephone;
    private String adresse;

    public Coordonnees(Coordonnees cor) {
                this.id = cor.id;
        this.nom = cor.nom;
        this.prenom = cor.prenom;
        this.telephone = cor.telephone;
        this.adresse = cor.adresse;
    }

    public Coordonnees() {
    }

    public Coordonnees(int x,String nom, String prenom, String telephone, String adresse) {
         this.id = x;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
  public int getID() {
        return this.id;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Coordonnees{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", adresse=" + adresse + '}';
    }

     
    
    
}
