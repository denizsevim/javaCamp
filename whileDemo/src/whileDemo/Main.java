package whileDemo;

public class Main {

	public static void main(String[] args) {
		// for
		for (int i = 1; i < 10; i++) {

			System.out.println(i);

		}

		System.out.println("Döngü bitti");
		
		
		//while döngüsü
		int i = 2;
		while (i<10) {//while şart sağlanmıyorsa asla çi,		,ii	,i,,	,alışmaz

			System.out.println(i);
			i += 2;

		}
		System.out.println("while döngüsü bitti");
		
		//Do while
		int j=1;
		do {
			System.out.println(j);
			j+=2;
			
			}while (j<10);
		System.out.println("do-while döngüsü bitti");
		

	}

}
