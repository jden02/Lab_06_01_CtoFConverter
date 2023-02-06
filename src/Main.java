import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in C: ");
        double tempC = 0; // initially set to 0 to satisfy an error
        double tempF;

        if(sc.hasNextDouble()){
            tempC = sc.nextDouble();
        }else{
            System.out.println("Invalid input. Please re-run the program with a valid input.");
            System.exit(0);
        }

        tempF = tempC*(9.00/5.00) + 32;
        System.out.println(tempC + "C in Fahrenheit is " + tempF + "F.");

    }
}