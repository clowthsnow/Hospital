package com.mario_salazar.hospital;

/**
 * Created by Mario-Snow on 26/12/2017.
 */

public class LoginPresenter implements Login.Presenter {

    private Login.View view;
    private Login.Model model;

    public LoginPresenter(Login.View view){
        this.view=view;
        model= new LoginModel(this);
    }

    @Override
    public void showLogin(String status) {
        if(view!=null){
            view.showLogin(status);
        }
    }

    @Override
    public void login(String user, String pass) {
        if(view!=null){
            model.login(user,pass);
        }
    }
}
