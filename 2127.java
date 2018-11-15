import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */

class Main {

    private static Integer search(String search[], String text[]) {
        Integer range = -1;
        Integer index = 1;
        Integer begin=-1;
        for (int j = 0; j < text.length; j++) {
            if (text[j].equals(search[0])) {
                range = j + 1;
                break;
            }
        }
        if (search.length == 1) {
            return 1;
        }
        if (range.intValue()==-1) {
            return -1;
        }
        for (int j = range - 1; j < text.length; j++) {
            if (text[j].equals(search[1])) {
                range = (j + 1) - range;
                begin=j;
                break;

            }
        }
        if (range.intValue() != -1) {
            Integer i = begin;
            for (int j = i; j < text.length; j += range) {
                if (index.intValue() == search.length - 1) {
                    return range;
                }
                if (!text[j].equals(search[index])) {
                    return -1;
                }

                index++;

            }
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String search;
        while (!(search = leer.readLine()).equals("#")) {
            search = search.substring(0, search.length() - 1);
            System.out.print("[" + search + "]");
            Integer begin = search(search.split(""), leer.readLine().split(""));
            if (begin.intValue() != -1) {
                System.out.println(" is found with encoding of " + begin + ".");
            } else {
                System.out.println(" is not found.");
            }
        }

    }

}
