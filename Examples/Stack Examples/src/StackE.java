import java.util.Stack;

public class StackE {

    protected static Stack<String> check = new Stack<>();

    public static void main(String[] args) {

        //check symmetry of expression mean that want a symmetrical amount of ()
        //cannot just check open vs close because )3 + 4( is not symmetrical

        String exp = "((3) + 4))";
        System.out.println("Expression is symmetrical? " + sym(exp));

    }

    private static boolean sym(String exp) {

        for(int i = 0; i < exp.length(); i++) {

            String sing = exp.substring(i, i + 1);

            if ("(".equals(sing)) {

                check.push(sing);

            }else if (")".equals(sing)) {

                if (check.isEmpty()) {

                    return false;

                }else {

                    check.pop();

                }

            }

        }

        return check.isEmpty();

    }

}
