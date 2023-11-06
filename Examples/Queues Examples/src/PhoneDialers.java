import java.util.LinkedList;
import java.util.Queue;

public class PhoneDialers {
    public static void main(String[] args) {

        Queue<String> dialer = new LinkedList<>();
        String number = "2178675309";
        for (int i = 0; i < number.length(); i++) {

            dialer.add(number.substring(i, i + 1));

        }

        System.out.println(dialer);

    }
}
