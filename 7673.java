import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author ANDERSON BALLESTEROS
 */

class Main {
    
    static class Letter implements Comparable<Letter>{
        Character letter;
        Integer frequency = 1;

        public Letter(Character letter) {
            this.letter = letter;
        }

        @Override
        public int compareTo(Letter o) {
            if (frequency.equals(o.frequency)) {
                return letter.compareTo(o.letter);
            }
            return o.frequency.compareTo(frequency);
        }

        @Override
        public String toString() {
            return letter + " " + frequency;
        }
        
        
        
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!(input = leer.readLine()).equals("0 0")) {
            ArrayList<Letter> list = new ArrayList<>(100);
            ArrayList<Character> listAux = new ArrayList<>(100);
            String rowsColumns[] = input.split(" ");
            Integer rows = Integer.parseInt(rowsColumns[0]);
            Integer columns = Integer.parseInt(rowsColumns[1]);
            for (int i = 0; i < rows; i++) {
                String text = leer.readLine();
                for (char c : text.toCharArray()) {
                    Integer index = listAux.indexOf(c);
                    if (index.intValue()==-1) {
                        listAux.add(c);
                        Letter letter = new Letter(c);
                        list.add(letter);
                    }else{
                        list.get(index.intValue()).frequency+=1;
                    }
                }
            }
            Collections.sort(list);
            for (int i = 0; i < list.size()-1; i++) {
                System.out.print(list.get(i)+" ");
            }
            System.out.println(list.get(list.size()-1));
        }
    }
}
