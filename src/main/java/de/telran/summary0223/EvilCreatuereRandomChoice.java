package de.telran.summary0223;

public enum EvilCreatuereRandomChoice {
    LOKI(20, 45),
    TANOS(120, 56),
    FALCONS_EYE(40, 55);
    int force;
    int protection;

    EvilCreatuereRandomChoice(int force, int protection) {
        this.force = force;
        this.protection = protection;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }
}
