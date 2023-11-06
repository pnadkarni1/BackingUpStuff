public class Demo {

    public static void main(String[] args) {

        System.out.println(Color.BLUE_BOLD + "Text to change color" + Color.YELLOW_BRIGHT + " Some other color" + Color.RESET);
        System.out.println("This is default");

        System.out.print(Color.BLUE_BOLD);
        System.out.print(Color.YELLOW_BACKGROUND);
        System.out.println("This should have bg color " + Color.RESET + "color");

    }

}
