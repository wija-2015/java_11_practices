package practice_8;

/**
 * @author Wijdane KHATTAT
 */
public class LoopTest {
    public static void main(String[] args) {
        System.out.println("******************************");
        int[] values = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int i = 0 ; i < values.length ; sum += i++);
        System.out.println(sum);// sum is 36

        System.out.println("\n******************************");
        char[][] game = {{'O','X','X'},
                         {'X','X','O'},
                         {'O',' ','O'}};
        StringBuilder txt = new StringBuilder();
        for (int x = 0; x < game.length; x++) {
            int y = 0;
            while (y < game[x].length) {
                txt.append(game[x][y]);
                y++;
            }
            txt.append('\n');
        }
        System.out.println(txt);
        txt = new StringBuilder();
        for(char[] row : game) {
            for (char value: row) {
                txt.append(value);
            }
            txt.append('\n');
        }
        System.out.println(txt);

        System.out.println("\n******************************");
        char[][] matrix =  {{'A','D','C','A','M'},
                            {'G','O','H','I','K'},
                            {'O','D','N','O','P'},
                            {'O','K','S','T','U'},
                            {'V','W','X','Y','Z'}};
        StringBuilder text = new StringBuilder();
        outerLoopLabel:
        for(char[] row : matrix) {
            for (char column: row) {
                if (column == 'C') { continue; }
                if (column == 'H') { continue outerLoopLabel; }
                if (column == 'N') { break; }
                if (column == 'S') { break outerLoopLabel; }
                text.append(column);
            }
            text.append('\n');
        }
        System.out.println(text);

    }
}
