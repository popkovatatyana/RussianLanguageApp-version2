package com.popkova.russianlanguageapp;


import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 22.03.2017.
 */

public class RegisterRequest  extends StringRequest{
    private static final String REGISTER_REQUEST_URL = "https://popkovarussianlanguageapplicationcom.000webhostapp.com/databaseconnection.php";
    private Map<String, String> params;

    public RegisterRequest(String name, String surname, String username, String password, int age, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("surname", surname);
        params.put("age", age + "");
        params.put("username", username);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
