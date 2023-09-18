import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double winter;
        double spring;
        double summer;
        double autumn;
        double total;

        System.out.println("Input the maintenance cost for winter: ");
        Scanner input = new Scanner(System.in);
        winter = input.nextDouble();

        System.out.println("Input the maintenance cost for spring: ");
        input = new Scanner(System.in);
        spring = input.nextDouble();

        System.out.println("Input the maintenance cost for summer: ");
        input = new Scanner(System.in);
        summer = input.nextDouble();

        System.out.println("Input the maintenance cost for autumn: ");
        input = new Scanner(System.in);
        autumn = input.nextDouble();

        total = winter + spring + autumn + summer;
        System.out.println("The total is " + total + ".");
    }
}