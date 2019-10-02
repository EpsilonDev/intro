import animal.Animal;

public class TestAnimal {
	
	public static void main(String[] args) {
		
		Animal A = new Animal();
		Animal B = new Animal();
		Animal C = new Animal("Cat",5,4,50,1);
		
		System.out.println( "Le nombre des animaux est : "+Animal.nbrAnimal );
		
		System.out.println(C);
	}

}
