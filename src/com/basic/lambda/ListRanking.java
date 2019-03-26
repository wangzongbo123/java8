package com.basic.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName: ListRanking
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: Andy
 * @date: 2019年3月26日 下午9:28:46
 * @Copyright: 2019. All rights reserved.
 */
public class ListRanking {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
		Collections.sort(names, (a, b) -> b.compareTo(a));
		System.out.println(names);

		/*
		 * List<String> names2 = Arrays.asList("asd", null, "anndsaa", "miassdke",
		 * "qqwxenia"); names2.sort(Comparator.nullsLast(String::compareTo));
		 * names2.stream().filter(name
		 * ->!name.equals("anndsaa")).collect(Collectors.toList());
		 * System.out.println(names2.toString());
		 */
        List<String> list1 = new ArrayList();
        list1.add("1");
        list1.add("1");
        list1.add("2");
        list1.add("3");
 
        List<String> collect = list1.stream().filter(s -> !s.equals("1")).collect(Collectors.toList());
        System.out.println(collect.toString());

	
	
	}

}
