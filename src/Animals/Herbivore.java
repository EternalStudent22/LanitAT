package Animals;
import Food.Food;
import Food.Meat;

public abstract class Herbivore extends Animal {


    public Herbivore(String name, int weight, int unitsHunger, int unitsPower,int size) {
        super(name, weight, unitsHunger, unitsPower,size);
    }

    public void eat(Food food) {
        if(food instanceof Meat){
            System.out.println(name+" не ест:"+food.getNameEat()+ " он травоядный");
        }else{
            unitsHunger+=food.getSatisfying();
            unitsPower+=food.getEnergyRecovery();
            System.out.println(name+" поел:"+food.getNameEat()+" и восстановил энергии на "+food.getEnergyRecovery()+" и " +
                    "восстановил сытость на "+food.getSatisfying());
        }
    }
}
