package logic;

public abstract class Unit {

    private double size;
    private UnitName unitName;

    public Unit(double size){
        this.size = size;
    }

    public double getSize(){
        return this.size;
    }

    private UnitName getUnitName(){
        return this.unitName;
    }

    protected void setUnitName(UnitName unitName){
        this.unitName = unitName;
    }


    @Override
    public String toString(){
        return this.getSize()+" "+this.getUnitName();
    }
}
