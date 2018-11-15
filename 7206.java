import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ANDERSON BALLESTEROS
 */

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        while (leer.ready()) {

            String NM[] = leer.readLine().split(" ");
            Integer N = Integer.parseInt(NM[0]);
            Integer M = Integer.parseInt(NM[1]);
            Integer daedalus = 0;
            Integer daedalusMax = 0;

            for (int i = 0; i < M; i++) {

                String round[] = leer.readLine().split(" ");
                Integer B = Integer.parseInt(round[0]);
                Integer total = 0;
                for (int j = 2; j < round.length; j++) {

                    total += Integer.parseInt(round[j]);
                }
                Integer daedalusCard = Integer.parseInt(round[1]);
                if (total.intValue() < B.intValue()) {

                    if ((total + daedalusCard) <= B.intValue()) {
                        daedalus += daedalusCard;
                    }
                    daedalusCard = 1;
                    while (((daedalusCard * 10) + total) <= B.intValue() && daedalusCard.intValue() <= 1000) {

                        daedalusCard *= 10;
                    }

                    daedalusMax += daedalusCard;

                }
            }
            Integer out = daedalusMax - daedalus;
            if (out >= 0) {
                System.out.println(out);
            } else {
                System.out.println("0");
            }

        }
    }
}
