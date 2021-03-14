package Animals;

public class Duck extends Herbivore implements Voice,Swim,Fly {

    public Duck(String name, int weight, int unitsHunger, int unitsPower) {
        super(name, weight, unitsHunger, unitsPower);
    }

    public void fly(){
        if(unitsHunger>0 && unitsPower>0){
        unitsHunger-=2;
        unitsPower-=2;
        System.out.println(name+":Летает");}
        else if(unitsPower<=0){
            System.out.println(name+":устал,нужно поесть");
        }else if(unitsHunger<=0){
            System.out.println(name+":голодный,нужно поесть");
        }
    }

    @Override
    public void fastFly() {
        if(unitsHunger>0 && unitsPower>0){
            unitsHunger-=4;
            unitsPower-=4;
            System.out.println(name+":Летает на пределе");}
        else if(unitsPower<=0){
            System.out.println(name+":устал,нужно поесть");
        }else if(unitsHunger<=0){
            System.out.println(name+":голодный,нужно поесть");
        }
    }

    public String voice(){
        return name+":делает кря-кря";
    }

    @Override
    public String agressionVoice() {
        return name+":делает агрессивное кря";
    }

    public void swim(){
        if(unitsHunger>0 && unitsPower>0){
        unitsHunger-=1;
        unitsPower-=1;
        System.out.println(name+":Плавает");}
        else if(unitsPower<=0){
        System.out.println(name+":устал,нужно поесть");
    }else if(unitsHunger<=0){
        System.out.println(name+":голодный,нужно поесть");
    }
    }

    @Override
    public void downSwim() {
        if(unitsHunger>0 && unitsPower>0){
            unitsHunger-=2;
            unitsPower-=1;
            System.out.println(name+":Ныряет");}
        else if(unitsPower<=0){
            System.out.println(name+":устал,нужно поесть");
        }else if(unitsHunger<=0){
            System.out.println(name+":голодный,нужно поесть");
        }
    }
}
