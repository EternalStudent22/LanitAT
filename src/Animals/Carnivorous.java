package Animals;
import CastomExeption.WrongFoodException;
import Food.Food;
import Food.Grass;


public abstract class Carnivorous extends Animal {


    public Carnivorous(String name, int weight, int unitsHunger, int unitsPower,int size) {
        super(name, weight, unitsHunger, unitsPower,size);
    }

    public void eat(Food food) throws WrongFoodException {
        if(food instanceof Grass){
            throw new WrongFoodException(name+" не есть:"+food.getNameEat()+ " он хищник");
        }else{
            unitsHunger+=food.getSatisfying();
            unitsPower+=food.getEnergyRecovery();
            System.out.println(name+" поел:"+food.getNameEat()+
                    " и прибавил энергии:"+food.getEnergyRecovery()+" и восстановил сытость на "+
                    food.getSatisfying());
        }
    }
}
