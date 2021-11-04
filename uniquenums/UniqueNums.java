package uniquenums;
import java.util.Scanner;
public class UniqueNums {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner in = new Scanner(System.in);
        int num=0, numValues=0;
                boolean vaild = true;
                while (numValues<numbers.length) {
                    do {
                        vaild = true;
                        System.out.print("Please enter a unique number: ");
                        num = in.nextInt();
                        for (int i = 0; i < numValues; i++) {
                            if (num == numbers[i]) {
                                System.out.println("Number already exists");
                                vaild = false;
                                break;
                            }//endif
                        }//endfor
                    } while (!vaild);
                    numbers[numValues] = num;
                    numValues++;
                    in.close();

                    for (int numV : numbers)
                        System.out.println("Number Value: " + numV);
                }//endwhile
    }//end method main
}//end class Uniquenums

