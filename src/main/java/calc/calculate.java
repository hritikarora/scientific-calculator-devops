package calc;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class calculate {
    private static final Logger logger = LogManager.getLogger(calculate.class);

    public static void main(String []args) {
        double a, b;
        int flag=0;
        while (true) {
            System.out.println("\n\n\n------welcome to scientific calculator-------\n\n");
            logger.info("A user entered !");

            System.out.println("---Select Operation---\n\n 1. Factorial \n 2. Natural log \n 3. Square root \n 4. Power\n 5. Exit \n\n");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            if(choice<1 || choice>4)
            {
                System.out.println("invalid choice!\n\n");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("enter a number :");
                    a = sc.nextDouble();
                    System.out.println("Factorial of "+a+" is = "+fact(a));
                    break;
                case 2:
                    System.out.println("enter a number :");
                    a = sc.nextDouble();
                    System.out.println("Natural logarithm of "+a+" is = "+log(a));
                    break;
                case 3:
                    System.out.println("enter a number :");
                    a = sc.nextDouble();
                    System.out.println("Square root of "+a+" is = "+sqrt(a));
                    break;
                case 4:
                    System.out.println("enter 2 numbers :");
                    a=sc.nextDouble();
                    b=sc.nextDouble();
                    System.out.println("Power of "+a+"is = "+pow(a,b));
                    break;
                case 5:
                    flag = 1;
                    break;
            }
            if(flag == 1)
            {
                System.out.println("Exiting application !");
                break;
            }
        }
    }

    public static long fact(double a)
    {
        if(a<0)
        {
            logger.error("Factorial of number less than 0 cant be found");
            throw new IllegalArgumentException("Factorial of number less than 0 cant be found");
        }
        long result = 1;

        for (int factor = 2; factor <= a; factor++) {
            result *= factor;
        }
        logger.info("Factorial of "+a);
        logger.info("!"+a+" = "+result);

        return result;

    }
    public static double pow(double a, double b)
    {
        logger.info(a+" raised to power "+b);
        logger.info(a+"^"+b+" = "+Math.pow(a,b));
       return Math.pow(a,b);

    }
    public static double log(double a)
    {
        if(a<0)
        {
            logger.error("Log of number less than 0 cant be found");
            throw new IllegalArgumentException("Log of number less than 0 cant be found");
        }
        logger.info("Natural logarithm of"+a);
        logger.info("log("+a+") = "+Math.log(a));
        return Math.log(a);
    }
    public static double sqrt(double a)
    {
        if(a<0)
        {
            logger.error("Square root of number less than 0 cant be found");
            throw new IllegalArgumentException("Square root of number less than 0 cant be found");
        }
        logger.info("Square root of "+a+" = "+Math.sqrt(a));
        return Math.sqrt(a);
    }
}
