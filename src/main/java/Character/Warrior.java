package Character;

import java.util.Scanner;

public class Warrior extends Character {
    private int force, shield;
    private Sword sword;

    public int getForce() {
        return force;
    }

    public Sword getSword() {
        return sword;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public void setForce(int force) {
        this.force = force + this.sword.getStrength();
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public String hit() {
        return "Je tape à l'épée" + getNom();
    }

    public String toString() {
        return super.toString() + "\nshield :" + getShield() + "\nforce :" + getForce() + "\narme :" + getSword().toString();
    }

    Warrior() {
        int i;
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez un montant de bouclier : ");
        i = sc.nextInt();
        this.setShield(i);

        System.out.println("Création de l'épée ");
        this.setSword(new Sword());
        sc.nextLine();
        System.out.println("Nom de votre épée :");
        str = sc.nextLine();
        this.getSword().setNom(str);

        System.out.println("Force de l'arme");
        i = sc.nextInt();
        this.getSword().setStrength(i);

        System.out.println("FIN de création de l'arme ! ");

        System.out.println("Saisissez un montant de force : ");
        i = sc.nextInt();
        this.setForce(i);
    }
}
