public class Palindrome {
    
    public static void main(String[] args) {

        String word = "Madam";
        String reversed = reverse(word);

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    static String reverse(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return reversed;
    }
}
