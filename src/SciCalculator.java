//Joshua Antony
//Github Commit

import java.util.*;

public class SciCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        Double result = 0.0;

        double total = 0;
        int calculations = 0;
        double average;

        int lock = 0;

        while (lock == 0) {

            int choose;

            //Double result = 0.0;
            System.out.println("Current Result: " + result);
            System.out.println("");

            System.out.println("Calculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average");
            System.out.println("");

            //while (lock2 = 0)
            System.out.print("Enter Menu Selection: ");
            choose = scan.nextInt();
            System.out.println("");

            if (choose == 0){
                lock = 1;
                System.out.println("Thanks for using this calculator. Goodbye!");
                break;
            }
            if (choose>0 && choose<=6 ) {
                //double firstOperand = 0;
                //double secondOperand = 0;
                System.out.print("Enter first operand: ");
                double firstOperand=scan.nextDouble();
                System.out.println("");
                System.out.print("Enter second operand: ");
                double secondOperand=scan.nextDouble();
                System.out.println("");

                switch(choose) {
                    case 1:
                        result=firstOperand + secondOperand;
                        //System.out.println("Current Result: " + result);
                        total = total + result;
                        calculations++;
                        break;
                    case 2:
                        result=firstOperand - secondOperand;
                        //System.out.println("Current Result: " + result);
                        total = total + result;
                        calculations++;
                        break;
                    case 3:
                        result=firstOperand*secondOperand;
                        //System.out.println("Current Result: " + result);
                        total = total + result;
                        calculations++;
                        break;
                    case 4:
                        result=firstOperand/secondOperand;
                        //System.out.println("Current Result: " + result);
                        total = total + result;
                        calculations++;
                        break;
                    case 5:
                        result= Math.pow(firstOperand, secondOperand);
                        //System.out.println("Current Result: " + result);
                        total = total + result;
                        calculations++;
                        break;
                    case 6:
                        double temp1 = Math.log(firstOperand);
                        double temp2 = Math.log(secondOperand);

                        result = temp1/temp2;
                        //System.out.println("Current Result: " + result);
                        total = total + result;
                        calculations++;
                }

            }
            else if (choose == 7){
                if (calculations < 1){
                    System.out.println("Error: No calculations yet to average!");
                    break;
                }
                else if (calculations >= 1) {
                    average = total / calculations;

                    System.out.println("Sum of calculations: " + total);
                    System.out.println("Number of calculations: " + calculations);
                    System.out.println("Average of calculations: " + average);
                }
            }
            else {
                System.out.println("Error: Invalid selection!");
            }

        }
    }
}
