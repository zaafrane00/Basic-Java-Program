/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrateur
 */
public class TestBanque {
    public static void main(String[] args) {
        Adresse add1=new Adresse(1,"lamta","monastir","tunis");
        Adresse add2=new Adresse(2,"sayada","monastir","tunis");
        Adresse add3=new Adresse(3,"sahloul","sousse","tunis");
        
        Personne p1=new Personne("hamza","zaafrane",add1);
        Personne p2=new Personne("neyra","marzouk",add2);
        Personne p3=new Personne("oumaima","debbaba",add3);
          System.out.println(p3);
        Compte compte1=new Compte(p1,50000,1);
        Compte compte2=new Compte(p2,4000,2);
        Compte compte3=new Compte(p3,50000,3);
            
        Banque bank=new Banque(1,"Biat",5);
        bank.ajoutCompte(compte1);
        bank.ajoutCompte(compte2);
        bank.ajoutCompte(compte3);
       
        System.out.println(bank);
        /*
        System.out.println(compte1.getSolde());
        bank.transfert(500, compte1, compte2);
        System.out.println(compte1.getSolde());        
        System.out.println(compte2.getSolde());*/
    }
}
