public class Programmieraufgabe6 {
    public static void main(String[] args) {
        // 9 Zeilen im Schachbrettmuster
        for (int row = 0; row < 9; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < 9; col++) {
                // abwechselnd '*' und '.'
                if ((row + col) % 2 == 0) {
                    sb.append('*');
                } else {
                    sb.append('.');
                }
            }
            System.out.println(sb.toString());
        }
    }
}
