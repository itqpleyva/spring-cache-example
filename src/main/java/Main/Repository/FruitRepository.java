package Main.Repository;

import Main.Model.Fruit;

public interface FruitRepository {

	Fruit getByName(String name);
}
