package com.basic.lambda;

/**   
 * @ClassName:  Formula   
 * @Description:TODO(������һ�仰��������������)   
 * @author: Andy
 * @date:   2019��3��26�� ����9:14:44       
 * @Copyright: 2019. All rights reserved. 
 */
public class Formula implements MathMethod{

	public static void main(String[] args) {
	Formula formula = new Formula();
	double calculate = formula.calculate(10);
	System.out.println(calculate);

	}
	@Override
	public double calculate(int a) {
		return sqrt(a * 100);
	}

}
