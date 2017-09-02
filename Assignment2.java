/*Morgan Norwood
9/2/2017

This program will convert Celsius into Fahrenheit
 */

package assignment2;

import java.util.Scanner;
public class Assignment2 {

    public static void main(String[] args){

        double F;
        double C;
        //F = fahrenheit C = Celsius

        Scanner temp = new Scanner(System.in);
        //program will read in use data for the temperature in fahrenheit
        System.out.println("what is the temperature in Celsius?");
        C = temp.nextDouble();
        F = (9.0/5.0)* C + 32;
        //converting C to F
        System.out.println("The temperature in Fahrenheit is " + F);

    }
}
