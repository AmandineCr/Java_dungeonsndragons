package Character;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char carac;
        int i;
        String str;
        Scanner sc = new Scanner(System.in);

        Character character = createCharacter();

        do {
            System.out.println(
                    "Que voulez vous faire ?" +
                            "\n\t1 - Afficher le personnage" +
                            "\n\t2 - Modifier le personnage"
            );
            i = sc.nextInt();
            switch (i) {
                case 1:
                    System.out.println(character.toString());
                    break;
                case 2:
                    editCharacter(character);
                    break;
                default:
                    System.out.println("Fatal error ! ");
            }
        } while (i != '1' && i != '2');
    }

    private static Character createCharacter() {
        int i;
        Scanner sc = new Scanner(System.in);
        Character character = null;

        do {
            System.out.println(
                    "Quel type de perso ? \n" +
                            "\t1 - Guerrier \n" +
                            "\t2 - Magicien"
            );

            i = sc.nextInt();

            switch (i) {
                case 1:
                    character = new Warrior();
                    break;
                case 2:
                    character = new Magician();
                    break;
                default:
                    System.out.println("Mauvais choix, veuillez réessayer");
            }
        } while (i != 1 && i != 2);

        System.out.println("FIN de création du personnage ! ");

        return character;
    }

    private static void editCharacter(Character character) {
        boolean cancel = false;
        int i;
        String str;
        Scanner sc = new Scanner(System.in);
        Magician magician = null;
        Warrior warrior = null;

        if (character instanceof Magician) {
            magician = (Magician) character;
        } else if (character instanceof Warrior) {
            warrior = (Warrior) character;
        }

        do {
            System.out.println(
                    "Modifier : " +
                            "\n\t1 - Nom" +
                            "\n\t2 - Vie"
            );
            if (magician != null) {
                System.out.println(
                        "\t3 - Attaque" +
                                "\n\t4 - Potion" +
                                "\n\t5 - Sort"
                );
            } else if (warrior != null) {
                System.out.println(
                        "\t3 - Force" +
                                "\n \t4 - Bouclier" +
                                "\n \t5 - Arme"
                );
            }
            System.out.println(
                    "\t6 - retour"
            );

            i = sc.nextInt();

            switch (i) {
                case 1:
                    System.out.println("Nouveau nom :");
                    str = sc.nextLine();
                    character.setNom(str);
                    System.out.println("Success, nouveau nom : " + character.getNom());
                    break;
                case 2:
                    System.out.println("Nouvelle vie :");
                    i = sc.nextInt();
                    character.setLife(i);
                    System.out.println("Success, nouvelle vie : " + character.getLife());
                    break;
                case 6:
                    cancel = true;
                    break;
                default:
                    if (character instanceof Magician) {
                        switch (i) {
                            case 3:
                                System.out.println("Nouvelle attaque :");
                                i = sc.nextInt();
                                magician.setAttack(i);
                                System.out.println("Success, nouvelle attaque : " + magician.getAttack());
                                break;
                            case 4:
                                System.out.println("Nouvelle potion :");
                                i = sc.nextInt();
                                magician.setPotion(i);
                                System.out.println("Success, nouvelle potion : " + magician.getPotion());
                                break;
                            case 5:
                                System.out.println("Sort :");
                                break;
                            default:
                                break;
                        }
                    } else if (character instanceof Warrior) {
                        switch (i) {
                            case 3:
                                System.out.println("Nouvelle force :");
                                i = sc.nextInt();
                                warrior.setForce(i);
                                System.out.println("Success, nouvelle force : " + warrior.getForce());
                                break;
                            case 4:
                                System.out.println("Nouveau bouclier :");
                                i = sc.nextInt();
                                warrior.setShield(i);
                                System.out.println("Success, nouveau bouclier : " + warrior.getShield());
                                break;
                            case 5:
                                System.out.println("Arme :");
                                break;
                        }
                    }
            }
        } while (!cancel);
    }
}
