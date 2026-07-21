package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.*;


class CustomerFactoryTest {

    @Test
    void createCustomer() {
        User user = new User.Builder()
                .setuser_Id("U001")
                .setemail("Naruto@gmail.com")
                .setrole(Role.CUSTOMER)
                .build();

        Address address = new Address.Builder()
                .setaddress_id("11")
                .setstreet("Salubindza")
                .setcity("Hazyview")
                .setprovince("Mpumalanga")
                .setpostalCode("1242")
                .setcustomer_Id("01")
                .build();

        Customer customer1 = new Customer.Builder()
                .setcustomer_Id("1")
                .setfirstName("Naruto")
                .setlastName("Uzumaki")
                .setemail("Naruto@gmail.com")
                .setUser(user)
                .setaddress(address)
                .build();

        System.out.println(customer1);
    }
}