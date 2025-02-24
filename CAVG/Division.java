class Division {
    double div1;
    double div2;
    Division() {
    }
    public double getDiv1() {
        return div1;
    }
    public void setDiv1(double div1) {
        this.div1 = div1;
    }
    public double getDiv2() {
        return div2;
    }
    public void setDiv2(double div2) {
        this.div2 = div2;
    }
    @Override
    public String toString() {
        return "Division [div1=" + div1 + ", div2=" + div2 + "]";
    }
}