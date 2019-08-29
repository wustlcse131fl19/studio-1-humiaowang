package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("Enter value for arg 0");
        int n2 = ap.nextInt("Enter value for arg 1");
        double avg = (n1 + n2)*0.5;

        System.out.println("Average of " + n1 + " and "  + n2 + " is " + avg);
    }
}
