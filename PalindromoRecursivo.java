public class PalindromoRecursivo {

    /**
     * Comprueba si una cadena es un palíndromo recursivamente.
     * @param str La cadena a verificar.
     * @return true si la cadena es un palíndromo, false en caso contrario.
     */
    public static boolean esPalindromo(String str) {
        // Normalizar la cadena (convertir a minúsculas y eliminar espacios/puntuación si fuera necesario)
        // Para este ejemplo, asumiremos que ya está normalizada.

        // Caso base 1: Cadena vacía o de un solo carácter es un palíndromo.
        if (str.length() <= 1) {
            return true;
        }

        // Compara el primer y el último carácter.
        char primerChar = str.charAt(0);
        char ultimoChar = str.charAt(str.length() - 1);

        // Caso base 2: Si los caracteres extremos no coinciden, no es un palíndromo.
        if (primerChar != ultimoChar) {
            return false;
        }

        // Caso recursivo: Si los caracteres extremos coinciden, llama al método
        // con la subcadena que excluye el primer y el último carácter.
        // El subproblema es `str.substring(1, str.length() - 1)`
        return esPalindromo(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        String palabra1 = "reconocer";
        String palabra2 = "hola";
        String palabra3 = "oso";
        String palabra4 = "a";
        String palabra5 = "";

        System.out.println(palabra1 + " es palíndromo: " + esPalindromo(palabra1)); // true
        System.out.println(palabra2 + " es palíndromo: " + esPalindromo(palabra2)); // false
        System.out.println(palabra3 + " es palíndromo: " + esPalindromo(palabra3)); // true
        System.out.println(palabra4 + " es palíndromo: " + esPalindromo(palabra4)); // true
        System.out.println(palabra5 + " es palíndromo: " + esPalindromo(palabra5)); // true
    }
}