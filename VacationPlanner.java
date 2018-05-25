import java.util.Scanner;

public class VacationPlanner {
    public static void main (String[] args) {
       //welcome();
       timeBudget();
       timeDifference();
        countryArea();
    }
    public static void welcome() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name?");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you traveling to?");
        String destination = input.nextLine();
        System.out.println("Great! " + destination + " sounds like a great trip");
        System.out.println("*****************");
    }
    public static void timeBudget() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend at your destination?");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip?");
        Double budget = input.nextDouble();
        System.out.print("What is the currency symbol for their destination?(USD/EU/etc)");
        String symbol = input.next();
        System.out.print("How many " + symbol + " are there in 1 USD?");
        Double conversion = input.nextDouble();
        double dayspend = (budget/days)*100;
        int twodecimal = (int) dayspend;
        double a;
        a = twodecimal/100.0;
        double dayconversion = (budget*conversion/days)*100;
        int decimal = (int) dayconversion;
        double b;
        b = decimal/100.0;

        System.out.println("If you are traveling for " + days + " days that is the same as " + days*24 +" hours or " + days*1440 + " minutes");
        System.out.println("If you are going to spend $" + budget + " USD that means that per day you can spend up to $" + a + " USD"); //long number format
        System.out.println("Your total budget in " + symbol + " is " + budget*conversion + " " + symbol + " ,which per day is " + b + " " + symbol);//long number format
        System.out.println("*****************");
    }
    public static void timeDifference() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between, your home and your destination?(Please use negative to indicate backwards TD) ");
        int difference = input.nextInt();
        System.out.println("That means that when it is midnight at home it will be " + difference + ":00 in your travel destination and when it is noon at home it will be " + (difference+12) +":00");
        System.out.println("*****************");
    }
    public static void countryArea() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km2?");
        int km = input.nextInt();
        System.out.print("In miles that is " + km*0.38610);
    }
}
