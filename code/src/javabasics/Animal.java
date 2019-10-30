package javabasics;

class Animal {
	String family;
	static String color;
	float speed;
	int hornNo;

	void run() {
		System.out.println("Cheetah is the fastest animal!!");
	}

	void size() {
		System.out.println("Whale is the largest animal!!");
	}

	public static void main(String[] args) {
//		int a = new Animal().hornNo;
//		System.out.println(a);
		Animal a = new Animal();
		System.out.println(a.family);
		System.out.println(color);
		System.out.println(a.speed);
		System.out.println(a.hornNo);
		color = "red";
		System.out.println(color);
		a.run();
		a.size();
	}
}