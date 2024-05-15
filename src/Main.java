import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        String orWord = "Primo";

        String reversed = reversedWord(orWord);

        System.out.println("Original word :" + orWord);
        System.out.println("Reversed word :" + reversed);

    }

    public static String reversedWord(String word) {

        String reversed = "";
        Stack<Character> stackOfChar = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stackOfChar.push(word.charAt(i));
        }

        while (!stackOfChar.isEmpty()) {
            reversed += stackOfChar.pop();
        }
        return reversed;
    }
}