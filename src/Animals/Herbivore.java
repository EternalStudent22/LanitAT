package Animals;
import Food.Food;
import Food.Meat;

public class Herbivore extends Animal {


    public Herbivore(String name, int weight, int unitsHunger, int unitsPower) {
        super(name, weight, unitsHunger, unitsPower);
    }

    public void eat(Food food) {
        if(food instanceof Meat){
            System.out.println(name+" не может есть мясо");
        }else{
            unitsHunger+=food.getSatisfying();
            unitsPower+=food.getEnergyRecovery();
            System.out.println(name+" поел и восстановил энергии на "+food.getEnergyRecovery()+" и " +
                    "восстановил сытость на "+food.getSatisfying());
        }
    }
}
