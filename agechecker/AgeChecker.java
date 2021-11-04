package agechecker;

import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
        char holdlicence;

        System.out.print("Please enter your age: ");
        age = in.nextInt();
        System.out.print("Do you hold a current driving licence? ");
        holdlicence = in.next().charAt(0);

        if ((age > 20) && (holdlicence == 'y'))
            System.out.println("You are an adult and can hire a car");
        else
            System.out.println("You are not an adult so cannot hire a car");
        //endif
        in.close();
    }//end method main
}//end class AgeChecker
