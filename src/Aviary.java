
import Animals.Animal;

import java.util.HashMap;
import java.util.Map;

public class Aviary<Animal extends Animals.Animal> {
    private int size;
    private Map<String,Animal > Aviary=new HashMap<>();



    Aviary(int size){
        this.size=size;
    }

    public int getSize() {
        return size;
    }
    public Map<String, Animal> getAviary() {
        return Aviary;
    }

    public void addAnimal(String name, Animal animal){
        if(animal.getSize()>this.size){
            System.out.println(animal.getName()+":не помещается в этот вольер,нужно что-то побольше "+
                    animal.getSize()+" ,сейчас "+this.size);
            return;
        }else{
            Aviary.put(name,animal);
            System.out.println(animal.getName()+":помещен в вольер");
        }

    }
    public void deleteAnimal(String name){

        Aviary.remove(name);
        System.out.println(name+":удалили из вольера");
    }
    public Animal getAnimal(String name){
        return Aviary.get(name);
    }

}
