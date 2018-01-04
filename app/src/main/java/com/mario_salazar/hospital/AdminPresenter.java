package com.mario_salazar.hospital;

/**
 * Created by Mario-Snow on 4/01/2018.
 */

public class AdminPresenter implements Admin.Presenter{

    private Admin.View view;
    private Admin.Model model;

    public  AdminPresenter (Admin.View view){
        this.view=view;
        model= new AdminModel(this);
    }

    @Override
    public void showOption(int status) {
        if(view!=null){
            view.showOption(status);
        }
    }

    @Override
    public void chooseOption(String opcion) {
        if(view!=null){
            model.chooseOption(opcion);
        }
    }
}
