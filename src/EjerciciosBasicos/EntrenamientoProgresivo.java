package EjerciciosBasicos;

public class EntrenamientoProgresivo {
	public static void main(String[] args) {
		System.out.println("Ejercicio #0001");
		for(int i=1; i <= 1_000; i += 100){
		    System.out.printf("%d ", i);
		}
		System.out.println();
	}
	public static void main1(String[] args) {
		System.out.println("Ejercicio #0002");
		// La suma de los XX elementos pedidos es yy.
		int suma = 0;
		int cantidad = 0;

		for(int i=1; i <= 1_000; i += 100){
		    cantidad++; // sumar 1 a la cantidad
		    suma += i; // sumar la cantidad a la suma
		}
		System.out.printf("La suma de los %d elementos pedidos es %d.%n", 
		    cantidad, suma);
	}
	public static void main2(String[] args) {

System.out.println("Ejercicio #0003");
// 1. Contar número de elementos que tendrá el array
int totalElementosArray = 0;
for(int num = 1; num <= 1_000; num += 100){
    totalElementosArray++;
}
// 2. Crear el array
int[] array3 = new int[totalElementosArray];

// 3. Llenar el array
//    i -> i * 100 + 1
// 1 101 201 301
for(int i = 0; i < array3.length; i++){
    array3[i] = i * 100 + 1;
}
// 4. Mostrar el array, pero al reves (empezando por el final)
for(int i = array3.length - 1; i >= 0; i--){
    System.out.printf("%d", array3[i]);
    
    if(i!=0){
        System.out.print("-");
    } 
}
	}
}
