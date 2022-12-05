package project6;

public class Mammal extends Animal implements Sounds {
	private String name;
	
	public Mammal (String name, String sound, int age) {
		this.name = name;
		this.sound = sound;
		this.age = age;
	}
	
	public Mammal() {
		name = "unknown";
		sound = "unknown";
		age = 0;
	}
	
	/* (non-Javadoc)
	 * @see Sounds#makeSound()
	 */
	public void makeSound() {
		System.out.println("I am " + name + 
			 " and I " + sound);
	}

	@Override
	public int calcHumanAge() {
		return age*7;
	}
	
	

}
