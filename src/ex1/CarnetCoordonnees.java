/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Arrays;

/**
 *
 * @author Administrateur
 */
public class CarnetCoordonnees {
     private int id;
    private String nom;
    private int nbr_cordonnees=0;
    private Coordonnees []coordnnees;

    public CarnetCoordonnees() {
    }

    public CarnetCoordonnees(int id, String nom,int nbr) {
        this.id = id;
        this.nom = nom;
        this.coordnnees=new Coordonnees[nbr];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbr_cordonnees() {
        return nbr_cordonnees;
    }

    public void setNbr_cordonnees(int nbr_cordonnees) {
        this.nbr_cordonnees = nbr_cordonnees;
    }

    public String getCoordnnees() {
        return Arrays.toString(coordnnees);
    }
    
    public int recherche(int num){
        for(int i=0; i<nbr_cordonnees; i++)
            if(coordnnees[i].getID()==num) return i;
        return -1;
    }
     
    public void ajoutCordonne(Coordonnees c){
           if(recherche(c.getID())>=0)
            System.out.println("this accound already exists");
        else{
            this.coordnnees[nbr_cordonnees++]=c;
       }
    }
    
     public void recherche(String nom, String prenom){
        for(int i=0; i<nbr_cordonnees; i++)
            if(coordnnees[i].getNom().equals(nom) && coordnnees[i].getPrenom().equals(prenom)) {
                Coordonnees p=coordnnees[i];
                System.out.println(p);
                break;
            }else{
                System.out.println("n'existe pas");
            }
    }

              @Override
    public String toString() {
        String ch="";
        for(Coordonnees c:coordnnees)
            if(c!=null)
                ch+="\n->"+c;
               return "CarnetCoordonnees{" + "id=" + id + ", nom=" + nom + ", nbr_cordonnees=" + nbr_cordonnees + ", coordnnees=" + ch + '}';
    }

    public static void main(String[] args) {
        Coordonnees c1 = new Coordonnees(1,"hamza","zaafrane","telephone1110","adresse1110");
        Coordonnees c2 = new Coordonnees(2,"hamza","zaafrane","telephone00","adresse00");
         CarnetCoordonnees carnet=new CarnetCoordonnees(1,"nom",5);
         carnet.ajoutCordonne(c1);
         carnet.ajoutCordonne(c2);
         System.out.println(carnet);
        
         carnet.recherche("hamza","zaafrane");
    }
}

