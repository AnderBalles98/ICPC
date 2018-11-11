import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author ANDERSON BALLESTEROS
 */

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<Character, Double> dic = new LinkedHashMap<>(10);
        dic.put('%', 0.0);
        dic.put(')', 1.0);
        dic.put('~', 2.0);
        dic.put('@', 3.0);
        dic.put('?', 4.0);
        dic.put('$', -1.0);
        dic.put((char) 92, 5.0);
        String text = "";
        while (leer.ready()) {
            while (!(text = leer.readLine()).equals("#")) {
                Integer exp = text.length() - 1;
                Double res = 0.0;
                for (Character g : text.toCharArray()) {
                    res += dic.get(g) * Math.pow(6.0, exp--);
                }
                System.out.println(res.intValue());
            }
        }

    }
}
