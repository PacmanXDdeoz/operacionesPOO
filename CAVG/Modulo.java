class Modulo {
    int mod1;
    int mod2;
    Modulo() {
    }
    public int getMod1() {
        return mod1;
    }
    public void setMod1(int mod1) {
        this.mod1 = mod1;
    }
    public int getMod2() {
        return mod2;
    }
    public void setMod2(int mod2) {
        this.mod2 = mod2;
    }
    @Override
    public String toString() {
        return "Modulo [mod1=" + mod1 + ", mod2=" + mod2 + "]";
    }
}