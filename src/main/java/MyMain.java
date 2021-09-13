import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int base_num = 1;
        int factorial_num = 1;
        while (base_num <= x) {
            factorial_num = factorial_num * base_num;
            base_num++;

        }
        return factorial_num;

    }
    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double e_compare = 0;
        int e_tester = 1;
        double e_val = Math.E;
        while (e_val - e_compare >= 0.00000000001){
            e_compare = (1/factorial(e_tester));
            e_tester++;
        }
        return Math.E;


    }

    // Could not figure out how to do it
    public static double babylonian(double x) {
        double n = 41;
        double m = 0;
        while(Math.abs(x-m) > 0.0000001){

        }

    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // YOUR CODE HERE


        

        scan.close();
    }
}
