package Animals;
import Food.Food;
import Food.Grass;

public class Carnivorous extends Animal {


    public Carnivorous(String name, int weight, int unitsHunger, int unitsPower) {
        super(name, weight, unitsHunger, unitsPower);
    }

    public void eat(Food food) {
        if(food instanceof Grass){
            System.out.println(name+" не есть травку");
        }else{
            unitsHunger+=food.getSatisfying();
            unitsPower+=food.getEnergyRecovery();
            System.out.println(name+" поел и прибавил энергии:"+food.getEnergyRecovery()+" и восстановил сытость на "+
                    food.getSatisfying());
        }
    }
}
