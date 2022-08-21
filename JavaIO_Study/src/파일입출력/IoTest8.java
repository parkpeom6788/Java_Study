package 파일입출력;

import java.util.Scanner;
public class IoTest8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열 입력");
		String inputString = scanner.nextLine();
		System.out.println(inputString);
		System.out.println();
		
		System.out.println("정수 입력");
		int inputInt = scanner.nextInt();
		System.out.println(inputInt);
		System.out.println();

		System.out.println("실수입력");
		double inputDouble = scanner.nextDouble();
		System.out.println(inputDouble);
	}
}
