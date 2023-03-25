package Village;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import Owner.OwnerClass;
import Owner.Shape;
/* class village to search and find a taxPayer
 * class taxPayer to computeTax - array list to buy and sell
 * 
 */
public class Village implements VillageInterface {
	private int totalTaxes = 0, area;
	private ArrayList<TaxPayer> taxPayer = new ArrayList<TaxPayer>();

	public TaxPayer findTaxPayer(int index) {
		return taxPayer.get(index);
	}

	public boolean add(TaxPayer e) {
		return taxPayer.add(e);
	}

	public TaxPayer remove(int index) {
		return taxPayer.remove(index);
	}

	public int calculateTotalTaxes() {
		for (TaxPayer taxPayer2 : taxPayer) {
			totalTaxes += taxPayer2.calculateTax();
		}
		return totalTaxes;
	}
}
