import java.util.Scanner;

public class CalculatorDriver {
    public static void main(String[]args){
        System.out.println("Please choose a calculator method.");
        System.out.println("1. sum");
        System.out.println("2. average");
        System.out.println("3. product");
        System.out.println("4. factorial");
        Scanner scanner=new Scanner(System.in);
        int sc=scanner.nextInt();
        if (sc==1){
            System.out.println("Enter the size of an Array:");
            int sc10=scanner.nextInt();
            System.out.println("Enter some numbers:");
            double[] numbers = new double[sc10];
            for(int i=0; i<sc10; i++)
                numbers[i] = scanner.nextDouble();
            System.out.println("The answer is "+Calculator.sum(numbers)+" .");

        }
        if (sc==2){
            System.out.println("Enter the size of an Array:");
            int sc20=scanner.nextInt();
            System.out.println("Enter some numbers:");
            double[] numbers = new double[sc20];
            for(int i=0; i<sc20; i++)
                numbers[i] = scanner.nextDouble();
            System.out.println("The answer is "+Calculator.average(numbers)+" .");

        }if (sc==3){
            System.out.println("Enter the size of an Array:");
            int sc30=scanner.nextInt();
            System.out.println("Enter some numbers:");
            double[] numbers = new double[sc30];
            for(int i=0; i<sc30; i++)
                numbers[i] = scanner.nextDouble();
            System.out.println("The answer is "+Calculator.product(numbers)+" .");

        }
//        if (sc==4){
//            System.out.println("Enter the size of an Array:");
//            int sc40=scanner.nextInt();
//            System.out.println("Enter some numbers:");
//            double[] numbers = new double[sc40];
//            for(int i=0; i<sc40; i++)
//                numbers[i] = scanner.nextDouble();
//            System.out.println("The answer is "+Calculator.factorial(numbers).toString()+" .");
//        }
        if (sc==4){
            System.out.println("Enter the number of numbers:");
            int sc40=scanner.nextInt();
            System.out.println("Enter some numbers:");
            double[] numbers = new double[sc40];
            for(int i=0; i<sc40; i++)
//                numbers[i] = scanner.nextDouble();
                System.out.println("The answer is "+Calculator.factorial(scanner.nextDouble())+" .");
        }

    }

}

