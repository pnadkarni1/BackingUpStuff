
public class BronzeRaids {

    public static void main(String[] args) {
        //Bronze 1

        int ranNum = (int) (Math.random() * 15);

        System.out.println(CountingFings(ranNum));

        //Bronze 2

        String s = "fmozjsraidASC3Js3qraidnOX1raidVKhjraidbqSgEJhraidq89umIraidgMjCNY6VyraidXPbI7BvraiduBc4Q4NWHraidPhokqFLJraidI6XbiraidgoZiraid8UWVB2uaRCqB2qNsT6JXLkc";

        System.out.println(lastRaid(s));

        //Bronze 3

        int pins = pinLoading(5);

        System.out.println(pins);

        //Bronze 4

        int [] arr = {40, 18, 19, 20, 3, 4, 29, 19, 8, 19, 20, 10, 19, 20, 190, 19};

        System.out.println(howMany19s(arr, 2));

    }

    public static int pinLoading (int rows) {

        if (rows == 1) {

            return 1;

        }else {

            return pinLoading(rows - 1) + rows;

        }

    }

    public static int howMany19s (int [] arr, int index) {


        int count = 0;

        if (index == arr.length) {

            return 0;

        }else {

            if (arr[index] == 19) {

                count++;

            }

            return howMany19s(arr, index + 1) + count;

        }

    }

    public static int CountingFings(int mouseNum) {

        if (mouseNum == 0){

            return 0;

        }else if (mouseNum % 2 == 0) {

            return CountingFings(mouseNum - 1) + 8;

        }else {

            return CountingFings(mouseNum - 1) + 4;

        }


    }

    public static int lastRaid(String string) {

        if(!string.contains("raid")) {

            return 0;

        }else {

            String [] arr = string.split("raid");
            string = string.replace(arr[0] + "raid", "");
            return lastRaid(string) + 1;

        }

    }



}