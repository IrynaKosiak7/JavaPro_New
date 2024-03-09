package de.telran.summary0223;

import java.util.Arrays;

public class SuperheroBattle {
    public static void main(String[] args) {
        Superhero superhero1 = new Superhero("Iron Man",50, new Weapon("Iron", 50), new Protection("Armor", 67));
        Superhero superhero2 = new Superhero("Thor", 70, new Weapon("Thunder", 50), new Protection("Mjölnir",100));
        Superhero superhero3 = new Superhero("Black Widow" , 20, new Weapon(" Stark agent", 20), new Protection("Body", 50));

        EvilCreature evilCreature1 = new EvilCreature("Loki", 20, 45);
        EvilCreature evilCreature2 = new EvilCreature("Tanos", 120, 56);
        EvilCreature evilCreature3 = new EvilCreature("Falcon's eye", 40, 51);

        superhero1.inroduce();
        superhero2.inroduce();
        evilCreature1.inroduce();
        evilCreature2.inroduce();
        System.out.println(evilCreature1.toString());

        System.out.println("----------------");

        superhero1.fight(superhero2);
        superhero2.fight(superhero1);

        evilCreature1.fight(evilCreature2);
        evilCreature2.fight(evilCreature1);

        superhero2.fight(evilCreature1);
        superhero1.fight(evilCreature1);
        superhero3.fight(evilCreature3);

        System.out.println("----------------");

        System.out.println(EvilCreature.generateRandomEvilCreature());
        superhero1.fight(EvilCreature.generateRandomEvilCreature());
        evilCreature2.fight(EvilCreature.generateRandomEvilCreature());
        superhero1.fight(EvilCreature.generateRandomEvilCreature());
        EvilCreature.generateRandomEvilCreature().fight(evilCreature1);

        System.out.println("----------------");
        Mag mag = new Mag("Merlin", 70, 60, 120);
        mag.heal(superhero2);
        Character[] characters = {superhero1, superhero2, superhero3};
        mag.heal(characters);
        System.out.println(superhero1);
        mag.applySpell(superhero1, Spells.INSPIRE);
        System.out.println(superhero1);

        System.out.println(superhero2);
        mag.applySpell(superhero2, Spells.REVIVE);
        System.out.println(superhero2);

    }
}
