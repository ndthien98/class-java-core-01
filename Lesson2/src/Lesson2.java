import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {
	public static void main(String[] args) {
		int a1, a2, b1, b2, c1, c2;

		float[] arrayFloat;
		char[] arrayChar; // String
		String string;// "thien"
		string = "thien"; // intialize
		string.length();

		String[] arrayString; // ["thien","hung" ...]

		// so phan tu

		// KieuDuLieu[] tenMang;
		// tenMang = new KieuDuLieu[length];
		Scanner sc = new Scanner(System.in);
		int[] arrayInt;// tao ra bien, chua cap bo nho
		// arrayInt = null
		int len;
		System.out.print("Nhap vao so phan tu cua mang: ");
		len = sc.nextInt();
		arrayInt = new int[len];// len == 10 => arrayInt = [10]
		// arrayInt = new int[10]; // [1,2,3,5,2,3,4,2,3,7] length = 10, index =
		// 0,1,2,3,4,5,6,7,8,9

		for (int i = 0; i < arrayInt.length; i++) { // arrayInt.length = 10
			arrayInt[i] = sc.nextInt();
		}
		for (int i = 0; i < arrayInt.length; i++) {
			System.out.println("arrayInt[" + i + "]: " + arrayInt[i]);
		}
		int max, min; // [1,2,3,1,2,-3,44,-5,6,8]
		// ... //
		// max = arrayInt[0]; // 1 2 3 3 3 3 44 44
		// min = arrayInt[0]; // 1 1 1 1 1 -3 -3 -5
		max = Integer.MIN_VALUE; // - 2^32
		min = Integer.MAX_VALUE; // 2^32-1

		// duyet mang
		for (int i = 0; i < arrayInt.length; i++) { // 0 1 2 3 4 5 6 7 8 9
			if (arrayInt[i] > max)
				max = arrayInt[i]; // arrayInt 1 2 3 1 2 -3 ...
			if (arrayInt[i] < min)
				min = arrayInt[i]; // arrayInt 1 2 3 1 2 -3 ...
			// System.out.println("MAX: " + max +"\tMIN: " + min + "\tarrayInt i: "
			// +arrayInt[i]);
		}

		System.out.println("Phan tu lon nhat la: " + max);
		System.out.println("Phan tu nho nhat la: " + min);

		// tim kiem
		int k = 9; // sc.nextInt()
		// in ra vi tri cua cac phan tu co gia tri = k
		boolean timthay = false;
		for (int i = 0; i < arrayInt.length; i++) {
			if (arrayInt[i] == k) {
				timthay = true;
				System.out.println("tim thay tai " + (i + 1));
				// "thien" + "hung" = "thienhung"
				// "tim thay tai " + (9 + 1) = "tim thay tai 91
			}
		}
		if (timthay) {
			System.out.println("tim thay!");
		} else {
			System.out.println("Khong tim thay");
		}
		//
		// sap xep
		// Arrays.sort(arrayInt);
		// ... //

		// 1 8 2 7 6 3 4 5
		// 1 2 8 7 6 3 4 5
		// 1 2 7 8 6 3 4 5
		// 1 2 7 6 8 3 4 5
		// ..
		// 1 2 7 6 3 4 5 8
		// 1
		// 2 .... 5

		// 1 8 2 7 6 3 4 5
		// 0
		// i = 8
		// k = 0 .. 7
//		for (int i = arrayInt.length - 1; i >= 0; i--) { // 7 => 0 
//			for(int j = 0;j<i;j++) {
//				if(arrayInt[j] > arrayInt[j+1]) {
//					int temp = arrayInt[j];
//					arrayInt[j] = arrayInt[j+1];
//					arrayInt[j+1] = temp;
//				}
//			}
//		}
		// 1 8 2 7 6 3 4 5
		// j < i
		// N * N
		// 0 array[0] ss array[j]
		// j = 0 .. 8
		// 1 array[1] ss array[j]
		// j = 1 .. 8
		for (int i = 0; i < arrayInt.length; i++) {
			for (int j = i; j < arrayInt.length; j++) {
				System.out.print(i + ":" + j);
				// so sanh va doi cho
				if (arrayInt[j] > arrayInt[i]) {
					System.out.println("Doi cho " + arrayInt[i] + "va" + arrayInt[j]);
					int temp = arrayInt[j];
					arrayInt[j] = arrayInt[i];
					arrayInt[i] = temp;
				} else {
					System.out.println("khong doi cho");
				}
				for (int kk = 0; kk < arrayInt.length; kk++) {
					System.out.print(arrayInt[kk]+":");
				}
				System.out.println();
			}
		}
		System.out.print("mang sau khi sap xep la: ");
		// duyet cac phan tu va in ra 
		for (int i = 0; i < arrayInt.length; i++) { 
			System.out.print(arrayInt[i] + ":");
		}
		char a;
		a = (char) sc.nextByte();
		System.out.println(a);
		// n * log2(n) || 1024 * 10 // bumble sort,
		// n * n || 1024 * 1024 // quick sort, heap sort, merge sort
		// sc.close();
	}
}
