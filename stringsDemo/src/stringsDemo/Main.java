package stringsDemo;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj);
		System.out.println("Eleman sayısı : " + mesaj.length());// mesaj karekterinde kaç tane eleman var
		System.out.println("5.eleman : " + mesaj.charAt(4));// yazdığın elemanların 5.si ne
		System.out.println(mesaj.concat("Yaşasın"));// mesaj ifadesi ile birleştir
		System.out.println(mesaj.startsWith("B"));// bu karekter B ile başlıyor mu
		System.out.println(mesaj.endsWith("A"));// bu karekter A ile bitiyor mu
		char[] karakterler = new char[5];//0dan 4 e kadar karakterler ata
		mesaj.getChars(0, 5,karakterler, 0); // 0 dan basla 5 e kadar ata
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));//karakterin kaçıncı elemanda olduğunu gösterir
		System.out.println(mesaj.lastIndexOf("e"));//e ile biten aramaya en sağdan başlar
	}

}
