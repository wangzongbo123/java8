package com.basic.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**   
 * @ClassName:  OptionalOne   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: Andy
 * @date:   2019年3月26日 下午10:38:37       
 * @Copyright: 2019. All rights reserved. 
 */
public class OptionalOne {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		names.forEach(name ->Optional.of("anna").isPresent());
		Optional.of("test").isPresent();
	}

}



