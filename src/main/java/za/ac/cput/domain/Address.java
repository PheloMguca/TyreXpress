package za.ac.cput.domain;

import jakarta.persistence.*;

@Entity
@Table(name="addresses")
public class Address {
    @Id
    private String address_id;
    private String street;
    private String city;
    private String province;
    private String postalCode;
    @OneToOne(mappedBy = "address")
    private Customer customer;

    public Address() {
    }
    public Address(Builder builder) {
        this.address_id = builder.address_id;
        this.street = builder.street;
        this.city = builder.city;
        this.province = builder.province;
        this.postalCode = builder.postalCode;
        this.customer = builder.customer;
    }

    public String getAddress_id() {
        return address_id;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getProvince() {
        return province;
    }

    public String getStreet() {
        return street;
    }
    public Customer getCustomer() {
        return customer;
    }


    @Override
    public String toString() {
        return "Address{" +
                "address_id='" + address_id + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public static  class Builder{
        private String address_id;
        private String street;
        private String city;
        private String province;
        private String postalCode;
        private Customer customer;

        public Builder setaddress_id(String address_id) {
            this.address_id = address_id;
            return this;
        }
        public Builder setstreet(String street) {
            this.street = street;
            return this;
        }
        public Builder setcity(String city) {
            this.city = city;
            return this;
        }
        public Builder setprovince(String province) {
            this.province = province;
            return this;
        }
        public Builder setpostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public Builder setCustomer(Customer customer) {
            this.customer = customer;
            return this;
        }


        public Builder copy(Address address){
            this.address_id = address.address_id;
            this.street = address.street;
            this.city = address.city;
            this.province = address.province;
            this.postalCode = address.postalCode;
            this.customer = address.customer;
            return this;
        }
        public Address build(){
            return new Address(this);
        }
    }
}
