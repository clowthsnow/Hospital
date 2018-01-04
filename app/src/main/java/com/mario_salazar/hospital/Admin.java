package com.mario_salazar.hospital;

/**
 * Created by Mario-Snow on 4/01/2018.
 */

public interface Admin {

    interface View{
        void showOption(int status);
    }

    interface Presenter{
        void showOption(int status);
        void chooseOption(String opcion);
    }

    interface Model{
        void chooseOption(String opcion);
    }

}
