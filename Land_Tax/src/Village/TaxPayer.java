package Village;

import Owner.OwnerClass;
import Owner.Rectangle;
import Owner.Shape;
import Owner.Triangle;

public class TaxPayer implements TaxPayerInterface{
	OwnerClass owner = new OwnerClass();
	TaxCalculator calculator1 = new TaxCalculator();
		
	public TaxPayer(OwnerClass owner, TaxCalculator calculator1) {
		this.owner = owner;
		this.calculator1 = calculator1;
	}
	@Override
	public int calculateLandMass() {
		return owner.calculateLandMass();
	}

	@Override
	public int calculateTax() {
		int landArea = owner.calculateLandMass();
		return calculator1.computeTax(landArea);
	}
}
