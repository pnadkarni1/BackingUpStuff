public class NotAGame {

    public static void main(String[] args) {

        int [] arr = {9, 1, 18, 16, 11, 8, 12, 17, 13, 4, 7};

        int odd = 0;
        int even = 0;
        int total = 50;

        for(int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 1) {

                total = total - arr[i];
                odd++;

            }else {

                total = total + arr[i];
                even++;

            }

        }

        System.out.println(total);
        System.out.println(even);
        System.out.println(odd);

    }

}
