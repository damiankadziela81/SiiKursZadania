package sii.dp.factory.figury;

import java.math.BigDecimal;

public interface Figure {
	BigDecimal getCircuit(BigDecimal... numbers);
	
	public String toString();

}
