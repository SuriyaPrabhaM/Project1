package org.demo;

public class DemoCode {
	public static void main(String[] args) {
		String s = "Greens@123";
		String s1 = "Tambaram";
		s = s + s1;
		char temp = 0;
		char[] c = s.toCharArray();
		// int c[] = {50,80,70,10,60};
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (c[j] > c[i]) {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		System.out.println("After Sorting");
		for (char d : c) {
			System.out.println(d);
		}

		String q = "hello to java class";
		String[] split = q.split(" ");
		for (String q1 : split) {
			System.out.println(q1);
		}

	System.out.println("good afternoon");
		System.out.println("welcome");

	}
	
}
