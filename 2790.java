
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */

public class Main {

    private static String moveJ(String word) {
        return word.substring(1) + word.charAt(0);
    }

    private static String moveC(String word) {
        return word.charAt(word.length() - 1) + word.substring(0, word.length() - 1);
    }

    private static String moveE(String word) {
        if (word.length() % 2 == 0) {
            return word.substring(word.length() / 2) + word.substring(0, word.length() / 2);
        } else {
            return word.substring((word.length() / 2) + 1) + word.charAt(word.length() / 2)
                    + word.substring(0, word.length() / 2);
        }
    }

    private static String moveA(String word) {
        String toReturn = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            toReturn += word.charAt(i);
        }
        return toReturn;
    }

    private static String moveP(String word) {
        String toReturn = "";
        for (Character element : word.toCharArray()) {
            if (!Character.isLetter(element)) {
                toReturn += (Integer.parseInt(element + "") + 1) % 10;
            } else {
                toReturn += element;
            }
        }
        return toReturn;
    }

    private static String moveM(String word) {
        String toReturn = "";
        for (Character element : word.toCharArray()) {
            if (!Character.isLetter(element)) {
                toReturn += (Integer.parseInt(element + "") + 9) % 10;
            } else {
                toReturn += element;
            }
        }
        return toReturn;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(read.readLine());
        for (int i = 0; i < cases; i++) {
            char[] moves = read.readLine().toCharArray();
            String word = read.readLine();
            for (int j = moves.length-1 ; j >= 0; j--) {
                char move = moves[j];
                switch (move) {
                    case 'J':
                        word = moveC(word);
                        break;
                    case 'C':
                        word = moveJ(word);
                        break;
                    case 'E':
                        word = moveE(word);
                        break;
                    case 'A':
                        word = moveA(word);
                        break;
                    case 'P':
                        word = moveM(word);
                        break;
                    case 'M':
                        word = moveP(word);
                        break;
                        
                }
//                System.out.println(word);
            }
            System.out.println(word);
        }
    }
}
