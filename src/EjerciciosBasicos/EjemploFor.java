package EjerciciosBasicos;

public class EjemploFor {
	public static void main(String[] args) {
        // Cuenta básica del 1 al 10
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d ", i);
        }
        System.out.println();
        
        // Cuenta básica del 1 al 10 saltando de 2 en 2
        for(int i = 1; i <= 10; i += 2){
            System.out.printf("%d ", i);
        }
        System.out.println(); 
        
        for(int i = 1; i <= 10; i++ ){
            if(i % 2 == 0) {
                System.out.printf("%d ", i);
            }
        }
	}
}
