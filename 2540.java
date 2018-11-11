import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        Hashtable<Character, Character> dic = new Hashtable<>();
        for (int i = 65; i <= 90; i++) {
            dic.put((char)i, (char)(((8+i)%26)+65));
        }
        String text;
        while (!(text=leer.readLine()).equals("ENDOFINPUT")) {
            String secondText;
            String line="";
            while (!(secondText=leer.readLine()).equals("END")) {
                if (!(secondText).equals("START")) {
                    for (char element : secondText.toCharArray()) {
                        if (dic.get(element)==null) {
                            line+=element;
                        }else{
                           line+=dic.get(element);
                        }
                    }
                    System.out.println(line);
                }
            }
        }
    }
}
