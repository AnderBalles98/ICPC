import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author ANDERSON BALLESTEROS
 */

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String NMK;
        while (!(NMK=leer.readLine()).equals("0 0 0")) {
            String nmk[] = NMK.split(" ");
            int n = Integer.parseInt(nmk[0]);
            int m = Integer.parseInt(nmk[1]);
            int k = Integer.parseInt(nmk[2]);
            int out = n;
            String secuenceLine[] = leer.readLine().split(" ");
            Integer secuence[] = new Integer[k];
            for (int i = 0; i < k; i++) {
                secuence[i]=Integer.parseInt(secuenceLine[i]);
            }
            for (int i = 0; i < m-1; i++) {
                n+=secuence[i%k];
                out+=n;
                
            }
            System.out.println(out);
        }
    }
}
