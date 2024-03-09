package de.telran.summary0223;

public class Mag extends EvilCreature implements HealingSkills, SpellSkills {
    private int level;

    public Mag(String name, int force, int protection, int level) {
        super(name, force, protection);
        this.level = level;
    }

    @Override
    public void heal(Character character) {
        character.setHealth(100);
        System.out.println(character.getName()+" healted with health " + character.getHealth());
    }

    @Override
    public void heal(Character[] characters) {
        for (int i = 0; i < characters.length ; i++) {
         heal(characters[i]);
        }
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void applySpell(Superhero hero, Spells spell) {
        switch (spell) {
            case CURSE -> {
                hero.setHealth((int)((hero.getHealth() * (1 - 0.1 * getLevel()))));
                System.out.println(hero.getName()+ " has new health" + hero.getHealth());
            }
            case REVIVE -> {
                 heal(hero);
                System.out.println(hero.getName()+ " healthed");
            }
            case INSPIRE -> {
                hero.setForce(hero.countForce() * (1 + 0.1 * getLevel()));
                System.out.println(hero.getName()+ " has new force" + hero.getForce());
            }
        }
    }

    @Override
    public void applySpell(Superhero[] heroes, Spells spell) {
        for (int i = 0; i < heroes.length ; i++) {
            heal(heroes[i]);
        }
    }
}
