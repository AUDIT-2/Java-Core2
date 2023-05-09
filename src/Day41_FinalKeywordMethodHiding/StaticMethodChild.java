package Day41_FinalKeywordMethodHiding;

public class StaticMethodChild extends StaticMethodParent{
    //static metodlar override edilemezler. Ancak hide edilebilirler
    //parent access modifier default olduğundan,
    //child class ta default, protected ya da public olabilir
    protected static void methodParent(){ //Parent class static method methodParent() is hided.
      System.out.println("Child static method.");
    }

    public static void main(String[] args) {
        StaticMethodParent.methodParent();
        StaticMethodChild.methodParent();
    }
}
