package Lat2;

import Lat2.Hidangan;

public class Makanan extends Hidangan {
    @Override
    public String disantap() {
        return this.getNamaHidangan()+"dimakan";
    }
}
