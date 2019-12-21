package com.example.playshop.retrofit;

import com.example.playshop.retrofit.javabean.user;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface API {
    @GET("user")
    Call<ResponseBody> getUser();
    @GET("login/{username}/{password}")
    Call<ResponseBody> gerU(
            @Path("username")String username,
            @Path("password")String password
    );
    @GET("Admin/StockInput/{wjmc}/{wjjg}")
    Call<ResponseBody> StockInput(
            @Path("wjmc")String wjmc,
            @Path("wjjg")String wjjg
    );
    @GET("Admin/AdminuserAdd/{yhm}/{yhmm}")
    Call<ResponseBody> AdminuserAdd(
            @Path("yhm")String yhm,
            @Path("yhmm")String yhmm
    );
    @GET("Admin/PlayRental/{bh}/{gk}/{ts}")
    Call<ResponseBody> PlayRental(
            @Path("bh")String bh,
            @Path("gk")String gk,
            @Path("ts")String ts
    );
    @GET("Admin/ToyReturn/{bh}/{gk}")
    Call<ResponseBody> ToyReturn(
            @Path("bh")String bh,
            @Path("gk")String gk
    );
    @GET("Admin/MemberAdd/{xm}/{dz}/{dh}/{yj}")
    Call<ResponseBody> MemberAdd(
            @Path("xm")String xm,
            @Path("dz")String dz,
            @Path("dh")String dh,
            @Path("yj")String yj
    );
    @GET("Admin/MemberQuery/{bh}")
    Call<ResponseBody> MemberQuery(
            @Path("bh")String bh
    );
    @GET("Admin/MemberDel/{bh}")
    Call<ResponseBody> MemberDel(
            @Path("bh")String bh
    );

}
