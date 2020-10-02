package com.task.Inheritance;

import java.util.ArrayList;
import java.util.List;

import com.task.Animal.Animal;

import animal.birds.Birds;
import animal.birds.Eagle;
import animal.fish.Eel;
import animal.fish.Fish;
import animal.reptile.Crocodile;
import animal.reptile.Reptile;

public class Inheritance {

	
	public static void main(String[] args) {
		
		/*
		Animal an= new Animal();
		System.out.println(an.showInfo());
		
		Reptile rep = new Reptile();
		System.out.println(rep.showInfo());
		
		Crocodile cro = new Crocodile();
		System.out.println(cro.showInfo());
		
		Eel eel = new Eel();
		System.out.println(eel.showInfo());
		
		Eagle eagle = new Eagle();
		System.out.println(eagle.showInfo());*/
		
		/*
		Fish fish = new Fish();
		System.out.println(fish.showInfo());
		
		Birds bird = new Birds();
		System.out.println(bird.showInfo());
		
		*/
		
		/*executes child class(Eel) method
		Fish a = new Eel();
		System.out.println(a.showInfo());*/
		
		//Polymorphism
		
		List<Animal> animals =  new ArrayList<>();
		
		Animal an= new Animal();
		Animal rep = new Reptile();
		Animal cro = new Crocodile();
		Animal eel = new Eel();
		Animal eagle = new Eagle();
		
		animals.add(an);
		animals.add(rep);
		animals.add(rep);
		animals.add(eel);
		animals.add(eagle);
		
		listAnimals(animals);
		
	}
	
	public static void listAnimals(List<Animal> animals) {
		for (Animal animal : animals) {
			System.out.println(animal.showInfo());
		}
	}

}
