public class GoldRaids {
    public static void main(String [] args) {

        //Gold 1
        String [] array = new String[5];

        array[0] = "wildflowers";
        array[1] = "wildlife";
        array[2] = "wildcards";
        array[3] = "wildwoods";
        array[4] = "wildcat";

        gold1(array);


    }

    //Gold 1 method

    public static void gold1 (String [] arr) {

        for (int i = 0; i < arr.length; i++) {

            StringBuilder word = new StringBuilder (arr[i]);

            word = word.deleteCharAt(0);
            word = word.deleteCharAt(0);
            word = word.deleteCharAt(0);
            word = word.deleteCharAt(0);

            System.out.println(word);


        }

    }

}
