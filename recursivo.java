public class recursivo {
    public static void mensaje(String cadena, int n) {
        if (n<=10) {
            System.out.println(n + " " + cadena);
            mensaje(cadena+ "-", n+1);
        }
    }

    public static void main(String[] args) {
        mensaje("-", 1);
    }
}
