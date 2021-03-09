package Animals;

public class Fish extends Carnivorous implements Swim {

    public Fish(String name, int weight, int unitsHunger, int unitsPower) {
        super(name, weight, unitsHunger, unitsPower);
    }

    public void swim(){
        if(unitsHunger>0 && unitsPower>0){
            unitsPower-=3;
            unitsHunger-=4;
            System.out.println(name+":Плавает");}
        else if(unitsPower<=0){
            System.out.println(name+":устал,нужно поесть");
        }else if(unitsHunger<=0){
            System.out.println(name+":голодный,нужно поесть");
        }
    }
}
