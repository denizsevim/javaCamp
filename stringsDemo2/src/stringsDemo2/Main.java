
package stringsDemo2;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj);

		String yeniMesaj = mesaj.replace(' ', '-');// karakterleri değiştirmek için
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 5));// mesajın 2.indeksinden itibaren yaz
		
		for(String kelime :mesaj.split(" ")) {
			System.out.println(kelime);
			
			
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase()); //veri tabanına arama yapmak için )

	}
}