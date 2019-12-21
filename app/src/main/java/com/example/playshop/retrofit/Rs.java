package com.example.playshop.retrofit;

import android.util.Log;
import android.widget.Toast;

import com.example.playshop.MainActivity;
import com.example.playshop.admin.AdminuserAddActivity;
import com.example.playshop.admin.StockInputActivity;
import com.example.playshop.adminuser.MemberAddActivity;
import com.example.playshop.adminuser.MemberDelActivity;
import com.example.playshop.adminuser.MemberQueryActivity;
import com.example.playshop.adminuser.PlayRentalActivity;
import com.example.playshop.adminuser.ToyReturnActivity;
import com.example.playshop.retrofit.javabean.login;
import com.example.playshop.retrofit.javabean.member;
import com.example.playshop.retrofit.javabean.treturn;
import com.example.playshop.retrofit.javabean.user;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Rs {
    void Rs(){

    }
    public  void getUser(final MainActivity mainActivity)
    {
        Log.d("123","789");
        Retrofit retrofit=new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://10.0.2.2:5000/")
                .build();
        API api = retrofit.create(API.class);
        Call<ResponseBody> call=api.getUser();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                ResponseBody responseBody = response.body();
                try {
                    Gson gson=new Gson();
                    JSONObject jsonObject = new JSONObject(responseBody.string());
                    Log.d("55",gson.toJson(jsonObject));
                    userD user=gson.fromJson(gson.toJson(jsonObject),userD.class);
                    Log.d("55",user.getNameValuePairs().getUsername());
                    //mainActivity.rt.setText(user.getNameValuePairs().getUserpassword());
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                //Log.d("123",t.toString());
            }
        });
    }
    public void Login(String username, String password, final MainActivity mainActivity){
        Retrofit retrofit=new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://10.0.2.2:5000/")
                .build();
        API api = retrofit.create(API.class);
        Call<ResponseBody> call=api.gerU(username,password);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                ResponseBody responseBody = response.body();
                try {
                    Gson gson=new Gson();
                    JSONObject jsonObject = new JSONObject(responseBody.string());
                    Log.d("55",gson.toJson(jsonObject));
                    login login=gson.fromJson(gson.toJson(jsonObject),login.class);
                    Log.d("55",login.getNameValuePairs().getPass());
                    mainActivity.rt=Integer.parseInt(login.getNameValuePairs().getPass());
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                //Log.d("123",t.toString());
            }
        });
    }
    public void StockInput(String wjmc, String wjjg, final StockInputActivity stockInputActivity){
        Retrofit retrofit=new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://10.0.2.2:5000/")
                .build();
        API api = retrofit.create(API.class);
        Call<ResponseBody> call=api.StockInput(wjmc,wjjg);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                ResponseBody responseBody = response.body();
                try {
                    Gson gson=new Gson();
                    JSONObject jsonObject = new JSONObject(responseBody.string());
                    Log.d("55",gson.toJson(jsonObject));
                    login login=gson.fromJson(gson.toJson(jsonObject),login.class);
                    Log.d("55",login.getNameValuePairs().getPass());
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                //Log.d("123",t.toString());
            }
        });
    }
    public void AdminuserAdd(String yhm, String yhmm, final AdminuserAddActivity adminuserAddActivity){
        Retrofit retrofit=new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://10.0.2.2:5000/")
                .build();
        API api = retrofit.create(API.class);
        Call<ResponseBody> call=api.AdminuserAdd(yhm,yhmm);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                ResponseBody responseBody = response.body();
                try {
                    Gson gson=new Gson();
                    JSONObject jsonObject = new JSONObject(responseBody.string());
                    Log.d("55",gson.toJson(jsonObject));
                    login login=gson.fromJson(gson.toJson(jsonObject),login.class);
                    Log.d("55",login.getNameValuePairs().getPass());
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                //Log.d("123",t.toString());
            }
        });
    }
    public void PlayRental(String bh, String ts,String gk, final PlayRentalActivity playRentalActivity){
        Retrofit retrofit=new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://10.0.2.2:5000/")
                .build();
        API api = retrofit.create(API.class);
        Call<ResponseBody> call=api.PlayRental(bh,gk,ts);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                ResponseBody responseBody = response.body();
                try {
                    Gson gson=new Gson();
                    JSONObject jsonObject = new JSONObject(responseBody.string());
                    Log.d("55",gson.toJson(jsonObject));
                    login login=gson.fromJson(gson.toJson(jsonObject),login.class);
                    Log.d("55",login.getNameValuePairs().getPass());
                    int i=Integer.parseInt(login.getNameValuePairs().getPass());
                    if(i==1){
                        Toast ts = Toast.makeText(playRentalActivity.getBaseContext(), "添加成功", Toast.LENGTH_LONG);
                        ts.show();
                    }
                    else if(i==2){
                        Toast ts = Toast.makeText(playRentalActivity.getBaseContext(), "添加失败，该玩具已被出租请核对后再添加", Toast.LENGTH_LONG);
                        ts.show();
                    }
                    else{
                        if(i==3){
                            Toast ts = Toast.makeText(playRentalActivity.getBaseContext(), "无此玩具", Toast.LENGTH_LONG);
                            ts.show();
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                //Log.d("123",t.toString());
            }
        });
    }
    public void ToyReturn(String bh, String gk, final ToyReturnActivity toyReturnActivity){
        Retrofit retrofit=new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://10.0.2.2:5000/")
                .build();
        API api = retrofit.create(API.class);
        Call<ResponseBody> call=api.ToyReturn(bh,gk);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                ResponseBody responseBody = response.body();
                try {
                    Gson gson=new Gson();
                    JSONObject jsonObject = new JSONObject(responseBody.string());
                    Log.d("55",gson.toJson(jsonObject));
                    treturn treturn=gson.fromJson(gson.toJson(jsonObject), treturn.class);
                    Log.d("55",treturn.getNameValuePairs().getPass());
                    int i=Integer.parseInt(treturn.getNameValuePairs().getPass());
                    if(i==1){
                        Toast ts = Toast.makeText(toyReturnActivity.getBaseContext(), "归还成功请付："+treturn.getNameValuePairs().getAge()+" 元", Toast.LENGTH_LONG);
                        ts.show();
                    }
                    else if(i==2){
                        Toast ts = Toast.makeText(toyReturnActivity.getBaseContext(), "无此玩具", Toast.LENGTH_LONG);
                        ts.show();
                    }
                    else if(i==3){
                        Toast ts = Toast.makeText(toyReturnActivity.getBaseContext(), "该玩具在库中", Toast.LENGTH_LONG);
                        ts.show();
                    }
                    else if(i==4){
                        Toast ts = Toast.makeText(toyReturnActivity.getBaseContext(), "无此顾客", Toast.LENGTH_LONG);
                        ts.show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                //Log.d("123",t.toString());
            }
        });
    }
    public void MemberAdd(String xm, String dz, String dh, String yj, final MemberAddActivity memberAddActivity){
        Retrofit retrofit=new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://10.0.2.2:5000/")
                .build();
        API api = retrofit.create(API.class);
        Call<ResponseBody> call=api.MemberAdd(xm,dz,dh,yj);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                ResponseBody responseBody = response.body();
                try {
                    Gson gson=new Gson();
                    JSONObject jsonObject = new JSONObject(responseBody.string());
                    Log.d("55",gson.toJson(jsonObject));
                    treturn treturn=gson.fromJson(gson.toJson(jsonObject), treturn.class);
                    Log.d("55",treturn.getNameValuePairs().getPass());
                    int i=Integer.parseInt(treturn.getNameValuePairs().getPass());
                    if(i==1){
                        Toast ts = Toast.makeText(memberAddActivity.getBaseContext(), "注册成功，会员编号为："+treturn.getNameValuePairs().getAge(), Toast.LENGTH_LONG);
                        ts.show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                //Log.d("123",t.toString());
            }
        });
    }
    public void MemberQuery(String bh, final MemberQueryActivity memberQueryActivity){
        Retrofit retrofit=new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://10.0.2.2:5000/")
                .build();
        API api = retrofit.create(API.class);
        Call<ResponseBody> call=api.MemberQuery(bh);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                ResponseBody responseBody = response.body();
                try {
                    Gson gson=new Gson();
                    JSONObject jsonObject = new JSONObject(responseBody.string());
                    Log.d("55",gson.toJson(jsonObject));
                    member member=gson.fromJson(gson.toJson(jsonObject), member.class);
                    Log.d("55",member.getNameValuePairs().getDh());
                    if(member.getNameValuePairs().getDh()=="0"){
                        memberQueryActivity.xm.setText("无此人");
                        memberQueryActivity.dz.setText("无此人");
                        memberQueryActivity.dh.setText("无此人");
                        memberQueryActivity.yj.setText("无此人");
                        memberQueryActivity.sj.setText("无此人");
                    }
                    else{
                        memberQueryActivity.xm.setText(member.getNameValuePairs().getXm());
                        memberQueryActivity.dz.setText(member.getNameValuePairs().getDz());
                        memberQueryActivity.dh.setText(member.getNameValuePairs().getDh());
                        memberQueryActivity.yj.setText(member.getNameValuePairs().getYj());
                        memberQueryActivity.sj.setText(member.getNameValuePairs().getSj());
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                //Log.d("123",t.toString());
            }
        });
    }
    public void MemberDel(String bh, final MemberDelActivity memberDelActivity){
        Retrofit retrofit=new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://10.0.2.2:5000/")
                .build();
        API api = retrofit.create(API.class);
        Call<ResponseBody> call=api.MemberDel(bh);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                ResponseBody responseBody = response.body();
                try {
                    Gson gson=new Gson();
                    JSONObject jsonObject = new JSONObject(responseBody.string());
                    Log.d("55",gson.toJson(jsonObject));
                    login login=gson.fromJson(gson.toJson(jsonObject),login.class);
                    Log.d("55",login.getNameValuePairs().getPass());
                    int i=Integer.parseInt(login.getNameValuePairs().getPass());
                    if(i==-1){
                        Toast ts = Toast.makeText(memberDelActivity.getBaseContext(), "查无此人", Toast.LENGTH_LONG);
                        ts.show();
                    }
                    else{
                        Toast ts = Toast.makeText(memberDelActivity.getBaseContext(), "应退："+i+" 元", Toast.LENGTH_LONG);
                        ts.show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                //Log.d("123",t.toString());
            }
        });
    }
}