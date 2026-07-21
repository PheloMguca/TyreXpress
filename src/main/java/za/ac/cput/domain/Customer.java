package za.ac.cput.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    private String customer_Id;
    private String firstName;
    private String lastName;
    private String email;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    public Customer() {
    }
    public Customer(Builder builder) {
        this.customer_Id = builder.customer_Id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.user = builder.user;
        this.address = builder.address;
    }

    public String getCustomer_Id() {
        return customer_Id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public User getUser() {
        return user;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_Id='" + customer_Id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class  Builder {
        private String customer_Id;
        private String firstName;
        private String lastName;
        private String email;
        private User user;
        private Address address;

        public Builder setcustomer_Id(String customer_Id) {
            this.customer_Id = customer_Id;
            return this;
        }
        public Builder setfirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder setlastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder setemail(String email) {
            this.email = email;
            return this;
        }
        public Builder setUser(User user) {
            this.user = user;
            return this;
        }
        public Builder setaddress(Address address) {
            this.address = address;
            return this;
        }
        public Builder copy(Customer customer) {
            this.customer_Id = customer.getCustomer_Id();
            this.firstName = customer.getFirstName();
            this.lastName = customer.getLastName();
            this.email = customer.getEmail();
            this.user = customer.getUser();
            this.address = customer.getAddress();
            return this;
        }
        public Customer build() {

            return new Customer(this);
        }

    }
}
