public class Main {
    public static void main(String[] args) {
        Fighter WalterWhite = new Fighter();
        WalterWhite.setName("Walter");
        Combo combyha = new Combo();
        combyha.addTechnic(0, 2);
        combyha.addTechnic(1, 1);
        combyha.addTechnic(2, 2);
        combyha.addTechnic(3, 3);
        combyha.addTechnic(4, 3);
        combyha.removeTechnic(4);
        WalterWhite.setCombo(combyha);
        WalterWhite.doCombo();
        combyha.showCombination();
    }
}