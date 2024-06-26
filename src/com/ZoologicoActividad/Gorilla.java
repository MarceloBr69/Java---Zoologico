package com.ZoologicoActividad;

public class Gorilla extends Mammal {
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	public void throwSomething() {
		System.out.println("El gorila ha lanzado algo. Su nivel de energia disminuye en 5");
		energyLevel -= 5;
	}
	public void eatBananas() {
		System.out.println("El gorila ha comido un platano. Su satisfaccion provoca un aumento de su energia en 10");
		energyLevel += 10;
	}
	public void climb() {
		System.out.println("El gorila ha trepado. Su nivel de energia disminuye en 10");
		energyLevel -= 10; 
	}
}
