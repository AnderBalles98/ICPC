import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    private static String sol(Integer x, Integer y){
        if (x%2==0) {
            if (x.equals(y)) {
                return ""+(x*2);
            }else if (x.equals(y+2)) {
                return ""+((x*2)-2);
            }
        }else{
            if (x.equals(y)) {
                return ""+((x*2)-1);
            }else if (x.equals(y+2)) {
                return ""+((x*2)-3);
            }
        }
        return "No Number";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        Integer cases = Integer.parseInt(leer.readLine());
        for (int i = 0; i < cases; i++) {
            String text[] = leer.readLine().split(" ");
            Integer x = Integer.parseInt(text[0]);
            Integer y = Integer.parseInt(text[1]);
            System.out.println(sol(x, y));
        }
    }
}
