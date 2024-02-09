import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String score;
        
        Subject sub = new Subject();
        User obj1 = new User();
        User obj2 = new User();

        sub.add(obj1);
        sub.add(obj2);

        sub.setScore("Thai 1-0 UAE");
        System.out.print("Enter Score ");
        score = in.nextLine();
        sub.setScore(score);

        in.close();
    }
}