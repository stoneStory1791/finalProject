package app;

public class Customer {
    private final String name;
    private final String type;
    private final String country;

    public Customer(){
        this(null, null, null);
    }

    public Customer(String name, String type, String country){
        this.name      = name;
        this.type      = type;
        this.country   = country;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Customer) {
            Customer other = (Customer) obj;
            return country.equals(other.country) && name.equals(other.name) && type.equals(other.type);
        }
        return false;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String toCSVFormat(){
        return String.format("%s,%s,%s", name, type, country );
    }

    public String toString() {
        return String.format("Customer Name: %s, Customer Type: %s, Customer Country: %s" , name, type, country );
    }
}
