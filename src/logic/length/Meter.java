package logic.length;

import logic.UnitName;

public class Meter extends Length {

    private double size;



    public Meter(double size) {
        super(size);
        setUnitName(UnitName.METER);
    }

    public Meter(Meter meter){
        super(meter.getSize());
        setUnitName(UnitName.METER);
    }

    public Meter(Centymeter centymeter) {
        super(centymeter.getSize()/100);
        setUnitName(UnitName.METER);
    }

    public Meter(Millimeter millimeter){
        super(millimeter.getSize()/100000);
        setUnitName(UnitName.METER);
    }



}
