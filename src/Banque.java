
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrateur
 */
public class Banque {
    private int id;
    private String nom;
    private int nbre_comptes=0;
    private Compte []comptes;
    
    public Banque(int id, String nom, int t) {
        this.id = id;
        this.nom = nom;
        comptes=new Compte[t];
    }
    
    
    int recherche(int num){
        for(int i=0; i<nbre_comptes; i++)
            if(comptes[i].getNumeroCompte()==num) return i;
        return -1;
    }
    
    public void ajoutCompte(Compte c){
         if(recherche(c.getNumeroCompte())>=0)
            System.out.println("this accound already exists");
        else{
            this.comptes[nbre_comptes++]=c;
        }
    }
     public void colturerCompte(Compte c){
         int pos=recherche(c.getNumeroCompte());
        if(pos>=0){
             this.comptes[pos]=this.comptes[nbre_comptes];
             this.comptes[nbre_comptes]=null;
             this.nbre_comptes--;
                }
        else{
             System.out.println("this accound doesn't exists");
        }
    }

    @Override
    public String toString() {
        String ch="";
        for(Compte c:comptes)
            if(c!=null)
                ch+="\n->"+c;
        return "Banque{" + "id=" + id + ", nom=" + nom + ", nbre_comptes=" + nbre_comptes + "\ncomptes=" + ch + '}';
    }

    public int getNbre_comptes() {
        return nbre_comptes;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }
    
    
    public void transfert(double montant,Compte c1,Compte c2){
       int cp1=recherche(c1.getNumeroCompte());
       int cp2=recherche(c2.getNumeroCompte());
        System.out.println(cp1);
        System.out.println(cp2);
        if(cp1>=0 && cp2>=0 ){ 
            if(cp1==cp2)
                System.out.println("les deux comptes sont les memes");
            else{
              c1.crediter(montant); 
              c2.debiter(montant);
              }
         }
        else
              System.out.println("un des deux comptes n'existe pas");
     
     }
    
}
