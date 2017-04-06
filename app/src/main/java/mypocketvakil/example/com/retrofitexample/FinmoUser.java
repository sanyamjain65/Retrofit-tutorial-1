package mypocketvakil.example.com.retrofitexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sanyam jain on 24-03-2017.
 */

public class FinmoUser {
    @SerializedName("account_name")
    @Expose
    private String accountName;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("virtual_id")
    @Expose
    private String virtualId;
    @SerializedName("points")
    @Expose
    private Integer points;
    @SerializedName("date_of_birth")
    @Expose
    private String dateOfBirth;
    @SerializedName("device_id")
    @Expose
    private String deviceId;
    @SerializedName("my_referral")
    @Expose
    private String myReferral;
    @SerializedName("user_image")
    @Expose
    private String userImage;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("account_number")
    @Expose
    private String accountNumber;
    @SerializedName("ifsc_code")
    @Expose
    private String ifscCode;
    @SerializedName("referral_from")
    @Expose
    private String referralFrom;
    @SerializedName("is_blocked")
    @Expose
    private Boolean isBlocked;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVirtualId() {
        return virtualId;
    }

    public void setVirtualId(String virtualId) {
        this.virtualId = virtualId;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getMyReferral() {
        return myReferral;
    }

    public void setMyReferral(String myReferral) {
        this.myReferral = myReferral;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getReferralFrom() {
        return referralFrom;
    }

    public void setReferralFrom(String referralFrom) {
        this.referralFrom = referralFrom;
    }

    public Boolean getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(Boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

}
