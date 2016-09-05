package com.paul.controller;

public class test {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 7, 9, 10, 11, 13, 15, 17 };
		int index = dohalf(arr, 15);

		System.out.println(index);

	}

	private static int dohalf(int[] arr, int i) {
		int max, min, mid;
		min = 0;
		max = arr.length - 1;

		mid = (min + max) / 2;

		while (arr[mid] != i) {

			if (arr[mid] > i)
				max = mid;
			if (arr[mid] < i)
				min = mid;

			if (max < min)
				return -1;
			mid = (max + min) / 2;
		}
		return mid;
	}
}
