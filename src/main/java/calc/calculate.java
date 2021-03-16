package calc;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class calculate {
    private static final Logger logger = LogManager.getLogger(calculate.class);

    public static void main(String []args) {
        double a, b;
        while (true) {
            System.out.println("------welcome to scientific calculator-------");
            logger.info("A user entered !");

            System.out.println("---Select Operation---\n\n 1. Factorial \n 2. Natural log \n 3. Square root \n 4. Power\n");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            if(choice<1 || choice>4)
            {
                System.out.println("invalid choice!");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("enter a number :");
                    a = sc.nextDouble();
                    System.out.println(fact(a));
                    break;
                case 2:
                    System.out.println("enter a number :");
                    a = sc.nextDouble();
                    System.out.println(log(a));
                    break;
                case 3:
                    System.out.println("enter a number :");
                    a = sc.nextDouble();
                    System.out.println(sqrt(a));
                    break;
                case 4:
                    System.out.println("enter 2 numbers :");
                    a=sc.nextDouble();
                    b=sc.nextDouble();
                    System.out.println(pow(a,b));
                    break;
            }
        }
    }

    public static long fact(double a)
    {
        if(a<0)
        {
            throw new IllegalArgumentException();
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
            throw new IllegalArgumentException();
        }
        logger.info("Natural logarithm of"+a);
        logger.info("log("+a+") = "+Math.log(a));
        return Math.log(a);
    }
    public static double sqrt(double a)
    {
        if(a<0)
        {
            throw new IllegalArgumentException();
        }
        logger.info("Square root of "+a+" = "+Math.sqrt(a));
        return Math.sqrt(a);
    }
}
