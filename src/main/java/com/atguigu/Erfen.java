package com.atguigu;

public class Erfen {

	public static int binarySearch(int[] dataset, int data, int beginIndex, int endIndex) {
		int midIndex = (beginIndex + endIndex) / 2;
		if (data < dataset[beginIndex] || data > dataset[endIndex] || beginIndex > endIndex) {
			return -1;
		}
		if (data < dataset[midIndex]) {
			return binarySearch(dataset, data, beginIndex, midIndex - 1);
		} else if (data > dataset[midIndex]) {
			return binarySearch(dataset, data, midIndex + 1, endIndex);
		} else {
			return midIndex;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 6, 12, 33, 87, 90, 97, 108, 561 };
		System.out.println("递归查找" + binarySearch(arr, 3, 87, arr.length - 1));
	}

}
