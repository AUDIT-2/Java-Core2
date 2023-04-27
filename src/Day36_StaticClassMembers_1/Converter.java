package Day36_StaticClassMembers_1;

public class Converter {
    //Utility--Helper Class
    private Converter(){
        //Private access olduğundan bu constructor ile instance oluşturulamaz.
        //Static metodlar olduğundn class ismi ile metodlar çağrılabilir.
    }
    public static double milesToKilometers(double mile){
        return mile * 1.609;
    }
    public static double kilometersMiles(double km){
        return km / 1.609;
    }

    public static double fahrenheitToCelsius(double f){
        return (f-32) * 5/9;
    }

    public static double celsiusTofahrenheit(double c){
        return (c * 1.8 ) + 32;
    }

    public static double centimetersToInches(double cm){
        return cm * 0.39;
    }
    public static double inchesToCentimeters(double in){
        return in / 0.39;
    }

    public static double kdvHesapla(double miktar){
        return miktar * 0.18;
    }
    public static double boyKiloIndex(double boy, double kilo){
        return kilo /(boy * boy);
    }
}
