package main.howToUseLambdaExpressions;

import java.util.ArrayList;
import java.util.List;

public class NotUseLambdaExpressions {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		for (int i: list) {
			System.out.println(i*2);
		}
		long end = System.currentTimeMillis();
		System.out.println("excuting time is " + (end - start) + "ms");
	}
}
