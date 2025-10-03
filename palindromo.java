public class palindromo {

    public static boolean esPalindromo(String cadena,int inicio, int fin){
        if (inicio>= fin) {
            return true;            
        }
        if (cadena.charAt(inicio) == cadena.charAt(fin)) {
            return esPalindromo(cadena, inicio + 1, fin - 1);
        }
        return false;
    }

    public static void main(String[] args) {
        String cadena = "reconocer";
        if (esPalindromo(cadena, 0, cadena.length() - 1 )) {
            System.out.println(cadena + " es un palindromo");
        } else {
            System.out.println(cadena + " no es un palindromo ");
        }
            
        } 
}