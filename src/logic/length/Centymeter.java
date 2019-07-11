package logic.length;

import logic.UnitName;

public class Centymeter extends Length {

    public Centymeter(double size) {
        super(size);
        setUnitName(UnitName.CENTYMETER);
    }


    public Centymeter(Meter meter) {
        super(meter.getSize() * 100);
        setUnitName(UnitName.CENTYMETER);
    }

    public Centymeter(Centymeter centymeter) {
        super(centymeter.getSize());
        setUnitName(UnitName.CENTYMETER);
    }

    public Centymeter(Millimeter millimeter) {
        super(millimeter.getSize() / 1000);
        setUnitName(UnitName.CENTYMETER);
    }
}
