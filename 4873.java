import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author ANDERSON BALLESTEROS
 */

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String, Integer> dic = new LinkedHashMap<>();

        Integer cases = Integer.parseInt(leer.readLine());
        for (int i = 0; i < cases; i++) {
            dic.put("TTT", 0);
            dic.put("TTH", 0);
            dic.put("THT", 0);
            dic.put("THH", 0);
            dic.put("HTT", 0);
            dic.put("HTH", 0);
            dic.put("HHT", 0);
            dic.put("HHH", 0);
            Integer numCase = Integer.parseInt(leer.readLine());
            String text = leer.readLine();
            for (int j = 0; j < text.length() - 2; j++) {
                String aux = text.substring(j, j + 3);
                dic.put(aux, dic.get(aux) + 1);
            }
            String out = numCase+" ";
            for (Map.Entry<String, Integer> element : dic.entrySet()) {
                out+=element.getValue()+" ";
            }
            out = out.substring(0, out.length()-1);
            System.out.println(out);
        }
    }
}
