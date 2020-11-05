/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex;
import java.util.Scanner;
/**
 *
 * @author Administrateur
 */
public class Purchase {
    private int qte;
    private float unitePrice;

   

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public double getUnitePrice() {
        return unitePrice;
    }

 

    @Override
    public String toString() {
        return "Purchase{" + "qte=" + qte + ", unitePrice=" + unitePrice + '}';
    }
    
    public double calculateTotalPrice(int x,double y){
        return x*y;
    }
    
    public static void main(String[] args) {
       
       
           try ( Scanner scanner = new Scanner( System.in ) ) {
            
            System.out.print( "Veuillez saisir la quantite : " );
            int a = scanner.nextInt();
            
            System.out.print( "Veuillez saisir le prix unite : " );
            double b=scanner.nextDouble();
            Purchase p=new Purchase();
            p.setQte(a);          
            p.setUnitePrice(b);
            System.out.println(p);
            System.out.println(p.calculateTotalPrice(p.getQte(),p.getUnitePrice()));
          
            
        }catch(Exception e){e.getMessage();}
    }
}
