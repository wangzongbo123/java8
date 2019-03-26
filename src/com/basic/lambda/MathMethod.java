package com.basic.lambda;

/**
 * @ClassName: MathMethod
 * @Description:TODO(������һ�仰��������������)
 * @author: Andy
 * @date: 2019��3��26�� ����9:10:31
 * @Copyright: 2019. All rights reserved.
 */
public interface MathMethod {
	double calculate(int a);
	
	static int positive(int a) {
		return a > 0 ? a : 0;
	}
	
	default double sqrt(int a) {
		return Math.sqrt(positive(a));
	}
}