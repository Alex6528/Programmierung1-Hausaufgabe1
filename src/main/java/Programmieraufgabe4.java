public class Programmieraufgabe4 {
    public static void main(String[] args) {
        // feste Zeilen
        System.out.println("*******");
        System.out.println("******");
        System.out.println(".....");

        // absteigend Sterne von 4 bis 1
        for (int stars = 4; stars >= 1; stars--) {
            // Baue eine Zeichenkette mit 'stars' Sternen
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < stars; j++) {
                sb.append('*');
            }
            System.out.println(sb.toString());
        }
    }
}
