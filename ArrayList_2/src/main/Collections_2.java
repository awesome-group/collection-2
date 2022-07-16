package main;

import java.util.ArrayList;
import java.util.List;

public class Collections_2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(13);
		list.add(56);
		list.add(82);
		list.add(93);
		list.add(60);
		int number = 60;
		System.out.println(findNumber(list, number));
	}

	static boolean findNumber(List<Integer> list, int number) {
		for (int i = 0; i < list.size(); i++) {
			if (number == list.get(i)) {
				return true;
			}
		}
		return false;

	}
}
