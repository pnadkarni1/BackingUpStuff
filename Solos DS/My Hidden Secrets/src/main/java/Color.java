public enum Color {


    //an enum is a special data type
//it enables variable to set of predefinded constant
//usually seen for cardinal directions, days

        //when using colors, color should come first, then background, if wanted
        //all strings we are typing are ANSI code for the color

        RESET("\033[0m"),

        //reg colors, normal no bold

        BLACK("\033[0;30m"),
        RED("\033[0;31m"),
        GREEN("\033[0;32m"),
        YELLOW("\033[0;33m"),
        BLUE("\033[0;34m"),
        MAGENTA("\033[0;35m"),
        CYAN("\033[0;36m"),
        WHITE("\033[0;37m"),

        //BOLD

        BLACK_BOLD("\033[1;30m"),
        RED_BOLD("\033[1;31m"),
        GREEN_BOLD("\033[1;32m"),
        YELLOW_BOLD("\033[1;33m"),
        BLUE_BOLD("\033[1;34m"),
        MAGENTA_BOLD("\033[1;35m"),
        CYAN_BOLD("\033[1;36m"),
        WHITE_BOLD("\033[1;37m"),

        //Underline

        BLACK_UNDERLINE("\033[4;30m"),
        RED_UNDERLINE("\033[4;31m"),
        GREEN_UNDERLINE("\033[4;32m"),
        YELLOW_UNDERLINE("\033[4;33m"),
        BLUE_UNDERLINE("\033[4;34m"),
        MAGENTA_UNDERLINE("\033[4;35m"),
        CYAN_UNDERLINE("\033[4;36m"),
        WHITE_UNDERLINE("\033[4;37m"),

        //Background

        BLACK_BACKGROUND("\033[40m"),
        RED_BACKGROUND("\033[41m"),
        GREEN_BACKGROUND("\033[42m"),
        YELLOW_BACKGROUND("\033[43m"),
        BLUE_BACKGROUND("\033[44m"),
        MAGENTA_BACKGROUND("\033[45m"),
        CYAN_BACKGROUND("\033[46m"),
        WHITE_BACKGROUND("\033[47m"),

        //High Bright

        BLACK_BRIGHT("\033[0;90m"),
        RED_BRIGHT("\033[0;91m"),
        GREEN_BRIGHT("\033[0;92m"),
        YELLOW_BRIGHT("\033[0;93m"),
        BLUE_BRIGHT("\033[0;94m"),
        MAGENTA_BRIGHT("\033[0;95m"),
        CYAN_BRIGHT("\033[0;96m"),
        WHITE_BRIGHT("\033[0;97m"),

        //Bold Bright

        BLACK_BRIGHT_BOLD("\033[1;90m"),
        RED_BRIGHT_BOLD("\033[1;91m"),
        GREEN_BRIGHT_BOLD("\033[1;92m"),
        YELLOW_BRIGHT_BOLD("\033[1;93m"),
        BLUE_BRIGHT_BOLD("\033[1;94m"),
        MAGENTA_BRIGHT_BOLD("\033[1;95m"),
        CYAN_BRIGHT_BOLD("\033[1;96m"),
        WHITE_BRIGHT_BOLD("\033[1;97m"),

        //Background Bold Bright

        BLACK_BRIGHT_BACKGROUND("\033[0;100m"),
        RED_BRIGHT_BACKGROUND("\033[0;101m"),
        GREEN_BRIGHT_BACKGROUND("\033[0;102m"),
        YELLOW_BRIGHT_BACKGROUND("\033[0;103m"),
        BLUE_BRIGHT_BACKGROUND("\033[0;104m"),
        MAGENTA_BRIGHT_BACKGROUND("\033[0;105m"),
        CYAN_BRIGHT_BACKGROUND("\033[0[;106m"),
        WHITE_BRIGHT_BACKGROUND("\033[0;[107m");

        private final String code;

        //constructor to make colors above

        Color(String code) {

            this.code = code;

        }

        //lets us use the color in print

        @Override

        public String toString() {

            return code;

        }

    }
