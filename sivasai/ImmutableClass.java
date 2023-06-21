public final class ImmutableClass {
    private final int id;
    private final String name;
    private final Address address;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return new Address(address.getCity(),address.getStreet(), address.getState());
    }

    public ImmutableClass(int id, String name, Address addr){
        this.id = id;
        this.address = new Address(addr.getCity(),addr.getStreet(), addr.getState());
//        this.address = addr;
                this.name = name;
    }

    public static void main(String []args){
        String str = "Walkers road";
        String c = "Nellore";
        String st = "Andhra pradesh";
        Address addr = new Address(c, str, st);
        ImmutableClass newImm = new ImmutableClass(1213, "siva", addr);

        System.out.println(newImm.getAddress().getCity()+ " "+newImm.getAddress().getState()+" "+newImm.getAddress().getStreet());
        System.out.println(newImm.getId());
        System.out.println(newImm.getName());
        newImm.getAddress().setCity("delhi");

        System.out.println(newImm.getAddress().getCity());

    }
}

class Address{
    private String city;
    private String street;
    private String state;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address(String c, String str, String st){
        this.city = c;
        this.street = str;
        this.state = st;
    }

}