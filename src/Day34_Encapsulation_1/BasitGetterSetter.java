/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day34_Encapsulation_1;

public class BasitGetterSetter {
    /*
    public int number;
    public int result;
    */

    //Encapsulation
    private int number;
    private int result;

    public BasitGetterSetter(){
        setNumber(10);
    }
    public BasitGetterSetter(int number){
        //this.number = number;
        setNumber(number);
    }

    //Getter method to read the data members
    public int getNumber(){
        return number;
    }
    //Setter method to update/set the value of data members
    public void setNumber(int number){
        if (number > 100 || number <= 0){
            System.out.println("Number can not be less than and equals to 0 or can not be more than 100.");
        }else {
            this.number = number;
            setResult();
        }
    }
    private void setResult(){
        this.result = this.number * 2;
    }
    public int getResult(){
        return this.result;
    }
    public int veriOkuNumber(){
        return number;
    }
    public void guncelleNumber(int number){
        this.number = number;
    }

}
