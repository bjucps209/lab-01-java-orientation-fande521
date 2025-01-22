
import java.util.*;

public class Grader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // create scanner object

        int numStu = Integer.parseInt(scan.nextLine());
        // int numStu = 3;
        for (int i = 1; i <= numStu; i++) {
            int grade = Integer.parseInt(scan.nextLine());
            // int grade = 72;
            if (grade % 5 >= 3 && grade >= 38) {
                grade = grade + (5 - grade % 5);
            }
            System.out.println(grade);
        }
    }
}
