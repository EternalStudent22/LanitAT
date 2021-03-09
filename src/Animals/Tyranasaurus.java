package Animals;

public class Tyranasaurus extends Carnivorous implements Voice,Run{

    public Tyranasaurus(String name, int weight, int unitsHunger, int unitsPower) {
        super(name, weight, unitsHunger, unitsPower);
    }

    public String voice(){
        return "ар-ара-я-тероназаврус";
    }

    public void run(){
        if(unitsHunger>0 && unitsPower>0){
            unitsPower-=5;
            unitsHunger-=5;
            System.out.println(name+":Бегает");}
        else if(unitsPower<=0){
            System.out.println(name+":устал,нужно поесть");
        }else if(unitsHunger<=0){
            System.out.println(name+":голодный,нужно поесть");
        }
    }
}
