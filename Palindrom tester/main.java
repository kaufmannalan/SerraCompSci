public class Main {

    public static void main(String[] args) {
        String[] testSuite = {"Palindrome", "Civic", "Radar", "Level", "Eva, can I stab bats in a cave?", "A man, a plan, a canal, Panama", "Mr. Owl ate my metal worm", "Never odd or even", "Doc, Note: I Dissent. A fast never prevents a fatness. I diet on cod."};
        for (int i = 0; i < testSuite.length; i++) {
            boolean check = tester(testSuite[i]);
            if (check) System.out.printf("\n\"%s\" is a  palindrome.", testSuite[i]);
            else System.out.printf("\n\"%s\" is not a palindrome.", testSuite[i]);
            System.out.println();
        }
    }
    public static boolean tester(String pal) {
        pal = removal(pal);
        String lap = "";
        int len = pal.length() - 1;
        for (int i = 0; i < pal.length(); i++) {
            lap += pal.charAt(len - i);
        }
        return pal.equalsIgnoreCase(lap);
    }
    public static String removal(String pal) {
        String pal2 = "";
        for (int i = 0; i < pal.length(); i++) {
            if ((pal.charAt(i) == ' ') || (pal.charAt(i) == '.') ||(pal.charAt(i) == ',') || (pal.charAt(i) == '?') || (pal.charAt(i) == '!') || (pal.charAt(i) == ':') || (pal.charAt(i) == ';')) {
                pal2 = pal2;
            }
            else pal2 += pal.charAt(i);
        }
        return pal2;
    }
}
