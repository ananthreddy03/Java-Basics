package com.ananth;

public class StylingConsoleOutput {
    public static void main(String[] args) {
        System.out.println("Plain Simple Output 😕");
        System.out.println(Color.BLACK + "" + Color.YELLOW_BACKGROUND + "Hello, I am Bharath!" + Color.RESET);
        System.out.println(Color.CYAN_BOLD + "Styled Text!" + Color.RESET);
        System.out.println(Color.GREEN_UNDERLINED + "Underline Text!" + Color.RESET);
        System.out.println(Color.MAGENTA_BOLD + "" + Color.BLACK_BACKGROUND + "Bold Text! with Black Background!" + Color.RESET);
        System.out.println(Color.BLUE_BOLD_BRIGHT + "Blue Bold Bright Text!" + Color.RESET);
        System.out.println(Color.RED_BACKGROUND_BRIGHT + "Red Background Bright Text!" + Color.RESET);
    }
}
//https://ss64.com/nt/syntax-ansi.html
