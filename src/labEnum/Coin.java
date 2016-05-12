/**
 * 
 */
package labEnum;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * @author Cyanuro
 *
 */
public enum Coin {
	
	CENT(2.500, 19.05),
	NICKEL(5.000, 21.21),
	DIME(2.268, 17.91), 
	QUARTER(5.670, 24.26);
	
	private double diameter;
	private double weight;
	private DecimalFormat roundingFormat;
	
	private Coin(double weight, double diameter) {
		
		this.diameter = diameter;;
		this.weight = weight;
		
	}
	
	public double roundingCoinMode(double d) {
		
		roundingFormat = new DecimalFormat("0.0");
		roundingFormat.setRoundingMode(RoundingMode.HALF_UP);
		
		return Double.valueOf(roundingFormat.format(d));
	}
	
	@Override
	public String toString() {
		
		return String.format(this.name() + " w: " + roundingCoinMode(weight) +
				" d: " + roundingCoinMode(diameter));
		
	}
}
