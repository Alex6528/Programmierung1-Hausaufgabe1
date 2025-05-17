public class Programmieraufgabe5 {
    public static void main(String[] args) {
        // erste Hälfte: 1 bis 5 Sterne
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // zweite Hälfte: 4 bis 1 Sterne
        for (int i = 4; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
