package logic.weight;

import logic.UnitName;

public class Milligram extends Weight {

    public Milligram(double size) {
        super(size);
    }

    public Milligram(Kilogram kilogram){
        super(kilogram.getSize()*1000000);
        setUnitName(UnitName.MILIGRAM);
    }


    public Milligram(Gram gram){
        super(gram.getSize()*1000);
        setUnitName(UnitName.MILIGRAM);
    }

    public Milligram(Milligram milligram){
        super(milligram.getSize());
        setUnitName(UnitName.MILIGRAM);
    }
}
