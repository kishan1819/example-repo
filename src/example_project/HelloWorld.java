/**
 * This is an example java project
 * in my first GitHub repository
 */
package example_project;

import java.util.*;

/**
 * @author Kishan
 *
 */
public class HelloWorld {
    private static int sum = 0;
    private static int product = 0;
    public static final int AMOUNT = 5;
    private HelloWorld obj;

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        Scanner input = new Scanner(System.in);
//        System.out.println("Hello world");
//        System.out.println("Enter a number: ");
//        int num = input.nextInt();
//        input.close();
//        System.out.println("The square of " + num + " is " + num * num);
//        System.out.println("This is a branch");
        output();
        
    }

    private static void  output() {
        System.out.println("The sum of the numbers from 1 to " + AMOUNT + " is "
            + sum);
System.out.println("The product of the numbers from 1 to " + AMOUNT + 
            " is " + product);
    }
    public  void calculate(){
        int sum = 0;
        int product = 1;

        for (int i = 1; i <= AMOUNT; i++){
            sum = sum + i;
            product = product * i;         
        }

        output();
    }

}
