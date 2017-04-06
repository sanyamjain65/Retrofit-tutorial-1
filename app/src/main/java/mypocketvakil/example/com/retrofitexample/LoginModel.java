package mypocketvakil.example.com.retrofitexample;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sanyam jain on 24-03-2017.
 */

class LoginModel {
    @SerializedName("phone_number")
    private String phone_number;
    @SerializedName("passcode")
    private String passcode;

    public LoginModel(String phone_number, String passcode)
    {

        this.phone_number=phone_number;
        this.passcode=passcode;
    }
}
