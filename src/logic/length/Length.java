package logic.length;

import logic.Unit;

public class Length extends Unit {


    Length(double size) {
        super(size);
    }

    public double getLength(){
        return this.getSize();
    }
}
