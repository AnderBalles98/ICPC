import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author ANDERSON BALLESTEROS RODRIGUEZ
 */
 
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        while (leer.ready()) {
            String text[] = leer.readLine().split(" ");
            Queue<Double> sig = new PriorityQueue();
            for (String element : text) {
                try {
                    sig.add(Double.parseDouble(element));
                } catch (Exception e) {
                    Double a = sig.poll();
                    Double b = sig.poll();
                    if (element.equals("+")) {
                        sig.add(b + a);
                    } else if (element.equals("-")) {
                        sig.add(b - a);
                    } else if (element.equals("*")) {
                        sig.add(b * a);
                    } else if (element.equals("/")) {
                        sig.add(b / a);
                    }
                }
            }
            System.out.format(Locale.ROOT, "%.4f\n", sig.poll());
        }

    }
}
