package EjerciciosBasicos;

public class OperadoresAritmeticos2 {
	public static void main(String[] args) {
		double x = 88, y = 3.5, z = -5.2;

		System.out.println("a) x + y + z = " + (x + y + z));
		System.out.println("b) 2 * y + 3 * (x - z) = " 
				+ (2 * y + 3 * (x - z)));
		System.out.println("c) x / y = " + (x / y));
		System.out.println("d) x % y = " + (x % y));
		System.out.println("e) x / (y + z) = " + (x / (y + z)));
		System.out.println("f) (x / y) + z = " + ((x / y) + z));
		System.out.println("g) 2 * x / 3 * y = " + (2 * x / 3 * y));
		System.out.println("h) 2 * x / (3 * y) = " + (2 * x / (3 * y)));
		System.out.println("i) x * y % z = " + (x * y % z));
		System.out.println("j) x * (y % z) = " + (x * (y % z)));
		System.out.println("k) 3 * x - z - 2 * x = "
				+ (3 * x - z - 2 * x));
		System.out.println("l) 2 * x / 5 % y) = " 
				+ (2 * x / 5 % y));
		System.out.println("m) x - 100 % y % z = " 
				+ (x - 100 % y % z));
		System.out.println("n) x - y - z * 2 = " + (x - y - z * 2));
	}
	
	public static void main1(String[] args) {
		System.out.printf("a) x + y + z = %f%n", x + y + z);
		System.out.printf("b) 2 * y + 3 * (x - z) = %f%n", 2 * y + 3 * (x - z));
		System.out.printf("c) x / y = %f%n", x / y);
		System.out.printf("d) x %% y = %f%n", x % y);
		System.out.printf("e) x / (y + z) = %f%n", x / (y + z));
		System.out.printf("f) (x / y) + z = %f%n", (x / y) + z);
		System.out.printf("g) 2 * x / 3 * y = %f%n", 2 * x / 3 * y);
		System.out.printf("h) 2 * x / (3 * y) = %f%n", 2 * x / (3 * y));
		System.out.printf("i) x * y %% z = %f%n", x * y % z);
		System.out.printf("j) x * (y %% z) = %f%n", x * (y % z));
		System.out.printf("k) 3 * x - z - 2 * x = %f%n", 3 * x - z - 2 * x);
		System.out.printf("l) 2 * x / 5 %% y) = %f%n", 2 * x / 5 % y);
		System.out.printf("m) x - 100 %% y %% z = %f%n", x - 100 % y % z);
		System.out.printf("n) x - y - z * 2 = %f%n", x - y - z * 2);
	}
}
