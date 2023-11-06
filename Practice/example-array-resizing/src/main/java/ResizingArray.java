public class ResizingArray {

    public static void main(String[] args) {
        System.out.println("============ Resizing arrays ============");

        int [] heatShips = {2006, 2012, 2013};

        printArr(heatShips);

        heatShips = resize(heatShips);

        printArr(heatShips);

    }

    public static int[] resize (int [] orgiArr) {

        int[] newArr = new int[orgiArr.length * 2];

        for (int i = 0; i < orgiArr.length; i++) {

            newArr[i] = orgiArr[i];

        }

        return newArr;

    }//end of resize

    public static void printArr (int [] arr) {

        for (int ship : arr) {

            System.out.print(ship + ",  ");

        }

        System.out.println();

    }

}
