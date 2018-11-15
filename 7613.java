import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> dic = new HashMap<>();
        dic.put('H', 1);
        dic.put('O', 16);
        dic.put('C', 12);
        Integer cases = Integer.parseInt(leer.readLine());
        for (int i = 0; i < cases; i++) {
            Integer out=0;
            String text = leer.readLine();
            for (char c : text.toCharArray()) {
                out+=dic.get(c);
            }
            System.out.println(out);
        }
    }
}
