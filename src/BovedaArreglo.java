package src;
public class BovedaArreglo<T> implements Boveda<T> {
    private T[] elementos;
    private int tope;

    @SuppressWarnings("unchecked")
    public BovedaArreglo(int capacidad) {
        elementos = (T[]) new Object[capacidad];
        tope = 0;
    }

    @Override
    public void guardar(T elemento) {
        if (tope >= elementos.length) {
            throw new IllegalStateException("¡La bóveda está llena! No se pueden almacenar más elementos.");
        }
        elementos[tope++] = elemento;
    }

    @Override
    public T sacar() {
        if (estaVacia()) {
            throw new IllegalStateException("¡La bóveda está vacía! No hay elementos para extraer.");
        }
        tope--;
        T elemento = elementos[tope];
        elementos[tope] = null; 
        return elemento;
    }

    @Override
    public boolean estaVacia() {
        return tope == 0;
    }

    @Override
    public int tamanio() {
        return tope;
    }

    @Override
    public boolean buscar(T elemento) {
        return buscarRecursivo(elemento, 0);
    }

    private boolean buscarRecursivo(T elemento, int indice) {
        if (indice >= tope) {
            return false;
        }
        if ((elementos[indice] == null && elemento == null) || 
            (elementos[indice] != null && elementos[indice].equals(elemento))) {
            return true;
        }
        return buscarRecursivo(elemento, indice + 1);
    }
}