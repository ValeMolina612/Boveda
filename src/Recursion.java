public class Recursion {

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no está definido para negativos.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sumaDigitos(int n) {
        if (n < 0) {
            n = -n;
        }
        if (n < 10) {
            return n;
        }
        return (n % 10) + sumaDigitos(n / 10);
    }

    public static String invertirTexto(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return s.charAt(s.length() - 1) + invertirTexto(s.substring(0, s.length() - 1));
    }
}