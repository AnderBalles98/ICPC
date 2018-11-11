import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String text;
        Integer cases = 0;
        Integer values[] = {0, 0};
        while (!(text = leer.readLine()).equals("#")) {
            String cost[] = text.split(" ");
            if (cost.length > 1) {
                System.out.println("Set " + (++cases));
                values[0] = Integer.parseInt(cost[1]);
                values[1] = Integer.parseInt(cost[2]);
            }else{
                Integer value = Integer.parseInt(cost[0]);
                Integer out =0;
                while (value!=0) {
                    out += values[value%2];
                    value/=2;
                }
                System.out.println(out);
            }

        }
    }
}
