package com.mario_salazar.hospital;

/**
 * Created by Mario-Snow on 4/01/2018.
 */

public class AdminModel implements Admin.Model {
    private Admin.Presenter presenter;

    public AdminModel(Admin.Presenter presenter){

        this.presenter=presenter;
    }
    @Override
    public void chooseOption(String opcion) {
        if(opcion.equals("doctor")){
            presenter.showOption(1);
        }else if(opcion.equals("enfermera")){
            presenter.showOption(2);
        }else if(opcion.equals("paciente")){
            presenter.showOption(3);
        }else{
            presenter.showOption(4);
        }
    }
}
