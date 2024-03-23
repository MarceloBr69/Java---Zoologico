package com.ZoologicoActividad;

public class Bat extends Mammal {
	public Bat(int energyLevelBat) {
		super(energyLevelBat);
	}
	
	public void fly() {
		System.out.println("Chillido del bat al despegar");
		energyLevelBat -= 50; 
	}
	public void eatHumans() {
		System.out.println("Bueno, no importa");
		energyLevelBat += 25; 
	}
	public void attackTown() {
		System.out.println("Se escucha una ciudad en llamas");
		energyLevelBat -= 100;
	}
}
