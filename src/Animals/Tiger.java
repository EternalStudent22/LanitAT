package Animals;

public class Tiger extends Carnivorous implements Voice,Run{

    public Tiger(String name, int weight, int unitsHunger, int unitsPower) {
        super(name, weight, unitsHunger, unitsPower);
    }

    public String voice(){
        return name+" делает ры-ры-мур-мур";
    }

    public void run(){
        if(unitsHunger>0 && unitsPower>0){
            unitsPower-=4;
            unitsHunger-=4;
            System.out.println(name+":Бегает");}
        else if(unitsPower<=0){
            System.out.println(name+":устал,нужно поесть");
        }else if(unitsHunger<=0){
            System.out.println(name+":голодный,нужно поесть");
        }
    }
}
