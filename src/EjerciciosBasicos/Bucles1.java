package EjerciciosBasicos;

public class Bucles1 {
	public static void main(String[] args) {
		int multipoDe = 17;
		int numInicial = 315;
		int numFinal = 9_100_000;

		int contador = 0;

		for(int i = numInicial; i <= numFinal; i++) {
			if(i % multipoDe == 0) {
				contador++;
			}
		}

		System.out.printf("Entre %d y %d hay %d múltiplos de %d.%n",
				numInicial, numFinal, contador, multipoDe);

		int i = numInicial;
		contador = 0;
		while(i <= numFinal) {
			if(i % multipoDe == 0) {
				contador++;				
			}
			i++;
		}
		System.out.printf("Entre %d y %d hay %d múltiplos de %d.%n",
				numInicial, numFinal, contador, multipoDe);

		int j = numInicial;
		contador = 0;

		do {
			if(j % multipoDe == 0) {
				contador++;		
			}
			j++;
		} while(j <= numFinal);
		System.out.printf("Entre %d y %d hay %d múltiplos de %d.%n",
				numInicial, numFinal, contador, multipoDe);
	}
	public static void main1(String[] args) {

int multiploDe = 5;
int numInicial = 25;
long numFinal = 35;
long contador = 0;

// A lo bestia
for(long i = numInicial; i <= numFinal; i++) {
	if(i % multiploDe == 0) contador++;
}

System.out.printf("Entre %d y %d hay %d múltiplos de %d.%n",
		numInicial, numFinal, contador, multiploDe);

// Un poco optimizado
long i = numInicial;
contador = 0;
for(; i <= numFinal; i++) {
	if(i % multiploDe == 0) {contador++;break;}
}
for(i = i + multiploDe; i <= numFinal; i+=multiploDe) {
	contador++;
}

System.out.printf("Entre %d y %d hay %d múltiplos de %d.%n",
		numInicial, numFinal, contador, multiploDe);
	
		
	}
}
