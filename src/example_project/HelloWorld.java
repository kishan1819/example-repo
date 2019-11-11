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

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Hello world");
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        input.close();
        System.out.println("The square of " + num + " is " + num * num);
        System.out.println("This is a branch");
    }

}
