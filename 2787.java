
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author ANDERSON BALLESTEROS
 */
 
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (read.ready()) {
            int output = 0;
            input = read.readLine();
            String[] in = input.split(" ");
            if (Integer.parseInt(in[0])==-1) {
                break;
            }
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < in.length - 1; i++) {
                set.add(Integer.parseInt(in[i]));
            }

            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                int element = it.next();
                if (element % 2 == 0 && set.contains(element / 2)) {
                    output++;
                }
            }
            System.out.println(output);
        }
    }
}
