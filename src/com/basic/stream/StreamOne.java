package com.basic.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

/**   
 * @ClassName:  StreamOne   
 * @Description:TODO(������һ�仰��������������)   
 * @author: Andy
 * @date:   2019��3��28�� ����1:11:27       
 * @Copyright: 2019. All rights reserved. 
 */
public class StreamOne {

	public static <E> void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("test");
//		list.add("");
		list.add("elase");
		list.add("yellow");
		list.add("red");
		list.add("gread");
		//�Դ�����ÿ��Ԫ��ִ�в���
		list.forEach(System.out::println);
		System.out.println("*********");
		//��������˸���ν��ƥ��Ĵ�����Ԫ����ɵ���
		list.stream().filter(l ->!l.isEmpty()).forEach(System.out::println);
//
		boolean allMatch = list.stream().allMatch((l)->l.contains("e"));
		System.out.print(allMatch);
//
		boolean anyMatch = list.stream().anyMatch(l->l.startsWith("r"));
		System.out.println(anyMatch);
		
//
		long count = list.stream().count();
		System.out.println(count);
		
//		Builder<Object> builder = Stream.builder();
//		builder.accept(list);
//		Builder<Object> add = builder.add(list.add("asdfgf"));
//		Stream<Object> build = add.build();
//		System.err.println("--------------------");
//		build.forEach(System.out::println);
		System.err.println("--------------------");
		HashSet<String> set = new HashSet<String>();
		set.add("set1");
		set.add("set2");
		Builder<Object> builder = Stream.builder();
		builder.add(list.add("test123")).accept(set);
		builder.build().forEach(s ->System.out.println(s));
		
		
	}

}
