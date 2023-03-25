package Village;

public class TaxCalculator implements TaxCalculatorInterface{
	int interest = 1;
	@Override
	public int computeTax(int area) {
		return area*interest;
	}
	
}
