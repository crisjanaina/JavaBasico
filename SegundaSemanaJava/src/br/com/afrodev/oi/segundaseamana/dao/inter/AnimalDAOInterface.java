package br.com.afrodev.oi.segundaseamana.dao.inter;

import java.util.ArrayList;

import br.com.afrodev.oi.segundaseamana.models.Animal;

public  interface AnimalDAOInterface {
	
	public Animal buscarAnimal(Integer identificador);

	public Animal buscarAnimalPorNome(String nome);

	public int deletarAnimal(Animal animal);

	public int cadastrarAnimal(Animal animal);

	public int cadastrarAnimal(ArrayList<Animal> animais);

	public ArrayList<Animal> consultarAnimais();

	public int deletarAnimal(ArrayList<Animal> animais);
	
	
}
