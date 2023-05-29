/*
 * Copyright (c) 2023.
 * SDET- 2 Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day47_Exception2.UserDefinedException;

public class Person {
    private String name;
    private String TCNO;
    private int age;
    private String address;

    //Constructor da exception handling yapmadığımız için Checked exceptionları throw ediyoruz. Constructor ı çağıran metodlar handling yapmalılar.
    public Person(String name, String TCNO, int age, String address) throws NameException,TCNOException {
        /*this.name = name;
        this.TCNO = TCNO;
        this.age = age;
        this.address = address;*/
        setName(name);
        setTCNO(TCNO);
        setAge(age);
        setAddress(address);
    }
    public String getName() {
        return name;
    }

    //Checked exception olduğundan bu metodu çağıranlar compile-time da handling mekanizması kurmak zorundadır.
    public String setName(String name) throws NameException {
        if(name.isBlank() || name.length() < 3){
            throw new NameException("Hata: İsim alanı boş veya 3 harften küçük olamaz!!!");
        }
        return this.name = name;
    }

    public String getTCNO() {
        return TCNO;
    }

    //Checked exception olduğundan bu metodu çağıranlar compile-time da handling mekanizması kurmak zorundadır.
    public String setTCNO(String TCNO) throws TCNOException {
        if (TCNO.isBlank() || TCNO.length() != 11){
            throw new TCNOException("Hata: TCNO boş olamaz. 11 haneli olmalıdır!!!");
        }
        return this.TCNO = TCNO;
    }

    public int getAge() {
        return age;
    }

    //UnChecked exception olduğundan bu metodu çağıranlar compile-time da handling mekanizması kurmak zorunda değiller.
    public int setAge(int age) throws AgeException{
        if (age < 0 || age > 120 ){
            AgeException ageHata = new AgeException("Hata: Yaş bilgisi 0-120 aralığında olmalıdır!!!.");
            throw ageHata ;
        }
       return this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", TCNO='" + TCNO + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
