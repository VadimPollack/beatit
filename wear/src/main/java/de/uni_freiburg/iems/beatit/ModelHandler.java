package de.uni_freiburg.iems.beatit;

import android.content.res.AssetManager;
import android.content.Context;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instances;
import weka.classifiers.Classifier;

public class ModelHandler {


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
    private final List<String> ClassesSmoking = new ArrayList<String>(){
        {
            add("smoking");
            add("NULL");
        }
    };
    private final List<String> ClassesHandWashing = new ArrayList<String>(){
        {
            add("handwashing");
            add("NULL");
        }
    };

    private ArrayList<Attribute> attributeList6Att = new ArrayList<Attribute>(2){
        {
            Attribute attributeClassifier = new Attribute("Classifier", ClassesSmoking);
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
        }
    };
    private ArrayList<Attribute> attributeList6AttHW = new ArrayList<Attribute>(2){
        {
            Attribute attributeClassifier = new Attribute("Classifier", ClassesHandWashing);
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
        }
    };
    private ArrayList<Attribute> attributeList3Att = new ArrayList<Attribute>(2){
        {
            Attribute attributeClassifier = new Attribute("Classifier", ClassesSmoking);
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
        }
    };
    private MLModel activeMLModel = null;
    private static ModelHandler instance;

    public MLModel getActiveMLModel(){
        return activeMLModel;
    }

    public static synchronized ModelHandler getInstance() {
        if (instance == null) {
            instance = new ModelHandler();
        }
        return instance;
    }

    private ModelHandler(){

    }

    public void changeModel(Context modelContext,String ModelName){

        ArrayList<Attribute> attributeList = attributeList3Att;
        if( ModelName == "RF__6Attr.model"){
            attributeList =attributeList6Att;
        }else if(ModelName == "RF__3Attr.model"){
            attributeList =attributeList3Att;
        }else if(ModelName == "Handwashing.model") {
            attributeList =attributeList6AttHW;
        }

        activeMLModel = new MLModel(ModelName, attributeList, modelContext );
    }

    public class MLModel{
        private String ModelName;
        private ArrayList<Attribute> attributeList;
        private Classifier mClassifier = null;
        private Instances SensorDataUnpredicted;

        public MLModel(String Name, ArrayList<Attribute> AttList, Context modelContext){
            ModelName = Name;
            attributeList = AttList;
            SensorDataUnpredicted  = new Instances("SensorData", attributeList, 1);
            SensorDataUnpredicted.setClassIndex(0);
            mClassifier = this.ReturnClassifier(modelContext);
        }

        private Classifier ReturnClassifier(Context modelContext){
            AssetManager assetManager = modelContext.getAssets();
            try {
                // InputStream inputStream = assetManager.open(ModelName);
                // List<String> mapList = Arrays.asList(assetManager.list(""));
                return (Classifier) weka.core.SerializationHelper.read(assetManager.open(ModelName));
            }catch(IOException e){
                Toast.makeText(modelContext, "Model IOException", Toast.LENGTH_SHORT).show();
                return (Classifier) null;
            }catch(Exception e){
                Toast.makeText(modelContext, "Exception No classifier", Toast.LENGTH_SHORT).show();
                return (Classifier) null;
            }

        }
        public String predictSmoking(double[] vector) {
            String className = "NoPrediction";
            DenseInstance newInstance = new DenseInstance(SensorDataUnpredicted.numAttributes());

            if(mClassifier ==null || vector.length < (SensorDataUnpredicted.numAttributes()-1)){
                return "ErrorNoPrediction";
            }
            newInstance.setDataset(SensorDataUnpredicted);
            for(int ii=0; ii<(SensorDataUnpredicted.numAttributes()-1); ii++){
                newInstance.setValue(attributeList.get(ii +1),vector[ii]);
            }
            try{
                double result = mClassifier.classifyInstance(newInstance);
                if(ModelName=="Handwashing.model"){
                    className = ClassesHandWashing.get(new Double(result).intValue());
                }else {
                    className = ClassesSmoking.get(new Double(result).intValue());
                }
            }catch(Exception e){
                //doSomething
            }

            return className;
        }

    }

}
