package com.mario_salazar.hospital;

import android.os.StrictMode;

import org.json.JSONArray;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import java.net.URLEncoder;
import org.json.JSONArray;
import org.json.JSONObject;
/**
 * Created by Mario-Snow on 26/12/2017.
 */

public class LoginModel implements Login.Model {

    private Login.Presenter presenter;

    public LoginModel(Login.Presenter presenter){

        this.presenter=presenter;
    }

    @Override
    public void login(String user, String pass) {
        /*if(user.equals("admin") && pass.equals("12345")){
            presenter.showLogin("ok");
        }else{
            presenter.showLogin("nook");
        }*/

            try {
                HttpClient httpclient = new DefaultHttpClient();

                String q = "https://api.mongolab.com/api/1/databases/hospital/collections/usuario?q=" +
                        URLEncoder.encode("{\"id\":'" + user + "',\"contra\":'" + pass + "' }") +
                        "&fo=true&apiKey=edbsdtUKazd_h2nqfQRtSvhPpUuMNxCv";
                System.out.println(q);
                HttpGet get = new HttpGet(q);
                StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
                StrictMode.setThreadPolicy(policy);
                HttpResponse httpResponse = httpclient.execute(get);
                String respStr = EntityUtils.toString(httpResponse.getEntity());

                if (!respStr.equals(" null ")) {
                    JSONObject jObject = new JSONObject(respStr);

                    String cargo = jObject.getString("cargo");

                    presenter.showLogin(cargo);

                } else {
                    presenter.showLogin("nook");
                }

                //startActivity(new Intent(getApplicationContext(), Asistencia.class));
            } catch (Exception e) {
                System.out.println(e);
            }

    }


}
