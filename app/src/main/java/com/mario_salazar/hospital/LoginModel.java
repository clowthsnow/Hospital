package com.mario_salazar.hospital;

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
        if(user.equals("admin") && pass.equals("12345")){
            presenter.showLogin("ok");
        }else{
            presenter.showLogin("nook");
        }
    }
}
