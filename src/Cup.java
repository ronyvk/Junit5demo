public class Cup {

    String liquidType;
    double percentFull;

    public Cup(String liquidType, double percentFull) {
        this.liquidType = liquidType;
        this.percentFull = percentFull;
    }

    public String getLiquidType() {
        return liquidType;
    }

    public void setLiquidType(String liquidType) {
        if(liquidType == null){
            return;
        }
        this.liquidType = liquidType;
    }

    public double getPercentFull() {
        return percentFull;
    }
    boolean isEmpty(){
        return percentFull ==0;
    }

    public void setPercentFull(double percentFull) {
        if(percentFull >100 || percentFull < 0 ){
            throw new IllegalArgumentException("Percentage must be with in range");
        }
        this.percentFull = percentFull;
    }
}
