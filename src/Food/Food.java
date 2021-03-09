package Food;

public abstract class Food {
    protected int satisfying;
    protected int energyRecovery;

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

    public Food(int satisfying, int energyRecovery){
        this.satisfying=satisfying;
        this.energyRecovery=energyRecovery;
    }


}
