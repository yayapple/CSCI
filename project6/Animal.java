package project6;

public abstract class Animal {
	
	protected String sound;
	protected int age;
	
	/**
	 * @return The sound the animal makes.
	 */
	public String getSound() {return sound;}

	public void setSound(String sound) {this.sound = sound;}

	public int getAge() {return age;}

	public void setAge(int age) {this.age = age;}

	public abstract int calcHumanAge();

}
