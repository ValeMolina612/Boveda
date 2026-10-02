public class Main {
    public static void main(String[] args) {
        System.out.println("iniciando la boveda");

        // obtener los resultados
        int resultadoFactorial = Recursion.factorial(5);         // 120
        int resultadoSuma = Recursion.sumaDigitos(493);          // 16
        String resultadoInvertir = Recursion.invertirTexto("boveda"); // "adevob"

        // crear la bobeda
        Boveda<Object> bovedaSecreta = new BovedaArreglo<>(3);

        // Guardar los resultados
        bovedaSecreta.guardar(resultadoFactorial);
        bovedaSecreta.guardar(resultadoSuma);
        bovedaSecreta.guardar(resultadoInvertir);

        // Sacar y imprimir los resultados
        System.out.println("\nExtrayendo elementos de la bóveda:");
        System.out.println("invertirTexto(\"boveda\") = " + bovedaSecreta.sacar());
        System.out.println("sumaDigitos(493) = " + bovedaSecreta.sacar());
        System.out.println("factorial(5) = " + bovedaSecreta.sacar());

        // Pruebar
        System.out.println("\n¿Se encuentra el 120 en la bóveda?: " + bovedaSecreta.buscar(120));
        
        System.out.println("\n¡LA BOVEDA SE ABRIO!");
    }
}