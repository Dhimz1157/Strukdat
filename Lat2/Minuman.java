package Lat2;

import Lat2.Hidangan;

public class Minuman extends Hidangan {
    @Override
    public String disantap() {
        return this.getNamaHidangan()+"diminum";
    }
}
