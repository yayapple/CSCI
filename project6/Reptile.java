package project6;

public class Reptile implements Sounds {
	
	private String type;
	
	public Reptile(String type){
		this.type = type;
		
	}
	public void makeSound() {
		System.out.println("I make no sounds except hissing.");
	}

}
