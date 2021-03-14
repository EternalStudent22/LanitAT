import Animals.Carnivorous;
import Animals.Herbivore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Aviary<Animal> {
    private Map<String,Animal > Aviary=new HashMap<>();

    public void addAnimal(String name,Animal animal){
        Aviary.put(name,animal);
    }

    public Map<String, Animal> getAviary() {
        return Aviary;
    }

    public void deleteAnimal(String name){
        Aviary.remove(name);
    }

}
