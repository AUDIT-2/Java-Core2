/*
 *
 *  *  * Copyright (c) 2023.
 *  *  * SDET JAVA-13 Java Core
 *  *  * Armada-prog
 *  *  * armada.dscrd@gmail.com
 *
 */

package Day37_REVIEW_ClassObjectStaticClassMembers.Encapsulation;

public class City {
    private int cityPlateNumber;
    private String cityName;

    /**
     * Paremeterized constructor
     * @param cityPlateNumber plate number property of City Class
     * @param cityName city name property of City Class
     */
    public City(int cityPlateNumber, String cityName) {
        setCityPlateNumber(cityPlateNumber);
        setCityName(cityName);
    }

    //Copy constructor
    public City(City city){
        setCityPlateNumber(city.getCityPlateNumber());
        setCityName(city.getCityName());
    }
    /**
     *
     * @return city name as String
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * private setter method to set/update the cityName parameter of Class
     * @param cityName parameter
     */
    private void setCityName(String cityName) {
        this.cityName = cityName.toUpperCase();
    }

    /**
     *
     * @return plate number of Class as int type
     */
    public int getCityPlateNumber() {
        return cityPlateNumber;
    }

    /**
     * private setter method to set/update the cityPlateNumber parameter of Class
     * @param cityPlateNumber parameter
     */
    private void setCityPlateNumber(int cityPlateNumber) {
        this.cityPlateNumber = cityPlateNumber;
    }

    /**
     *
     * @return String type full name cityPlateNumber + cityName
     */
    public String getFullCityName(){
        if(getCityName() !=null){
            return getCityPlateNumber() + "-" + getCityName();
        }
        return "";
    }

    @Override
    public String toString(){
        return getFullCityName();
    }
}
