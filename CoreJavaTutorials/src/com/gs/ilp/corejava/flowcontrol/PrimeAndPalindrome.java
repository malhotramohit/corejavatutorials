package com.gs.ilp.corejava.flowcontrol;

import java.util.Scanner;

public class PrimeAndPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch, k;
		while (true) {
			System.out.println("01. Prime no");
			System.out.println("02. Palindrome no");
			System.out.println("03. Quit");
			System.out.print("Enter Your Choice : ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.print("Enter A Number:");
				k = sc.nextInt();
				int d = 2;
				boolean b = true;
				while (d <= k / 2) {
					if (k % d == 0) {
						b = false;
						break;
					}
					d++;
				}
				if (b) {
					System.out.print(k + " is a prime Number");
				} else {
					System.out.print(k + " is not a prime Number");
				}
				break;
			case 2:
				System.out.print("Enter A Number:");
				k = sc.nextInt();
				int rev = 0, temp = k;
				while (temp > 0) {
					rev = (rev * 10) + (temp % 10);
					temp /= 10; // temp=temp/10
				}
				if (k == rev) {
					System.out.println(k + " is a palindrom No.");
				} else {
					System.out.println(k + " is not a palindrom No.");
				}
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Wrong Entry");
			}
		}
	}
}