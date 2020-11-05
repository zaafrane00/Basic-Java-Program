/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrateur
 */
public class Personne {
     protected String nom;
     protected String prenom;
     protected Adresse adress;

    public Personne(String nom, String prenom, Adresse adress) {
        this.nom = nom;
        this.prenom = prenom;
        this.adress = adress;
    }
    
        public Personne(Personne p) {
        this.nom = p.nom;
        this.prenom = p.prenom;
        this.adress = p.adress;
    }
    
    public String toString(){
        return "nom: "+nom+" prenom "+prenom+" adress "+adress;
    }
     
}
