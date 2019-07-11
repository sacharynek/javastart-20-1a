package logic.length;

import logic.UnitName;

public class Millimeter extends Length {

    public Millimeter(double size) {
        super(size);
        setUnitName(UnitName.MILIMETER);
    }


    public Millimeter(Meter meter) {
        super(meter.getSize() * 100000);
        setUnitName(UnitName.MILIMETER);
    }

    public Millimeter(Centymeter centymeter) {
        super(centymeter.getSize() * 1000);
        setUnitName(UnitName.MILIMETER);
    }

    public Millimeter(Millimeter millimeter) {
        super(millimeter.getSize());
        setUnitName(UnitName.MILIMETER);
    }
}
