/**
 * For fun, wrote a Java program (FizzBuzz.java) to solve the following "FizzBuzz" problem:
 *
 * "Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz”
 * instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both
 * three and five print “FizzBuzz”."
 */

public class Fizzbuzz {

    public static void main(String[] args) {
        String output;

        for (int i = 1; i <= 100; i++ ) {
            output = "";

            if (i % 3 == 0) { // divisible by 3
                output += "Fizz";
            }
            if (i % 5 == 0) { // divisible by 5
                output += "Buzz";
            }

            if (output.contains("Fizz") || output.contains("Buzz")) {
                System.out.println(output);
            }
            else {
                System.out.println(i);
            }
        }
    }
}