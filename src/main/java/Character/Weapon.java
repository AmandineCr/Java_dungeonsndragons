package Character;

abstract class Weapon {
    private String nom;
    private int strength;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String toString() {
        return "\n \tnom :" + getNom() + "\n \tpuissance :" + getStrength();
    }
}
