package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Our List:");
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println(list);
		System.out.println("Our number:");
		int number = sc.nextInt();
		System.out.println(findNumber(list, number));
		sc.close();
	}

	static boolean findNumber(List<Integer> list, int number) {
		for (Integer integer : list) {
			if (integer.equals(number)) {
				return true;
			}
		}
		return false;
	}
}