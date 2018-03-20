package Character;

public class Magician extends Character {
    private int attack, potion;
    private Spell spell;

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public int getAttack() {
        return attack;

    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getPotion() {
        return potion;
    }

    public void setPotion(int potion) {
        this.potion = potion;
    }


    public String hit() {
        return "Je lance un sort";
    }

    Magician() {
        setNom("Don Picollinni");
        setImage("");
        setLife(100);
        setSpell(new Spell());
        setAttack(10 + this.spell.getStrength());
        setPotion(50);
    }
}
