package Character;

import java.util.Scanner;

abstract public class Character implements Fighting {
    private String nom, image;
    private int life;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String toString() {
        return "nom :" + getNom() + "\nvie :" + getLife() + "\nimage : " + getImage();
    }

    Character() {
        int i;
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez un nom : ");
        str = sc.nextLine();
        this.setNom(str);

        System.out.println("Saisissez un niveau de vie : ");
        i = sc.nextInt();
        this.setLife(i);
    }
}

