
package belahketupat;

import java.util.Scanner;
public class Belahketupat {

    /**
     * @param args the command line arguments
     */

 public static void main(String args[]){

 Scanner sc = new Scanner(System.in);
 System.out.print("Masukkan Angka yang anda suka :");

 int n = sc.nextInt();
 //bagian atas
 for(int x=n; x>=1; x--)
  {
   for(int y=x-1; y>=1; y--){
    System.out.print(" ");
   }
   for(int z=1; z<=((n+1)-x)*2; z++){
    System.out.print("*");
   }
  System.out.println();
  }
 
 //bagian bawah
 for(int i=n; i>=1; i--)
  {
   for(int k=1; k<=n-i; k++){
   System.out.print(" ");
   }
   for(int j=i*2; j>=1; j--){
   System.out.print("*");
   }
   System.out.println();
  }
 }
}