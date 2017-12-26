package com.mario_salazar.hospital;

/**
 * Created by Mario-Snow on 26/12/2017.
 */

public interface Login {

    interface View{
        void ShowLogin();
    }

    interface Presenter{
        void ShowLogin();
        void login(String user, String pass);
    }

    interface Model{
        void login(String user, String pass);
    }

}
