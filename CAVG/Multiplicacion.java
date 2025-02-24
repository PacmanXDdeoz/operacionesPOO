class Multiplicacion {
    int mult1;
    int mult2;
    Multiplicacion() {
    }
    public int getMult1() {
        return mult1;
    }
    public void setMult1(int mult1) {
        this.mult1 = mult1;
    }
    public int getMult2() {
        return mult2;
    }
    public void setMult2(int mult2) {
        this.mult2 = mult2;
    }
    @Override
    public String toString() {
        return "Multiplicacion [mult1=" + mult1 + ", mult2=" + mult2 + "]";
    }
}