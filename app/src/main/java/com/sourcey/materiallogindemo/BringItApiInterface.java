package com.sourcey.materiallogindemo;

import com.sourcey.materiallogindemo.models.SignInForm;
import com.sourcey.materiallogindemo.models.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface BringItApiInterface {

    @POST("api/auth/signin")
    Call<User> signIn(@Body SignInForm form);

}
