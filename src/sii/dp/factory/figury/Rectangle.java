package sii.dp.factory.figury;

import java.math.BigDecimal;

public class Rectangle implements Figure {

	@Override
	public BigDecimal getCircuit(BigDecimal... numbers) {
		BigDecimal result = BigDecimal.ZERO;
		for (BigDecimal number : numbers) {
			result = result.add(number);
			result = result.add(number);
		}

		return result;
	}

	@Override
	public String toString() {
		return "czworokąta";
	}
}
