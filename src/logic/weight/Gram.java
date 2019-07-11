package logic.weight;

import logic.UnitName;

public class Gram extends Weight {

    public Gram(double size) {
        super(size);
        setUnitName(UnitName.GRAM);
    }

    public Gram(Kilogram Kilogram){
        super(Kilogram.getSize()*1000);
        setUnitName(UnitName.GRAM);
    }

    public Gram(Gram gram){
        super(gram.getSize());
        setUnitName(UnitName.GRAM);
    }

    public Gram(Milligram milligram){
        super(milligram.getSize()/1000);
        setUnitName(UnitName.GRAM);
    }
}
