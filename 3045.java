import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        Integer days;
        while (!(days=Integer.parseInt(leer.readLine())).equals(0)) {
            Integer out=0;
            Integer win = 1;
            for (int i = 1; i <= days; i++) {
                int j;
                
                for (j = i; j < i+win; j++) {
                    out += win;
                }
                Integer h = i+1;
                i = j;
                
                win++;
                if (i>=days) {
                    for (int k = h; k <= days; k++) {
                        out+=win;
                    }
                }
                
            }
            System.out.println(days+" "+out);
        }
    }
}
