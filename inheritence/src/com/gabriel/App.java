package com.gabriel;

public class App {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();

		Animal dog2 = new Dog();
		Animal cat2 = new Cat();
		
		dog.bark();
		
		cat.purr();

	}

}
