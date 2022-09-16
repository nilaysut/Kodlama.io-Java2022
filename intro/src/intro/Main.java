package intro;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello world!");
		
		//Java'da değisken adları camelCase formatında yazılır
		String ortaMetin ="İlginizi çekebilir";
		String altMetin = "Vade süresi"	;
		
		System.out.println(ortaMetin);
		
		//integer
		int vade = 12;
		
		double dolarDun = 18.25;
		double dolarBugun = 18.30;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) { //true
			okYonu = "down.svg";
			System.out.println(okYonu);
			
		} else if (dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);	
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		//array(diziler)
		
		String[] krediler = {"Hızlı Kredi", "Maasını Halkbanktan", "Mutlu Emekli"};
		
		//Diziyi ekrana yazdırmanın ilkel yolu
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
			
		}
		
	}

}
