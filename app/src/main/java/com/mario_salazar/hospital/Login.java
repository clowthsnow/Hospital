package com.mario_salazar.hospital;

/**
 * Created by Mario-Snow on 26/12/2017.
 */

public interface Login {

    interface View{
        void showLogin(String status);
    }

    interface Presenter{
        void showLogin(String status);
        void login(String user, String pass);
    }

    interface Model{
        void login(String user, String pass);
    }

}
