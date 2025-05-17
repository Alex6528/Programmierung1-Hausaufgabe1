public class Programmieraufgabe7 {
    /**
     * Liefert das Maximum von a, b und c zurück.
     */
    public static int getMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    // optional zum Testen
    public static void main(String[] args) {
        System.out.println(getMax( 7, 42, 13)); // gibt 42 aus
    }
}
