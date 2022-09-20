package deniz;

public class Main {

	public static void main(String[] args) {
		
		
		

		System.out.println("Hello world!");
		
	    // değişkenler camelCase modla yazılır 
		
		String ortaMetin= "ilginizi çekebilir";
		String altMetin="Vade süresi";
		
		System.out.println(ortaMetin);
		
		int  vade =12;
		
		double dolarDun=18.10;
		double dolarBugun=18.10;
		
		
		boolean dolarDustumu = false;
		
		String okYonu= "";
		
		
		
		if (dolarBugun<dolarDun) {
		    okYonu= "down.svg";
		    System.out.println(okYonu);
			
		}else if(dolarBugun>dolarDun){
		okYonu= "up.svg";
		System.out.println(okYonu);
		}
		
		 else {
		 okYonu= "equal.svg";
		System.out.println(okYonu);
		
		}
		
		//veriler listesi  array denir. []içinde gösterilir.Gerçek bilgiler databaseden gelir.
		
		String[]krediler={"Hızlı Kredi","Maaşını Halkbanktan alan","Mutlu Emekli"};
		
		
		
		
		//birşeyi bir şarta göre tekrarlama yazmaiçin for kullanılır
		
		for (int i = 0; i < krediler.length; i++) {
		System.out.println(krediler[i]);
			
		}
		
	}

}

