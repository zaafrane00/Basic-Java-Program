/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrateur
 */
public class Compte {
    private Personne person;
    private double solde;
    private int numeroCompte;

    public Compte(Personne person, double solde, int numeroCompte) {
        this.person = new Personne(person);
        this.solde = solde;
        this.numeroCompte = numeroCompte;
    }
    
    public void crediter(double x){
        this.solde+=x;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }
    
    public void debiter(double x){
           this.solde-=x;
    }
    
    public double getSolde(){
        return this.solde;
    }
    
   public String toString(){
        return "person: "+person+" solde "+solde+" numeroCompte "+numeroCompte+"\n";
    }
     
}
