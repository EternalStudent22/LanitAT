package Animals;

import Food.Food;

public abstract class Animal {
    protected String name;
    protected int weight;
    protected int unitsHunger;
    protected int unitsPower;

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

    public Animal(String name, int weight, int unitsHunger, int unitsPower){
        this.name=name;
        this.weight=weight;
        this.unitsHunger=unitsHunger;
        this.unitsPower=unitsPower;
    }

    public abstract void eat(Food food);


}


