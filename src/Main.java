import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        String numbers = scan.next();
        String[] words = numbers.split("");
        for (String word : words) {
            ar1.add(Integer.parseInt(word));
        }

        ArrayList<Integer> ar2= new ArrayList<Integer>();
        String numbers2 = scan.next();
        String[] words2 = numbers2.split("");
        for (String word : words2) {
            ar2.add(Integer.parseInt(word));
        }


        ArrayList<Integer> ar3 = new ArrayList<Integer>(ar2);
        ar3.retainAll(ar1);

        System.out.println(ar3);

    }
}