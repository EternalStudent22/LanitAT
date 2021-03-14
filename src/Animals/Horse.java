package Animals;

public class Horse extends  Herbivore implements Voice,Run{


    public Horse(String name, int weight, int unitsHunger, int unitsPower) {
        super(name, weight, unitsHunger, unitsPower);
    }

    public String voice(){
        return name+": делает игого";
    }

    @Override
    public String agressionVoice() {
        return name+":делает игиго агрессивно";
    }

    public void run(){
        if(unitsHunger>0 && unitsPower>0){
            unitsPower-=4;
            unitsHunger-=3;
            System.out.println(name+":Бегает");}
        else if(unitsPower<=0){
            System.out.println(name+":устал,нужно поесть");
        }else if(unitsHunger<=0){
            System.out.println(name+":голодный,нужно поесть");
        }
    }

    @Override
    public void walk() {
        if(unitsHunger>0 && unitsPower>0){
            unitsPower-=2;
            unitsHunger-=2;
            System.out.println(name+":Ходит");}
        else if(unitsPower<=0){
            System.out.println(name+":устал,нужно поесть");
        }else if(unitsHunger<=0){
            System.out.println(name+":голодный,нужно поесть");
        }
    }
}
