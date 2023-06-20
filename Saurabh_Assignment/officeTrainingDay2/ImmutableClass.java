import java.util.*;
/*
comment testing
normal
* Highlighted
! alert
? query
TODO: task
*/

class Address{
    String city;
    int pin;

    Address(String city, int pin){
        this.city = city;
        this.pin = pin;
    }

    String getCity(){
        return city;
    }

    int getPin(){
        return pin;
    }

    void setCity(String city){
        this.city = city;
    }

    void setPin(int pin){
        this.pin = pin;
    }
}

final class CustomImmutable{
    private final int id;
    private final String name;
    private final Address address;

    CustomImmutable(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = new Address(address.getCity(), address.getPin());
    }   

    String getName(){
        return name;
    }

    int getId(){
        return id;
    }

    Address getAddress(){
        Address obj = new Address(address.city, address.pin);
        return obj;
    }
}

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int id, pin;
        String name, city;
        System.out.print("Enter id: ");
        id = sc.nextInt();

        System.out.print("Enter name: "); 
        name = sc.nextLine();               //! Why this line is skipped?

        System.out.print("Enter city: ");
        city = sc.nextLine();

        System.out.print("Enter pin: ");
        pin = sc.nextInt();

        CustomImmutable obj1 = new CustomImmutable(id, name, new Address(city, pin));

        System.out.println("id: "+obj1.getId()+" name: "+obj1.getName()+" city: "+obj1.getAddress().getCity()+" pin: "+obj1.getAddress().getPin());

        // if we try to change
        obj1.getAddress().setCity("roma");
        obj1.getAddress().setPin(908778);

        // original obj1 doesn't change
        System.out.println("id: "+obj1.getId()+" name: "+obj1.getName()+" city: "+obj1.getAddress().getCity()+" pin: "+obj1.getAddress().getPin());
    }
}