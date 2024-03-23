package com.ZoologicoActividad;

public class Mammal {
	protected int energyLevel = 100;
	
	public Mammal(int energyLevel){ //constructor
		this.energyLevel = energyLevel;
		
	}
	
	
	public int displayEnergy() { //Imprime nivel del gorila
		System.out.println("El nivel de la energia es: " + energyLevel);
		return energyLevel; 
	}


	
	//Getters and Setters
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}



}
