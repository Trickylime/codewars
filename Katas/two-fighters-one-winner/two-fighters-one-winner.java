public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        while (true) {
            if (fighter1.name.equals(firstAttacker)) {
                fighter2.health -= (fighter1.damagePerAttack);
                firstAttacker = fighter2.name;
            } else {
                fighter1.health -= (fighter2.damagePerAttack);
                firstAttacker = fighter1.name;
            }
            if (fighter1.health <= 0) {
                return fighter2.name;
            }
            if(fighter2.health <= 0) {
                return fighter1.name;
            }
        }
    }
}