package Day31_ArrayList.Otopark;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        OtoparkNEW belediyeOtoPark = new OtoparkNEW();

        UserInterface ui = new UserInterface(belediyeOtoPark,new Scanner(System.in));
        ui.start();
    }
}
