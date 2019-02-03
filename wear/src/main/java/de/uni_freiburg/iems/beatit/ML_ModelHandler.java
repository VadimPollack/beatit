package de.uni_freiburg.iems.beatit;

import android.content.Context;

public class ML_ModelHandler {
    private int chosenMLModel=1;
    private ModelRF9 MLModell;

    public void changeMLModel(int ModelNumber){
        chosenMLModel = ModelNumber;
    }

    public void StartMLModell(Context modelContext){
        if(chosenMLModel==1){
            MLModell = new ModelRF9();
            MLModell.startModel(modelContext);
        }else{
            MLModell = new ModelRF9();
            MLModell.startModel(modelContext);
        }

    }


}
