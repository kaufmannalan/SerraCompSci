public class Main {

    public static void main(String[] args) {

        Fighter playerA = new Fighter("Fredericka McWhirr");
        playerA.showStats();

        Mage playerB = new Mage("Skeletor");
        playerB.showStats();

        Paladin playerC = new Paladin("Thonk Thunderhamerr");
        playerC.showStats();

        Priest playerD = new Priest("Sh'ar M'kal-masal-safari, The Radiant, Md.");
        playerD.showStats();
        
        Priest playerE = new Druid("Zephyr Whitefeather");
        playerE.showStats();


        System.out.println(PlayerCharacter.numCharacters());

    }
}
