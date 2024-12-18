package _16_12_2024;

public class Post {

    private int weight;
    private Address address;

    public Post(int weight, Address address) {
        this.weight = weight;
        this.address = address;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address, String comment) {
        String postcode = address.getPostCode();
        if (postcode.charAt(0) == '1') {
        }
        this.address = address;
    }

    void doSm(String... s) {

    }

    @Override
    public String toString() {
        return "Post{" +
                "weight=" + weight +
                ", address=" + address +
                '}';
    }
}

class Address {
    private String street;
    private String postCode;

    public Address(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                '}';
    }
}