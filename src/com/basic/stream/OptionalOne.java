package com.basic.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**   
 * @ClassName:  OptionalOne   
 * @Description:TODO(������һ�仰��������������)   
 * @author: Andy
 * @date:   2019��3��26�� ����10:38:37       
 * @Copyright: 2019. All rights reserved. 
 */
public class OptionalOne {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		names.forEach(name ->Optional.of("anna").isPresent());
		Optional.of("test").isPresent();
	}

}



