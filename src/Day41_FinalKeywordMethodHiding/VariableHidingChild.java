package Day41_FinalKeywordMethodHiding;

public class VariableHidingChild extends VariableHidingParent{
    public String name = "Child isim"; //Parent class name variable is hided

    public void getName(){
        System.out.println("Child name variable  : " + this.name);
        System.out.println("Parent name variable : " + super.name);
    }
    public static void main(String[] args) {
        VariableHidingParent vrbParent = new VariableHidingParent();
        VariableHidingChild vrbChild = new VariableHidingChild();

        System.out.println("vrbChild.name = " + vrbChild.name);
        System.out.println("vrbChild.number = " + vrbChild.number);

        System.out.println("vrbParent.name = " + vrbParent.name);
        vrbChild.getName();
    }
}
