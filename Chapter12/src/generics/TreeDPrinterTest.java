package generics;

import java.util.ArrayList;

public class TreeDPrinterTest {

	public static void main(String[] args) {
			
			TreeDPrinter<Powder>	printer = new TreeDPrinter<Powder>();
			printer.setMaterial(new Powder());
		
//		Powder powder = (Powder)printer.getMaterial(); // Object -> Powder
										// 다운캐스팅 해줘야함 
		// 모든 참조형을 쓰고싶으면 Object로 쓰면 된다. 
			Powder powder = printer.getMaterial(); 
			System.out.println(printer);
			
			
			TreeDPrinter<Plastic>	printerPlastic = new TreeDPrinter<Plastic>();
			printerPlastic.setMaterial(new Plastic());
		
			Plastic plastic = printerPlastic.getMaterial(); 
			System.out.println(printerPlastic);
			
			/*
			TreeDPrinter<Water>	printerWater = new TreeDPrinter<Water>();
			printerWater.setMaterial(new Water());
		
			Water water = printerWater.getMaterial(); 
			System.out.println(printerWater);
			*/
			printerPlastic.printing();
			
			ArrayList list = new ArrayList(); // 제네릭을 안쓰면 Object로 간주함
			
			
	}
}
