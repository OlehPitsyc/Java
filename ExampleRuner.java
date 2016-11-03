package com.qagroup.lec2oop;

import java.util.Arrays;
import java.util.List;

public class ExampleRuner {

	public static void main(String[] args) {
		Animal animal = new Animal("Dog");
		animal.giveVoice();
		animal.move();
		Animal sharkAnimal = new Animal("Shark");
		sharkAnimal.giveVoice();
		sharkAnimal.move();
		System.out.println();
		Dog dog = new Dog();
		dog.giveVoice();
		dog.move();
		System.out.println();
		Duck duck = new Duck();
		duck.giveVoice();
		duck.move();
		System.out.println();
		Shark shark = new Shark();
		shark.giveVoice();
		shark.move();
		System.out.println();
		;
		Animal someAnimal = new Shark();// someAnimal буде посилати на всі
										// методи класу Shark даному випадку
										// move,
										// якщо нема такого методу в цьому класі
										// буде використовуватись такий
										// метод батьківського класу
		someAnimal.move();
		System.out.println();
		someAnimal = new Dog();
		someAnimal.move();
		System.out.println();
		someAnimal = new Duck();
		someAnimal.move();

		//List<Animal> animals1 = Arrays.asList(new Dog(), new Shark(), new Duck());
		//List<Animal> animals = getSomeAnimals();
		System.out.println();
		for (Animal something : getSomeAnimals()) {
			something.giveVoice();
		}

//		List<Animal> animals = Arrays.asList(new Dog(), new Shark(), new Duck());{
//			{		return animals;

	

	}

	public static List<Animal> getSomeAnimals() {
		List<Animal> animals = Arrays.asList(new Dog(), new Shark(), new Duck());
		return animals;
	}
}
