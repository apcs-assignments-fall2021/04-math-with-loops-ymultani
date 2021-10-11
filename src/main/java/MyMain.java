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

    public static double babylonian(double x){
        double z = x;
        double a= 1;
        while(z-a>0.000001){
            z = (z+a)/2;
            a = x/z;
        }
        return z;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a double value: ");
        double dub = scan.nextDouble();
        babylonian(dub);
        calculateE();



        

        scan.close();
    }
}
