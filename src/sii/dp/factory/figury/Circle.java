package sii.dp.factory.figury;

import java.math.BigDecimal;

public class Circle implements Figure {

	@Override
	public BigDecimal getCircuit(BigDecimal... numbers) {
		BigDecimal result = null;
		//2*r*PI
		for (BigDecimal number : numbers) {
			result = number.multiply(BigDecimal.valueOf(2));
		}
		
		result = result.multiply(BigDecimal.valueOf(Math.PI));

		return result;
	}

	@Override
	public String toString() {
		return "koła";
	}
	
	

}
