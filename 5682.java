import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        Integer cases = Integer.parseInt(leer.readLine()); 
        for (int i = 1; i <= cases; i++) {
            String text[] = leer.readLine().split(" ");
            Integer cant = Integer.parseInt(text[0]);
            ArrayList<Integer> list = new ArrayList<>(cant);
            for (int j = 1; j < text.length; j++) {
                list.add(Integer.parseInt(text[j]));
            }
            Collections.sort(list);
            System.out.println("Class "+i);
            Integer max = list.get(list.size()-1);
            Integer min = list.get(0);
            Integer between = Math.abs(list.get(0)-list.get(1));
            for (int j = 1; j < list.size(); j++) {
                if ((Math.abs(list.get(j-1)-list.get(j)))>between) {
                    between=(Math.abs(list.get(j-1)-list.get(j)));
                }
            }
            System.out.println("Max "+max+", Min "+min+", Largest gap "+between);
        }
    }
}
