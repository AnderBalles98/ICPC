import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    private static int begin(String array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("1")) {
                return i + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        int posts;
        while ((posts = Integer.parseInt(leer.readLine())) != 0) {
            String in = leer.readLine();
            String line[] = in.split(" ");
            int out = 0;
            int begin = begin(line);
            int mod = line.length;
            int end = begin + line.length;
            for (int i = begin; i < end; i++) {
                if (line[i % mod].equals("0") && line[i % mod].equals(line[(i + 1) % mod])) {
                    out++;
                    i++;
                }
            }
            System.out.println(out);
        }
    }
}
