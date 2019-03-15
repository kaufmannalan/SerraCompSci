public class Main {

    public static void main(String[] args) {

        Fighter playerA = new Fighter("a");
        playerA.showStats();

        Mage playerB = new Mage("b");
        playerB.showStats();

        Paladin playerC = new Paladin("Thonk Thunderhamerr");
        playerC.showStats();

        Priest playerD = new Priest("Sh'ar M'kal-masal-safari");
        playerD.showStats();


        System.out.println(PlayerCharacter.numCharacters());

    }
}
