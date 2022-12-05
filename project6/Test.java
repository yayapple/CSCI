package project6;

public class Test {

	public static void main(String[] args) {
		Mammal m1 = new Mammal("dog", "woof", 5);
		m1.makeSound();
		System.out.println(m1.calcHumanAge());
		System.out.println(m1.getAge());
		Reptile r1 = new Reptile("snake");
		r1.makeSound();
		
		Mammal s1 = new Mammal("cat", "meow", 3);
		s1.makeSound();
		s1.getAge();
		
	}
}
