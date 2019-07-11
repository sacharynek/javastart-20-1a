package logic.weight;

import logic.UnitName;

public class Kilogram extends Weight {

    public Kilogram(double size) {
        super(size);
        setUnitName(UnitName.KILOGRAM);
    }

    public Kilogram(Kilogram kilogram){
        super(kilogram.getSize());
        setUnitName(UnitName.KILOGRAM);
    }
    public Kilogram(Gram gram){
        super(gram.getSize()/1000);
        setUnitName(UnitName.GRAM);
    }
    public Kilogram(Milligram miligram){
        super(miligram.getSize()/1000000);
        setUnitName(UnitName.MILIGRAM);
    }
}
