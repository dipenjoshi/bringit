package com.bernsinc.bringit;

import com.bernsinc.bringit.models.SignInForm;
import com.bernsinc.bringit.models.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface BringItApiInterface {

    @POST("api/auth/signin")
    Call<User> signIn(@Body SignInForm form);

}
