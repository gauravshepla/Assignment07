/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment07;
import java.util.Scanner;
public class Assignment07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i,j;
        System.out.println("HOW MANY LINES?");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
            System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("END OF EXECUTION");
    }
    
}
