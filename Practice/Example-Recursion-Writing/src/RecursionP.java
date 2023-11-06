public class RecursionP {
    public static void main(String[] args) {

        String [] letters = {"a", "b", "c"};
        System.out.println(search(letters, "c"));
        System.out.println(search(letters, "f"));

    }

    public static void reverseDigits (int n) {
        int digit = n % 10;
        System.out.print(digit);

        if (n / 10 != 0) {
            System.out.println("\nN is: " + n);
            reverseDigits (n / 10);

        }
        System.out.println("\n" + n);
    }

    public static boolean search (String [] arr, String key) {

        return rSearch(arr, 0, key);

    }

    public static boolean rSearch (String [] arr, int startIndex, String key) {

        if (startIndex == arr.length) {

            return false;

        }else if (arr[startIndex].compareTo(key) == 0) {

            return true;

        }else {

            return rSearch(arr, startIndex + 1, key);

        }

    }

}