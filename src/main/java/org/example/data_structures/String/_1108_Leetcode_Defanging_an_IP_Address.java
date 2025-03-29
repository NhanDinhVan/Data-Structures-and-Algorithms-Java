package org.example.data_structures.String;

/**
 * _1108_Leetcode_Defanging_an_IP_Address
 * <p>
 * Version 1.0
 * <p>
 * Date:  3/29/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/29/2025    NhanDinhVan    Create
 */

public class _1108_Leetcode_Defanging_an_IP_Address {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
