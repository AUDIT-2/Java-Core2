/*
 *
 *  *  * Copyright (c) 2023.
 *  *  * SDET JAVA-13 Java Core
 *  *  * Armada-prog
 *  *  * armada.dscrd@gmail.com
 *
 */

package Day37_REVIEW_ClassObjectStaticClassMembers.Encapsulation;

import java.util.ArrayList;

public class CitiesReadOnly {

    final static ArrayList<City> cities;

    // STATIC BLOCK
    // Database connection and retrieving data from database
    // File reading and assigning data to relevant properties of Class
    // More complex operations than Constructor
    // Setting Default/Initials values of Class
    static {
        cities = new ArrayList<>();

        cities.add(new City(1, "Adana"));
        cities.add(new City(2, "Adıyaman"));
        cities.add(new City(6,"Ankara"));
        cities.add(new City(7,"Antalya"));
        cities.add(new City(20,"Denizli"));
        cities.add(new City(34,"İstanbul"));
        cities.add(new City(35,"İzmir"));
        cities.add(new City(71,"Kırıkkale"));
    }

    /**
     * This method returns ArrayList of City objects
     * @return new ArrayList<>(cities)
     */
    public static ArrayList<City> getCities() {
        return new ArrayList<>(cities); //Returns copy of original  ArrayList of cities not the original
    }

    /**
     * Traverse cities ArrayList to search plateNumber
     * if matching element(City type object) found method returns City object
     * Otherwise returns new City(0,"No city found!")
     * @param plateNumber takes int type parameter
     * @return City type object
     */
    public static City findByPlateNumber(int plateNumber){
        for(City city : getCities()){
            if(city.getCityPlateNumber() == plateNumber){
                return city;
            }
        }
        return new City(0,"No city found!");
    }

    /**
     * Traverse cities ArrayList to search plateNumber
     * if matching element(City type object) found method returns City object name property as string
     * Otherwise returns "No city found!"
     * @param plateNumber takes int type parameter
     * @return String
     */
    public static String findByPlateNumberStr(int plateNumber){
        for(City city : getCities()){
            if(city.getCityPlateNumber() == plateNumber){
                return city.getCityName();
            }
        }
        return "No city found!";
    }

    /**
     * Traverse cities ArrayList to search plateNumber
     * if matching element(City type object) found method returns City object
     * Otherwise returns new City(0,"No city found!")
     * @param cityName takes String type parameter
     * @return  copy of City Object not the original one for security reason
     */
    public static City findByCityName(String cityName){
        for(City city : getCities()){
            if(city.getCityName().equalsIgnoreCase(cityName)){
                //return city;
                return new City(city); //Returns a copy of city object not the original-Copy Constructor invoked/Called
            }
        }
        return new City(0,"No city found!");
    }

    /**
     * Populate City object data from cities ArrayList and returns the populated data as String
     * @return String
     */
    public static String getCitiesAsString() {
        String str = "List of All Cities with plate numbers\n";
        str += "-------------------------------------\n";

        for (City city : getCities()) {
            str += city.getFullCityName() + "\n";
        }
        return str;
    }

    /**
     * Main method to test
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(getCitiesAsString());

        System.out.println("findByPlate(34).getFullCityName() = " + findByPlateNumber(4).getFullCityName());
        System.out.println("findByCityName(\"Ankara\").getFullCityName() = " + findByCityName("Ankara").getFullCityName());

        System.out.println("findByPlateNumberStr(34) = " + findByPlateNumberStr(34));
        System.out.println("findByPlateNumberStr(340) = " + findByPlateNumberStr(340));
        for (City city : getCities()){
            System.out.println(city.getFullCityName());
        }
    }
}
