package Animals;

public class Tyranasaurus extends Carnivorous implements Voice,Run{

    public Tyranasaurus(String name, int weight, int unitsHunger, int unitsPower) {
        super(name, weight, unitsHunger, unitsPower);
    }

    public String voice(){
        return name+"ар-ара-я-тероназаврус";
    }

    @Override
    public String agressionVoice() {
        return name+":рыыыыыыыыыыы съем, беги";
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

    @Override
    public void walk() {
        if(unitsHunger>0 && unitsPower>0){
            unitsPower-=2;
            unitsHunger-=3;
            System.out.println(name+":Ходит");}
        else if(unitsPower<=0){
            System.out.println(name+":устал,нужно поесть");
        }else if(unitsHunger<=0){
            System.out.println(name+":голодный,нужно поесть");
        }
    }
}
