package mypocketvakil.example.com.retrofitexample;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sanyam jain on 23-03-2017.
 */

class User {
    @SerializedName("token")
    private String token;
    @SerializedName("email")
    private String email;
    @SerializedName("password")
    private String password;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User(String email, String password)
    {

        this.email=email;
        this.password=password;
    }

}
