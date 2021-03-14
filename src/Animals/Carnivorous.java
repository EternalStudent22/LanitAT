package Animals;
import Food.Food;
import Food.Grass;

public abstract class Carnivorous extends Animal {


    public Carnivorous(String name, int weight, int unitsHunger, int unitsPower) {
        super(name, weight, unitsHunger, unitsPower);
    }

    public void eat(Food food) {
        if(food instanceof Grass){
            System.out.println(name+" не есть:"+food.getNameEat()+ " он хищник");
        }else{
            unitsHunger+=food.getSatisfying();
            unitsPower+=food.getEnergyRecovery();
            System.out.println(name+" поел:"+food.getNameEat()+
                    " и прибавил энергии:"+food.getEnergyRecovery()+" и восстановил сытость на "+
                    food.getSatisfying());
        }
    }
}
