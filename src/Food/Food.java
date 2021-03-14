package Food;

public abstract class Food {
    protected int satisfying;
    protected int energyRecovery;
    protected String nameEat;

    public int getSatisfying() {
        return satisfying;
    }

    public void setSatisfying(int satisfying) {
        this.satisfying = satisfying;
    }

    public int getEnergyRecovery() {
        return energyRecovery;
    }

    public void setEnergyRecovery(int energyRecovery) {
        this.energyRecovery = energyRecovery;
    }

    public String getNameEat() {
        return nameEat;
    }

    public Food(int satisfying, int energyRecovery){
        this.satisfying=satisfying;
        this.energyRecovery=energyRecovery;
        this.nameEat="";
    }


}
