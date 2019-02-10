package de.uni_freiburg.iems.beatit;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.enums.CSVReaderNullFieldIndicator;
import com.opencsv.CSVWriter;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Writer;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.concurrent.Callable;

import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instances;
import weka.classifiers.Classifier;


import picocli.CommandLine;

@CommandLine.Command(
    description = "Prints mean and variance of a CSV file",
    name = "segfeat",
    mixinStandardHelpOptions = true,
    version = "segfeat 1.0")

public class cli implements Callable<Void> {

    private static final String SEPARATOR = " ";
    private static final String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("_DD_MM_HH_mm_ss")) ;
    private static final String STRING_ARRAY_SAMPLE = "./feature_list" + timeStamp + ".csv";

    private Classifier mClassifier = null;

    @CommandLine.Parameters(index = "0", description = "file to read from")
    private File file = new File("-");

    @CommandLine.Option(names = {"-n", "--duration"}, description = "number of samples to merge")
    private Integer windowlength = 200;

    public static void main(String[] args) {
        CommandLine.call(new cli(), args);
    }

    @Override
    public Void call() throws Exception {
        BufferedReader in;

        if ("-".equals(file.getName()))
            in = new BufferedReader(new InputStreamReader(System.in));
        else
            in = new BufferedReader(new FileReader(file));


        try {
            mClassifier = (Classifier) weka.core.SerializationHelper.read("RF_9Attr.model");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            // Weka "catch'em all!"
            e.printStackTrace();
        }

        SegFeat segFeat = null;
        final Attribute attributeAttr1_Mean = new Attribute("Attr1_Mean");
        final Attribute attributeAttr1_Max = new Attribute("Attr1_Max");
        final Attribute attributeAttr1_Min = new Attribute("Attr1_Min");
        final Attribute attributeAttr2_Mean = new Attribute("Attr2_Mean");
        final Attribute attributeAttr2_Max = new Attribute("Attr2_Max");
        final Attribute attributeAttr2_Min = new Attribute("Attr2_Min");
        final Attribute attributeAttr3_Mean = new Attribute("Attr3_Mean");
        final Attribute attributeAttr3_Max = new Attribute("Attr3_Max");
        final Attribute attributeAttr3_Min = new Attribute("Attr3_Min");
        final Attribute attributeAttr4_Mean = new Attribute("Attr4_Mean");
        final Attribute attributeAttr4_Max = new Attribute("Attr4_Max");
        final Attribute attributeAttr4_Min = new Attribute("Attr4_Min");
        final Attribute attributeAttr5_Mean = new Attribute("Attr5_Mean");
        final Attribute attributeAttr5_Max = new Attribute("Attr5_Max");
        final Attribute attributeAttr5_Min = new Attribute("Attr5_Min");
        final Attribute attributeAttr6_Mean = new Attribute("Attr6_Mean");
        final Attribute attributeAttr6_Max = new Attribute("Attr6_Max");
        final Attribute attributeAttr6_Min = new Attribute("Attr6_Min");
        final Attribute attributeAttr7_Mean = new Attribute("Attr7_Mean");
        final Attribute attributeAttr7_Max = new Attribute("Attr7_Max");
        final Attribute attributeAttr7_Min = new Attribute("Attr7_Min");
        final Attribute attributeAttr8_Mean = new Attribute("Attr8_Mean");
        final Attribute attributeAttr8_Max = new Attribute("Attr8_Max");
        final Attribute attributeAttr8_Min = new Attribute("Attr8_Min");
        final Attribute attributeAttr9_Mean = new Attribute("Attr9_Mean");
        final Attribute attributeAttr9_Max = new Attribute("Attr9_Max");
        final Attribute attributeAttr9_Min = new Attribute("Attr9_Min");

        final List<String> Classes = new ArrayList<String>(){
            {
                add("NULL");
                add("smoking");
            }
        };

        ArrayList<Attribute> attributeList = new ArrayList<Attribute>(2){
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

        double array[] = null;
        Writer writer = Files.newBufferedWriter(Paths.get(STRING_ARRAY_SAMPLE));

        CSVWriter csvWriter = new CSVWriter(writer,
                CSVWriter.DEFAULT_SEPARATOR,
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END);

        csvWriter.writeNext(new String[]{"Classifier Attr1_Mean Attr1_Max Attr1_Min Attr2_Mean Attr2_Max Attr2_Min Attr3_Mean Attr3_Max Attr3_Min Attr4_Mean Attr4_Max Attr4_Min Attr5_Mean Attr5_Max Attr5_Min Attr6_Mean Attr6_Max Attr6_Min Attr7_Mean Attr7_Max Attr7_Min Attr8_Mean Attr8_Max Attr8_Min Attr9_Mean Attr9_Max Attr9_Min"});

        CSVReader csv = new CSVReaderBuilder(in)
                . withCSVParser(
                  new CSVParserBuilder()
                . withSeparator(' ')
                . withFieldAsNull(CSVReaderNullFieldIndicator.BOTH)
                . build())
                .build();
        boolean hasLabels = false;

        Instances SensorDataUnpredicted = new Instances("SensorData", attributeList, 1);

        SensorDataUnpredicted.setClassIndex(0);

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

        newInstance.setDataset(SensorDataUnpredicted);


        for (String[] line = csv.readNext();
                      line != null;
                      line = csv.readNext()) {

            if (line.length == 0 || line[0].trim().startsWith("#"))
                continue;

            String[] fields = Arrays.stream(line).filter(f -> f != null).toArray(String[]::new);

            if (array == null) {
                try {
                    Double.parseDouble(fields[0]);

                    segFeat = new SegFeat.Builder()
                            .setWindowSize(windowlength)
                            .setSampleSize(line.length)
                            .build();
                    array = new double[line.length];
                } catch (NumberFormatException e) {
                    hasLabels = true;
                    segFeat = new SegFeat.Builder()
                            .setWindowSize(windowlength)
                            .setSampleSize(fields.length-1)
                            .build();
                    array = new double[fields.length-1];
                }

            }

            for (int i=0; i<array.length; i++)
                array[i] = Double.parseDouble(fields[i + (hasLabels ? 1 : 0)]);

            segFeat.write(hasLabels ? fields[0] : null, array);

            SegFeat.FeatureVector featureVector = segFeat.read();
            if (featureVector != null) {
                System.out.print(featureVector.mLabel);
                System.out.print(SEPARATOR);
                System.out.println(dblarr2str(featureVector.mVector));
                newInstance.setValue(attributeAttr1_Mean, featureVector.mVector[0] );
                newInstance.setValue(attributeAttr1_Max, featureVector.mVector[1] );
                newInstance.setValue(attributeAttr1_Min, featureVector.mVector[2] );
                newInstance.setValue(attributeAttr2_Mean, featureVector.mVector[3] );
                newInstance.setValue(attributeAttr2_Max, featureVector.mVector[4] );
                newInstance.setValue(attributeAttr2_Min, featureVector.mVector[5] );
                newInstance.setValue(attributeAttr3_Mean, featureVector.mVector[6] );
                newInstance.setValue(attributeAttr3_Max, featureVector.mVector[7] );
                newInstance.setValue(attributeAttr3_Min, featureVector.mVector[8] );
                newInstance.setValue(attributeAttr4_Mean, featureVector.mVector[9] );
                newInstance.setValue(attributeAttr4_Max, featureVector.mVector[10] );
                newInstance.setValue(attributeAttr4_Min, featureVector.mVector[11] );
                newInstance.setValue(attributeAttr5_Mean, featureVector.mVector[12] );
                newInstance.setValue(attributeAttr5_Max, featureVector.mVector[13] );
                newInstance.setValue(attributeAttr5_Min, featureVector.mVector[14] );
                newInstance.setValue(attributeAttr6_Mean, featureVector.mVector[15] );
                newInstance.setValue(attributeAttr6_Max, featureVector.mVector[16] );
                newInstance.setValue(attributeAttr6_Min, featureVector.mVector[17] );
                newInstance.setValue(attributeAttr7_Mean, featureVector.mVector[18] );
                newInstance.setValue(attributeAttr7_Max, featureVector.mVector[19] );
                newInstance.setValue(attributeAttr7_Min, featureVector.mVector[20] );
                newInstance.setValue(attributeAttr8_Mean, featureVector.mVector[21] );
                newInstance.setValue(attributeAttr8_Max, featureVector.mVector[22] );
                newInstance.setValue(attributeAttr8_Min, featureVector.mVector[23] );
                newInstance.setValue(attributeAttr9_Mean, featureVector.mVector[24] );
                newInstance.setValue(attributeAttr9_Max, featureVector.mVector[25] );
                newInstance.setValue(attributeAttr9_Min, featureVector.mVector[26] );
                double result = mClassifier.classifyInstance(newInstance);
                String className = Classes.get(new Double(result).intValue());

                csvWriter.writeNext(new String[]{featureVector.mLabel.concat(SEPARATOR.concat(dblarr2str(featureVector.mVector))), className});


            }
        }
        csvWriter.close();
        return null;
    }

    private String dblarr2str(double[] featureVector) {
        StringJoiner sj = new StringJoiner(SEPARATOR);

        for (double feature : featureVector)
            sj.add(Double.toString(feature));

        return sj.toString();
    }
}
