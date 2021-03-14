package Animals;

public class Tiger extends Carnivorous implements Voice,Run{

    public Tiger(String name, int weight, int unitsHunger, int unitsPower) {
        super(name, weight, unitsHunger, unitsPower);
    }

    public String voice(){
        return name+" делает ры-ры-мур-мур";
    }

    @Override
    public String agressionVoice() {
        return name+":делает ар-ар-арарар сейчас съем";
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

    @Override
    public void walk() {
        if(unitsHunger>0 && unitsPower>0){
            unitsPower-=1;
            unitsHunger-=2;
            System.out.println(name+":Ходит");}
        else if(unitsPower<=0){
            System.out.println(name+":устал,нужно поесть");
        }else if(unitsHunger<=0){
            System.out.println(name+":голодный,нужно поесть");
        }
    }
}
