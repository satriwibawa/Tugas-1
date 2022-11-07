
package project.aritmatika;

/**
 *
 * @author PC-A-30
 */
public class ProjectAritmatika {
        //property
       
private double hasil ;

//method tambah
    public  void tambah (double bil1, double bil2){
        
        this.hasil = bil1+bil2;
    }
       //method kurang 
    public  void kurang (double bil1, double bil2){
        
        this.hasil = bil1-bil2;
    }
        //method kali
    public  void kali (double bil1, double bil2){
        
        this.hasil = bil1*bil2;
        
    }
    
    //method bagi
    public  void bagi (double bil1, double bil2){
        
        this.hasil = bil1/bil2;
        
    }
    //get hasil
    public double gethasil(){
        return this.hasil ;
        
    }
    
   
}
