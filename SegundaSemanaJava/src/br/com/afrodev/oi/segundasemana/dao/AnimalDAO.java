package br.com.afrodev.oi.segundasemana.dao;

import java.util.ArrayList;

import br.com.afrodev.oi.segundasemana.dao.inter.AnimalDAOInterface;
import br.com.afrodev.oi.segundasemana.models.Animal;;

public class AnimalDAO implements AnimalDAOInterface {

	private ArrayList<Animal> animais;

	public AnimalDAO() {

		this.animais = new ArrayList<>();
	}

	public ArrayList<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}

	public Animal buscarAnimal(Integer identificador) {
		// TODO Auto-generated method stub
		return null;
	}

	public Animal buscarAnimalPorNome(String nome) {
		Animal retorno = null;
		for (Animal a : animais) {
			if (a.getNome().toUpperCase().equals(nome.toLowerCase())) {

			}
		}
		return retorno;
	}

	public int deletarAnimal(Animal animal) {
		if (animal != null) {
			this.animais.remove(animal);
			return 1;
		}
		return 0;
	}

	public int deletarAnimal(ArrayList<Animal> animais) {
		if (animais.size() > 0) {
			this.animais.removeAll(animais);
			return 1;
		}
		return 0;
	}

	public int cadastrarAnimal(Animal animal) {
		if (animal != null) {
			this.animais.add(animal);
			return 1;
		}
		return 0;
	}

	public int cadastrarAnimal(ArrayList<Animal> animais) {
		if (animais.size() > 0) {
			this.animais.addAll(animais);
			return 1;
		}
		return 0;
	}

	public ArrayList<Animal> consultarAnimais() {
		// TODO Auto-generated method stub
		return animais;
	}

}
