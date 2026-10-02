package src;
public interface Boveda<T> { 
	void guardar(T elemento);   // agrega un elemento 
	T sacar();                  
	boolean estaVacia(); 
	int tamanio(); 
} 
