package org.eclipse.example.calc.internal.operations;
import org.eclipse.example.calc.UnaryOperation;
/**
* x 2 operation
*/
public class XTwo extends AbstractOperation implements UnaryOperation  {
	
	@Override
	public String getName() {
		return "x 2";
	}

	@Override
	public float perform(float arg1) {
		return arg1 * 2;
	}

}