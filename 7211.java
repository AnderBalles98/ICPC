import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        while (leer.ready()) {
            String te = leer.readLine();
            String text[] = leer.readLine().split(" ");
            Integer out = 0;
            for (int i = 0; i < text.length; i++) {
                if (te.equals(text[i])) {
                    out++;
                }
            }
            System.out.println(out);
        }
    }
}
