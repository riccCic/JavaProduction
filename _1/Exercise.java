package javaProduction._1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercise {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1:
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        double x = Math.random() * 100;

        String value = x >= 50 ? "(il valore è maggiore o uguare a 50)" : "(il valore è minore di 50)";

        System.out.println(x+" "+value);


    }

    /**
     * 2:
     * Create a record called "Person" with fields for name, age and address.
     * Add a toString method to Person to print out the data in a different format
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Persona persona=new Persona("Bob",23,"via di qui,23");
        System.out.println(persona);

    }

    /**
     * 3:
     * In the main method, create a BigInteger variable with a large value.
     * Create a BigDecimal variable with a large value
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        BigInteger num=new BigInteger("99999999999999999999999999");
        num=num.divide(BigInteger.valueOf(3));
        System.out.println(num);
       try {
           BigDecimal num2= new BigDecimal("0.000000000000000000000000025");

        num2=num2.divide(BigDecimal.valueOf(Math.PI));
        System.out.println(num2);
       }catch (ArithmeticException e){
           System.err.println("Questa operazione non può essere effettuata");
           System.exit(0);
       }
    }

}
