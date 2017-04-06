package mypocketvakil.example.com.retrofitexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sanyam jain on 24-03-2017.
 */


public class Example {

    @SerializedName("phone_number")
    private String phone_number;
    @SerializedName("passcode")
    private String passcode;

    @SerializedName("user")
    @Expose
    private FinmoUser user;
    @SerializedName("session_id")
    @Expose
    private String sessionId;
    @SerializedName("result")
    @Expose
    private Boolean result;

    public Example(String phone_number, String passcode)
    {

        this.phone_number=phone_number;
        this.passcode=passcode;
    }

    public FinmoUser getUser() {
        return user;
    }

    public void setUser(FinmoUser user) {
        this.user = user;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

}
