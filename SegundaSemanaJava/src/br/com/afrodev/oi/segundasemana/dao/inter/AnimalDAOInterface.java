package br.com.afrodev.oi.segundasemana.dao.inter;

import java.util.ArrayList;

import br.com.afrodev.oi.segundasemana.models.Animal;

public  interface AnimalDAOInterface {
	
	public Animal buscarAnimal(Integer identificador);

	public Animal buscarAnimalPorNome(String nome);

	public int deletarAnimal(Animal animal);

	public int cadastrarAnimal(Animal animal);

	public int cadastrarAnimal(ArrayList<Animal> animais);

	public ArrayList<Animal> consultarAnimais();

	public int deletarAnimal(ArrayList<Animal> animais);
	
	
}
