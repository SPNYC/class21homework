package class21.Homework;
/*
Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
 */
public class Computer {
    void turnOn(){
        System.out.println("To start working you need to turn on the computer");
    }
    void password(){
        System.out.println("To safe your data it's better to use password");
    }
    void lug(){
        System.out.println("when it lugs - restart");
    }
}
class Apple extends Computer{
    @Override
    void turnOn(){
        System.out.println("Usually it is in sleeping mode");
}
    @Override
    void password(){
        System.out.println("Use password otherwise git hub won't work");
    }
    @Override
    void lug(){
        System.out.println("when it lugs -turn off or upload updates");
    }
    void price(){
        System.out.println("cheaper than Iphone");
    }
}

class Lenovo extends Computer{
    @Override
    void turnOn(){
        System.out.println("Quick start");
    }
    @Override
    void password(){
        System.out.println("User set up a password");
    }
    @Override
    void lug(){
        System.out.println("when it lugs -use restart command");
    }
    void touchScreen(){
        System.out.println("Has a touch screen");
    }
}
class HP extends Computer{
    @Override
    void turnOn(){
        System.out.println("Press the start button");
    }
    @Override
    void password(){
        System.out.println("Use password 123456");
    }
    @Override
    void lug(){
        System.out.println("when it lugs -download new OS");
    }
    void printer(){
        System.out.println("Printer HP is easily to plug in to the laptop");
    }
}
class Dell extends Computer {
    @Override
    void turnOn() {
        System.out.println("Press and hold the button");
    }

    @Override
    void password() {
        System.out.println("Use password 98765");
    }

    @Override
    void lug() {
        System.out.println("when it lugs -restart immediately ");
    }

    void mostPopular() {
        System.out.println("The most popular brand in many countries");
    }


    public static void main(String[] args) {
        Computer [] computer={new Apple(),new HP(),new Lenovo(),new Lenovo()};
        for(Computer comp:computer){
            comp.turnOn();
            comp.password();
            comp.lug();
        }

        System.out.println();

        Computer apple=new Apple();
        ((Apple)apple).price();

        Computer lenovo=new Lenovo();
        ((Lenovo)lenovo).touchScreen();

        Computer hp=new HP();
        ((HP)hp).printer();

        Computer dell=new Dell();
        ((Dell)dell).mostPopular();
    }
}