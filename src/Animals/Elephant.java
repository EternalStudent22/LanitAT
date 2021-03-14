package Animals;

public class Elephant extends Herbivore implements Voice,Run{

    public Elephant(String name, int weight, int unitsHunger, int unitsPower) {
        super(name, weight, unitsHunger, unitsPower);
    }

    public void run(){
        if(unitsHunger>0 && unitsPower>0){
            unitsPower-=2;
            unitsHunger-=3;
        System.out.println(name+":Бегает");}
        else if(unitsPower<=0){
            System.out.println(name+":устал,нужно поесть");
        }else if(unitsHunger<=0){
            System.out.println(name+":голодный,нужно поесть");
        }
    }

    public void walk(){
        if(unitsHunger>0 && unitsPower>0){
            unitsPower-=1;
            unitsHunger-=1;
            System.out.println(name+":Ходит");}
        else if(unitsPower<=0){
            System.out.println(name+":устал,нужно поесть");
        }else if(unitsHunger<=0){
            System.out.println(name+":голодный,нужно поесть");
        }
    }

    public String voice(){
        return name+":дудит в хобот";
    }

    @Override
    public String agressionVoice() {
        return name+":дудит агрессивно";
    }
}
