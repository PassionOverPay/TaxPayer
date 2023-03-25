package Village;

import Owner.OwnerClass;
import Owner.Rectangle;
import Owner.Shape;
import Owner.Square;

public class Main {

	public static void main(String[] args) {
		
		Village Palilula = new Village();
		TaxCalculator calculator1000 = new TaxCalculator();
		OwnerClass Sbahroy = new OwnerClass();
		TaxPayer Sbahroi = new TaxPayer(Sbahroy, calculator1000);
		TaxCalculator2000 calculator2000 = new TaxCalculator2000();
		Shape square = new Square();
		Shape rectangle  = new Rectangle();
		Sbahroy.add(square);
		Sbahroy.add(rectangle);
		Sbahroy.calculateLandMass();
		Palilula.add(Sbahroi);
		System.out.println(calculator1000.computeTax(Sbahroi.calculateLandMass()));
		System.out.println(calculator2000.computeTax(Sbahroi.calculateLandMass()));
	}

}
