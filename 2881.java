import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ANDERSON BALLESTEROS
 */
 
class Main {

    private static Boolean tramp(ArrayList<Integer> tramps, Integer pos) {
        for (int i = 0; i < 3; i++) {
            if (pos.equals(tramps.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String text;
        while (!(text = leer.readLine()).equals("0 0")) {
            String aux[] = text.split(" ");
            Integer players = Integer.valueOf(aux[0]);
            Integer lenght = Integer.valueOf(aux[1]);
            ArrayList<Integer> list = new ArrayList<>(players);
            ArrayList<Integer> tramps = new ArrayList<>(3);
            for (int i = 0; i < players; i++) {
                list.add(0);
            }
            String h = leer.readLine();
            aux = h.split(" ");
            try {
                for (int i = 0; i < 3; i++) {
                    tramps.add(Integer.valueOf(aux[i]));
                }
            } catch (Exception e) {
                System.out.println(e);
            }

            Integer turns = Integer.valueOf(leer.readLine());
            Set<Integer> set = new HashSet<>();
            Integer player = -1;
            for (int i = 0; i < turns; i++) {
                aux = leer.readLine().split(" ");
                player++;
                player %= players;
                Double t = (i + 1) / players.doubleValue();
                while (set.contains(player)) {
                    set.remove(player);
                    player++;
                    player %= players;
                }

                Integer move = Integer.valueOf(aux[0]) + Integer.valueOf(aux[1]);

                list.set(player, list.get(player) + move);
                if (list.get(player).intValue() > lenght.intValue()) {
                    System.out.println((player+1));
                }

                if (tramp(tramps, list.get(player))) {
                    set.add(player);
                }
            }
        }
    }
}
