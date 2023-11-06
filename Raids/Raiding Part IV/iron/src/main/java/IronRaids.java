public class IronRaids {
    public static void main(String [] args) {

        //Iron 1

        int [] array = new int[25];

        for (int i = 0; i < array.length; i++) {

            int num = (int) Math.pow(i, 2);

            array[i] = num;

            System.out.println(num);

        }

        //Iron 3

        int [] iron3 = new int[10];

        iron3[0] = 2;
        iron3[1] = 4;
        iron3[2] = 8;
        iron3[3] = 11;
        iron3[4] = 16;
        iron3[5] = 17;
        iron3[6] = 20;
        iron3[7] = 30;
        iron3[8] = 25;
        iron3[9] = 27;

        iron3(iron3);

    }


    public static void iron3 (int[] arr) {

        int sum = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (i != 0) {

                sum *= arr[i];

            }

        }

        System.out.println();
        System.out.println(sum);

    }

}
