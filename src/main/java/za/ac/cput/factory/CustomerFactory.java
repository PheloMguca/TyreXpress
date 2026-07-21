package za.ac.cput.factory;

import za.ac.cput.domain.*;
import za.ac.cput.util.Helper;

public class CustomerFactory {

    public static Customer createCustomer(String customer_id,String firstName,String lastName,String email,User user, Address address) {

        if (Helper.isNullOrEmpty(customer_id)||Helper.isNullOrEmpty(firstName)||Helper.isNullOrEmpty(lastName) || Helper.isNullOrEmpty(email) || user == null || address == null) {
            throw new IllegalArgumentException( "Customer ID, first name, last name, email, user or address is invalid.");        }
        if (!Helper.isValidEmail(email)) {
            throw new IllegalArgumentException("email is null or invalid");
        }
        return new Customer.Builder()
                .setcustomer_Id(customer_id)
                .setfirstName(firstName)
                .setlastName(lastName)
                .setemail(email)
                .setUser(user)
                .setaddress(address)
                .build();
    }
}
