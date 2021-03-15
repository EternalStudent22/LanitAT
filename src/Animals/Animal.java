package Animals;


import CastomExeption.WrongFoodException;
import Food.Food;


public abstract class Animal {
    protected String name;
    protected int weight;
    protected int unitsHunger;
    protected int unitsPower;
    protected int size;

    public int getSize(){
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getUnitsHunger() {
        return unitsHunger;
    }

    public void setUnitsHunger(int unitsHunger) {
        this.unitsHunger = unitsHunger;
    }

    public int getUnitsPower() {
        return unitsPower;
    }

    public void setUnitsPower(int unitsPower) {
        this.unitsPower = unitsPower;
    }

    public Animal(String name, int weight, int unitsHunger, int unitsPower,int size){
        this.name=name;
        this.weight=weight;
        this.unitsHunger=unitsHunger;
        this.unitsPower=unitsPower;
        this.size=size;
    }

    public int hashCode(){
        int hash=15;
                hash=hash*14+this.name.hashCode();;
        return  hash;
    }

    public boolean equals(Object obj){
        if(this==obj) {
            return true;
        }

        return false;
    }

    public abstract void eat(Food food) throws WrongFoodException;


}


