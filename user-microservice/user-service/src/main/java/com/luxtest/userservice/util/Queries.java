package com.luxtest.userservice.util;

public class Queries {

    public static final String FIND_USERS_BY_COUNTRY = "SELECT * FROM users.user as u WHERE u.data->>'country'=?1";
}
