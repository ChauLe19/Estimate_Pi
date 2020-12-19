/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find.pi;

import java.util.Scanner;
/**
 *
 * @author Châu Lê
 */
public class FindPi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int throwingtime;
        double x,y,radius;
        double count=0;
        double pi;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("How many darts do we throw? ");
        throwingtime = scan.nextInt();
        scan.close();
        for(int i=0; i<throwingtime; i++){
            x= Math.random()*2-1;
            y= Math.random()*2-1;
            radius =x*x+y*y; //Technically need sqrt, but without it still works mathematically
            if(radius<=1){
                count++;
            }
        }
        System.out.println(count);
        pi = (count/throwingtime)*4;
        System.out.println(pi);
    }
}
