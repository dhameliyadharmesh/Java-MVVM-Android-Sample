package com.java.mvvmsample.ui.user;

import com.google.gson.JsonObject;
import com.java.mvvmsample.ui.LoginModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * @Authoer Dharmesh
 * @Date 24-02-2022
 * <p>
 * Information
 **/
public interface UserServices {

    @FormUrlEncoded
    @POST("login.php")
    public Call<JsonObject> loginUser(@Field("username") String username,@Field("password") String password);
}