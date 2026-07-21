package za.ac.cput.factory;

import za.ac.cput.domain.*;
import za.ac.cput.util.Helper;

public class AddressFactory {

     public static Address createAddress(String address_id, String street, String city, String province, String postalCode, Customer customer) {
         if (Helper.isNullOrEmpty(address_id) || Helper.isNullOrEmpty(street) || customer == null) {
             throw new IllegalArgumentException( "Customer is null or address is empty.");
         }
         if(!Helper.isValidPostalCode(postalCode)){
             throw new IllegalArgumentException("postalCode is null or invalid");
         }
         return new Address.Builder()
                 .setaddress_id(address_id)
                 .setstreet(street)
                 .setcity(city)
                 .setprovince(province)
                 .setpostalCode(postalCode)
                 .setCustomer(customer)
                 .build();
     }
}
