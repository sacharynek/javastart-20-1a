package logic.weight;

import logic.Unit;

public class Weight extends Unit {

    Weight(double size) {
        super(size);
    }

    public double getWeight(){
        return this.getSize();
    }
}
