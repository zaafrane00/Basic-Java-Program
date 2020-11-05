/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrateur
 */
public class Adresse {
    protected int num;
    protected String rue;
    protected String ville;
    protected String pays;

    public Adresse(int num, String rue, String ville, String pays) {
        this.num = num;
        this.rue = rue;
        this.ville = ville;
        this.pays = pays;
    }
    
      public Adresse(Adresse add) {
        this.num = add.num;
        this.rue = add.rue;
        this.ville = add.ville;
        this.pays = add.pays;
    }
    
    public String toString(){
        return "num: "+num+" rue "+rue+" ville "+ville+" pays "+pays;
    }
}
