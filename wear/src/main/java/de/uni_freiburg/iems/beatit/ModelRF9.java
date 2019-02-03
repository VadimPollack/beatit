package de.uni_freiburg.iems.beatit;

import android.content.res.AssetManager;
import android.content.Context;

import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instances;
import weka.classifiers.Classifier;

public class ModelRF9 {

    private Classifier mClassifier = null;
    private final Attribute attributeAttr1_Mean = new Attribute("Attr1_Mean");
    private final Attribute attributeAttr1_Max = new Attribute("Attr1_Max");
    private final Attribute attributeAttr1_Min = new Attribute("Attr1_Min");
    private final Attribute attributeAttr2_Mean = new Attribute("Attr2_Mean");
    private final Attribute attributeAttr2_Max = new Attribute("Attr2_Max");
    private final Attribute attributeAttr2_Min = new Attribute("Attr2_Min");
    private final Attribute attributeAttr3_Mean = new Attribute("Attr3_Mean");
    private final Attribute attributeAttr3_Max = new Attribute("Attr3_Max");
    private final Attribute attributeAttr3_Min = new Attribute("Attr3_Min");
    private final Attribute attributeAttr4_Mean = new Attribute("Attr4_Mean");
    private final Attribute attributeAttr4_Max = new Attribute("Attr4_Max");
    private final Attribute attributeAttr4_Min = new Attribute("Attr4_Min");
    private final Attribute attributeAttr5_Mean = new Attribute("Attr5_Mean");
    private final Attribute attributeAttr5_Max = new Attribute("Attr5_Max");
    private final Attribute attributeAttr5_Min = new Attribute("Attr5_Min");
    private final Attribute attributeAttr6_Mean = new Attribute("Attr6_Mean");
    private final Attribute attributeAttr6_Max = new Attribute("Attr6_Max");
    private final Attribute attributeAttr6_Min = new Attribute("Attr6_Min");
    private final Attribute attributeAttr7_Mean = new Attribute("Attr7_Mean");
    private final Attribute attributeAttr7_Max = new Attribute("Attr7_Max");
    private final Attribute attributeAttr7_Min = new Attribute("Attr7_Min");
    private final Attribute attributeAttr8_Mean = new Attribute("Attr8_Mean");
    private final Attribute attributeAttr8_Max = new Attribute("Attr8_Max");
    private final Attribute attributeAttr8_Min = new Attribute("Attr8_Min");
    private final Attribute attributeAttr9_Mean = new Attribute("Attr9_Mean");
    private final Attribute attributeAttr9_Max = new Attribute("Attr9_Max");
    private final Attribute attributeAttr9_Min = new Attribute("Attr9_Min");
    private final List<String> Classes = new ArrayList<String>(){
        {
            add("NULL");
            add("smoking");
        }
    };

    private ArrayList<Attribute> attributeList = new ArrayList<Attribute>(2){
        {
            Attribute attributeClassifier = new Attribute("Classifier", Classes);
            add(attributeClassifier);
            add(attributeAttr1_Mean);
            add(attributeAttr1_Max);
            add(attributeAttr1_Min);
            add(attributeAttr2_Mean);
            add(attributeAttr2_Max);
            add(attributeAttr2_Min);
            add(attributeAttr3_Mean);
            add(attributeAttr3_Max);
            add(attributeAttr3_Min);
            add(attributeAttr4_Mean);
            add(attributeAttr4_Max);
            add(attributeAttr4_Min);
            add(attributeAttr5_Mean);
            add(attributeAttr5_Max);
            add(attributeAttr5_Min);
            add(attributeAttr6_Mean);
            add(attributeAttr6_Max);
            add(attributeAttr6_Min);
            add(attributeAttr7_Mean);
            add(attributeAttr7_Max);
            add(attributeAttr7_Min);
            add(attributeAttr8_Mean);
            add(attributeAttr8_Max);
            add(attributeAttr8_Min);
            add(attributeAttr9_Mean);
            add(attributeAttr9_Max);
            add(attributeAttr9_Min);
        }
    };
    private Instances SensorDataUnpredicted = new Instances("SensorData", attributeList, 1);


    public void startModel(Context modelContext){

        AssetManager assetManager = modelContext.getAssets();
        try {
            mClassifier = (Classifier) weka.core.SerializationHelper.read(assetManager.open("RF_9Attr.model"));
        }catch(IOException e){
            //do something
        }catch (Exception e){
            //do something else
        }
        SensorDataUnpredicted.setClassIndex(0);
    }

    public void unloadModel(){
        mClassifier = null;
    }

    public String predictSmoking(double[] vector){

        String className = "NoPrediction";
        DenseInstance newInstance = new DenseInstance(SensorDataUnpredicted.numAttributes()){
            {
                setValue(attributeAttr1_Mean, 0 );
                setValue(attributeAttr1_Max, 0 );
                setValue(attributeAttr1_Min, 0 );
                setValue(attributeAttr2_Mean,0 );
                setValue(attributeAttr2_Max, 0 );
                setValue(attributeAttr2_Min, 0 );
                setValue(attributeAttr3_Mean, 0 );
                setValue(attributeAttr3_Max, 0 );
                setValue(attributeAttr3_Min, 0);
                setValue(attributeAttr4_Mean,0);
                setValue(attributeAttr4_Max,0 );
                setValue(attributeAttr4_Min, 0);
                setValue(attributeAttr5_Mean, 0);
                setValue(attributeAttr5_Max, 0 );
                setValue(attributeAttr5_Min, 0 );
                setValue(attributeAttr6_Mean, 0 );
                setValue(attributeAttr6_Max, 0 );
                setValue(attributeAttr6_Min, 0 );
                setValue(attributeAttr7_Mean, 0 );
                setValue(attributeAttr7_Max, 0 );
                setValue(attributeAttr7_Min, 0 );
                setValue(attributeAttr8_Mean, 0 );
                setValue(attributeAttr8_Max, 0 );
                setValue(attributeAttr8_Min, 0 );
                setValue(attributeAttr9_Mean, 0 );
                setValue(attributeAttr9_Max, 0 );
                setValue(attributeAttr9_Min, 0 );
            }
        };
        if(mClassifier ==null || vector.length != 27){
            return "ErrorNoPrediction";
        }
        newInstance.setDataset(SensorDataUnpredicted);

        for(int ii=0; ii<27; ii++){
            newInstance.setValue(attributeList.get(ii +1),vector[ii]);
        }

        try{
            double result = mClassifier.classifyInstance(newInstance);
            className = Classes.get(new Double(result).intValue());
        }catch(Exception e){
            //doSomething
        }
        return className;
    }



}
