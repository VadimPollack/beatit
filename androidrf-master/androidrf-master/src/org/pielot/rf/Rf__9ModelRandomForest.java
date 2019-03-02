

package org.pielot.rf;

import java.util.List;

public class Rf__9ModelRandomForest extends RandomForest {

public double Attr6_Min;
public double Attr8_Min;
public double Attr2_Mean;
public double Attr1_Max;
public double Attr5_Max;
public double Attr6_Mean;
public double Attr6_Max;
public double Attr8_Max;
public double Attr3_Mean;
public double Attr5_Min;
public double Attr7_Max;
public double Attr8_Mean;
public double Attr2_Max;
public double Attr9_Max;
public double Attr7_Min;
public double Attr2_Min;
public double Attr1_Mean;
public double Attr5_Mean;
public double Attr1_Min;
public double Attr4_Min;
public double Attr4_Max;
public double Attr7_Mean;
public double Attr4_Mean;
public double Attr9_Mean;
public double Attr3_Max;
public double Attr3_Min;
public double Attr9_Min;

public String toString() {
StringBuilder b = new StringBuilder();
b.append("MyClass: ");
b.append(MyClass);
b.append(", Attr6_Min: ");
b.append(Attr6_Min);
b.append(", Attr8_Min: ");
b.append(Attr8_Min);
b.append(", Attr2_Mean: ");
b.append(Attr2_Mean);
b.append(", Attr1_Max: ");
b.append(Attr1_Max);
b.append(", Attr5_Max: ");
b.append(Attr5_Max);
b.append(", Attr6_Mean: ");
b.append(Attr6_Mean);
b.append(", Attr6_Max: ");
b.append(Attr6_Max);
b.append(", Attr8_Max: ");
b.append(Attr8_Max);
b.append(", Attr3_Mean: ");
b.append(Attr3_Mean);
b.append(", Attr5_Min: ");
b.append(Attr5_Min);
b.append(", Attr7_Max: ");
b.append(Attr7_Max);
b.append(", Attr8_Mean: ");
b.append(Attr8_Mean);
b.append(", Attr2_Max: ");
b.append(Attr2_Max);
b.append(", Attr9_Max: ");
b.append(Attr9_Max);
b.append(", Attr7_Min: ");
b.append(Attr7_Min);
b.append(", Attr2_Min: ");
b.append(Attr2_Min);
b.append(", Attr1_Mean: ");
b.append(Attr1_Mean);
b.append(", Attr5_Mean: ");
b.append(Attr5_Mean);
b.append(", Attr1_Min: ");
b.append(Attr1_Min);
b.append(", Attr4_Min: ");
b.append(Attr4_Min);
b.append(", Attr4_Max: ");
b.append(Attr4_Max);
b.append(", Attr7_Mean: ");
b.append(Attr7_Mean);
b.append(", Attr4_Mean: ");
b.append(Attr4_Mean);
b.append(", Attr9_Mean: ");
b.append(Attr9_Mean);
b.append(", Attr3_Max: ");
b.append(Attr3_Max);
b.append(", Attr3_Min: ");
b.append(Attr3_Min);
b.append(", Attr9_Min: ");
b.append(Attr9_Min);
return b.toString();
}

protected void runClassifiers(List<Prediction> predictions) {
	predictions.add(runTree0());
	predictions.add(runTree1());
	predictions.add(runTree2());
	predictions.add(runTree3());
	predictions.add(runTree4());
	predictions.add(runTree5());
	predictions.add(runTree6());
	predictions.add(runTree7());
	predictions.add(runTree8());
	predictions.add(runTree9());
	predictions.add(runTree10());
	predictions.add(runTree11());
	predictions.add(runTree12());
	predictions.add(runTree13());
	predictions.add(runTree14());
	predictions.add(runTree15());
	predictions.add(runTree16());
	predictions.add(runTree17());
	predictions.add(runTree18());
	predictions.add(runTree19());
	predictions.add(runTree20());
	predictions.add(runTree21());
	predictions.add(runTree22());
	predictions.add(runTree23());
	predictions.add(runTree24());
	predictions.add(runTree25());
	predictions.add(runTree26());
	predictions.add(runTree27());
	predictions.add(runTree28());
	predictions.add(runTree29());
	predictions.add(runTree30());
	predictions.add(runTree31());
	predictions.add(runTree32());
	predictions.add(runTree33());
	predictions.add(runTree34());
	predictions.add(runTree35());
	predictions.add(runTree36());
	predictions.add(runTree37());
	predictions.add(runTree38());
	predictions.add(runTree39());
	predictions.add(runTree40());
	predictions.add(runTree41());
	predictions.add(runTree42());
	predictions.add(runTree43());
	predictions.add(runTree44());
	predictions.add(runTree45());
	predictions.add(runTree46());
	predictions.add(runTree47());
	predictions.add(runTree48());
	predictions.add(runTree49());
	predictions.add(runTree50());
	predictions.add(runTree51());
	predictions.add(runTree52());
	predictions.add(runTree53());
	predictions.add(runTree54());
	predictions.add(runTree55());
	predictions.add(runTree56());
	predictions.add(runTree57());
	predictions.add(runTree58());
	predictions.add(runTree59());
	predictions.add(runTree60());
	predictions.add(runTree61());
	predictions.add(runTree62());
	predictions.add(runTree63());
	predictions.add(runTree64());
	predictions.add(runTree65());
	predictions.add(runTree66());
	predictions.add(runTree67());
	predictions.add(runTree68());
	predictions.add(runTree69());
	predictions.add(runTree70());
	predictions.add(runTree71());
	predictions.add(runTree72());
	predictions.add(runTree73());
	predictions.add(runTree74());
	predictions.add(runTree75());
	predictions.add(runTree76());
	predictions.add(runTree77());
	predictions.add(runTree78());
	predictions.add(runTree79());
	predictions.add(runTree80());
	predictions.add(runTree81());
	predictions.add(runTree82());
	predictions.add(runTree83());
	predictions.add(runTree84());
	predictions.add(runTree85());
	predictions.add(runTree86());
	predictions.add(runTree87());
	predictions.add(runTree88());
	predictions.add(runTree89());
	predictions.add(runTree90());
	predictions.add(runTree91());
	predictions.add(runTree92());
	predictions.add(runTree93());
	predictions.add(runTree94());
	predictions.add(runTree95());
	predictions.add(runTree96());
	predictions.add(runTree97());
	predictions.add(runTree98());
	predictions.add(runTree99());
}

private Prediction runTree0() {
	if( Attr6_Min < -1.79 ) { 
	if( Attr4_Min < -5.3 ) { 
	if( Attr6_Min < -3.69 ) { 
		if( Attr3_Mean >= 7.04 ) { return new Prediction("NULL", 51, 0); }
	if( Attr3_Mean < 7.04 ) { 
	if( Attr3_Min < -10.13 ) { 
		if( Attr3_Min >= -19.62 ) { return new Prediction("NULL", 688, 206); }
		if( Attr3_Min < -19.62 ) { return new Prediction("NULL", 112, 9); }
	}
	if( Attr3_Min >= -10.13 ) { 
		if( Attr3_Max < 10.53 ) { return new Prediction("smoking", 256, 82); }
		if( Attr3_Max >= 10.53 ) { return new Prediction("NULL", 389, 154); }
	}
	}
	}
	if( Attr6_Min >= -3.69 ) { 
	if( Attr1_Min >= -4.46 ) { 
	if( Attr5_Mean >= -0.04 ) { 
		if( Attr9_Min < -48.76 ) { return new Prediction("NULL", 26, 0); }
		if( Attr9_Min >= -48.76 ) { return new Prediction("NULL", 229, 41); }
	}
	if( Attr5_Mean < -0.04 ) { 
		if( Attr7_Max >= 40.6 ) { return new Prediction("NULL", 6, 1); }
		if( Attr7_Max < 40.6 ) { return new Prediction("NULL", 68, 0); }
	}
	}
	if( Attr1_Min < -4.46 ) { 
	if( Attr3_Min < -2 ) { 
		if( Attr2_Max < 0.09 ) { return new Prediction("smoking", 82, 40); }
		if( Attr2_Max >= 0.09 ) { return new Prediction("NULL", 773, 167); }
	}
	if( Attr3_Min >= -2 ) { 
		if( Attr6_Mean >= 0.04 ) { return new Prediction("smoking", 16, 0); }
		if( Attr6_Mean < 0.04 ) { return new Prediction("smoking", 67, 32); }
	}
	}
	}
	}
	if( Attr4_Min >= -5.3 ) { 
	if( Attr6_Min >= -2.71 ) { 
	if( Attr2_Min >= -15.45 ) { 
	if( Attr6_Mean < -0.14 ) { 
		if( Attr5_Min >= -3.64 ) { return new Prediction("NULL", 40, 0); }
		if( Attr5_Min < -3.64 ) { return new Prediction("smoking", 3, 1); }
	}
	if( Attr6_Mean >= -0.14 ) { 
		if( Attr1_Min < -6.51 ) { return new Prediction("smoking", 601, 239); }
		if( Attr1_Min >= -6.51 ) { return new Prediction("NULL", 633, 189); }
	}
	}
	if( Attr2_Min < -15.45 ) { 
	if( Attr9_Min >= -12.02 ) { 
		if( Attr1_Min < -15.92 ) { return new Prediction("NULL", 14, 1); }
		if( Attr1_Min >= -15.92 ) { return new Prediction("NULL", 39, 0); }
	}
	if( Attr9_Min < -12.02 ) { 
		if( Attr5_Mean >= -0.05 ) { return new Prediction("NULL", 179, 38); }
		if( Attr5_Mean < -0.05 ) { return new Prediction("smoking", 26, 11); }
	}
	}
	}
	if( Attr6_Min < -2.71 ) { 
	if( Attr4_Max >= 3.5 ) { 
	if( Attr3_Max >= 11.08 ) { 
		if( Attr1_Max < 1.46 ) { return new Prediction("smoking", 28, 3); }
		if( Attr1_Max >= 1.46 ) { return new Prediction("NULL", 523, 165); }
	}
	if( Attr3_Max < 11.08 ) { 
		if( Attr7_Max < 15.43 ) { return new Prediction("NULL", 253, 92); }
		if( Attr7_Max >= 15.43 ) { return new Prediction("smoking", 714, 223); }
	}
	}
	if( Attr4_Max < 3.5 ) { 
	if( Attr6_Mean < -0.16 ) { 
		if( Attr9_Min < -43.33 ) { return new Prediction("smoking", 13, 4); }
		if( Attr9_Min >= -43.33 ) { return new Prediction("NULL", 24, 1); }
	}
	if( Attr6_Mean >= -0.16 ) { 
		if( Attr7_Max < 18.56 ) { return new Prediction("smoking", 431, 197); }
		if( Attr7_Max >= 18.56 ) { return new Prediction("smoking", 1194, 171); }
	}
	}
	}
	}
	}
	if( Attr6_Min >= -1.79 ) { 
	if( Attr3_Min < 7.45 ) { 
	if( Attr6_Max < 1.21 ) { 
	if( Attr4_Min < -2.57 ) { 
		if( Attr4_Min < -7.27 ) { return new Prediction("NULL", 45, 0); }
	if( Attr4_Min >= -7.27 ) { 
		if( Attr1_Max < -2.54 ) { return new Prediction("smoking", 94, 31); }
		if( Attr1_Max >= -2.54 ) { return new Prediction("NULL", 477, 97); }
	}
	}
	if( Attr4_Min >= -2.57 ) { 
	if( Attr6_Max >= -0 ) { 
		if( Attr8_Mean >= -11.39 ) { return new Prediction("NULL", 3742, 420); }
		if( Attr8_Mean < -11.39 ) { return new Prediction("NULL", 483, 13); }
	}
		if( Attr6_Max < -0 ) { return new Prediction("NULL", 244, 0); }
	}
	}
	if( Attr6_Max >= 1.21 ) { 
	if( Attr8_Max >= 55.36 ) { 
		if( Attr9_Min >= 84.35 ) { return new Prediction("smoking", 3, 0); }
	if( Attr9_Min < 84.35 ) { 
		if( Attr6_Mean < -0.05 ) { return new Prediction("smoking", 1, 0); }
		if( Attr6_Mean >= -0.05 ) { return new Prediction("NULL", 77, 2); }
	}
	}
	if( Attr8_Max < 55.36 ) { 
		if( Attr4_Mean < -0.12 ) { return new Prediction("NULL", 62, 0); }
	if( Attr4_Mean >= -0.12 ) { 
		if( Attr1_Min >= -15.18 ) { return new Prediction("NULL", 1404, 445); }
		if( Attr1_Min < -15.18 ) { return new Prediction("NULL", 110, 9); }
	}
	}
	}
	}
	if( Attr3_Min >= 7.45 ) { 
	if( Attr2_Min < -2.27 ) { 
	if( Attr2_Max >= 1.93 ) { 
		if( Attr4_Min < -0.67 ) { return new Prediction("NULL", 7, 0); }
	if( Attr4_Min >= -0.67 ) { 
		if( Attr2_Min < -4.64 ) { return new Prediction("NULL", 1, 0); }
		if( Attr2_Min >= -4.64 ) { return new Prediction("smoking", 4, 0); }
	}
	}
	if( Attr2_Max < 1.93 ) { 
	if( Attr1_Max >= 0.33 ) { 
		if( Attr2_Min >= -9.06 ) { return new Prediction("NULL", 183, 4); }
		if( Attr2_Min < -9.06 ) { return new Prediction("smoking", 3, 1); }
	}
		if( Attr1_Max < 0.33 ) { return new Prediction("NULL", 261, 0); }
	}
	}
		if( Attr2_Min >= -2.27 ) { return new Prediction("NULL", 1199, 0); }
	}
	}
return null;
}
private Prediction runTree1() {
	if( Attr5_Max < 0.71 ) { 
	if( Attr3_Min >= 7.33 ) { 
	if( Attr3_Mean < 8.93 ) { 
	if( Attr7_Max < 52.22 ) { 
		if( Attr1_Mean < -0.2 ) { return new Prediction("NULL", 201, 0); }
	if( Attr1_Mean >= -0.2 ) { 
		if( Attr7_Max < 7.14 ) { return new Prediction("NULL", 73, 6); }
		if( Attr7_Max >= 7.14 ) { return new Prediction("NULL", 90, 0); }
	}
	}
	if( Attr7_Max >= 52.22 ) { 
		if( Attr3_Max < 10.13 ) { return new Prediction("NULL", 7, 0); }
		if( Attr3_Max >= 10.13 ) { return new Prediction("smoking", 2, 0); }
	}
	}
		if( Attr3_Mean >= 8.93 ) { return new Prediction("NULL", 1258, 0); }
	}
	if( Attr3_Min < 7.33 ) { 
	if( Attr6_Min >= -1.82 ) { 
	if( Attr4_Mean >= 0.07 ) { 
		if( Attr4_Min >= -0.04 ) { return new Prediction("NULL", 194, 0); }
	if( Attr4_Min < -0.04 ) { 
		if( Attr4_Min >= -0.05 ) { return new Prediction("smoking", 1, 0); }
		if( Attr4_Min < -0.05 ) { return new Prediction("NULL", 69, 2); }
	}
	}
	if( Attr4_Mean < 0.07 ) { 
	if( Attr9_Min >= 1.99 ) { 
		if( Attr6_Mean >= 0.01 ) { return new Prediction("NULL", 128, 21); }
		if( Attr6_Mean < 0.01 ) { return new Prediction("NULL", 853, 31); }
	}
	if( Attr9_Min < 1.99 ) { 
		if( Attr5_Mean >= 0 ) { return new Prediction("NULL", 846, 149); }
		if( Attr5_Mean < 0 ) { return new Prediction("NULL", 1942, 195); }
	}
	}
	}
	if( Attr6_Min < -1.82 ) { 
	if( Attr9_Max >= 19.46 ) { 
	if( Attr3_Max < 9.53 ) { 
		if( Attr8_Max >= 34.6 ) { return new Prediction("smoking", 84, 1); }
		if( Attr8_Max < 34.6 ) { return new Prediction("smoking", 21, 9); }
	}
	if( Attr3_Max >= 9.53 ) { 
		if( Attr1_Max < 15.68 ) { return new Prediction("NULL", 11, 1); }
		if( Attr1_Max >= 15.68 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	if( Attr9_Max < 19.46 ) { 
	if( Attr6_Mean >= -0.24 ) { 
		if( Attr9_Mean < -10.54 ) { return new Prediction("NULL", 87, 29); }
		if( Attr9_Mean >= -10.54 ) { return new Prediction("smoking", 57, 17); }
	}
		if( Attr6_Mean < -0.24 ) { return new Prediction("NULL", 17, 0); }
	}
	}
	}
	}
	if( Attr5_Max >= 0.71 ) { 
	if( Attr7_Min < -37.55 ) { 
	if( Attr1_Min >= -7.07 ) { 
	if( Attr3_Min < -10.91 ) { 
	if( Attr1_Max < 18.11 ) { 
		if( Attr4_Min >= -5.44 ) { return new Prediction("NULL", 69, 1); }
		if( Attr4_Min < -5.44 ) { return new Prediction("NULL", 93, 23); }
	}
		if( Attr1_Max >= 18.11 ) { return new Prediction("NULL", 55, 0); }
	}
	if( Attr3_Min >= -10.91 ) { 
	if( Attr4_Max < 6.82 ) { 
		if( Attr3_Mean < 3.68 ) { return new Prediction("NULL", 628, 256); }
		if( Attr3_Mean >= 3.68 ) { return new Prediction("NULL", 235, 45); }
	}
	if( Attr4_Max >= 6.82 ) { 
		if( Attr7_Min < -37.73 ) { return new Prediction("NULL", 124, 10); }
		if( Attr7_Min >= -37.73 ) { return new Prediction("smoking", 3, 0); }
	}
	}
	}
	if( Attr1_Min < -7.07 ) { 
	if( Attr3_Max >= 11.81 ) { 
	if( Attr4_Min < -5.32 ) { 
		if( Attr5_Max < 6.22 ) { return new Prediction("NULL", 342, 114); }
		if( Attr5_Max >= 6.22 ) { return new Prediction("NULL", 82, 7); }
	}
	if( Attr4_Min >= -5.32 ) { 
		if( Attr2_Mean >= -6.11 ) { return new Prediction("smoking", 168, 68); }
		if( Attr2_Mean < -6.11 ) { return new Prediction("NULL", 43, 11); }
	}
	}
	if( Attr3_Max < 11.81 ) { 
	if( Attr2_Min < -15.15 ) { 
		if( Attr3_Min >= -5.77 ) { return new Prediction("smoking", 143, 18); }
		if( Attr3_Min < -5.77 ) { return new Prediction("NULL", 335, 163); }
	}
	if( Attr2_Min >= -15.15 ) { 
		if( Attr3_Min < -4.7 ) { return new Prediction("smoking", 521, 126); }
		if( Attr3_Min >= -4.7 ) { return new Prediction("smoking", 587, 42); }
	}
	}
	}
	}
	if( Attr7_Min >= -37.55 ) { 
	if( Attr3_Max < 14.16 ) { 
	if( Attr2_Mean >= -5.63 ) { 
	if( Attr1_Min < -5.11 ) { 
		if( Attr6_Min >= -2.35 ) { return new Prediction("NULL", 686, 252); }
		if( Attr6_Min < -2.35 ) { return new Prediction("smoking", 1295, 440); }
	}
	if( Attr1_Min >= -5.11 ) { 
		if( Attr2_Mean >= -2.59 ) { return new Prediction("NULL", 299, 26); }
		if( Attr2_Mean < -2.59 ) { return new Prediction("NULL", 691, 159); }
	}
	}
	if( Attr2_Mean < -5.63 ) { 
	if( Attr7_Mean < -14.33 ) { 
		if( Attr3_Min < -1.31 ) { return new Prediction("NULL", 299, 26); }
		if( Attr3_Min >= -1.31 ) { return new Prediction("NULL", 42, 13); }
	}
	if( Attr7_Mean >= -14.33 ) { 
		if( Attr7_Max < 37.44 ) { return new Prediction("NULL", 1499, 382); }
		if( Attr7_Max >= 37.44 ) { return new Prediction("NULL", 558, 253); }
	}
	}
	}
	if( Attr3_Max >= 14.16 ) { 
	if( Attr2_Max < 19.86 ) { 
		if( Attr6_Mean >= 0.97 ) { return new Prediction("smoking", 7, 0); }
	if( Attr6_Mean < 0.97 ) { 
		if( Attr1_Max < 18.78 ) { return new Prediction("NULL", 908, 163); }
		if( Attr1_Max >= 18.78 ) { return new Prediction("NULL", 158, 58); }
	}
	}
	if( Attr2_Max >= 19.86 ) { 
		if( Attr1_Min < -14.33 ) { return new Prediction("NULL", 53, 0); }
	if( Attr1_Min >= -14.33 ) { 
		if( Attr1_Mean >= -3.13 ) { return new Prediction("NULL", 11, 0); }
		if( Attr1_Mean < -3.13 ) { return new Prediction("smoking", 2, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree2() {
	if( Attr1_Max >= 7.14 ) { 
	if( Attr2_Min < -8.58 ) { 
	if( Attr1_Min >= -6.74 ) { 
	if( Attr1_Mean >= 3.07 ) { 
	if( Attr6_Min >= -4.79 ) { 
		if( Attr1_Max < 13.95 ) { return new Prediction("NULL", 1183, 276); }
		if( Attr1_Max >= 13.95 ) { return new Prediction("NULL", 552, 80); }
	}
	if( Attr6_Min < -4.79 ) { 
		if( Attr3_Max >= 9.14 ) { return new Prediction("NULL", 89, 13); }
		if( Attr3_Max < 9.14 ) { return new Prediction("smoking", 60, 17); }
	}
	}
	if( Attr1_Mean < 3.07 ) { 
	if( Attr5_Max >= 3.71 ) { 
		if( Attr7_Mean < 27.51 ) { return new Prediction("NULL", 58, 2); }
		if( Attr7_Mean >= 27.51 ) { return new Prediction("smoking", 2, 0); }
	}
	if( Attr5_Max < 3.71 ) { 
		if( Attr7_Min < -29.91 ) { return new Prediction("smoking", 368, 174); }
		if( Attr7_Min >= -29.91 ) { return new Prediction("NULL", 313, 101); }
	}
	}
	}
	if( Attr1_Min < -6.74 ) { 
	if( Attr4_Max >= 4.24 ) { 
	if( Attr3_Max >= 11.54 ) { 
		if( Attr3_Max >= 16.49 ) { return new Prediction("NULL", 496, 85); }
		if( Attr3_Max < 16.49 ) { return new Prediction("NULL", 686, 213); }
	}
	if( Attr3_Max < 11.54 ) { 
		if( Attr6_Min >= -3.66 ) { return new Prediction("NULL", 262, 98); }
		if( Attr6_Min < -3.66 ) { return new Prediction("smoking", 521, 155); }
	}
	}
	if( Attr4_Max < 4.24 ) { 
	if( Attr2_Max >= 5.26 ) { 
		if( Attr2_Max >= 19.88 ) { return new Prediction("NULL", 21, 0); }
		if( Attr2_Max < 19.88 ) { return new Prediction("smoking", 228, 113); }
	}
	if( Attr2_Max < 5.26 ) { 
		if( Attr2_Min >= -14.6 ) { return new Prediction("smoking", 1113, 112); }
		if( Attr2_Min < -14.6 ) { return new Prediction("smoking", 448, 139); }
	}
	}
	}
	}
	if( Attr2_Min >= -8.58 ) { 
	if( Attr1_Min >= -0.54 ) { 
	if( Attr7_Max < -26.16 ) { 
		if( Attr9_Min < -9.87 ) { return new Prediction("NULL", 178, 0); }
	if( Attr9_Min >= -9.87 ) { 
		if( Attr6_Max < 1.51 ) { return new Prediction("NULL", 240, 13); }
		if( Attr6_Max >= 1.51 ) { return new Prediction("smoking", 6, 1); }
	}
	}
	if( Attr7_Max >= -26.16 ) { 
	if( Attr8_Mean < 7.44 ) { 
		if( Attr8_Max < 0.84 ) { return new Prediction("NULL", 159, 1); }
		if( Attr8_Max >= 0.84 ) { return new Prediction("NULL", 204, 21); }
	}
	if( Attr8_Mean >= 7.44 ) { 
		if( Attr1_Min >= 8.16 ) { return new Prediction("smoking", 117, 57); }
		if( Attr1_Min < 8.16 ) { return new Prediction("NULL", 296, 47); }
	}
	}
	}
	if( Attr1_Min < -0.54 ) { 
	if( Attr8_Min >= -28.83 ) { 
		if( Attr1_Mean < -2.61 ) { return new Prediction("smoking", 23, 0); }
	if( Attr1_Mean >= -2.61 ) { 
		if( Attr3_Mean < 7.19 ) { return new Prediction("smoking", 49, 19); }
		if( Attr3_Mean >= 7.19 ) { return new Prediction("NULL", 33, 5); }
	}
	}
	if( Attr8_Min < -28.83 ) { 
	if( Attr7_Mean < -54.59 ) { 
		if( Attr1_Max >= 11.72 ) { return new Prediction("smoking", 2, 0); }
		if( Attr1_Max < 11.72 ) { return new Prediction("NULL", 1, 0); }
	}
	if( Attr7_Mean >= -54.59 ) { 
		if( Attr4_Min >= -4.88 ) { return new Prediction("NULL", 25, 0); }
		if( Attr4_Min < -4.88 ) { return new Prediction("NULL", 7, 2); }
	}
	}
	}
	}
	}
	if( Attr1_Max < 7.14 ) { 
	if( Attr3_Mean >= 9.25 ) { 
		if( Attr4_Max < 1.46 ) { return new Prediction("NULL", 1230, 0); }
	if( Attr4_Max >= 1.46 ) { 
	if( Attr7_Max < 17.78 ) { 
	if( Attr3_Mean < 9.43 ) { 
		if( Attr4_Min < -2.43 ) { return new Prediction("NULL", 1, 0); }
		if( Attr4_Min >= -2.43 ) { return new Prediction("smoking", 3, 0); }
	}
		if( Attr3_Mean >= 9.43 ) { return new Prediction("NULL", 14, 0); }
	}
		if( Attr7_Max >= 17.78 ) { return new Prediction("NULL", 31, 0); }
	}
	}
	if( Attr3_Mean < 9.25 ) { 
	if( Attr1_Min >= -7.4 ) { 
	if( Attr4_Max >= 1.25 ) { 
	if( Attr6_Max >= 1.17 ) { 
		if( Attr6_Max >= 4.1 ) { return new Prediction("smoking", 16, 6); }
		if( Attr6_Max < 4.1 ) { return new Prediction("NULL", 578, 121); }
	}
	if( Attr6_Max < 1.17 ) { 
		if( Attr4_Max >= 2.47 ) { return new Prediction("NULL", 277, 14); }
		if( Attr4_Max < 2.47 ) { return new Prediction("NULL", 347, 49); }
	}
	}
	if( Attr4_Max < 1.25 ) { 
	if( Attr2_Max >= -11.05 ) { 
		if( Attr7_Max >= -72.34 ) { return new Prediction("NULL", 2819, 184); }
		if( Attr7_Max < -72.34 ) { return new Prediction("smoking", 16, 5); }
	}
	if( Attr2_Max < -11.05 ) { 
		if( Attr1_Mean >= -1.68 ) { return new Prediction("smoking", 10, 0); }
		if( Attr1_Mean < -1.68 ) { return new Prediction("NULL", 1, 0); }
	}
	}
	}
	if( Attr1_Min < -7.4 ) { 
	if( Attr3_Mean < 3.42 ) { 
	if( Attr1_Mean >= -2.59 ) { 
		if( Attr4_Min < -5.65 ) { return new Prediction("NULL", 77, 13); }
		if( Attr4_Min >= -5.65 ) { return new Prediction("smoking", 416, 103); }
	}
	if( Attr1_Mean < -2.59 ) { 
		if( Attr7_Min >= 12.46 ) { return new Prediction("NULL", 489, 49); }
		if( Attr7_Min < 12.46 ) { return new Prediction("NULL", 787, 208); }
	}
	}
	if( Attr3_Mean >= 3.42 ) { 
	if( Attr3_Min < 3.33 ) { 
		if( Attr3_Min < -3.88 ) { return new Prediction("NULL", 182, 54); }
		if( Attr3_Min >= -3.88 ) { return new Prediction("smoking", 742, 262); }
	}
	if( Attr3_Min >= 3.33 ) { 
		if( Attr4_Max < 0.97 ) { return new Prediction("NULL", 66, 1); }
		if( Attr4_Max >= 0.97 ) { return new Prediction("smoking", 36, 17); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree3() {
	if( Attr5_Max >= 0.73 ) { 
	if( Attr1_Min >= -7.37 ) { 
	if( Attr1_Mean >= 9.75 ) { 
	if( Attr5_Mean >= -0.04 ) { 
		if( Attr4_Mean >= 0.05 ) { return new Prediction("smoking", 1, 0); }
		if( Attr4_Mean < 0.05 ) { return new Prediction("NULL", 8, 0); }
	}
	if( Attr5_Mean < -0.04 ) { 
	if( Attr8_Mean >= 9.97 ) { 
		if( Attr8_Mean >= 12.73 ) { return new Prediction("smoking", 26, 7); }
		if( Attr8_Mean < 12.73 ) { return new Prediction("NULL", 7, 1); }
	}
		if( Attr8_Mean < 9.97 ) { return new Prediction("smoking", 25, 0); }
	}
	}
	if( Attr1_Mean < 9.75 ) { 
	if( Attr6_Min < -1.59 ) { 
	if( Attr4_Min < -4.07 ) { 
		if( Attr6_Max < 0.87 ) { return new Prediction("NULL", 36, 0); }
		if( Attr6_Max >= 0.87 ) { return new Prediction("NULL", 1236, 266); }
	}
	if( Attr4_Min >= -4.07 ) { 
		if( Attr8_Max >= 52.4 ) { return new Prediction("NULL", 61, 3); }
		if( Attr8_Max < 52.4 ) { return new Prediction("NULL", 1100, 370); }
	}
	}
	if( Attr6_Min >= -1.59 ) { 
	if( Attr1_Max >= 4.47 ) { 
		if( Attr9_Min < -17.4 ) { return new Prediction("NULL", 692, 181); }
		if( Attr9_Min >= -17.4 ) { return new Prediction("NULL", 316, 39); }
	}
	if( Attr1_Max < 4.47 ) { 
		if( Attr2_Min >= -21.14 ) { return new Prediction("NULL", 448, 25); }
		if( Attr2_Min < -21.14 ) { return new Prediction("smoking", 2, 0); }
	}
	}
	}
	}
	if( Attr1_Min < -7.37 ) { 
	if( Attr3_Min >= -8.84 ) { 
	if( Attr1_Max >= 7.21 ) { 
	if( Attr4_Max >= 4.38 ) { 
		if( Attr6_Max < 3.94 ) { return new Prediction("NULL", 334, 130); }
		if( Attr6_Max >= 3.94 ) { return new Prediction("smoking", 421, 155); }
	}
	if( Attr4_Max < 4.38 ) { 
		if( Attr6_Min < -3.64 ) { return new Prediction("smoking", 1004, 84); }
		if( Attr6_Min >= -3.64 ) { return new Prediction("smoking", 547, 190); }
	}
	}
	if( Attr1_Max < 7.21 ) { 
	if( Attr3_Mean < 2.82 ) { 
		if( Attr1_Min >= -9.31 ) { return new Prediction("smoking", 258, 82); }
		if( Attr1_Min < -9.31 ) { return new Prediction("NULL", 562, 111); }
	}
	if( Attr3_Mean >= 2.82 ) { 
		if( Attr7_Mean < -52.66 ) { return new Prediction("NULL", 11, 0); }
		if( Attr7_Mean >= -52.66 ) { return new Prediction("smoking", 856, 358); }
	}
	}
	}
	if( Attr3_Min < -8.84 ) { 
	if( Attr3_Min < -14.48 ) { 
	if( Attr5_Mean < -0.09 ) { 
		if( Attr7_Max >= 24.76 ) { return new Prediction("NULL", 78, 0); }
		if( Attr7_Max < 24.76 ) { return new Prediction("NULL", 31, 4); }
	}
	if( Attr5_Mean >= -0.09 ) { 
		if( Attr6_Min < -6.78 ) { return new Prediction("NULL", 71, 30); }
		if( Attr6_Min >= -6.78 ) { return new Prediction("NULL", 357, 60); }
	}
	}
	if( Attr3_Min >= -14.48 ) { 
	if( Attr7_Min >= -37.56 ) { 
		if( Attr9_Mean >= 22.75 ) { return new Prediction("smoking", 76, 29); }
		if( Attr9_Mean < 22.75 ) { return new Prediction("NULL", 728, 206); }
	}
	if( Attr7_Min < -37.56 ) { 
		if( Attr2_Min < -15.05 ) { return new Prediction("NULL", 291, 128); }
		if( Attr2_Min >= -15.05 ) { return new Prediction("smoking", 193, 54); }
	}
	}
	}
	}
	}
	if( Attr5_Max < 0.73 ) { 
	if( Attr6_Min >= -1.95 ) { 
	if( Attr3_Min < 8.48 ) { 
	if( Attr8_Max < -3.52 ) { 
		if( Attr4_Max < 0.26 ) { return new Prediction("NULL", 336, 0); }
	if( Attr4_Max >= 0.26 ) { 
		if( Attr3_Max >= 0.25 ) { return new Prediction("NULL", 171, 1); }
		if( Attr3_Max < 0.25 ) { return new Prediction("NULL", 46, 10); }
	}
	}
	if( Attr8_Max >= -3.52 ) { 
	if( Attr1_Max >= 8.04 ) { 
		if( Attr7_Max < -10.99 ) { return new Prediction("NULL", 591, 66); }
		if( Attr7_Max >= -10.99 ) { return new Prediction("NULL", 312, 98); }
	}
	if( Attr1_Max < 8.04 ) { 
		if( Attr2_Min < -9.62 ) { return new Prediction("NULL", 774, 105); }
		if( Attr2_Min >= -9.62 ) { return new Prediction("NULL", 2392, 172); }
	}
	}
	}
	if( Attr3_Min >= 8.48 ) { 
	if( Attr6_Min >= 0.01 ) { 
		if( Attr2_Max >= -6.9 ) { return new Prediction("NULL", 34, 0); }
		if( Attr2_Max < -6.9 ) { return new Prediction("smoking", 1, 0); }
	}
		if( Attr6_Min < 0.01 ) { return new Prediction("NULL", 1186, 0); }
	}
	}
	if( Attr6_Min < -1.95 ) { 
	if( Attr9_Max >= 15.8 ) { 
	if( Attr1_Min >= -6.2 ) { 
	if( Attr4_Mean >= -0 ) { 
		if( Attr4_Min >= -2.15 ) { return new Prediction("smoking", 4, 0); }
		if( Attr4_Min < -2.15 ) { return new Prediction("NULL", 4, 0); }
	}
		if( Attr4_Mean < -0 ) { return new Prediction("NULL", 10, 0); }
	}
	if( Attr1_Min < -6.2 ) { 
	if( Attr3_Mean < 0.65 ) { 
		if( Attr1_Max >= -1.73 ) { return new Prediction("smoking", 54, 3); }
		if( Attr1_Max < -1.73 ) { return new Prediction("NULL", 5, 0); }
	}
		if( Attr3_Mean >= 0.65 ) { return new Prediction("smoking", 55, 0); }
	}
	}
	if( Attr9_Max < 15.8 ) { 
	if( Attr1_Max < 10.28 ) { 
	if( Attr4_Mean >= 0.04 ) { 
		if( Attr6_Min >= -3.42 ) { return new Prediction("NULL", 15, 1); }
		if( Attr6_Min < -3.42 ) { return new Prediction("smoking", 2, 0); }
	}
	if( Attr4_Mean < 0.04 ) { 
		if( Attr9_Mean >= -22.88 ) { return new Prediction("smoking", 39, 5); }
		if( Attr9_Mean < -22.88 ) { return new Prediction("NULL", 8, 2); }
	}
	}
	if( Attr1_Max >= 10.28 ) { 
		if( Attr4_Mean < -0.23 ) { return new Prediction("NULL", 17, 0); }
	if( Attr4_Mean >= -0.23 ) { 
		if( Attr8_Min < -30.61 ) { return new Prediction("smoking", 3, 0); }
		if( Attr8_Min >= -30.61 ) { return new Prediction("NULL", 43, 7); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree4() {
	if( Attr6_Min < -1.72 ) { 
	if( Attr4_Max >= 4.1 ) { 
	if( Attr1_Min >= -7.49 ) { 
	if( Attr6_Min >= -4.79 ) { 
	if( Attr6_Max >= 1.13 ) { 
		if( Attr4_Min >= -1.84 ) { return new Prediction("smoking", 22, 7); }
		if( Attr4_Min < -1.84 ) { return new Prediction("NULL", 1024, 192); }
	}
	if( Attr6_Max < 1.13 ) { 
		if( Attr7_Min >= -25.3 ) { return new Prediction("NULL", 24, 2); }
		if( Attr7_Min < -25.3 ) { return new Prediction("NULL", 37, 0); }
	}
	}
	if( Attr6_Min < -4.79 ) { 
	if( Attr2_Mean >= -3.44 ) { 
		if( Attr2_Max >= 8.87 ) { return new Prediction("NULL", 24, 0); }
		if( Attr2_Max < 8.87 ) { return new Prediction("NULL", 16, 3); }
	}
	if( Attr2_Mean < -3.44 ) { 
		if( Attr6_Mean < 0.11 ) { return new Prediction("NULL", 146, 52); }
		if( Attr6_Mean >= 0.11 ) { return new Prediction("smoking", 6, 0); }
	}
	}
	}
	if( Attr1_Min < -7.49 ) { 
	if( Attr3_Max < 15.12 ) { 
	if( Attr1_Min < -9.87 ) { 
		if( Attr1_Max >= 8.04 ) { return new Prediction("smoking", 818, 398); }
		if( Attr1_Max < 8.04 ) { return new Prediction("NULL", 505, 159); }
	}
	if( Attr1_Min >= -9.87 ) { 
		if( Attr2_Min >= -12.3 ) { return new Prediction("smoking", 131, 24); }
		if( Attr2_Min < -12.3 ) { return new Prediction("smoking", 449, 197); }
	}
	}
	if( Attr3_Max >= 15.12 ) { 
	if( Attr3_Mean >= -1.81 ) { 
		if( Attr2_Max < 19.86 ) { return new Prediction("NULL", 637, 142); }
		if( Attr2_Max >= 19.86 ) { return new Prediction("NULL", 60, 1); }
	}
		if( Attr3_Mean < -1.81 ) { return new Prediction("NULL", 41, 0); }
	}
	}
	}
	if( Attr4_Max < 4.1 ) { 
	if( Attr6_Mean < -0.22 ) { 
	if( Attr6_Max < 4.55 ) { 
	if( Attr1_Min < -15.7 ) { 
		if( Attr8_Max >= 40.31 ) { return new Prediction("smoking", 3, 1); }
		if( Attr8_Max < 40.31 ) { return new Prediction("NULL", 8, 0); }
	}
		if( Attr1_Min >= -15.7 ) { return new Prediction("NULL", 49, 0); }
	}
		if( Attr6_Max >= 4.55 ) { return new Prediction("smoking", 4, 0); }
	}
	if( Attr6_Mean >= -0.22 ) { 
	if( Attr1_Min >= -6.78 ) { 
	if( Attr2_Max < 3.18 ) { 
		if( Attr7_Mean < 13.09 ) { return new Prediction("NULL", 665, 256); }
		if( Attr7_Mean >= 13.09 ) { return new Prediction("NULL", 117, 15); }
	}
	if( Attr2_Max >= 3.18 ) { 
		if( Attr2_Min < 1.01 ) { return new Prediction("NULL", 260, 48); }
		if( Attr2_Min >= 1.01 ) { return new Prediction("smoking", 13, 1); }
	}
	}
	if( Attr1_Min < -6.78 ) { 
	if( Attr3_Max < 11.32 ) { 
		if( Attr6_Min >= -2.35 ) { return new Prediction("NULL", 259, 125); }
		if( Attr6_Min < -2.35 ) { return new Prediction("smoking", 1818, 268); }
	}
	if( Attr3_Max >= 11.32 ) { 
		if( Attr6_Min >= -2.69 ) { return new Prediction("NULL", 152, 43); }
		if( Attr6_Min < -2.69 ) { return new Prediction("smoking", 270, 120); }
	}
	}
	}
	}
	}
	if( Attr6_Min >= -1.72 ) { 
	if( Attr5_Max < 0.26 ) { 
	if( Attr4_Max < 0 ) { 
		if( Attr5_Max < -0 ) { return new Prediction("NULL", 124, 0); }
	if( Attr5_Max >= -0 ) { 
	if( Attr3_Max >= -0.02 ) { 
		if( Attr3_Mean >= 8.89 ) { return new Prediction("NULL", 110, 0); }
		if( Attr3_Mean < 8.89 ) { return new Prediction("NULL", 183, 32); }
	}
	if( Attr3_Max < -0.02 ) { 
		if( Attr4_Mean >= -0.01 ) { return new Prediction("smoking", 106, 43); }
		if( Attr4_Mean < -0.01 ) { return new Prediction("NULL", 27, 0); }
	}
	}
	}
	if( Attr4_Max >= 0 ) { 
	if( Attr3_Min < 7.45 ) { 
	if( Attr4_Min < -0.03 ) { 
		if( Attr7_Max >= -69.85 ) { return new Prediction("NULL", 1922, 143); }
		if( Attr7_Max < -69.85 ) { return new Prediction("smoking", 17, 4); }
	}
	if( Attr4_Min >= -0.03 ) { 
		if( Attr8_Max < 11.31 ) { return new Prediction("NULL", 320, 0); }
		if( Attr8_Max >= 11.31 ) { return new Prediction("NULL", 267, 11); }
	}
	}
	if( Attr3_Min >= 7.45 ) { 
	if( Attr1_Max >= 0.77 ) { 
		if( Attr3_Mean >= 8.85 ) { return new Prediction("NULL", 98, 0); }
		if( Attr3_Mean < 8.85 ) { return new Prediction("NULL", 52, 3); }
	}
		if( Attr1_Max < 0.77 ) { return new Prediction("NULL", 1140, 0); }
	}
	}
	}
	if( Attr5_Max >= 0.26 ) { 
	if( Attr3_Min >= 6.52 ) { 
	if( Attr5_Max >= 0.61 ) { 
	if( Attr1_Min < -1.61 ) { 
		if( Attr3_Max >= 13.18 ) { return new Prediction("NULL", 7, 1); }
		if( Attr3_Max < 13.18 ) { return new Prediction("NULL", 98, 0); }
	}
	if( Attr1_Min >= -1.61 ) { 
		if( Attr5_Mean >= -0 ) { return new Prediction("NULL", 21, 0); }
		if( Attr5_Mean < -0 ) { return new Prediction("smoking", 12, 6); }
	}
	}
		if( Attr5_Max < 0.61 ) { return new Prediction("NULL", 125, 0); }
	}
	if( Attr3_Min < 6.52 ) { 
	if( Attr3_Max < 5.92 ) { 
		if( Attr4_Min >= -0.21 ) { return new Prediction("NULL", 65, 0); }
	if( Attr4_Min < -0.21 ) { 
		if( Attr9_Max < 13.02 ) { return new Prediction("NULL", 592, 135); }
		if( Attr9_Max >= 13.02 ) { return new Prediction("NULL", 912, 93); }
	}
	}
	if( Attr3_Max >= 5.92 ) { 
	if( Attr2_Min < -11.37 ) { 
		if( Attr1_Mean >= -4.4 ) { return new Prediction("NULL", 819, 174); }
		if( Attr1_Mean < -4.4 ) { return new Prediction("NULL", 195, 14); }
	}
	if( Attr2_Min >= -11.37 ) { 
		if( Attr4_Max < 3.81 ) { return new Prediction("NULL", 876, 216); }
		if( Attr4_Max >= 3.81 ) { return new Prediction("NULL", 232, 104); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree5() {
	if( Attr3_Min >= 3.73 ) { 
	if( Attr5_Max < 0.04 ) { 
	if( Attr3_Max < 8.73 ) { 
		if( Attr6_Mean < -0 ) { return new Prediction("NULL", 110, 0); }
	if( Attr6_Mean >= -0 ) { 
		if( Attr7_Mean >= 5.94 ) { return new Prediction("NULL", 85, 0); }
	if( Attr7_Mean < 5.94 ) { 
		if( Attr5_Min >= -0.03 ) { return new Prediction("NULL", 95, 15); }
		if( Attr5_Min < -0.03 ) { return new Prediction("NULL", 57, 0); }
	}
	}
	}
		if( Attr3_Max >= 8.73 ) { return new Prediction("NULL", 1175, 0); }
	}
	if( Attr5_Max >= 0.04 ) { 
	if( Attr4_Min >= -0.43 ) { 
		if( Attr1_Mean < -0.2 ) { return new Prediction("NULL", 255, 0); }
	if( Attr1_Mean >= -0.2 ) { 
		if( Attr8_Min < 0.51 ) { return new Prediction("NULL", 123, 0); }
	if( Attr8_Min >= 0.51 ) { 
		if( Attr2_Mean >= -7.34 ) { return new Prediction("NULL", 129, 19); }
		if( Attr2_Mean < -7.34 ) { return new Prediction("NULL", 86, 0); }
	}
	}
	}
	if( Attr4_Min < -0.43 ) { 
	if( Attr2_Min >= -11.05 ) { 
	if( Attr6_Min >= -2.26 ) { 
		if( Attr1_Max >= 2.32 ) { return new Prediction("NULL", 231, 42); }
		if( Attr1_Max < 2.32 ) { return new Prediction("NULL", 369, 16); }
	}
	if( Attr6_Min < -2.26 ) { 
		if( Attr5_Min >= -2.23 ) { return new Prediction("smoking", 36, 14); }
		if( Attr5_Min < -2.23 ) { return new Prediction("NULL", 16, 0); }
	}
	}
		if( Attr2_Min < -11.05 ) { return new Prediction("NULL", 74, 0); }
	}
	}
	}
	if( Attr3_Min < 3.73 ) { 
	if( Attr3_Max < 3.09 ) { 
	if( Attr5_Min < -0.52 ) { 
	if( Attr6_Mean >= -0.26 ) { 
	if( Attr9_Max < 13.21 ) { 
		if( Attr6_Max < 0.85 ) { return new Prediction("NULL", 98, 24); }
		if( Attr6_Max >= 0.85 ) { return new Prediction("smoking", 177, 81); }
	}
	if( Attr9_Max >= 13.21 ) { 
		if( Attr2_Mean >= -4.91 ) { return new Prediction("NULL", 245, 72); }
		if( Attr2_Mean < -4.91 ) { return new Prediction("NULL", 339, 31); }
	}
	}
	if( Attr6_Mean < -0.26 ) { 
		if( Attr2_Max >= -8.48 ) { return new Prediction("NULL", 94, 0); }
		if( Attr2_Max < -8.48 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	if( Attr5_Min >= -0.52 ) { 
	if( Attr6_Min < 0 ) { 
	if( Attr2_Min >= -11.06 ) { 
		if( Attr7_Max < -71.34 ) { return new Prediction("smoking", 22, 9); }
		if( Attr7_Max >= -71.34 ) { return new Prediction("NULL", 1735, 81); }
	}
	if( Attr2_Min < -11.06 ) { 
		if( Attr8_Max >= 44.35 ) { return new Prediction("smoking", 7, 0); }
		if( Attr8_Max < 44.35 ) { return new Prediction("NULL", 35, 10); }
	}
	}
	if( Attr6_Min >= 0 ) { 
	if( Attr5_Min >= 0.01 ) { 
		if( Attr4_Mean >= -0.01 ) { return new Prediction("NULL", 16, 2); }
		if( Attr4_Mean < -0.01 ) { return new Prediction("NULL", 56, 0); }
	}
	if( Attr5_Min < 0.01 ) { 
		if( Attr6_Min >= 0.01 ) { return new Prediction("NULL", 100, 13); }
		if( Attr6_Min < 0.01 ) { return new Prediction("smoking", 50, 19); }
	}
	}
	}
	}
	if( Attr3_Max >= 3.09 ) { 
	if( Attr4_Min < -5.28 ) { 
	if( Attr4_Max >= 5.31 ) { 
	if( Attr2_Min < -21.12 ) { 
		if( Attr4_Mean < 0.23 ) { return new Prediction("NULL", 211, 16); }
		if( Attr4_Mean >= 0.23 ) { return new Prediction("smoking", 10, 4); }
	}
	if( Attr2_Min >= -21.12 ) { 
		if( Attr4_Mean >= -0.17 ) { return new Prediction("NULL", 1726, 453); }
		if( Attr4_Mean < -0.17 ) { return new Prediction("NULL", 93, 8); }
	}
	}
	if( Attr4_Max < 5.31 ) { 
	if( Attr6_Max >= 4.84 ) { 
		if( Attr3_Mean < 4.58 ) { return new Prediction("smoking", 175, 42); }
		if( Attr3_Mean >= 4.58 ) { return new Prediction("NULL", 18, 1); }
	}
	if( Attr6_Max < 4.84 ) { 
		if( Attr7_Max < 29.81 ) { return new Prediction("NULL", 489, 119); }
		if( Attr7_Max >= 29.81 ) { return new Prediction("NULL", 338, 144); }
	}
	}
	}
	if( Attr4_Min >= -5.28 ) { 
	if( Attr1_Min < -7.3 ) { 
	if( Attr3_Max >= 11.98 ) { 
		if( Attr7_Min >= -32.95 ) { return new Prediction("NULL", 453, 109); }
		if( Attr7_Min < -32.95 ) { return new Prediction("NULL", 242, 112); }
	}
	if( Attr3_Max < 11.98 ) { 
		if( Attr2_Min < -7.27 ) { return new Prediction("smoking", 2957, 834); }
		if( Attr2_Min >= -7.27 ) { return new Prediction("NULL", 257, 70); }
	}
	}
	if( Attr1_Min >= -7.3 ) { 
	if( Attr7_Min < -27.7 ) { 
		if( Attr7_Max < -12.7 ) { return new Prediction("NULL", 457, 70); }
		if( Attr7_Max >= -12.7 ) { return new Prediction("NULL", 1211, 390); }
	}
	if( Attr7_Min >= -27.7 ) { 
		if( Attr2_Min < -6.89 ) { return new Prediction("NULL", 1324, 239); }
		if( Attr2_Min >= -6.89 ) { return new Prediction("NULL", 101, 2); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree6() {
	if( Attr5_Min >= -0.74 ) { 
	if( Attr3_Mean < 8.93 ) { 
	if( Attr6_Max >= 2.12 ) { 
	if( Attr6_Min < -1.84 ) { 
	if( Attr1_Mean < 9.1 ) { 
		if( Attr9_Min < -17.4 ) { return new Prediction("smoking", 37, 8); }
		if( Attr9_Min >= -17.4 ) { return new Prediction("smoking", 32, 0); }
	}
		if( Attr1_Mean >= 9.1 ) { return new Prediction("NULL", 4, 0); }
	}
	if( Attr6_Min >= -1.84 ) { 
	if( Attr3_Mean < 7.82 ) { 
		if( Attr3_Min < -0.03 ) { return new Prediction("NULL", 46, 16); }
		if( Attr3_Min >= -0.03 ) { return new Prediction("smoking", 17, 3); }
	}
		if( Attr3_Mean >= 7.82 ) { return new Prediction("NULL", 11, 0); }
	}
	}
	if( Attr6_Max < 2.12 ) { 
	if( Attr8_Max < -2.32 ) { 
		if( Attr6_Max < 0.41 ) { return new Prediction("NULL", 473, 0); }
	if( Attr6_Max >= 0.41 ) { 
		if( Attr1_Max >= 13.38 ) { return new Prediction("smoking", 1, 0); }
		if( Attr1_Max < 13.38 ) { return new Prediction("NULL", 85, 2); }
	}
	}
	if( Attr8_Max >= -2.32 ) { 
	if( Attr6_Min >= -1.55 ) { 
		if( Attr7_Max >= -72.34 ) { return new Prediction("NULL", 3729, 395); }
		if( Attr7_Max < -72.34 ) { return new Prediction("smoking", 18, 4); }
	}
	if( Attr6_Min < -1.55 ) { 
		if( Attr9_Mean < 14.36 ) { return new Prediction("NULL", 147, 38); }
		if( Attr9_Mean >= 14.36 ) { return new Prediction("smoking", 16, 0); }
	}
	}
	}
	}
	if( Attr3_Mean >= 8.93 ) { 
		if( Attr1_Min >= -3.95 ) { return new Prediction("NULL", 1339, 0); }
	if( Attr1_Min < -3.95 ) { 
		if( Attr1_Min >= -3.98 ) { return new Prediction("smoking", 1, 0); }
		if( Attr1_Min < -3.98 ) { return new Prediction("NULL", 26, 0); }
	}
	}
	}
	if( Attr5_Min < -0.74 ) { 
	if( Attr7_Max < 16.73 ) { 
	if( Attr5_Mean >= -0.34 ) { 
	if( Attr9_Min < -11.77 ) { 
	if( Attr6_Min >= -4.71 ) { 
		if( Attr6_Max >= 2.04 ) { return new Prediction("NULL", 1162, 398); }
		if( Attr6_Max < 2.04 ) { return new Prediction("NULL", 1090, 259); }
	}
	if( Attr6_Min < -4.71 ) { 
		if( Attr4_Max >= 3.85 ) { return new Prediction("NULL", 197, 76); }
		if( Attr4_Max < 3.85 ) { return new Prediction("smoking", 125, 32); }
	}
	}
	if( Attr9_Min >= -11.77 ) { 
	if( Attr1_Min >= -7.42 ) { 
		if( Attr6_Min < -0.58 ) { return new Prediction("NULL", 440, 66); }
		if( Attr6_Min >= -0.58 ) { return new Prediction("NULL", 76, 0); }
	}
	if( Attr1_Min < -7.42 ) { 
		if( Attr8_Mean >= 42.62 ) { return new Prediction("smoking", 17, 0); }
		if( Attr8_Mean < 42.62 ) { return new Prediction("NULL", 184, 63); }
	}
	}
	}
	if( Attr5_Mean < -0.34 ) { 
		if( Attr2_Mean >= -9.33 ) { return new Prediction("NULL", 175, 0); }
	if( Attr2_Mean < -9.33 ) { 
		if( Attr3_Mean >= -1.74 ) { return new Prediction("NULL", 6, 0); }
		if( Attr3_Mean < -1.74 ) { return new Prediction("smoking", 2, 0); }
	}
	}
	}
	if( Attr7_Max >= 16.73 ) { 
	if( Attr6_Min >= -2.35 ) { 
	if( Attr2_Min < -13.32 ) { 
	if( Attr7_Mean >= 5.54 ) { 
		if( Attr6_Mean >= 0.01 ) { return new Prediction("NULL", 212, 37); }
		if( Attr6_Mean < 0.01 ) { return new Prediction("NULL", 258, 10); }
	}
	if( Attr7_Mean < 5.54 ) { 
		if( Attr3_Max < 19.6 ) { return new Prediction("NULL", 226, 65); }
		if( Attr3_Max >= 19.6 ) { return new Prediction("smoking", 14, 1); }
	}
	}
	if( Attr2_Min >= -13.32 ) { 
	if( Attr7_Min < -36.12 ) { 
		if( Attr9_Max < 55.41 ) { return new Prediction("smoking", 243, 95); }
		if( Attr9_Max >= 55.41 ) { return new Prediction("NULL", 15, 1); }
	}
	if( Attr7_Min >= -36.12 ) { 
		if( Attr4_Min < -1.73 ) { return new Prediction("NULL", 744, 222); }
		if( Attr4_Min >= -1.73 ) { return new Prediction("NULL", 275, 39); }
	}
	}
	}
	if( Attr6_Min < -2.35 ) { 
	if( Attr7_Min < -37.42 ) { 
	if( Attr2_Max >= 5.86 ) { 
		if( Attr1_Max >= 0.12 ) { return new Prediction("NULL", 477, 153); }
		if( Attr1_Max < 0.12 ) { return new Prediction("smoking", 14, 0); }
	}
	if( Attr2_Max < 5.86 ) { 
		if( Attr1_Max >= 9.62 ) { return new Prediction("smoking", 749, 214); }
		if( Attr1_Max < 9.62 ) { return new Prediction("smoking", 513, 50); }
	}
	}
	if( Attr7_Min >= -37.42 ) { 
	if( Attr3_Min >= -8.8 ) { 
		if( Attr2_Min >= -16.6 ) { return new Prediction("smoking", 1337, 494); }
		if( Attr2_Min < -16.6 ) { return new Prediction("NULL", 337, 141); }
	}
	if( Attr3_Min < -8.8 ) { 
		if( Attr4_Min >= -5.03 ) { return new Prediction("NULL", 210, 86); }
		if( Attr4_Min < -5.03 ) { return new Prediction("NULL", 798, 186); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree7() {
	if( Attr5_Min >= -0.58 ) { 
	if( Attr4_Min < -0.01 ) { 
	if( Attr3_Min >= 7.87 ) { 
	if( Attr3_Mean < 8.83 ) { 
	if( Attr1_Min >= 1.19 ) { 
		if( Attr7_Max >= -3.3 ) { return new Prediction("NULL", 9, 0); }
		if( Attr7_Max < -3.3 ) { return new Prediction("smoking", 8, 4); }
	}
	if( Attr1_Min < 1.19 ) { 
		if( Attr1_Max < 0.71 ) { return new Prediction("NULL", 131, 0); }
		if( Attr1_Max >= 0.71 ) { return new Prediction("NULL", 19, 1); }
	}
	}
		if( Attr3_Mean >= 8.83 ) { return new Prediction("NULL", 580, 0); }
	}
	if( Attr3_Min < 7.87 ) { 
	if( Attr4_Min < -0.01 ) { 
	if( Attr9_Min >= 9.37 ) { 
		if( Attr4_Min < -0.02 ) { return new Prediction("NULL", 595, 11); }
		if( Attr4_Min >= -0.02 ) { return new Prediction("NULL", 17, 5); }
	}
	if( Attr9_Min < 9.37 ) { 
		if( Attr5_Mean >= 0 ) { return new Prediction("NULL", 1249, 235); }
		if( Attr5_Mean < 0 ) { return new Prediction("NULL", 1471, 119); }
	}
	}
	if( Attr4_Min >= -0.01 ) { 
		if( Attr7_Mean < -24.7 ) { return new Prediction("smoking", 9, 0); }
	if( Attr7_Mean >= -24.7 ) { 
		if( Attr9_Mean < -20.25 ) { return new Prediction("smoking", 13, 2); }
		if( Attr9_Mean >= -20.25 ) { return new Prediction("NULL", 47, 12); }
	}
	}
	}
	}
	if( Attr4_Min >= -0.01 ) { 
		if( Attr3_Mean >= 5.43 ) { return new Prediction("NULL", 818, 0); }
	if( Attr3_Mean < 5.43 ) { 
	if( Attr2_Min >= -3.01 ) { 
		if( Attr4_Max >= -0 ) { return new Prediction("NULL", 233, 0); }
		if( Attr4_Max < -0 ) { return new Prediction("smoking", 1, 0); }
	}
	if( Attr2_Min < -3.01 ) { 
	if( Attr8_Mean >= -0.54 ) { 
		if( Attr1_Max < 9.01 ) { return new Prediction("NULL", 222, 6); }
		if( Attr1_Max >= 9.01 ) { return new Prediction("NULL", 18, 6); }
	}
	if( Attr8_Mean < -0.54 ) { 
		if( Attr7_Mean < -14.24 ) { return new Prediction("smoking", 12, 2); }
		if( Attr7_Mean >= -14.24 ) { return new Prediction("NULL", 16, 4); }
	}
	}
	}
	}
	}
	if( Attr5_Min < -0.58 ) { 
	if( Attr3_Max < 12.42 ) { 
	if( Attr6_Max >= 2.22 ) { 
	if( Attr6_Min >= -2.73 ) { 
		if( Attr4_Mean < -0.12 ) { return new Prediction("NULL", 46, 0); }
	if( Attr4_Mean >= -0.12 ) { 
		if( Attr4_Max < 5.93 ) { return new Prediction("NULL", 999, 447); }
		if( Attr4_Max >= 5.93 ) { return new Prediction("NULL", 227, 37); }
	}
	}
	if( Attr6_Min < -2.73 ) { 
	if( Attr1_Min >= -6.81 ) { 
		if( Attr4_Min >= -3.61 ) { return new Prediction("smoking", 180, 77); }
		if( Attr4_Min < -3.61 ) { return new Prediction("NULL", 394, 88); }
	}
	if( Attr1_Min < -6.81 ) { 
		if( Attr3_Min < -7.58 ) { return new Prediction("smoking", 784, 358); }
		if( Attr3_Min >= -7.58 ) { return new Prediction("smoking", 1650, 238); }
	}
	}
	}
	if( Attr6_Max < 2.22 ) { 
	if( Attr6_Min >= -1.98 ) { 
		if( Attr5_Mean < -0.33 ) { return new Prediction("NULL", 136, 0); }
	if( Attr5_Mean >= -0.33 ) { 
		if( Attr1_Mean >= -4.62 ) { return new Prediction("NULL", 1899, 312); }
		if( Attr1_Mean < -4.62 ) { return new Prediction("NULL", 405, 124); }
	}
	}
	if( Attr6_Min < -1.98 ) { 
	if( Attr7_Max < 37.24 ) { 
		if( Attr1_Mean < 2.6 ) { return new Prediction("NULL", 482, 203); }
		if( Attr1_Mean >= 2.6 ) { return new Prediction("NULL", 386, 72); }
	}
	if( Attr7_Max >= 37.24 ) { 
		if( Attr7_Max < 46.87 ) { return new Prediction("smoking", 297, 69); }
		if( Attr7_Max >= 46.87 ) { return new Prediction("NULL", 83, 27); }
	}
	}
	}
	}
	if( Attr3_Max >= 12.42 ) { 
	if( Attr2_Mean >= -5.95 ) { 
	if( Attr3_Mean < 7.19 ) { 
	if( Attr2_Max >= 10.39 ) { 
		if( Attr3_Mean >= -0.51 ) { return new Prediction("NULL", 390, 95); }
		if( Attr3_Mean < -0.51 ) { return new Prediction("NULL", 63, 3); }
	}
	if( Attr2_Max < 10.39 ) { 
		if( Attr3_Min < -0.02 ) { return new Prediction("NULL", 833, 294); }
		if( Attr3_Min >= -0.02 ) { return new Prediction("smoking", 82, 28); }
	}
	}
	if( Attr3_Mean >= 7.19 ) { 
	if( Attr9_Max >= -28.02 ) { 
		if( Attr3_Mean < 8.22 ) { return new Prediction("NULL", 184, 25); }
		if( Attr3_Mean >= 8.22 ) { return new Prediction("NULL", 130, 4); }
	}
	if( Attr9_Max < -28.02 ) { 
		if( Attr2_Min < -7.94 ) { return new Prediction("smoking", 29, 11); }
		if( Attr2_Min >= -7.94 ) { return new Prediction("NULL", 13, 0); }
	}
	}
	}
	if( Attr2_Mean < -5.95 ) { 
	if( Attr5_Mean >= -0.07 ) { 
	if( Attr3_Min < -12.64 ) { 
		if( Attr9_Min < -71.99 ) { return new Prediction("NULL", 12, 0); }
		if( Attr9_Min >= -71.99 ) { return new Prediction("NULL", 156, 61); }
	}
	if( Attr3_Min >= -12.64 ) { 
		if( Attr4_Min >= -9.05 ) { return new Prediction("NULL", 402, 75); }
		if( Attr4_Min < -9.05 ) { return new Prediction("NULL", 49, 0); }
	}
	}
	if( Attr5_Mean < -0.07 ) { 
		if( Attr4_Min < -19.74 ) { return new Prediction("smoking", 1, 0); }
	if( Attr4_Min >= -19.74 ) { 
		if( Attr9_Max >= -17.31 ) { return new Prediction("NULL", 97, 2); }
		if( Attr9_Max < -17.31 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree8() {
	if( Attr1_Min >= -6.65 ) { 
	if( Attr4_Max < 0.95 ) { 
	if( Attr1_Max >= 0.61 ) { 
	if( Attr8_Max >= -2.21 ) { 
	if( Attr6_Max < 0 ) { 
		if( Attr9_Min < -22.88 ) { return new Prediction("NULL", 93, 5); }
		if( Attr9_Min >= -22.88 ) { return new Prediction("NULL", 171, 0); }
	}
	if( Attr6_Max >= 0 ) { 
		if( Attr1_Mean >= 8.3 ) { return new Prediction("NULL", 261, 75); }
		if( Attr1_Mean < 8.3 ) { return new Prediction("NULL", 1750, 149); }
	}
	}
	if( Attr8_Max < -2.21 ) { 
		if( Attr7_Mean < 0.94 ) { return new Prediction("NULL", 252, 0); }
	if( Attr7_Mean >= 0.94 ) { 
		if( Attr7_Max >= 19.52 ) { return new Prediction("NULL", 39, 0); }
		if( Attr7_Max < 19.52 ) { return new Prediction("NULL", 65, 6); }
	}
	}
	}
	if( Attr1_Max < 0.61 ) { 
	if( Attr3_Mean < 7.76 ) { 
	if( Attr8_Mean >= 13.65 ) { 
		if( Attr2_Max < -7.3 ) { return new Prediction("NULL", 280, 10); }
		if( Attr2_Max >= -7.3 ) { return new Prediction("NULL", 209, 32); }
	}
	if( Attr8_Mean < 13.65 ) { 
		if( Attr2_Min < -11.02 ) { return new Prediction("NULL", 3, 1); }
		if( Attr2_Min >= -11.02 ) { return new Prediction("NULL", 176, 0); }
	}
	}
		if( Attr3_Mean >= 7.76 ) { return new Prediction("NULL", 1330, 0); }
	}
	}
	if( Attr4_Max >= 0.95 ) { 
	if( Attr5_Min < -1.12 ) { 
	if( Attr4_Mean >= -0.08 ) { 
	if( Attr7_Min < -31.34 ) { 
		if( Attr4_Max >= 3.79 ) { return new Prediction("NULL", 734, 154); }
		if( Attr4_Max < 3.79 ) { return new Prediction("NULL", 616, 230); }
	}
	if( Attr7_Min >= -31.34 ) { 
		if( Attr9_Max >= 8.37 ) { return new Prediction("NULL", 666, 92); }
		if( Attr9_Max < 8.37 ) { return new Prediction("NULL", 610, 163); }
	}
	}
	if( Attr4_Mean < -0.08 ) { 
	if( Attr2_Mean < 3.11 ) { 
		if( Attr2_Min >= -17.76 ) { return new Prediction("NULL", 260, 9); }
		if( Attr2_Min < -17.76 ) { return new Prediction("NULL", 48, 14); }
	}
		if( Attr2_Mean >= 3.11 ) { return new Prediction("smoking", 2, 0); }
	}
	}
	if( Attr5_Min >= -1.12 ) { 
	if( Attr6_Max < 2.36 ) { 
	if( Attr1_Mean >= 0.72 ) { 
		if( Attr7_Min < -75.55 ) { return new Prediction("smoking", 15, 6); }
		if( Attr7_Min >= -75.55 ) { return new Prediction("NULL", 968, 131); }
	}
	if( Attr1_Mean < 0.72 ) { 
		if( Attr8_Min < 14.19 ) { return new Prediction("NULL", 302, 10); }
		if( Attr8_Min >= 14.19 ) { return new Prediction("NULL", 146, 23); }
	}
	}
	if( Attr6_Max >= 2.36 ) { 
	if( Attr4_Min >= -1.84 ) { 
		if( Attr8_Max >= 4.22 ) { return new Prediction("smoking", 38, 11); }
		if( Attr8_Max < 4.22 ) { return new Prediction("NULL", 11, 0); }
	}
	if( Attr4_Min < -1.84 ) { 
		if( Attr7_Max >= 29.37 ) { return new Prediction("NULL", 17, 0); }
		if( Attr7_Max < 29.37 ) { return new Prediction("NULL", 52, 12); }
	}
	}
	}
	}
	}
	if( Attr1_Min < -6.65 ) { 
	if( Attr1_Max >= -2.28 ) { 
	if( Attr3_Min < -8.89 ) { 
	if( Attr9_Min >= -29.93 ) { 
	if( Attr2_Mean < -6.59 ) { 
		if( Attr7_Max < -18.36 ) { return new Prediction("smoking", 8, 1); }
		if( Attr7_Max >= -18.36 ) { return new Prediction("NULL", 147, 31); }
	}
	if( Attr2_Mean >= -6.59 ) { 
		if( Attr1_Min >= -13.42 ) { return new Prediction("smoking", 296, 99); }
		if( Attr1_Min < -13.42 ) { return new Prediction("NULL", 176, 63); }
	}
	}
	if( Attr9_Min < -29.93 ) { 
	if( Attr4_Max < 7.2 ) { 
		if( Attr2_Mean < -7.65 ) { return new Prediction("NULL", 55, 3); }
		if( Attr2_Mean >= -7.65 ) { return new Prediction("NULL", 650, 245); }
	}
	if( Attr4_Max >= 7.2 ) { 
		if( Attr1_Mean >= 3.42 ) { return new Prediction("NULL", 109, 40); }
		if( Attr1_Mean < 3.42 ) { return new Prediction("NULL", 570, 96); }
	}
	}
	}
	if( Attr3_Min >= -8.89 ) { 
	if( Attr9_Mean < -2.44 ) { 
	if( Attr3_Max >= 11.49 ) { 
		if( Attr5_Min < -0.79 ) { return new Prediction("NULL", 809, 303); }
		if( Attr5_Min >= -0.79 ) { return new Prediction("NULL", 41, 2); }
	}
	if( Attr3_Max < 11.49 ) { 
		if( Attr8_Min < -16.94 ) { return new Prediction("smoking", 568, 142); }
		if( Attr8_Min >= -16.94 ) { return new Prediction("smoking", 882, 343); }
	}
	}
	if( Attr9_Mean >= -2.44 ) { 
	if( Attr7_Min >= -38.16 ) { 
		if( Attr4_Max >= 3.79 ) { return new Prediction("NULL", 274, 120); }
		if( Attr4_Max < 3.79 ) { return new Prediction("smoking", 596, 173); }
	}
	if( Attr7_Min < -38.16 ) { 
		if( Attr2_Max >= 5.96 ) { return new Prediction("smoking", 69, 32); }
		if( Attr2_Max < 5.96 ) { return new Prediction("smoking", 697, 63); }
	}
	}
	}
	}
	if( Attr1_Max < -2.28 ) { 
	if( Attr5_Min < -0.72 ) { 
	if( Attr7_Min < 4.2 ) { 
		if( Attr1_Mean >= -5.5 ) { return new Prediction("NULL", 10, 0); }
	if( Attr1_Mean < -5.5 ) { 
		if( Attr2_Mean < -0.2 ) { return new Prediction("NULL", 95, 35); }
		if( Attr2_Mean >= -0.2 ) { return new Prediction("smoking", 40, 4); }
	}
	}
	if( Attr7_Min >= 4.2 ) { 
	if( Attr3_Min < 0.12 ) { 
		if( Attr2_Mean < -0.45 ) { return new Prediction("NULL", 190, 12); }
		if( Attr2_Mean >= -0.45 ) { return new Prediction("smoking", 6, 1); }
	}
	if( Attr3_Min >= 0.12 ) { 
		if( Attr6_Mean >= -0.03 ) { return new Prediction("smoking", 37, 5); }
		if( Attr6_Mean < -0.03 ) { return new Prediction("NULL", 12, 4); }
	}
	}
	}
	if( Attr5_Min >= -0.72 ) { 
	if( Attr8_Min < -16.97 ) { 
		if( Attr7_Max >= 51.09 ) { return new Prediction("smoking", 2, 0); }
	if( Attr7_Max < 51.09 ) { 
		if( Attr4_Min >= 0 ) { return new Prediction("NULL", 7, 1); }
		if( Attr4_Min < 0 ) { return new Prediction("NULL", 114, 0); }
	}
	}
	if( Attr8_Min >= -16.97 ) { 
	if( Attr3_Min >= 1.08 ) { 
		if( Attr8_Mean >= -5.58 ) { return new Prediction("NULL", 143, 6); }
		if( Attr8_Mean < -5.58 ) { return new Prediction("smoking", 4, 0); }
	}
	if( Attr3_Min < 1.08 ) { 
		if( Attr6_Max >= 0.77 ) { return new Prediction("NULL", 18, 0); }
		if( Attr6_Max < 0.77 ) { return new Prediction("NULL", 139, 40); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree9() {
	if( Attr2_Max < -3.73 ) { 
	if( Attr1_Mean >= 8.93 ) { 
		if( Attr9_Max >= -45.9 ) { return new Prediction("smoking", 15, 0); }
		if( Attr9_Max < -45.9 ) { return new Prediction("NULL", 5, 0); }
	}
	if( Attr1_Mean < 8.93 ) { 
	if( Attr1_Min >= -4.47 ) { 
	if( Attr7_Mean < -77.34 ) { 
	if( Attr5_Min < -0.04 ) { 
		if( Attr1_Max >= 1.74 ) { return new Prediction("smoking", 15, 0); }
		if( Attr1_Max < 1.74 ) { return new Prediction("NULL", 1, 0); }
	}
		if( Attr5_Min >= -0.04 ) { return new Prediction("NULL", 3, 0); }
	}
	if( Attr7_Mean >= -77.34 ) { 
	if( Attr2_Min >= -10.26 ) { 
		if( Attr3_Min < -2.41 ) { return new Prediction("NULL", 840, 19); }
		if( Attr3_Min >= -2.41 ) { return new Prediction("NULL", 1390, 100); }
	}
	if( Attr2_Min < -10.26 ) { 
		if( Attr4_Max >= 0.13 ) { return new Prediction("NULL", 435, 51); }
		if( Attr4_Max < 0.13 ) { return new Prediction("NULL", 28, 12); }
	}
	}
	}
	if( Attr1_Min < -4.47 ) { 
	if( Attr1_Min < -4.53 ) { 
	if( Attr3_Min >= 4.32 ) { 
		if( Attr6_Min >= 0.01 ) { return new Prediction("NULL", 1, 0); }
		if( Attr6_Min < 0.01 ) { return new Prediction("smoking", 8, 0); }
	}
	if( Attr3_Min < 4.32 ) { 
		if( Attr5_Max >= 0.97 ) { return new Prediction("NULL", 129, 37); }
		if( Attr5_Max < 0.97 ) { return new Prediction("NULL", 215, 24); }
	}
	}
	if( Attr1_Min >= -4.53 ) { 
	if( Attr6_Min < -0.36 ) { 
		if( Attr4_Max >= 1.56 ) { return new Prediction("smoking", 2, 0); }
		if( Attr4_Max < 1.56 ) { return new Prediction("NULL", 1, 0); }
	}
		if( Attr6_Min >= -0.36 ) { return new Prediction("smoking", 7, 0); }
	}
	}
	}
	}
	if( Attr2_Max >= -3.73 ) { 
	if( Attr2_Min < -6.88 ) { 
	if( Attr2_Min >= -15.9 ) { 
	if( Attr6_Min >= -2.11 ) { 
	if( Attr3_Min >= 3.9 ) { 
		if( Attr3_Min >= 6.77 ) { return new Prediction("NULL", 53, 0); }
		if( Attr3_Min < 6.77 ) { return new Prediction("NULL", 182, 23); }
	}
	if( Attr3_Min < 3.9 ) { 
		if( Attr1_Min < 0.69 ) { return new Prediction("NULL", 1736, 516); }
		if( Attr1_Min >= 0.69 ) { return new Prediction("NULL", 574, 86); }
	}
	}
	if( Attr6_Min < -2.11 ) { 
	if( Attr7_Max >= 19.01 ) { 
		if( Attr4_Max < 3.83 ) { return new Prediction("smoking", 1573, 293); }
		if( Attr4_Max >= 3.83 ) { return new Prediction("NULL", 1290, 637); }
	}
	if( Attr7_Max < 19.01 ) { 
		if( Attr1_Min < -7.57 ) { return new Prediction("smoking", 441, 148); }
		if( Attr1_Min >= -7.57 ) { return new Prediction("NULL", 829, 213); }
	}
	}
	}
	if( Attr2_Min < -15.9 ) { 
	if( Attr3_Max >= 16.22 ) { 
	if( Attr2_Mean >= -3.82 ) { 
		if( Attr1_Min < -19.57 ) { return new Prediction("NULL", 72, 0); }
		if( Attr1_Min >= -19.57 ) { return new Prediction("NULL", 144, 19); }
	}
	if( Attr2_Mean < -3.82 ) { 
		if( Attr8_Max >= 16.73 ) { return new Prediction("NULL", 451, 104); }
		if( Attr8_Max < 16.73 ) { return new Prediction("smoking", 59, 29); }
	}
	}
	if( Attr3_Max < 16.22 ) { 
	if( Attr6_Min >= -4 ) { 
		if( Attr9_Min >= -12.11 ) { return new Prediction("NULL", 209, 18); }
		if( Attr9_Min < -12.11 ) { return new Prediction("NULL", 1124, 289); }
	}
	if( Attr6_Min < -4 ) { 
		if( Attr4_Min < -5.2 ) { return new Prediction("NULL", 577, 232); }
		if( Attr4_Min >= -5.2 ) { return new Prediction("smoking", 358, 121); }
	}
	}
	}
	}
	if( Attr2_Min >= -6.88 ) { 
	if( Attr4_Min < -0.14 ) { 
	if( Attr4_Min < -1.59 ) { 
		if( Attr3_Min >= 6.93 ) { return new Prediction("NULL", 41, 0); }
	if( Attr3_Min < 6.93 ) { 
		if( Attr8_Max >= 32.3 ) { return new Prediction("NULL", 153, 71); }
		if( Attr8_Max < 32.3 ) { return new Prediction("NULL", 368, 67); }
	}
	}
	if( Attr4_Min >= -1.59 ) { 
	if( Attr5_Max < 1.7 ) { 
		if( Attr3_Max < 5.39 ) { return new Prediction("NULL", 334, 60); }
		if( Attr3_Max >= 5.39 ) { return new Prediction("NULL", 442, 19); }
	}
	if( Attr5_Max >= 1.7 ) { 
		if( Attr2_Max < 7.16 ) { return new Prediction("smoking", 15, 4); }
		if( Attr2_Max >= 7.16 ) { return new Prediction("NULL", 6, 0); }
	}
	}
	}
	if( Attr4_Min >= -0.14 ) { 
	if( Attr4_Max < 0 ) { 
		if( Attr3_Mean >= 2.4 ) { return new Prediction("NULL", 122, 0); }
	if( Attr3_Mean < 2.4 ) { 
		if( Attr9_Mean < -22.63 ) { return new Prediction("smoking", 10, 0); }
		if( Attr9_Mean >= -22.63 ) { return new Prediction("NULL", 33, 9); }
	}
	}
	if( Attr4_Max >= 0 ) { 
	if( Attr4_Min < -0.03 ) { 
		if( Attr8_Min < -11.19 ) { return new Prediction("NULL", 90, 0); }
		if( Attr8_Min >= -11.19 ) { return new Prediction("NULL", 166, 11); }
	}
	if( Attr4_Min >= -0.03 ) { 
		if( Attr7_Min < -45.91 ) { return new Prediction("NULL", 144, 3); }
		if( Attr7_Min >= -45.91 ) { return new Prediction("NULL", 1187, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree10() {
	if( Attr5_Min >= -0.74 ) { 
	if( Attr3_Min >= 7.54 ) { 
	if( Attr4_Max >= 0.05 ) { 
	if( Attr1_Max >= 0.29 ) { 
		if( Attr3_Mean >= 8.94 ) { return new Prediction("NULL", 102, 0); }
	if( Attr3_Mean < 8.94 ) { 
		if( Attr4_Mean >= -0 ) { return new Prediction("NULL", 31, 0); }
		if( Attr4_Mean < -0 ) { return new Prediction("NULL", 52, 10); }
	}
	}
		if( Attr1_Max < 0.29 ) { return new Prediction("NULL", 205, 0); }
	}
		if( Attr4_Max < 0.05 ) { return new Prediction("NULL", 1194, 0); }
	}
	if( Attr3_Min < 7.54 ) { 
	if( Attr4_Max < 0.95 ) { 
	if( Attr5_Mean >= 0 ) { 
	if( Attr8_Mean < -3.71 ) { 
		if( Attr3_Mean < -8.85 ) { return new Prediction("smoking", 1, 0); }
		if( Attr3_Mean >= -8.85 ) { return new Prediction("NULL", 221, 3); }
	}
	if( Attr8_Mean >= -3.71 ) { 
		if( Attr8_Min < -0.27 ) { return new Prediction("NULL", 242, 80); }
		if( Attr8_Min >= -0.27 ) { return new Prediction("NULL", 789, 134); }
	}
	}
	if( Attr5_Mean < 0 ) { 
	if( Attr9_Mean < 6.25 ) { 
		if( Attr3_Min >= -4.35 ) { return new Prediction("NULL", 1211, 104); }
		if( Attr3_Min < -4.35 ) { return new Prediction("NULL", 87, 0); }
	}
	if( Attr9_Mean >= 6.25 ) { 
		if( Attr2_Max < -9.46 ) { return new Prediction("smoking", 6, 3); }
		if( Attr2_Max >= -9.46 ) { return new Prediction("NULL", 685, 14); }
	}
	}
	}
	if( Attr4_Max >= 0.95 ) { 
	if( Attr6_Max >= 1.74 ) { 
	if( Attr1_Min < -7.33 ) { 
		if( Attr2_Max < -3.43 ) { return new Prediction("NULL", 7, 0); }
		if( Attr2_Max >= -3.43 ) { return new Prediction("smoking", 79, 16); }
	}
	if( Attr1_Min >= -7.33 ) { 
		if( Attr3_Min < 0.56 ) { return new Prediction("NULL", 72, 19); }
		if( Attr3_Min >= 0.56 ) { return new Prediction("smoking", 32, 12); }
	}
	}
	if( Attr6_Max < 1.74 ) { 
		if( Attr5_Min < -0.72 ) { return new Prediction("NULL", 37, 0); }
	if( Attr5_Min >= -0.72 ) { 
		if( Attr1_Min < -4.5 ) { return new Prediction("NULL", 258, 59); }
		if( Attr1_Min >= -4.5 ) { return new Prediction("NULL", 634, 70); }
	}
	}
	}
	}
	}
	if( Attr5_Min < -0.74 ) { 
	if( Attr3_Max >= 11.98 ) { 
	if( Attr1_Min >= -19 ) { 
	if( Attr2_Min < -19.79 ) { 
	if( Attr7_Max < 27.25 ) { 
		if( Attr8_Max < 45.63 ) { return new Prediction("NULL", 78, 1); }
		if( Attr8_Max >= 45.63 ) { return new Prediction("NULL", 19, 3); }
	}
	if( Attr7_Max >= 27.25 ) { 
		if( Attr4_Min >= -6.19 ) { return new Prediction("NULL", 28, 0); }
		if( Attr4_Min < -6.19 ) { return new Prediction("NULL", 133, 40); }
	}
	}
	if( Attr2_Min >= -19.79 ) { 
	if( Attr5_Min >= -8.75 ) { 
		if( Attr7_Min < 21.97 ) { return new Prediction("NULL", 1987, 626); }
		if( Attr7_Min >= 21.97 ) { return new Prediction("NULL", 86, 11); }
	}
		if( Attr5_Min < -8.75 ) { return new Prediction("NULL", 60, 0); }
	}
	}
	if( Attr1_Min < -19 ) { 
		if( Attr6_Mean >= 1.01 ) { return new Prediction("smoking", 3, 0); }
	if( Attr6_Mean < 1.01 ) { 
		if( Attr5_Max < 1.87 ) { return new Prediction("NULL", 57, 0); }
	if( Attr5_Max >= 1.87 ) { 
		if( Attr2_Min >= -19.59 ) { return new Prediction("NULL", 218, 48); }
		if( Attr2_Min < -19.59 ) { return new Prediction("NULL", 121, 7); }
	}
	}
	}
	}
	if( Attr3_Max < 11.98 ) { 
	if( Attr4_Min < -2.02 ) { 
	if( Attr6_Min >= -2.35 ) { 
	if( Attr7_Max < 4.5 ) { 
		if( Attr8_Min < -11.12 ) { return new Prediction("NULL", 162, 13); }
		if( Attr8_Min >= -11.12 ) { return new Prediction("NULL", 475, 112); }
	}
	if( Attr7_Max >= 4.5 ) { 
		if( Attr3_Min < -1.08 ) { return new Prediction("NULL", 1002, 278); }
		if( Attr3_Min >= -1.08 ) { return new Prediction("smoking", 299, 131); }
	}
	}
	if( Attr6_Min < -2.35 ) { 
	if( Attr4_Max >= 4.79 ) { 
		if( Attr5_Min >= -2.13 ) { return new Prediction("smoking", 432, 197); }
		if( Attr5_Min < -2.13 ) { return new Prediction("NULL", 901, 352); }
	}
	if( Attr4_Max < 4.79 ) { 
		if( Attr1_Min >= -6.98 ) { return new Prediction("NULL", 519, 172); }
		if( Attr1_Min < -6.98 ) { return new Prediction("smoking", 1977, 383); }
	}
	}
	}
	if( Attr4_Min >= -2.02 ) { 
	if( Attr1_Min >= -7.61 ) { 
	if( Attr6_Max < 2.21 ) { 
		if( Attr3_Min < -5.7 ) { return new Prediction("NULL", 209, 8); }
		if( Attr3_Min >= -5.7 ) { return new Prediction("NULL", 566, 103); }
	}
	if( Attr6_Max >= 2.21 ) { 
		if( Attr4_Min >= -1.67 ) { return new Prediction("smoking", 86, 33); }
		if( Attr4_Min < -1.67 ) { return new Prediction("NULL", 57, 13); }
	}
	}
	if( Attr1_Min < -7.61 ) { 
	if( Attr6_Min >= -2.21 ) { 
		if( Attr4_Min >= -0.79 ) { return new Prediction("NULL", 29, 13); }
		if( Attr4_Min < -0.79 ) { return new Prediction("NULL", 194, 32); }
	}
	if( Attr6_Min < -2.21 ) { 
		if( Attr3_Max < 8.95 ) { return new Prediction("smoking", 202, 16); }
		if( Attr3_Max >= 8.95 ) { return new Prediction("smoking", 33, 13); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree11() {
	if( Attr6_Min < -2.09 ) { 
	if( Attr1_Min < -7.33 ) { 
	if( Attr2_Max < 3.56 ) { 
	if( Attr4_Max >= 3.53 ) { 
	if( Attr2_Mean < -5.64 ) { 
		if( Attr1_Min >= -9.54 ) { return new Prediction("smoking", 164, 73); }
		if( Attr1_Min < -9.54 ) { return new Prediction("NULL", 216, 43); }
	}
	if( Attr2_Mean >= -5.64 ) { 
		if( Attr1_Mean < -8.33 ) { return new Prediction("NULL", 52, 14); }
		if( Attr1_Mean >= -8.33 ) { return new Prediction("smoking", 545, 154); }
	}
	}
	if( Attr4_Max < 3.53 ) { 
	if( Attr1_Max < -3.95 ) { 
		if( Attr8_Max < 45.13 ) { return new Prediction("NULL", 31, 2); }
		if( Attr8_Max >= 45.13 ) { return new Prediction("smoking", 2, 0); }
	}
	if( Attr1_Max >= -3.95 ) { 
		if( Attr2_Min < -15.79 ) { return new Prediction("smoking", 190, 66); }
		if( Attr2_Min >= -15.79 ) { return new Prediction("smoking", 1271, 139); }
	}
	}
	}
	if( Attr2_Max >= 3.56 ) { 
	if( Attr4_Max < 5.42 ) { 
	if( Attr3_Max < 11.53 ) { 
		if( Attr2_Mean < -5.46 ) { return new Prediction("NULL", 109, 48); }
		if( Attr2_Mean >= -5.46 ) { return new Prediction("smoking", 368, 84); }
	}
	if( Attr3_Max >= 11.53 ) { 
		if( Attr6_Min < -2.66 ) { return new Prediction("NULL", 364, 174); }
		if( Attr6_Min >= -2.66 ) { return new Prediction("NULL", 100, 22); }
	}
	}
	if( Attr4_Max >= 5.42 ) { 
	if( Attr5_Min < -3.26 ) { 
		if( Attr1_Max < 10.98 ) { return new Prediction("NULL", 323, 50); }
		if( Attr1_Max >= 10.98 ) { return new Prediction("NULL", 527, 168); }
	}
	if( Attr5_Min >= -3.26 ) { 
		if( Attr2_Mean < -0.98 ) { return new Prediction("NULL", 455, 174); }
		if( Attr2_Mean >= -0.98 ) { return new Prediction("smoking", 57, 11); }
	}
	}
	}
	}
	if( Attr1_Min >= -7.33 ) { 
	if( Attr5_Mean >= -0.18 ) { 
	if( Attr4_Max >= 3.32 ) { 
	if( Attr3_Mean < 8.22 ) { 
		if( Attr4_Mean >= 0.04 ) { return new Prediction("NULL", 294, 43); }
		if( Attr4_Mean < 0.04 ) { return new Prediction("NULL", 1007, 251); }
	}
		if( Attr3_Mean >= 8.22 ) { return new Prediction("NULL", 34, 0); }
	}
	if( Attr4_Max < 3.32 ) { 
	if( Attr5_Min >= -0.74 ) { 
		if( Attr3_Min < -2.39 ) { return new Prediction("NULL", 22, 6); }
		if( Attr3_Min >= -2.39 ) { return new Prediction("NULL", 32, 0); }
	}
	if( Attr5_Min < -0.74 ) { 
		if( Attr2_Min < -9.01 ) { return new Prediction("NULL", 426, 160); }
		if( Attr2_Min >= -9.01 ) { return new Prediction("smoking", 99, 33); }
	}
	}
	}
	if( Attr5_Mean < -0.18 ) { 
	if( Attr1_Max >= 14.62 ) { 
		if( Attr3_Mean < -1.02 ) { return new Prediction("smoking", 2, 0); }
	if( Attr3_Mean >= -1.02 ) { 
		if( Attr1_Mean < 3.74 ) { return new Prediction("smoking", 1, 0); }
		if( Attr1_Mean >= 3.74 ) { return new Prediction("NULL", 18, 0); }
	}
	}
		if( Attr1_Max < 14.62 ) { return new Prediction("NULL", 49, 0); }
	}
	}
	}
	if( Attr6_Min >= -2.09 ) { 
	if( Attr4_Min >= -1.32 ) { 
	if( Attr5_Max < 1.07 ) { 
	if( Attr1_Mean < 1.69 ) { 
	if( Attr2_Min >= -5.92 ) { 
		if( Attr3_Mean < 3.68 ) { return new Prediction("NULL", 300, 17); }
		if( Attr3_Mean >= 3.68 ) { return new Prediction("NULL", 1591, 3); }
	}
	if( Attr2_Min < -5.92 ) { 
		if( Attr3_Mean < -3.53 ) { return new Prediction("NULL", 275, 4); }
		if( Attr3_Mean >= -3.53 ) { return new Prediction("NULL", 1180, 110); }
	}
	}
	if( Attr1_Mean >= 1.69 ) { 
	if( Attr8_Max >= 6.93 ) { 
		if( Attr3_Mean < -2.47 ) { return new Prediction("NULL", 458, 25); }
		if( Attr3_Mean >= -2.47 ) { return new Prediction("NULL", 1052, 180); }
	}
	if( Attr8_Max < 6.93 ) { 
		if( Attr4_Max < 0 ) { return new Prediction("NULL", 45, 8); }
		if( Attr4_Max >= 0 ) { return new Prediction("NULL", 514, 11); }
	}
	}
	}
	if( Attr5_Max >= 1.07 ) { 
	if( Attr6_Mean < -0 ) { 
	if( Attr5_Min >= -0.64 ) { 
		if( Attr2_Min < -10.73 ) { return new Prediction("smoking", 4, 1); }
		if( Attr2_Min >= -10.73 ) { return new Prediction("NULL", 12, 0); }
	}
		if( Attr5_Min < -0.64 ) { return new Prediction("NULL", 60, 0); }
	}
	if( Attr6_Mean >= -0 ) { 
	if( Attr1_Max >= 8.42 ) { 
		if( Attr3_Max < 1.05 ) { return new Prediction("NULL", 7, 0); }
		if( Attr3_Max >= 1.05 ) { return new Prediction("smoking", 48, 14); }
	}
	if( Attr1_Max < 8.42 ) { 
		if( Attr2_Max < -3.84 ) { return new Prediction("NULL", 35, 1); }
		if( Attr2_Max >= -3.84 ) { return new Prediction("NULL", 49, 19); }
	}
	}
	}
	}
	if( Attr4_Min < -1.32 ) { 
	if( Attr8_Min < 16.06 ) { 
	if( Attr6_Mean >= -0.1 ) { 
	if( Attr1_Mean >= 6.46 ) { 
		if( Attr1_Min < -2.72 ) { return new Prediction("smoking", 47, 22); }
		if( Attr1_Min >= -2.72 ) { return new Prediction("NULL", 520, 70); }
	}
	if( Attr1_Mean < 6.46 ) { 
		if( Attr3_Max >= 15.6 ) { return new Prediction("NULL", 161, 16); }
		if( Attr3_Max < 15.6 ) { return new Prediction("NULL", 2004, 591); }
	}
	}
	if( Attr6_Mean < -0.1 ) { 
		if( Attr6_Max < 1.7 ) { return new Prediction("NULL", 96, 0); }
	if( Attr6_Max >= 1.7 ) { 
		if( Attr1_Max < 3.37 ) { return new Prediction("smoking", 2, 1); }
		if( Attr1_Max >= 3.37 ) { return new Prediction("NULL", 10, 0); }
	}
	}
	}
	if( Attr8_Min >= 16.06 ) { 
	if( Attr2_Mean < -5 ) { 
	if( Attr2_Mean < -8.75 ) { 
		if( Attr5_Mean < -0.02 ) { return new Prediction("NULL", 7, 1); }
		if( Attr5_Mean >= -0.02 ) { return new Prediction("NULL", 78, 0); }
	}
	if( Attr2_Mean >= -8.75 ) { 
		if( Attr4_Max >= 4.6 ) { return new Prediction("NULL", 50, 0); }
		if( Attr4_Max < 4.6 ) { return new Prediction("NULL", 373, 50); }
	}
	}
	if( Attr2_Mean >= -5 ) { 
	if( Attr9_Max < 42.25 ) { 
		if( Attr9_Max >= -10.77 ) { return new Prediction("NULL", 99, 13); }
		if( Attr9_Max < -10.77 ) { return new Prediction("NULL", 34, 16); }
	}
		if( Attr9_Max >= 42.25 ) { return new Prediction("smoking", 9, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree12() {
	if( Attr6_Max < 1.24 ) { 
	if( Attr3_Mean >= 8.26 ) { 
		if( Attr3_Mean >= 9.39 ) { return new Prediction("NULL", 1129, 0); }
	if( Attr3_Mean < 9.39 ) { 
	if( Attr6_Min < -0.55 ) { 
	if( Attr6_Max >= 0.47 ) { 
		if( Attr8_Min >= -10.51 ) { return new Prediction("smoking", 26, 13); }
		if( Attr8_Min < -10.51 ) { return new Prediction("NULL", 30, 1); }
	}
		if( Attr6_Max < 0.47 ) { return new Prediction("NULL", 45, 0); }
	}
	if( Attr6_Min >= -0.55 ) { 
		if( Attr9_Min < -36.94 ) { return new Prediction("NULL", 251, 0); }
	if( Attr9_Min >= -36.94 ) { 
		if( Attr8_Min >= 8.61 ) { return new Prediction("NULL", 85, 7); }
		if( Attr8_Min < 8.61 ) { return new Prediction("NULL", 121, 0); }
	}
	}
	}
	}
	if( Attr3_Mean < 8.26 ) { 
	if( Attr5_Max >= 0.5 ) { 
	if( Attr6_Mean >= -0.03 ) { 
	if( Attr1_Mean >= -4.99 ) { 
		if( Attr2_Max >= -6.09 ) { return new Prediction("NULL", 1068, 171); }
		if( Attr2_Max < -6.09 ) { return new Prediction("NULL", 159, 4); }
	}
	if( Attr1_Mean < -4.99 ) { 
		if( Attr9_Min < -35.47 ) { return new Prediction("smoking", 95, 33); }
		if( Attr9_Min >= -35.47 ) { return new Prediction("NULL", 234, 41); }
	}
	}
	if( Attr6_Mean < -0.03 ) { 
	if( Attr5_Mean >= -0.11 ) { 
		if( Attr9_Min < -41.9 ) { return new Prediction("smoking", 78, 31); }
		if( Attr9_Min >= -41.9 ) { return new Prediction("NULL", 320, 106); }
	}
	if( Attr5_Mean < -0.11 ) { 
		if( Attr2_Mean < -9.17 ) { return new Prediction("smoking", 2, 0); }
		if( Attr2_Mean >= -9.17 ) { return new Prediction("NULL", 55, 0); }
	}
	}
	}
	if( Attr5_Max < 0.5 ) { 
	if( Attr4_Min >= 0 ) { 
		if( Attr3_Max >= 10.28 ) { return new Prediction("smoking", 1, 0); }
		if( Attr3_Max < 10.28 ) { return new Prediction("NULL", 232, 0); }
	}
	if( Attr4_Min < 0 ) { 
	if( Attr5_Min < 0 ) { 
		if( Attr6_Max >= 0.11 ) { return new Prediction("NULL", 1506, 188); }
		if( Attr6_Max < 0.11 ) { return new Prediction("NULL", 1595, 79); }
	}
	if( Attr5_Min >= 0 ) { 
		if( Attr5_Max >= 0.01 ) { return new Prediction("NULL", 104, 13); }
		if( Attr5_Max < 0.01 ) { return new Prediction("NULL", 110, 50); }
	}
	}
	}
	}
	}
	if( Attr6_Max >= 1.24 ) { 
	if( Attr4_Min < -5.32 ) { 
	if( Attr1_Min < -4.62 ) { 
	if( Attr1_Max < 20.33 ) { 
	if( Attr4_Max >= 5.31 ) { 
		if( Attr2_Mean < -5.71 ) { return new Prediction("NULL", 538, 120); }
		if( Attr2_Mean >= -5.71 ) { return new Prediction("NULL", 988, 326); }
	}
	if( Attr4_Max < 5.31 ) { 
		if( Attr4_Min < -11.38 ) { return new Prediction("NULL", 19, 0); }
		if( Attr4_Min >= -11.38 ) { return new Prediction("NULL", 692, 342); }
	}
	}
	if( Attr1_Max >= 20.33 ) { 
		if( Attr3_Min < -8.55 ) { return new Prediction("NULL", 56, 0); }
	if( Attr3_Min >= -8.55 ) { 
		if( Attr9_Max < 28.62 ) { return new Prediction("NULL", 6, 0); }
		if( Attr9_Max >= 28.62 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	}
	if( Attr1_Min >= -4.62 ) { 
	if( Attr1_Mean < 9.79 ) { 
	if( Attr5_Min >= -4.5 ) { 
		if( Attr5_Mean < 0.05 ) { return new Prediction("NULL", 425, 63); }
		if( Attr5_Mean >= 0.05 ) { return new Prediction("NULL", 65, 0); }
	}
	if( Attr5_Min < -4.5 ) { 
		if( Attr3_Min >= -12.69 ) { return new Prediction("smoking", 28, 13); }
		if( Attr3_Min < -12.69 ) { return new Prediction("NULL", 16, 1); }
	}
	}
		if( Attr1_Mean >= 9.79 ) { return new Prediction("smoking", 4, 0); }
	}
	}
	if( Attr4_Min >= -5.32 ) { 
	if( Attr3_Mean < 7.19 ) { 
	if( Attr1_Min < -7.27 ) { 
	if( Attr7_Min < -37.03 ) { 
		if( Attr2_Max >= 4.4 ) { return new Prediction("smoking", 306, 114); }
		if( Attr2_Max < 4.4 ) { return new Prediction("smoking", 1071, 125); }
	}
	if( Attr7_Min >= -37.03 ) { 
		if( Attr1_Mean >= -7.39 ) { return new Prediction("smoking", 1715, 638); }
		if( Attr1_Mean < -7.39 ) { return new Prediction("NULL", 301, 97); }
	}
	}
	if( Attr1_Min >= -7.27 ) { 
	if( Attr3_Min < -6.88 ) { 
		if( Attr1_Mean < 3.85 ) { return new Prediction("NULL", 257, 86); }
		if( Attr1_Mean >= 3.85 ) { return new Prediction("NULL", 343, 41); }
	}
	if( Attr3_Min >= -6.88 ) { 
		if( Attr6_Mean >= -0.11 ) { return new Prediction("NULL", 1294, 476); }
		if( Attr6_Mean < -0.11 ) { return new Prediction("NULL", 39, 0); }
	}
	}
	}
	if( Attr3_Mean >= 7.19 ) { 
	if( Attr8_Max >= -12.08 ) { 
	if( Attr6_Min >= -1.91 ) { 
		if( Attr3_Min < 6.78 ) { return new Prediction("NULL", 171, 21); }
		if( Attr3_Min >= 6.78 ) { return new Prediction("NULL", 62, 1); }
	}
	if( Attr6_Min < -1.91 ) { 
		if( Attr5_Min >= -2.8 ) { return new Prediction("NULL", 144, 48); }
		if( Attr5_Min < -2.8 ) { return new Prediction("NULL", 47, 3); }
	}
	}
	if( Attr8_Max < -12.08 ) { 
	if( Attr5_Max >= 1.02 ) { 
		if( Attr9_Mean >= -30.91 ) { return new Prediction("NULL", 4, 0); }
		if( Attr9_Mean < -30.91 ) { return new Prediction("smoking", 32, 2); }
	}
		if( Attr5_Max < 1.02 ) { return new Prediction("NULL", 8, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree13() {
	if( Attr7_Max < 22.71 ) { 
	if( Attr6_Max < 1.12 ) { 
		if( Attr3_Min >= 8.46 ) { return new Prediction("NULL", 658, 0); }
	if( Attr3_Min < 8.46 ) { 
	if( Attr4_Min < -1.81 ) { 
	if( Attr3_Min >= -3.38 ) { 
		if( Attr9_Max >= 25.17 ) { return new Prediction("smoking", 37, 14); }
		if( Attr9_Max < 25.17 ) { return new Prediction("NULL", 359, 84); }
	}
	if( Attr3_Min < -3.38 ) { 
		if( Attr2_Min < -7.4 ) { return new Prediction("NULL", 295, 43); }
		if( Attr2_Min >= -7.4 ) { return new Prediction("NULL", 71, 0); }
	}
	}
	if( Attr4_Min >= -1.81 ) { 
	if( Attr8_Min < -10.43 ) { 
		if( Attr1_Max >= 2.89 ) { return new Prediction("NULL", 398, 17); }
		if( Attr1_Max < 2.89 ) { return new Prediction("NULL", 236, 0); }
	}
	if( Attr8_Min >= -10.43 ) { 
		if( Attr3_Mean >= -1.31 ) { return new Prediction("NULL", 1673, 206); }
		if( Attr3_Mean < -1.31 ) { return new Prediction("NULL", 873, 43); }
	}
	}
	}
	}
	if( Attr6_Max >= 1.12 ) { 
	if( Attr7_Min >= 7.14 ) { 
	if( Attr3_Mean < 8.1 ) { 
	if( Attr9_Max < 55.95 ) { 
		if( Attr8_Mean < -15.03 ) { return new Prediction("smoking", 33, 3); }
		if( Attr8_Mean >= -15.03 ) { return new Prediction("smoking", 101, 49); }
	}
		if( Attr9_Max >= 55.95 ) { return new Prediction("smoking", 15, 0); }
	}
	if( Attr3_Mean >= 8.1 ) { 
		if( Attr8_Mean < -18.9 ) { return new Prediction("smoking", 1, 0); }
		if( Attr8_Mean >= -18.9 ) { return new Prediction("NULL", 11, 0); }
	}
	}
	if( Attr7_Min < 7.14 ) { 
	if( Attr1_Mean >= -3.49 ) { 
	if( Attr6_Max < 2.62 ) { 
		if( Attr4_Mean < 0.08 ) { return new Prediction("NULL", 1525, 378); }
		if( Attr4_Mean >= 0.08 ) { return new Prediction("NULL", 96, 10); }
	}
	if( Attr6_Max >= 2.62 ) { 
		if( Attr4_Mean < -0.12 ) { return new Prediction("NULL", 93, 11); }
		if( Attr4_Mean >= -0.12 ) { return new Prediction("NULL", 1405, 551); }
	}
	}
	if( Attr1_Mean < -3.49 ) { 
	if( Attr3_Min < -6.35 ) { 
		if( Attr8_Mean < -18.41 ) { return new Prediction("NULL", 15, 0); }
		if( Attr8_Mean >= -18.41 ) { return new Prediction("NULL", 93, 43); }
	}
	if( Attr3_Min >= -6.35 ) { 
		if( Attr1_Mean >= -8.47 ) { return new Prediction("smoking", 148, 35); }
		if( Attr1_Mean < -8.47 ) { return new Prediction("NULL", 23, 4); }
	}
	}
	}
	}
	}
	if( Attr7_Max >= 22.71 ) { 
	if( Attr5_Min < -0.56 ) { 
	if( Attr2_Max < 8.03 ) { 
	if( Attr6_Max >= 2.04 ) { 
	if( Attr6_Min >= -2.71 ) { 
		if( Attr4_Max < 3.42 ) { return new Prediction("smoking", 408, 180); }
		if( Attr4_Max >= 3.42 ) { return new Prediction("NULL", 501, 134); }
	}
	if( Attr6_Min < -2.71 ) { 
		if( Attr3_Max >= 10.18 ) { return new Prediction("NULL", 888, 410); }
		if( Attr3_Max < 10.18 ) { return new Prediction("smoking", 1547, 291); }
	}
	}
	if( Attr6_Max < 2.04 ) { 
	if( Attr1_Min >= -7.28 ) { 
		if( Attr7_Mean >= 14.06 ) { return new Prediction("NULL", 292, 27); }
		if( Attr7_Mean < 14.06 ) { return new Prediction("NULL", 302, 61); }
	}
	if( Attr1_Min < -7.28 ) { 
		if( Attr6_Min >= -2.35 ) { return new Prediction("NULL", 569, 141); }
		if( Attr6_Min < -2.35 ) { return new Prediction("smoking", 376, 123); }
	}
	}
	}
	if( Attr2_Max >= 8.03 ) { 
	if( Attr3_Max < 11.86 ) { 
	if( Attr1_Min >= -6.65 ) { 
		if( Attr3_Mean < -2.7 ) { return new Prediction("NULL", 7, 3); }
		if( Attr3_Mean >= -2.7 ) { return new Prediction("NULL", 42, 1); }
	}
	if( Attr1_Min < -6.65 ) { 
		if( Attr1_Min >= -13.75 ) { return new Prediction("smoking", 151, 63); }
		if( Attr1_Min < -13.75 ) { return new Prediction("NULL", 113, 31); }
	}
	}
	if( Attr3_Max >= 11.86 ) { 
	if( Attr8_Mean < 4.51 ) { 
		if( Attr7_Max >= 33.27 ) { return new Prediction("NULL", 129, 29); }
		if( Attr7_Max < 33.27 ) { return new Prediction("NULL", 82, 40); }
	}
	if( Attr8_Mean >= 4.51 ) { 
		if( Attr5_Min >= -8.08 ) { return new Prediction("NULL", 526, 96); }
		if( Attr5_Min < -8.08 ) { return new Prediction("NULL", 61, 1); }
	}
	}
	}
	}
	if( Attr5_Min >= -0.56 ) { 
	if( Attr1_Max >= 7.94 ) { 
	if( Attr5_Max < 0.62 ) { 
		if( Attr3_Min < -5.6 ) { return new Prediction("NULL", 21, 0); }
	if( Attr3_Min >= -5.6 ) { 
		if( Attr4_Max >= 0.75 ) { return new Prediction("NULL", 19, 0); }
		if( Attr4_Max < 0.75 ) { return new Prediction("smoking", 73, 26); }
	}
	}
	if( Attr5_Max >= 0.62 ) { 
		if( Attr8_Min < -34.02 ) { return new Prediction("NULL", 2, 0); }
	if( Attr8_Min >= -34.02 ) { 
		if( Attr3_Max >= 10.48 ) { return new Prediction("NULL", 1, 0); }
		if( Attr3_Max < 10.48 ) { return new Prediction("smoking", 30, 0); }
	}
	}
	}
	if( Attr1_Max < 7.94 ) { 
	if( Attr3_Mean < 8.06 ) { 
	if( Attr2_Min >= -11.05 ) { 
		if( Attr2_Min >= -0.29 ) { return new Prediction("NULL", 128, 0); }
		if( Attr2_Min < -0.29 ) { return new Prediction("NULL", 652, 60); }
	}
	if( Attr2_Min < -11.05 ) { 
		if( Attr9_Max < 0.62 ) { return new Prediction("NULL", 16, 1); }
		if( Attr9_Max >= 0.62 ) { return new Prediction("smoking", 62, 29); }
	}
	}
	if( Attr3_Mean >= 8.06 ) { 
	if( Attr6_Max >= 0.63 ) { 
		if( Attr7_Max < 50.08 ) { return new Prediction("NULL", 18, 0); }
		if( Attr7_Max >= 50.08 ) { return new Prediction("smoking", 2, 0); }
	}
		if( Attr6_Max < 0.63 ) { return new Prediction("NULL", 701, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree14() {
	if( Attr5_Min >= -0.58 ) { 
	if( Attr3_Mean >= 8.05 ) { 
	if( Attr1_Min >= 1.72 ) { 
		if( Attr6_Min < -0.45 ) { return new Prediction("smoking", 3, 0); }
	if( Attr6_Min >= -0.45 ) { 
	if( Attr1_Max >= 2.05 ) { 
		if( Attr6_Max < 0.01 ) { return new Prediction("NULL", 9, 1); }
		if( Attr6_Max >= 0.01 ) { return new Prediction("NULL", 54, 0); }
	}
		if( Attr1_Max < 2.05 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	if( Attr1_Min < 1.72 ) { 
	if( Attr1_Max >= 0.29 ) { 
	if( Attr1_Mean < -0.18 ) { 
		if( Attr5_Min < -0.05 ) { return new Prediction("NULL", 81, 2); }
		if( Attr5_Min >= -0.05 ) { return new Prediction("NULL", 5, 2); }
	}
		if( Attr1_Mean >= -0.18 ) { return new Prediction("NULL", 449, 0); }
	}
		if( Attr1_Max < 0.29 ) { return new Prediction("NULL", 1095, 0); }
	}
	}
	if( Attr3_Mean < 8.05 ) { 
	if( Attr6_Max < 1.71 ) { 
	if( Attr2_Min < -1.74 ) { 
	if( Attr1_Max < 8.94 ) { 
		if( Attr7_Min < -80.54 ) { return new Prediction("smoking", 36, 16); }
		if( Attr7_Min >= -80.54 ) { return new Prediction("NULL", 2773, 251); }
	}
	if( Attr1_Max >= 8.94 ) { 
		if( Attr4_Min < -0.01 ) { return new Prediction("NULL", 322, 66); }
		if( Attr4_Min >= -0.01 ) { return new Prediction("smoking", 35, 6); }
	}
	}
	if( Attr2_Min >= -1.74 ) { 
	if( Attr6_Min < -0.01 ) { 
		if( Attr1_Min < -9.25 ) { return new Prediction("NULL", 17, 3); }
		if( Attr1_Min >= -9.25 ) { return new Prediction("NULL", 320, 6); }
	}
		if( Attr6_Min >= -0.01 ) { return new Prediction("NULL", 175, 0); }
	}
	}
	if( Attr6_Max >= 1.71 ) { 
	if( Attr1_Min >= -6 ) { 
		if( Attr2_Max < -7.1 ) { return new Prediction("smoking", 3, 0); }
	if( Attr2_Max >= -7.1 ) { 
		if( Attr8_Min >= -23.59 ) { return new Prediction("NULL", 52, 4); }
		if( Attr8_Min < -23.59 ) { return new Prediction("smoking", 11, 5); }
	}
	}
	if( Attr1_Min < -6 ) { 
	if( Attr1_Min >= -13.67 ) { 
		if( Attr8_Max < 37.14 ) { return new Prediction("smoking", 12, 4); }
		if( Attr8_Max >= 37.14 ) { return new Prediction("smoking", 28, 0); }
	}
		if( Attr1_Min < -13.67 ) { return new Prediction("NULL", 4, 0); }
	}
	}
	}
	}
	if( Attr5_Min < -0.58 ) { 
	if( Attr7_Max < 23.21 ) { 
	if( Attr1_Min >= -7.28 ) { 
	if( Attr6_Max >= 1.17 ) { 
	if( Attr2_Max < 0.38 ) { 
		if( Attr9_Mean >= -0.51 ) { return new Prediction("NULL", 290, 71); }
		if( Attr9_Mean < -0.51 ) { return new Prediction("NULL", 467, 178); }
	}
	if( Attr2_Max >= 0.38 ) { 
		if( Attr1_Mean >= 4.66 ) { return new Prediction("NULL", 823, 118); }
		if( Attr1_Mean < 4.66 ) { return new Prediction("NULL", 681, 199); }
	}
	}
	if( Attr6_Max < 1.17 ) { 
	if( Attr6_Mean >= -0.1 ) { 
		if( Attr8_Mean < 5.53 ) { return new Prediction("NULL", 195, 12); }
		if( Attr8_Mean >= 5.53 ) { return new Prediction("NULL", 684, 116); }
	}
		if( Attr6_Mean < -0.1 ) { return new Prediction("NULL", 118, 0); }
	}
	}
	if( Attr1_Min < -7.28 ) { 
	if( Attr3_Min < -7.55 ) { 
	if( Attr8_Max >= 39.5 ) { 
		if( Attr7_Mean < -25.84 ) { return new Prediction("smoking", 60, 16); }
		if( Attr7_Mean >= -25.84 ) { return new Prediction("NULL", 139, 50); }
	}
	if( Attr8_Max < 39.5 ) { 
		if( Attr9_Mean >= -40.94 ) { return new Prediction("NULL", 351, 87); }
		if( Attr9_Mean < -40.94 ) { return new Prediction("smoking", 17, 4); }
	}
	}
	if( Attr3_Min >= -7.55 ) { 
	if( Attr6_Min < -4.32 ) { 
		if( Attr3_Max < 13.72 ) { return new Prediction("smoking", 235, 24); }
		if( Attr3_Max >= 13.72 ) { return new Prediction("NULL", 34, 8); }
	}
	if( Attr6_Min >= -4.32 ) { 
		if( Attr2_Mean >= 0.49 ) { return new Prediction("smoking", 51, 6); }
		if( Attr2_Mean < 0.49 ) { return new Prediction("NULL", 546, 259); }
	}
	}
	}
	}
	if( Attr7_Max >= 23.21 ) { 
	if( Attr1_Min < -6.94 ) { 
	if( Attr1_Min < -10.03 ) { 
	if( Attr3_Max < 11.24 ) { 
		if( Attr2_Min >= -8.45 ) { return new Prediction("NULL", 210, 40); }
		if( Attr2_Min < -8.45 ) { return new Prediction("smoking", 1444, 586); }
	}
	if( Attr3_Max >= 11.24 ) { 
		if( Attr7_Max < 41.59 ) { return new Prediction("NULL", 612, 196); }
		if( Attr7_Max >= 41.59 ) { return new Prediction("NULL", 537, 103); }
	}
	}
	if( Attr1_Min >= -10.03 ) { 
	if( Attr4_Min >= -6.1 ) { 
		if( Attr7_Max < 48.2 ) { return new Prediction("smoking", 1408, 326); }
		if( Attr7_Max >= 48.2 ) { return new Prediction("NULL", 144, 65); }
	}
	if( Attr4_Min < -6.1 ) { 
		if( Attr5_Max >= 2.29 ) { return new Prediction("NULL", 192, 62); }
		if( Attr5_Max < 2.29 ) { return new Prediction("smoking", 73, 23); }
	}
	}
	}
	if( Attr1_Min >= -6.94 ) { 
	if( Attr3_Min < 6.37 ) { 
	if( Attr1_Max < 11.7 ) { 
		if( Attr9_Mean >= 5.34 ) { return new Prediction("NULL", 170, 50); }
		if( Attr9_Mean < 5.34 ) { return new Prediction("NULL", 448, 56); }
	}
	if( Attr1_Max >= 11.7 ) { 
		if( Attr4_Max < 2.1 ) { return new Prediction("smoking", 38, 15); }
		if( Attr4_Max >= 2.1 ) { return new Prediction("NULL", 342, 97); }
	}
	}
		if( Attr3_Min >= 6.37 ) { return new Prediction("NULL", 84, 0); }
	}
	}
	}
return null;
}
private Prediction runTree15() {
	if( Attr5_Min >= -0.59 ) { 
	if( Attr3_Mean < 8.93 ) { 
	if( Attr8_Max >= -6.15 ) { 
	if( Attr6_Mean >= 0.01 ) { 
	if( Attr3_Mean < -2.08 ) { 
		if( Attr6_Max < 0.01 ) { return new Prediction("NULL", 8, 2); }
		if( Attr6_Max >= 0.01 ) { return new Prediction("NULL", 146, 3); }
	}
	if( Attr3_Mean >= -2.08 ) { 
		if( Attr4_Min < -0 ) { return new Prediction("NULL", 474, 138); }
		if( Attr4_Min >= -0 ) { return new Prediction("NULL", 106, 1); }
	}
	}
	if( Attr6_Mean < 0.01 ) { 
	if( Attr9_Mean >= -53.43 ) { 
		if( Attr9_Min >= 9.37 ) { return new Prediction("NULL", 532, 20); }
		if( Attr9_Min < 9.37 ) { return new Prediction("NULL", 2462, 260); }
	}
	if( Attr9_Mean < -53.43 ) { 
		if( Attr1_Min < 2.19 ) { return new Prediction("NULL", 39, 1); }
		if( Attr1_Min >= 2.19 ) { return new Prediction("smoking", 28, 5); }
	}
	}
	}
	if( Attr8_Max < -6.15 ) { 
	if( Attr6_Min >= -3.85 ) { 
	if( Attr2_Max >= 9.83 ) { 
		if( Attr7_Max >= 10.39 ) { return new Prediction("NULL", 10, 0); }
		if( Attr7_Max < 10.39 ) { return new Prediction("smoking", 5, 1); }
	}
	if( Attr2_Max < 9.83 ) { 
		if( Attr4_Mean < 0 ) { return new Prediction("NULL", 278, 0); }
		if( Attr4_Mean >= 0 ) { return new Prediction("NULL", 112, 1); }
	}
	}
		if( Attr6_Min < -3.85 ) { return new Prediction("smoking", 2, 0); }
	}
	}
	if( Attr3_Mean >= 8.93 ) { 
		if( Attr5_Max < 0.78 ) { return new Prediction("NULL", 1364, 0); }
	if( Attr5_Max >= 0.78 ) { 
		if( Attr2_Min < -8.49 ) { return new Prediction("smoking", 2, 0); }
		if( Attr2_Min >= -8.49 ) { return new Prediction("NULL", 4, 0); }
	}
	}
	}
	if( Attr5_Min < -0.59 ) { 
	if( Attr2_Min >= -7.57 ) { 
	if( Attr5_Mean >= -0.12 ) { 
	if( Attr7_Mean >= 42.35 ) { 
	if( Attr9_Min >= -34.06 ) { 
		if( Attr4_Min < -3.49 ) { return new Prediction("NULL", 11, 5); }
		if( Attr4_Min >= -3.49 ) { return new Prediction("smoking", 14, 0); }
	}
	if( Attr9_Min < -34.06 ) { 
		if( Attr3_Mean < -0.65 ) { return new Prediction("smoking", 1, 0); }
		if( Attr3_Mean >= -0.65 ) { return new Prediction("NULL", 17, 0); }
	}
	}
	if( Attr7_Mean < 42.35 ) { 
	if( Attr3_Mean < 9.4 ) { 
		if( Attr4_Min >= -1.31 ) { return new Prediction("NULL", 179, 16); }
		if( Attr4_Min < -1.31 ) { return new Prediction("NULL", 554, 136); }
	}
		if( Attr3_Mean >= 9.4 ) { return new Prediction("NULL", 48, 0); }
	}
	}
		if( Attr5_Mean < -0.12 ) { return new Prediction("NULL", 94, 0); }
	}
	if( Attr2_Min < -7.57 ) { 
	if( Attr4_Max >= 5.55 ) { 
	if( Attr6_Mean < 0.94 ) { 
	if( Attr3_Max >= 14.65 ) { 
		if( Attr6_Mean >= 0.09 ) { return new Prediction("NULL", 101, 38); }
		if( Attr6_Mean < 0.09 ) { return new Prediction("NULL", 761, 130); }
	}
	if( Attr3_Max < 14.65 ) { 
		if( Attr6_Max >= 4.28 ) { return new Prediction("NULL", 500, 208); }
		if( Attr6_Max < 4.28 ) { return new Prediction("NULL", 1348, 362); }
	}
	}
	if( Attr6_Mean >= 0.94 ) { 
		if( Attr3_Mean < -1.87 ) { return new Prediction("NULL", 1, 0); }
		if( Attr3_Mean >= -1.87 ) { return new Prediction("smoking", 19, 0); }
	}
	}
	if( Attr4_Max < 5.55 ) { 
	if( Attr1_Min >= -6.65 ) { 
	if( Attr1_Max < 6.18 ) { 
		if( Attr5_Max < 0.04 ) { return new Prediction("NULL", 53, 0); }
		if( Attr5_Max >= 0.04 ) { return new Prediction("NULL", 697, 77); }
	}
	if( Attr1_Max >= 6.18 ) { 
		if( Attr3_Mean < -1.11 ) { return new Prediction("NULL", 525, 98); }
		if( Attr3_Mean >= -1.11 ) { return new Prediction("NULL", 1367, 419); }
	}
	}
	if( Attr1_Min < -6.65 ) { 
	if( Attr6_Min < -2.63 ) { 
		if( Attr3_Min >= -8.97 ) { return new Prediction("smoking", 2138, 413); }
		if( Attr3_Min < -8.97 ) { return new Prediction("smoking", 494, 246); }
	}
	if( Attr6_Min >= -2.63 ) { 
		if( Attr2_Mean < -0.99 ) { return new Prediction("NULL", 1286, 382); }
		if( Attr2_Mean >= -0.99 ) { return new Prediction("smoking", 98, 28); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree16() {
	if( Attr3_Min >= 3.73 ) { 
	if( Attr2_Min < -1.83 ) { 
	if( Attr5_Max >= 1.02 ) { 
		if( Attr2_Min < -11.08 ) { return new Prediction("NULL", 33, 0); }
	if( Attr2_Min >= -11.08 ) { 
	if( Attr7_Max < 2.8 ) { 
		if( Attr6_Min < -0.57 ) { return new Prediction("NULL", 44, 0); }
		if( Attr6_Min >= -0.57 ) { return new Prediction("smoking", 2, 1); }
	}
	if( Attr7_Max >= 2.8 ) { 
		if( Attr4_Max >= 1.55 ) { return new Prediction("NULL", 80, 33); }
		if( Attr4_Max < 1.55 ) { return new Prediction("NULL", 32, 3); }
	}
	}
	}
	if( Attr5_Max < 1.02 ) { 
	if( Attr4_Mean >= -0.01 ) { 
		if( Attr9_Mean < -34.73 ) { return new Prediction("NULL", 237, 0); }
	if( Attr9_Mean >= -34.73 ) { 
		if( Attr6_Mean < -0 ) { return new Prediction("NULL", 105, 0); }
		if( Attr6_Mean >= -0 ) { return new Prediction("NULL", 768, 40); }
	}
	}
	if( Attr4_Mean < -0.01 ) { 
		if( Attr1_Max < -7.03 ) { return new Prediction("smoking", 3, 0); }
	if( Attr1_Max >= -7.03 ) { 
		if( Attr1_Max >= 2.68 ) { return new Prediction("NULL", 62, 14); }
		if( Attr1_Max < 2.68 ) { return new Prediction("NULL", 147, 5); }
	}
	}
	}
	}
	if( Attr2_Min >= -1.83 ) { 
	if( Attr5_Max >= 0.33 ) { 
	if( Attr2_Max >= 4.82 ) { 
		if( Attr1_Max < -4.02 ) { return new Prediction("smoking", 1, 0); }
	if( Attr1_Max >= -4.02 ) { 
		if( Attr1_Mean < 2.64 ) { return new Prediction("NULL", 9, 0); }
		if( Attr1_Mean >= 2.64 ) { return new Prediction("smoking", 1, 0); }
	}
	}
		if( Attr2_Max < 4.82 ) { return new Prediction("NULL", 17, 0); }
	}
		if( Attr5_Max < 0.33 ) { return new Prediction("NULL", 1261, 0); }
	}
	}
	if( Attr3_Min < 3.73 ) { 
	if( Attr5_Min >= -0.64 ) { 
	if( Attr6_Min >= -2.36 ) { 
	if( Attr3_Min < -3.58 ) { 
	if( Attr5_Mean >= 0 ) { 
		if( Attr3_Min >= -11.2 ) { return new Prediction("NULL", 315, 32); }
		if( Attr3_Min < -11.2 ) { return new Prediction("smoking", 4, 1); }
	}
	if( Attr5_Mean < 0 ) { 
		if( Attr2_Mean >= -10.53 ) { return new Prediction("NULL", 675, 16); }
		if( Attr2_Mean < -10.53 ) { return new Prediction("smoking", 3, 0); }
	}
	}
	if( Attr3_Min >= -3.58 ) { 
	if( Attr4_Min < 0.09 ) { 
		if( Attr9_Min < 8.74 ) { return new Prediction("NULL", 1676, 305); }
		if( Attr9_Min >= 8.74 ) { return new Prediction("NULL", 331, 19); }
	}
		if( Attr4_Min >= 0.09 ) { return new Prediction("NULL", 126, 0); }
	}
	}
	if( Attr6_Min < -2.36 ) { 
	if( Attr1_Min >= -6.67 ) { 
	if( Attr3_Max < 1.96 ) { 
		if( Attr6_Mean < -0.07 ) { return new Prediction("NULL", 1, 0); }
		if( Attr6_Mean >= -0.07 ) { return new Prediction("smoking", 4, 0); }
	}
	if( Attr3_Max >= 1.96 ) { 
		if( Attr5_Min < -0.43 ) { return new Prediction("NULL", 20, 0); }
		if( Attr5_Min >= -0.43 ) { return new Prediction("NULL", 8, 2); }
	}
	}
	if( Attr1_Min < -6.67 ) { 
		if( Attr5_Max >= 1.44 ) { return new Prediction("smoking", 27, 0); }
	if( Attr5_Max < 1.44 ) { 
		if( Attr9_Max < 25.64 ) { return new Prediction("smoking", 13, 6); }
		if( Attr9_Max >= 25.64 ) { return new Prediction("smoking", 18, 1); }
	}
	}
	}
	}
	if( Attr5_Min < -0.64 ) { 
	if( Attr6_Mean < -0.18 ) { 
	if( Attr7_Max < 29.61 ) { 
	if( Attr4_Min < -8.81 ) { 
		if( Attr1_Min < -19.44 ) { return new Prediction("NULL", 1, 0); }
		if( Attr1_Min >= -19.44 ) { return new Prediction("smoking", 1, 0); }
	}
	if( Attr4_Min >= -8.81 ) { 
		if( Attr7_Mean < -14.1 ) { return new Prediction("NULL", 94, 4); }
		if( Attr7_Mean >= -14.1 ) { return new Prediction("NULL", 113, 0); }
	}
	}
	if( Attr7_Max >= 29.61 ) { 
	if( Attr2_Mean < -3.7 ) { 
		if( Attr4_Max < 3.57 ) { return new Prediction("smoking", 16, 5); }
		if( Attr4_Max >= 3.57 ) { return new Prediction("NULL", 32, 6); }
	}
	if( Attr2_Mean >= -3.7 ) { 
		if( Attr1_Mean < -12.01 ) { return new Prediction("smoking", 1, 0); }
		if( Attr1_Mean >= -12.01 ) { return new Prediction("NULL", 35, 0); }
	}
	}
	}
	if( Attr6_Mean >= -0.18 ) { 
	if( Attr4_Min >= -7.14 ) { 
	if( Attr7_Min < -37.55 ) { 
		if( Attr3_Max < 12.07 ) { return new Prediction("smoking", 2360, 906); }
		if( Attr3_Max >= 12.07 ) { return new Prediction("NULL", 441, 160); }
	}
	if( Attr7_Min >= -37.55 ) { 
		if( Attr6_Min < -2.34 ) { return new Prediction("smoking", 2608, 1281); }
		if( Attr6_Min >= -2.34 ) { return new Prediction("NULL", 2581, 596); }
	}
	}
	if( Attr4_Min < -7.14 ) { 
	if( Attr6_Min >= -4.72 ) { 
		if( Attr2_Min >= -29.51 ) { return new Prediction("NULL", 994, 202); }
		if( Attr2_Min < -29.51 ) { return new Prediction("NULL", 41, 0); }
	}
	if( Attr6_Min < -4.72 ) { 
		if( Attr8_Min < -18.54 ) { return new Prediction("NULL", 276, 72); }
		if( Attr8_Min >= -18.54 ) { return new Prediction("NULL", 261, 116); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree17() {
	if( Attr3_Mean >= 8.08 ) { 
	if( Attr6_Max >= 0.47 ) { 
	if( Attr3_Mean >= 9.25 ) { 
		if( Attr2_Mean < -7.11 ) { return new Prediction("smoking", 2, 0); }
	if( Attr2_Mean >= -7.11 ) { 
		if( Attr6_Max >= 0.56 ) { return new Prediction("NULL", 109, 0); }
	if( Attr6_Max < 0.56 ) { 
		if( Attr5_Mean >= -0 ) { return new Prediction("NULL", 4, 0); }
		if( Attr5_Mean < -0 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	}
	if( Attr3_Mean < 9.25 ) { 
	if( Attr9_Min >= -80.08 ) { 
	if( Attr2_Mean < -5.2 ) { 
		if( Attr1_Max < 1.61 ) { return new Prediction("NULL", 2, 0); }
		if( Attr1_Max >= 1.61 ) { return new Prediction("smoking", 7, 0); }
	}
	if( Attr2_Mean >= -5.2 ) { 
		if( Attr5_Mean >= -0 ) { return new Prediction("NULL", 195, 14); }
		if( Attr5_Mean < -0 ) { return new Prediction("NULL", 138, 36); }
	}
	}
	if( Attr9_Min < -80.08 ) { 
	if( Attr8_Max < -6.37 ) { 
		if( Attr6_Max < 2.18 ) { return new Prediction("NULL", 1, 0); }
		if( Attr6_Max >= 2.18 ) { return new Prediction("smoking", 13, 0); }
	}
	if( Attr8_Max >= -6.37 ) { 
		if( Attr2_Min < -4.14 ) { return new Prediction("NULL", 11, 1); }
		if( Attr2_Min >= -4.14 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	}
	}
	if( Attr6_Max < 0.47 ) { 
	if( Attr3_Min < 8.48 ) { 
	if( Attr7_Max < 5.57 ) { 
	if( Attr8_Min >= -3.87 ) { 
		if( Attr6_Max < 0.05 ) { return new Prediction("NULL", 19, 7); }
		if( Attr6_Max >= 0.05 ) { return new Prediction("NULL", 60, 2); }
	}
		if( Attr8_Min < -3.87 ) { return new Prediction("NULL", 61, 0); }
	}
	if( Attr7_Max >= 5.57 ) { 
	if( Attr6_Mean >= 0.01 ) { 
		if( Attr3_Mean >= 8.4 ) { return new Prediction("NULL", 4, 0); }
		if( Attr3_Mean < 8.4 ) { return new Prediction("smoking", 1, 0); }
	}
		if( Attr6_Mean < 0.01 ) { return new Prediction("NULL", 248, 0); }
	}
	}
		if( Attr3_Min >= 8.48 ) { return new Prediction("NULL", 1234, 0); }
	}
	}
	if( Attr3_Mean < 8.08 ) { 
	if( Attr6_Max < 1.47 ) { 
	if( Attr1_Min < -7.27 ) { 
	if( Attr7_Min < 19.34 ) { 
	if( Attr4_Min < -2.19 ) { 
		if( Attr2_Min < -13.3 ) { return new Prediction("NULL", 142, 33); }
		if( Attr2_Min >= -13.3 ) { return new Prediction("smoking", 263, 96); }
	}
	if( Attr4_Min >= -2.19 ) { 
		if( Attr1_Max >= 1.05 ) { return new Prediction("NULL", 122, 54); }
		if( Attr1_Max < 1.05 ) { return new Prediction("NULL", 318, 35); }
	}
	}
	if( Attr7_Min >= 19.34 ) { 
	if( Attr2_Min >= 0.06 ) { 
		if( Attr8_Max >= 9.39 ) { return new Prediction("NULL", 3, 1); }
		if( Attr8_Max < 9.39 ) { return new Prediction("NULL", 92, 0); }
	}
	if( Attr2_Min < 0.06 ) { 
		if( Attr2_Mean >= -2.15 ) { return new Prediction("NULL", 61, 29); }
		if( Attr2_Mean < -2.15 ) { return new Prediction("NULL", 226, 22); }
	}
	}
	}
	if( Attr1_Min >= -7.27 ) { 
	if( Attr7_Max >= -72.54 ) { 
		if( Attr5_Max < -0 ) { return new Prediction("NULL", 215, 0); }
	if( Attr5_Max >= -0 ) { 
		if( Attr2_Min < -2.35 ) { return new Prediction("NULL", 4027, 491); }
		if( Attr2_Min >= -2.35 ) { return new Prediction("NULL", 456, 14); }
	}
	}
	if( Attr7_Max < -72.54 ) { 
		if( Attr7_Mean < -91.72 ) { return new Prediction("NULL", 10, 0); }
		if( Attr7_Mean >= -91.72 ) { return new Prediction("smoking", 21, 0); }
	}
	}
	}
	if( Attr6_Max >= 1.47 ) { 
	if( Attr1_Mean >= 0.99 ) { 
	if( Attr7_Min < -37.55 ) { 
	if( Attr2_Max < 3.19 ) { 
		if( Attr4_Max >= 5.29 ) { return new Prediction("NULL", 187, 52); }
		if( Attr4_Max < 5.29 ) { return new Prediction("smoking", 673, 244); }
	}
	if( Attr2_Max >= 3.19 ) { 
		if( Attr8_Min < -34.62 ) { return new Prediction("NULL", 124, 20); }
		if( Attr8_Min >= -34.62 ) { return new Prediction("NULL", 663, 252); }
	}
	}
	if( Attr7_Min >= -37.55 ) { 
	if( Attr9_Max >= 17.2 ) { 
		if( Attr2_Min < -19.79 ) { return new Prediction("NULL", 95, 2); }
		if( Attr2_Min >= -19.79 ) { return new Prediction("NULL", 735, 158); }
	}
	if( Attr9_Max < 17.2 ) { 
		if( Attr2_Max >= 1.7 ) { return new Prediction("NULL", 633, 197); }
		if( Attr2_Max < 1.7 ) { return new Prediction("NULL", 455, 211); }
	}
	}
	}
	if( Attr1_Mean < 0.99 ) { 
	if( Attr3_Min < -7.51 ) { 
	if( Attr4_Max < 4.72 ) { 
		if( Attr6_Min < -2.34 ) { return new Prediction("smoking", 431, 124); }
		if( Attr6_Min >= -2.34 ) { return new Prediction("NULL", 212, 71); }
	}
	if( Attr4_Max >= 4.72 ) { 
		if( Attr2_Max >= 15.56 ) { return new Prediction("NULL", 186, 23); }
		if( Attr2_Max < 15.56 ) { return new Prediction("NULL", 827, 241); }
	}
	}
	if( Attr3_Min >= -7.51 ) { 
	if( Attr1_Min < -7.27 ) { 
		if( Attr1_Max >= -2.7 ) { return new Prediction("smoking", 2064, 604); }
		if( Attr1_Max < -2.7 ) { return new Prediction("NULL", 159, 42); }
	}
	if( Attr1_Min >= -7.27 ) { 
		if( Attr2_Mean < -3.64 ) { return new Prediction("NULL", 325, 115); }
		if( Attr2_Mean >= -3.64 ) { return new Prediction("NULL", 42, 1); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree18() {
	if( Attr1_Min >= -6.66 ) { 
	if( Attr6_Max < 0.95 ) { 
	if( Attr1_Mean < 0.4 ) { 
	if( Attr2_Min >= -6.11 ) { 
		if( Attr2_Min >= -3.46 ) { return new Prediction("NULL", 1199, 0); }
	if( Attr2_Min < -3.46 ) { 
		if( Attr3_Mean < 8.72 ) { return new Prediction("NULL", 199, 0); }
		if( Attr3_Mean >= 8.72 ) { return new Prediction("NULL", 173, 2); }
	}
	}
	if( Attr2_Min < -6.11 ) { 
	if( Attr4_Min >= -6.56 ) { 
		if( Attr5_Mean < 0.01 ) { return new Prediction("NULL", 826, 63); }
		if( Attr5_Mean >= 0.01 ) { return new Prediction("NULL", 224, 3); }
	}
		if( Attr4_Min < -6.56 ) { return new Prediction("smoking", 3, 0); }
	}
	}
	if( Attr1_Mean >= 0.4 ) { 
	if( Attr8_Mean < -2.28 ) { 
		if( Attr8_Min >= -3.78 ) { return new Prediction("smoking", 2, 0); }
	if( Attr8_Min < -3.78 ) { 
		if( Attr7_Mean >= 6.98 ) { return new Prediction("NULL", 65, 7); }
		if( Attr7_Mean < 6.98 ) { return new Prediction("NULL", 460, 6); }
	}
	}
	if( Attr8_Mean >= -2.28 ) { 
	if( Attr7_Mean < -74.44 ) { 
		if( Attr1_Mean >= 6.27 ) { return new Prediction("NULL", 5, 0); }
		if( Attr1_Mean < 6.27 ) { return new Prediction("smoking", 20, 0); }
	}
	if( Attr7_Mean >= -74.44 ) { 
		if( Attr3_Mean >= -1.53 ) { return new Prediction("NULL", 1719, 218); }
		if( Attr3_Mean < -1.53 ) { return new Prediction("NULL", 824, 49); }
	}
	}
	}
	}
	if( Attr6_Max >= 0.95 ) { 
	if( Attr1_Max >= 7.35 ) { 
	if( Attr9_Max >= 11.57 ) { 
	if( Attr7_Min >= -32.67 ) { 
		if( Attr7_Mean < -6.29 ) { return new Prediction("NULL", 288, 23); }
		if( Attr7_Mean >= -6.29 ) { return new Prediction("NULL", 249, 49); }
	}
	if( Attr7_Min < -32.67 ) { 
		if( Attr4_Max >= 4.59 ) { return new Prediction("NULL", 455, 80); }
		if( Attr4_Max < 4.59 ) { return new Prediction("NULL", 518, 151); }
	}
	}
	if( Attr9_Max < 11.57 ) { 
	if( Attr2_Mean >= -2.72 ) { 
		if( Attr6_Min < -2.33 ) { return new Prediction("NULL", 94, 2); }
		if( Attr6_Min >= -2.33 ) { return new Prediction("NULL", 107, 24); }
	}
	if( Attr2_Mean < -2.72 ) { 
		if( Attr9_Min >= -36.8 ) { return new Prediction("NULL", 458, 221); }
		if( Attr9_Min < -36.8 ) { return new Prediction("NULL", 352, 99); }
	}
	}
	}
	if( Attr1_Max < 7.35 ) { 
	if( Attr6_Min < -2.08 ) { 
	if( Attr3_Mean >= -8.31 ) { 
		if( Attr9_Mean < -61.52 ) { return new Prediction("smoking", 5, 0); }
		if( Attr9_Mean >= -61.52 ) { return new Prediction("NULL", 191, 39); }
	}
		if( Attr3_Mean < -8.31 ) { return new Prediction("smoking", 4, 0); }
	}
	if( Attr6_Min >= -2.08 ) { 
	if( Attr2_Max >= -4.58 ) { 
		if( Attr1_Min < -4.41 ) { return new Prediction("NULL", 143, 24); }
		if( Attr1_Min >= -4.41 ) { return new Prediction("NULL", 398, 30); }
	}
	if( Attr2_Max < -4.58 ) { 
		if( Attr4_Min >= -2.97 ) { return new Prediction("NULL", 106, 22); }
		if( Attr4_Min < -2.97 ) { return new Prediction("smoking", 20, 8); }
	}
	}
	}
	}
	}
	if( Attr1_Min < -6.66 ) { 
	if( Attr1_Max < -2.11 ) { 
	if( Attr3_Min >= -2.37 ) { 
	if( Attr3_Max >= 6.59 ) { 
	if( Attr4_Max < 3.12 ) { 
		if( Attr9_Mean >= -42.12 ) { return new Prediction("NULL", 105, 22); }
		if( Attr9_Mean < -42.12 ) { return new Prediction("smoking", 10, 0); }
	}
	if( Attr4_Max >= 3.12 ) { 
		if( Attr1_Min < -13.45 ) { return new Prediction("NULL", 3, 0); }
		if( Attr1_Min >= -13.45 ) { return new Prediction("smoking", 73, 5); }
	}
	}
	if( Attr3_Max < 6.59 ) { 
	if( Attr5_Mean >= -0.04 ) { 
		if( Attr3_Mean < 0.13 ) { return new Prediction("smoking", 46, 20); }
		if( Attr3_Mean >= 0.13 ) { return new Prediction("NULL", 281, 22); }
	}
	if( Attr5_Mean < -0.04 ) { 
		if( Attr3_Min >= 1.81 ) { return new Prediction("NULL", 1, 0); }
		if( Attr3_Min < 1.81 ) { return new Prediction("smoking", 9, 0); }
	}
	}
	}
	if( Attr3_Min < -2.37 ) { 
	if( Attr7_Min < -0.69 ) { 
	if( Attr8_Max < 46.01 ) { 
		if( Attr9_Min >= -9.29 ) { return new Prediction("NULL", 17, 0); }
		if( Attr9_Min < -9.29 ) { return new Prediction("NULL", 57, 15); }
	}
		if( Attr8_Max >= 46.01 ) { return new Prediction("NULL", 22, 0); }
	}
	if( Attr7_Min >= -0.69 ) { 
		if( Attr2_Max >= -0.05 ) { return new Prediction("NULL", 167, 0); }
	if( Attr2_Max < -0.05 ) { 
		if( Attr4_Max < 7.8 ) { return new Prediction("NULL", 70, 3); }
		if( Attr4_Max >= 7.8 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	}
	}
	if( Attr1_Max >= -2.11 ) { 
	if( Attr4_Max >= 6.14 ) { 
	if( Attr3_Min >= -3.2 ) { 
	if( Attr3_Max < 15.9 ) { 
		if( Attr3_Min < 0.86 ) { return new Prediction("smoking", 104, 24); }
		if( Attr3_Min >= 0.86 ) { return new Prediction("smoking", 24, 0); }
	}
	if( Attr3_Max >= 15.9 ) { 
		if( Attr7_Max >= 32.76 ) { return new Prediction("NULL", 8, 3); }
		if( Attr7_Max < 32.76 ) { return new Prediction("NULL", 9, 0); }
	}
	}
	if( Attr3_Min < -3.2 ) { 
	if( Attr3_Max >= 11.98 ) { 
		if( Attr2_Max < 19.87 ) { return new Prediction("NULL", 928, 227); }
		if( Attr2_Max >= 19.87 ) { return new Prediction("NULL", 80, 2); }
	}
	if( Attr3_Max < 11.98 ) { 
		if( Attr3_Mean < -1.59 ) { return new Prediction("NULL", 110, 21); }
		if( Attr3_Mean >= -1.59 ) { return new Prediction("NULL", 387, 177); }
	}
	}
	}
	if( Attr4_Max < 6.14 ) { 
	if( Attr2_Min >= -16.52 ) { 
	if( Attr9_Mean >= -1.32 ) { 
		if( Attr6_Max < 1.54 ) { return new Prediction("NULL", 240, 96); }
		if( Attr6_Max >= 1.54 ) { return new Prediction("smoking", 1271, 242); }
	}
	if( Attr9_Mean < -1.32 ) { 
		if( Attr6_Max < 3.79 ) { return new Prediction("NULL", 1176, 571); }
		if( Attr6_Max >= 3.79 ) { return new Prediction("smoking", 657, 142); }
	}
	}
	if( Attr2_Min < -16.52 ) { 
	if( Attr6_Min < -3.58 ) { 
		if( Attr6_Max < 5.19 ) { return new Prediction("NULL", 331, 156); }
		if( Attr6_Max >= 5.19 ) { return new Prediction("smoking", 140, 26); }
	}
	if( Attr6_Min >= -3.58 ) { 
		if( Attr9_Min >= -21.89 ) { return new Prediction("NULL", 133, 10); }
		if( Attr9_Min < -21.89 ) { return new Prediction("NULL", 311, 95); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree19() {
	if( Attr2_Min < -9.63 ) { 
	if( Attr1_Min >= -6.57 ) { 
	if( Attr1_Min < 0.75 ) { 
	if( Attr1_Mean < 0.21 ) { 
	if( Attr5_Min >= -5.98 ) { 
		if( Attr6_Min >= -2.55 ) { return new Prediction("NULL", 636, 63); }
		if( Attr6_Min < -2.55 ) { return new Prediction("NULL", 132, 33); }
	}
		if( Attr5_Min < -5.98 ) { return new Prediction("smoking", 3, 0); }
	}
	if( Attr1_Mean >= 0.21 ) { 
	if( Attr1_Max < 6.18 ) { 
		if( Attr4_Min < -6.77 ) { return new Prediction("smoking", 16, 6); }
		if( Attr4_Min >= -6.77 ) { return new Prediction("NULL", 427, 61); }
	}
	if( Attr1_Max >= 6.18 ) { 
		if( Attr4_Mean < -0.1 ) { return new Prediction("NULL", 117, 10); }
		if( Attr4_Mean >= -0.1 ) { return new Prediction("NULL", 1656, 496); }
	}
	}
	}
	if( Attr1_Min >= 0.75 ) { 
	if( Attr1_Mean >= 8.91 ) { 
		if( Attr3_Mean >= 1.28 ) { return new Prediction("NULL", 9, 0); }
	if( Attr3_Mean < 1.28 ) { 
		if( Attr4_Min < -2.37 ) { return new Prediction("smoking", 40, 20); }
		if( Attr4_Min >= -2.37 ) { return new Prediction("smoking", 21, 0); }
	}
	}
	if( Attr1_Mean < 8.91 ) { 
	if( Attr9_Min >= -67.57 ) { 
		if( Attr8_Max >= 9.01 ) { return new Prediction("NULL", 696, 57); }
		if( Attr8_Max < 9.01 ) { return new Prediction("NULL", 56, 0); }
	}
	if( Attr9_Min < -67.57 ) { 
		if( Attr1_Min >= 3.63 ) { return new Prediction("smoking", 6, 0); }
		if( Attr1_Min < 3.63 ) { return new Prediction("NULL", 8, 0); }
	}
	}
	}
	}
	if( Attr1_Min < -6.57 ) { 
	if( Attr4_Max >= 4.35 ) { 
	if( Attr3_Min < -5.84 ) { 
	if( Attr3_Max >= 11.19 ) { 
		if( Attr7_Mean >= -9.71 ) { return new Prediction("NULL", 916, 194); }
		if( Attr7_Mean < -9.71 ) { return new Prediction("NULL", 360, 121); }
	}
	if( Attr3_Max < 11.19 ) { 
		if( Attr1_Max < 7.38 ) { return new Prediction("NULL", 189, 46); }
		if( Attr1_Max >= 7.38 ) { return new Prediction("NULL", 469, 215); }
	}
	}
	if( Attr3_Min >= -5.84 ) { 
	if( Attr7_Min < -37.79 ) { 
		if( Attr7_Min < -57.88 ) { return new Prediction("NULL", 22, 7); }
		if( Attr7_Min >= -57.88 ) { return new Prediction("smoking", 192, 46); }
	}
	if( Attr7_Min >= -37.79 ) { 
		if( Attr8_Mean < 0.68 ) { return new Prediction("smoking", 135, 45); }
		if( Attr8_Mean >= 0.68 ) { return new Prediction("NULL", 347, 119); }
	}
	}
	}
	if( Attr4_Max < 4.35 ) { 
	if( Attr7_Min < -37.43 ) { 
	if( Attr7_Mean >= 3.5 ) { 
		if( Attr8_Min >= -7.09 ) { return new Prediction("smoking", 215, 4); }
		if( Attr8_Min < -7.09 ) { return new Prediction("smoking", 266, 44); }
	}
	if( Attr7_Mean < 3.5 ) { 
		if( Attr2_Max < 5.89 ) { return new Prediction("smoking", 630, 127); }
		if( Attr2_Max >= 5.89 ) { return new Prediction("NULL", 76, 28); }
	}
	}
	if( Attr7_Min >= -37.43 ) { 
	if( Attr6_Min >= -2.37 ) { 
		if( Attr6_Min < -0.35 ) { return new Prediction("NULL", 679, 169); }
		if( Attr6_Min >= -0.35 ) { return new Prediction("smoking", 35, 9); }
	}
	if( Attr6_Min < -2.37 ) { 
		if( Attr3_Max < 8.87 ) { return new Prediction("smoking", 739, 105); }
		if( Attr3_Max >= 8.87 ) { return new Prediction("smoking", 422, 188); }
	}
	}
	}
	}
	}
	if( Attr2_Min >= -9.63 ) { 
	if( Attr1_Min >= -8.49 ) { 
	if( Attr6_Max < 0.51 ) { 
	if( Attr1_Mean < 0.41 ) { 
	if( Attr2_Min < -6.28 ) { 
		if( Attr9_Mean >= -13.33 ) { return new Prediction("NULL", 374, 8); }
		if( Attr9_Mean < -13.33 ) { return new Prediction("NULL", 222, 34); }
	}
	if( Attr2_Min >= -6.28 ) { 
		if( Attr3_Mean >= 8.34 ) { return new Prediction("NULL", 1347, 0); }
		if( Attr3_Mean < 8.34 ) { return new Prediction("NULL", 255, 7); }
	}
	}
	if( Attr1_Mean >= 0.41 ) { 
	if( Attr9_Mean < -53.93 ) { 
		if( Attr2_Min < -6.65 ) { return new Prediction("smoking", 17, 2); }
		if( Attr2_Min >= -6.65 ) { return new Prediction("NULL", 19, 0); }
	}
	if( Attr9_Mean >= -53.93 ) { 
		if( Attr3_Mean >= -3.57 ) { return new Prediction("NULL", 1725, 138); }
		if( Attr3_Mean < -3.57 ) { return new Prediction("NULL", 412, 9); }
	}
	}
	}
	if( Attr6_Max >= 0.51 ) { 
	if( Attr3_Min >= 6.45 ) { 
	if( Attr2_Mean < 1.76 ) { 
		if( Attr1_Mean < 2.6 ) { return new Prediction("NULL", 155, 4); }
		if( Attr1_Mean >= 2.6 ) { return new Prediction("NULL", 10, 4); }
	}
		if( Attr2_Mean >= 1.76 ) { return new Prediction("smoking", 4, 0); }
	}
	if( Attr3_Min < 6.45 ) { 
	if( Attr6_Min >= -1.54 ) { 
		if( Attr7_Mean >= -2.38 ) { return new Prediction("NULL", 167, 41); }
		if( Attr7_Mean < -2.38 ) { return new Prediction("NULL", 456, 50); }
	}
	if( Attr6_Min < -1.54 ) { 
		if( Attr4_Mean < -0.07 ) { return new Prediction("NULL", 39, 1); }
		if( Attr4_Mean >= -0.07 ) { return new Prediction("NULL", 318, 127); }
	}
	}
	}
	}
	if( Attr1_Min < -8.49 ) { 
	if( Attr3_Max < 8.51 ) { 
	if( Attr5_Mean >= 0 ) { 
	if( Attr1_Max >= 7.22 ) { 
		if( Attr8_Max >= 36.62 ) { return new Prediction("smoking", 28, 1); }
		if( Attr8_Max < 36.62 ) { return new Prediction("NULL", 6, 1); }
	}
	if( Attr1_Max < 7.22 ) { 
		if( Attr4_Mean < 0.01 ) { return new Prediction("NULL", 115, 49); }
		if( Attr4_Mean >= 0.01 ) { return new Prediction("NULL", 79, 15); }
	}
	}
	if( Attr5_Mean < 0 ) { 
		if( Attr6_Max < 0.1 ) { return new Prediction("NULL", 81, 0); }
	if( Attr6_Max >= 0.1 ) { 
		if( Attr6_Mean < -0.14 ) { return new Prediction("NULL", 47, 0); }
		if( Attr6_Mean >= -0.14 ) { return new Prediction("NULL", 204, 50); }
	}
	}
	}
	if( Attr3_Max >= 8.51 ) { 
	if( Attr3_Max < 12.11 ) { 
	if( Attr1_Mean < -2.33 ) { 
		if( Attr4_Max >= 4.35 ) { return new Prediction("smoking", 102, 3); }
		if( Attr4_Max < 4.35 ) { return new Prediction("smoking", 108, 27); }
	}
	if( Attr1_Mean >= -2.33 ) { 
		if( Attr8_Mean >= 10.51 ) { return new Prediction("NULL", 8, 0); }
		if( Attr8_Mean < 10.51 ) { return new Prediction("NULL", 8, 2); }
	}
	}
	if( Attr3_Max >= 12.11 ) { 
	if( Attr2_Min >= -7.07 ) { 
		if( Attr1_Mean >= 0.3 ) { return new Prediction("smoking", 1, 0); }
		if( Attr1_Mean < 0.3 ) { return new Prediction("NULL", 20, 1); }
	}
	if( Attr2_Min < -7.07 ) { 
		if( Attr3_Max < 16.76 ) { return new Prediction("smoking", 30, 13); }
		if( Attr3_Max >= 16.76 ) { return new Prediction("NULL", 6, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree20() {
	if( Attr6_Max >= 1.39 ) { 
	if( Attr6_Min < -2.33 ) { 
	if( Attr1_Min < -6.63 ) { 
	if( Attr4_Max < 4.75 ) { 
	if( Attr3_Max >= 11.38 ) { 
		if( Attr2_Max < 19.99 ) { return new Prediction("smoking", 432, 195); }
		if( Attr2_Max >= 19.99 ) { return new Prediction("NULL", 15, 0); }
	}
	if( Attr3_Max < 11.38 ) { 
		if( Attr4_Max < 2.87 ) { return new Prediction("smoking", 928, 90); }
		if( Attr4_Max >= 2.87 ) { return new Prediction("smoking", 1128, 269); }
	}
	}
	if( Attr4_Max >= 4.75 ) { 
	if( Attr3_Max >= 11.98 ) { 
		if( Attr7_Mean >= 28.3 ) { return new Prediction("NULL", 101, 10); }
		if( Attr7_Mean < 28.3 ) { return new Prediction("NULL", 1054, 272); }
	}
	if( Attr3_Max < 11.98 ) { 
		if( Attr3_Min >= -7.66 ) { return new Prediction("smoking", 392, 107); }
		if( Attr3_Min < -7.66 ) { return new Prediction("NULL", 483, 180); }
	}
	}
	}
	if( Attr1_Min >= -6.63 ) { 
	if( Attr1_Mean < 9.03 ) { 
	if( Attr1_Mean >= 3.07 ) { 
		if( Attr3_Min < 0.41 ) { return new Prediction("NULL", 783, 115); }
		if( Attr3_Min >= 0.41 ) { return new Prediction("smoking", 24, 11); }
	}
	if( Attr1_Mean < 3.07 ) { 
		if( Attr7_Min >= -19.63 ) { return new Prediction("NULL", 151, 23); }
		if( Attr7_Min < -19.63 ) { return new Prediction("NULL", 267, 92); }
	}
	}
	if( Attr1_Mean >= 9.03 ) { 
	if( Attr2_Min >= -14.05 ) { 
		if( Attr9_Mean >= -10.52 ) { return new Prediction("smoking", 57, 18); }
		if( Attr9_Mean < -10.52 ) { return new Prediction("NULL", 10, 1); }
	}
		if( Attr2_Min < -14.05 ) { return new Prediction("NULL", 10, 0); }
	}
	}
	}
	if( Attr6_Min >= -2.33 ) { 
	if( Attr2_Max < 0.38 ) { 
	if( Attr7_Min >= -32.37 ) { 
	if( Attr4_Mean < -0.04 ) { 
		if( Attr2_Max < -1.6 ) { return new Prediction("NULL", 32, 3); }
		if( Attr2_Max >= -1.6 ) { return new Prediction("NULL", 36, 0); }
	}
	if( Attr4_Mean >= -0.04 ) { 
		if( Attr6_Mean >= 0.04 ) { return new Prediction("smoking", 120, 50); }
		if( Attr6_Mean < 0.04 ) { return new Prediction("NULL", 416, 96); }
	}
	}
	if( Attr7_Min < -32.37 ) { 
	if( Attr1_Mean < 2.98 ) { 
		if( Attr6_Max < 1.7 ) { return new Prediction("NULL", 48, 14); }
		if( Attr6_Max >= 1.7 ) { return new Prediction("smoking", 146, 40); }
	}
	if( Attr1_Mean >= 2.98 ) { 
		if( Attr9_Max < 11.3 ) { return new Prediction("smoking", 62, 23); }
		if( Attr9_Max >= 11.3 ) { return new Prediction("NULL", 101, 22); }
	}
	}
	}
	if( Attr2_Max >= 0.38 ) { 
	if( Attr3_Min >= -1.33 ) { 
	if( Attr3_Mean < 7.22 ) { 
		if( Attr7_Mean < -35.74 ) { return new Prediction("NULL", 15, 0); }
		if( Attr7_Mean >= -35.74 ) { return new Prediction("smoking", 275, 129); }
	}
	if( Attr3_Mean >= 7.22 ) { 
		if( Attr7_Mean < 21.26 ) { return new Prediction("NULL", 151, 21); }
		if( Attr7_Mean >= 21.26 ) { return new Prediction("NULL", 36, 0); }
	}
	}
	if( Attr3_Min < -1.33 ) { 
	if( Attr1_Max >= 0.55 ) { 
		if( Attr7_Max >= -19.73 ) { return new Prediction("NULL", 886, 207); }
		if( Attr7_Max < -19.73 ) { return new Prediction("NULL", 75, 1); }
	}
	if( Attr1_Max < 0.55 ) { 
		if( Attr3_Mean >= -4.21 ) { return new Prediction("NULL", 104, 1); }
		if( Attr3_Mean < -4.21 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	}
	}
	}
	if( Attr6_Max < 1.39 ) { 
	if( Attr3_Mean < 9.12 ) { 
	if( Attr9_Min >= -9.41 ) { 
	if( Attr6_Min >= -2.19 ) { 
	if( Attr8_Min >= -14.54 ) { 
		if( Attr3_Min >= -3.66 ) { return new Prediction("NULL", 932, 105); }
		if( Attr3_Min < -3.66 ) { return new Prediction("NULL", 825, 28); }
	}
	if( Attr8_Min < -14.54 ) { 
		if( Attr4_Min < -0.27 ) { return new Prediction("NULL", 110, 4); }
		if( Attr4_Min >= -0.27 ) { return new Prediction("NULL", 168, 0); }
	}
	}
	if( Attr6_Min < -2.19 ) { 
	if( Attr4_Max < 1.88 ) { 
		if( Attr7_Min < -7.99 ) { return new Prediction("NULL", 15, 7); }
		if( Attr7_Min >= -7.99 ) { return new Prediction("smoking", 11, 0); }
	}
	if( Attr4_Max >= 1.88 ) { 
		if( Attr7_Max < -28.48 ) { return new Prediction("smoking", 2, 1); }
		if( Attr7_Max >= -28.48 ) { return new Prediction("NULL", 31, 0); }
	}
	}
	}
	if( Attr9_Min < -9.41 ) { 
	if( Attr5_Min < -1.22 ) { 
	if( Attr2_Min >= -11.15 ) { 
		if( Attr5_Mean >= -0.12 ) { return new Prediction("smoking", 310, 149); }
		if( Attr5_Mean < -0.12 ) { return new Prediction("NULL", 47, 1); }
	}
	if( Attr2_Min < -11.15 ) { 
		if( Attr5_Min >= -1.89 ) { return new Prediction("NULL", 251, 32); }
		if( Attr5_Min < -1.89 ) { return new Prediction("NULL", 192, 56); }
	}
	}
	if( Attr5_Min >= -1.22 ) { 
	if( Attr1_Min >= -3.55 ) { 
		if( Attr7_Mean >= -79.16 ) { return new Prediction("NULL", 2424, 201); }
		if( Attr7_Mean < -79.16 ) { return new Prediction("smoking", 28, 14); }
	}
	if( Attr1_Min < -3.55 ) { 
		if( Attr1_Mean >= -0.62 ) { return new Prediction("smoking", 142, 64); }
		if( Attr1_Mean < -0.62 ) { return new Prediction("NULL", 743, 123); }
	}
	}
	}
	}
	if( Attr3_Mean >= 9.12 ) { 
	if( Attr5_Min < -0.7 ) { 
		if( Attr6_Mean >= 0.01 ) { return new Prediction("smoking", 2, 0); }
		if( Attr6_Mean < 0.01 ) { return new Prediction("NULL", 45, 0); }
	}
		if( Attr5_Min >= -0.7 ) { return new Prediction("NULL", 1261, 0); }
	}
	}
return null;
}
private Prediction runTree21() {
	if( Attr1_Min < -6.58 ) { 
	if( Attr6_Max < 1.7 ) { 
	if( Attr1_Min < -12.59 ) { 
	if( Attr4_Min < -3.59 ) { 
	if( Attr4_Max >= 4.79 ) { 
		if( Attr6_Min >= -2.06 ) { return new Prediction("smoking", 8, 0); }
		if( Attr6_Min < -2.06 ) { return new Prediction("NULL", 13, 2); }
	}
	if( Attr4_Max < 4.79 ) { 
		if( Attr4_Max < 1.9 ) { return new Prediction("smoking", 3, 1); }
		if( Attr4_Max >= 1.9 ) { return new Prediction("NULL", 28, 1); }
	}
	}
	if( Attr4_Min >= -3.59 ) { 
	if( Attr1_Min >= -15.82 ) { 
		if( Attr1_Max >= 6.13 ) { return new Prediction("NULL", 24, 11); }
		if( Attr1_Max < 6.13 ) { return new Prediction("NULL", 135, 3); }
	}
	if( Attr1_Min < -15.82 ) { 
		if( Attr7_Mean < -3.54 ) { return new Prediction("smoking", 1, 0); }
		if( Attr7_Mean >= -3.54 ) { return new Prediction("NULL", 107, 0); }
	}
	}
	}
	if( Attr1_Min >= -12.59 ) { 
	if( Attr2_Min < -1.25 ) { 
	if( Attr6_Mean >= -0.01 ) { 
		if( Attr1_Min >= -7.24 ) { return new Prediction("NULL", 97, 6); }
		if( Attr1_Min < -7.24 ) { return new Prediction("NULL", 569, 193); }
	}
	if( Attr6_Mean < -0.01 ) { 
		if( Attr8_Max >= 50.5 ) { return new Prediction("NULL", 35, 5); }
		if( Attr8_Max < 50.5 ) { return new Prediction("smoking", 365, 165); }
	}
	}
	if( Attr2_Min >= -1.25 ) { 
		if( Attr6_Max < 0.1 ) { return new Prediction("NULL", 119, 0); }
	if( Attr6_Max >= 0.1 ) { 
		if( Attr3_Mean >= 3.41 ) { return new Prediction("smoking", 4, 0); }
		if( Attr3_Mean < 3.41 ) { return new Prediction("NULL", 19, 0); }
	}
	}
	}
	}
	if( Attr6_Max >= 1.7 ) { 
	if( Attr7_Min >= -37.41 ) { 
	if( Attr3_Min >= -9.8 ) { 
	if( Attr6_Min < -2.28 ) { 
		if( Attr4_Min < -3.5 ) { return new Prediction("smoking", 1048, 516); }
		if( Attr4_Min >= -3.5 ) { return new Prediction("smoking", 748, 153); }
	}
	if( Attr6_Min >= -2.28 ) { 
		if( Attr6_Mean < 0.03 ) { return new Prediction("NULL", 283, 62); }
		if( Attr6_Mean >= 0.03 ) { return new Prediction("NULL", 252, 110); }
	}
	}
	if( Attr3_Min < -9.8 ) { 
		if( Attr6_Mean < -0.15 ) { return new Prediction("NULL", 39, 0); }
	if( Attr6_Mean >= -0.15 ) { 
		if( Attr2_Min < -19.89 ) { return new Prediction("NULL", 147, 12); }
		if( Attr2_Min >= -19.89 ) { return new Prediction("NULL", 775, 225); }
	}
	}
	}
	if( Attr7_Min < -37.41 ) { 
	if( Attr4_Max >= 4.74 ) { 
	if( Attr3_Min < -6.4 ) { 
		if( Attr9_Max >= -9.9 ) { return new Prediction("NULL", 574, 194); }
		if( Attr9_Max < -9.9 ) { return new Prediction("NULL", 20, 0); }
	}
	if( Attr3_Min >= -6.4 ) { 
		if( Attr1_Mean < 2.89 ) { return new Prediction("smoking", 173, 73); }
		if( Attr1_Mean >= 2.89 ) { return new Prediction("smoking", 36, 3); }
	}
	}
	if( Attr4_Max < 4.74 ) { 
	if( Attr3_Max < 11.82 ) { 
		if( Attr4_Min >= -5.01 ) { return new Prediction("smoking", 887, 87); }
		if( Attr4_Min < -5.01 ) { return new Prediction("smoking", 187, 47); }
	}
	if( Attr3_Max >= 11.82 ) { 
		if( Attr5_Max < 4.16 ) { return new Prediction("smoking", 124, 49); }
		if( Attr5_Max >= 4.16 ) { return new Prediction("NULL", 17, 1); }
	}
	}
	}
	}
	}
	if( Attr1_Min >= -6.58 ) { 
	if( Attr3_Mean < 9.4 ) { 
	if( Attr4_Min >= -1.18 ) { 
	if( Attr6_Mean >= 0.01 ) { 
	if( Attr6_Max >= 1.87 ) { 
		if( Attr2_Mean >= -3.83 ) { return new Prediction("NULL", 25, 3); }
		if( Attr2_Mean < -3.83 ) { return new Prediction("smoking", 50, 17); }
	}
	if( Attr6_Max < 1.87 ) { 
		if( Attr1_Mean >= 8.55 ) { return new Prediction("smoking", 58, 28); }
		if( Attr1_Mean < 8.55 ) { return new Prediction("NULL", 591, 64); }
	}
	}
	if( Attr6_Mean < 0.01 ) { 
	if( Attr3_Mean >= 8.08 ) { 
		if( Attr1_Mean < -0.33 ) { return new Prediction("NULL", 252, 0); }
		if( Attr1_Mean >= -0.33 ) { return new Prediction("NULL", 197, 8); }
	}
	if( Attr3_Mean < 8.08 ) { 
		if( Attr5_Mean >= 0 ) { return new Prediction("NULL", 757, 91); }
		if( Attr5_Mean < 0 ) { return new Prediction("NULL", 1730, 101); }
	}
	}
	}
	if( Attr4_Min < -1.18 ) { 
	if( Attr1_Max < 5.48 ) { 
	if( Attr6_Min < -1.42 ) { 
		if( Attr4_Mean >= 0.93 ) { return new Prediction("smoking", 5, 0); }
		if( Attr4_Mean < 0.93 ) { return new Prediction("NULL", 318, 62); }
	}
	if( Attr6_Min >= -1.42 ) { 
		if( Attr3_Min < 0.31 ) { return new Prediction("NULL", 313, 12); }
		if( Attr3_Min >= 0.31 ) { return new Prediction("NULL", 285, 41); }
	}
	}
	if( Attr1_Max >= 5.48 ) { 
	if( Attr3_Min < -5.7 ) { 
		if( Attr1_Max >= 13.6 ) { return new Prediction("NULL", 621, 67); }
		if( Attr1_Max < 13.6 ) { return new Prediction("NULL", 895, 178); }
	}
	if( Attr3_Min >= -5.7 ) { 
		if( Attr5_Mean < -0.29 ) { return new Prediction("NULL", 47, 0); }
		if( Attr5_Mean >= -0.29 ) { return new Prediction("NULL", 1660, 485); }
	}
	}
	}
	}
		if( Attr3_Mean >= 9.4 ) { return new Prediction("NULL", 1237, 0); }
	}
return null;
}
private Prediction runTree22() {
	if( Attr2_Max >= -3.98 ) { 
	if( Attr2_Min >= -6.93 ) { 
	if( Attr3_Min >= 7.02 ) { 
	if( Attr1_Min >= 0.22 ) { 
		if( Attr3_Mean >= 8.84 ) { return new Prediction("NULL", 195, 0); }
	if( Attr3_Mean < 8.84 ) { 
		if( Attr6_Mean < 0 ) { return new Prediction("NULL", 20, 9); }
		if( Attr6_Mean >= 0 ) { return new Prediction("NULL", 35, 1); }
	}
	}
	if( Attr1_Min < 0.22 ) { 
		if( Attr5_Mean >= -0 ) { return new Prediction("NULL", 1241, 0); }
	if( Attr5_Mean < -0 ) { 
		if( Attr7_Max < 10.57 ) { return new Prediction("NULL", 20, 2); }
		if( Attr7_Max >= 10.57 ) { return new Prediction("NULL", 44, 0); }
	}
	}
	}
	if( Attr3_Min < 7.02 ) { 
	if( Attr5_Max >= 0.76 ) { 
	if( Attr3_Max >= 7.81 ) { 
		if( Attr3_Max < 9.79 ) { return new Prediction("smoking", 41, 9); }
		if( Attr3_Max >= 9.79 ) { return new Prediction("NULL", 155, 53); }
	}
	if( Attr3_Max < 7.81 ) { 
		if( Attr3_Max < 5.24 ) { return new Prediction("NULL", 165, 36); }
		if( Attr3_Max >= 5.24 ) { return new Prediction("NULL", 85, 5); }
	}
	}
	if( Attr5_Max < 0.76 ) { 
		if( Attr4_Min >= 0 ) { return new Prediction("NULL", 121, 0); }
	if( Attr4_Min < 0 ) { 
		if( Attr8_Max >= 5.63 ) { return new Prediction("NULL", 620, 96); }
		if( Attr8_Max < 5.63 ) { return new Prediction("NULL", 462, 15); }
	}
	}
	}
	}
	if( Attr2_Min < -6.93 ) { 
	if( Attr6_Min >= -2.35 ) { 
	if( Attr2_Mean < -1.08 ) { 
	if( Attr3_Mean < 7.22 ) { 
		if( Attr5_Min < -1.55 ) { return new Prediction("NULL", 1405, 419); }
		if( Attr5_Min >= -1.55 ) { return new Prediction("NULL", 1667, 345); }
	}
	if( Attr3_Mean >= 7.22 ) { 
		if( Attr3_Min >= 5.87 ) { return new Prediction("NULL", 113, 1); }
		if( Attr3_Min < 5.87 ) { return new Prediction("NULL", 351, 53); }
	}
	}
	if( Attr2_Mean >= -1.08 ) { 
	if( Attr1_Mean < -3.58 ) { 
		if( Attr5_Mean < -0.01 ) { return new Prediction("smoking", 52, 17); }
		if( Attr5_Mean >= -0.01 ) { return new Prediction("smoking", 69, 4); }
	}
	if( Attr1_Mean >= -3.58 ) { 
		if( Attr3_Mean >= 3.48 ) { return new Prediction("NULL", 48, 15); }
		if( Attr3_Mean < 3.48 ) { return new Prediction("NULL", 43, 0); }
	}
	}
	}
	if( Attr6_Min < -2.35 ) { 
	if( Attr3_Min < -6.89 ) { 
	if( Attr3_Max < 9.41 ) { 
		if( Attr4_Max >= 3.62 ) { return new Prediction("NULL", 557, 231); }
		if( Attr4_Max < 3.62 ) { return new Prediction("smoking", 382, 86); }
	}
	if( Attr3_Max >= 9.41 ) { 
		if( Attr2_Max >= 9.45 ) { return new Prediction("NULL", 817, 163); }
		if( Attr2_Max < 9.45 ) { return new Prediction("NULL", 1103, 345); }
	}
	}
	if( Attr3_Min >= -6.89 ) { 
	if( Attr6_Min < -4.54 ) { 
		if( Attr2_Max < 6.81 ) { return new Prediction("smoking", 867, 109); }
		if( Attr2_Max >= 6.81 ) { return new Prediction("NULL", 137, 61); }
	}
	if( Attr6_Min >= -4.54 ) { 
		if( Attr1_Min >= -6.84 ) { return new Prediction("NULL", 600, 164); }
		if( Attr1_Min < -6.84 ) { return new Prediction("smoking", 1568, 460); }
	}
	}
	}
	}
	}
	if( Attr2_Max < -3.98 ) { 
	if( Attr7_Min >= -77.52 ) { 
	if( Attr1_Min < 8.43 ) { 
	if( Attr8_Min < -4.23 ) { 
	if( Attr1_Max >= 9.13 ) { 
		if( Attr1_Mean < 3.74 ) { return new Prediction("NULL", 1, 0); }
		if( Attr1_Mean >= 3.74 ) { return new Prediction("smoking", 4, 0); }
	}
	if( Attr1_Max < 9.13 ) { 
		if( Attr6_Mean < 0 ) { return new Prediction("NULL", 394, 2); }
		if( Attr6_Mean >= 0 ) { return new Prediction("NULL", 164, 9); }
	}
	}
	if( Attr8_Min >= -4.23 ) { 
	if( Attr6_Max < 1.01 ) { 
		if( Attr5_Max < -0 ) { return new Prediction("NULL", 132, 0); }
		if( Attr5_Max >= -0 ) { return new Prediction("NULL", 1917, 181); }
	}
	if( Attr6_Max >= 1.01 ) { 
		if( Attr7_Mean >= 6.69 ) { return new Prediction("NULL", 66, 27); }
		if( Attr7_Mean < 6.69 ) { return new Prediction("NULL", 123, 23); }
	}
	}
	}
	if( Attr1_Min >= 8.43 ) { 
	if( Attr2_Mean < -4.65 ) { 
		if( Attr4_Mean >= -0.01 ) { return new Prediction("smoking", 14, 0); }
		if( Attr4_Mean < -0.01 ) { return new Prediction("NULL", 2, 0); }
	}
	if( Attr2_Mean >= -4.65 ) { 
		if( Attr1_Max < 8.74 ) { return new Prediction("smoking", 7, 0); }
	if( Attr1_Max >= 8.74 ) { 
		if( Attr7_Mean < -35.02 ) { return new Prediction("smoking", 2, 0); }
		if( Attr7_Mean >= -35.02 ) { return new Prediction("NULL", 28, 0); }
	}
	}
	}
	}
	if( Attr7_Min < -77.52 ) { 
		if( Attr2_Mean < -9.04 ) { return new Prediction("NULL", 7, 0); }
	if( Attr2_Mean >= -9.04 ) { 
	if( Attr9_Mean < -59.31 ) { 
		if( Attr1_Min >= -0.18 ) { return new Prediction("smoking", 20, 0); }
		if( Attr1_Min < -0.18 ) { return new Prediction("NULL", 2, 0); }
	}
	if( Attr9_Mean >= -59.31 ) { 
		if( Attr3_Mean >= -1.01 ) { return new Prediction("NULL", 4, 0); }
	if( Attr3_Mean < -1.01 ) { 
		if( Attr2_Min < -8.25 ) { return new Prediction("NULL", 3, 0); }
		if( Attr2_Min >= -8.25 ) { return new Prediction("smoking", 5, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree23() {
	if( Attr1_Min >= -6.65 ) { 
	if( Attr3_Max < -2.62 ) { 
	if( Attr9_Min >= -26.89 ) { 
	if( Attr7_Mean < 0.36 ) { 
		if( Attr9_Max >= 7.78 ) { return new Prediction("NULL", 321, 0); }
	if( Attr9_Max < 7.78 ) { 
		if( Attr7_Min >= -27.45 ) { return new Prediction("NULL", 76, 0); }
		if( Attr7_Min < -27.45 ) { return new Prediction("smoking", 4, 2); }
	}
	}
	if( Attr7_Mean >= 0.36 ) { 
	if( Attr5_Mean >= -0 ) { 
		if( Attr8_Max >= 0.27 ) { return new Prediction("NULL", 148, 0); }
		if( Attr8_Max < 0.27 ) { return new Prediction("NULL", 6, 1); }
	}
	if( Attr5_Mean < -0 ) { 
		if( Attr3_Max >= -3.36 ) { return new Prediction("smoking", 4, 1); }
		if( Attr3_Max < -3.36 ) { return new Prediction("NULL", 17, 1); }
	}
	}
	}
	if( Attr9_Min < -26.89 ) { 
	if( Attr1_Min >= -5.85 ) { 
	if( Attr8_Min >= 9.66 ) { 
		if( Attr6_Mean < -0 ) { return new Prediction("smoking", 5, 0); }
		if( Attr6_Mean >= -0 ) { return new Prediction("NULL", 12, 1); }
	}
	if( Attr8_Min < 9.66 ) { 
		if( Attr5_Max >= 0.01 ) { return new Prediction("NULL", 69, 0); }
		if( Attr5_Max < 0.01 ) { return new Prediction("NULL", 3, 1); }
	}
	}
		if( Attr1_Min < -5.85 ) { return new Prediction("smoking", 2, 0); }
	}
	}
	if( Attr3_Max >= -2.62 ) { 
	if( Attr3_Mean >= 8.88 ) { 
	if( Attr5_Max >= 0.68 ) { 
	if( Attr6_Max < 0.78 ) { 
		if( Attr8_Min < -13.51 ) { return new Prediction("NULL", 17, 0); }
		if( Attr8_Min >= -13.51 ) { return new Prediction("NULL", 21, 9); }
	}
	if( Attr6_Max >= 0.78 ) { 
		if( Attr2_Max < 1.11 ) { return new Prediction("NULL", 57, 0); }
		if( Attr2_Max >= 1.11 ) { return new Prediction("NULL", 54, 3); }
	}
	}
		if( Attr5_Max < 0.68 ) { return new Prediction("NULL", 1362, 0); }
	}
	if( Attr3_Mean < 8.88 ) { 
	if( Attr4_Min >= -1.18 ) { 
	if( Attr3_Min < 3.7 ) { 
		if( Attr6_Mean < 0 ) { return new Prediction("NULL", 1300, 127); }
		if( Attr6_Mean >= 0 ) { return new Prediction("NULL", 622, 140); }
	}
	if( Attr3_Min >= 3.7 ) { 
		if( Attr9_Min < -13.11 ) { return new Prediction("NULL", 884, 45); }
		if( Attr9_Min >= -13.11 ) { return new Prediction("NULL", 129, 0); }
	}
	}
	if( Attr4_Min < -1.18 ) { 
	if( Attr6_Max < 1.23 ) { 
		if( Attr2_Mean < -8.55 ) { return new Prediction("NULL", 157, 4); }
		if( Attr2_Mean >= -8.55 ) { return new Prediction("NULL", 1098, 173); }
	}
	if( Attr6_Max >= 1.23 ) { 
		if( Attr2_Max >= 3.94 ) { return new Prediction("NULL", 792, 135); }
		if( Attr2_Max < 3.94 ) { return new Prediction("NULL", 1887, 562); }
	}
	}
	}
	}
	}
	if( Attr1_Min < -6.65 ) { 
	if( Attr1_Max >= -2.17 ) { 
	if( Attr2_Max >= 5.85 ) { 
	if( Attr2_Max >= 10.94 ) { 
	if( Attr3_Min < -19.61 ) { 
		if( Attr7_Min >= -39.1 ) { return new Prediction("NULL", 88, 2); }
		if( Attr7_Min < -39.1 ) { return new Prediction("NULL", 40, 7); }
	}
	if( Attr3_Min >= -19.61 ) { 
		if( Attr8_Max < 15.44 ) { return new Prediction("NULL", 93, 38); }
		if( Attr8_Max >= 15.44 ) { return new Prediction("NULL", 595, 126); }
	}
	}
	if( Attr2_Max < 10.94 ) { 
	if( Attr1_Max >= 0.25 ) { 
		if( Attr3_Min >= -3.17 ) { return new Prediction("smoking", 173, 83); }
		if( Attr3_Min < -3.17 ) { return new Prediction("NULL", 731, 233); }
	}
	if( Attr1_Max < 0.25 ) { 
		if( Attr4_Max >= 2.57 ) { return new Prediction("smoking", 132, 16); }
		if( Attr4_Max < 2.57 ) { return new Prediction("NULL", 9, 0); }
	}
	}
	}
	if( Attr2_Max < 5.85 ) { 
	if( Attr6_Min >= -2.65 ) { 
	if( Attr4_Mean >= -0.09 ) { 
		if( Attr6_Min >= -2.21 ) { return new Prediction("NULL", 884, 314); }
		if( Attr6_Min < -2.21 ) { return new Prediction("smoking", 383, 174); }
	}
	if( Attr4_Mean < -0.09 ) { 
		if( Attr9_Min >= -75.2 ) { return new Prediction("NULL", 73, 3); }
		if( Attr9_Min < -75.2 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	if( Attr6_Min < -2.65 ) { 
	if( Attr7_Min < -37.8 ) { 
		if( Attr2_Min >= -14.6 ) { return new Prediction("smoking", 824, 62); }
		if( Attr2_Min < -14.6 ) { return new Prediction("smoking", 516, 184); }
	}
	if( Attr7_Min >= -37.8 ) { 
		if( Attr2_Max >= 1.89 ) { return new Prediction("NULL", 573, 286); }
		if( Attr2_Max < 1.89 ) { return new Prediction("smoking", 837, 215); }
	}
	}
	}
	}
	if( Attr1_Max < -2.17 ) { 
	if( Attr4_Min >= -2.2 ) { 
	if( Attr8_Mean < 62.83 ) { 
	if( Attr2_Max < -2.67 ) { 
		if( Attr1_Max >= -8.13 ) { return new Prediction("NULL", 114, 16); }
		if( Attr1_Max < -8.13 ) { return new Prediction("smoking", 21, 0); }
	}
	if( Attr2_Max >= -2.67 ) { 
		if( Attr6_Min < -0.02 ) { return new Prediction("NULL", 312, 20); }
		if( Attr6_Min >= -0.02 ) { return new Prediction("NULL", 99, 0); }
	}
	}
		if( Attr8_Mean >= 62.83 ) { return new Prediction("smoking", 10, 0); }
	}
	if( Attr4_Min < -2.2 ) { 
	if( Attr1_Min < -11.2 ) { 
	if( Attr5_Mean < -0.03 ) { 
		if( Attr6_Max >= 4.42 ) { return new Prediction("NULL", 4, 1); }
		if( Attr6_Max < 4.42 ) { return new Prediction("NULL", 51, 0); }
	}
	if( Attr5_Mean >= -0.03 ) { 
		if( Attr7_Mean >= 24.97 ) { return new Prediction("NULL", 76, 6); }
		if( Attr7_Mean < 24.97 ) { return new Prediction("smoking", 39, 19); }
	}
	}
	if( Attr1_Min >= -11.2 ) { 
	if( Attr2_Mean < -1.71 ) { 
		if( Attr8_Mean >= 5.12 ) { return new Prediction("NULL", 54, 7); }
		if( Attr8_Mean < 5.12 ) { return new Prediction("smoking", 13, 2); }
	}
	if( Attr2_Mean >= -1.71 ) { 
		if( Attr1_Mean < -9.04 ) { return new Prediction("NULL", 7, 2); }
		if( Attr1_Mean >= -9.04 ) { return new Prediction("smoking", 79, 6); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree24() {
	if( Attr3_Mean < 8.07 ) { 
	if( Attr5_Min >= -0.58 ) { 
	if( Attr1_Min < -7.33 ) { 
	if( Attr6_Min >= -1.55 ) { 
	if( Attr1_Max >= -0.67 ) { 
		if( Attr6_Min < -0.64 ) { return new Prediction("NULL", 29, 4); }
		if( Attr6_Min >= -0.64 ) { return new Prediction("smoking", 57, 22); }
	}
	if( Attr1_Max < -0.67 ) { 
		if( Attr9_Max >= -30.23 ) { return new Prediction("NULL", 344, 32); }
		if( Attr9_Max < -30.23 ) { return new Prediction("smoking", 6, 0); }
	}
	}
	if( Attr6_Min < -1.55 ) { 
	if( Attr2_Min >= -12.56 ) { 
		if( Attr4_Min < -2.11 ) { return new Prediction("smoking", 24, 2); }
		if( Attr4_Min >= -2.11 ) { return new Prediction("NULL", 17, 8); }
	}
		if( Attr2_Min < -12.56 ) { return new Prediction("smoking", 18, 0); }
	}
	}
	if( Attr1_Min >= -7.33 ) { 
	if( Attr6_Max >= 1.14 ) { 
	if( Attr4_Mean < 0.03 ) { 
		if( Attr3_Mean >= -0.26 ) { return new Prediction("NULL", 59, 16); }
		if( Attr3_Mean < -0.26 ) { return new Prediction("NULL", 22, 0); }
	}
	if( Attr4_Mean >= 0.03 ) { 
		if( Attr2_Mean < -2.1 ) { return new Prediction("smoking", 20, 4); }
		if( Attr2_Mean >= -2.1 ) { return new Prediction("NULL", 4, 0); }
	}
	}
	if( Attr6_Max < 1.14 ) { 
	if( Attr4_Mean < 0.02 ) { 
		if( Attr5_Mean >= 0 ) { return new Prediction("NULL", 1104, 159); }
		if( Attr5_Mean < 0 ) { return new Prediction("NULL", 1864, 109); }
	}
	if( Attr4_Mean >= 0.02 ) { 
		if( Attr2_Min < -10.06 ) { return new Prediction("NULL", 35, 2); }
		if( Attr2_Min >= -10.06 ) { return new Prediction("NULL", 251, 0); }
	}
	}
	}
	}
	if( Attr5_Min < -0.58 ) { 
	if( Attr3_Max >= 12.5 ) { 
	if( Attr2_Max < 19.87 ) { 
	if( Attr4_Mean >= -0.14 ) { 
		if( Attr2_Max >= 19.79 ) { return new Prediction("smoking", 18, 3); }
		if( Attr2_Max < 19.79 ) { return new Prediction("NULL", 1954, 533); }
	}
	if( Attr4_Mean < -0.14 ) { 
		if( Attr5_Min >= -7.76 ) { return new Prediction("NULL", 112, 14); }
		if( Attr5_Min < -7.76 ) { return new Prediction("NULL", 23, 0); }
	}
	}
	if( Attr2_Max >= 19.87 ) { 
	if( Attr5_Min < -4.33 ) { 
		if( Attr5_Max >= 2 ) { return new Prediction("NULL", 67, 4); }
		if( Attr5_Max < 2 ) { return new Prediction("smoking", 3, 0); }
	}
		if( Attr5_Min >= -4.33 ) { return new Prediction("NULL", 64, 0); }
	}
	}
	if( Attr3_Max < 12.5 ) { 
	if( Attr8_Max >= 37.47 ) { 
	if( Attr1_Max >= 6.65 ) { 
		if( Attr4_Max < 4.06 ) { return new Prediction("smoking", 1509, 464); }
		if( Attr4_Max >= 4.06 ) { return new Prediction("NULL", 1131, 467); }
	}
	if( Attr1_Max < 6.65 ) { 
		if( Attr1_Min < -6.73 ) { return new Prediction("NULL", 946, 466); }
		if( Attr1_Min >= -6.73 ) { return new Prediction("NULL", 342, 35); }
	}
	}
	if( Attr8_Max < 37.47 ) { 
	if( Attr6_Max < 2.21 ) { 
		if( Attr5_Mean < -0.33 ) { return new Prediction("NULL", 179, 0); }
		if( Attr5_Mean >= -0.33 ) { return new Prediction("NULL", 1919, 486); }
	}
	if( Attr6_Max >= 2.21 ) { 
		if( Attr2_Mean < -6.25 ) { return new Prediction("NULL", 368, 104); }
		if( Attr2_Mean >= -6.25 ) { return new Prediction("smoking", 1292, 558); }
	}
	}
	}
	}
	}
	if( Attr3_Mean >= 8.07 ) { 
	if( Attr4_Min < -0.63 ) { 
	if( Attr4_Max >= 1.36 ) { 
	if( Attr9_Max >= -46.16 ) { 
	if( Attr8_Min < -11.33 ) { 
		if( Attr5_Max < 1.29 ) { return new Prediction("NULL", 63, 1); }
		if( Attr5_Max >= 1.29 ) { return new Prediction("NULL", 73, 10); }
	}
	if( Attr8_Min >= -11.33 ) { 
		if( Attr8_Mean < 1.7 ) { return new Prediction("NULL", 25, 0); }
		if( Attr8_Mean >= 1.7 ) { return new Prediction("NULL", 143, 39); }
	}
	}
	if( Attr9_Max < -46.16 ) { 
		if( Attr2_Max >= 0.64 ) { return new Prediction("smoking", 11, 0); }
		if( Attr2_Max < 0.64 ) { return new Prediction("NULL", 5, 0); }
	}
	}
	if( Attr4_Max < 1.36 ) { 
	if( Attr4_Mean >= -0.01 ) { 
	if( Attr1_Mean >= -0.5 ) { 
		if( Attr9_Max >= -28.56 ) { return new Prediction("NULL", 73, 3); }
		if( Attr9_Max < -28.56 ) { return new Prediction("NULL", 16, 4); }
	}
		if( Attr1_Mean < -0.5 ) { return new Prediction("NULL", 101, 0); }
	}
	if( Attr4_Mean < -0.01 ) { 
	if( Attr9_Mean >= -25.33 ) { 
		if( Attr5_Min < -0.85 ) { return new Prediction("NULL", 13, 1); }
		if( Attr5_Min >= -0.85 ) { return new Prediction("smoking", 10, 2); }
	}
		if( Attr9_Mean < -25.33 ) { return new Prediction("NULL", 19, 0); }
	}
	}
	}
	if( Attr4_Min >= -0.63 ) { 
	if( Attr3_Min < 8.86 ) { 
		if( Attr8_Mean < 12.4 ) { return new Prediction("NULL", 234, 0); }
	if( Attr8_Mean >= 12.4 ) { 
	if( Attr8_Max >= 23.79 ) { 
		if( Attr1_Max >= 1.62 ) { return new Prediction("NULL", 21, 2); }
		if( Attr1_Max < 1.62 ) { return new Prediction("NULL", 171, 0); }
	}
	if( Attr8_Max < 23.79 ) { 
		if( Attr7_Mean >= -23.26 ) { return new Prediction("smoking", 11, 2); }
		if( Attr7_Mean < -23.26 ) { return new Prediction("NULL", 7, 0); }
	}
	}
	}
		if( Attr3_Min >= 8.86 ) { return new Prediction("NULL", 1101, 0); }
	}
	}
return null;
}
private Prediction runTree25() {
	if( Attr5_Min >= -0.69 ) { 
	if( Attr2_Min >= -1.6 ) { 
	if( Attr5_Min >= -0.02 ) { 
	if( Attr2_Mean < -0.55 ) { 
		if( Attr2_Mean < -0.57 ) { return new Prediction("NULL", 38, 0); }
		if( Attr2_Mean >= -0.57 ) { return new Prediction("smoking", 2, 0); }
	}
		if( Attr2_Mean >= -0.55 ) { return new Prediction("NULL", 1179, 0); }
	}
	if( Attr5_Min < -0.02 ) { 
	if( Attr1_Min < 9.44 ) { 
	if( Attr9_Mean >= -5.92 ) { 
		if( Attr9_Mean < -4.44 ) { return new Prediction("smoking", 4, 2); }
		if( Attr9_Mean >= -4.44 ) { return new Prediction("NULL", 261, 2); }
	}
		if( Attr9_Mean < -5.92 ) { return new Prediction("NULL", 206, 0); }
	}
	if( Attr1_Min >= 9.44 ) { 
	if( Attr7_Max >= -27.43 ) { 
		if( Attr2_Max < 0.45 ) { return new Prediction("smoking", 4, 0); }
		if( Attr2_Max >= 0.45 ) { return new Prediction("NULL", 5, 1); }
	}
		if( Attr7_Max < -27.43 ) { return new Prediction("NULL", 24, 0); }
	}
	}
	}
	if( Attr2_Min < -1.6 ) { 
	if( Attr2_Min < -10.71 ) { 
	if( Attr5_Max >= 0.01 ) { 
	if( Attr7_Max < 29.79 ) { 
		if( Attr6_Mean < 0 ) { return new Prediction("NULL", 168, 18); }
		if( Attr6_Mean >= 0 ) { return new Prediction("NULL", 107, 31); }
	}
	if( Attr7_Max >= 29.79 ) { 
		if( Attr9_Mean >= 14.46 ) { return new Prediction("smoking", 26, 6); }
		if( Attr9_Mean < 14.46 ) { return new Prediction("NULL", 118, 31); }
	}
	}
	if( Attr5_Max < 0.01 ) { 
	if( Attr7_Min < 30.92 ) { 
		if( Attr2_Max < -14.27 ) { return new Prediction("NULL", 1, 0); }
		if( Attr2_Max >= -14.27 ) { return new Prediction("smoking", 17, 1); }
	}
	if( Attr7_Min >= 30.92 ) { 
		if( Attr3_Min < -0.94 ) { return new Prediction("smoking", 1, 0); }
		if( Attr3_Min >= -0.94 ) { return new Prediction("NULL", 4, 0); }
	}
	}
	}
	if( Attr2_Min >= -10.71 ) { 
	if( Attr1_Max < 8.59 ) { 
	if( Attr9_Max < -53.45 ) { 
		if( Attr1_Min >= 2.82 ) { return new Prediction("smoking", 18, 0); }
		if( Attr1_Min < 2.82 ) { return new Prediction("NULL", 33, 1); }
	}
	if( Attr9_Max >= -53.45 ) { 
		if( Attr1_Min < -7.62 ) { return new Prediction("NULL", 251, 66); }
		if( Attr1_Min >= -7.62 ) { return new Prediction("NULL", 2882, 174); }
	}
	}
	if( Attr1_Max >= 8.59 ) { 
	if( Attr1_Mean >= 6.62 ) { 
		if( Attr4_Max < 0 ) { return new Prediction("smoking", 45, 21); }
		if( Attr4_Max >= 0 ) { return new Prediction("NULL", 321, 45); }
	}
	if( Attr1_Mean < 6.62 ) { 
		if( Attr6_Max < 0.01 ) { return new Prediction("NULL", 8, 0); }
		if( Attr6_Max >= 0.01 ) { return new Prediction("smoking", 55, 26); }
	}
	}
	}
	}
	}
	if( Attr5_Min < -0.69 ) { 
	if( Attr1_Min < -6.68 ) { 
	if( Attr2_Min >= -15.64 ) { 
	if( Attr3_Mean < 6.92 ) { 
	if( Attr6_Max < 1.68 ) { 
		if( Attr2_Mean < -0.77 ) { return new Prediction("NULL", 639, 185); }
		if( Attr2_Mean >= -0.77 ) { return new Prediction("smoking", 109, 34); }
	}
	if( Attr6_Max >= 1.68 ) { 
		if( Attr6_Min < -2.63 ) { return new Prediction("smoking", 2175, 499); }
		if( Attr6_Min >= -2.63 ) { return new Prediction("NULL", 737, 358); }
	}
	}
	if( Attr3_Mean >= 6.92 ) { 
	if( Attr2_Max < 6.34 ) { 
		if( Attr1_Mean >= 0.13 ) { return new Prediction("NULL", 7, 0); }
		if( Attr1_Mean < 0.13 ) { return new Prediction("NULL", 110, 50); }
	}
	if( Attr2_Max >= 6.34 ) { 
		if( Attr1_Min >= -9.89 ) { return new Prediction("NULL", 38, 11); }
		if( Attr1_Min < -9.89 ) { return new Prediction("NULL", 56, 1); }
	}
	}
	}
	if( Attr2_Min < -15.64 ) { 
	if( Attr7_Min >= -37.56 ) { 
	if( Attr3_Max < 14.17 ) { 
		if( Attr8_Mean >= 0.45 ) { return new Prediction("NULL", 693, 216); }
		if( Attr8_Mean < 0.45 ) { return new Prediction("smoking", 177, 70); }
	}
	if( Attr3_Max >= 14.17 ) { 
		if( Attr1_Min >= -20.55 ) { return new Prediction("NULL", 530, 123); }
		if( Attr1_Min < -20.55 ) { return new Prediction("NULL", 82, 0); }
	}
	}
	if( Attr7_Min < -37.56 ) { 
	if( Attr3_Min >= -14.54 ) { 
		if( Attr6_Min < -3.6 ) { return new Prediction("smoking", 441, 149); }
		if( Attr6_Min >= -3.6 ) { return new Prediction("NULL", 213, 66); }
	}
	if( Attr3_Min < -14.54 ) { 
		if( Attr4_Min < -8.88 ) { return new Prediction("NULL", 93, 28); }
		if( Attr4_Min >= -8.88 ) { return new Prediction("NULL", 72, 8); }
	}
	}
	}
	}
	if( Attr1_Min >= -6.68 ) { 
	if( Attr9_Min >= -1.48 ) { 
	if( Attr3_Mean < -2.81 ) { 
	if( Attr4_Min >= -0.61 ) { 
		if( Attr1_Mean < 2.2 ) { return new Prediction("smoking", 2, 0); }
		if( Attr1_Mean >= 2.2 ) { return new Prediction("NULL", 2, 0); }
	}
	if( Attr4_Min < -0.61 ) { 
		if( Attr4_Min < -3.71 ) { return new Prediction("NULL", 15, 2); }
		if( Attr4_Min >= -3.71 ) { return new Prediction("NULL", 113, 0); }
	}
	}
	if( Attr3_Mean >= -2.81 ) { 
	if( Attr6_Min >= -2.19 ) { 
		if( Attr8_Min >= 63.79 ) { return new Prediction("smoking", 2, 0); }
		if( Attr8_Min < 63.79 ) { return new Prediction("NULL", 159, 9); }
	}
	if( Attr6_Min < -2.19 ) { 
		if( Attr4_Max < 4.28 ) { return new Prediction("NULL", 45, 10); }
		if( Attr4_Max >= 4.28 ) { return new Prediction("smoking", 16, 3); }
	}
	}
	}
	if( Attr9_Min < -1.48 ) { 
	if( Attr1_Mean >= 9.76 ) { 
	if( Attr5_Mean < -0.17 ) { 
		if( Attr2_Mean >= -4.08 ) { return new Prediction("smoking", 4, 1); }
		if( Attr2_Mean < -4.08 ) { return new Prediction("NULL", 8, 0); }
	}
	if( Attr5_Mean >= -0.17 ) { 
		if( Attr3_Mean >= -1.33 ) { return new Prediction("smoking", 33, 3); }
		if( Attr3_Mean < -1.33 ) { return new Prediction("NULL", 4, 1); }
	}
	}
	if( Attr1_Mean < 9.76 ) { 
	if( Attr6_Mean >= -0.13 ) { 
		if( Attr1_Max < 5.42 ) { return new Prediction("NULL", 703, 97); }
		if( Attr1_Max >= 5.42 ) { return new Prediction("NULL", 2654, 668); }
	}
	if( Attr6_Mean < -0.13 ) { 
		if( Attr6_Mean >= -0.24 ) { return new Prediction("NULL", 72, 5); }
		if( Attr6_Mean < -0.24 ) { return new Prediction("NULL", 96, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree26() {
	if( Attr1_Min >= -6.66 ) { 
	if( Attr6_Max < 1.01 ) { 
	if( Attr6_Max < 0.01 ) { 
	if( Attr2_Mean < -0.55 ) { 
	if( Attr1_Max >= 8.87 ) { 
		if( Attr8_Min < -48.46 ) { return new Prediction("smoking", 9, 0); }
		if( Attr8_Min >= -48.46 ) { return new Prediction("NULL", 67, 11); }
	}
	if( Attr1_Max < 8.87 ) { 
		if( Attr7_Mean >= -37.76 ) { return new Prediction("NULL", 320, 5); }
		if( Attr7_Mean < -37.76 ) { return new Prediction("NULL", 15, 3); }
	}
	}
		if( Attr2_Mean >= -0.55 ) { return new Prediction("NULL", 895, 0); }
	}
	if( Attr6_Max >= 0.01 ) { 
	if( Attr8_Min < -10.43 ) { 
	if( Attr3_Mean < 7.9 ) { 
		if( Attr1_Max < 8.94 ) { return new Prediction("NULL", 517, 16); }
		if( Attr1_Max >= 8.94 ) { return new Prediction("NULL", 208, 24); }
	}
	if( Attr3_Mean >= 7.9 ) { 
		if( Attr4_Mean >= -0 ) { return new Prediction("NULL", 275, 0); }
		if( Attr4_Mean < -0 ) { return new Prediction("NULL", 83, 1); }
	}
	}
	if( Attr8_Min >= -10.43 ) { 
	if( Attr7_Min >= -26.71 ) { 
		if( Attr3_Min >= 8.47 ) { return new Prediction("NULL", 229, 0); }
		if( Attr3_Min < 8.47 ) { return new Prediction("NULL", 2184, 175); }
	}
	if( Attr7_Min < -26.71 ) { 
		if( Attr6_Min < -0.54 ) { return new Prediction("NULL", 312, 76); }
		if( Attr6_Min >= -0.54 ) { return new Prediction("NULL", 652, 61); }
	}
	}
	}
	}
	if( Attr6_Max >= 1.01 ) { 
	if( Attr4_Mean >= -0.09 ) { 
	if( Attr1_Mean >= 10.71 ) { 
		if( Attr6_Max < 4.7 ) { return new Prediction("smoking", 27, 0); }
	if( Attr6_Max >= 4.7 ) { 
		if( Attr5_Min >= -1.85 ) { return new Prediction("NULL", 5, 0); }
		if( Attr5_Min < -1.85 ) { return new Prediction("smoking", 5, 1); }
	}
	}
	if( Attr1_Mean < 10.71 ) { 
	if( Attr9_Min < -38.8 ) { 
		if( Attr5_Min < -0.66 ) { return new Prediction("NULL", 881, 155); }
		if( Attr5_Min >= -0.66 ) { return new Prediction("NULL", 35, 16); }
	}
	if( Attr9_Min >= -38.8 ) { 
		if( Attr8_Max >= 6.09 ) { return new Prediction("NULL", 1982, 578); }
		if( Attr8_Max < 6.09 ) { return new Prediction("NULL", 139, 18); }
	}
	}
	}
	if( Attr4_Mean < -0.09 ) { 
	if( Attr3_Min < -6.92 ) { 
		if( Attr2_Min >= -7.99 ) { return new Prediction("smoking", 2, 0); }
	if( Attr2_Min < -7.99 ) { 
		if( Attr3_Mean < -2.2 ) { return new Prediction("NULL", 40, 0); }
		if( Attr3_Mean >= -2.2 ) { return new Prediction("NULL", 91, 17); }
	}
	}
		if( Attr3_Min >= -6.92 ) { return new Prediction("NULL", 105, 0); }
	}
	}
	}
	if( Attr1_Min < -6.66 ) { 
	if( Attr7_Min >= -37.56 ) { 
	if( Attr6_Min < -2.34 ) { 
	if( Attr5_Max < 2.83 ) { 
	if( Attr3_Min < -7.58 ) { 
		if( Attr4_Max < 3.28 ) { return new Prediction("smoking", 88, 24); }
		if( Attr4_Max >= 3.28 ) { return new Prediction("NULL", 296, 103); }
	}
	if( Attr3_Min >= -7.58 ) { 
		if( Attr3_Max < 11.14 ) { return new Prediction("smoking", 923, 200); }
		if( Attr3_Max >= 11.14 ) { return new Prediction("smoking", 331, 158); }
	}
	}
	if( Attr5_Max >= 2.83 ) { 
	if( Attr2_Mean < -6.24 ) { 
		if( Attr4_Min < -2.88 ) { return new Prediction("NULL", 300, 48); }
		if( Attr4_Min >= -2.88 ) { return new Prediction("smoking", 14, 2); }
	}
	if( Attr2_Mean >= -6.24 ) { 
		if( Attr4_Min < -3.65 ) { return new Prediction("NULL", 738, 246); }
		if( Attr4_Min >= -3.65 ) { return new Prediction("smoking", 151, 42); }
	}
	}
	}
	if( Attr6_Min >= -2.34 ) { 
	if( Attr6_Max < 0.23 ) { 
	if( Attr6_Mean < 0 ) { 
		if( Attr4_Mean < -0.07 ) { return new Prediction("NULL", 5, 1); }
		if( Attr4_Mean >= -0.07 ) { return new Prediction("NULL", 199, 0); }
	}
	if( Attr6_Mean >= 0 ) { 
		if( Attr2_Mean < -3.11 ) { return new Prediction("NULL", 18, 7); }
		if( Attr2_Mean >= -3.11 ) { return new Prediction("NULL", 38, 2); }
	}
	}
	if( Attr6_Max >= 0.23 ) { 
	if( Attr2_Mean >= -0.72 ) { 
		if( Attr1_Max >= 1.57 ) { return new Prediction("NULL", 35, 5); }
		if( Attr1_Max < 1.57 ) { return new Prediction("smoking", 109, 35); }
	}
	if( Attr2_Mean < -0.72 ) { 
		if( Attr1_Mean < -3.15 ) { return new Prediction("NULL", 787, 133); }
		if( Attr1_Mean >= -3.15 ) { return new Prediction("NULL", 514, 170); }
	}
	}
	}
	}
	if( Attr7_Min < -37.56 ) { 
	if( Attr5_Min < -4.44 ) { 
	if( Attr4_Max < 3.7 ) { 
		if( Attr4_Min < -9.45 ) { return new Prediction("NULL", 3, 0); }
	if( Attr4_Min >= -9.45 ) { 
		if( Attr6_Max >= 3.3 ) { return new Prediction("smoking", 29, 6); }
		if( Attr6_Max < 3.3 ) { return new Prediction("NULL", 3, 0); }
	}
	}
	if( Attr4_Max >= 3.7 ) { 
	if( Attr3_Min < -10.66 ) { 
		if( Attr9_Mean < -19.05 ) { return new Prediction("NULL", 32, 0); }
		if( Attr9_Mean >= -19.05 ) { return new Prediction("NULL", 155, 39); }
	}
	if( Attr3_Min >= -10.66 ) { 
		if( Attr6_Mean < 0.19 ) { return new Prediction("NULL", 80, 33); }
		if( Attr6_Mean >= 0.19 ) { return new Prediction("smoking", 9, 0); }
	}
	}
	}
	if( Attr5_Min >= -4.44 ) { 
	if( Attr3_Min >= -7.56 ) { 
	if( Attr1_Max >= 6.49 ) { 
		if( Attr2_Max >= 4.93 ) { return new Prediction("smoking", 144, 60); }
		if( Attr2_Max < 4.93 ) { return new Prediction("smoking", 875, 82); }
	}
	if( Attr1_Max < 6.49 ) { 
		if( Attr1_Max >= -3.97 ) { return new Prediction("smoking", 210, 73); }
		if( Attr1_Max < -3.97 ) { return new Prediction("NULL", 49, 12); }
	}
	}
	if( Attr3_Min < -7.56 ) { 
	if( Attr4_Max >= 4.82 ) { 
		if( Attr9_Mean < 7.78 ) { return new Prediction("NULL", 254, 83); }
		if( Attr9_Mean >= 7.78 ) { return new Prediction("smoking", 65, 24); }
	}
	if( Attr4_Max < 4.82 ) { 
		if( Attr2_Max >= 7.26 ) { return new Prediction("NULL", 45, 12); }
		if( Attr2_Max < 7.26 ) { return new Prediction("smoking", 301, 81); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree27() {
	if( Attr1_Min >= -6.38 ) { 
	if( Attr6_Max < 1 ) { 
	if( Attr1_Mean < 0.41 ) { 
	if( Attr6_Min < -0.02 ) { 
	if( Attr2_Mean >= -5.58 ) { 
		if( Attr1_Max < 2.43 ) { return new Prediction("NULL", 520, 8); }
		if( Attr1_Max >= 2.43 ) { return new Prediction("NULL", 64, 10); }
	}
	if( Attr2_Mean < -5.58 ) { 
		if( Attr6_Min < -2.15 ) { return new Prediction("smoking", 13, 6); }
		if( Attr6_Min >= -2.15 ) { return new Prediction("NULL", 701, 60); }
	}
	}
	if( Attr6_Min >= -0.02 ) { 
	if( Attr3_Min < 6.98 ) { 
		if( Attr9_Mean < 38.89 ) { return new Prediction("NULL", 149, 5); }
		if( Attr9_Mean >= 38.89 ) { return new Prediction("smoking", 2, 0); }
	}
		if( Attr3_Min >= 6.98 ) { return new Prediction("NULL", 1052, 0); }
	}
	}
	if( Attr1_Mean >= 0.41 ) { 
	if( Attr2_Mean >= -1.56 ) { 
	if( Attr4_Min < -0.27 ) { 
		if( Attr1_Mean >= 4.82 ) { return new Prediction("NULL", 154, 2); }
		if( Attr1_Mean < 4.82 ) { return new Prediction("NULL", 58, 11); }
	}
	if( Attr4_Min >= -0.27 ) { 
		if( Attr1_Max >= 9.85 ) { return new Prediction("NULL", 70, 4); }
		if( Attr1_Max < 9.85 ) { return new Prediction("NULL", 317, 0); }
	}
	}
	if( Attr2_Mean < -1.56 ) { 
	if( Attr3_Min < -3.64 ) { 
		if( Attr4_Max >= 2.25 ) { return new Prediction("NULL", 168, 21); }
		if( Attr4_Max < 2.25 ) { return new Prediction("NULL", 692, 28); }
	}
	if( Attr3_Min >= -3.64 ) { 
		if( Attr1_Mean >= 8.3 ) { return new Prediction("NULL", 312, 85); }
		if( Attr1_Mean < 8.3 ) { return new Prediction("NULL", 1485, 162); }
	}
	}
	}
	}
	if( Attr6_Max >= 1 ) { 
	if( Attr1_Min >= -0.29 ) { 
	if( Attr1_Mean >= 10.71 ) { 
		if( Attr2_Mean < -4.25 ) { return new Prediction("NULL", 6, 0); }
	if( Attr2_Mean >= -4.25 ) { 
		if( Attr9_Min < -31.38 ) { return new Prediction("NULL", 6, 2); }
		if( Attr9_Min >= -31.38 ) { return new Prediction("smoking", 16, 0); }
	}
	}
	if( Attr1_Mean < 10.71 ) { 
	if( Attr4_Mean < 0 ) { 
		if( Attr5_Mean < -0.01 ) { return new Prediction("NULL", 179, 38); }
		if( Attr5_Mean >= -0.01 ) { return new Prediction("NULL", 437, 29); }
	}
	if( Attr4_Mean >= 0 ) { 
		if( Attr9_Max < 11.15 ) { return new Prediction("NULL", 154, 59); }
		if( Attr9_Max >= 11.15 ) { return new Prediction("NULL", 262, 36); }
	}
	}
	}
	if( Attr1_Min < -0.29 ) { 
	if( Attr2_Mean < -3.19 ) { 
	if( Attr3_Min < 5 ) { 
		if( Attr2_Mean >= -3.23 ) { return new Prediction("smoking", 9, 0); }
		if( Attr2_Mean < -3.23 ) { return new Prediction("NULL", 1625, 471); }
	}
	if( Attr3_Min >= 5 ) { 
		if( Attr2_Mean >= -4.19 ) { return new Prediction("NULL", 76, 0); }
		if( Attr2_Mean < -4.19 ) { return new Prediction("NULL", 37, 5); }
	}
	}
	if( Attr2_Mean >= -3.19 ) { 
	if( Attr2_Min >= 3.15 ) { 
		if( Attr6_Mean >= 0.01 ) { return new Prediction("smoking", 7, 0); }
		if( Attr6_Mean < 0.01 ) { return new Prediction("NULL", 6, 2); }
	}
	if( Attr2_Min < 3.15 ) { 
		if( Attr5_Max >= 3.18 ) { return new Prediction("NULL", 60, 0); }
		if( Attr5_Max < 3.18 ) { return new Prediction("NULL", 289, 46); }
	}
	}
	}
	}
	}
	if( Attr1_Min < -6.38 ) { 
	if( Attr6_Max < 1.64 ) { 
	if( Attr1_Mean >= -1.82 ) { 
	if( Attr2_Min < -16.01 ) { 
		if( Attr3_Mean >= 4.79 ) { return new Prediction("NULL", 22, 0); }
	if( Attr3_Mean < 4.79 ) { 
		if( Attr6_Max < 1.11 ) { return new Prediction("smoking", 25, 10); }
		if( Attr6_Max >= 1.11 ) { return new Prediction("NULL", 24, 2); }
	}
	}
	if( Attr2_Min >= -16.01 ) { 
	if( Attr3_Max >= 8.17 ) { 
		if( Attr6_Min < -1.73 ) { return new Prediction("NULL", 74, 35); }
		if( Attr6_Min >= -1.73 ) { return new Prediction("NULL", 36, 4); }
	}
	if( Attr3_Max < 8.17 ) { 
		if( Attr3_Max < 3.02 ) { return new Prediction("NULL", 26, 7); }
		if( Attr3_Max >= 3.02 ) { return new Prediction("smoking", 143, 22); }
	}
	}
	}
	if( Attr1_Mean < -1.82 ) { 
	if( Attr5_Min >= -0.08 ) { 
		if( Attr2_Mean >= -2.88 ) { return new Prediction("NULL", 166, 0); }
	if( Attr2_Mean < -2.88 ) { 
		if( Attr4_Min < -0.02 ) { return new Prediction("NULL", 27, 0); }
		if( Attr4_Min >= -0.02 ) { return new Prediction("NULL", 35, 14); }
	}
	}
	if( Attr5_Min < -0.08 ) { 
	if( Attr2_Mean >= -1.45 ) { 
		if( Attr4_Min < -2.21 ) { return new Prediction("smoking", 127, 32); }
		if( Attr4_Min >= -2.21 ) { return new Prediction("NULL", 89, 20); }
	}
	if( Attr2_Mean < -1.45 ) { 
		if( Attr6_Min < -1.78 ) { return new Prediction("NULL", 209, 58); }
		if( Attr6_Min >= -1.78 ) { return new Prediction("NULL", 568, 71); }
	}
	}
	}
	}
	if( Attr6_Max >= 1.64 ) { 
	if( Attr3_Min < -6.99 ) { 
	if( Attr2_Max < 1.33 ) { 
	if( Attr3_Max >= 8.9 ) { 
		if( Attr2_Min < -14.99 ) { return new Prediction("NULL", 85, 11); }
		if( Attr2_Min >= -14.99 ) { return new Prediction("NULL", 65, 23); }
	}
	if( Attr3_Max < 8.9 ) { 
		if( Attr7_Min >= -38.46 ) { return new Prediction("smoking", 224, 80); }
		if( Attr7_Min < -38.46 ) { return new Prediction("smoking", 188, 16); }
	}
	}
	if( Attr2_Max >= 1.33 ) { 
	if( Attr3_Max >= 9.38 ) { 
		if( Attr3_Max < 24.59 ) { return new Prediction("NULL", 1460, 405); }
		if( Attr3_Max >= 24.59 ) { return new Prediction("NULL", 53, 2); }
	}
	if( Attr3_Max < 9.38 ) { 
		if( Attr4_Mean >= -0.15 ) { return new Prediction("smoking", 351, 167); }
		if( Attr4_Mean < -0.15 ) { return new Prediction("NULL", 25, 0); }
	}
	}
	}
	if( Attr3_Min >= -6.99 ) { 
	if( Attr3_Max >= 12.63 ) { 
	if( Attr3_Max >= 15.59 ) { 
		if( Attr8_Mean < -22.55 ) { return new Prediction("smoking", 17, 5); }
		if( Attr8_Mean >= -22.55 ) { return new Prediction("NULL", 228, 39); }
	}
	if( Attr3_Max < 15.59 ) { 
		if( Attr6_Min < -3.15 ) { return new Prediction("smoking", 167, 79); }
		if( Attr6_Min >= -3.15 ) { return new Prediction("NULL", 150, 50); }
	}
	}
	if( Attr3_Max < 12.63 ) { 
	if( Attr1_Mean < -8.07 ) { 
		if( Attr3_Mean < 3.4 ) { return new Prediction("NULL", 142, 45); }
		if( Attr3_Mean >= 3.4 ) { return new Prediction("smoking", 12, 1); }
	}
	if( Attr1_Mean >= -8.07 ) { 
		if( Attr6_Max < 4.02 ) { return new Prediction("smoking", 1329, 353); }
		if( Attr6_Max >= 4.02 ) { return new Prediction("smoking", 885, 104); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree28() {
	if( Attr3_Mean >= 8.08 ) { 
	if( Attr4_Min < -0.63 ) { 
	if( Attr1_Min < -7.17 ) { 
	if( Attr3_Min < 1.73 ) { 
	if( Attr6_Mean >= -0.01 ) { 
		if( Attr4_Mean >= 0.04 ) { return new Prediction("smoking", 4, 0); }
		if( Attr4_Mean < 0.04 ) { return new Prediction("NULL", 24, 3); }
	}
		if( Attr6_Mean < -0.01 ) { return new Prediction("NULL", 26, 0); }
	}
	if( Attr3_Min >= 1.73 ) { 
	if( Attr3_Mean < 9.37 ) { 
		if( Attr6_Min >= -3.06 ) { return new Prediction("smoking", 28, 6); }
		if( Attr6_Min < -3.06 ) { return new Prediction("NULL", 5, 0); }
	}
		if( Attr3_Mean >= 9.37 ) { return new Prediction("NULL", 4, 0); }
	}
	}
	if( Attr1_Min >= -7.17 ) { 
	if( Attr7_Min < 4.91 ) { 
	if( Attr5_Min >= -0.68 ) { 
		if( Attr1_Min >= 2.01 ) { return new Prediction("smoking", 1, 0); }
		if( Attr1_Min < 2.01 ) { return new Prediction("NULL", 105, 2); }
	}
	if( Attr5_Min < -0.68 ) { 
		if( Attr5_Min >= -1.96 ) { return new Prediction("NULL", 173, 36); }
		if( Attr5_Min < -1.96 ) { return new Prediction("NULL", 48, 0); }
	}
	}
		if( Attr7_Min >= 4.91 ) { return new Prediction("NULL", 131, 0); }
	}
	}
	if( Attr4_Min >= -0.63 ) { 
		if( Attr3_Mean >= 8.85 ) { return new Prediction("NULL", 1258, 0); }
	if( Attr3_Mean < 8.85 ) { 
	if( Attr1_Max >= 0.33 ) { 
	if( Attr8_Mean >= 12.05 ) { 
		if( Attr9_Max >= -28.11 ) { return new Prediction("NULL", 52, 2); }
		if( Attr9_Max < -28.11 ) { return new Prediction("smoking", 4, 1); }
	}
		if( Attr8_Mean < 12.05 ) { return new Prediction("NULL", 49, 0); }
	}
		if( Attr1_Max < 0.33 ) { return new Prediction("NULL", 161, 0); }
	}
	}
	}
	if( Attr3_Mean < 8.08 ) { 
	if( Attr4_Min >= -1.31 ) { 
	if( Attr5_Max < 1.07 ) { 
	if( Attr3_Mean >= -2.4 ) { 
	if( Attr6_Max < 1.55 ) { 
		if( Attr3_Min >= 2.41 ) { return new Prediction("NULL", 1002, 62); }
		if( Attr3_Min < 2.41 ) { return new Prediction("NULL", 1625, 214); }
	}
	if( Attr6_Max >= 1.55 ) { 
		if( Attr9_Mean >= -9.77 ) { return new Prediction("smoking", 40, 9); }
		if( Attr9_Mean < -9.77 ) { return new Prediction("NULL", 31, 1); }
	}
	}
	if( Attr3_Mean < -2.4 ) { 
	if( Attr3_Max < 4.33 ) { 
		if( Attr2_Max >= -9.76 ) { return new Prediction("NULL", 1011, 22); }
		if( Attr2_Max < -9.76 ) { return new Prediction("smoking", 7, 0); }
	}
	if( Attr3_Max >= 4.33 ) { 
		if( Attr1_Mean < 5.9 ) { return new Prediction("NULL", 14, 2); }
		if( Attr1_Mean >= 5.9 ) { return new Prediction("smoking", 3, 0); }
	}
	}
	}
	if( Attr5_Max >= 1.07 ) { 
	if( Attr6_Max >= 1.05 ) { 
	if( Attr4_Min < -1.14 ) { 
		if( Attr8_Mean >= 1.26 ) { return new Prediction("NULL", 34, 13); }
		if( Attr8_Mean < 1.26 ) { return new Prediction("NULL", 12, 0); }
	}
	if( Attr4_Min >= -1.14 ) { 
		if( Attr6_Min < -0.87 ) { return new Prediction("smoking", 60, 14); }
		if( Attr6_Min >= -0.87 ) { return new Prediction("NULL", 34, 11); }
	}
	}
	if( Attr6_Max < 1.05 ) { 
	if( Attr3_Min < -4.06 ) { 
		if( Attr7_Mean >= -27.65 ) { return new Prediction("NULL", 44, 8); }
		if( Attr7_Mean < -27.65 ) { return new Prediction("smoking", 4, 0); }
	}
	if( Attr3_Min >= -4.06 ) { 
		if( Attr5_Max < 2.31 ) { return new Prediction("NULL", 76, 0); }
		if( Attr5_Max >= 2.31 ) { return new Prediction("NULL", 4, 1); }
	}
	}
	}
	}
	if( Attr4_Min < -1.31 ) { 
	if( Attr3_Max < 13.34 ) { 
	if( Attr6_Max >= 2.04 ) { 
	if( Attr6_Min >= -2.72 ) { 
		if( Attr4_Max < 4.29 ) { return new Prediction("NULL", 799, 364); }
		if( Attr4_Max >= 4.29 ) { return new Prediction("NULL", 655, 170); }
	}
	if( Attr6_Min < -2.72 ) { 
		if( Attr1_Min >= -6.99 ) { return new Prediction("NULL", 644, 196); }
		if( Attr1_Min < -6.99 ) { return new Prediction("smoking", 2634, 671); }
	}
	}
	if( Attr6_Max < 2.04 ) { 
	if( Attr5_Min < -1.66 ) { 
		if( Attr7_Max < 34.45 ) { return new Prediction("NULL", 771, 221); }
		if( Attr7_Max >= 34.45 ) { return new Prediction("smoking", 334, 162); }
	}
	if( Attr5_Min >= -1.66 ) { 
		if( Attr1_Min >= -6.05 ) { return new Prediction("NULL", 1325, 198); }
		if( Attr1_Min < -6.05 ) { return new Prediction("NULL", 767, 292); }
	}
	}
	}
	if( Attr3_Max >= 13.34 ) { 
	if( Attr2_Min < -26.2 ) { 
		if( Attr1_Max >= 12.42 ) { return new Prediction("NULL", 48, 0); }
	if( Attr1_Max < 12.42 ) { 
		if( Attr6_Max < 3.22 ) { return new Prediction("NULL", 13, 6); }
		if( Attr6_Max >= 3.22 ) { return new Prediction("NULL", 49, 3); }
	}
	}
	if( Attr2_Min >= -26.2 ) { 
	if( Attr2_Min < -19.46 ) { 
		if( Attr4_Min >= -3.81 ) { return new Prediction("smoking", 35, 7); }
		if( Attr4_Min < -3.81 ) { return new Prediction("NULL", 413, 122); }
	}
	if( Attr2_Min >= -19.46 ) { 
		if( Attr6_Max >= 2.04 ) { return new Prediction("NULL", 1028, 246); }
		if( Attr6_Max < 2.04 ) { return new Prediction("NULL", 289, 34); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree29() {
	if( Attr6_Max < 1.5 ) { 
	if( Attr4_Max < 0.95 ) { 
	if( Attr3_Max >= 9.42 ) { 
	if( Attr2_Mean < -1.44 ) { 
	if( Attr4_Mean >= -0.01 ) { 
		if( Attr3_Mean >= 8.89 ) { return new Prediction("NULL", 136, 0); }
		if( Attr3_Mean < 8.89 ) { return new Prediction("NULL", 111, 6); }
	}
	if( Attr4_Mean < -0.01 ) { 
		if( Attr4_Mean >= -0.01 ) { return new Prediction("smoking", 5, 0); }
		if( Attr4_Mean < -0.01 ) { return new Prediction("NULL", 53, 9); }
	}
	}
	if( Attr2_Mean >= -1.44 ) { 
		if( Attr1_Mean < 2.59 ) { return new Prediction("NULL", 1220, 0); }
	if( Attr1_Mean >= 2.59 ) { 
		if( Attr9_Max >= 1.11 ) { return new Prediction("NULL", 4, 0); }
		if( Attr9_Max < 1.11 ) { return new Prediction("smoking", 6, 2); }
	}
	}
	}
	if( Attr3_Max < 9.42 ) { 
	if( Attr6_Min >= -1.03 ) { 
	if( Attr6_Max < 0 ) { 
		if( Attr8_Max < 17.09 ) { return new Prediction("NULL", 239, 0); }
		if( Attr8_Max >= 17.09 ) { return new Prediction("NULL", 106, 7); }
	}
	if( Attr6_Max >= 0 ) { 
		if( Attr7_Min < -26.52 ) { return new Prediction("NULL", 823, 119); }
		if( Attr7_Min >= -26.52 ) { return new Prediction("NULL", 2231, 179); }
	}
	}
	if( Attr6_Min < -1.03 ) { 
		if( Attr6_Max < 0.01 ) { return new Prediction("NULL", 30, 0); }
	if( Attr6_Max >= 0.01 ) { 
		if( Attr1_Max >= 10.05 ) { return new Prediction("smoking", 33, 9); }
		if( Attr1_Max < 10.05 ) { return new Prediction("NULL", 93, 31); }
	}
	}
	}
	}
	if( Attr4_Max >= 0.95 ) { 
	if( Attr6_Min < -2.1 ) { 
		if( Attr6_Mean < -0.22 ) { return new Prediction("NULL", 35, 0); }
	if( Attr6_Mean >= -0.22 ) { 
	if( Attr7_Max < 30.06 ) { 
		if( Attr3_Max < 0.99 ) { return new Prediction("NULL", 34, 0); }
		if( Attr3_Max >= 0.99 ) { return new Prediction("NULL", 296, 97); }
	}
	if( Attr7_Max >= 30.06 ) { 
		if( Attr5_Max >= 3.37 ) { return new Prediction("NULL", 15, 0); }
		if( Attr5_Max < 3.37 ) { return new Prediction("smoking", 169, 69); }
	}
	}
	}
	if( Attr6_Min >= -2.1 ) { 
	if( Attr3_Mean >= 2.78 ) { 
	if( Attr1_Min < -5.22 ) { 
		if( Attr2_Max < 4.38 ) { return new Prediction("NULL", 186, 42); }
		if( Attr2_Max >= 4.38 ) { return new Prediction("smoking", 155, 69); }
	}
	if( Attr1_Min >= -5.22 ) { 
		if( Attr7_Mean < -21.58 ) { return new Prediction("NULL", 88, 1); }
		if( Attr7_Mean >= -21.58 ) { return new Prediction("NULL", 495, 74); }
	}
	}
	if( Attr3_Mean < 2.78 ) { 
	if( Attr1_Min >= -13.63 ) { 
		if( Attr5_Max >= 2.08 ) { return new Prediction("NULL", 75, 22); }
		if( Attr5_Max < 2.08 ) { return new Prediction("NULL", 1152, 137); }
	}
		if( Attr1_Min < -13.63 ) { return new Prediction("NULL", 133, 0); }
	}
	}
	}
	}
	if( Attr6_Max >= 1.5 ) { 
	if( Attr3_Min < -6.99 ) { 
	if( Attr3_Min < -14.41 ) { 
	if( Attr2_Min >= -20.72 ) { 
	if( Attr1_Mean >= 6.8 ) { 
		if( Attr3_Max >= 5.83 ) { return new Prediction("NULL", 42, 0); }
		if( Attr3_Max < 5.83 ) { return new Prediction("smoking", 4, 2); }
	}
	if( Attr1_Mean < 6.8 ) { 
		if( Attr1_Min >= -19.6 ) { return new Prediction("NULL", 487, 132); }
		if( Attr1_Min < -19.6 ) { return new Prediction("NULL", 62, 2); }
	}
	}
	if( Attr2_Min < -20.72 ) { 
	if( Attr9_Mean >= -17.42 ) { 
		if( Attr4_Min < -18.83 ) { return new Prediction("NULL", 8, 3); }
		if( Attr4_Min >= -18.83 ) { return new Prediction("NULL", 90, 1); }
	}
	if( Attr9_Mean < -17.42 ) { 
		if( Attr6_Mean < -0.04 ) { return new Prediction("smoking", 2, 0); }
		if( Attr6_Mean >= -0.04 ) { return new Prediction("NULL", 18, 3); }
	}
	}
	}
	if( Attr3_Min >= -14.41 ) { 
	if( Attr6_Min >= -2.61 ) { 
	if( Attr2_Max < 0.41 ) { 
		if( Attr4_Mean >= -0.02 ) { return new Prediction("NULL", 202, 86); }
		if( Attr4_Mean < -0.02 ) { return new Prediction("NULL", 94, 21); }
	}
	if( Attr2_Max >= 0.41 ) { 
		if( Attr1_Mean >= 6.03 ) { return new Prediction("NULL", 122, 2); }
		if( Attr1_Mean < 6.03 ) { return new Prediction("NULL", 449, 88); }
	}
	}
	if( Attr6_Min < -2.61 ) { 
	if( Attr2_Max >= 2.16 ) { 
		if( Attr6_Mean < 0.2 ) { return new Prediction("NULL", 1151, 339); }
		if( Attr6_Mean >= 0.2 ) { return new Prediction("smoking", 22, 5); }
	}
	if( Attr2_Max < 2.16 ) { 
		if( Attr4_Mean >= 0.18 ) { return new Prediction("smoking", 21, 0); }
		if( Attr4_Mean < 0.18 ) { return new Prediction("smoking", 505, 175); }
	}
	}
	}
	}
	if( Attr3_Min >= -6.99 ) { 
	if( Attr1_Min < -7.03 ) { 
	if( Attr6_Min >= -2.26 ) { 
	if( Attr1_Mean >= -9.25 ) { 
		if( Attr9_Max >= -26 ) { return new Prediction("NULL", 461, 185); }
		if( Attr9_Max < -26 ) { return new Prediction("smoking", 29, 8); }
	}
		if( Attr1_Mean < -9.25 ) { return new Prediction("NULL", 41, 0); }
	}
	if( Attr6_Min < -2.26 ) { 
	if( Attr3_Max >= 12.62 ) { 
		if( Attr1_Min >= -18.38 ) { return new Prediction("NULL", 346, 156); }
		if( Attr1_Min < -18.38 ) { return new Prediction("NULL", 83, 12); }
	}
	if( Attr3_Max < 12.62 ) { 
		if( Attr1_Max >= 7.14 ) { return new Prediction("smoking", 1344, 162); }
		if( Attr1_Max < 7.14 ) { return new Prediction("smoking", 657, 174); }
	}
	}
	}
	if( Attr1_Min >= -7.03 ) { 
	if( Attr1_Max >= 7.35 ) { 
	if( Attr4_Max >= 3.5 ) { 
		if( Attr4_Mean < -0.04 ) { return new Prediction("NULL", 101, 5); }
		if( Attr4_Mean >= -0.04 ) { return new Prediction("NULL", 531, 151); }
	}
	if( Attr4_Max < 3.5 ) { 
		if( Attr4_Mean >= -0.09 ) { return new Prediction("NULL", 600, 263); }
		if( Attr4_Mean < -0.09 ) { return new Prediction("NULL", 45, 0); }
	}
	}
	if( Attr1_Max < 7.35 ) { 
	if( Attr4_Max >= 1.37 ) { 
		if( Attr7_Max >= -6.08 ) { return new Prediction("NULL", 316, 75); }
		if( Attr7_Max < -6.08 ) { return new Prediction("NULL", 54, 2); }
	}
	if( Attr4_Max < 1.37 ) { 
		if( Attr7_Mean < -27.38 ) { return new Prediction("smoking", 4, 2); }
		if( Attr7_Mean >= -27.38 ) { return new Prediction("NULL", 64, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree30() {
	if( Attr5_Min >= -0.64 ) { 
	if( Attr3_Max >= 8.1 ) { 
	if( Attr2_Min < -9.17 ) { 
	if( Attr7_Mean >= -27.7 ) { 
	if( Attr1_Max < 8.45 ) { 
		if( Attr6_Min < -0.21 ) { return new Prediction("NULL", 129, 9); }
		if( Attr6_Min >= -0.21 ) { return new Prediction("smoking", 38, 18); }
	}
	if( Attr1_Max >= 8.45 ) { 
		if( Attr5_Max >= 0.65 ) { return new Prediction("smoking", 37, 12); }
		if( Attr5_Max < 0.65 ) { return new Prediction("NULL", 28, 5); }
	}
	}
		if( Attr7_Mean < -27.7 ) { return new Prediction("NULL", 32, 0); }
	}
	if( Attr2_Min >= -9.17 ) { 
	if( Attr3_Mean < 8.93 ) { 
	if( Attr4_Min < -0.33 ) { 
		if( Attr7_Min >= -24.48 ) { return new Prediction("NULL", 190, 8); }
		if( Attr7_Min < -24.48 ) { return new Prediction("NULL", 75, 17); }
	}
	if( Attr4_Min >= -0.33 ) { 
		if( Attr2_Max >= -3.03 ) { return new Prediction("NULL", 91, 2); }
		if( Attr2_Max < -3.03 ) { return new Prediction("NULL", 203, 0); }
	}
	}
		if( Attr3_Mean >= 8.93 ) { return new Prediction("NULL", 1358, 0); }
	}
	}
	if( Attr3_Max < 8.1 ) { 
	if( Attr5_Mean >= 0 ) { 
	if( Attr7_Max >= 13.58 ) { 
	if( Attr4_Min < -0 ) { 
		if( Attr5_Min >= 0.01 ) { return new Prediction("NULL", 21, 0); }
		if( Attr5_Min < 0.01 ) { return new Prediction("NULL", 458, 150); }
	}
		if( Attr4_Min >= -0 ) { return new Prediction("NULL", 52, 0); }
	}
	if( Attr7_Max < 13.58 ) { 
	if( Attr5_Max >= 0.01 ) { 
		if( Attr8_Min < -9.73 ) { return new Prediction("NULL", 141, 3); }
		if( Attr8_Min >= -9.73 ) { return new Prediction("NULL", 599, 97); }
	}
	if( Attr5_Max < 0.01 ) { 
		if( Attr3_Mean >= -0.46 ) { return new Prediction("NULL", 34, 14); }
		if( Attr3_Mean < -0.46 ) { return new Prediction("smoking", 19, 0); }
	}
	}
	}
	if( Attr5_Mean < 0 ) { 
	if( Attr5_Min >= -0.38 ) { 
	if( Attr3_Min < -1.94 ) { 
		if( Attr8_Min < 8.36 ) { return new Prediction("NULL", 272, 0); }
		if( Attr8_Min >= 8.36 ) { return new Prediction("NULL", 420, 10); }
	}
	if( Attr3_Min >= -1.94 ) { 
		if( Attr8_Min >= 0.26 ) { return new Prediction("NULL", 706, 72); }
		if( Attr8_Min < 0.26 ) { return new Prediction("NULL", 420, 15); }
	}
	}
	if( Attr5_Min < -0.38 ) { 
		if( Attr5_Mean < -0.03 ) { return new Prediction("NULL", 62, 0); }
	if( Attr5_Mean >= -0.03 ) { 
		if( Attr1_Min < 8.99 ) { return new Prediction("NULL", 255, 49); }
		if( Attr1_Min >= 8.99 ) { return new Prediction("smoking", 5, 0); }
	}
	}
	}
	}
	}
	if( Attr5_Min < -0.64 ) { 
	if( Attr6_Min < -2.22 ) { 
	if( Attr2_Min < -16.84 ) { 
	if( Attr3_Min < -6.44 ) { 
	if( Attr4_Max >= 4.74 ) { 
		if( Attr5_Max >= 1.8 ) { return new Prediction("NULL", 1159, 326); }
		if( Attr5_Max < 1.8 ) { return new Prediction("NULL", 55, 3); }
	}
	if( Attr4_Max < 4.74 ) { 
		if( Attr7_Max < 17.63 ) { return new Prediction("NULL", 66, 14); }
		if( Attr7_Max >= 17.63 ) { return new Prediction("smoking", 171, 77); }
	}
	}
	if( Attr3_Min >= -6.44 ) { 
	if( Attr6_Min < -4.7 ) { 
		if( Attr4_Max >= 10.52 ) { return new Prediction("NULL", 10, 0); }
		if( Attr4_Max < 10.52 ) { return new Prediction("smoking", 157, 39); }
	}
	if( Attr6_Min >= -4.7 ) { 
		if( Attr1_Max < 0.95 ) { return new Prediction("smoking", 16, 3); }
		if( Attr1_Max >= 0.95 ) { return new Prediction("NULL", 277, 96); }
	}
	}
	}
	if( Attr2_Min >= -16.84 ) { 
	if( Attr4_Max >= 4.17 ) { 
	if( Attr7_Max < 39.49 ) { 
		if( Attr3_Min < -7.1 ) { return new Prediction("NULL", 597, 148); }
		if( Attr3_Min >= -7.1 ) { return new Prediction("NULL", 685, 290); }
	}
	if( Attr7_Max >= 39.49 ) { 
		if( Attr7_Min >= -32.78 ) { return new Prediction("NULL", 291, 113); }
		if( Attr7_Min < -32.78 ) { return new Prediction("smoking", 302, 117); }
	}
	}
	if( Attr4_Max < 4.17 ) { 
	if( Attr1_Min >= -6.93 ) { 
		if( Attr4_Min < -4.12 ) { return new Prediction("NULL", 171, 27); }
		if( Attr4_Min >= -4.12 ) { return new Prediction("NULL", 456, 172); }
	}
	if( Attr1_Min < -6.93 ) { 
		if( Attr1_Max < -3.84 ) { return new Prediction("NULL", 43, 7); }
		if( Attr1_Max >= -3.84 ) { return new Prediction("smoking", 1950, 315); }
	}
	}
	}
	}
	if( Attr6_Min >= -2.22 ) { 
	if( Attr6_Max < 2.21 ) { 
	if( Attr8_Mean >= -24.54 ) { 
	if( Attr6_Mean >= -0.09 ) { 
		if( Attr8_Max >= -3.76 ) { return new Prediction("NULL", 2576, 554); }
		if( Attr8_Max < -3.76 ) { return new Prediction("NULL", 68, 1); }
	}
	if( Attr6_Mean < -0.09 ) { 
		if( Attr9_Mean >= 12.75 ) { return new Prediction("NULL", 30, 1); }
		if( Attr9_Mean < 12.75 ) { return new Prediction("NULL", 123, 0); }
	}
	}
		if( Attr8_Mean < -24.54 ) { return new Prediction("NULL", 56, 0); }
	}
	if( Attr6_Max >= 2.21 ) { 
	if( Attr1_Max >= 13.39 ) { 
	if( Attr8_Max < 64.5 ) { 
		if( Attr6_Mean >= 0.09 ) { return new Prediction("NULL", 28, 0); }
		if( Attr6_Mean < 0.09 ) { return new Prediction("NULL", 95, 12); }
	}
		if( Attr8_Max >= 64.5 ) { return new Prediction("smoking", 3, 0); }
	}
	if( Attr1_Max < 13.39 ) { 
	if( Attr4_Max >= 5.82 ) { 
		if( Attr3_Min < 0.2 ) { return new Prediction("NULL", 164, 21); }
		if( Attr3_Min >= 0.2 ) { return new Prediction("smoking", 9, 2); }
	}
	if( Attr4_Max < 5.82 ) { 
		if( Attr2_Min < -19.54 ) { return new Prediction("NULL", 27, 0); }
		if( Attr2_Min >= -19.54 ) { return new Prediction("NULL", 648, 276); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree31() {
	if( Attr5_Max < 0.43 ) { 
		if( Attr3_Mean >= 8.94 ) { return new Prediction("NULL", 1309, 0); }
	if( Attr3_Mean < 8.94 ) { 
	if( Attr7_Max >= 37.66 ) { 
	if( Attr6_Min >= -1.99 ) { 
	if( Attr2_Min >= -12.12 ) { 
		if( Attr7_Max >= 37.75 ) { return new Prediction("NULL", 299, 35); }
		if( Attr7_Max < 37.75 ) { return new Prediction("smoking", 9, 3); }
	}
	if( Attr2_Min < -12.12 ) { 
		if( Attr2_Min < -14.81 ) { return new Prediction("NULL", 2, 0); }
		if( Attr2_Min >= -14.81 ) { return new Prediction("smoking", 22, 2); }
	}
	}
	if( Attr6_Min < -1.99 ) { 
		if( Attr1_Mean < -8.29 ) { return new Prediction("NULL", 5, 0); }
		if( Attr1_Mean >= -8.29 ) { return new Prediction("smoking", 29, 0); }
	}
	}
	if( Attr7_Max < 37.66 ) { 
	if( Attr2_Min < -10.78 ) { 
	if( Attr9_Mean < -14.97 ) { 
		if( Attr9_Mean >= -36.61 ) { return new Prediction("NULL", 53, 1); }
		if( Attr9_Mean < -36.61 ) { return new Prediction("NULL", 19, 4); }
	}
	if( Attr9_Mean >= -14.97 ) { 
		if( Attr9_Mean >= 6.03 ) { return new Prediction("NULL", 67, 14); }
		if( Attr9_Mean < 6.03 ) { return new Prediction("NULL", 77, 36); }
	}
	}
	if( Attr2_Min >= -10.78 ) { 
	if( Attr7_Min >= -25.77 ) { 
		if( Attr5_Max >= 0 ) { return new Prediction("NULL", 1896, 119); }
		if( Attr5_Max < 0 ) { return new Prediction("NULL", 204, 0); }
	}
	if( Attr7_Min < -25.77 ) { 
		if( Attr4_Max < 0 ) { return new Prediction("NULL", 106, 32); }
		if( Attr4_Max >= 0 ) { return new Prediction("NULL", 906, 83); }
	}
	}
	}
	}
	}
	if( Attr5_Max >= 0.43 ) { 
	if( Attr7_Min >= -37.56 ) { 
	if( Attr6_Max < 2.03 ) { 
	if( Attr4_Min >= -2.27 ) { 
	if( Attr2_Min >= -15.82 ) { 
		if( Attr4_Min < -2.13 ) { return new Prediction("NULL", 103, 4); }
		if( Attr4_Min >= -2.13 ) { return new Prediction("NULL", 1254, 219); }
	}
	if( Attr2_Min < -15.82 ) { 
		if( Attr3_Max < 15.87 ) { return new Prediction("NULL", 108, 0); }
		if( Attr3_Max >= 15.87 ) { return new Prediction("NULL", 15, 3); }
	}
	}
	if( Attr4_Min < -2.27 ) { 
	if( Attr9_Max < 0.97 ) { 
		if( Attr1_Mean < -5.6 ) { return new Prediction("smoking", 103, 28); }
		if( Attr1_Mean >= -5.6 ) { return new Prediction("NULL", 383, 100); }
	}
	if( Attr9_Max >= 0.97 ) { 
		if( Attr1_Max < 14.18 ) { return new Prediction("NULL", 1110, 262); }
		if( Attr1_Max >= 14.18 ) { return new Prediction("NULL", 89, 4); }
	}
	}
	}
	if( Attr6_Max >= 2.03 ) { 
	if( Attr1_Min < -6.83 ) { 
	if( Attr4_Max >= 4.1 ) { 
		if( Attr2_Min >= -12.67 ) { return new Prediction("smoking", 316, 130); }
		if( Attr2_Min < -12.67 ) { return new Prediction("NULL", 1367, 390); }
	}
	if( Attr4_Max < 4.1 ) { 
		if( Attr1_Min < -9.32 ) { return new Prediction("smoking", 761, 326); }
		if( Attr1_Min >= -9.32 ) { return new Prediction("smoking", 465, 110); }
	}
	}
	if( Attr1_Min >= -6.83 ) { 
	if( Attr6_Min >= -0.31 ) { 
		if( Attr6_Min < -0.02 ) { return new Prediction("smoking", 26, 3); }
		if( Attr6_Min >= -0.02 ) { return new Prediction("NULL", 7, 0); }
	}
	if( Attr6_Min < -0.31 ) { 
		if( Attr9_Max >= 20.21 ) { return new Prediction("NULL", 399, 64); }
		if( Attr9_Max < 20.21 ) { return new Prediction("NULL", 761, 220); }
	}
	}
	}
	}
	if( Attr7_Min < -37.56 ) { 
	if( Attr1_Min < -6.62 ) { 
	if( Attr2_Max >= 6.22 ) { 
	if( Attr1_Max < 0.09 ) { 
		if( Attr5_Max < 0.99 ) { return new Prediction("NULL", 6, 2); }
		if( Attr5_Max >= 0.99 ) { return new Prediction("smoking", 37, 2); }
	}
	if( Attr1_Max >= 0.09 ) { 
		if( Attr6_Min >= -2.55 ) { return new Prediction("NULL", 70, 7); }
		if( Attr6_Min < -2.55 ) { return new Prediction("NULL", 491, 175); }
	}
	}
	if( Attr2_Max < 6.22 ) { 
	if( Attr4_Min >= -6.71 ) { 
		if( Attr1_Max < 6.32 ) { return new Prediction("smoking", 228, 96); }
		if( Attr1_Max >= 6.32 ) { return new Prediction("smoking", 1167, 175); }
	}
	if( Attr4_Min < -6.71 ) { 
		if( Attr2_Mean < -5.72 ) { return new Prediction("NULL", 73, 13); }
		if( Attr2_Mean >= -5.72 ) { return new Prediction("smoking", 132, 57); }
	}
	}
	}
	if( Attr1_Min >= -6.62 ) { 
	if( Attr2_Min < -14.58 ) { 
	if( Attr5_Max < 1.91 ) { 
		if( Attr1_Mean < 8.85 ) { return new Prediction("NULL", 126, 5); }
		if( Attr1_Mean >= 8.85 ) { return new Prediction("smoking", 2, 0); }
	}
	if( Attr5_Max >= 1.91 ) { 
		if( Attr2_Mean >= -7.86 ) { return new Prediction("NULL", 265, 40); }
		if( Attr2_Mean < -7.86 ) { return new Prediction("smoking", 16, 4); }
	}
	}
	if( Attr2_Min >= -14.58 ) { 
	if( Attr4_Min < -1.69 ) { 
		if( Attr5_Max >= 3.65 ) { return new Prediction("NULL", 65, 6); }
		if( Attr5_Max < 3.65 ) { return new Prediction("NULL", 706, 265); }
	}
	if( Attr4_Min >= -1.69 ) { 
		if( Attr1_Mean >= -2.98 ) { return new Prediction("NULL", 221, 25); }
		if( Attr1_Mean < -2.98 ) { return new Prediction("smoking", 3, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree32() {
	if( Attr1_Min < -7.03 ) { 
	if( Attr7_Min >= -37.56 ) { 
	if( Attr3_Max < 13.7 ) { 
	if( Attr6_Max < 1.6 ) { 
		if( Attr2_Min >= 0.05 ) { return new Prediction("NULL", 148, 0); }
	if( Attr2_Min < 0.05 ) { 
		if( Attr6_Min >= -2.11 ) { return new Prediction("NULL", 740, 164); }
		if( Attr6_Min < -2.11 ) { return new Prediction("smoking", 185, 85); }
	}
	}
	if( Attr6_Max >= 1.6 ) { 
	if( Attr1_Min >= -10.05 ) { 
		if( Attr2_Min >= -15.54 ) { return new Prediction("smoking", 840, 184); }
		if( Attr2_Min < -15.54 ) { return new Prediction("NULL", 279, 136); }
	}
	if( Attr1_Min < -10.05 ) { 
		if( Attr6_Min < -2.63 ) { return new Prediction("smoking", 903, 379); }
		if( Attr6_Min >= -2.63 ) { return new Prediction("NULL", 396, 74); }
	}
	}
	}
	if( Attr3_Max >= 13.7 ) { 
	if( Attr6_Min >= -3.66 ) { 
	if( Attr2_Max >= 15.56 ) { 
		if( Attr8_Max < 7.19 ) { return new Prediction("NULL", 12, 1); }
		if( Attr8_Max >= 7.19 ) { return new Prediction("NULL", 61, 0); }
	}
	if( Attr2_Max < 15.56 ) { 
		if( Attr4_Mean >= -0.09 ) { return new Prediction("NULL", 332, 62); }
		if( Attr4_Mean < -0.09 ) { return new Prediction("NULL", 37, 0); }
	}
	}
	if( Attr6_Min < -3.66 ) { 
	if( Attr8_Max < 24.75 ) { 
		if( Attr9_Max >= -34.79 ) { return new Prediction("smoking", 84, 40); }
		if( Attr9_Max < -34.79 ) { return new Prediction("NULL", 6, 0); }
	}
	if( Attr8_Max >= 24.75 ) { 
		if( Attr2_Mean >= -2.83 ) { return new Prediction("NULL", 57, 3); }
		if( Attr2_Mean < -2.83 ) { return new Prediction("NULL", 322, 79); }
	}
	}
	}
	}
	if( Attr7_Min < -37.56 ) { 
	if( Attr5_Min < -4.45 ) { 
	if( Attr5_Max >= 6.24 ) { 
		if( Attr8_Mean >= 8.46 ) { return new Prediction("NULL", 49, 0); }
	if( Attr8_Mean < 8.46 ) { 
		if( Attr7_Mean < -31.86 ) { return new Prediction("smoking", 7, 1); }
		if( Attr7_Mean >= -31.86 ) { return new Prediction("NULL", 12, 1); }
	}
	}
	if( Attr5_Max < 6.24 ) { 
	if( Attr7_Mean < 14.09 ) { 
		if( Attr3_Mean < -2.28 ) { return new Prediction("NULL", 14, 0); }
		if( Attr3_Mean >= -2.28 ) { return new Prediction("NULL", 168, 61); }
	}
	if( Attr7_Mean >= 14.09 ) { 
		if( Attr4_Mean >= -0.03 ) { return new Prediction("smoking", 27, 3); }
		if( Attr4_Mean < -0.03 ) { return new Prediction("NULL", 13, 3); }
	}
	}
	}
	if( Attr5_Min >= -4.45 ) { 
	if( Attr9_Mean < 1.37 ) { 
	if( Attr1_Mean < 5.98 ) { 
		if( Attr2_Max < 7.52 ) { return new Prediction("smoking", 717, 246); }
		if( Attr2_Max >= 7.52 ) { return new Prediction("NULL", 166, 47); }
	}
	if( Attr1_Mean >= 5.98 ) { 
		if( Attr4_Max < 5.97 ) { return new Prediction("smoking", 117, 2); }
		if( Attr4_Max >= 5.97 ) { return new Prediction("smoking", 11, 4); }
	}
	}
	if( Attr9_Mean >= 1.37 ) { 
	if( Attr2_Min >= -17.62 ) { 
		if( Attr2_Max < 4.45 ) { return new Prediction("smoking", 635, 70); }
		if( Attr2_Max >= 4.45 ) { return new Prediction("smoking", 120, 50); }
	}
	if( Attr2_Min < -17.62 ) { 
		if( Attr6_Max < 3.08 ) { return new Prediction("NULL", 23, 5); }
		if( Attr6_Max >= 3.08 ) { return new Prediction("smoking", 99, 34); }
	}
	}
	}
	}
	}
	if( Attr1_Min >= -7.03 ) { 
	if( Attr3_Mean >= 9.25 ) { 
		if( Attr5_Min >= -1.69 ) { return new Prediction("NULL", 1247, 0); }
	if( Attr5_Min < -1.69 ) { 
		if( Attr8_Mean >= -24.45 ) { return new Prediction("NULL", 23, 0); }
	if( Attr8_Mean < -24.45 ) { 
		if( Attr2_Mean < -0.65 ) { return new Prediction("smoking", 1, 0); }
		if( Attr2_Mean >= -0.65 ) { return new Prediction("NULL", 3, 0); }
	}
	}
	}
	if( Attr3_Mean < 9.25 ) { 
	if( Attr6_Min < -0.57 ) { 
	if( Attr2_Max >= 7.13 ) { 
		if( Attr6_Mean < -0.07 ) { return new Prediction("NULL", 44, 0); }
	if( Attr6_Mean >= -0.07 ) { 
		if( Attr4_Max >= 14.49 ) { return new Prediction("smoking", 15, 7); }
		if( Attr4_Max < 14.49 ) { return new Prediction("NULL", 394, 40); }
	}
	}
	if( Attr2_Max < 7.13 ) { 
	if( Attr6_Max >= 2.22 ) { 
		if( Attr4_Min < -3.66 ) { return new Prediction("NULL", 845, 194); }
		if( Attr4_Min >= -3.66 ) { return new Prediction("NULL", 536, 228); }
	}
	if( Attr6_Max < 2.22 ) { 
		if( Attr5_Mean >= -0.34 ) { return new Prediction("NULL", 2255, 418); }
		if( Attr5_Mean < -0.34 ) { return new Prediction("NULL", 105, 0); }
	}
	}
	}
	if( Attr6_Min >= -0.57 ) { 
	if( Attr6_Max >= 1.85 ) { 
	if( Attr2_Min < -10.25 ) { 
		if( Attr2_Max < 0.46 ) { return new Prediction("smoking", 30, 9); }
		if( Attr2_Max >= 0.46 ) { return new Prediction("NULL", 23, 2); }
	}
	if( Attr2_Min >= -10.25 ) { 
		if( Attr5_Mean >= -0 ) { return new Prediction("NULL", 24, 0); }
		if( Attr5_Mean < -0 ) { return new Prediction("NULL", 32, 11); }
	}
	}
	if( Attr6_Max < 1.85 ) { 
	if( Attr8_Max >= 13.89 ) { 
		if( Attr7_Mean < -71.01 ) { return new Prediction("smoking", 17, 1); }
		if( Attr7_Mean >= -71.01 ) { return new Prediction("NULL", 2735, 248); }
	}
	if( Attr8_Max < 13.89 ) { 
		if( Attr2_Mean < -12.43 ) { return new Prediction("smoking", 3, 0); }
		if( Attr2_Mean >= -12.43 ) { return new Prediction("NULL", 966, 22); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree33() {
	if( Attr5_Min >= -0.61 ) { 
	if( Attr1_Min < -3.87 ) { 
	if( Attr8_Mean < -13.39 ) { 
		if( Attr5_Min < 0.02 ) { return new Prediction("NULL", 149, 0); }
		if( Attr5_Min >= 0.02 ) { return new Prediction("smoking", 2, 0); }
	}
	if( Attr8_Mean >= -13.39 ) { 
	if( Attr2_Min >= -9.7 ) { 
	if( Attr5_Max < 0.9 ) { 
		if( Attr1_Max < 7.84 ) { return new Prediction("NULL", 399, 51); }
		if( Attr1_Max >= 7.84 ) { return new Prediction("smoking", 9, 2); }
	}
	if( Attr5_Max >= 0.9 ) { 
		if( Attr3_Min >= 2.49 ) { return new Prediction("NULL", 9, 0); }
		if( Attr3_Min < 2.49 ) { return new Prediction("smoking", 36, 13); }
	}
	}
	if( Attr2_Min < -9.7 ) { 
	if( Attr2_Min < -15.16 ) { 
		if( Attr5_Mean < 0.09 ) { return new Prediction("NULL", 16, 0); }
		if( Attr5_Mean >= 0.09 ) { return new Prediction("smoking", 1, 0); }
	}
	if( Attr2_Min >= -15.16 ) { 
		if( Attr6_Mean >= 0.04 ) { return new Prediction("smoking", 36, 5); }
		if( Attr6_Mean < 0.04 ) { return new Prediction("NULL", 152, 57); }
	}
	}
	}
	}
	if( Attr1_Min >= -3.87 ) { 
	if( Attr2_Mean >= -1.34 ) { 
		if( Attr1_Max < 1.24 ) { return new Prediction("NULL", 1074, 0); }
	if( Attr1_Max >= 1.24 ) { 
		if( Attr1_Max < 1.24 ) { return new Prediction("smoking", 1, 0); }
	if( Attr1_Max >= 1.24 ) { 
		if( Attr5_Min >= -0.46 ) { return new Prediction("NULL", 506, 3); }
		if( Attr5_Min < -0.46 ) { return new Prediction("NULL", 33, 3); }
	}
	}
	}
	if( Attr2_Mean < -1.34 ) { 
	if( Attr7_Mean >= -74.02 ) { 
	if( Attr1_Min >= 0.17 ) { 
		if( Attr4_Max < 0 ) { return new Prediction("NULL", 250, 62); }
		if( Attr4_Max >= 0 ) { return new Prediction("NULL", 1550, 143); }
	}
	if( Attr1_Min < 0.17 ) { 
		if( Attr6_Max < 2.24 ) { return new Prediction("NULL", 1235, 46); }
		if( Attr6_Max >= 2.24 ) { return new Prediction("NULL", 18, 8); }
	}
	}
	if( Attr7_Mean < -74.02 ) { 
	if( Attr1_Max >= 1.74 ) { 
		if( Attr1_Mean >= 7.42 ) { return new Prediction("NULL", 3, 0); }
		if( Attr1_Mean < 7.42 ) { return new Prediction("smoking", 16, 0); }
	}
		if( Attr1_Max < 1.74 ) { return new Prediction("NULL", 5, 0); }
	}
	}
	}
	}
	if( Attr5_Min < -0.61 ) { 
	if( Attr1_Min >= -6.8 ) { 
		if( Attr5_Max < 0.05 ) { return new Prediction("NULL", 97, 0); }
	if( Attr5_Max >= 0.05 ) { 
	if( Attr1_Mean >= 0.24 ) { 
	if( Attr1_Min < -2.87 ) { 
		if( Attr2_Max < 19.75 ) { return new Prediction("NULL", 1069, 357); }
		if( Attr2_Max >= 19.75 ) { return new Prediction("NULL", 30, 0); }
	}
	if( Attr1_Min >= -2.87 ) { 
		if( Attr9_Max >= 11.36 ) { return new Prediction("NULL", 1314, 227); }
		if( Attr9_Max < 11.36 ) { return new Prediction("NULL", 925, 271); }
	}
	}
	if( Attr1_Mean < 0.24 ) { 
	if( Attr1_Max < 5.18 ) { 
		if( Attr1_Max >= -2.2 ) { return new Prediction("NULL", 517, 36); }
		if( Attr1_Max < -2.2 ) { return new Prediction("NULL", 33, 11); }
	}
	if( Attr1_Max >= 5.18 ) { 
		if( Attr5_Max < 2.3 ) { return new Prediction("NULL", 136, 53); }
		if( Attr5_Max >= 2.3 ) { return new Prediction("NULL", 91, 13); }
	}
	}
	}
	}
	if( Attr1_Min < -6.8 ) { 
	if( Attr3_Min < -6.99 ) { 
	if( Attr9_Min >= -29.75 ) { 
	if( Attr3_Min >= -14.44 ) { 
		if( Attr6_Min >= -2.54 ) { return new Prediction("NULL", 258, 92); }
		if( Attr6_Min < -2.54 ) { return new Prediction("smoking", 496, 164); }
	}
	if( Attr3_Min < -14.44 ) { 
		if( Attr4_Min < -25.93 ) { return new Prediction("smoking", 3, 0); }
		if( Attr4_Min >= -25.93 ) { return new Prediction("NULL", 148, 32); }
	}
	}
	if( Attr9_Min < -29.75 ) { 
	if( Attr3_Max >= 9.42 ) { 
		if( Attr3_Mean < -1.9 ) { return new Prediction("NULL", 117, 11); }
		if( Attr3_Mean >= -1.9 ) { return new Prediction("NULL", 1201, 326); }
	}
	if( Attr3_Max < 9.42 ) { 
		if( Attr8_Mean < 24.59 ) { return new Prediction("NULL", 271, 113); }
		if( Attr8_Mean >= 24.59 ) { return new Prediction("smoking", 133, 32); }
	}
	}
	}
	if( Attr3_Min >= -6.99 ) { 
	if( Attr6_Max < 2.14 ) { 
	if( Attr1_Max < 6.32 ) { 
		if( Attr4_Mean < 0.08 ) { return new Prediction("NULL", 696, 252); }
		if( Attr4_Mean >= 0.08 ) { return new Prediction("NULL", 54, 2); }
	}
	if( Attr1_Max >= 6.32 ) { 
		if( Attr6_Min >= -2.05 ) { return new Prediction("NULL", 58, 19); }
		if( Attr6_Min < -2.05 ) { return new Prediction("smoking", 166, 43); }
	}
	}
	if( Attr6_Max >= 2.14 ) { 
	if( Attr6_Min >= -2.72 ) { 
		if( Attr3_Min >= -0.16 ) { return new Prediction("smoking", 174, 43); }
		if( Attr3_Min < -0.16 ) { return new Prediction("NULL", 418, 156); }
	}
	if( Attr6_Min < -2.72 ) { 
		if( Attr2_Max < 6.58 ) { return new Prediction("smoking", 1679, 276); }
		if( Attr2_Max >= 6.58 ) { return new Prediction("smoking", 294, 141); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree34() {
	if( Attr5_Max >= 0.44 ) { 
	if( Attr6_Min >= -2.62 ) { 
	if( Attr6_Max >= 1.2 ) { 
	if( Attr4_Min < -4.78 ) { 
	if( Attr7_Mean < -35.58 ) { 
		if( Attr2_Max < 0.24 ) { return new Prediction("smoking", 13, 1); }
		if( Attr2_Max >= 0.24 ) { return new Prediction("NULL", 22, 6); }
	}
	if( Attr7_Mean >= -35.58 ) { 
		if( Attr5_Max >= 1.89 ) { return new Prediction("NULL", 529, 73); }
		if( Attr5_Max < 1.89 ) { return new Prediction("NULL", 301, 77); }
	}
	}
	if( Attr4_Min >= -4.78 ) { 
	if( Attr3_Min >= 5.12 ) { 
		if( Attr1_Mean >= 0.36 ) { return new Prediction("NULL", 32, 6); }
		if( Attr1_Mean < 0.36 ) { return new Prediction("NULL", 94, 1); }
	}
	if( Attr3_Min < 5.12 ) { 
		if( Attr3_Max >= 5.94 ) { return new Prediction("NULL", 1655, 634); }
		if( Attr3_Max < 5.94 ) { return new Prediction("NULL", 619, 145); }
	}
	}
	}
	if( Attr6_Max < 1.2 ) { 
	if( Attr4_Max < 6.24 ) { 
	if( Attr2_Max < -6.51 ) { 
		if( Attr2_Min >= -12.93 ) { return new Prediction("NULL", 123, 0); }
		if( Attr2_Min < -12.93 ) { return new Prediction("NULL", 3, 1); }
	}
	if( Attr2_Max >= -6.51 ) { 
		if( Attr7_Max >= -3.95 ) { return new Prediction("NULL", 1239, 241); }
		if( Attr7_Max < -3.95 ) { return new Prediction("NULL", 512, 51); }
	}
	}
	if( Attr4_Max >= 6.24 ) { 
	if( Attr2_Mean < -1.51 ) { 
		if( Attr1_Min < -2.65 ) { return new Prediction("NULL", 25, 2); }
		if( Attr1_Min >= -2.65 ) { return new Prediction("smoking", 33, 16); }
	}
	if( Attr2_Mean >= -1.51 ) { 
		if( Attr9_Mean < 9.35 ) { return new Prediction("smoking", 30, 0); }
		if( Attr9_Mean >= 9.35 ) { return new Prediction("NULL", 2, 0); }
	}
	}
	}
	}
	if( Attr6_Min < -2.62 ) { 
	if( Attr2_Max >= 3.32 ) { 
	if( Attr5_Max >= 3.8 ) { 
	if( Attr3_Min < -1.2 ) { 
		if( Attr4_Max < 5.62 ) { return new Prediction("NULL", 183, 70); }
		if( Attr4_Max >= 5.62 ) { return new Prediction("NULL", 737, 141); }
	}
	if( Attr3_Min >= -1.2 ) { 
		if( Attr8_Min < -5.96 ) { return new Prediction("smoking", 28, 3); }
		if( Attr8_Min >= -5.96 ) { return new Prediction("NULL", 4, 0); }
	}
	}
	if( Attr5_Max < 3.8 ) { 
	if( Attr1_Mean >= -5.07 ) { 
		if( Attr7_Max >= 19.41 ) { return new Prediction("NULL", 1047, 471); }
		if( Attr7_Max < 19.41 ) { return new Prediction("NULL", 454, 127); }
	}
	if( Attr1_Mean < -5.07 ) { 
		if( Attr1_Max < 0.78 ) { return new Prediction("smoking", 128, 15); }
		if( Attr1_Max >= 0.78 ) { return new Prediction("smoking", 152, 73); }
	}
	}
	}
	if( Attr2_Max < 3.32 ) { 
	if( Attr6_Min >= -4.13 ) { 
	if( Attr4_Max >= 3.87 ) { 
		if( Attr7_Max < 35.7 ) { return new Prediction("NULL", 313, 63); }
		if( Attr7_Max >= 35.7 ) { return new Prediction("NULL", 192, 83); }
	}
	if( Attr4_Max < 3.87 ) { 
		if( Attr1_Mean < 2.64 ) { return new Prediction("smoking", 811, 184); }
		if( Attr1_Mean >= 2.64 ) { return new Prediction("NULL", 221, 72); }
	}
	}
	if( Attr6_Min < -4.13 ) { 
	if( Attr1_Min < -6.46 ) { 
		if( Attr3_Min < -10.46 ) { return new Prediction("NULL", 63, 28); }
		if( Attr3_Min >= -10.46 ) { return new Prediction("smoking", 1026, 118); }
	}
	if( Attr1_Min >= -6.46 ) { 
		if( Attr8_Mean < 25.01 ) { return new Prediction("smoking", 112, 56); }
		if( Attr8_Mean >= 25.01 ) { return new Prediction("NULL", 40, 5); }
	}
	}
	}
	}
	}
	if( Attr5_Max < 0.44 ) { 
	if( Attr1_Min >= -7.58 ) { 
	if( Attr2_Max >= -0.55 ) { 
	if( Attr2_Min >= -2.59 ) { 
		if( Attr6_Max < 0.28 ) { return new Prediction("NULL", 1442, 0); }
	if( Attr6_Max >= 0.28 ) { 
		if( Attr7_Max >= -25.41 ) { return new Prediction("NULL", 36, 7); }
		if( Attr7_Max < -25.41 ) { return new Prediction("NULL", 12, 0); }
	}
	}
	if( Attr2_Min < -2.59 ) { 
		if( Attr8_Max < 13.43 ) { return new Prediction("NULL", 94, 0); }
	if( Attr8_Max >= 13.43 ) { 
		if( Attr1_Min >= 9.02 ) { return new Prediction("smoking", 6, 0); }
		if( Attr1_Min < 9.02 ) { return new Prediction("NULL", 161, 27); }
	}
	}
	}
	if( Attr2_Max < -0.55 ) { 
	if( Attr1_Max >= 8.32 ) { 
	if( Attr8_Max >= 14.75 ) { 
		if( Attr2_Max < -1.64 ) { return new Prediction("NULL", 155, 62); }
		if( Attr2_Max >= -1.64 ) { return new Prediction("NULL", 28, 2); }
	}
	if( Attr8_Max < 14.75 ) { 
		if( Attr6_Max < 0 ) { return new Prediction("NULL", 68, 0); }
		if( Attr6_Max >= 0 ) { return new Prediction("NULL", 107, 16); }
	}
	}
	if( Attr1_Max < 8.32 ) { 
	if( Attr9_Mean < -56.55 ) { 
		if( Attr7_Max < -71.34 ) { return new Prediction("smoking", 11, 0); }
		if( Attr7_Max >= -71.34 ) { return new Prediction("NULL", 31, 1); }
	}
	if( Attr9_Mean >= -56.55 ) { 
		if( Attr2_Min < -12.7 ) { return new Prediction("NULL", 39, 13); }
		if( Attr2_Min >= -12.7 ) { return new Prediction("NULL", 2566, 123); }
	}
	}
	}
	}
	if( Attr1_Min < -7.58 ) { 
	if( Attr5_Min >= -0.69 ) { 
	if( Attr6_Mean < 0 ) { 
	if( Attr7_Max < 50.66 ) { 
		if( Attr1_Max >= -0.82 ) { return new Prediction("NULL", 16, 2); }
		if( Attr1_Max < -0.82 ) { return new Prediction("NULL", 169, 0); }
	}
	if( Attr7_Max >= 50.66 ) { 
		if( Attr3_Mean < 2.44 ) { return new Prediction("NULL", 3, 0); }
		if( Attr3_Mean >= 2.44 ) { return new Prediction("smoking", 5, 0); }
	}
	}
	if( Attr6_Mean >= 0 ) { 
	if( Attr2_Max < -2.98 ) { 
		if( Attr4_Mean >= -0.01 ) { return new Prediction("smoking", 32, 6); }
		if( Attr4_Mean < -0.01 ) { return new Prediction("NULL", 4, 0); }
	}
	if( Attr2_Max >= -2.98 ) { 
		if( Attr7_Mean >= 34.08 ) { return new Prediction("smoking", 11, 4); }
		if( Attr7_Mean < 34.08 ) { return new Prediction("NULL", 48, 6); }
	}
	}
	}
	if( Attr5_Min < -0.69 ) { 
	if( Attr9_Max < 10.11 ) { 
	if( Attr1_Mean >= -8.08 ) { 
		if( Attr3_Mean < 0.86 ) { return new Prediction("NULL", 5, 0); }
		if( Attr3_Mean >= 0.86 ) { return new Prediction("smoking", 11, 4); }
	}
		if( Attr1_Mean < -8.08 ) { return new Prediction("NULL", 16, 0); }
	}
	if( Attr9_Max >= 10.11 ) { 
		if( Attr8_Mean < 0.34 ) { return new Prediction("NULL", 6, 0); }
	if( Attr8_Mean >= 0.34 ) { 
		if( Attr2_Max < 7.74 ) { return new Prediction("smoking", 52, 0); }
		if( Attr2_Max >= 7.74 ) { return new Prediction("NULL", 1, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree35() {
	if( Attr4_Max >= 1.04 ) { 
	if( Attr1_Min >= -7.35 ) { 
	if( Attr6_Min < -1.79 ) { 
	if( Attr4_Max >= 3.52 ) { 
	if( Attr9_Max < 16.78 ) { 
		if( Attr2_Max < 3.68 ) { return new Prediction("NULL", 294, 109); }
		if( Attr2_Max >= 3.68 ) { return new Prediction("NULL", 303, 52); }
	}
	if( Attr9_Max >= 16.78 ) { 
		if( Attr1_Min >= -3.91 ) { return new Prediction("NULL", 450, 52); }
		if( Attr1_Min < -3.91 ) { return new Prediction("NULL", 441, 96); }
	}
	}
	if( Attr4_Max < 3.52 ) { 
	if( Attr4_Mean >= -0.09 ) { 
		if( Attr9_Max >= 62.2 ) { return new Prediction("NULL", 14, 0); }
		if( Attr9_Max < 62.2 ) { return new Prediction("NULL", 778, 302); }
	}
	if( Attr4_Mean < -0.09 ) { 
		if( Attr4_Max < 1.14 ) { return new Prediction("smoking", 2, 0); }
		if( Attr4_Max >= 1.14 ) { return new Prediction("NULL", 66, 1); }
	}
	}
	}
	if( Attr6_Min >= -1.79 ) { 
	if( Attr8_Min < -32.59 ) { 
	if( Attr7_Mean < 165.7 ) { 
		if( Attr9_Min >= 9.83 ) { return new Prediction("NULL", 7, 1); }
		if( Attr9_Min < 9.83 ) { return new Prediction("NULL", 175, 0); }
	}
		if( Attr7_Mean >= 165.7 ) { return new Prediction("smoking", 1, 0); }
	}
	if( Attr8_Min >= -32.59 ) { 
	if( Attr5_Max < 1.61 ) { 
		if( Attr9_Min < -22.88 ) { return new Prediction("NULL", 868, 161); }
		if( Attr9_Min >= -22.88 ) { return new Prediction("NULL", 730, 69); }
	}
	if( Attr5_Max >= 1.61 ) { 
		if( Attr7_Min < 18.3 ) { return new Prediction("NULL", 463, 114); }
		if( Attr7_Min >= 18.3 ) { return new Prediction("smoking", 14, 3); }
	}
	}
	}
	}
	if( Attr1_Min < -7.35 ) { 
	if( Attr4_Max >= 4.61 ) { 
	if( Attr5_Max >= 2.08 ) { 
	if( Attr3_Max >= 11.98 ) { 
		if( Attr1_Min >= -19.82 ) { return new Prediction("NULL", 982, 237); }
		if( Attr1_Min < -19.82 ) { return new Prediction("NULL", 141, 12); }
	}
	if( Attr3_Max < 11.98 ) { 
		if( Attr6_Min < -3.64 ) { return new Prediction("smoking", 469, 205); }
		if( Attr6_Min >= -3.64 ) { return new Prediction("NULL", 276, 63); }
	}
	}
	if( Attr5_Max < 2.08 ) { 
	if( Attr3_Max >= 12.78 ) { 
		if( Attr8_Max >= -2.98 ) { return new Prediction("NULL", 109, 28); }
		if( Attr8_Max < -2.98 ) { return new Prediction("smoking", 19, 5); }
	}
	if( Attr3_Max < 12.78 ) { 
		if( Attr1_Mean >= -3.45 ) { return new Prediction("NULL", 210, 94); }
		if( Attr1_Mean < -3.45 ) { return new Prediction("smoking", 243, 73); }
	}
	}
	}
	if( Attr4_Max < 4.61 ) { 
	if( Attr1_Mean >= -7.45 ) { 
	if( Attr1_Max >= 6.49 ) { 
		if( Attr3_Min < -10.3 ) { return new Prediction("NULL", 237, 108); }
		if( Attr3_Min >= -10.3 ) { return new Prediction("smoking", 1733, 393); }
	}
	if( Attr1_Max < 6.49 ) { 
		if( Attr6_Min >= -2.25 ) { return new Prediction("NULL", 525, 137); }
		if( Attr6_Min < -2.25 ) { return new Prediction("smoking", 609, 176); }
	}
	}
	if( Attr1_Mean < -7.45 ) { 
	if( Attr6_Min < -2.33 ) { 
		if( Attr1_Mean < -9.19 ) { return new Prediction("NULL", 33, 1); }
		if( Attr1_Mean >= -9.19 ) { return new Prediction("smoking", 130, 53); }
	}
	if( Attr6_Min >= -2.33 ) { 
		if( Attr4_Min < -1.94 ) { return new Prediction("NULL", 211, 53); }
		if( Attr4_Min >= -1.94 ) { return new Prediction("NULL", 122, 7); }
	}
	}
	}
	}
	}
	if( Attr4_Max < 1.04 ) { 
	if( Attr3_Min >= 7.31 ) { 
	if( Attr3_Mean < 8.93 ) { 
	if( Attr2_Min >= -3.53 ) { 
		if( Attr2_Min >= -1.96 ) { return new Prediction("NULL", 33, 0); }
	if( Attr2_Min < -1.96 ) { 
		if( Attr4_Max < 0.02 ) { return new Prediction("NULL", 4, 0); }
		if( Attr4_Max >= 0.02 ) { return new Prediction("smoking", 11, 3); }
	}
	}
	if( Attr2_Min < -3.53 ) { 
	if( Attr2_Min >= -8.9 ) { 
		if( Attr5_Min >= -0.3 ) { return new Prediction("NULL", 291, 0); }
		if( Attr5_Min < -0.3 ) { return new Prediction("NULL", 23, 1); }
	}
	if( Attr2_Min < -8.9 ) { 
		if( Attr1_Max < 2.6 ) { return new Prediction("smoking", 3, 0); }
		if( Attr1_Max >= 2.6 ) { return new Prediction("NULL", 1, 0); }
	}
	}
	}
		if( Attr3_Mean >= 8.93 ) { return new Prediction("NULL", 1266, 0); }
	}
	if( Attr3_Min < 7.31 ) { 
	if( Attr6_Min < -1.08 ) { 
	if( Attr4_Mean >= -0.15 ) { 
	if( Attr1_Min >= -6.44 ) { 
		if( Attr6_Max < 0.14 ) { return new Prediction("smoking", 18, 3); }
		if( Attr6_Max >= 0.14 ) { return new Prediction("NULL", 95, 27); }
	}
	if( Attr1_Min < -6.44 ) { 
		if( Attr5_Min >= -0.18 ) { return new Prediction("NULL", 7, 0); }
		if( Attr5_Min < -0.18 ) { return new Prediction("smoking", 71, 16); }
	}
	}
		if( Attr4_Mean < -0.15 ) { return new Prediction("NULL", 26, 0); }
	}
	if( Attr6_Min >= -1.08 ) { 
	if( Attr8_Max < -2.44 ) { 
	if( Attr1_Max >= -8.67 ) { 
		if( Attr2_Mean >= 8.99 ) { return new Prediction("NULL", 19, 6); }
		if( Attr2_Mean < 8.99 ) { return new Prediction("NULL", 417, 1); }
	}
	if( Attr1_Max < -8.67 ) { 
		if( Attr1_Mean < -9.11 ) { return new Prediction("NULL", 1, 0); }
		if( Attr1_Mean >= -9.11 ) { return new Prediction("smoking", 2, 0); }
	}
	}
	if( Attr8_Max >= -2.44 ) { 
	if( Attr5_Mean >= 0 ) { 
		if( Attr5_Max >= 0.01 ) { return new Prediction("NULL", 992, 118); }
		if( Attr5_Max < 0.01 ) { return new Prediction("NULL", 133, 53); }
	}
	if( Attr5_Mean < 0 ) { 
		if( Attr6_Mean < 0 ) { return new Prediction("NULL", 1502, 77); }
		if( Attr6_Mean >= 0 ) { return new Prediction("NULL", 308, 45); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree36() {
	if( Attr4_Max < 0.94 ) { 
	if( Attr3_Mean < 9.04 ) { 
	if( Attr6_Max < 0.48 ) { 
	if( Attr5_Mean >= 0 ) { 
	if( Attr1_Mean >= -9.58 ) { 
		if( Attr6_Max >= -0.01 ) { return new Prediction("NULL", 1074, 125); }
		if( Attr6_Max < -0.01 ) { return new Prediction("NULL", 82, 0); }
	}
		if( Attr1_Mean < -9.58 ) { return new Prediction("smoking", 6, 0); }
	}
	if( Attr5_Mean < 0 ) { 
	if( Attr3_Min >= -2.7 ) { 
		if( Attr5_Min < -0.53 ) { return new Prediction("NULL", 118, 27); }
		if( Attr5_Min >= -0.53 ) { return new Prediction("NULL", 1483, 77); }
	}
	if( Attr3_Min < -2.7 ) { 
		if( Attr5_Min < -0.4 ) { return new Prediction("NULL", 84, 7); }
		if( Attr5_Min >= -0.4 ) { return new Prediction("NULL", 545, 4); }
	}
	}
	}
	if( Attr6_Max >= 0.48 ) { 
	if( Attr2_Mean >= -9.02 ) { 
	if( Attr2_Min < -11.47 ) { 
		if( Attr4_Max < 0.87 ) { return new Prediction("smoking", 59, 23); }
		if( Attr4_Max >= 0.87 ) { return new Prediction("NULL", 11, 1); }
	}
	if( Attr2_Min >= -11.47 ) { 
		if( Attr6_Min < -3.27 ) { return new Prediction("smoking", 4, 0); }
		if( Attr6_Min >= -3.27 ) { return new Prediction("NULL", 281, 45); }
	}
	}
		if( Attr2_Mean < -9.02 ) { return new Prediction("NULL", 48, 0); }
	}
	}
		if( Attr3_Mean >= 9.04 ) { return new Prediction("NULL", 1220, 0); }
	}
	if( Attr4_Max >= 0.94 ) { 
	if( Attr4_Max < 5.69 ) { 
	if( Attr8_Max < 35.96 ) { 
	if( Attr6_Max >= 2.04 ) { 
	if( Attr1_Min < -7.38 ) { 
		if( Attr6_Min < -4.05 ) { return new Prediction("smoking", 368, 89); }
		if( Attr6_Min >= -4.05 ) { return new Prediction("NULL", 570, 279); }
	}
	if( Attr1_Min >= -7.38 ) { 
		if( Attr4_Mean < -0.1 ) { return new Prediction("NULL", 28, 0); }
		if( Attr4_Mean >= -0.1 ) { return new Prediction("NULL", 623, 191); }
	}
	}
	if( Attr6_Max < 2.04 ) { 
	if( Attr9_Min < -1.42 ) { 
		if( Attr5_Mean >= -0.1 ) { return new Prediction("NULL", 1630, 363); }
		if( Attr5_Mean < -0.1 ) { return new Prediction("NULL", 157, 2); }
	}
	if( Attr9_Min >= -1.42 ) { 
		if( Attr9_Min < 22.61 ) { return new Prediction("NULL", 282, 13); }
		if( Attr9_Min >= 22.61 ) { return new Prediction("NULL", 39, 11); }
	}
	}
	}
	if( Attr8_Max >= 35.96 ) { 
	if( Attr3_Mean < 7.23 ) { 
	if( Attr6_Min < -2.34 ) { 
		if( Attr1_Min >= -6.65 ) { return new Prediction("NULL", 457, 147); }
		if( Attr1_Min < -6.65 ) { return new Prediction("smoking", 2078, 501); }
	}
	if( Attr6_Min >= -2.34 ) { 
		if( Attr2_Max < -3.52 ) { return new Prediction("NULL", 272, 27); }
		if( Attr2_Max >= -3.52 ) { return new Prediction("NULL", 1228, 370); }
	}
	}
	if( Attr3_Mean >= 7.23 ) { 
	if( Attr3_Min < 6.94 ) { 
		if( Attr6_Mean < 0.02 ) { return new Prediction("NULL", 188, 24); }
		if( Attr6_Mean >= 0.02 ) { return new Prediction("NULL", 48, 22); }
	}
		if( Attr3_Min >= 6.94 ) { return new Prediction("NULL", 43, 0); }
	}
	}
	}
	if( Attr4_Max >= 5.69 ) { 
	if( Attr1_Max < 0.59 ) { 
	if( Attr2_Max >= 5.38 ) { 
	if( Attr3_Mean >= 2.69 ) { 
		if( Attr1_Min >= -8.49 ) { return new Prediction("NULL", 7, 3); }
		if( Attr1_Min < -8.49 ) { return new Prediction("smoking", 82, 4); }
	}
	if( Attr3_Mean < 2.69 ) { 
		if( Attr3_Mean < -2.59 ) { return new Prediction("smoking", 1, 0); }
		if( Attr3_Mean >= -2.59 ) { return new Prediction("NULL", 7, 0); }
	}
	}
	if( Attr2_Max < 5.38 ) { 
		if( Attr6_Min < -3.94 ) { return new Prediction("smoking", 3, 0); }
	if( Attr6_Min >= -3.94 ) { 
		if( Attr1_Max < -2.24 ) { return new Prediction("NULL", 17, 7); }
		if( Attr1_Max >= -2.24 ) { return new Prediction("NULL", 33, 1); }
	}
	}
	}
	if( Attr1_Max >= 0.59 ) { 
	if( Attr6_Min >= -4.01 ) { 
	if( Attr8_Min < -34.55 ) { 
		if( Attr8_Min < -74.42 ) { return new Prediction("smoking", 8, 3); }
		if( Attr8_Min >= -74.42 ) { return new Prediction("NULL", 152, 11); }
	}
	if( Attr8_Min >= -34.55 ) { 
		if( Attr1_Min >= -4.46 ) { return new Prediction("NULL", 515, 75); }
		if( Attr1_Min < -4.46 ) { return new Prediction("NULL", 903, 224); }
	}
	}
	if( Attr6_Min < -4.01 ) { 
	if( Attr3_Min >= -10.33 ) { 
		if( Attr4_Mean >= 0.07 ) { return new Prediction("smoking", 118, 42); }
		if( Attr4_Mean < 0.07 ) { return new Prediction("NULL", 337, 134); }
	}
	if( Attr3_Min < -10.33 ) { 
		if( Attr2_Min < -19.81 ) { return new Prediction("NULL", 175, 19); }
		if( Attr2_Min >= -19.81 ) { return new Prediction("NULL", 494, 132); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree37() {
	if( Attr6_Min >= -1.98 ) { 
	if( Attr3_Min < 7.05 ) { 
	if( Attr5_Max >= 0.76 ) { 
	if( Attr7_Min >= -34.8 ) { 
	if( Attr9_Mean >= -20.71 ) { 
		if( Attr4_Min >= -3.02 ) { return new Prediction("NULL", 856, 104); }
		if( Attr4_Min < -3.02 ) { return new Prediction("NULL", 611, 134); }
	}
	if( Attr9_Mean < -20.71 ) { 
		if( Attr3_Min < -0.19 ) { return new Prediction("NULL", 333, 61); }
		if( Attr3_Min >= -0.19 ) { return new Prediction("NULL", 236, 90); }
	}
	}
	if( Attr7_Min < -34.8 ) { 
	if( Attr5_Min < -2.27 ) { 
		if( Attr7_Max < 8.33 ) { return new Prediction("NULL", 78, 19); }
		if( Attr7_Max >= 8.33 ) { return new Prediction("smoking", 134, 55); }
	}
	if( Attr5_Min >= -2.27 ) { 
		if( Attr7_Mean >= -19.76 ) { return new Prediction("NULL", 226, 106); }
		if( Attr7_Mean < -19.76 ) { return new Prediction("NULL", 396, 65); }
	}
	}
	}
	if( Attr5_Max < 0.76 ) { 
	if( Attr3_Max >= -3.36 ) { 
	if( Attr4_Max < 0 ) { 
		if( Attr4_Max >= -0.02 ) { return new Prediction("NULL", 214, 77); }
		if( Attr4_Max < -0.02 ) { return new Prediction("NULL", 109, 6); }
	}
	if( Attr4_Max >= 0 ) { 
		if( Attr8_Mean >= 5.86 ) { return new Prediction("NULL", 2354, 289); }
		if( Attr8_Mean < 5.86 ) { return new Prediction("NULL", 1089, 54); }
	}
	}
	if( Attr3_Max < -3.36 ) { 
	if( Attr8_Mean < 41.94 ) { 
		if( Attr5_Mean >= 0 ) { return new Prediction("NULL", 57, 5); }
		if( Attr5_Mean < 0 ) { return new Prediction("NULL", 383, 2); }
	}
	if( Attr8_Mean >= 41.94 ) { 
		if( Attr2_Mean >= -10.08 ) { return new Prediction("NULL", 15, 1); }
		if( Attr2_Mean < -10.08 ) { return new Prediction("smoking", 4, 0); }
	}
	}
	}
	}
	if( Attr3_Min >= 7.05 ) { 
	if( Attr4_Min < -0.02 ) { 
		if( Attr8_Min < -1.21 ) { return new Prediction("NULL", 408, 0); }
	if( Attr8_Min >= -1.21 ) { 
	if( Attr1_Min >= 1.72 ) { 
		if( Attr8_Min >= 14.8 ) { return new Prediction("NULL", 6, 0); }
		if( Attr8_Min < 14.8 ) { return new Prediction("smoking", 12, 2); }
	}
	if( Attr1_Min < 1.72 ) { 
		if( Attr4_Min >= -2.32 ) { return new Prediction("NULL", 260, 8); }
		if( Attr4_Min < -2.32 ) { return new Prediction("smoking", 7, 2); }
	}
	}
	}
		if( Attr4_Min >= -0.02 ) { return new Prediction("NULL", 1032, 0); }
	}
	}
	if( Attr6_Min < -1.98 ) { 
	if( Attr2_Max >= 3.32 ) { 
	if( Attr1_Max < 1.51 ) { 
	if( Attr3_Max >= 13.94 ) { 
		if( Attr6_Mean >= -0.02 ) { return new Prediction("NULL", 15, 0); }
	if( Attr6_Mean < -0.02 ) { 
		if( Attr6_Mean >= -0.03 ) { return new Prediction("smoking", 4, 0); }
		if( Attr6_Mean < -0.03 ) { return new Prediction("NULL", 6, 0); }
	}
	}
	if( Attr3_Max < 13.94 ) { 
	if( Attr3_Mean >= 3.67 ) { 
		if( Attr2_Mean < -2.07 ) { return new Prediction("smoking", 40, 13); }
		if( Attr2_Mean >= -2.07 ) { return new Prediction("smoking", 155, 7); }
	}
	if( Attr3_Mean < 3.67 ) { 
		if( Attr2_Min < -13.29 ) { return new Prediction("smoking", 32, 11); }
		if( Attr2_Min >= -13.29 ) { return new Prediction("NULL", 54, 14); }
	}
	}
	}
	if( Attr1_Max >= 1.51 ) { 
	if( Attr4_Max >= 5.3 ) { 
	if( Attr5_Max >= 4.85 ) { 
		if( Attr7_Min >= -10.44 ) { return new Prediction("NULL", 81, 24); }
		if( Attr7_Min < -10.44 ) { return new Prediction("NULL", 404, 58); }
	}
	if( Attr5_Max < 4.85 ) { 
		if( Attr3_Max < 9.56 ) { return new Prediction("NULL", 182, 80); }
		if( Attr3_Max >= 9.56 ) { return new Prediction("NULL", 1104, 309); }
	}
	}
	if( Attr4_Max < 5.3 ) { 
	if( Attr9_Mean >= -8.23 ) { 
		if( Attr2_Max < 7.16 ) { return new Prediction("smoking", 380, 144); }
		if( Attr2_Max >= 7.16 ) { return new Prediction("NULL", 212, 71); }
	}
	if( Attr9_Mean < -8.23 ) { 
		if( Attr5_Max >= 0.88 ) { return new Prediction("NULL", 583, 198); }
		if( Attr5_Max < 0.88 ) { return new Prediction("NULL", 37, 0); }
	}
	}
	}
	}
	if( Attr2_Max < 3.32 ) { 
	if( Attr7_Min >= -37.56 ) { 
	if( Attr1_Min >= -6.91 ) { 
	if( Attr1_Mean >= 3.07 ) { 
		if( Attr1_Mean >= 9.05 ) { return new Prediction("smoking", 15, 6); }
		if( Attr1_Mean < 9.05 ) { return new Prediction("NULL", 379, 63); }
	}
	if( Attr1_Mean < 3.07 ) { 
		if( Attr7_Mean >= -4.19 ) { return new Prediction("NULL", 250, 59); }
		if( Attr7_Mean < -4.19 ) { return new Prediction("NULL", 138, 59); }
	}
	}
	if( Attr1_Min < -6.91 ) { 
	if( Attr4_Min >= -4.53 ) { 
		if( Attr1_Max >= 7.59 ) { return new Prediction("smoking", 477, 73); }
		if( Attr1_Max < 7.59 ) { return new Prediction("smoking", 533, 183); }
	}
	if( Attr4_Min < -4.53 ) { 
		if( Attr6_Min >= -3.8 ) { return new Prediction("NULL", 223, 81); }
		if( Attr6_Min < -3.8 ) { return new Prediction("smoking", 193, 63); }
	}
	}
	}
	if( Attr7_Min < -37.56 ) { 
	if( Attr2_Mean < -8.45 ) { 
		if( Attr7_Max < 7.03 ) { return new Prediction("NULL", 21, 0); }
	if( Attr7_Max >= 7.03 ) { 
		if( Attr6_Max >= 2.75 ) { return new Prediction("NULL", 17, 0); }
		if( Attr6_Max < 2.75 ) { return new Prediction("smoking", 14, 0); }
	}
	}
	if( Attr2_Mean >= -8.45 ) { 
	if( Attr4_Max >= 5.09 ) { 
		if( Attr5_Mean >= -0.07 ) { return new Prediction("NULL", 257, 95); }
		if( Attr5_Mean < -0.07 ) { return new Prediction("smoking", 61, 20); }
	}
	if( Attr4_Max < 5.09 ) { 
		if( Attr9_Mean < 1.37 ) { return new Prediction("smoking", 560, 166); }
		if( Attr9_Mean >= 1.37 ) { return new Prediction("smoking", 631, 78); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree38() {
	if( Attr6_Min >= -1.98 ) { 
	if( Attr6_Max < 1 ) { 
	if( Attr3_Mean >= 9.25 ) { 
		if( Attr4_Min >= -2.04 ) { return new Prediction("NULL", 1253, 0); }
	if( Attr4_Min < -2.04 ) { 
		if( Attr9_Max < 23.79 ) { return new Prediction("NULL", 7, 0); }
		if( Attr9_Max >= 23.79 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	if( Attr3_Mean < 9.25 ) { 
	if( Attr1_Min >= -8.34 ) { 
	if( Attr5_Max >= 0 ) { 
		if( Attr1_Max >= 7.23 ) { return new Prediction("NULL", 1218, 195); }
		if( Attr1_Max < 7.23 ) { return new Prediction("NULL", 3013, 197); }
	}
	if( Attr5_Max < 0 ) { 
		if( Attr7_Max < -29.98 ) { return new Prediction("NULL", 12, 2); }
		if( Attr7_Max >= -29.98 ) { return new Prediction("NULL", 310, 0); }
	}
	}
	if( Attr1_Min < -8.34 ) { 
	if( Attr9_Min >= -34.87 ) { 
		if( Attr2_Max >= -2.75 ) { return new Prediction("NULL", 413, 46); }
		if( Attr2_Max < -2.75 ) { return new Prediction("NULL", 56, 25); }
	}
	if( Attr9_Min < -34.87 ) { 
		if( Attr2_Mean < -0.46 ) { return new Prediction("NULL", 101, 32); }
		if( Attr2_Mean >= -0.46 ) { return new Prediction("smoking", 57, 12); }
	}
	}
	}
	}
	if( Attr6_Max >= 1 ) { 
	if( Attr2_Max < 0.46 ) { 
	if( Attr7_Min < -36.04 ) { 
	if( Attr5_Min >= -2.44 ) { 
		if( Attr1_Min < -6.53 ) { return new Prediction("smoking", 46, 14); }
		if( Attr1_Min >= -6.53 ) { return new Prediction("NULL", 211, 78); }
	}
	if( Attr5_Min < -2.44 ) { 
		if( Attr9_Max >= 26.48 ) { return new Prediction("smoking", 52, 4); }
		if( Attr9_Max < 26.48 ) { return new Prediction("NULL", 16, 4); }
	}
	}
	if( Attr7_Min >= -36.04 ) { 
	if( Attr1_Min < -6.59 ) { 
		if( Attr1_Max < -0.04 ) { return new Prediction("NULL", 86, 15); }
		if( Attr1_Max >= -0.04 ) { return new Prediction("smoking", 197, 98); }
	}
	if( Attr1_Min >= -6.59 ) { 
		if( Attr3_Mean >= 0.34 ) { return new Prediction("NULL", 355, 97); }
		if( Attr3_Mean < 0.34 ) { return new Prediction("NULL", 195, 22); }
	}
	}
	}
	if( Attr2_Max >= 0.46 ) { 
	if( Attr9_Mean < -11.59 ) { 
	if( Attr8_Min < -26.93 ) { 
		if( Attr1_Max >= -0.88 ) { return new Prediction("NULL", 139, 46); }
		if( Attr1_Max < -0.88 ) { return new Prediction("smoking", 10, 1); }
	}
	if( Attr8_Min >= -26.93 ) { 
		if( Attr1_Max >= 8.41 ) { return new Prediction("NULL", 197, 59); }
		if( Attr1_Max < 8.41 ) { return new Prediction("NULL", 274, 37); }
	}
	}
	if( Attr9_Mean >= -11.59 ) { 
	if( Attr7_Max >= 4.2 ) { 
		if( Attr1_Max >= 7.55 ) { return new Prediction("NULL", 199, 49); }
		if( Attr1_Max < 7.55 ) { return new Prediction("NULL", 195, 19); }
	}
	if( Attr7_Max < 4.2 ) { 
		if( Attr9_Mean >= 12.6 ) { return new Prediction("NULL", 104, 1); }
		if( Attr9_Mean < 12.6 ) { return new Prediction("NULL", 165, 17); }
	}
	}
	}
	}
	}
	if( Attr6_Min < -1.98 ) { 
	if( Attr5_Min < -4.57 ) { 
		if( Attr5_Mean < -1.44 ) { return new Prediction("smoking", 16, 0); }
	if( Attr5_Mean >= -1.44 ) { 
	if( Attr3_Min < -9.96 ) { 
	if( Attr3_Mean < 4.72 ) { 
		if( Attr3_Max >= 19.98 ) { return new Prediction("NULL", 54, 0); }
		if( Attr3_Max < 19.98 ) { return new Prediction("NULL", 493, 92); }
	}
		if( Attr3_Mean >= 4.72 ) { return new Prediction("NULL", 46, 0); }
	}
	if( Attr3_Min >= -9.96 ) { 
	if( Attr1_Min < -8.63 ) { 
		if( Attr9_Max < -13.32 ) { return new Prediction("smoking", 9, 0); }
		if( Attr9_Max >= -13.32 ) { return new Prediction("NULL", 165, 74); }
	}
	if( Attr1_Min >= -8.63 ) { 
		if( Attr8_Min < -28.59 ) { return new Prediction("NULL", 18, 7); }
		if( Attr8_Min >= -28.59 ) { return new Prediction("NULL", 76, 5); }
	}
	}
	}
	}
	if( Attr5_Min >= -4.57 ) { 
	if( Attr9_Mean < 0.23 ) { 
	if( Attr3_Max < 12.07 ) { 
	if( Attr3_Min < -5.81 ) { 
		if( Attr7_Min < -35.09 ) { return new Prediction("NULL", 373, 178); }
		if( Attr7_Min >= -35.09 ) { return new Prediction("NULL", 529, 172); }
	}
	if( Attr3_Min >= -5.81 ) { 
		if( Attr1_Mean < -1.12 ) { return new Prediction("smoking", 708, 192); }
		if( Attr1_Mean >= -1.12 ) { return new Prediction("NULL", 913, 445); }
	}
	}
	if( Attr3_Max >= 12.07 ) { 
	if( Attr3_Min < -0.09 ) { 
		if( Attr1_Min >= -5.58 ) { return new Prediction("NULL", 224, 30); }
		if( Attr1_Min < -5.58 ) { return new Prediction("NULL", 839, 252); }
	}
	if( Attr3_Min >= -0.09 ) { 
		if( Attr1_Min >= -7.36 ) { return new Prediction("NULL", 98, 32); }
		if( Attr1_Min < -7.36 ) { return new Prediction("smoking", 91, 34); }
	}
	}
	}
	if( Attr9_Mean >= 0.23 ) { 
	if( Attr1_Min >= -6.65 ) { 
	if( Attr8_Mean < 35.62 ) { 
		if( Attr4_Max >= 3.35 ) { return new Prediction("NULL", 341, 71); }
		if( Attr4_Max < 3.35 ) { return new Prediction("NULL", 174, 73); }
	}
	if( Attr8_Mean >= 35.62 ) { 
		if( Attr1_Min >= -5.49 ) { return new Prediction("NULL", 31, 0); }
		if( Attr1_Min < -5.49 ) { return new Prediction("NULL", 8, 1); }
	}
	}
	if( Attr1_Min < -6.65 ) { 
	if( Attr4_Max >= 3.62 ) { 
		if( Attr3_Max >= 11.81 ) { return new Prediction("NULL", 264, 83); }
		if( Attr3_Max < 11.81 ) { return new Prediction("smoking", 548, 208); }
	}
	if( Attr4_Max < 3.62 ) { 
		if( Attr1_Max >= -0.26 ) { return new Prediction("smoking", 923, 109); }
		if( Attr1_Max < -0.26 ) { return new Prediction("NULL", 55, 22); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree39() {
	if( Attr1_Min < -6.53 ) { 
	if( Attr3_Max >= 11.98 ) { 
	if( Attr1_Min < -14.33 ) { 
	if( Attr3_Mean < 5.63 ) { 
	if( Attr5_Max < 3.81 ) { 
		if( Attr6_Min < -3.89 ) { return new Prediction("smoking", 162, 79); }
		if( Attr6_Min >= -3.89 ) { return new Prediction("NULL", 160, 20); }
	}
	if( Attr5_Max >= 3.81 ) { 
		if( Attr2_Min >= -20.54 ) { return new Prediction("NULL", 202, 39); }
		if( Attr2_Min < -20.54 ) { return new Prediction("NULL", 135, 7); }
	}
	}
	if( Attr3_Mean >= 5.63 ) { 
		if( Attr4_Mean < -0.12 ) { return new Prediction("smoking", 1, 0); }
	if( Attr4_Mean >= -0.12 ) { 
		if( Attr1_Mean < -2.08 ) { return new Prediction("NULL", 85, 0); }
		if( Attr1_Mean >= -2.08 ) { return new Prediction("NULL", 42, 5); }
	}
	}
	}
	if( Attr1_Min >= -14.33 ) { 
	if( Attr3_Min < -3.21 ) { 
		if( Attr5_Mean < -0.44 ) { return new Prediction("NULL", 17, 0); }
	if( Attr5_Mean >= -0.44 ) { 
		if( Attr2_Mean >= -5.95 ) { return new Prediction("NULL", 550, 204); }
		if( Attr2_Mean < -5.95 ) { return new Prediction("NULL", 294, 52); }
	}
	}
	if( Attr3_Min >= -3.21 ) { 
	if( Attr3_Max >= 12.74 ) { 
		if( Attr4_Max >= 1.61 ) { return new Prediction("NULL", 244, 103); }
		if( Attr4_Max < 1.61 ) { return new Prediction("NULL", 14, 0); }
	}
	if( Attr3_Max < 12.74 ) { 
		if( Attr9_Max >= -29.6 ) { return new Prediction("smoking", 69, 21); }
		if( Attr9_Max < -29.6 ) { return new Prediction("smoking", 17, 0); }
	}
	}
	}
	}
	if( Attr3_Max < 11.98 ) { 
	if( Attr1_Mean >= -7.57 ) { 
	if( Attr6_Max >= 1.41 ) { 
	if( Attr2_Max < 2.18 ) { 
		if( Attr3_Max >= 8.92 ) { return new Prediction("smoking", 462, 205); }
		if( Attr3_Max < 8.92 ) { return new Prediction("smoking", 1458, 250); }
	}
	if( Attr2_Max >= 2.18 ) { 
		if( Attr4_Min >= -4.64 ) { return new Prediction("smoking", 750, 197); }
		if( Attr4_Min < -4.64 ) { return new Prediction("NULL", 726, 342); }
	}
	}
	if( Attr6_Max < 1.41 ) { 
	if( Attr2_Max >= 5.31 ) { 
		if( Attr3_Min >= 0.21 ) { return new Prediction("smoking", 44, 5); }
		if( Attr3_Min < 0.21 ) { return new Prediction("NULL", 29, 6); }
	}
	if( Attr2_Max < 5.31 ) { 
		if( Attr7_Min < -37.47 ) { return new Prediction("smoking", 106, 44); }
		if( Attr7_Min >= -37.47 ) { return new Prediction("NULL", 468, 104); }
	}
	}
	}
	if( Attr1_Mean < -7.57 ) { 
	if( Attr1_Max < 7.48 ) { 
	if( Attr4_Min < -0.01 ) { 
		if( Attr1_Min < -11.05 ) { return new Prediction("NULL", 375, 67); }
		if( Attr1_Min >= -11.05 ) { return new Prediction("NULL", 253, 89); }
	}
	if( Attr4_Min >= -0.01 ) { 
		if( Attr7_Max >= -5.49 ) { return new Prediction("NULL", 121, 0); }
		if( Attr7_Max < -5.49 ) { return new Prediction("NULL", 7, 1); }
	}
	}
	if( Attr1_Max >= 7.48 ) { 
		if( Attr3_Mean < -2.03 ) { return new Prediction("NULL", 2, 0); }
	if( Attr3_Mean >= -2.03 ) { 
		if( Attr2_Max < -0.15 ) { return new Prediction("smoking", 9, 4); }
		if( Attr2_Max >= -0.15 ) { return new Prediction("smoking", 40, 1); }
	}
	}
	}
	}
	}
	if( Attr1_Min >= -6.53 ) { 
	if( Attr3_Min >= 7.33 ) { 
	if( Attr5_Max < 1.21 ) { 
	if( Attr1_Mean < 1.45 ) { 
		if( Attr2_Min >= -4.95 ) { return new Prediction("NULL", 1281, 0); }
	if( Attr2_Min < -4.95 ) { 
		if( Attr6_Max >= 0.02 ) { return new Prediction("NULL", 219, 0); }
		if( Attr6_Max < 0.02 ) { return new Prediction("NULL", 73, 1); }
	}
	}
	if( Attr1_Mean >= 1.45 ) { 
	if( Attr1_Max < 1.82 ) { 
		if( Attr7_Mean >= 17.61 ) { return new Prediction("NULL", 2, 0); }
		if( Attr7_Mean < 17.61 ) { return new Prediction("smoking", 2, 0); }
	}
	if( Attr1_Max >= 1.82 ) { 
		if( Attr7_Max < -18.61 ) { return new Prediction("NULL", 8, 2); }
		if( Attr7_Max >= -18.61 ) { return new Prediction("NULL", 108, 0); }
	}
	}
	}
	if( Attr5_Max >= 1.21 ) { 
		if( Attr8_Mean < 8.73 ) { return new Prediction("NULL", 9, 0); }
	if( Attr8_Mean >= 8.73 ) { 
		if( Attr5_Mean >= 0 ) { return new Prediction("NULL", 4, 0); }
		if( Attr5_Mean < 0 ) { return new Prediction("smoking", 4, 0); }
	}
	}
	}
	if( Attr3_Min < 7.33 ) { 
	if( Attr9_Min < -21.34 ) { 
	if( Attr6_Max >= 0.99 ) { 
	if( Attr4_Mean < -0.16 ) { 
		if( Attr1_Mean < 7.56 ) { return new Prediction("NULL", 61, 0); }
		if( Attr1_Mean >= 7.56 ) { return new Prediction("NULL", 16, 2); }
	}
	if( Attr4_Mean >= -0.16 ) { 
		if( Attr7_Mean >= 3.59 ) { return new Prediction("NULL", 593, 100); }
		if( Attr7_Mean < 3.59 ) { return new Prediction("NULL", 1679, 477); }
	}
	}
	if( Attr6_Max < 0.99 ) { 
	if( Attr8_Mean >= 5.07 ) { 
		if( Attr2_Min < -2.7 ) { return new Prediction("NULL", 1105, 173); }
		if( Attr2_Min >= -2.7 ) { return new Prediction("NULL", 70, 0); }
	}
	if( Attr8_Mean < 5.07 ) { 
		if( Attr7_Max >= -20.26 ) { return new Prediction("NULL", 407, 36); }
		if( Attr7_Max < -20.26 ) { return new Prediction("NULL", 96, 0); }
	}
	}
	}
	if( Attr9_Min >= -21.34 ) { 
	if( Attr5_Min >= -1.59 ) { 
		if( Attr1_Min >= 10.18 ) { return new Prediction("smoking", 5, 0); }
	if( Attr1_Min < 10.18 ) { 
		if( Attr1_Max < 8.35 ) { return new Prediction("NULL", 1855, 105); }
		if( Attr1_Max >= 8.35 ) { return new Prediction("NULL", 946, 120); }
	}
	}
	if( Attr5_Min < -1.59 ) { 
	if( Attr7_Max >= -3.11 ) { 
		if( Attr4_Mean >= -0.09 ) { return new Prediction("NULL", 263, 93); }
		if( Attr4_Mean < -0.09 ) { return new Prediction("NULL", 20, 0); }
	}
	if( Attr7_Max < -3.11 ) { 
		if( Attr4_Min < -2.66 ) { return new Prediction("NULL", 112, 21); }
		if( Attr4_Min >= -2.66 ) { return new Prediction("NULL", 98, 3); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree40() {
	if( Attr4_Max >= 1.18 ) { 
	if( Attr1_Min < -7.32 ) { 
	if( Attr3_Min >= -8.13 ) { 
	if( Attr7_Min < -37.54 ) { 
	if( Attr4_Max < 7.02 ) { 
		if( Attr1_Mean < 6.59 ) { return new Prediction("smoking", 1116, 261); }
		if( Attr1_Mean >= 6.59 ) { return new Prediction("smoking", 143, 0); }
	}
	if( Attr4_Max >= 7.02 ) { 
		if( Attr1_Max >= 1.07 ) { return new Prediction("NULL", 102, 36); }
		if( Attr1_Max < 1.07 ) { return new Prediction("smoking", 9, 0); }
	}
	}
	if( Attr7_Min >= -37.54 ) { 
	if( Attr6_Min < -2.33 ) { 
		if( Attr6_Mean < -0.14 ) { return new Prediction("NULL", 56, 9); }
		if( Attr6_Mean >= -0.14 ) { return new Prediction("smoking", 1507, 503); }
	}
	if( Attr6_Min >= -2.33 ) { 
		if( Attr8_Min >= -22.92 ) { return new Prediction("NULL", 773, 204); }
		if( Attr8_Min < -22.92 ) { return new Prediction("smoking", 173, 77); }
	}
	}
	}
	if( Attr3_Min < -8.13 ) { 
	if( Attr5_Min >= -5.34 ) { 
	if( Attr6_Min >= -2.41 ) { 
		if( Attr8_Mean < -17.85 ) { return new Prediction("NULL", 42, 0); }
		if( Attr8_Mean >= -17.85 ) { return new Prediction("NULL", 407, 97); }
	}
	if( Attr6_Min < -2.41 ) { 
		if( Attr4_Min < -6.32 ) { return new Prediction("NULL", 706, 207); }
		if( Attr4_Min >= -6.32 ) { return new Prediction("smoking", 717, 315); }
	}
	}
	if( Attr5_Min < -5.34 ) { 
	if( Attr7_Max >= 47.71 ) { 
		if( Attr4_Mean >= 0.92 ) { return new Prediction("smoking", 5, 1); }
		if( Attr4_Mean < 0.92 ) { return new Prediction("NULL", 78, 0); }
	}
	if( Attr7_Max < 47.71 ) { 
		if( Attr2_Max >= 19.83 ) { return new Prediction("NULL", 42, 0); }
		if( Attr2_Max < 19.83 ) { return new Prediction("NULL", 257, 69); }
	}
	}
	}
	}
	if( Attr1_Min >= -7.32 ) { 
	if( Attr6_Max < 1 ) { 
	if( Attr7_Max >= -75.3 ) { 
	if( Attr9_Min < 1.25 ) { 
		if( Attr1_Max < 4.86 ) { return new Prediction("NULL", 403, 18); }
		if( Attr1_Max >= 4.86 ) { return new Prediction("NULL", 516, 72); }
	}
		if( Attr9_Min >= 1.25 ) { return new Prediction("NULL", 114, 0); }
	}
	if( Attr7_Max < -75.3 ) { 
		if( Attr1_Mean < 6.87 ) { return new Prediction("smoking", 8, 0); }
		if( Attr1_Mean >= 6.87 ) { return new Prediction("NULL", 1, 0); }
	}
	}
	if( Attr6_Max >= 1 ) { 
		if( Attr6_Mean < -0.17 ) { return new Prediction("NULL", 44, 0); }
	if( Attr6_Mean >= -0.17 ) { 
	if( Attr4_Max >= 6.86 ) { 
		if( Attr7_Max >= -75.23 ) { return new Prediction("NULL", 579, 77); }
		if( Attr7_Max < -75.23 ) { return new Prediction("smoking", 3, 0); }
	}
	if( Attr4_Max < 6.86 ) { 
		if( Attr1_Mean < 3.75 ) { return new Prediction("NULL", 1375, 438); }
		if( Attr1_Mean >= 3.75 ) { return new Prediction("NULL", 1346, 296); }
	}
	}
	}
	}
	}
	if( Attr4_Max < 1.18 ) { 
	if( Attr3_Mean >= 8.88 ) { 
		if( Attr1_Mean < 2.59 ) { return new Prediction("NULL", 1262, 0); }
	if( Attr1_Mean >= 2.59 ) { 
		if( Attr4_Min < -0.74 ) { return new Prediction("smoking", 2, 0); }
		if( Attr4_Min >= -0.74 ) { return new Prediction("NULL", 29, 0); }
	}
	}
	if( Attr3_Mean < 8.88 ) { 
	if( Attr4_Min >= -1.38 ) { 
	if( Attr1_Max >= 8.32 ) { 
	if( Attr1_Mean < 7.13 ) { 
		if( Attr8_Min >= 30.38 ) { return new Prediction("NULL", 14, 3); }
		if( Attr8_Min < 30.38 ) { return new Prediction("smoking", 82, 33); }
	}
	if( Attr1_Mean >= 7.13 ) { 
		if( Attr8_Max >= 6.91 ) { return new Prediction("NULL", 305, 75); }
		if( Attr8_Max < 6.91 ) { return new Prediction("NULL", 265, 10); }
	}
	}
	if( Attr1_Max < 8.32 ) { 
	if( Attr2_Mean < -9.71 ) { 
		if( Attr2_Mean >= -9.8 ) { return new Prediction("smoking", 9, 0); }
		if( Attr2_Mean < -9.8 ) { return new Prediction("NULL", 17, 7); }
	}
	if( Attr2_Mean >= -9.71 ) { 
		if( Attr8_Min < -14.09 ) { return new Prediction("NULL", 569, 11); }
		if( Attr8_Min >= -14.09 ) { return new Prediction("NULL", 2425, 209); }
	}
	}
	}
	if( Attr4_Min < -1.38 ) { 
	if( Attr1_Min < -6.5 ) { 
	if( Attr3_Max < 8.23 ) { 
		if( Attr3_Mean < 4.58 ) { return new Prediction("smoking", 81, 22); }
		if( Attr3_Mean >= 4.58 ) { return new Prediction("NULL", 13, 0); }
	}
	if( Attr3_Max >= 8.23 ) { 
		if( Attr5_Mean < 0.05 ) { return new Prediction("NULL", 26, 1); }
		if( Attr5_Mean >= 0.05 ) { return new Prediction("smoking", 2, 0); }
	}
	}
	if( Attr1_Min >= -6.5 ) { 
		if( Attr4_Mean < -0.12 ) { return new Prediction("NULL", 37, 0); }
	if( Attr4_Mean >= -0.12 ) { 
		if( Attr2_Mean < -8.56 ) { return new Prediction("NULL", 39, 2); }
		if( Attr2_Mean >= -8.56 ) { return new Prediction("NULL", 179, 45); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree41() {
	if( Attr4_Max < 0.95 ) { 
	if( Attr4_Mean >= -0 ) { 
	if( Attr3_Mean < 8.83 ) { 
	if( Attr9_Mean >= 20.55 ) { 
		if( Attr1_Mean >= 0.7 ) { return new Prediction("NULL", 218, 0); }
	if( Attr1_Mean < 0.7 ) { 
		if( Attr1_Max < 0.78 ) { return new Prediction("NULL", 104, 0); }
		if( Attr1_Max >= 0.78 ) { return new Prediction("NULL", 16, 4); }
	}
	}
	if( Attr9_Mean < 20.55 ) { 
	if( Attr2_Mean >= -9.65 ) { 
		if( Attr5_Max >= 0.32 ) { return new Prediction("NULL", 207, 34); }
		if( Attr5_Max < 0.32 ) { return new Prediction("NULL", 1504, 79); }
	}
	if( Attr2_Mean < -9.65 ) { 
		if( Attr7_Min >= -12.45 ) { return new Prediction("smoking", 14, 1); }
		if( Attr7_Min < -12.45 ) { return new Prediction("NULL", 3, 0); }
	}
	}
	}
		if( Attr3_Mean >= 8.83 ) { return new Prediction("NULL", 1036, 0); }
	}
	if( Attr4_Mean < -0 ) { 
	if( Attr1_Min >= -6.31 ) { 
	if( Attr8_Min >= 25.47 ) { 
		if( Attr2_Max < -10.72 ) { return new Prediction("smoking", 2, 0); }
	if( Attr2_Max >= -10.72 ) { 
		if( Attr2_Min < -9.44 ) { return new Prediction("NULL", 110, 9); }
		if( Attr2_Min >= -9.44 ) { return new Prediction("NULL", 327, 3); }
	}
	}
	if( Attr8_Min < 25.47 ) { 
	if( Attr1_Min < 8.03 ) { 
		if( Attr3_Min < 8.48 ) { return new Prediction("NULL", 1051, 113); }
		if( Attr3_Min >= 8.48 ) { return new Prediction("NULL", 250, 1); }
	}
	if( Attr1_Min >= 8.03 ) { 
		if( Attr5_Max >= 0.01 ) { return new Prediction("NULL", 99, 17); }
		if( Attr5_Max < 0.01 ) { return new Prediction("smoking", 26, 3); }
	}
	}
	}
	if( Attr1_Min < -6.31 ) { 
	if( Attr1_Mean >= -1.59 ) { 
		if( Attr6_Min < -2.01 ) { return new Prediction("smoking", 36, 0); }
	if( Attr6_Min >= -2.01 ) { 
		if( Attr3_Max < 4.25 ) { return new Prediction("smoking", 5, 0); }
		if( Attr3_Max >= 4.25 ) { return new Prediction("NULL", 25, 3); }
	}
	}
	if( Attr1_Mean < -1.59 ) { 
	if( Attr6_Min < 0 ) { 
		if( Attr3_Max < 2.63 ) { return new Prediction("NULL", 44, 16); }
		if( Attr3_Max >= 2.63 ) { return new Prediction("NULL", 92, 6); }
	}
	if( Attr6_Min >= 0 ) { 
		if( Attr5_Mean < 0.01 ) { return new Prediction("smoking", 22, 5); }
		if( Attr5_Mean >= 0.01 ) { return new Prediction("NULL", 10, 0); }
	}
	}
	}
	}
	}
	if( Attr4_Max >= 0.95 ) { 
	if( Attr7_Max < 19.23 ) { 
	if( Attr1_Min >= -7.37 ) { 
	if( Attr7_Max >= -9.13 ) { 
	if( Attr5_Min < -0.97 ) { 
		if( Attr8_Min < -30.15 ) { return new Prediction("NULL", 158, 20); }
		if( Attr8_Min >= -30.15 ) { return new Prediction("NULL", 1314, 384); }
	}
	if( Attr5_Min >= -0.97 ) { 
		if( Attr6_Mean < 0.03 ) { return new Prediction("NULL", 398, 39); }
		if( Attr6_Mean >= 0.03 ) { return new Prediction("NULL", 72, 21); }
	}
	}
	if( Attr7_Max < -9.13 ) { 
	if( Attr6_Min < -4.7 ) { 
		if( Attr5_Mean < -0.16 ) { return new Prediction("NULL", 10, 0); }
		if( Attr5_Mean >= -0.16 ) { return new Prediction("smoking", 32, 11); }
	}
	if( Attr6_Min >= -4.7 ) { 
		if( Attr1_Min < 5.81 ) { return new Prediction("NULL", 877, 127); }
		if( Attr1_Min >= 5.81 ) { return new Prediction("NULL", 235, 5); }
	}
	}
	}
	if( Attr1_Min < -7.37 ) { 
	if( Attr2_Mean >= -5.25 ) { 
	if( Attr2_Max >= 1.47 ) { 
		if( Attr6_Mean < -0.29 ) { return new Prediction("NULL", 24, 0); }
		if( Attr6_Mean >= -0.29 ) { return new Prediction("NULL", 412, 204); }
	}
	if( Attr2_Max < 1.47 ) { 
		if( Attr6_Min >= -3.13 ) { return new Prediction("smoking", 64, 25); }
		if( Attr6_Min < -3.13 ) { return new Prediction("smoking", 148, 8); }
	}
	}
	if( Attr2_Mean < -5.25 ) { 
	if( Attr3_Max >= 10.14 ) { 
		if( Attr4_Mean >= -0.03 ) { return new Prediction("NULL", 192, 30); }
		if( Attr4_Mean < -0.03 ) { return new Prediction("NULL", 65, 24); }
	}
	if( Attr3_Max < 10.14 ) { 
		if( Attr6_Max >= 0.77 ) { return new Prediction("NULL", 187, 78); }
		if( Attr6_Max < 0.77 ) { return new Prediction("NULL", 20, 0); }
	}
	}
	}
	}
	if( Attr7_Max >= 19.23 ) { 
	if( Attr6_Min < -2.34 ) { 
	if( Attr4_Min >= -4.53 ) { 
	if( Attr1_Min >= -6.8 ) { 
		if( Attr4_Max < 3.36 ) { return new Prediction("smoking", 92, 43); }
		if( Attr4_Max >= 3.36 ) { return new Prediction("NULL", 126, 29); }
	}
	if( Attr1_Min < -6.8 ) { 
		if( Attr3_Max >= 12.39 ) { return new Prediction("NULL", 224, 82); }
		if( Attr3_Max < 12.39 ) { return new Prediction("smoking", 1674, 278); }
	}
	}
	if( Attr4_Min < -4.53 ) { 
	if( Attr4_Min < -6.63 ) { 
		if( Attr1_Min >= -13.17 ) { return new Prediction("NULL", 532, 194); }
		if( Attr1_Min < -13.17 ) { return new Prediction("NULL", 614, 119); }
	}
	if( Attr4_Min >= -6.63 ) { 
		if( Attr6_Min < -3.17 ) { return new Prediction("smoking", 835, 371); }
		if( Attr6_Min >= -3.17 ) { return new Prediction("NULL", 234, 59); }
	}
	}
	}
	if( Attr6_Min >= -2.34 ) { 
	if( Attr7_Mean < 10.28 ) { 
	if( Attr9_Mean < 21.29 ) { 
		if( Attr1_Min < -2.99 ) { return new Prediction("NULL", 552, 226); }
		if( Attr1_Min >= -2.99 ) { return new Prediction("NULL", 163, 30); }
	}
	if( Attr9_Mean >= 21.29 ) { 
		if( Attr6_Mean >= -0.02 ) { return new Prediction("smoking", 39, 6); }
		if( Attr6_Mean < -0.02 ) { return new Prediction("NULL", 11, 1); }
	}
	}
	if( Attr7_Mean >= 10.28 ) { 
	if( Attr6_Mean >= 0.01 ) { 
		if( Attr8_Max >= 1.16 ) { return new Prediction("NULL", 443, 125); }
		if( Attr8_Max < 1.16 ) { return new Prediction("smoking", 42, 16); }
	}
	if( Attr6_Mean < 0.01 ) { 
		if( Attr5_Max < 1.29 ) { return new Prediction("NULL", 472, 34); }
		if( Attr5_Max >= 1.29 ) { return new Prediction("NULL", 416, 86); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree42() {
	if( Attr6_Max < 1.03 ) { 
	if( Attr5_Max < 0.26 ) { 
	if( Attr1_Max >= 0.61 ) { 
	if( Attr5_Min < 0 ) { 
	if( Attr3_Mean >= -3.9 ) { 
		if( Attr5_Max >= 0.02 ) { return new Prediction("NULL", 1159, 119); }
		if( Attr5_Max < 0.02 ) { return new Prediction("NULL", 466, 9); }
	}
	if( Attr3_Mean < -3.9 ) { 
		if( Attr5_Max >= 0.14 ) { return new Prediction("NULL", 99, 2); }
		if( Attr5_Max < 0.14 ) { return new Prediction("NULL", 209, 0); }
	}
	}
	if( Attr5_Min >= 0 ) { 
	if( Attr4_Max < 0.03 ) { 
		if( Attr4_Mean >= -0.02 ) { return new Prediction("NULL", 138, 46); }
		if( Attr4_Mean < -0.02 ) { return new Prediction("NULL", 21, 0); }
	}
		if( Attr4_Max >= 0.03 ) { return new Prediction("NULL", 105, 0); }
	}
	}
	if( Attr1_Max < 0.61 ) { 
	if( Attr3_Max < 7.85 ) { 
	if( Attr8_Min < -16.94 ) { 
		if( Attr7_Max >= -14.48 ) { return new Prediction("NULL", 177, 0); }
		if( Attr7_Max < -14.48 ) { return new Prediction("NULL", 23, 2); }
	}
	if( Attr8_Min >= -16.94 ) { 
		if( Attr1_Min >= -8.29 ) { return new Prediction("NULL", 439, 24); }
		if( Attr1_Min < -8.29 ) { return new Prediction("NULL", 98, 22); }
	}
	}
	if( Attr3_Max >= 7.85 ) { 
		if( Attr6_Max < 0.01 ) { return new Prediction("NULL", 1103, 0); }
	if( Attr6_Max >= 0.01 ) { 
		if( Attr4_Max >= -0 ) { return new Prediction("NULL", 273, 3); }
		if( Attr4_Max < -0 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	}
	}
	if( Attr5_Max >= 0.26 ) { 
	if( Attr4_Min < -2.34 ) { 
	if( Attr1_Mean >= -4.35 ) { 
	if( Attr8_Max < 25.39 ) { 
		if( Attr6_Max < 0.74 ) { return new Prediction("NULL", 104, 1); }
		if( Attr6_Max >= 0.74 ) { return new Prediction("NULL", 74, 10); }
	}
	if( Attr8_Max >= 25.39 ) { 
		if( Attr1_Min < -7.57 ) { return new Prediction("NULL", 65, 32); }
		if( Attr1_Min >= -7.57 ) { return new Prediction("NULL", 295, 37); }
	}
	}
	if( Attr1_Mean < -4.35 ) { 
	if( Attr8_Min < -22.04 ) { 
		if( Attr3_Min < -4.58 ) { return new Prediction("NULL", 3, 0); }
		if( Attr3_Min >= -4.58 ) { return new Prediction("smoking", 46, 3); }
	}
	if( Attr8_Min >= -22.04 ) { 
		if( Attr1_Min < -14.18 ) { return new Prediction("NULL", 23, 3); }
		if( Attr1_Min >= -14.18 ) { return new Prediction("smoking", 105, 50); }
	}
	}
	}
	if( Attr4_Min >= -2.34 ) { 
	if( Attr8_Max < 4.58 ) { 
	if( Attr2_Max >= 2.67 ) { 
		if( Attr7_Mean < 9.31 ) { return new Prediction("NULL", 51, 0); }
		if( Attr7_Mean >= 9.31 ) { return new Prediction("NULL", 20, 9); }
	}
		if( Attr2_Max < 2.67 ) { return new Prediction("NULL", 168, 0); }
	}
	if( Attr8_Max >= 4.58 ) { 
		if( Attr3_Max < -3.03 ) { return new Prediction("NULL", 124, 0); }
	if( Attr3_Max >= -3.03 ) { 
		if( Attr1_Max < 9.02 ) { return new Prediction("NULL", 1063, 127); }
		if( Attr1_Max >= 9.02 ) { return new Prediction("NULL", 286, 74); }
	}
	}
	}
	}
	}
	if( Attr6_Max >= 1.03 ) { 
	if( Attr7_Max < 22.85 ) { 
	if( Attr6_Max >= 3.56 ) { 
	if( Attr3_Max >= 9.47 ) { 
	if( Attr2_Min < -20.14 ) { 
		if( Attr5_Max < 4.44 ) { return new Prediction("NULL", 31, 0); }
		if( Attr5_Max >= 4.44 ) { return new Prediction("NULL", 22, 4); }
	}
	if( Attr2_Min >= -20.14 ) { 
		if( Attr1_Min >= -7.55 ) { return new Prediction("NULL", 202, 45); }
		if( Attr1_Min < -7.55 ) { return new Prediction("NULL", 284, 125); }
	}
	}
	if( Attr3_Max < 9.47 ) { 
	if( Attr3_Mean < -0.1 ) { 
		if( Attr9_Max >= 14.02 ) { return new Prediction("NULL", 100, 30); }
		if( Attr9_Max < 14.02 ) { return new Prediction("smoking", 90, 25); }
	}
	if( Attr3_Mean >= -0.1 ) { 
		if( Attr6_Min < -4.49 ) { return new Prediction("smoking", 132, 9); }
		if( Attr6_Min >= -4.49 ) { return new Prediction("smoking", 86, 42); }
	}
	}
	}
	if( Attr6_Max < 3.56 ) { 
	if( Attr1_Min >= -6.79 ) { 
	if( Attr1_Mean >= 3.33 ) { 
		if( Attr2_Min < -15.05 ) { return new Prediction("NULL", 265, 24); }
		if( Attr2_Min >= -15.05 ) { return new Prediction("NULL", 916, 191); }
	}
	if( Attr1_Mean < 3.33 ) { 
		if( Attr5_Min >= -0.3 ) { return new Prediction("smoking", 14, 1); }
		if( Attr5_Min < -0.3 ) { return new Prediction("NULL", 835, 249); }
	}
	}
	if( Attr1_Min < -6.79 ) { 
	if( Attr5_Max >= 2.23 ) { 
		if( Attr2_Max < 4.37 ) { return new Prediction("NULL", 159, 53); }
		if( Attr2_Max >= 4.37 ) { return new Prediction("NULL", 165, 29); }
	}
	if( Attr5_Max < 2.23 ) { 
		if( Attr3_Max < 17.9 ) { return new Prediction("NULL", 392, 193); }
		if( Attr3_Max >= 17.9 ) { return new Prediction("NULL", 39, 6); }
	}
	}
	}
	}
	if( Attr7_Max >= 22.85 ) { 
	if( Attr2_Max >= 5.85 ) { 
	if( Attr1_Max >= 1.18 ) { 
	if( Attr2_Mean < -0.76 ) { 
		if( Attr1_Min >= -14.17 ) { return new Prediction("NULL", 766, 280); }
		if( Attr1_Min < -14.17 ) { return new Prediction("NULL", 581, 114); }
	}
	if( Attr2_Mean >= -0.76 ) { 
		if( Attr2_Max < 6.59 ) { return new Prediction("smoking", 5, 2); }
		if( Attr2_Max >= 6.59 ) { return new Prediction("NULL", 112, 7); }
	}
	}
	if( Attr1_Max < 1.18 ) { 
		if( Attr2_Mean >= 3.1 ) { return new Prediction("NULL", 10, 0); }
	if( Attr2_Mean < 3.1 ) { 
		if( Attr3_Mean < 2.57 ) { return new Prediction("NULL", 26, 5); }
		if( Attr3_Mean >= 2.57 ) { return new Prediction("smoking", 127, 16); }
	}
	}
	}
	if( Attr2_Max < 5.85 ) { 
	if( Attr6_Min >= -2.35 ) { 
	if( Attr3_Max < 7.87 ) { 
		if( Attr4_Min < -0.39 ) { return new Prediction("NULL", 438, 162); }
		if( Attr4_Min >= -0.39 ) { return new Prediction("smoking", 21, 2); }
	}
	if( Attr3_Max >= 7.87 ) { 
		if( Attr7_Mean < 5.17 ) { return new Prediction("NULL", 152, 60); }
		if( Attr7_Mean >= 5.17 ) { return new Prediction("NULL", 580, 105); }
	}
	}
	if( Attr6_Min < -2.35 ) { 
	if( Attr5_Min >= -1.31 ) { 
		if( Attr7_Min >= 36.35 ) { return new Prediction("NULL", 8, 2); }
		if( Attr7_Min < 36.35 ) { return new Prediction("smoking", 387, 32); }
	}
	if( Attr5_Min < -1.31 ) { 
		if( Attr4_Min < -4.54 ) { return new Prediction("NULL", 932, 461); }
		if( Attr4_Min >= -4.54 ) { return new Prediction("smoking", 1263, 278); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree43() {
	if( Attr4_Max < 0.94 ) { 
	if( Attr2_Mean < -1.25 ) { 
	if( Attr5_Mean >= 0 ) { 
	if( Attr1_Min >= -7.19 ) { 
	if( Attr8_Mean >= 8.22 ) { 
		if( Attr6_Mean >= 0.06 ) { return new Prediction("NULL", 45, 0); }
		if( Attr6_Mean < 0.06 ) { return new Prediction("NULL", 493, 99); }
	}
	if( Attr8_Mean < 8.22 ) { 
		if( Attr1_Min >= 8.57 ) { return new Prediction("smoking", 8, 3); }
		if( Attr1_Min < 8.57 ) { return new Prediction("NULL", 209, 3); }
	}
	}
	if( Attr1_Min < -7.19 ) { 
	if( Attr3_Mean >= 0.68 ) { 
		if( Attr9_Mean >= 2.39 ) { return new Prediction("NULL", 31, 0); }
		if( Attr9_Mean < 2.39 ) { return new Prediction("NULL", 38, 13); }
	}
	if( Attr3_Mean < 0.68 ) { 
		if( Attr8_Max >= 1.81 ) { return new Prediction("smoking", 52, 14); }
		if( Attr8_Max < 1.81 ) { return new Prediction("NULL", 11, 0); }
	}
	}
	}
	if( Attr5_Mean < 0 ) { 
	if( Attr3_Min >= 3.64 ) { 
		if( Attr8_Mean >= 29.08 ) { return new Prediction("NULL", 189, 0); }
	if( Attr8_Mean < 29.08 ) { 
		if( Attr8_Mean >= 13.72 ) { return new Prediction("NULL", 265, 23); }
		if( Attr8_Mean < 13.72 ) { return new Prediction("NULL", 398, 6); }
	}
	}
	if( Attr3_Min < 3.64 ) { 
	if( Attr3_Min < -3.46 ) { 
		if( Attr2_Max >= -10.21 ) { return new Prediction("NULL", 629, 20); }
		if( Attr2_Max < -10.21 ) { return new Prediction("smoking", 3, 0); }
	}
	if( Attr3_Min >= -3.46 ) { 
		if( Attr7_Mean < -74 ) { return new Prediction("smoking", 10, 1); }
		if( Attr7_Mean >= -74 ) { return new Prediction("NULL", 939, 127); }
	}
	}
	}
	}
	if( Attr2_Mean >= -1.25 ) { 
	if( Attr5_Min >= -0.02 ) { 
		if( Attr6_Max < 0.01 ) { return new Prediction("NULL", 1168, 0); }
	if( Attr6_Max >= 0.01 ) { 
		if( Attr7_Mean < -36.99 ) { return new Prediction("smoking", 1, 0); }
		if( Attr7_Mean >= -36.99 ) { return new Prediction("NULL", 72, 0); }
	}
	}
	if( Attr5_Min < -0.02 ) { 
	if( Attr2_Mean < 9.13 ) { 
	if( Attr6_Mean >= 0.01 ) { 
		if( Attr6_Mean >= 0.01 ) { return new Prediction("NULL", 36, 1); }
		if( Attr6_Mean < 0.01 ) { return new Prediction("smoking", 4, 0); }
	}
	if( Attr6_Mean < 0.01 ) { 
		if( Attr1_Min >= -9.19 ) { return new Prediction("NULL", 446, 3); }
		if( Attr1_Min < -9.19 ) { return new Prediction("NULL", 21, 2); }
	}
	}
	if( Attr2_Mean >= 9.13 ) { 
		if( Attr2_Mean < 9.33 ) { return new Prediction("smoking", 2, 0); }
	if( Attr2_Mean >= 9.33 ) { 
		if( Attr1_Max < 1.37 ) { return new Prediction("smoking", 1, 0); }
		if( Attr1_Max >= 1.37 ) { return new Prediction("NULL", 6, 0); }
	}
	}
	}
	}
	}
	if( Attr4_Max >= 0.94 ) { 
	if( Attr1_Min >= -6.65 ) { 
	if( Attr6_Max >= 1.06 ) { 
	if( Attr3_Min < -5.81 ) { 
	if( Attr1_Min >= 0.64 ) { 
		if( Attr6_Max < 4.54 ) { return new Prediction("NULL", 264, 12); }
		if( Attr6_Max >= 4.54 ) { return new Prediction("smoking", 7, 2); }
	}
	if( Attr1_Min < 0.64 ) { 
		if( Attr8_Max >= 48.21 ) { return new Prediction("NULL", 196, 23); }
		if( Attr8_Max < 48.21 ) { return new Prediction("NULL", 876, 218); }
	}
	}
	if( Attr3_Min >= -5.81 ) { 
	if( Attr1_Max < 4.23 ) { 
		if( Attr9_Mean >= 22.85 ) { return new Prediction("smoking", 12, 3); }
		if( Attr9_Mean < 22.85 ) { return new Prediction("NULL", 326, 48); }
	}
	if( Attr1_Max >= 4.23 ) { 
		if( Attr4_Min < -3.57 ) { return new Prediction("NULL", 539, 117); }
		if( Attr4_Min >= -3.57 ) { return new Prediction("NULL", 935, 361); }
	}
	}
	}
	if( Attr6_Max < 1.06 ) { 
	if( Attr9_Min >= 3.78 ) { 
		if( Attr4_Max < 1.74 ) { return new Prediction("NULL", 78, 0); }
	if( Attr4_Max >= 1.74 ) { 
		if( Attr8_Min < 15.49 ) { return new Prediction("NULL", 31, 0); }
		if( Attr8_Min >= 15.49 ) { return new Prediction("NULL", 16, 2); }
	}
	}
	if( Attr9_Min < 3.78 ) { 
	if( Attr5_Mean >= 0.02 ) { 
		if( Attr3_Max < 14.06 ) { return new Prediction("NULL", 130, 3); }
		if( Attr3_Max >= 14.06 ) { return new Prediction("smoking", 1, 0); }
	}
	if( Attr5_Mean < 0.02 ) { 
		if( Attr7_Min >= -23.93 ) { return new Prediction("NULL", 527, 40); }
		if( Attr7_Min < -23.93 ) { return new Prediction("NULL", 564, 101); }
	}
	}
	}
	}
	if( Attr1_Min < -6.65 ) { 
	if( Attr2_Max < 5.91 ) { 
	if( Attr7_Min >= -36.75 ) { 
	if( Attr1_Min >= -10.57 ) { 
		if( Attr3_Max >= 13.89 ) { return new Prediction("NULL", 111, 19); }
		if( Attr3_Max < 13.89 ) { return new Prediction("smoking", 1339, 495); }
	}
	if( Attr1_Min < -10.57 ) { 
		if( Attr1_Max < 7.7 ) { return new Prediction("NULL", 766, 138); }
		if( Attr1_Max >= 7.7 ) { return new Prediction("smoking", 521, 195); }
	}
	}
	if( Attr7_Min < -36.75 ) { 
	if( Attr6_Min >= -2.71 ) { 
		if( Attr3_Max >= 11.56 ) { return new Prediction("NULL", 71, 20); }
		if( Attr3_Max < 11.56 ) { return new Prediction("smoking", 272, 99); }
	}
	if( Attr6_Min < -2.71 ) { 
		if( Attr2_Min >= -14.6 ) { return new Prediction("smoking", 824, 80); }
		if( Attr2_Min < -14.6 ) { return new Prediction("smoking", 493, 163); }
	}
	}
	}
	if( Attr2_Max >= 5.91 ) { 
	if( Attr1_Min < -13.29 ) { 
	if( Attr1_Min < -20.31 ) { 
		if( Attr7_Max < 60.82 ) { return new Prediction("NULL", 159, 14); }
		if( Attr7_Max >= 60.82 ) { return new Prediction("smoking", 6, 2); }
	}
	if( Attr1_Min >= -20.31 ) { 
		if( Attr8_Mean < 10.93 ) { return new Prediction("NULL", 271, 100); }
		if( Attr8_Mean >= 10.93 ) { return new Prediction("NULL", 467, 98); }
	}
	}
	if( Attr1_Min >= -13.29 ) { 
	if( Attr3_Min < -2.58 ) { 
		if( Attr6_Max >= 3.93 ) { return new Prediction("NULL", 309, 140); }
		if( Attr6_Max < 3.93 ) { return new Prediction("NULL", 410, 112); }
	}
	if( Attr3_Min >= -2.58 ) { 
		if( Attr4_Max < 2.29 ) { return new Prediction("NULL", 32, 5); }
		if( Attr4_Max >= 2.29 ) { return new Prediction("smoking", 248, 69); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree44() {
	if( Attr1_Min >= -6.65 ) { 
	if( Attr3_Mean >= 9.25 ) { 
	if( Attr6_Mean >= 0.01 ) { 
		if( Attr9_Min < -78.78 ) { return new Prediction("smoking", 1, 0); }
	if( Attr9_Min >= -78.78 ) { 
	if( Attr3_Min < 5.51 ) { 
		if( Attr7_Min >= -38.52 ) { return new Prediction("NULL", 6, 0); }
		if( Attr7_Min < -38.52 ) { return new Prediction("smoking", 1, 0); }
	}
		if( Attr3_Min >= 5.51 ) { return new Prediction("NULL", 138, 0); }
	}
	}
		if( Attr6_Mean < 0.01 ) { return new Prediction("NULL", 1181, 0); }
	}
	if( Attr3_Mean < 9.25 ) { 
	if( Attr9_Min >= -11.27 ) { 
	if( Attr6_Min >= -2.84 ) { 
	if( Attr3_Max < -2.51 ) { 
		if( Attr5_Mean >= 0 ) { return new Prediction("NULL", 149, 10); }
		if( Attr5_Mean < 0 ) { return new Prediction("NULL", 402, 3); }
	}
	if( Attr3_Max >= -2.51 ) { 
		if( Attr1_Min >= 10.18 ) { return new Prediction("smoking", 4, 0); }
		if( Attr1_Min < 10.18 ) { return new Prediction("NULL", 1486, 127); }
	}
	}
	if( Attr6_Min < -2.84 ) { 
	if( Attr8_Mean >= -0.29 ) { 
		if( Attr7_Mean >= -0.29 ) { return new Prediction("smoking", 26, 9); }
		if( Attr7_Mean < -0.29 ) { return new Prediction("NULL", 50, 16); }
	}
	if( Attr8_Mean < -0.29 ) { 
		if( Attr1_Mean < 9.08 ) { return new Prediction("NULL", 17, 0); }
		if( Attr1_Mean >= 9.08 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	}
	if( Attr9_Min < -11.27 ) { 
	if( Attr2_Min >= -8.9 ) { 
	if( Attr5_Max >= 0.25 ) { 
		if( Attr1_Max < 4.12 ) { return new Prediction("NULL", 338, 25); }
		if( Attr1_Max >= 4.12 ) { return new Prediction("NULL", 531, 125); }
	}
	if( Attr5_Max < 0.25 ) { 
		if( Attr1_Mean >= 0.07 ) { return new Prediction("NULL", 855, 79); }
		if( Attr1_Mean < 0.07 ) { return new Prediction("NULL", 418, 7); }
	}
	}
	if( Attr2_Min < -8.9 ) { 
	if( Attr7_Min >= -31.15 ) { 
		if( Attr1_Min >= -5.04 ) { return new Prediction("NULL", 1516, 214); }
		if( Attr1_Min < -5.04 ) { return new Prediction("NULL", 329, 79); }
	}
	if( Attr7_Min < -31.15 ) { 
		if( Attr1_Max >= 3.4 ) { return new Prediction("NULL", 1455, 415); }
		if( Attr1_Max < 3.4 ) { return new Prediction("NULL", 137, 9); }
	}
	}
	}
	}
	}
	if( Attr1_Min < -6.65 ) { 
	if( Attr4_Min >= -5.82 ) { 
	if( Attr4_Max < 0.79 ) { 
	if( Attr2_Mean >= -1.28 ) { 
	if( Attr6_Mean < -0 ) { 
		if( Attr1_Mean >= -9.68 ) { return new Prediction("NULL", 14, 1); }
		if( Attr1_Mean < -9.68 ) { return new Prediction("smoking", 1, 0); }
	}
		if( Attr6_Mean >= -0 ) { return new Prediction("NULL", 157, 0); }
	}
	if( Attr2_Mean < -1.28 ) { 
	if( Attr7_Min >= -3.67 ) { 
		if( Attr8_Min >= 0.33 ) { return new Prediction("NULL", 108, 9); }
		if( Attr8_Min < 0.33 ) { return new Prediction("NULL", 41, 14); }
	}
	if( Attr7_Min < -3.67 ) { 
		if( Attr8_Min < -28.25 ) { return new Prediction("NULL", 6, 0); }
		if( Attr8_Min >= -28.25 ) { return new Prediction("smoking", 57, 18); }
	}
	}
	}
	if( Attr4_Max >= 0.79 ) { 
	if( Attr2_Max >= 7.93 ) { 
	if( Attr5_Max < 0.9 ) { 
		if( Attr8_Mean < 32.46 ) { return new Prediction("NULL", 38, 0); }
		if( Attr8_Mean >= 32.46 ) { return new Prediction("smoking", 2, 1); }
	}
	if( Attr5_Max >= 0.9 ) { 
		if( Attr1_Max < 0.27 ) { return new Prediction("smoking", 52, 9); }
		if( Attr1_Max >= 0.27 ) { return new Prediction("NULL", 434, 130); }
	}
	}
	if( Attr2_Max < 7.93 ) { 
	if( Attr6_Min < -2.63 ) { 
		if( Attr7_Max >= 24.93 ) { return new Prediction("smoking", 1913, 337); }
		if( Attr7_Max < 24.93 ) { return new Prediction("smoking", 566, 198); }
	}
	if( Attr6_Min >= -2.63 ) { 
		if( Attr1_Mean >= -7.16 ) { return new Prediction("NULL", 1158, 509); }
		if( Attr1_Mean < -7.16 ) { return new Prediction("NULL", 472, 99); }
	}
	}
	}
	}
	if( Attr4_Min < -5.82 ) { 
	if( Attr3_Max < 10.97 ) { 
	if( Attr2_Mean >= -7.04 ) { 
	if( Attr3_Min < -8.95 ) { 
		if( Attr3_Mean >= 3.55 ) { return new Prediction("NULL", 18, 0); }
		if( Attr3_Mean < 3.55 ) { return new Prediction("NULL", 219, 106); }
	}
	if( Attr3_Min >= -8.95 ) { 
		if( Attr7_Min < -37.65 ) { return new Prediction("smoking", 80, 16); }
		if( Attr7_Min >= -37.65 ) { return new Prediction("smoking", 163, 61); }
	}
	}
	if( Attr2_Mean < -7.04 ) { 
	if( Attr8_Min < 21.51 ) { 
		if( Attr8_Max < 39.67 ) { return new Prediction("NULL", 48, 1); }
		if( Attr8_Max >= 39.67 ) { return new Prediction("NULL", 37, 11); }
	}
		if( Attr8_Min >= 21.51 ) { return new Prediction("smoking", 2, 0); }
	}
	}
	if( Attr3_Max >= 10.97 ) { 
	if( Attr5_Max >= 2.92 ) { 
	if( Attr3_Min >= -20.26 ) { 
		if( Attr8_Mean >= 24.85 ) { return new Prediction("NULL", 194, 23); }
		if( Attr8_Mean < 24.85 ) { return new Prediction("NULL", 612, 161); }
	}
		if( Attr3_Min < -20.26 ) { return new Prediction("NULL", 44, 0); }
	}
	if( Attr5_Max < 2.92 ) { 
	if( Attr1_Mean >= -6.26 ) { 
		if( Attr2_Mean >= -5.59 ) { return new Prediction("NULL", 234, 106); }
		if( Attr2_Mean < -5.59 ) { return new Prediction("NULL", 150, 34); }
	}
		if( Attr1_Mean < -6.26 ) { return new Prediction("NULL", 17, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree45() {
	if( Attr6_Max < 1.03 ) { 
	if( Attr1_Min >= -7.24 ) { 
	if( Attr7_Min >= -7.3 ) { 
	if( Attr6_Min < -0.02 ) { 
	if( Attr3_Mean >= 6.89 ) { 
		if( Attr4_Min < -0.96 ) { return new Prediction("NULL", 112, 8); }
		if( Attr4_Min >= -0.96 ) { return new Prediction("NULL", 288, 2); }
	}
	if( Attr3_Mean < 6.89 ) { 
		if( Attr3_Min < -5.11 ) { return new Prediction("NULL", 266, 9); }
		if( Attr3_Min >= -5.11 ) { return new Prediction("NULL", 667, 75); }
	}
	}
	if( Attr6_Min >= -0.02 ) { 
	if( Attr2_Mean < -1.44 ) { 
		if( Attr2_Mean >= -2.53 ) { return new Prediction("smoking", 3, 1); }
		if( Attr2_Mean < -2.53 ) { return new Prediction("NULL", 303, 8); }
	}
		if( Attr2_Mean >= -1.44 ) { return new Prediction("NULL", 590, 0); }
	}
	}
	if( Attr7_Min < -7.3 ) { 
	if( Attr2_Min < -2.23 ) { 
	if( Attr9_Max < 13.02 ) { 
		if( Attr7_Mean >= -71.06 ) { return new Prediction("NULL", 1544, 219); }
		if( Attr7_Mean < -71.06 ) { return new Prediction("smoking", 36, 15); }
	}
	if( Attr9_Max >= 13.02 ) { 
		if( Attr1_Min < 8.14 ) { return new Prediction("NULL", 1042, 61); }
		if( Attr1_Min >= 8.14 ) { return new Prediction("NULL", 71, 23); }
	}
	}
	if( Attr2_Min >= -2.23 ) { 
	if( Attr2_Mean < 9.17 ) { 
		if( Attr1_Max < 9.82 ) { return new Prediction("NULL", 709, 0); }
		if( Attr1_Max >= 9.82 ) { return new Prediction("NULL", 122, 5); }
	}
	if( Attr2_Mean >= 9.17 ) { 
		if( Attr2_Mean >= 9.29 ) { return new Prediction("NULL", 2, 0); }
		if( Attr2_Mean < 9.29 ) { return new Prediction("smoking", 3, 0); }
	}
	}
	}
	}
	if( Attr1_Min < -7.24 ) { 
	if( Attr2_Max < 4.84 ) { 
	if( Attr2_Mean >= 0.13 ) { 
	if( Attr1_Mean >= -9.68 ) { 
		if( Attr5_Mean >= 0.02 ) { return new Prediction("smoking", 1, 0); }
		if( Attr5_Mean < 0.02 ) { return new Prediction("NULL", 137, 0); }
	}
		if( Attr1_Mean < -9.68 ) { return new Prediction("smoking", 1, 0); }
	}
	if( Attr2_Mean < 0.13 ) { 
	if( Attr1_Max < 0.88 ) { 
		if( Attr3_Max < 2.39 ) { return new Prediction("NULL", 98, 39); }
		if( Attr3_Max >= 2.39 ) { return new Prediction("NULL", 300, 33); }
	}
	if( Attr1_Max >= 0.88 ) { 
		if( Attr8_Max < 33.88 ) { return new Prediction("NULL", 88, 26); }
		if( Attr8_Max >= 33.88 ) { return new Prediction("smoking", 104, 43); }
	}
	}
	}
	if( Attr2_Max >= 4.84 ) { 
	if( Attr9_Min >= -32.82 ) { 
	if( Attr2_Mean >= 0.56 ) { 
		if( Attr4_Max < 2.94 ) { return new Prediction("NULL", 5, 0); }
		if( Attr4_Max >= 2.94 ) { return new Prediction("smoking", 9, 1); }
	}
	if( Attr2_Mean < 0.56 ) { 
		if( Attr2_Min >= -22.53 ) { return new Prediction("NULL", 27, 0); }
		if( Attr2_Min < -22.53 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	if( Attr9_Min < -32.82 ) { 
		if( Attr3_Max < 6.62 ) { return new Prediction("NULL", 8, 0); }
	if( Attr3_Max >= 6.62 ) { 
		if( Attr3_Mean < 7.36 ) { return new Prediction("smoking", 66, 3); }
		if( Attr3_Mean >= 7.36 ) { return new Prediction("NULL", 6, 2); }
	}
	}
	}
	}
	}
	if( Attr6_Max >= 1.03 ) { 
	if( Attr3_Mean >= 7.14 ) { 
		if( Attr1_Mean < -4.68 ) { return new Prediction("NULL", 37, 0); }
	if( Attr1_Mean >= -4.68 ) { 
	if( Attr3_Mean >= 8.04 ) { 
	if( Attr1_Min < -7.44 ) { 
		if( Attr6_Min < -3.94 ) { return new Prediction("NULL", 21, 0); }
		if( Attr6_Min >= -3.94 ) { return new Prediction("NULL", 57, 28); }
	}
	if( Attr1_Min >= -7.44 ) { 
		if( Attr5_Max < 0.78 ) { return new Prediction("NULL", 70, 0); }
		if( Attr5_Max >= 0.78 ) { return new Prediction("NULL", 218, 35); }
	}
	}
	if( Attr3_Mean < 8.04 ) { 
	if( Attr1_Min < -14.1 ) { 
		if( Attr2_Mean >= -4.47 ) { return new Prediction("NULL", 28, 0); }
		if( Attr2_Mean < -4.47 ) { return new Prediction("smoking", 2, 0); }
	}
	if( Attr1_Min >= -14.1 ) { 
		if( Attr2_Mean < -5.11 ) { return new Prediction("NULL", 83, 11); }
		if( Attr2_Mean >= -5.11 ) { return new Prediction("NULL", 192, 82); }
	}
	}
	}
	}
	if( Attr3_Mean < 7.14 ) { 
	if( Attr1_Min < -6.63 ) { 
	if( Attr2_Min >= -15.56 ) { 
	if( Attr1_Max >= 6.64 ) { 
		if( Attr3_Max >= 11.22 ) { return new Prediction("NULL", 404, 175); }
		if( Attr3_Max < 11.22 ) { return new Prediction("smoking", 1703, 266); }
	}
	if( Attr1_Max < 6.64 ) { 
		if( Attr6_Max < 1.65 ) { return new Prediction("NULL", 312, 88); }
		if( Attr6_Max >= 1.65 ) { return new Prediction("smoking", 1034, 458); }
	}
	}
	if( Attr2_Min < -15.56 ) { 
	if( Attr4_Max < 4.04 ) { 
		if( Attr4_Min < -2.4 ) { return new Prediction("smoking", 480, 178); }
		if( Attr4_Min >= -2.4 ) { return new Prediction("NULL", 78, 19); }
	}
	if( Attr4_Max >= 4.04 ) { 
		if( Attr2_Min < -19.79 ) { return new Prediction("NULL", 375, 75); }
		if( Attr2_Min >= -19.79 ) { return new Prediction("NULL", 1292, 414); }
	}
	}
	}
	if( Attr1_Min >= -6.63 ) { 
	if( Attr9_Max >= 13.77 ) { 
	if( Attr6_Min >= -4.57 ) { 
		if( Attr1_Mean >= 3.61 ) { return new Prediction("NULL", 934, 104); }
		if( Attr1_Mean < 3.61 ) { return new Prediction("NULL", 624, 153); }
	}
	if( Attr6_Min < -4.57 ) { 
		if( Attr5_Max < 3.76 ) { return new Prediction("smoking", 112, 55); }
		if( Attr5_Max >= 3.76 ) { return new Prediction("NULL", 49, 5); }
	}
	}
	if( Attr9_Max < 13.77 ) { 
	if( Attr4_Mean >= -0.09 ) { 
		if( Attr4_Max >= 3.25 ) { return new Prediction("NULL", 541, 136); }
		if( Attr4_Max < 3.25 ) { return new Prediction("NULL", 528, 234); }
	}
	if( Attr4_Mean < -0.09 ) { 
		if( Attr4_Min < -6.94 ) { return new Prediction("NULL", 17, 3); }
		if( Attr4_Min >= -6.94 ) { return new Prediction("NULL", 78, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree46() {
	if( Attr7_Max >= 37.33 ) { 
	if( Attr6_Max < 1.19 ) { 
	if( Attr2_Min >= -1.6 ) { 
		if( Attr4_Min >= -0.04 ) { return new Prediction("NULL", 294, 0); }
	if( Attr4_Min < -0.04 ) { 
		if( Attr4_Min >= -0.04 ) { return new Prediction("smoking", 1, 0); }
		if( Attr4_Min < -0.04 ) { return new Prediction("NULL", 33, 0); }
	}
	}
	if( Attr2_Min < -1.6 ) { 
	if( Attr6_Min < -1.4 ) { 
	if( Attr5_Min < -0.48 ) { 
		if( Attr8_Max < 19.24 ) { return new Prediction("NULL", 21, 0); }
		if( Attr8_Max >= 19.24 ) { return new Prediction("smoking", 103, 45); }
	}
		if( Attr5_Min >= -0.48 ) { return new Prediction("smoking", 13, 0); }
	}
	if( Attr6_Min >= -1.4 ) { 
	if( Attr1_Max >= 7.79 ) { 
		if( Attr6_Max >= 0.93 ) { return new Prediction("NULL", 10, 1); }
		if( Attr6_Max < 0.93 ) { return new Prediction("smoking", 43, 13); }
	}
	if( Attr1_Max < 7.79 ) { 
		if( Attr2_Max < 3.1 ) { return new Prediction("NULL", 467, 28); }
		if( Attr2_Max >= 3.1 ) { return new Prediction("smoking", 48, 22); }
	}
	}
	}
	}
	if( Attr6_Max >= 1.19 ) { 
	if( Attr3_Max >= 11.12 ) { 
	if( Attr5_Max < 4.83 ) { 
	if( Attr3_Max < 13.93 ) { 
		if( Attr4_Min < -9.52 ) { return new Prediction("NULL", 48, 6); }
		if( Attr4_Min >= -9.52 ) { return new Prediction("NULL", 427, 209); }
	}
	if( Attr3_Max >= 13.93 ) { 
		if( Attr4_Min < -18.37 ) { return new Prediction("smoking", 15, 2); }
		if( Attr4_Min >= -18.37 ) { return new Prediction("NULL", 372, 90); }
	}
	}
	if( Attr5_Max >= 4.83 ) { 
	if( Attr7_Mean < -12.34 ) { 
		if( Attr2_Mean < -4.4 ) { return new Prediction("smoking", 13, 2); }
		if( Attr2_Mean >= -4.4 ) { return new Prediction("NULL", 5, 0); }
	}
	if( Attr7_Mean >= -12.34 ) { 
		if( Attr9_Max >= 38.34 ) { return new Prediction("NULL", 89, 0); }
		if( Attr9_Max < 38.34 ) { return new Prediction("NULL", 114, 13); }
	}
	}
	}
	if( Attr3_Max < 11.12 ) { 
	if( Attr1_Min >= -6.44 ) { 
	if( Attr3_Mean < 0.21 ) { 
		if( Attr4_Min >= -2.75 ) { return new Prediction("smoking", 28, 8); }
		if( Attr4_Min < -2.75 ) { return new Prediction("NULL", 46, 11); }
	}
	if( Attr3_Mean >= 0.21 ) { 
		if( Attr1_Max >= -1.33 ) { return new Prediction("NULL", 89, 11); }
		if( Attr1_Max < -1.33 ) { return new Prediction("smoking", 4, 0); }
	}
	}
	if( Attr1_Min < -6.44 ) { 
	if( Attr7_Min >= -35.8 ) { 
		if( Attr7_Mean < 33.51 ) { return new Prediction("smoking", 752, 230); }
		if( Attr7_Mean >= 33.51 ) { return new Prediction("NULL", 222, 75); }
	}
	if( Attr7_Min < -35.8 ) { 
		if( Attr3_Min < -14.51 ) { return new Prediction("NULL", 23, 2); }
		if( Attr3_Min >= -14.51 ) { return new Prediction("smoking", 843, 99); }
	}
	}
	}
	}
	}
	if( Attr7_Max < 37.33 ) { 
	if( Attr4_Min < -1.7 ) { 
	if( Attr6_Mean < -0.15 ) { 
	if( Attr7_Max < 28.54 ) { 
	if( Attr3_Mean < 7.3 ) { 
		if( Attr8_Min < 32.29 ) { return new Prediction("NULL", 169, 2); }
		if( Attr8_Min >= 32.29 ) { return new Prediction("smoking", 2, 1); }
	}
	if( Attr3_Mean >= 7.3 ) { 
		if( Attr1_Mean < 1.58 ) { return new Prediction("NULL", 3, 0); }
		if( Attr1_Mean >= 1.58 ) { return new Prediction("smoking", 2, 0); }
	}
	}
	if( Attr7_Max >= 28.54 ) { 
		if( Attr9_Min < -55.28 ) { return new Prediction("smoking", 4, 0); }
	if( Attr9_Min >= -55.28 ) { 
		if( Attr1_Mean >= -7.25 ) { return new Prediction("NULL", 22, 1); }
		if( Attr1_Mean < -7.25 ) { return new Prediction("smoking", 7, 3); }
	}
	}
	}
	if( Attr6_Mean >= -0.15 ) { 
	if( Attr1_Min >= -7.42 ) { 
	if( Attr9_Max < 15.27 ) { 
		if( Attr7_Mean >= 11.62 ) { return new Prediction("NULL", 302, 45); }
		if( Attr7_Mean < 11.62 ) { return new Prediction("NULL", 1307, 414); }
	}
	if( Attr9_Max >= 15.27 ) { 
		if( Attr2_Mean < -6.08 ) { return new Prediction("NULL", 758, 153); }
		if( Attr2_Mean >= -6.08 ) { return new Prediction("NULL", 907, 107); }
	}
	}
	if( Attr1_Min < -7.42 ) { 
	if( Attr4_Max < 5.62 ) { 
		if( Attr6_Max < 4.03 ) { return new Prediction("smoking", 1211, 595); }
		if( Attr6_Max >= 4.03 ) { return new Prediction("smoking", 596, 128); }
	}
	if( Attr4_Max >= 5.62 ) { 
		if( Attr3_Min >= -1.99 ) { return new Prediction("smoking", 100, 20); }
		if( Attr3_Min < -1.99 ) { return new Prediction("NULL", 809, 257); }
	}
	}
	}
	}
	if( Attr4_Min >= -1.7 ) { 
	if( Attr2_Min < -10.48 ) { 
	if( Attr6_Min < -3.96 ) { 
		if( Attr1_Min < 1.12 ) { return new Prediction("smoking", 33, 0); }
		if( Attr1_Min >= 1.12 ) { return new Prediction("NULL", 1, 0); }
	}
	if( Attr6_Min >= -3.96 ) { 
		if( Attr9_Mean >= 64.68 ) { return new Prediction("smoking", 11, 0); }
	if( Attr9_Mean < 64.68 ) { 
		if( Attr6_Max >= 2.06 ) { return new Prediction("smoking", 141, 65); }
		if( Attr6_Max < 2.06 ) { return new Prediction("NULL", 552, 81); }
	}
	}
	}
	if( Attr2_Min >= -10.48 ) { 
	if( Attr1_Max < 2.98 ) { 
	if( Attr1_Mean >= -3.97 ) { 
		if( Attr3_Min < 8.27 ) { return new Prediction("NULL", 1512, 66); }
		if( Attr3_Min >= 8.27 ) { return new Prediction("NULL", 1056, 0); }
	}
	if( Attr1_Mean < -3.97 ) { 
		if( Attr7_Max < 34.37 ) { return new Prediction("NULL", 268, 40); }
		if( Attr7_Max >= 34.37 ) { return new Prediction("NULL", 80, 0); }
	}
	}
	if( Attr1_Max >= 2.98 ) { 
	if( Attr1_Mean >= -1.14 ) { 
		if( Attr9_Mean >= 7.06 ) { return new Prediction("NULL", 552, 26); }
		if( Attr9_Mean < 7.06 ) { return new Prediction("NULL", 1328, 165); }
	}
	if( Attr1_Mean < -1.14 ) { 
		if( Attr1_Max < 7.76 ) { return new Prediction("NULL", 10, 2); }
		if( Attr1_Max >= 7.76 ) { return new Prediction("smoking", 12, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree47() {
	if( Attr4_Min < -1.27 ) { 
	if( Attr6_Min < -2.22 ) { 
	if( Attr1_Min < -6.73 ) { 
	if( Attr1_Min < -10.27 ) { 
	if( Attr4_Max >= 5.19 ) { 
		if( Attr8_Max < 14.03 ) { return new Prediction("smoking", 92, 41); }
		if( Attr8_Max >= 14.03 ) { return new Prediction("NULL", 1194, 333); }
	}
	if( Attr4_Max < 5.19 ) { 
		if( Attr2_Max >= 4.26 ) { return new Prediction("NULL", 418, 196); }
		if( Attr2_Max < 4.26 ) { return new Prediction("smoking", 1086, 249); }
	}
	}
	if( Attr1_Min >= -10.27 ) { 
	if( Attr7_Max < 39.85 ) { 
		if( Attr3_Max < 12.19 ) { return new Prediction("smoking", 900, 242); }
		if( Attr3_Max >= 12.19 ) { return new Prediction("NULL", 386, 137); }
	}
	if( Attr7_Max >= 39.85 ) { 
		if( Attr7_Max >= 46.64 ) { return new Prediction("smoking", 150, 62); }
		if( Attr7_Max < 46.64 ) { return new Prediction("smoking", 647, 60); }
	}
	}
	}
	if( Attr1_Min >= -6.73 ) { 
	if( Attr4_Max < 3.34 ) { 
	if( Attr3_Min >= 2.45 ) { 
		if( Attr7_Min < -45.21 ) { return new Prediction("NULL", 7, 1); }
		if( Attr7_Min >= -45.21 ) { return new Prediction("smoking", 28, 5); }
	}
	if( Attr3_Min < 2.45 ) { 
		if( Attr7_Mean < -34.68 ) { return new Prediction("smoking", 56, 20); }
		if( Attr7_Mean >= -34.68 ) { return new Prediction("NULL", 397, 105); }
	}
	}
	if( Attr4_Max >= 3.34 ) { 
	if( Attr4_Min >= -12.92 ) { 
		if( Attr7_Mean >= -37.06 ) { return new Prediction("NULL", 1006, 195); }
		if( Attr7_Mean < -37.06 ) { return new Prediction("NULL", 51, 21); }
	}
		if( Attr4_Min < -12.92 ) { return new Prediction("NULL", 38, 0); }
	}
	}
	}
	if( Attr6_Min >= -2.22 ) { 
	if( Attr7_Max < 0.99 ) { 
	if( Attr1_Min >= -7.42 ) { 
	if( Attr2_Mean < -1.25 ) { 
		if( Attr9_Mean < 0.44 ) { return new Prediction("NULL", 566, 134); }
		if( Attr9_Mean >= 0.44 ) { return new Prediction("NULL", 453, 39); }
	}
	if( Attr2_Mean >= -1.25 ) { 
		if( Attr5_Max < 0.22 ) { return new Prediction("NULL", 5, 1); }
		if( Attr5_Max >= 0.22 ) { return new Prediction("NULL", 112, 0); }
	}
	}
	if( Attr1_Min < -7.42 ) { 
	if( Attr2_Min < -11.37 ) { 
		if( Attr9_Mean >= 75.92 ) { return new Prediction("smoking", 2, 0); }
		if( Attr9_Mean < 75.92 ) { return new Prediction("NULL", 84, 9); }
	}
	if( Attr2_Min >= -11.37 ) { 
		if( Attr7_Mean >= -29.34 ) { return new Prediction("smoking", 24, 1); }
		if( Attr7_Mean < -29.34 ) { return new Prediction("NULL", 17, 8); }
	}
	}
	}
	if( Attr7_Max >= 0.99 ) { 
	if( Attr3_Mean < 7.29 ) { 
	if( Attr1_Min >= -12.77 ) { 
		if( Attr5_Max >= 0.82 ) { return new Prediction("NULL", 1523, 540); }
		if( Attr5_Max < 0.82 ) { return new Prediction("NULL", 371, 71); }
	}
	if( Attr1_Min < -12.77 ) { 
		if( Attr9_Max >= 28.58 ) { return new Prediction("NULL", 83, 25); }
		if( Attr9_Max < 28.58 ) { return new Prediction("NULL", 256, 13); }
	}
	}
	if( Attr3_Mean >= 7.29 ) { 
	if( Attr9_Min >= -33.61 ) { 
		if( Attr6_Min < -1.58 ) { return new Prediction("NULL", 39, 5); }
		if( Attr6_Min >= -1.58 ) { return new Prediction("NULL", 80, 0); }
	}
	if( Attr9_Min < -33.61 ) { 
		if( Attr7_Mean >= 17.24 ) { return new Prediction("NULL", 44, 0); }
		if( Attr7_Mean < 17.24 ) { return new Prediction("NULL", 166, 37); }
	}
	}
	}
	}
	}
	if( Attr4_Min >= -1.27 ) { 
	if( Attr2_Min >= -10.56 ) { 
	if( Attr3_Min < 7.1 ) { 
	if( Attr5_Max < 2.18 ) { 
	if( Attr5_Max >= 0 ) { 
		if( Attr3_Mean >= -2.4 ) { return new Prediction("NULL", 2297, 291); }
		if( Attr3_Mean < -2.4 ) { return new Prediction("NULL", 917, 36); }
	}
		if( Attr5_Max < 0 ) { return new Prediction("NULL", 249, 0); }
	}
	if( Attr5_Max >= 2.18 ) { 
		if( Attr3_Min >= 1 ) { return new Prediction("smoking", 12, 0); }
	if( Attr3_Min < 1 ) { 
		if( Attr6_Max < 1.54 ) { return new Prediction("smoking", 9, 2); }
		if( Attr6_Max >= 1.54 ) { return new Prediction("NULL", 6, 0); }
	}
	}
	}
	if( Attr3_Min >= 7.1 ) { 
	if( Attr3_Mean < 8.93 ) { 
	if( Attr9_Max >= -23.88 ) { 
		if( Attr9_Mean < -15.14 ) { return new Prediction("NULL", 109, 3); }
		if( Attr9_Mean >= -15.14 ) { return new Prediction("NULL", 154, 0); }
	}
	if( Attr9_Max < -23.88 ) { 
		if( Attr6_Mean < 0 ) { return new Prediction("NULL", 69, 9); }
		if( Attr6_Mean >= 0 ) { return new Prediction("NULL", 43, 0); }
	}
	}
		if( Attr3_Mean >= 8.93 ) { return new Prediction("NULL", 1227, 0); }
	}
	}
	if( Attr2_Min < -10.56 ) { 
	if( Attr2_Min < -14.38 ) { 
	if( Attr1_Min >= -4.18 ) { 
		if( Attr9_Max >= 10.16 ) { return new Prediction("NULL", 14, 0); }
	if( Attr9_Max < 10.16 ) { 
		if( Attr6_Max < 0.84 ) { return new Prediction("NULL", 9, 1); }
		if( Attr6_Max >= 0.84 ) { return new Prediction("smoking", 11, 1); }
	}
	}
	if( Attr1_Min < -4.18 ) { 
		if( Attr1_Mean >= 5.56 ) { return new Prediction("smoking", 2, 0); }
	if( Attr1_Mean < 5.56 ) { 
		if( Attr5_Mean < 0.01 ) { return new Prediction("NULL", 53, 0); }
		if( Attr5_Mean >= 0.01 ) { return new Prediction("NULL", 6, 1); }
	}
	}
	}
	if( Attr2_Min >= -14.38 ) { 
	if( Attr2_Min >= -12.99 ) { 
	if( Attr1_Max >= 7.35 ) { 
		if( Attr6_Max < 2.37 ) { return new Prediction("NULL", 76, 27); }
		if( Attr6_Max >= 2.37 ) { return new Prediction("smoking", 31, 4); }
	}
	if( Attr1_Max < 7.35 ) { 
		if( Attr2_Max >= -3.03 ) { return new Prediction("NULL", 55, 22); }
		if( Attr2_Max < -3.03 ) { return new Prediction("NULL", 167, 27); }
	}
	}
	if( Attr2_Min < -12.99 ) { 
	if( Attr5_Mean < 0.01 ) { 
		if( Attr4_Max >= 0.84 ) { return new Prediction("smoking", 37, 12); }
		if( Attr4_Max < 0.84 ) { return new Prediction("smoking", 14, 0); }
	}
	if( Attr5_Mean >= 0.01 ) { 
		if( Attr2_Max < -0.9 ) { return new Prediction("smoking", 13, 5); }
		if( Attr2_Max >= -0.9 ) { return new Prediction("NULL", 17, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree48() {
	if( Attr5_Min >= -0.58 ) { 
	if( Attr5_Mean >= 0 ) { 
	if( Attr6_Min < -2.47 ) { 
	if( Attr7_Max >= 28.52 ) { 
		if( Attr3_Min >= -6.22 ) { return new Prediction("smoking", 20, 0); }
	if( Attr3_Min < -6.22 ) { 
		if( Attr1_Mean < 0.49 ) { return new Prediction("smoking", 1, 0); }
		if( Attr1_Mean >= 0.49 ) { return new Prediction("NULL", 1, 0); }
	}
	}
	if( Attr7_Max < 28.52 ) { 
	if( Attr7_Mean >= -17.28 ) { 
		if( Attr1_Min >= -7.35 ) { return new Prediction("NULL", 8, 0); }
		if( Attr1_Min < -7.35 ) { return new Prediction("smoking", 2, 0); }
	}
	if( Attr7_Mean < -17.28 ) { 
		if( Attr4_Mean >= -0.08 ) { return new Prediction("smoking", 13, 0); }
		if( Attr4_Mean < -0.08 ) { return new Prediction("NULL", 1, 0); }
	}
	}
	}
	if( Attr6_Min >= -2.47 ) { 
	if( Attr3_Min >= 7.03 ) { 
	if( Attr6_Max < 1.15 ) { 
		if( Attr2_Max >= -9.92 ) { return new Prediction("NULL", 368, 0); }
		if( Attr2_Max < -9.92 ) { return new Prediction("smoking", 1, 0); }
	}
	if( Attr6_Max >= 1.15 ) { 
		if( Attr2_Max < -5.11 ) { return new Prediction("smoking", 1, 0); }
		if( Attr2_Max >= -5.11 ) { return new Prediction("NULL", 4, 0); }
	}
	}
	if( Attr3_Min < 7.03 ) { 
	if( Attr5_Max >= 0.01 ) { 
		if( Attr4_Min < 0.09 ) { return new Prediction("NULL", 1076, 150); }
		if( Attr4_Min >= 0.09 ) { return new Prediction("NULL", 123, 0); }
	}
	if( Attr5_Max < 0.01 ) { 
		if( Attr2_Mean < -7.23 ) { return new Prediction("NULL", 47, 8); }
		if( Attr2_Mean >= -7.23 ) { return new Prediction("smoking", 76, 29); }
	}
	}
	}
	}
	if( Attr5_Mean < 0 ) { 
	if( Attr1_Max >= 0.55 ) { 
	if( Attr1_Mean < -1.6 ) { 
	if( Attr1_Min >= -10.56 ) { 
		if( Attr3_Min >= -1.76 ) { return new Prediction("NULL", 19, 8); }
		if( Attr3_Min < -1.76 ) { return new Prediction("smoking", 6, 0); }
	}
		if( Attr1_Min < -10.56 ) { return new Prediction("NULL", 8, 0); }
	}
	if( Attr1_Mean >= -1.6 ) { 
	if( Attr7_Mean < -76.64 ) { 
		if( Attr2_Max >= -4.44 ) { return new Prediction("NULL", 18, 0); }
		if( Attr2_Max < -4.44 ) { return new Prediction("smoking", 17, 0); }
	}
	if( Attr7_Mean >= -76.64 ) { 
		if( Attr8_Mean >= 6.97 ) { return new Prediction("NULL", 1239, 97); }
		if( Attr8_Mean < 6.97 ) { return new Prediction("NULL", 597, 16); }
	}
	}
	}
	if( Attr1_Max < 0.55 ) { 
		if( Attr2_Min >= -3.16 ) { return new Prediction("NULL", 1039, 0); }
	if( Attr2_Min < -3.16 ) { 
	if( Attr7_Mean < 36.4 ) { 
		if( Attr2_Min < -9.68 ) { return new Prediction("NULL", 91, 20); }
		if( Attr2_Min >= -9.68 ) { return new Prediction("NULL", 586, 12); }
	}
	if( Attr7_Mean >= 36.4 ) { 
		if( Attr4_Min >= -0.7 ) { return new Prediction("smoking", 14, 7); }
		if( Attr4_Min < -0.7 ) { return new Prediction("NULL", 11, 0); }
	}
	}
	}
	}
	}
	if( Attr5_Min < -0.58 ) { 
	if( Attr1_Mean >= -1.16 ) { 
	if( Attr5_Max >= 0.03 ) { 
	if( Attr6_Max >= 2.04 ) { 
	if( Attr2_Max < 4.17 ) { 
		if( Attr7_Max < 23.48 ) { return new Prediction("NULL", 1239, 477); }
		if( Attr7_Max >= 23.48 ) { return new Prediction("smoking", 1154, 418); }
	}
	if( Attr2_Max >= 4.17 ) { 
		if( Attr3_Max < 12.55 ) { return new Prediction("NULL", 810, 261); }
		if( Attr3_Max >= 12.55 ) { return new Prediction("NULL", 920, 203); }
	}
	}
	if( Attr6_Max < 2.04 ) { 
	if( Attr1_Min >= -7.05 ) { 
		if( Attr4_Mean < -0.07 ) { return new Prediction("NULL", 156, 5); }
		if( Attr4_Mean >= -0.07 ) { return new Prediction("NULL", 1898, 369); }
	}
	if( Attr1_Min < -7.05 ) { 
		if( Attr1_Max >= 10.97 ) { return new Prediction("NULL", 100, 21); }
		if( Attr1_Max < 10.97 ) { return new Prediction("smoking", 283, 104); }
	}
	}
	}
		if( Attr5_Max < 0.03 ) { return new Prediction("NULL", 124, 0); }
	}
	if( Attr1_Mean < -1.16 ) { 
	if( Attr6_Min >= -2.24 ) { 
	if( Attr5_Max >= 1.02 ) { 
	if( Attr2_Mean < -0.82 ) { 
		if( Attr4_Min < -1.51 ) { return new Prediction("NULL", 655, 145); }
		if( Attr4_Min >= -1.51 ) { return new Prediction("NULL", 101, 6); }
	}
	if( Attr2_Mean >= -0.82 ) { 
		if( Attr3_Max >= 5.87 ) { return new Prediction("smoking", 103, 13); }
		if( Attr3_Max < 5.87 ) { return new Prediction("NULL", 5, 0); }
	}
	}
	if( Attr5_Max < 1.02 ) { 
	if( Attr3_Mean >= 2.07 ) { 
		if( Attr4_Min < -2.21 ) { return new Prediction("NULL", 91, 35); }
		if( Attr4_Min >= -2.21 ) { return new Prediction("NULL", 128, 13); }
	}
	if( Attr3_Mean < 2.07 ) { 
		if( Attr9_Max >= 34.33 ) { return new Prediction("NULL", 49, 11); }
		if( Attr9_Max < 34.33 ) { return new Prediction("NULL", 172, 4); }
	}
	}
	}
	if( Attr6_Min < -2.24 ) { 
	if( Attr3_Max >= 11.85 ) { 
	if( Attr5_Max >= 2.66 ) { 
		if( Attr4_Mean < 0.75 ) { return new Prediction("NULL", 480, 109); }
		if( Attr4_Mean >= 0.75 ) { return new Prediction("smoking", 7, 0); }
	}
	if( Attr5_Max < 2.66 ) { 
		if( Attr3_Min < -1.71 ) { return new Prediction("NULL", 177, 57); }
		if( Attr3_Min >= -1.71 ) { return new Prediction("smoking", 84, 27); }
	}
	}
	if( Attr3_Max < 11.85 ) { 
	if( Attr2_Min < -14.68 ) { 
		if( Attr1_Max < 7.68 ) { return new Prediction("NULL", 204, 83); }
		if( Attr1_Max >= 7.68 ) { return new Prediction("smoking", 277, 83); }
	}
	if( Attr2_Min >= -14.68 ) { 
		if( Attr3_Min < -1.15 ) { return new Prediction("smoking", 815, 238); }
		if( Attr3_Min >= -1.15 ) { return new Prediction("smoking", 459, 49); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree49() {
	if( Attr1_Min < -6.53 ) { 
	if( Attr6_Min < -2.28 ) { 
	if( Attr3_Max < 11.42 ) { 
	if( Attr4_Min >= -5.36 ) { 
	if( Attr1_Max < -2.05 ) { 
		if( Attr4_Max >= 4.24 ) { return new Prediction("NULL", 14, 0); }
		if( Attr4_Max < 4.24 ) { return new Prediction("NULL", 83, 34); }
	}
	if( Attr1_Max >= -2.05 ) { 
		if( Attr3_Min >= -9.06 ) { return new Prediction("smoking", 1964, 299); }
		if( Attr3_Min < -9.06 ) { return new Prediction("smoking", 344, 120); }
	}
	}
	if( Attr4_Min < -5.36 ) { 
	if( Attr3_Min >= -14.46 ) { 
		if( Attr6_Mean < -0.18 ) { return new Prediction("NULL", 15, 0); }
		if( Attr6_Mean >= -0.18 ) { return new Prediction("smoking", 541, 232); }
	}
	if( Attr3_Min < -14.46 ) { 
		if( Attr8_Min < -33.33 ) { return new Prediction("NULL", 25, 0); }
		if( Attr8_Min >= -33.33 ) { return new Prediction("NULL", 89, 19); }
	}
	}
	}
	if( Attr3_Max >= 11.42 ) { 
	if( Attr3_Max >= 13.46 ) { 
	if( Attr2_Max < 19.87 ) { 
		if( Attr1_Min < -18.62 ) { return new Prediction("NULL", 242, 41); }
		if( Attr1_Min >= -18.62 ) { return new Prediction("NULL", 865, 276); }
	}
	if( Attr2_Max >= 19.87 ) { 
		if( Attr6_Min >= -6 ) { return new Prediction("NULL", 64, 0); }
		if( Attr6_Min < -6 ) { return new Prediction("NULL", 34, 5); }
	}
	}
	if( Attr3_Max < 13.46 ) { 
	if( Attr2_Max < 8.26 ) { 
		if( Attr5_Max >= 2.72 ) { return new Prediction("NULL", 191, 74); }
		if( Attr5_Max < 2.72 ) { return new Prediction("smoking", 254, 91); }
	}
	if( Attr2_Max >= 8.26 ) { 
		if( Attr3_Max >= 13.32 ) { return new Prediction("smoking", 15, 4); }
		if( Attr3_Max < 13.32 ) { return new Prediction("NULL", 146, 31); }
	}
	}
	}
	}
	if( Attr6_Min >= -2.28 ) { 
	if( Attr7_Min >= -37.09 ) { 
	if( Attr8_Max >= -3.49 ) { 
	if( Attr2_Min < -14.39 ) { 
		if( Attr9_Mean < -25.63 ) { return new Prediction("NULL", 53, 18); }
		if( Attr9_Mean >= -25.63 ) { return new Prediction("NULL", 354, 28); }
	}
	if( Attr2_Min >= -14.39 ) { 
		if( Attr1_Mean >= -6.91 ) { return new Prediction("NULL", 616, 230); }
		if( Attr1_Mean < -6.91 ) { return new Prediction("NULL", 514, 108); }
	}
	}
	if( Attr8_Max < -3.49 ) { 
		if( Attr9_Min >= -81.42 ) { return new Prediction("NULL", 180, 0); }
		if( Attr9_Min < -81.42 ) { return new Prediction("smoking", 6, 0); }
	}
	}
	if( Attr7_Min < -37.09 ) { 
		if( Attr2_Mean >= 3.63 ) { return new Prediction("NULL", 16, 0); }
	if( Attr2_Mean < 3.63 ) { 
	if( Attr7_Mean >= -13.61 ) { 
		if( Attr2_Mean < -1.53 ) { return new Prediction("smoking", 166, 70); }
		if( Attr2_Mean >= -1.53 ) { return new Prediction("smoking", 36, 2); }
	}
	if( Attr7_Mean < -13.61 ) { 
		if( Attr3_Min < -4.25 ) { return new Prediction("NULL", 68, 20); }
		if( Attr3_Min >= -4.25 ) { return new Prediction("smoking", 73, 32); }
	}
	}
	}
	}
	}
	if( Attr1_Min >= -6.53 ) { 
	if( Attr7_Min >= -23.88 ) { 
	if( Attr1_Max < 7.44 ) { 
	if( Attr2_Min < -2.5 ) { 
		if( Attr2_Max < -11.23 ) { return new Prediction("smoking", 6, 0); }
	if( Attr2_Max >= -11.23 ) { 
		if( Attr6_Min < -1.49 ) { return new Prediction("NULL", 289, 46); }
		if( Attr6_Min >= -1.49 ) { return new Prediction("NULL", 2445, 152); }
	}
	}
	if( Attr2_Min >= -2.5 ) { 
		if( Attr6_Min >= -0.2 ) { return new Prediction("NULL", 830, 0); }
	if( Attr6_Min < -0.2 ) { 
		if( Attr2_Min >= 0.93 ) { return new Prediction("NULL", 39, 5); }
		if( Attr2_Min < 0.93 ) { return new Prediction("NULL", 40, 0); }
	}
	}
	}
	if( Attr1_Max >= 7.44 ) { 
	if( Attr6_Min < -6.68 ) { 
		if( Attr4_Max < 3.82 ) { return new Prediction("NULL", 1, 0); }
		if( Attr4_Max >= 3.82 ) { return new Prediction("smoking", 8, 0); }
	}
	if( Attr6_Min >= -6.68 ) { 
	if( Attr9_Max >= 23.14 ) { 
		if( Attr9_Max >= 102.08 ) { return new Prediction("smoking", 3, 0); }
		if( Attr9_Max < 102.08 ) { return new Prediction("NULL", 258, 22); }
	}
	if( Attr9_Max < 23.14 ) { 
		if( Attr2_Min < -5.34 ) { return new Prediction("NULL", 469, 127); }
		if( Attr2_Min >= -5.34 ) { return new Prediction("NULL", 128, 7); }
	}
	}
	}
	}
	if( Attr7_Min < -23.88 ) { 
	if( Attr1_Max >= 2.3 ) { 
	if( Attr2_Min >= -8.9 ) { 
	if( Attr6_Min < -2.02 ) { 
		if( Attr2_Min >= -5.77 ) { return new Prediction("smoking", 49, 13); }
		if( Attr2_Min < -5.77 ) { return new Prediction("NULL", 57, 15); }
	}
	if( Attr6_Min >= -2.02 ) { 
		if( Attr9_Mean >= 11.29 ) { return new Prediction("NULL", 275, 10); }
		if( Attr9_Mean < 11.29 ) { return new Prediction("NULL", 874, 110); }
	}
	}
	if( Attr2_Min < -8.9 ) { 
	if( Attr1_Mean >= 3.07 ) { 
		if( Attr9_Max >= 24.94 ) { return new Prediction("NULL", 654, 74); }
		if( Attr9_Max < 24.94 ) { return new Prediction("NULL", 931, 230); }
	}
	if( Attr1_Mean < 3.07 ) { 
		if( Attr6_Max < 0.94 ) { return new Prediction("NULL", 136, 18); }
		if( Attr6_Max >= 0.94 ) { return new Prediction("NULL", 567, 233); }
	}
	}
	}
	if( Attr1_Max < 2.3 ) { 
	if( Attr2_Mean < -4.15 ) { 
	if( Attr3_Mean < -3.27 ) { 
		if( Attr3_Mean < -3.35 ) { return new Prediction("NULL", 29, 4); }
		if( Attr3_Mean >= -3.35 ) { return new Prediction("smoking", 4, 0); }
	}
	if( Attr3_Mean >= -3.27 ) { 
		if( Attr2_Max < 0.05 ) { return new Prediction("NULL", 305, 7); }
		if( Attr2_Max >= 0.05 ) { return new Prediction("NULL", 9, 3); }
	}
	}
		if( Attr2_Mean >= -4.15 ) { return new Prediction("NULL", 504, 0); }
	}
	}
	}
return null;
}
private Prediction runTree50() {
	if( Attr6_Min >= -1.92 ) { 
	if( Attr5_Max < 0.38 ) { 
	if( Attr3_Mean < 8.93 ) { 
	if( Attr5_Max >= 0 ) { 
	if( Attr6_Mean >= 0.01 ) { 
		if( Attr3_Min < 0.99 ) { return new Prediction("NULL", 263, 78); }
		if( Attr3_Min >= 0.99 ) { return new Prediction("NULL", 223, 12); }
	}
	if( Attr6_Mean < 0.01 ) { 
		if( Attr8_Mean < -8.67 ) { return new Prediction("NULL", 378, 3); }
		if( Attr8_Mean >= -8.67 ) { return new Prediction("NULL", 2320, 211); }
	}
	}
	if( Attr5_Max < 0 ) { 
	if( Attr4_Max >= 4.27 ) { 
		if( Attr2_Mean >= -4.44 ) { return new Prediction("smoking", 2, 0); }
		if( Attr2_Mean < -4.44 ) { return new Prediction("NULL", 4, 0); }
	}
		if( Attr4_Max < 4.27 ) { return new Prediction("NULL", 345, 0); }
	}
	}
		if( Attr3_Mean >= 8.93 ) { return new Prediction("NULL", 1303, 0); }
	}
	if( Attr5_Max >= 0.38 ) { 
		if( Attr5_Mean >= 0.15 ) { return new Prediction("NULL", 107, 0); }
	if( Attr5_Mean < 0.15 ) { 
	if( Attr9_Min >= -12.13 ) { 
	if( Attr7_Max >= 15.39 ) { 
		if( Attr7_Min < -42.29 ) { return new Prediction("smoking", 22, 8); }
		if( Attr7_Min >= -42.29 ) { return new Prediction("NULL", 290, 44); }
	}
	if( Attr7_Max < 15.39 ) { 
		if( Attr8_Min < 39.67 ) { return new Prediction("NULL", 556, 32); }
		if( Attr8_Min >= 39.67 ) { return new Prediction("NULL", 18, 6); }
	}
	}
	if( Attr9_Min < -12.13 ) { 
	if( Attr5_Max < 1.18 ) { 
		if( Attr3_Min < 6.36 ) { return new Prediction("NULL", 1343, 266); }
		if( Attr3_Min >= 6.36 ) { return new Prediction("NULL", 193, 8); }
	}
	if( Attr5_Max >= 1.18 ) { 
		if( Attr1_Mean < 3.38 ) { return new Prediction("NULL", 1015, 348); }
		if( Attr1_Mean >= 3.38 ) { return new Prediction("NULL", 386, 78); }
	}
	}
	}
	}
	}
	if( Attr6_Min < -1.92 ) { 
	if( Attr1_Min < -7.27 ) { 
	if( Attr3_Min >= -7.67 ) { 
	if( Attr1_Max < 7.77 ) { 
	if( Attr3_Min < -2.14 ) { 
		if( Attr9_Max < 31.77 ) { return new Prediction("NULL", 362, 123); }
		if( Attr9_Max >= 31.77 ) { return new Prediction("smoking", 231, 66); }
	}
	if( Attr3_Min >= -2.14 ) { 
		if( Attr1_Mean < -9.22 ) { return new Prediction("NULL", 12, 0); }
		if( Attr1_Mean >= -9.22 ) { return new Prediction("smoking", 552, 120); }
	}
	}
	if( Attr1_Max >= 7.77 ) { 
	if( Attr3_Max < 12.57 ) { 
		if( Attr3_Max >= 8.88 ) { return new Prediction("smoking", 538, 107); }
		if( Attr3_Max < 8.88 ) { return new Prediction("smoking", 924, 82); }
	}
	if( Attr3_Max >= 12.57 ) { 
		if( Attr2_Mean >= -6.84 ) { return new Prediction("NULL", 241, 92); }
		if( Attr2_Mean < -6.84 ) { return new Prediction("NULL", 47, 3); }
	}
	}
	}
	if( Attr3_Min < -7.67 ) { 
	if( Attr4_Max >= 4.82 ) { 
	if( Attr1_Min < -9.46 ) { 
		if( Attr8_Min < -8.78 ) { return new Prediction("NULL", 776, 150); }
		if( Attr8_Min >= -8.78 ) { return new Prediction("NULL", 334, 111); }
	}
	if( Attr1_Min >= -9.46 ) { 
		if( Attr1_Mean < -0.32 ) { return new Prediction("smoking", 43, 11); }
		if( Attr1_Mean >= -0.32 ) { return new Prediction("NULL", 224, 78); }
	}
	}
	if( Attr4_Max < 4.82 ) { 
	if( Attr9_Mean >= 2.42 ) { 
		if( Attr2_Mean < -7.28 ) { return new Prediction("NULL", 41, 13); }
		if( Attr2_Mean >= -7.28 ) { return new Prediction("smoking", 333, 66); }
	}
	if( Attr9_Mean < 2.42 ) { 
		if( Attr7_Mean < 25.64 ) { return new Prediction("smoking", 251, 108); }
		if( Attr7_Mean >= 25.64 ) { return new Prediction("NULL", 30, 4); }
	}
	}
	}
	}
	if( Attr1_Min >= -7.27 ) { 
	if( Attr4_Min < -4.06 ) { 
	if( Attr1_Min < -3.87 ) { 
	if( Attr2_Mean < -6.79 ) { 
		if( Attr3_Mean >= 2.71 ) { return new Prediction("NULL", 49, 0); }
		if( Attr3_Mean < 2.71 ) { return new Prediction("NULL", 129, 25); }
	}
	if( Attr2_Mean >= -6.79 ) { 
		if( Attr5_Max >= 2.4 ) { return new Prediction("NULL", 261, 93); }
		if( Attr5_Max < 2.4 ) { return new Prediction("NULL", 153, 29); }
	}
	}
	if( Attr1_Min >= -3.87 ) { 
		if( Attr7_Max >= 157.39 ) { return new Prediction("smoking", 3, 0); }
	if( Attr7_Max < 157.39 ) { 
		if( Attr2_Max < 3.92 ) { return new Prediction("NULL", 324, 58); }
		if( Attr2_Max >= 3.92 ) { return new Prediction("NULL", 248, 15); }
	}
	}
	}
	if( Attr4_Min >= -4.06 ) { 
	if( Attr6_Max < 2.35 ) { 
	if( Attr1_Max < 11.97 ) { 
		if( Attr4_Max < 0.76 ) { return new Prediction("smoking", 26, 5); }
		if( Attr4_Max >= 0.76 ) { return new Prediction("NULL", 386, 107); }
	}
	if( Attr1_Max >= 11.97 ) { 
		if( Attr2_Max < 3.06 ) { return new Prediction("NULL", 84, 18); }
		if( Attr2_Max >= 3.06 ) { return new Prediction("NULL", 59, 2); }
	}
	}
	if( Attr6_Max >= 2.35 ) { 
	if( Attr5_Max < 4.14 ) { 
		if( Attr8_Mean < 33.52 ) { return new Prediction("NULL", 396, 183); }
		if( Attr8_Mean >= 33.52 ) { return new Prediction("NULL", 39, 7); }
	}
		if( Attr5_Max >= 4.14 ) { return new Prediction("NULL", 14, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree51() {
	if( Attr4_Min < -0.97 ) { 
	if( Attr1_Min >= -7.35 ) { 
	if( Attr6_Mean >= -0.19 ) { 
	if( Attr5_Min < -1.1 ) { 
		if( Attr3_Min < -19.61 ) { return new Prediction("NULL", 40, 0); }
	if( Attr3_Min >= -19.61 ) { 
		if( Attr1_Mean >= 10.12 ) { return new Prediction("smoking", 48, 19); }
		if( Attr1_Mean < 10.12 ) { return new Prediction("NULL", 3134, 780); }
	}
	}
	if( Attr5_Min >= -1.1 ) { 
	if( Attr6_Max < 1.78 ) { 
		if( Attr1_Max >= 2.08 ) { return new Prediction("NULL", 900, 137); }
		if( Attr1_Max < 2.08 ) { return new Prediction("NULL", 300, 20); }
	}
	if( Attr6_Max >= 1.78 ) { 
		if( Attr7_Max < -25.2 ) { return new Prediction("NULL", 29, 1); }
		if( Attr7_Max >= -25.2 ) { return new Prediction("NULL", 262, 80); }
	}
	}
	}
		if( Attr6_Mean < -0.19 ) { return new Prediction("NULL", 131, 0); }
	}
	if( Attr1_Min < -7.35 ) { 
	if( Attr3_Min < -8.83 ) { 
	if( Attr5_Min < -5.33 ) { 
	if( Attr5_Max >= 2.28 ) { 
		if( Attr7_Max < 39.45 ) { return new Prediction("NULL", 161, 33); }
		if( Attr7_Max >= 39.45 ) { return new Prediction("NULL", 132, 5); }
	}
	if( Attr5_Max < 2.28 ) { 
		if( Attr5_Min < -6.2 ) { return new Prediction("NULL", 3, 0); }
		if( Attr5_Min >= -6.2 ) { return new Prediction("smoking", 12, 0); }
	}
	}
	if( Attr5_Min >= -5.33 ) { 
	if( Attr4_Max < 4.03 ) { 
		if( Attr8_Max < 20.29 ) { return new Prediction("NULL", 63, 10); }
		if( Attr8_Max >= 20.29 ) { return new Prediction("smoking", 352, 133); }
	}
	if( Attr4_Max >= 4.03 ) { 
		if( Attr6_Min < -4.32 ) { return new Prediction("NULL", 474, 181); }
		if( Attr6_Min >= -4.32 ) { return new Prediction("NULL", 632, 141); }
	}
	}
	}
	if( Attr3_Min >= -8.83 ) { 
	if( Attr6_Min >= -2.65 ) { 
	if( Attr1_Min >= -10.44 ) { 
		if( Attr5_Mean >= 0.15 ) { return new Prediction("NULL", 13, 0); }
		if( Attr5_Mean < 0.15 ) { return new Prediction("smoking", 751, 322); }
	}
	if( Attr1_Min < -10.44 ) { 
		if( Attr8_Min >= -30.13 ) { return new Prediction("NULL", 629, 86); }
		if( Attr8_Min < -30.13 ) { return new Prediction("smoking", 64, 30); }
	}
	}
	if( Attr6_Min < -2.65 ) { 
	if( Attr9_Mean >= -2.46 ) { 
		if( Attr4_Min < -5.33 ) { return new Prediction("smoking", 191, 71); }
		if( Attr4_Min >= -5.33 ) { return new Prediction("smoking", 966, 117); }
	}
	if( Attr9_Mean < -2.46 ) { 
		if( Attr4_Max < 4.47 ) { return new Prediction("smoking", 859, 181); }
		if( Attr4_Max >= 4.47 ) { return new Prediction("NULL", 579, 275); }
	}
	}
	}
	}
	}
	if( Attr4_Min >= -0.97 ) { 
	if( Attr1_Max < 8.35 ) { 
	if( Attr2_Min >= -1.73 ) { 
	if( Attr5_Max < 0.22 ) { 
		if( Attr7_Min < 35.32 ) { return new Prediction("NULL", 1272, 0); }
	if( Attr7_Min >= 35.32 ) { 
		if( Attr2_Max >= 1.02 ) { return new Prediction("smoking", 1, 0); }
		if( Attr2_Max < 1.02 ) { return new Prediction("NULL", 93, 0); }
	}
	}
	if( Attr5_Max >= 0.22 ) { 
		if( Attr9_Max >= 8.33 ) { return new Prediction("NULL", 23, 0); }
	if( Attr9_Max < 8.33 ) { 
		if( Attr3_Mean < 2 ) { return new Prediction("smoking", 9, 0); }
		if( Attr3_Mean >= 2 ) { return new Prediction("NULL", 14, 0); }
	}
	}
	}
	if( Attr2_Min < -1.73 ) { 
	if( Attr1_Min < -7.26 ) { 
	if( Attr6_Mean < 0 ) { 
		if( Attr6_Max < 0.23 ) { return new Prediction("NULL", 36, 0); }
		if( Attr6_Max >= 0.23 ) { return new Prediction("NULL", 60, 7); }
	}
	if( Attr6_Mean >= 0 ) { 
		if( Attr4_Mean < 0.1 ) { return new Prediction("NULL", 118, 54); }
		if( Attr4_Mean >= 0.1 ) { return new Prediction("NULL", 26, 0); }
	}
	}
	if( Attr1_Min >= -7.26 ) { 
	if( Attr6_Max >= 1.07 ) { 
		if( Attr9_Min < -30.69 ) { return new Prediction("NULL", 49, 2); }
		if( Attr9_Min >= -30.69 ) { return new Prediction("smoking", 28, 13); }
	}
	if( Attr6_Max < 1.07 ) { 
		if( Attr5_Mean < -0.02 ) { return new Prediction("NULL", 221, 0); }
		if( Attr5_Mean >= -0.02 ) { return new Prediction("NULL", 2457, 152); }
	}
	}
	}
	}
	if( Attr1_Max >= 8.35 ) { 
	if( Attr1_Mean < 7.05 ) { 
	if( Attr2_Min >= -9.06 ) { 
	if( Attr9_Mean < -4.59 ) { 
		if( Attr6_Max < 3.6 ) { return new Prediction("NULL", 23, 0); }
		if( Attr6_Max >= 3.6 ) { return new Prediction("smoking", 3, 0); }
	}
	if( Attr9_Mean >= -4.59 ) { 
		if( Attr5_Max >= 0.01 ) { return new Prediction("smoking", 13, 4); }
		if( Attr5_Max < 0.01 ) { return new Prediction("NULL", 3, 0); }
	}
	}
	if( Attr2_Min < -9.06 ) { 
	if( Attr2_Max < -0.88 ) { 
		if( Attr2_Max < -2.73 ) { return new Prediction("smoking", 20, 4); }
		if( Attr2_Max >= -2.73 ) { return new Prediction("smoking", 22, 0); }
	}
	if( Attr2_Max >= -0.88 ) { 
		if( Attr3_Mean >= 3.38 ) { return new Prediction("smoking", 28, 9); }
		if( Attr3_Mean < 3.38 ) { return new Prediction("NULL", 26, 6); }
	}
	}
	}
	if( Attr1_Mean >= 7.05 ) { 
	if( Attr2_Min < -2.35 ) { 
	if( Attr4_Max < 0 ) { 
		if( Attr4_Min < -0.01 ) { return new Prediction("NULL", 21, 4); }
		if( Attr4_Min >= -0.01 ) { return new Prediction("smoking", 38, 5); }
	}
	if( Attr4_Max >= 0 ) { 
		if( Attr8_Max < 32.96 ) { return new Prediction("NULL", 239, 27); }
		if( Attr8_Max >= 32.96 ) { return new Prediction("smoking", 46, 22); }
	}
	}
	if( Attr2_Min >= -2.35 ) { 
		if( Attr8_Mean < 9.87 ) { return new Prediction("NULL", 197, 0); }
	if( Attr8_Mean >= 9.87 ) { 
		if( Attr8_Max >= 17.54 ) { return new Prediction("NULL", 58, 0); }
		if( Attr8_Max < 17.54 ) { return new Prediction("NULL", 9, 4); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree52() {
	if( Attr5_Max >= 0.68 ) { 
	if( Attr7_Max < 20.58 ) { 
	if( Attr1_Min < -7.56 ) { 
	if( Attr8_Mean < 56.09 ) { 
	if( Attr3_Max >= 11.99 ) { 
		if( Attr9_Mean < -52.42 ) { return new Prediction("smoking", 15, 4); }
		if( Attr9_Mean >= -52.42 ) { return new Prediction("NULL", 411, 89); }
	}
	if( Attr3_Max < 11.99 ) { 
		if( Attr6_Max < 2.24 ) { return new Prediction("NULL", 199, 89); }
		if( Attr6_Max >= 2.24 ) { return new Prediction("smoking", 446, 145); }
	}
	}
		if( Attr8_Mean >= 56.09 ) { return new Prediction("smoking", 36, 0); }
	}
	if( Attr1_Min >= -7.56 ) { 
	if( Attr1_Mean >= 9.76 ) { 
	if( Attr8_Max >= 47.18 ) { 
		if( Attr3_Mean >= -0.18 ) { return new Prediction("smoking", 2, 0); }
		if( Attr3_Mean < -0.18 ) { return new Prediction("NULL", 6, 0); }
	}
	if( Attr8_Max < 47.18 ) { 
		if( Attr9_Max < 6.46 ) { return new Prediction("NULL", 6, 2); }
		if( Attr9_Max >= 6.46 ) { return new Prediction("smoking", 26, 2); }
	}
	}
	if( Attr1_Mean < 9.76 ) { 
	if( Attr1_Mean >= 3.36 ) { 
		if( Attr9_Max < 13.65 ) { return new Prediction("NULL", 651, 179); }
		if( Attr9_Max >= 13.65 ) { return new Prediction("NULL", 850, 99); }
	}
	if( Attr1_Mean < 3.36 ) { 
		if( Attr6_Max >= 1.53 ) { return new Prediction("NULL", 685, 261); }
		if( Attr6_Max < 1.53 ) { return new Prediction("NULL", 538, 92); }
	}
	}
	}
	}
	if( Attr7_Max >= 20.58 ) { 
	if( Attr3_Max >= 11.38 ) { 
	if( Attr3_Mean < 1.05 ) { 
	if( Attr9_Mean >= -17.58 ) { 
		if( Attr4_Min >= -4.64 ) { return new Prediction("NULL", 61, 22); }
		if( Attr4_Min < -4.64 ) { return new Prediction("NULL", 394, 48); }
	}
	if( Attr9_Mean < -17.58 ) { 
		if( Attr9_Mean >= -26.69 ) { return new Prediction("smoking", 26, 9); }
		if( Attr9_Mean < -26.69 ) { return new Prediction("NULL", 35, 7); }
	}
	}
	if( Attr3_Mean >= 1.05 ) { 
	if( Attr1_Min >= -6 ) { 
		if( Attr1_Max < 8.7 ) { return new Prediction("NULL", 158, 14); }
		if( Attr1_Max >= 8.7 ) { return new Prediction("NULL", 137, 42); }
	}
	if( Attr1_Min < -6 ) { 
		if( Attr3_Max >= 15.09 ) { return new Prediction("NULL", 624, 146); }
		if( Attr3_Max < 15.09 ) { return new Prediction("NULL", 726, 345); }
	}
	}
	}
	if( Attr3_Max < 11.38 ) { 
	if( Attr7_Min < -37.55 ) { 
	if( Attr3_Min < -7.64 ) { 
		if( Attr1_Min >= -7 ) { return new Prediction("NULL", 92, 18); }
		if( Attr1_Min < -7 ) { return new Prediction("smoking", 423, 159); }
	}
	if( Attr3_Min >= -7.64 ) { 
		if( Attr1_Min >= -6.66 ) { return new Prediction("NULL", 111, 51); }
		if( Attr1_Min < -6.66 ) { return new Prediction("smoking", 867, 85); }
	}
	}
	if( Attr7_Min >= -37.55 ) { 
	if( Attr6_Max < 2.2 ) { 
		if( Attr6_Max >= 1.3 ) { return new Prediction("NULL", 535, 195); }
		if( Attr6_Max < 1.3 ) { return new Prediction("NULL", 491, 88); }
	}
	if( Attr6_Max >= 2.2 ) { 
		if( Attr3_Min >= -7.63 ) { return new Prediction("smoking", 911, 282); }
		if( Attr3_Min < -7.63 ) { return new Prediction("NULL", 431, 163); }
	}
	}
	}
	}
	}
	if( Attr5_Max < 0.68 ) { 
	if( Attr6_Max < 1.78 ) { 
	if( Attr2_Mean >= -0.67 ) { 
	if( Attr3_Mean < 5.27 ) { 
	if( Attr4_Max < 0.16 ) { 
		if( Attr4_Max >= -0 ) { return new Prediction("NULL", 361, 2); }
		if( Attr4_Max < -0 ) { return new Prediction("NULL", 3, 1); }
	}
	if( Attr4_Max >= 0.16 ) { 
		if( Attr6_Mean >= -0.01 ) { return new Prediction("NULL", 99, 13); }
		if( Attr6_Mean < -0.01 ) { return new Prediction("NULL", 47, 0); }
	}
	}
		if( Attr3_Mean >= 5.27 ) { return new Prediction("NULL", 1261, 0); }
	}
	if( Attr2_Mean < -0.67 ) { 
	if( Attr3_Max < -2.51 ) { 
	if( Attr1_Min >= -1.01 ) { 
		if( Attr3_Max >= -7.39 ) { return new Prediction("NULL", 423, 15); }
		if( Attr3_Max < -7.39 ) { return new Prediction("NULL", 11, 3); }
	}
		if( Attr1_Min < -1.01 ) { return new Prediction("NULL", 164, 0); }
	}
	if( Attr3_Max >= -2.51 ) { 
	if( Attr1_Min >= -7.41 ) { 
		if( Attr7_Mean < -71.01 ) { return new Prediction("smoking", 24, 8); }
		if( Attr7_Mean >= -71.01 ) { return new Prediction("NULL", 3057, 275); }
	}
	if( Attr1_Min < -7.41 ) { 
		if( Attr2_Mean >= -6.67 ) { return new Prediction("NULL", 248, 57); }
		if( Attr2_Mean < -6.67 ) { return new Prediction("smoking", 54, 18); }
	}
	}
	}
	}
	if( Attr6_Max >= 1.78 ) { 
	if( Attr7_Max < 30.6 ) { 
	if( Attr3_Max >= 8.74 ) { 
	if( Attr1_Min < -2.46 ) { 
		if( Attr2_Min < -9.25 ) { return new Prediction("NULL", 23, 11); }
		if( Attr2_Min >= -9.25 ) { return new Prediction("NULL", 9, 0); }
	}
		if( Attr1_Min >= -2.46 ) { return new Prediction("NULL", 32, 0); }
	}
	if( Attr3_Max < 8.74 ) { 
	if( Attr6_Max >= 1.8 ) { 
		if( Attr8_Max >= 34.13 ) { return new Prediction("smoking", 35, 14); }
		if( Attr8_Max < 34.13 ) { return new Prediction("NULL", 37, 9); }
	}
		if( Attr6_Max < 1.8 ) { return new Prediction("smoking", 7, 0); }
	}
	}
	if( Attr7_Max >= 30.6 ) { 
	if( Attr2_Min >= -10.62 ) { 
	if( Attr3_Mean < -1.1 ) { 
		if( Attr1_Max < 10.94 ) { return new Prediction("smoking", 2, 0); }
		if( Attr1_Max >= 10.94 ) { return new Prediction("NULL", 2, 0); }
	}
		if( Attr3_Mean >= -1.1 ) { return new Prediction("NULL", 10, 0); }
	}
	if( Attr2_Min < -10.62 ) { 
	if( Attr6_Min >= -2.42 ) { 
		if( Attr5_Mean < -0.03 ) { return new Prediction("NULL", 5, 1); }
		if( Attr5_Mean >= -0.03 ) { return new Prediction("smoking", 12, 1); }
	}
		if( Attr6_Min < -2.42 ) { return new Prediction("smoking", 59, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree53() {
	if( Attr6_Min >= -1.95 ) { 
	if( Attr5_Max < 0.26 ) { 
	if( Attr2_Min < -1.74 ) { 
	if( Attr1_Max < 8.59 ) { 
	if( Attr1_Max >= -7.39 ) { 
		if( Attr5_Max < -0 ) { return new Prediction("NULL", 209, 0); }
		if( Attr5_Max >= -0 ) { return new Prediction("NULL", 2116, 148); }
	}
	if( Attr1_Max < -7.39 ) { 
		if( Attr6_Mean < 0 ) { return new Prediction("NULL", 24, 3); }
		if( Attr6_Mean >= 0 ) { return new Prediction("smoking", 31, 9); }
	}
	}
	if( Attr1_Max >= 8.59 ) { 
	if( Attr6_Mean >= 0.01 ) { 
		if( Attr4_Max >= -0.01 ) { return new Prediction("smoking", 79, 32); }
		if( Attr4_Max < -0.01 ) { return new Prediction("NULL", 16, 0); }
	}
	if( Attr6_Mean < 0.01 ) { 
		if( Attr7_Mean < -22.28 ) { return new Prediction("NULL", 169, 11); }
		if( Attr7_Mean >= -22.28 ) { return new Prediction("NULL", 68, 20); }
	}
	}
	}
	if( Attr2_Min >= -1.74 ) { 
	if( Attr3_Max < 1.65 ) { 
	if( Attr1_Max >= -9.64 ) { 
		if( Attr8_Mean < 7.85 ) { return new Prediction("NULL", 254, 1); }
		if( Attr8_Mean >= 7.85 ) { return new Prediction("NULL", 80, 4); }
	}
		if( Attr1_Max < -9.64 ) { return new Prediction("smoking", 1, 0); }
	}
		if( Attr3_Max >= 1.65 ) { return new Prediction("NULL", 1271, 0); }
	}
	}
	if( Attr5_Max >= 0.26 ) { 
	if( Attr3_Mean < 7.22 ) { 
	if( Attr6_Max >= 1.17 ) { 
	if( Attr2_Max < 0.46 ) { 
		if( Attr4_Min >= -4.53 ) { return new Prediction("NULL", 646, 263); }
		if( Attr4_Min < -4.53 ) { return new Prediction("NULL", 135, 24); }
	}
	if( Attr2_Max >= 0.46 ) { 
		if( Attr4_Mean < -0.22 ) { return new Prediction("NULL", 38, 0); }
		if( Attr4_Mean >= -0.22 ) { return new Prediction("NULL", 892, 203); }
	}
	}
	if( Attr6_Max < 1.17 ) { 
	if( Attr9_Mean < -11.55 ) { 
		if( Attr5_Max < 1.32 ) { return new Prediction("NULL", 498, 106); }
		if( Attr5_Max >= 1.32 ) { return new Prediction("NULL", 134, 58); }
	}
	if( Attr9_Mean >= -11.55 ) { 
		if( Attr6_Mean < 0.03 ) { return new Prediction("NULL", 1223, 154); }
		if( Attr6_Mean >= 0.03 ) { return new Prediction("NULL", 121, 0); }
	}
	}
	}
	if( Attr3_Mean >= 7.22 ) { 
	if( Attr1_Max >= 4.5 ) { 
	if( Attr3_Mean >= 8.69 ) { 
		if( Attr6_Min >= -1.39 ) { return new Prediction("NULL", 25, 5); }
		if( Attr6_Min < -1.39 ) { return new Prediction("smoking", 21, 6); }
	}
	if( Attr3_Mean < 8.69 ) { 
		if( Attr4_Min >= -1.39 ) { return new Prediction("NULL", 33, 8); }
		if( Attr4_Min < -1.39 ) { return new Prediction("NULL", 110, 1); }
	}
	}
	if( Attr1_Max < 4.5 ) { 
		if( Attr7_Min >= 15.43 ) { return new Prediction("NULL", 87, 0); }
	if( Attr7_Min < 15.43 ) { 
		if( Attr6_Mean < 0.03 ) { return new Prediction("NULL", 389, 17); }
		if( Attr6_Mean >= 0.03 ) { return new Prediction("NULL", 32, 9); }
	}
	}
	}
	}
	}
	if( Attr6_Min < -1.95 ) { 
	if( Attr4_Max >= 3.84 ) { 
	if( Attr3_Min >= -5.87 ) { 
	if( Attr1_Min >= -6.48 ) { 
	if( Attr6_Min >= -1.98 ) { 
		if( Attr7_Max >= -3.03 ) { return new Prediction("smoking", 13, 1); }
		if( Attr7_Max < -3.03 ) { return new Prediction("NULL", 1, 0); }
	}
	if( Attr6_Min < -1.98 ) { 
		if( Attr1_Max < 2.28 ) { return new Prediction("NULL", 28, 0); }
		if( Attr1_Max >= 2.28 ) { return new Prediction("NULL", 374, 88); }
	}
	}
	if( Attr1_Min < -6.48 ) { 
	if( Attr3_Min < -2.01 ) { 
		if( Attr1_Mean >= 4.58 ) { return new Prediction("smoking", 62, 6); }
		if( Attr1_Mean < 4.58 ) { return new Prediction("NULL", 474, 229); }
	}
	if( Attr3_Min >= -2.01 ) { 
		if( Attr8_Min >= 13.86 ) { return new Prediction("NULL", 30, 13); }
		if( Attr8_Min < 13.86 ) { return new Prediction("smoking", 355, 71); }
	}
	}
	}
	if( Attr3_Min < -5.87 ) { 
	if( Attr7_Mean >= -18.45 ) { 
	if( Attr3_Max >= 8.61 ) { 
		if( Attr7_Mean < 42.44 ) { return new Prediction("NULL", 1817, 427); }
		if( Attr7_Mean >= 42.44 ) { return new Prediction("NULL", 37, 0); }
	}
	if( Attr3_Max < 8.61 ) { 
		if( Attr2_Mean >= -7.22 ) { return new Prediction("smoking", 336, 166); }
		if( Attr2_Mean < -7.22 ) { return new Prediction("NULL", 85, 8); }
	}
	}
	if( Attr7_Mean < -18.45 ) { 
	if( Attr9_Mean >= -23.23 ) { 
		if( Attr1_Min < -3.43 ) { return new Prediction("smoking", 345, 170); }
		if( Attr1_Min >= -3.43 ) { return new Prediction("NULL", 95, 13); }
	}
	if( Attr9_Mean < -23.23 ) { 
		if( Attr6_Min < -4.74 ) { return new Prediction("NULL", 9, 4); }
		if( Attr6_Min >= -4.74 ) { return new Prediction("NULL", 47, 1); }
	}
	}
	}
	}
	if( Attr4_Max < 3.84 ) { 
	if( Attr6_Min >= -2.71 ) { 
	if( Attr6_Mean >= -0.11 ) { 
	if( Attr7_Max < 40.16 ) { 
		if( Attr6_Max < 2.73 ) { return new Prediction("NULL", 467, 149); }
		if( Attr6_Max >= 2.73 ) { return new Prediction("smoking", 146, 63); }
	}
	if( Attr7_Max >= 40.16 ) { 
		if( Attr1_Min >= -10.97 ) { return new Prediction("smoking", 157, 30); }
		if( Attr1_Min < -10.97 ) { return new Prediction("NULL", 61, 24); }
	}
	}
	if( Attr6_Mean < -0.11 ) { 
		if( Attr8_Mean >= -27.98 ) { return new Prediction("NULL", 26, 0); }
		if( Attr8_Mean < -27.98 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	if( Attr6_Min < -2.71 ) { 
	if( Attr6_Max >= 2.12 ) { 
		if( Attr1_Mean < -9.23 ) { return new Prediction("NULL", 31, 0); }
	if( Attr1_Mean >= -9.23 ) { 
		if( Attr4_Max < 3.13 ) { return new Prediction("smoking", 1125, 173); }
		if( Attr4_Max >= 3.13 ) { return new Prediction("smoking", 603, 207); }
	}
	}
	if( Attr6_Max < 2.12 ) { 
	if( Attr1_Mean >= 2.17 ) { 
		if( Attr3_Mean < 2.02 ) { return new Prediction("NULL", 74, 26); }
		if( Attr3_Mean >= 2.02 ) { return new Prediction("NULL", 53, 2); }
	}
	if( Attr1_Mean < 2.17 ) { 
		if( Attr9_Mean >= 1.56 ) { return new Prediction("smoking", 175, 34); }
		if( Attr9_Mean < 1.56 ) { return new Prediction("NULL", 149, 71); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree54() {
	if( Attr1_Min >= -6.65 ) { 
	if( Attr6_Max < 1.02 ) { 
	if( Attr2_Mean < -1.63 ) { 
	if( Attr1_Min < 1.16 ) { 
	if( Attr6_Min < -0.8 ) { 
		if( Attr1_Max < 5.19 ) { return new Prediction("NULL", 255, 11); }
		if( Attr1_Max >= 5.19 ) { return new Prediction("NULL", 183, 39); }
	}
	if( Attr6_Min >= -0.8 ) { 
		if( Attr2_Min < -8.86 ) { return new Prediction("NULL", 847, 75); }
		if( Attr2_Min >= -8.86 ) { return new Prediction("NULL", 972, 25); }
	}
	}
	if( Attr1_Min >= 1.16 ) { 
	if( Attr7_Min < -76.81 ) { 
		if( Attr1_Max < 8.81 ) { return new Prediction("smoking", 21, 0); }
		if( Attr1_Max >= 8.81 ) { return new Prediction("NULL", 1, 0); }
	}
	if( Attr7_Min >= -76.81 ) { 
		if( Attr3_Mean >= -1.89 ) { return new Prediction("NULL", 1195, 165); }
		if( Attr3_Mean < -1.89 ) { return new Prediction("NULL", 573, 23); }
	}
	}
	}
	if( Attr2_Mean >= -1.63 ) { 
	if( Attr5_Max < 0.22 ) { 
		if( Attr1_Mean < 8.14 ) { return new Prediction("NULL", 1337, 0); }
	if( Attr1_Mean >= 8.14 ) { 
		if( Attr3_Mean >= 4.99 ) { return new Prediction("smoking", 2, 0); }
		if( Attr3_Mean < 4.99 ) { return new Prediction("NULL", 223, 4); }
	}
	}
	if( Attr5_Max >= 0.22 ) { 
	if( Attr3_Max < 12.98 ) { 
		if( Attr2_Min < 7.26 ) { return new Prediction("NULL", 221, 6); }
		if( Attr2_Min >= 7.26 ) { return new Prediction("smoking", 8, 2); }
	}
	if( Attr3_Max >= 12.98 ) { 
		if( Attr2_Mean >= 0.37 ) { return new Prediction("smoking", 8, 3); }
		if( Attr2_Mean < 0.37 ) { return new Prediction("NULL", 8, 0); }
	}
	}
	}
	}
	if( Attr6_Max >= 1.02 ) { 
	if( Attr9_Max >= 16.15 ) { 
	if( Attr2_Min >= -20.09 ) { 
	if( Attr7_Min >= -32.03 ) { 
		if( Attr5_Min < -3.08 ) { return new Prediction("NULL", 124, 32); }
		if( Attr5_Min >= -3.08 ) { return new Prediction("NULL", 531, 41); }
	}
	if( Attr7_Min < -32.03 ) { 
		if( Attr1_Max < 9.16 ) { return new Prediction("NULL", 207, 80); }
		if( Attr1_Max >= 9.16 ) { return new Prediction("NULL", 761, 163); }
	}
	}
	if( Attr2_Min < -20.09 ) { 
	if( Attr6_Max >= 4.35 ) { 
		if( Attr9_Max < 17.8 ) { return new Prediction("smoking", 1, 0); }
		if( Attr9_Max >= 17.8 ) { return new Prediction("NULL", 10, 0); }
	}
		if( Attr6_Max < 4.35 ) { return new Prediction("NULL", 66, 0); }
	}
	}
	if( Attr9_Max < 16.15 ) { 
	if( Attr9_Min < -37.17 ) { 
	if( Attr2_Mean >= -4.02 ) { 
		if( Attr6_Max >= 3.27 ) { return new Prediction("NULL", 50, 0); }
		if( Attr6_Max < 3.27 ) { return new Prediction("NULL", 224, 30); }
	}
	if( Attr2_Mean < -4.02 ) { 
		if( Attr8_Max < 44.9 ) { return new Prediction("NULL", 316, 90); }
		if( Attr8_Max >= 44.9 ) { return new Prediction("NULL", 44, 2); }
	}
	}
	if( Attr9_Min >= -37.17 ) { 
	if( Attr6_Max < 2.2 ) { 
		if( Attr3_Mean >= 8.88 ) { return new Prediction("NULL", 18, 0); }
		if( Attr3_Mean < 8.88 ) { return new Prediction("NULL", 419, 117); }
	}
	if( Attr6_Max >= 2.2 ) { 
		if( Attr1_Max >= 7.98 ) { return new Prediction("smoking", 383, 185); }
		if( Attr1_Max < 7.98 ) { return new Prediction("NULL", 68, 9); }
	}
	}
	}
	}
	}
	if( Attr1_Min < -6.65 ) { 
	if( Attr2_Max >= 8.16 ) { 
	if( Attr1_Max >= 0.28 ) { 
	if( Attr5_Max < 4.63 ) { 
	if( Attr1_Max < 12.21 ) { 
		if( Attr1_Min < -16 ) { return new Prediction("NULL", 189, 22); }
		if( Attr1_Min >= -16 ) { return new Prediction("NULL", 237, 75); }
	}
	if( Attr1_Max >= 12.21 ) { 
		if( Attr6_Min >= -2.99 ) { return new Prediction("NULL", 106, 15); }
		if( Attr6_Min < -2.99 ) { return new Prediction("NULL", 242, 114); }
	}
	}
	if( Attr5_Max >= 4.63 ) { 
	if( Attr8_Min >= -34.71 ) { 
		if( Attr7_Max >= 33.22 ) { return new Prediction("NULL", 144, 12); }
		if( Attr7_Max < 33.22 ) { return new Prediction("NULL", 145, 47); }
	}
	if( Attr8_Min < -34.71 ) { 
		if( Attr1_Max >= 19.02 ) { return new Prediction("NULL", 30, 3); }
		if( Attr1_Max < 19.02 ) { return new Prediction("NULL", 66, 0); }
	}
	}
	}
	if( Attr1_Max < 0.28 ) { 
	if( Attr3_Max < 7.25 ) { 
		if( Attr8_Min < -40.91 ) { return new Prediction("smoking", 2, 0); }
		if( Attr8_Min >= -40.91 ) { return new Prediction("NULL", 15, 0); }
	}
	if( Attr3_Max >= 7.25 ) { 
	if( Attr2_Mean < -2.18 ) { 
		if( Attr2_Min >= -10.24 ) { return new Prediction("smoking", 2, 0); }
		if( Attr2_Min < -10.24 ) { return new Prediction("NULL", 9, 0); }
	}
	if( Attr2_Mean >= -2.18 ) { 
		if( Attr5_Max < 1.33 ) { return new Prediction("NULL", 11, 4); }
		if( Attr5_Max >= 1.33 ) { return new Prediction("smoking", 43, 1); }
	}
	}
	}
	}
	if( Attr2_Max < 8.16 ) { 
	if( Attr6_Min < -2.39 ) { 
	if( Attr4_Min >= -5.51 ) { 
	if( Attr1_Mean >= -8.81 ) { 
		if( Attr3_Max >= 11.99 ) { return new Prediction("NULL", 294, 135); }
		if( Attr3_Max < 11.99 ) { return new Prediction("smoking", 2230, 378); }
	}
	if( Attr1_Mean < -8.81 ) { 
		if( Attr8_Mean < -4.1 ) { return new Prediction("NULL", 38, 0); }
		if( Attr8_Mean >= -4.1 ) { return new Prediction("NULL", 38, 17); }
	}
	}
	if( Attr4_Min < -5.51 ) { 
	if( Attr4_Max < 4.56 ) { 
		if( Attr7_Min >= -38.34 ) { return new Prediction("NULL", 139, 66); }
		if( Attr7_Min < -38.34 ) { return new Prediction("smoking", 119, 18); }
	}
	if( Attr4_Max >= 4.56 ) { 
		if( Attr6_Mean < -0.17 ) { return new Prediction("NULL", 25, 0); }
		if( Attr6_Mean >= -0.17 ) { return new Prediction("NULL", 721, 257); }
	}
	}
	}
	if( Attr6_Min >= -2.39 ) { 
	if( Attr7_Min < 22.8 ) { 
	if( Attr3_Min < -1 ) { 
		if( Attr7_Min < -37.5 ) { return new Prediction("smoking", 214, 101); }
		if( Attr7_Min >= -37.5 ) { return new Prediction("NULL", 837, 178); }
	}
	if( Attr3_Min >= -1 ) { 
		if( Attr5_Max >= 0.76 ) { return new Prediction("smoking", 344, 118); }
		if( Attr5_Max < 0.76 ) { return new Prediction("NULL", 153, 29); }
	}
	}
	if( Attr7_Min >= 22.8 ) { 
	if( Attr4_Min < -0.03 ) { 
		if( Attr1_Min < -11.3 ) { return new Prediction("NULL", 132, 3); }
		if( Attr1_Min >= -11.3 ) { return new Prediction("NULL", 164, 41); }
	}
		if( Attr4_Min >= -0.03 ) { return new Prediction("NULL", 113, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree55() {
	if( Attr7_Max < 20.98 ) { 
	if( Attr6_Max < 1.03 ) { 
	if( Attr3_Min < 7.37 ) { 
	if( Attr2_Max < -5.13 ) { 
	if( Attr7_Mean >= -74.36 ) { 
		if( Attr9_Max >= -17.03 ) { return new Prediction("NULL", 1217, 62); }
		if( Attr9_Max < -17.03 ) { return new Prediction("NULL", 279, 32); }
	}
		if( Attr7_Mean < -74.36 ) { return new Prediction("smoking", 12, 0); }
	}
	if( Attr2_Max >= -5.13 ) { 
	if( Attr8_Min < -10.43 ) { 
		if( Attr8_Min < -13.5 ) { return new Prediction("NULL", 386, 32); }
		if( Attr8_Min >= -13.5 ) { return new Prediction("NULL", 126, 0); }
	}
	if( Attr8_Min >= -10.43 ) { 
		if( Attr5_Max < 1.56 ) { return new Prediction("NULL", 1424, 209); }
		if( Attr5_Max >= 1.56 ) { return new Prediction("NULL", 96, 35); }
	}
	}
	}
	if( Attr3_Min >= 7.37 ) { 
		if( Attr3_Mean >= 8.85 ) { return new Prediction("NULL", 693, 0); }
	if( Attr3_Mean < 8.85 ) { 
	if( Attr3_Mean < 8.55 ) { 
		if( Attr3_Mean >= 7.74 ) { return new Prediction("NULL", 140, 0); }
		if( Attr3_Mean < 7.74 ) { return new Prediction("NULL", 12, 1); }
	}
	if( Attr3_Mean >= 8.55 ) { 
		if( Attr1_Max >= 0.69 ) { return new Prediction("NULL", 18, 6); }
		if( Attr1_Max < 0.69 ) { return new Prediction("NULL", 36, 0); }
	}
	}
	}
	}
	if( Attr6_Max >= 1.03 ) { 
	if( Attr1_Min < -7.56 ) { 
	if( Attr2_Min >= -18.2 ) { 
	if( Attr3_Max >= 12.52 ) { 
		if( Attr2_Max >= 10.47 ) { return new Prediction("NULL", 49, 2); }
		if( Attr2_Max < 10.47 ) { return new Prediction("NULL", 138, 39); }
	}
	if( Attr3_Max < 12.52 ) { 
		if( Attr2_Mean >= -5.25 ) { return new Prediction("smoking", 373, 109); }
		if( Attr2_Mean < -5.25 ) { return new Prediction("NULL", 201, 89); }
	}
	}
	if( Attr2_Min < -18.2 ) { 
	if( Attr2_Mean < -6.63 ) { 
		if( Attr9_Min >= -60.19 ) { return new Prediction("NULL", 94, 8); }
		if( Attr9_Min < -60.19 ) { return new Prediction("NULL", 7, 3); }
	}
	if( Attr2_Mean >= -6.63 ) { 
		if( Attr9_Max >= -40.06 ) { return new Prediction("NULL", 191, 56); }
		if( Attr9_Max < -40.06 ) { return new Prediction("smoking", 6, 0); }
	}
	}
	}
	if( Attr1_Min >= -7.56 ) { 
	if( Attr4_Min >= -4.77 ) { 
	if( Attr1_Mean >= 0.25 ) { 
		if( Attr1_Min < -2.83 ) { return new Prediction("NULL", 369, 159); }
		if( Attr1_Min >= -2.83 ) { return new Prediction("NULL", 1047, 246); }
	}
	if( Attr1_Mean < 0.25 ) { 
		if( Attr7_Max < 16.73 ) { return new Prediction("NULL", 203, 13); }
		if( Attr7_Max >= 16.73 ) { return new Prediction("NULL", 27, 11); }
	}
	}
	if( Attr4_Min < -4.77 ) { 
	if( Attr7_Min < -37.5 ) { 
		if( Attr4_Min < -4.86 ) { return new Prediction("NULL", 273, 68); }
		if( Attr4_Min >= -4.86 ) { return new Prediction("NULL", 22, 0); }
	}
	if( Attr7_Min >= -37.5 ) { 
		if( Attr7_Min >= -0.57 ) { return new Prediction("NULL", 39, 13); }
		if( Attr7_Min < -0.57 ) { return new Prediction("NULL", 401, 33); }
	}
	}
	}
	}
	}
	if( Attr7_Max >= 20.98 ) { 
	if( Attr3_Max < 9.48 ) { 
	if( Attr1_Min >= -6.85 ) { 
	if( Attr4_Max >= 1.18 ) { 
	if( Attr5_Min < -1.8 ) { 
		if( Attr6_Max >= 3.69 ) { return new Prediction("smoking", 39, 15); }
		if( Attr6_Max < 3.69 ) { return new Prediction("NULL", 180, 48); }
	}
	if( Attr5_Min >= -1.8 ) { 
		if( Attr6_Min < -4.8 ) { return new Prediction("smoking", 6, 1); }
		if( Attr6_Min >= -4.8 ) { return new Prediction("NULL", 259, 34); }
	}
	}
	if( Attr4_Max < 1.18 ) { 
	if( Attr2_Min >= -10.8 ) { 
		if( Attr1_Min < 6.66 ) { return new Prediction("NULL", 580, 16); }
		if( Attr1_Min >= 6.66 ) { return new Prediction("NULL", 97, 27); }
	}
	if( Attr2_Min < -10.8 ) { 
		if( Attr4_Min < -0.03 ) { return new Prediction("NULL", 60, 16); }
		if( Attr4_Min >= -0.03 ) { return new Prediction("smoking", 11, 0); }
	}
	}
	}
	if( Attr1_Min < -6.85 ) { 
	if( Attr1_Max >= -0.53 ) { 
	if( Attr4_Max < 4.04 ) { 
		if( Attr6_Max >= 1.77 ) { return new Prediction("smoking", 1229, 136); }
		if( Attr6_Max < 1.77 ) { return new Prediction("smoking", 314, 130); }
	}
	if( Attr4_Max >= 4.04 ) { 
		if( Attr1_Max >= 6.84 ) { return new Prediction("smoking", 364, 127); }
		if( Attr1_Max < 6.84 ) { return new Prediction("NULL", 126, 44); }
	}
	}
	if( Attr1_Max < -0.53 ) { 
	if( Attr3_Mean >= 2.69 ) { 
		if( Attr8_Min < -10.19 ) { return new Prediction("smoking", 96, 34); }
		if( Attr8_Min >= -10.19 ) { return new Prediction("NULL", 130, 30); }
	}
	if( Attr3_Mean < 2.69 ) { 
		if( Attr6_Mean < 0.03 ) { return new Prediction("NULL", 465, 47); }
		if( Attr6_Mean >= 0.03 ) { return new Prediction("NULL", 38, 16); }
	}
	}
	}
	}
	if( Attr3_Max >= 9.48 ) { 
	if( Attr3_Mean >= 8.71 ) { 
	if( Attr3_Min < 6.37 ) { 
	if( Attr7_Min >= -805.85 ) { 
		if( Attr5_Max >= 1.97 ) { return new Prediction("NULL", 26, 0); }
		if( Attr5_Max < 1.97 ) { return new Prediction("NULL", 72, 9); }
	}
		if( Attr7_Min < -805.85 ) { return new Prediction("smoking", 2, 0); }
	}
		if( Attr3_Min >= 6.37 ) { return new Prediction("NULL", 699, 0); }
	}
	if( Attr3_Mean < 8.71 ) { 
	if( Attr3_Max < 11.83 ) { 
	if( Attr6_Min < -2.28 ) { 
		if( Attr4_Max < 4.75 ) { return new Prediction("smoking", 461, 146); }
		if( Attr4_Max >= 4.75 ) { return new Prediction("NULL", 437, 205); }
	}
	if( Attr6_Min >= -2.28 ) { 
		if( Attr2_Max < 5.44 ) { return new Prediction("NULL", 392, 84); }
		if( Attr2_Max >= 5.44 ) { return new Prediction("smoking", 80, 30); }
	}
	}
	if( Attr3_Max >= 11.83 ) { 
	if( Attr5_Max < 4.83 ) { 
		if( Attr3_Min < -10.2 ) { return new Prediction("NULL", 471, 87); }
		if( Attr3_Min >= -10.2 ) { return new Prediction("NULL", 1016, 339); }
	}
	if( Attr5_Max >= 4.83 ) { 
		if( Attr2_Mean >= -3.82 ) { return new Prediction("NULL", 134, 6); }
		if( Attr2_Mean < -3.82 ) { return new Prediction("NULL", 215, 41); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree56() {
	if( Attr1_Min < -6.53 ) { 
	if( Attr6_Min < -2.28 ) { 
	if( Attr5_Min >= -3.86 ) { 
	if( Attr4_Min >= -5.02 ) { 
	if( Attr2_Min < -15.69 ) { 
		if( Attr6_Max >= 2.75 ) { return new Prediction("smoking", 368, 119); }
		if( Attr6_Max < 2.75 ) { return new Prediction("NULL", 151, 58); }
	}
	if( Attr2_Min >= -15.69 ) { 
		if( Attr4_Max >= 3.97 ) { return new Prediction("smoking", 474, 170); }
		if( Attr4_Max < 3.97 ) { return new Prediction("smoking", 1487, 202); }
	}
	}
	if( Attr4_Min < -5.02 ) { 
	if( Attr7_Min >= -40.87 ) { 
		if( Attr8_Max < 15.57 ) { return new Prediction("smoking", 117, 41); }
		if( Attr8_Max >= 15.57 ) { return new Prediction("NULL", 708, 223); }
	}
	if( Attr7_Min < -40.87 ) { 
		if( Attr3_Max >= 12.78 ) { return new Prediction("NULL", 108, 42); }
		if( Attr3_Max < 12.78 ) { return new Prediction("smoking", 261, 64); }
	}
	}
	}
	if( Attr5_Min < -3.86 ) { 
	if( Attr3_Max < 9.29 ) { 
	if( Attr5_Mean < 0.11 ) { 
		if( Attr9_Mean >= -19.3 ) { return new Prediction("smoking", 187, 62); }
		if( Attr9_Mean < -19.3 ) { return new Prediction("smoking", 24, 0); }
	}
		if( Attr5_Mean >= 0.11 ) { return new Prediction("NULL", 7, 0); }
	}
	if( Attr3_Max >= 9.29 ) { 
	if( Attr2_Max < 19.77 ) { 
		if( Attr9_Max < 14.51 ) { return new Prediction("NULL", 203, 91); }
		if( Attr9_Max >= 14.51 ) { return new Prediction("NULL", 572, 131); }
	}
	if( Attr2_Max >= 19.77 ) { 
		if( Attr7_Min >= -43.03 ) { return new Prediction("NULL", 79, 1); }
		if( Attr7_Min < -43.03 ) { return new Prediction("NULL", 12, 3); }
	}
	}
	}
	}
	if( Attr6_Min >= -2.28 ) { 
	if( Attr7_Min >= 19.32 ) { 
	if( Attr8_Max < 0.42 ) { 
		if( Attr4_Max < 8.35 ) { return new Prediction("NULL", 112, 0); }
		if( Attr4_Max >= 8.35 ) { return new Prediction("smoking", 1, 0); }
	}
	if( Attr8_Max >= 0.42 ) { 
	if( Attr3_Mean < 0.56 ) { 
		if( Attr8_Min >= -9.25 ) { return new Prediction("smoking", 50, 22); }
		if( Attr8_Min < -9.25 ) { return new Prediction("NULL", 15, 0); }
	}
	if( Attr3_Mean >= 0.56 ) { 
		if( Attr2_Mean < -3.85 ) { return new Prediction("NULL", 201, 1); }
		if( Attr2_Mean >= -3.85 ) { return new Prediction("NULL", 140, 27); }
	}
	}
	}
	if( Attr7_Min < 19.32 ) { 
	if( Attr4_Mean < 0.1 ) { 
	if( Attr3_Min < -1.31 ) { 
		if( Attr1_Mean >= -3.09 ) { return new Prediction("NULL", 507, 181); }
		if( Attr1_Mean < -3.09 ) { return new Prediction("NULL", 384, 65); }
	}
	if( Attr3_Min >= -1.31 ) { 
		if( Attr3_Mean >= 6.55 ) { return new Prediction("NULL", 88, 16); }
		if( Attr3_Mean < 6.55 ) { return new Prediction("smoking", 438, 206); }
	}
	}
	if( Attr4_Mean >= 0.1 ) { 
	if( Attr9_Max >= -35.55 ) { 
		if( Attr5_Max >= 1.03 ) { return new Prediction("NULL", 57, 8); }
		if( Attr5_Max < 1.03 ) { return new Prediction("NULL", 39, 0); }
	}
		if( Attr9_Max < -35.55 ) { return new Prediction("smoking", 2, 0); }
	}
	}
	}
	}
	if( Attr1_Min >= -6.53 ) { 
	if( Attr1_Mean >= 0.36 ) { 
	if( Attr6_Min >= -0.53 ) { 
	if( Attr6_Max < 2.24 ) { 
	if( Attr7_Mean < -71.03 ) { 
		if( Attr8_Mean < 22.32 ) { return new Prediction("NULL", 18, 1); }
		if( Attr8_Mean >= 22.32 ) { return new Prediction("smoking", 13, 0); }
	}
	if( Attr7_Mean >= -71.03 ) { 
		if( Attr4_Max < 0 ) { return new Prediction("NULL", 294, 52); }
		if( Attr4_Max >= 0 ) { return new Prediction("NULL", 2204, 141); }
	}
	}
	if( Attr6_Max >= 2.24 ) { 
	if( Attr9_Mean >= -12.92 ) { 
		if( Attr9_Max < 8.17 ) { return new Prediction("smoking", 11, 0); }
		if( Attr9_Max >= 8.17 ) { return new Prediction("NULL", 21, 10); }
	}
	if( Attr9_Mean < -12.92 ) { 
		if( Attr1_Mean < 1 ) { return new Prediction("smoking", 2, 0); }
		if( Attr1_Mean >= 1 ) { return new Prediction("NULL", 17, 1); }
	}
	}
	}
	if( Attr6_Min < -0.53 ) { 
		if( Attr5_Max < 0.07 ) { return new Prediction("NULL", 90, 0); }
	if( Attr5_Max >= 0.07 ) { 
	if( Attr1_Mean >= 10.54 ) { 
		if( Attr7_Max >= -2.49 ) { return new Prediction("smoking", 18, 0); }
		if( Attr7_Max < -2.49 ) { return new Prediction("smoking", 24, 12); }
	}
	if( Attr1_Mean < 10.54 ) { 
		if( Attr9_Max < 13.79 ) { return new Prediction("NULL", 1410, 417); }
		if( Attr9_Max >= 13.79 ) { return new Prediction("NULL", 1803, 325); }
	}
	}
	}
	}
	if( Attr1_Mean < 0.36 ) { 
	if( Attr3_Min >= 6.97 ) { 
	if( Attr4_Min < -2.54 ) { 
	if( Attr4_Min >= -3.63 ) { 
		if( Attr2_Mean >= -2.83 ) { return new Prediction("NULL", 1, 0); }
		if( Attr2_Mean < -2.83 ) { return new Prediction("smoking", 2, 0); }
	}
		if( Attr4_Min < -3.63 ) { return new Prediction("NULL", 19, 0); }
	}
	if( Attr4_Min >= -2.54 ) { 
	if( Attr3_Max < 9.13 ) { 
		if( Attr1_Max >= 0.33 ) { return new Prediction("NULL", 13, 2); }
		if( Attr1_Max < 0.33 ) { return new Prediction("NULL", 169, 0); }
	}
		if( Attr3_Max >= 9.13 ) { return new Prediction("NULL", 1315, 0); }
	}
	}
	if( Attr3_Min < 6.97 ) { 
	if( Attr6_Max < 2.88 ) { 
	if( Attr8_Max < 44.9 ) { 
		if( Attr6_Min >= -2.12 ) { return new Prediction("NULL", 1172, 65); }
		if( Attr6_Min < -2.12 ) { return new Prediction("NULL", 122, 30); }
	}
	if( Attr8_Max >= 44.9 ) { 
		if( Attr7_Mean < 17.34 ) { return new Prediction("NULL", 217, 45); }
		if( Attr7_Mean >= 17.34 ) { return new Prediction("NULL", 32, 0); }
	}
	}
	if( Attr6_Max >= 2.88 ) { 
	if( Attr8_Max < 17.72 ) { 
		if( Attr1_Max >= 3.54 ) { return new Prediction("smoking", 11, 0); }
		if( Attr1_Max < 3.54 ) { return new Prediction("NULL", 5, 0); }
	}
	if( Attr8_Max >= 17.72 ) { 
		if( Attr6_Mean < 0.02 ) { return new Prediction("NULL", 36, 17); }
		if( Attr6_Mean >= 0.02 ) { return new Prediction("NULL", 47, 6); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree57() {
	if( Attr1_Min >= -6.65 ) { 
	if( Attr4_Max >= 1.34 ) { 
	if( Attr1_Max < 5.05 ) { 
	if( Attr8_Min >= 11.2 ) { 
	if( Attr9_Min < -62.4 ) { 
		if( Attr5_Max < 1.19 ) { return new Prediction("smoking", 9, 0); }
		if( Attr5_Max >= 1.19 ) { return new Prediction("NULL", 3, 1); }
	}
	if( Attr9_Min >= -62.4 ) { 
		if( Attr1_Min >= -6.29 ) { return new Prediction("NULL", 220, 24); }
		if( Attr1_Min < -6.29 ) { return new Prediction("smoking", 11, 4); }
	}
	}
	if( Attr8_Min < 11.2 ) { 
	if( Attr7_Min >= 4.47 ) { 
		if( Attr6_Mean >= -0.03 ) { return new Prediction("NULL", 131, 0); }
		if( Attr6_Mean < -0.03 ) { return new Prediction("NULL", 21, 2); }
	}
	if( Attr7_Min < 4.47 ) { 
		if( Attr7_Min >= 4.14 ) { return new Prediction("smoking", 2, 0); }
		if( Attr7_Min < 4.14 ) { return new Prediction("NULL", 389, 34); }
	}
	}
	}
	if( Attr1_Max >= 5.05 ) { 
	if( Attr9_Max < 13.08 ) { 
	if( Attr4_Mean < -0.07 ) { 
		if( Attr1_Mean >= 10.49 ) { return new Prediction("smoking", 5, 2); }
		if( Attr1_Mean < 10.49 ) { return new Prediction("NULL", 130, 5); }
	}
	if( Attr4_Mean >= -0.07 ) { 
		if( Attr2_Max >= 3.96 ) { return new Prediction("NULL", 331, 63); }
		if( Attr2_Max < 3.96 ) { return new Prediction("NULL", 869, 338); }
	}
	}
	if( Attr9_Max >= 13.08 ) { 
	if( Attr9_Min >= -13.86 ) { 
		if( Attr9_Mean < 129.81 ) { return new Prediction("NULL", 541, 61); }
		if( Attr9_Mean >= 129.81 ) { return new Prediction("smoking", 5, 0); }
	}
	if( Attr9_Min < -13.86 ) { 
		if( Attr6_Mean < -0.14 ) { return new Prediction("NULL", 27, 0); }
		if( Attr6_Mean >= -0.14 ) { return new Prediction("NULL", 1254, 261); }
	}
	}
	}
	}
	if( Attr4_Max < 1.34 ) { 
	if( Attr2_Min < -2.23 ) { 
	if( Attr7_Min >= -26.71 ) { 
	if( Attr2_Min < -10.54 ) { 
		if( Attr1_Mean < 8.75 ) { return new Prediction("NULL", 225, 44); }
		if( Attr1_Mean >= 8.75 ) { return new Prediction("smoking", 5, 0); }
	}
	if( Attr2_Min >= -10.54 ) { 
		if( Attr3_Max >= -0.54 ) { return new Prediction("NULL", 1550, 102); }
		if( Attr3_Max < -0.54 ) { return new Prediction("NULL", 604, 12); }
	}
	}
	if( Attr7_Min < -26.71 ) { 
	if( Attr4_Min < -1.88 ) { 
		if( Attr3_Min >= 2.7 ) { return new Prediction("smoking", 17, 5); }
		if( Attr3_Min < 2.7 ) { return new Prediction("NULL", 103, 29); }
	}
	if( Attr4_Min >= -1.88 ) { 
		if( Attr5_Min < -0 ) { return new Prediction("NULL", 846, 77); }
		if( Attr5_Min >= -0 ) { return new Prediction("NULL", 133, 43); }
	}
	}
	}
	if( Attr2_Min >= -2.23 ) { 
	if( Attr4_Max < 0.25 ) { 
	if( Attr3_Min < 0.56 ) { 
		if( Attr2_Mean < 0.06 ) { return new Prediction("NULL", 37, 2); }
		if( Attr2_Mean >= 0.06 ) { return new Prediction("NULL", 116, 0); }
	}
		if( Attr3_Min >= 0.56 ) { return new Prediction("NULL", 1299, 0); }
	}
	if( Attr4_Max >= 0.25 ) { 
		if( Attr2_Max < 4.58 ) { return new Prediction("NULL", 72, 0); }
	if( Attr2_Max >= 4.58 ) { 
		if( Attr2_Min < 0.35 ) { return new Prediction("smoking", 4, 1); }
		if( Attr2_Min >= 0.35 ) { return new Prediction("NULL", 39, 4); }
	}
	}
	}
	}
	}
	if( Attr1_Min < -6.65 ) { 
	if( Attr3_Max < 12.67 ) { 
	if( Attr4_Min < -1.71 ) { 
	if( Attr4_Min < -5.3 ) { 
	if( Attr1_Mean >= 5.81 ) { 
		if( Attr2_Max < 4.67 ) { return new Prediction("smoking", 45, 2); }
		if( Attr2_Max >= 4.67 ) { return new Prediction("smoking", 18, 8); }
	}
	if( Attr1_Mean < 5.81 ) { 
		if( Attr9_Min >= -82.24 ) { return new Prediction("NULL", 973, 422); }
		if( Attr9_Min < -82.24 ) { return new Prediction("NULL", 24, 0); }
	}
	}
	if( Attr4_Min >= -5.3 ) { 
	if( Attr8_Max >= 35.98 ) { 
		if( Attr1_Max >= 7.28 ) { return new Prediction("smoking", 1254, 235); }
		if( Attr1_Max < 7.28 ) { return new Prediction("smoking", 871, 354); }
	}
	if( Attr8_Max < 35.98 ) { 
		if( Attr7_Min >= 24.14 ) { return new Prediction("NULL", 123, 30); }
		if( Attr7_Min < 24.14 ) { return new Prediction("smoking", 1036, 403); }
	}
	}
	}
	if( Attr4_Min >= -1.71 ) { 
	if( Attr6_Max >= 1.49 ) { 
	if( Attr2_Max >= 3.03 ) { 
		if( Attr1_Max < 8.01 ) { return new Prediction("NULL", 16, 0); }
		if( Attr1_Max >= 8.01 ) { return new Prediction("smoking", 11, 3); }
	}
	if( Attr2_Max < 3.03 ) { 
		if( Attr7_Mean >= 27.34 ) { return new Prediction("NULL", 32, 13); }
		if( Attr7_Mean < 27.34 ) { return new Prediction("smoking", 145, 17); }
	}
	}
	if( Attr6_Max < 1.49 ) { 
	if( Attr2_Max < -0.27 ) { 
		if( Attr1_Max < 8.59 ) { return new Prediction("NULL", 315, 55); }
		if( Attr1_Max >= 8.59 ) { return new Prediction("smoking", 23, 2); }
	}
	if( Attr2_Max >= -0.27 ) { 
		if( Attr2_Min >= 0.55 ) { return new Prediction("NULL", 76, 0); }
		if( Attr2_Min < 0.55 ) { return new Prediction("NULL", 198, 13); }
	}
	}
	}
	}
	if( Attr3_Max >= 12.67 ) { 
	if( Attr7_Min >= -36.75 ) { 
	if( Attr3_Min < -8.72 ) { 
	if( Attr2_Max >= 19.82 ) { 
		if( Attr4_Min >= -4.88 ) { return new Prediction("NULL", 13, 1); }
		if( Attr4_Min < -4.88 ) { return new Prediction("NULL", 52, 0); }
	}
	if( Attr2_Max < 19.82 ) { 
		if( Attr1_Max < 19.71 ) { return new Prediction("NULL", 492, 97); }
		if( Attr1_Max >= 19.71 ) { return new Prediction("NULL", 34, 0); }
	}
	}
	if( Attr3_Min >= -8.72 ) { 
		if( Attr2_Max >= 19.79 ) { return new Prediction("NULL", 36, 0); }
	if( Attr2_Max < 19.79 ) { 
		if( Attr3_Max < 15.12 ) { return new Prediction("NULL", 233, 97); }
		if( Attr3_Max >= 15.12 ) { return new Prediction("NULL", 273, 50); }
	}
	}
	}
	if( Attr7_Min < -36.75 ) { 
	if( Attr5_Max >= 1.17 ) { 
	if( Attr2_Max >= 19.88 ) { 
		if( Attr9_Max >= 10.85 ) { return new Prediction("NULL", 34, 0); }
		if( Attr9_Max < 10.85 ) { return new Prediction("NULL", 6, 1); }
	}
	if( Attr2_Max < 19.88 ) { 
		if( Attr2_Mean < -6.01 ) { return new Prediction("NULL", 132, 30); }
		if( Attr2_Mean >= -6.01 ) { return new Prediction("NULL", 387, 161); }
	}
	}
		if( Attr5_Max < 1.17 ) { return new Prediction("NULL", 28, 0); }
	}
	}
	}
return null;
}
private Prediction runTree58() {
	if( Attr5_Max < 0.71 ) { 
	if( Attr3_Min < 7.05 ) { 
	if( Attr5_Min >= -0.65 ) { 
	if( Attr4_Max < 0 ) { 
	if( Attr6_Max >= -0 ) { 
		if( Attr1_Min < 8.07 ) { return new Prediction("NULL", 270, 50); }
		if( Attr1_Min >= 8.07 ) { return new Prediction("smoking", 38, 11); }
	}
		if( Attr6_Max < -0 ) { return new Prediction("NULL", 47, 0); }
	}
	if( Attr4_Max >= 0 ) { 
	if( Attr4_Min >= -0.04 ) { 
		if( Attr8_Min >= -30.1 ) { return new Prediction("NULL", 621, 8); }
		if( Attr8_Min < -30.1 ) { return new Prediction("NULL", 46, 6); }
	}
	if( Attr4_Min < -0.04 ) { 
		if( Attr2_Min < -10.5 ) { return new Prediction("NULL", 269, 55); }
		if( Attr2_Min >= -10.5 ) { return new Prediction("NULL", 2165, 186); }
	}
	}
	}
	if( Attr5_Min < -0.65 ) { 
	if( Attr1_Min >= -6.81 ) { 
	if( Attr7_Mean >= -59.35 ) { 
		if( Attr1_Max >= 8.85 ) { return new Prediction("NULL", 267, 65); }
		if( Attr1_Max < 8.85 ) { return new Prediction("NULL", 340, 33); }
	}
		if( Attr7_Mean < -59.35 ) { return new Prediction("smoking", 7, 0); }
	}
	if( Attr1_Min < -6.81 ) { 
	if( Attr1_Min >= -8.99 ) { 
		if( Attr3_Mean < 4.59 ) { return new Prediction("smoking", 105, 13); }
		if( Attr3_Mean >= 4.59 ) { return new Prediction("NULL", 29, 6); }
	}
	if( Attr1_Min < -8.99 ) { 
		if( Attr9_Mean >= -3.65 ) { return new Prediction("NULL", 50, 24); }
		if( Attr9_Mean < -3.65 ) { return new Prediction("NULL", 81, 9); }
	}
	}
	}
	}
	if( Attr3_Min >= 7.05 ) { 
	if( Attr1_Min >= 1.22 ) { 
		if( Attr2_Min >= -2.17 ) { return new Prediction("NULL", 83, 0); }
	if( Attr2_Min < -2.17 ) { 
	if( Attr7_Max < 2.11 ) { 
		if( Attr3_Mean >= 8.49 ) { return new Prediction("smoking", 4, 0); }
		if( Attr3_Mean < 8.49 ) { return new Prediction("NULL", 17, 3); }
	}
		if( Attr7_Max >= 2.11 ) { return new Prediction("NULL", 37, 0); }
	}
	}
	if( Attr1_Min < 1.22 ) { 
	if( Attr6_Mean < -0 ) { 
		if( Attr3_Mean >= 8.35 ) { return new Prediction("NULL", 220, 0); }
	if( Attr3_Mean < 8.35 ) { 
		if( Attr2_Min >= -5.12 ) { return new Prediction("smoking", 3, 1); }
		if( Attr2_Min < -5.12 ) { return new Prediction("NULL", 25, 0); }
	}
	}
		if( Attr6_Mean >= -0 ) { return new Prediction("NULL", 1305, 0); }
	}
	}
	}
	if( Attr5_Max >= 0.71 ) { 
	if( Attr6_Max < 1.67 ) { 
	if( Attr4_Mean >= -0.14 ) { 
	if( Attr6_Max >= 1.04 ) { 
	if( Attr3_Max < 19.53 ) { 
		if( Attr7_Max >= 37.2 ) { return new Prediction("NULL", 227, 101); }
		if( Attr7_Max < 37.2 ) { return new Prediction("NULL", 924, 237); }
	}
		if( Attr3_Max >= 19.53 ) { return new Prediction("NULL", 42, 0); }
	}
	if( Attr6_Max < 1.04 ) { 
	if( Attr3_Max >= 6.51 ) { 
		if( Attr2_Mean >= -1.56 ) { return new Prediction("smoking", 142, 61); }
		if( Attr2_Mean < -1.56 ) { return new Prediction("NULL", 483, 78); }
	}
	if( Attr3_Max < 6.51 ) { 
		if( Attr4_Mean >= 0.11 ) { return new Prediction("NULL", 43, 0); }
		if( Attr4_Mean < 0.11 ) { return new Prediction("NULL", 443, 58); }
	}
	}
	}
	if( Attr4_Mean < -0.14 ) { 
	if( Attr1_Mean < -1.49 ) { 
		if( Attr2_Mean >= -2.5 ) { return new Prediction("smoking", 1, 0); }
		if( Attr2_Mean < -2.5 ) { return new Prediction("NULL", 11, 0); }
	}
		if( Attr1_Mean >= -1.49 ) { return new Prediction("NULL", 87, 0); }
	}
	}
	if( Attr6_Max >= 1.67 ) { 
	if( Attr4_Max < 5.04 ) { 
	if( Attr6_Max >= 4.04 ) { 
	if( Attr2_Mean >= -5.68 ) { 
		if( Attr1_Max < 7.75 ) { return new Prediction("NULL", 111, 43); }
		if( Attr1_Max >= 7.75 ) { return new Prediction("smoking", 1043, 150); }
	}
	if( Attr2_Mean < -5.68 ) { 
		if( Attr1_Min >= -4.08 ) { return new Prediction("NULL", 26, 0); }
		if( Attr1_Min < -4.08 ) { return new Prediction("NULL", 153, 62); }
	}
	}
	if( Attr6_Max < 4.04 ) { 
	if( Attr6_Min >= -2.65 ) { 
		if( Attr7_Max < -7.12 ) { return new Prediction("NULL", 245, 50); }
		if( Attr7_Max >= -7.12 ) { return new Prediction("NULL", 1280, 476); }
	}
	if( Attr6_Min < -2.65 ) { 
		if( Attr1_Min < -6.83 ) { return new Prediction("smoking", 1251, 325); }
		if( Attr1_Min >= -6.83 ) { return new Prediction("NULL", 379, 109); }
	}
	}
	}
	if( Attr4_Max >= 5.04 ) { 
	if( Attr9_Max < -14.26 ) { 
		if( Attr8_Mean >= 76.66 ) { return new Prediction("NULL", 17, 0); }
	if( Attr8_Mean < 76.66 ) { 
		if( Attr1_Mean >= -6.83 ) { return new Prediction("NULL", 269, 131); }
		if( Attr1_Mean < -6.83 ) { return new Prediction("smoking", 18, 0); }
	}
	}
	if( Attr9_Max >= -14.26 ) { 
	if( Attr5_Min < -7.17 ) { 
		if( Attr4_Min >= -25.03 ) { return new Prediction("NULL", 129, 4); }
		if( Attr4_Min < -25.03 ) { return new Prediction("smoking", 1, 0); }
	}
	if( Attr5_Min >= -7.17 ) { 
		if( Attr3_Min >= -1.12 ) { return new Prediction("smoking", 163, 59); }
		if( Attr3_Min < -1.12 ) { return new Prediction("NULL", 2361, 636); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree59() {
	if( Attr6_Min >= -1.92 ) { 
	if( Attr5_Max < 0.3 ) { 
	if( Attr3_Mean >= 8.34 ) { 
		if( Attr4_Min >= -0.06 ) { return new Prediction("NULL", 1149, 0); }
	if( Attr4_Min < -0.06 ) { 
		if( Attr6_Min < -0.08 ) { return new Prediction("NULL", 223, 0); }
	if( Attr6_Min >= -0.08 ) { 
		if( Attr4_Min >= -0.06 ) { return new Prediction("smoking", 1, 0); }
		if( Attr4_Min < -0.06 ) { return new Prediction("NULL", 104, 1); }
	}
	}
	}
	if( Attr3_Mean < 8.34 ) { 
	if( Attr3_Mean >= -2.4 ) { 
	if( Attr6_Mean < 0 ) { 
		if( Attr5_Max >= 0.02 ) { return new Prediction("NULL", 992, 91); }
		if( Attr5_Max < 0.02 ) { return new Prediction("NULL", 435, 9); }
	}
	if( Attr6_Mean >= 0 ) { 
		if( Attr5_Mean < 0.01 ) { return new Prediction("NULL", 633, 139); }
		if( Attr5_Mean >= 0.01 ) { return new Prediction("NULL", 139, 1); }
	}
	}
	if( Attr3_Mean < -2.4 ) { 
	if( Attr2_Mean >= -9.73 ) { 
		if( Attr5_Mean >= 0 ) { return new Prediction("NULL", 189, 12); }
		if( Attr5_Mean < 0 ) { return new Prediction("NULL", 656, 8); }
	}
		if( Attr2_Mean < -9.73 ) { return new Prediction("smoking", 6, 0); }
	}
	}
	}
	if( Attr5_Max >= 0.3 ) { 
	if( Attr4_Mean < -0.13 ) { 
		if( Attr5_Max < 3.7 ) { return new Prediction("NULL", 136, 0); }
		if( Attr5_Max >= 3.7 ) { return new Prediction("smoking", 1, 0); }
	}
	if( Attr4_Mean >= -0.13 ) { 
	if( Attr7_Min < -28.29 ) { 
	if( Attr7_Max < -12.85 ) { 
		if( Attr2_Max < 1.1 ) { return new Prediction("NULL", 349, 83); }
		if( Attr2_Max >= 1.1 ) { return new Prediction("NULL", 277, 26); }
	}
	if( Attr7_Max >= -12.85 ) { 
		if( Attr9_Min >= -47.39 ) { return new Prediction("NULL", 824, 312); }
		if( Attr9_Min < -47.39 ) { return new Prediction("NULL", 156, 18); }
	}
	}
	if( Attr7_Min >= -28.29 ) { 
	if( Attr1_Max < 7.5 ) { 
		if( Attr1_Min >= -4.82 ) { return new Prediction("NULL", 892, 57); }
		if( Attr1_Min < -4.82 ) { return new Prediction("NULL", 991, 201); }
	}
	if( Attr1_Max >= 7.5 ) { 
		if( Attr1_Mean >= 9.06 ) { return new Prediction("NULL", 32, 0); }
		if( Attr1_Mean < 9.06 ) { return new Prediction("NULL", 566, 141); }
	}
	}
	}
	}
	}
	if( Attr6_Min < -1.92 ) { 
	if( Attr7_Max >= 23.5 ) { 
	if( Attr4_Max < 4.21 ) { 
	if( Attr1_Min >= -6.66 ) { 
	if( Attr4_Min < -4.05 ) { 
		if( Attr8_Min < -11.56 ) { return new Prediction("NULL", 49, 1); }
		if( Attr8_Min >= -11.56 ) { return new Prediction("NULL", 33, 7); }
	}
	if( Attr4_Min >= -4.05 ) { 
		if( Attr1_Max >= 16.83 ) { return new Prediction("smoking", 12, 1); }
		if( Attr1_Max < 16.83 ) { return new Prediction("NULL", 119, 36); }
	}
	}
	if( Attr1_Min < -6.66 ) { 
	if( Attr7_Min < -33.25 ) { 
		if( Attr2_Max < 7.21 ) { return new Prediction("smoking", 915, 80); }
		if( Attr2_Max >= 7.21 ) { return new Prediction("NULL", 32, 10); }
	}
	if( Attr7_Min >= -33.25 ) { 
		if( Attr9_Mean < 3.45 ) { return new Prediction("smoking", 565, 232); }
		if( Attr9_Mean >= 3.45 ) { return new Prediction("smoking", 363, 69); }
	}
	}
	}
	if( Attr4_Max >= 4.21 ) { 
		if( Attr5_Mean < -1.45 ) { return new Prediction("smoking", 21, 0); }
	if( Attr5_Mean >= -1.45 ) { 
	if( Attr7_Mean >= -18.74 ) { 
		if( Attr2_Min < -16.78 ) { return new Prediction("NULL", 993, 259); }
		if( Attr2_Min >= -16.78 ) { return new Prediction("NULL", 1156, 513); }
	}
	if( Attr7_Mean < -18.74 ) { 
		if( Attr6_Min >= -2.68 ) { return new Prediction("NULL", 25, 9); }
		if( Attr6_Min < -2.68 ) { return new Prediction("smoking", 147, 54); }
	}
	}
	}
	}
	if( Attr7_Max < 23.5 ) { 
	if( Attr1_Min >= -7.41 ) { 
	if( Attr6_Mean >= -0.19 ) { 
	if( Attr1_Mean < 10.72 ) { 
		if( Attr9_Max < 13.82 ) { return new Prediction("NULL", 733, 242); }
		if( Attr9_Max >= 13.82 ) { return new Prediction("NULL", 767, 157); }
	}
	if( Attr1_Mean >= 10.72 ) { 
		if( Attr4_Max < 7.05 ) { return new Prediction("smoking", 29, 2); }
		if( Attr4_Max >= 7.05 ) { return new Prediction("NULL", 2, 0); }
	}
	}
		if( Attr6_Mean < -0.19 ) { return new Prediction("NULL", 55, 0); }
	}
	if( Attr1_Min < -7.41 ) { 
	if( Attr4_Min >= -4.29 ) { 
	if( Attr2_Mean < -6.34 ) { 
		if( Attr3_Min >= -0.8 ) { return new Prediction("smoking", 7, 0); }
		if( Attr3_Min < -0.8 ) { return new Prediction("NULL", 94, 25); }
	}
	if( Attr2_Mean >= -6.34 ) { 
		if( Attr3_Mean >= -0.77 ) { return new Prediction("smoking", 324, 73); }
		if( Attr3_Mean < -0.77 ) { return new Prediction("NULL", 50, 23); }
	}
	}
	if( Attr4_Min < -4.29 ) { 
	if( Attr4_Max < 2.43 ) { 
		if( Attr6_Mean >= -0.01 ) { return new Prediction("smoking", 16, 0); }
		if( Attr6_Mean < -0.01 ) { return new Prediction("smoking", 10, 5); }
	}
	if( Attr4_Max >= 2.43 ) { 
		if( Attr5_Max < 6.22 ) { return new Prediction("NULL", 540, 220); }
		if( Attr5_Max >= 6.22 ) { return new Prediction("NULL", 70, 7); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree60() {
	if( Attr5_Min >= -0.64 ) { 
	if( Attr4_Min < -1.46 ) { 
	if( Attr5_Max < 1.13 ) { 
	if( Attr1_Min < -6.14 ) { 
	if( Attr2_Mean >= -5.53 ) { 
		if( Attr9_Mean >= -5.41 ) { return new Prediction("smoking", 20, 10); }
		if( Attr9_Mean < -5.41 ) { return new Prediction("NULL", 25, 1); }
	}
	if( Attr2_Mean < -5.53 ) { 
		if( Attr1_Mean >= -5.07 ) { return new Prediction("smoking", 26, 6); }
		if( Attr1_Mean < -5.07 ) { return new Prediction("NULL", 5, 0); }
	}
	}
	if( Attr1_Min >= -6.14 ) { 
		if( Attr7_Mean < -79.46 ) { return new Prediction("smoking", 7, 0); }
	if( Attr7_Mean >= -79.46 ) { 
		if( Attr9_Mean >= -7.97 ) { return new Prediction("NULL", 165, 5); }
		if( Attr9_Mean < -7.97 ) { return new Prediction("NULL", 119, 19); }
	}
	}
	}
	if( Attr5_Max >= 1.13 ) { 
	if( Attr7_Max >= 35.1 ) { 
		if( Attr3_Min < -0.2 ) { return new Prediction("smoking", 23, 0); }
	if( Attr3_Min >= -0.2 ) { 
		if( Attr8_Min < -6.23 ) { return new Prediction("NULL", 8, 3); }
		if( Attr8_Min >= -6.23 ) { return new Prediction("smoking", 8, 0); }
	}
	}
	if( Attr7_Max < 35.1 ) { 
	if( Attr2_Min < -11.47 ) { 
		if( Attr6_Min < -2.81 ) { return new Prediction("smoking", 12, 2); }
		if( Attr6_Min >= -2.81 ) { return new Prediction("NULL", 27, 8); }
	}
	if( Attr2_Min >= -11.47 ) { 
		if( Attr3_Max < 5.17 ) { return new Prediction("NULL", 33, 8); }
		if( Attr3_Max >= 5.17 ) { return new Prediction("NULL", 26, 0); }
	}
	}
	}
	}
	if( Attr4_Min >= -1.46 ) { 
	if( Attr3_Mean < 8.93 ) { 
	if( Attr1_Mean < 8.35 ) { 
	if( Attr6_Min < -1.58 ) { 
		if( Attr6_Max < 0.45 ) { return new Prediction("NULL", 6, 0); }
		if( Attr6_Max >= 0.45 ) { return new Prediction("smoking", 22, 5); }
	}
	if( Attr6_Min >= -1.58 ) { 
		if( Attr2_Min < -10.78 ) { return new Prediction("NULL", 211, 57); }
		if( Attr2_Min >= -10.78 ) { return new Prediction("NULL", 2972, 194); }
	}
	}
	if( Attr1_Mean >= 8.35 ) { 
	if( Attr2_Max < -1.58 ) { 
		if( Attr6_Min < -0 ) { return new Prediction("NULL", 151, 30); }
		if( Attr6_Min >= -0 ) { return new Prediction("smoking", 59, 21); }
	}
	if( Attr2_Max >= -1.58 ) { 
		if( Attr8_Max >= 6.91 ) { return new Prediction("NULL", 83, 12); }
		if( Attr8_Max < 6.91 ) { return new Prediction("NULL", 175, 2); }
	}
	}
	}
		if( Attr3_Mean >= 8.93 ) { return new Prediction("NULL", 1328, 0); }
	}
	}
	if( Attr5_Min < -0.64 ) { 
	if( Attr3_Min < -9.59 ) { 
	if( Attr8_Min < -31.04 ) { 
	if( Attr7_Mean < 20.8 ) { 
	if( Attr2_Max < -0.51 ) { 
		if( Attr5_Min >= -1.78 ) { return new Prediction("NULL", 1, 0); }
		if( Attr5_Min < -1.78 ) { return new Prediction("smoking", 7, 0); }
	}
	if( Attr2_Max >= -0.51 ) { 
		if( Attr2_Min < -16.65 ) { return new Prediction("NULL", 196, 51); }
		if( Attr2_Min >= -16.65 ) { return new Prediction("NULL", 146, 11); }
	}
	}
	if( Attr7_Mean >= 20.8 ) { 
	if( Attr2_Mean >= -2.59 ) { 
		if( Attr6_Max >= 1.85 ) { return new Prediction("NULL", 17, 1); }
		if( Attr6_Max < 1.85 ) { return new Prediction("smoking", 1, 0); }
	}
		if( Attr2_Mean < -2.59 ) { return new Prediction("NULL", 85, 0); }
	}
	}
	if( Attr8_Min >= -31.04 ) { 
	if( Attr1_Min < -3.78 ) { 
	if( Attr7_Min >= -36.75 ) { 
		if( Attr4_Mean >= 0.18 ) { return new Prediction("NULL", 43, 1); }
		if( Attr4_Mean < 0.18 ) { return new Prediction("NULL", 984, 270); }
	}
	if( Attr7_Min < -36.75 ) { 
		if( Attr5_Mean >= 0.07 ) { return new Prediction("NULL", 97, 25); }
		if( Attr5_Mean < 0.07 ) { return new Prediction("NULL", 606, 277); }
	}
	}
	if( Attr1_Min >= -3.78 ) { 
	if( Attr1_Max < 13.8 ) { 
		if( Attr1_Max >= 13.56 ) { return new Prediction("smoking", 6, 0); }
		if( Attr1_Max < 13.56 ) { return new Prediction("NULL", 250, 56); }
	}
	if( Attr1_Max >= 13.8 ) { 
		if( Attr6_Max >= 2.11 ) { return new Prediction("NULL", 98, 11); }
		if( Attr6_Max < 2.11 ) { return new Prediction("NULL", 76, 1); }
	}
	}
	}
	}
	if( Attr3_Min >= -9.59 ) { 
	if( Attr7_Max < 24.47 ) { 
	if( Attr6_Max < 2.24 ) { 
	if( Attr1_Min < -7.03 ) { 
		if( Attr3_Mean < -1.99 ) { return new Prediction("NULL", 28, 0); }
		if( Attr3_Mean >= -1.99 ) { return new Prediction("NULL", 311, 128); }
	}
	if( Attr1_Min >= -7.03 ) { 
		if( Attr6_Max >= 0.54 ) { return new Prediction("NULL", 1393, 269); }
		if( Attr6_Max < 0.54 ) { return new Prediction("NULL", 295, 19); }
	}
	}
	if( Attr6_Max >= 2.24 ) { 
	if( Attr6_Max >= 4.07 ) { 
		if( Attr2_Mean >= -5.96 ) { return new Prediction("smoking", 379, 130); }
		if( Attr2_Mean < -5.96 ) { return new Prediction("NULL", 75, 19); }
	}
	if( Attr6_Max < 4.07 ) { 
		if( Attr5_Mean < 0.04 ) { return new Prediction("NULL", 1094, 454); }
		if( Attr5_Mean >= 0.04 ) { return new Prediction("NULL", 135, 24); }
	}
	}
	}
	if( Attr7_Max >= 24.47 ) { 
	if( Attr1_Min >= -7.11 ) { 
	if( Attr1_Mean < 0.74 ) { 
		if( Attr6_Min < -2.81 ) { return new Prediction("NULL", 72, 24); }
		if( Attr6_Min >= -2.81 ) { return new Prediction("NULL", 305, 29); }
	}
	if( Attr1_Mean >= 0.74 ) { 
		if( Attr4_Max >= 13.05 ) { return new Prediction("smoking", 14, 1); }
		if( Attr4_Max < 13.05 ) { return new Prediction("NULL", 372, 105); }
	}
	}
	if( Attr1_Min < -7.11 ) { 
	if( Attr6_Max < 1.89 ) { 
		if( Attr2_Min < -16.18 ) { return new Prediction("NULL", 98, 12); }
		if( Attr2_Min >= -16.18 ) { return new Prediction("NULL", 578, 230); }
	}
	if( Attr6_Max >= 1.89 ) { 
		if( Attr4_Max >= 3.63 ) { return new Prediction("smoking", 1237, 534); }
		if( Attr4_Max < 3.63 ) { return new Prediction("smoking", 1368, 250); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree61() {
	if( Attr5_Max >= 0.76 ) { 
	if( Attr1_Min < -6.68 ) { 
	if( Attr4_Min < -5.28 ) { 
	if( Attr2_Mean >= -5.7 ) { 
	if( Attr1_Max < 8.45 ) { 
		if( Attr3_Min >= 0.16 ) { return new Prediction("smoking", 32, 7); }
		if( Attr3_Min < 0.16 ) { return new Prediction("NULL", 441, 96); }
	}
	if( Attr1_Max >= 8.45 ) { 
		if( Attr3_Min < -13.35 ) { return new Prediction("NULL", 296, 74); }
		if( Attr3_Min >= -13.35 ) { return new Prediction("smoking", 596, 248); }
	}
	}
	if( Attr2_Mean < -5.7 ) { 
	if( Attr7_Max >= 46.98 ) { 
		if( Attr8_Max < 59.84 ) { return new Prediction("NULL", 109, 13); }
		if( Attr8_Max >= 59.84 ) { return new Prediction("NULL", 43, 0); }
	}
	if( Attr7_Max < 46.98 ) { 
		if( Attr4_Min < -7.44 ) { return new Prediction("NULL", 289, 53); }
		if( Attr4_Min >= -7.44 ) { return new Prediction("NULL", 340, 117); }
	}
	}
	}
	if( Attr4_Min >= -5.28 ) { 
	if( Attr9_Mean < -2.68 ) { 
	if( Attr3_Min < 0.1 ) { 
		if( Attr6_Min < -2.64 ) { return new Prediction("smoking", 1022, 360); }
		if( Attr6_Min >= -2.64 ) { return new Prediction("NULL", 660, 157); }
	}
	if( Attr3_Min >= 0.1 ) { 
		if( Attr6_Min >= -2.7 ) { return new Prediction("smoking", 237, 95); }
		if( Attr6_Min < -2.7 ) { return new Prediction("smoking", 191, 25); }
	}
	}
	if( Attr9_Mean >= -2.68 ) { 
	if( Attr1_Mean >= -2.3 ) { 
		if( Attr7_Max >= 38.01 ) { return new Prediction("smoking", 577, 77); }
		if( Attr7_Max < 38.01 ) { return new Prediction("smoking", 414, 158); }
	}
	if( Attr1_Mean < -2.3 ) { 
		if( Attr2_Mean < -5.75 ) { return new Prediction("NULL", 195, 50); }
		if( Attr2_Mean >= -5.75 ) { return new Prediction("smoking", 560, 191); }
	}
	}
	}
	}
	if( Attr1_Min >= -6.68 ) { 
	if( Attr1_Max >= 4.16 ) { 
	if( Attr3_Min < -5.81 ) { 
	if( Attr5_Min < -2.53 ) { 
		if( Attr1_Max < 10.58 ) { return new Prediction("NULL", 132, 54); }
		if( Attr1_Max >= 10.58 ) { return new Prediction("NULL", 432, 79); }
	}
	if( Attr5_Min >= -2.53 ) { 
		if( Attr1_Min < 0.61 ) { return new Prediction("NULL", 573, 102); }
		if( Attr1_Min >= 0.61 ) { return new Prediction("NULL", 257, 18); }
	}
	}
	if( Attr3_Min >= -5.81 ) { 
	if( Attr2_Mean >= -1.89 ) { 
		if( Attr9_Mean < -72.23 ) { return new Prediction("smoking", 9, 2); }
		if( Attr9_Mean >= -72.23 ) { return new Prediction("NULL", 225, 33); }
	}
	if( Attr2_Mean < -1.89 ) { 
		if( Attr4_Mean >= -0.09 ) { return new Prediction("NULL", 1270, 426); }
		if( Attr4_Mean < -0.09 ) { return new Prediction("NULL", 61, 0); }
	}
	}
	}
	if( Attr1_Max < 4.16 ) { 
		if( Attr4_Mean >= 1.04 ) { return new Prediction("smoking", 3, 0); }
	if( Attr4_Mean < 1.04 ) { 
	if( Attr7_Max < 2.23 ) { 
		if( Attr3_Max >= 11.98 ) { return new Prediction("NULL", 22, 2); }
		if( Attr3_Max < 11.98 ) { return new Prediction("NULL", 151, 0); }
	}
	if( Attr7_Max >= 2.23 ) { 
		if( Attr4_Min < -1.45 ) { return new Prediction("NULL", 278, 52); }
		if( Attr4_Min >= -1.45 ) { return new Prediction("NULL", 116, 2); }
	}
	}
	}
	}
	}
	if( Attr5_Max < 0.76 ) { 
	if( Attr2_Min < -10.72 ) { 
	if( Attr7_Max >= 38.52 ) { 
	if( Attr6_Min < -1.94 ) { 
	if( Attr2_Max < 4.89 ) { 
		if( Attr9_Min < -44.4 ) { return new Prediction("smoking", 5, 1); }
		if( Attr9_Min >= -44.4 ) { return new Prediction("smoking", 97, 0); }
	}
		if( Attr2_Max >= 4.89 ) { return new Prediction("NULL", 2, 0); }
	}
	if( Attr6_Min >= -1.94 ) { 
		if( Attr2_Mean < -10.79 ) { return new Prediction("smoking", 4, 0); }
	if( Attr2_Mean >= -10.79 ) { 
		if( Attr6_Min >= -0.48 ) { return new Prediction("NULL", 37, 14); }
		if( Attr6_Min < -0.48 ) { return new Prediction("NULL", 19, 0); }
	}
	}
	}
	if( Attr7_Max < 38.52 ) { 
	if( Attr6_Max < 2.95 ) { 
	if( Attr4_Max >= 3.26 ) { 
		if( Attr3_Mean >= 3.21 ) { return new Prediction("NULL", 23, 2); }
		if( Attr3_Mean < 3.21 ) { return new Prediction("NULL", 56, 0); }
	}
	if( Attr4_Max < 3.26 ) { 
		if( Attr3_Min >= -3.39 ) { return new Prediction("NULL", 251, 77); }
		if( Attr3_Min < -3.39 ) { return new Prediction("NULL", 175, 28); }
	}
	}
	if( Attr6_Max >= 2.95 ) { 
	if( Attr4_Min < -1.95 ) { 
		if( Attr2_Min < -17.04 ) { return new Prediction("NULL", 1, 0); }
		if( Attr2_Min >= -17.04 ) { return new Prediction("smoking", 21, 0); }
	}
	if( Attr4_Min >= -1.95 ) { 
		if( Attr3_Mean < -4.26 ) { return new Prediction("smoking", 3, 0); }
		if( Attr3_Mean >= -4.26 ) { return new Prediction("NULL", 14, 3); }
	}
	}
	}
	}
	if( Attr2_Min >= -10.72 ) { 
	if( Attr4_Min < -0.01 ) { 
	if( Attr1_Mean < 8.34 ) { 
	if( Attr3_Mean < 8.42 ) { 
		if( Attr7_Mean >= -75.77 ) { return new Prediction("NULL", 2959, 283); }
		if( Attr7_Mean < -75.77 ) { return new Prediction("smoking", 20, 2); }
	}
	if( Attr3_Mean >= 8.42 ) { 
		if( Attr3_Min < 6.35 ) { return new Prediction("NULL", 57, 7); }
		if( Attr3_Min >= 6.35 ) { return new Prediction("NULL", 939, 2); }
	}
	}
	if( Attr1_Mean >= 8.34 ) { 
	if( Attr4_Min < -0.01 ) { 
		if( Attr6_Max >= 0.61 ) { return new Prediction("NULL", 111, 33); }
		if( Attr6_Max < 0.61 ) { return new Prediction("NULL", 271, 27); }
	}
	if( Attr4_Min >= -0.01 ) { 
		if( Attr2_Min >= -2.09 ) { return new Prediction("NULL", 1, 0); }
		if( Attr2_Min < -2.09 ) { return new Prediction("smoking", 20, 0); }
	}
	}
	}
	if( Attr4_Min >= -0.01 ) { 
		if( Attr3_Min >= 6.56 ) { return new Prediction("NULL", 756, 0); }
	if( Attr3_Min < 6.56 ) { 
	if( Attr4_Max < 0 ) { 
		if( Attr2_Min >= -5.42 ) { return new Prediction("NULL", 31, 12); }
		if( Attr2_Min < -5.42 ) { return new Prediction("NULL", 59, 3); }
	}
	if( Attr4_Max >= 0 ) { 
		if( Attr2_Min >= -10.09 ) { return new Prediction("NULL", 414, 4); }
		if( Attr2_Min < -10.09 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree62() {
	if( Attr5_Max >= 0.53 ) { 
	if( Attr8_Max >= 35.93 ) { 
	if( Attr3_Min >= -7.23 ) { 
	if( Attr3_Min < 3.75 ) { 
	if( Attr1_Min >= -7.29 ) { 
		if( Attr5_Mean < -0.03 ) { return new Prediction("NULL", 194, 82); }
		if( Attr5_Mean >= -0.03 ) { return new Prediction("NULL", 874, 224); }
	}
	if( Attr1_Min < -7.29 ) { 
		if( Attr6_Max < 1.68 ) { return new Prediction("NULL", 408, 140); }
		if( Attr6_Max >= 1.68 ) { return new Prediction("smoking", 1842, 479); }
	}
	}
	if( Attr3_Min >= 3.75 ) { 
	if( Attr2_Mean < -1.74 ) { 
		if( Attr5_Mean < 0.01 ) { return new Prediction("NULL", 148, 3); }
		if( Attr5_Mean >= 0.01 ) { return new Prediction("NULL", 19, 5); }
	}
	if( Attr2_Mean >= -1.74 ) { 
		if( Attr8_Mean < 27.97 ) { return new Prediction("NULL", 10, 1); }
		if( Attr8_Mean >= 27.97 ) { return new Prediction("smoking", 9, 2); }
	}
	}
	}
	if( Attr3_Min < -7.23 ) { 
	if( Attr9_Min >= -34.19 ) { 
	if( Attr1_Min >= -5.17 ) { 
		if( Attr7_Max < -15.41 ) { return new Prediction("NULL", 42, 0); }
		if( Attr7_Max >= -15.41 ) { return new Prediction("NULL", 239, 51); }
	}
	if( Attr1_Min < -5.17 ) { 
		if( Attr6_Min >= -2.25 ) { return new Prediction("NULL", 138, 39); }
		if( Attr6_Min < -2.25 ) { return new Prediction("smoking", 595, 257); }
	}
	}
	if( Attr9_Min < -34.19 ) { 
	if( Attr5_Max >= 4.61 ) { 
		if( Attr2_Mean < -6.51 ) { return new Prediction("NULL", 71, 1); }
		if( Attr2_Mean >= -6.51 ) { return new Prediction("NULL", 238, 45); }
	}
	if( Attr5_Max < 4.61 ) { 
		if( Attr1_Mean >= 1.77 ) { return new Prediction("NULL", 459, 98); }
		if( Attr1_Mean < 1.77 ) { return new Prediction("NULL", 642, 258); }
	}
	}
	}
	}
	if( Attr8_Max < 35.93 ) { 
	if( Attr5_Min >= -1.27 ) { 
	if( Attr1_Min < -7.75 ) { 
	if( Attr6_Max < 1.78 ) { 
		if( Attr7_Min < 24.84 ) { return new Prediction("NULL", 154, 55); }
		if( Attr7_Min >= 24.84 ) { return new Prediction("NULL", 85, 4); }
	}
	if( Attr6_Max >= 1.78 ) { 
		if( Attr6_Min < -3.97 ) { return new Prediction("smoking", 44, 2); }
		if( Attr6_Min >= -3.97 ) { return new Prediction("NULL", 116, 51); }
	}
	}
	if( Attr1_Min >= -7.75 ) { 
	if( Attr6_Mean < 0.11 ) { 
		if( Attr1_Max < 2.02 ) { return new Prediction("NULL", 183, 7); }
		if( Attr1_Max >= 2.02 ) { return new Prediction("NULL", 757, 163); }
	}
		if( Attr6_Mean >= 0.11 ) { return new Prediction("NULL", 74, 0); }
	}
	}
	if( Attr5_Min < -1.27 ) { 
	if( Attr1_Mean >= -4.63 ) { 
	if( Attr6_Min >= -2.11 ) { 
		if( Attr8_Max >= 11.37 ) { return new Prediction("NULL", 697, 188); }
		if( Attr8_Max < 11.37 ) { return new Prediction("NULL", 177, 14); }
	}
	if( Attr6_Min < -2.11 ) { 
		if( Attr3_Min < -6.5 ) { return new Prediction("NULL", 773, 233); }
		if( Attr3_Min >= -6.5 ) { return new Prediction("NULL", 864, 389); }
	}
	}
	if( Attr1_Mean < -4.63 ) { 
	if( Attr3_Min < -8.44 ) { 
		if( Attr8_Mean < 22.85 ) { return new Prediction("NULL", 129, 19); }
		if( Attr8_Mean >= 22.85 ) { return new Prediction("smoking", 6, 0); }
	}
	if( Attr3_Min >= -8.44 ) { 
		if( Attr8_Mean >= 0.96 ) { return new Prediction("NULL", 264, 126); }
		if( Attr8_Mean < 0.96 ) { return new Prediction("smoking", 270, 62); }
	}
	}
	}
	}
	}
	if( Attr5_Max < 0.53 ) { 
	if( Attr1_Min < -5.21 ) { 
	if( Attr2_Mean < -3.04 ) { 
	if( Attr2_Min < -10.69 ) { 
	if( Attr6_Min < -2.17 ) { 
		if( Attr3_Max >= 7.47 ) { return new Prediction("smoking", 7, 2); }
		if( Attr3_Max < 7.47 ) { return new Prediction("smoking", 56, 0); }
	}
	if( Attr6_Min >= -2.17 ) { 
		if( Attr9_Max >= 19.25 ) { return new Prediction("smoking", 28, 4); }
		if( Attr9_Max < 19.25 ) { return new Prediction("NULL", 35, 13); }
	}
	}
	if( Attr2_Min >= -10.69 ) { 
	if( Attr6_Mean < 0 ) { 
		if( Attr1_Mean < 4.63 ) { return new Prediction("NULL", 103, 1); }
		if( Attr1_Mean >= 4.63 ) { return new Prediction("smoking", 1, 0); }
	}
	if( Attr6_Mean >= 0 ) { 
		if( Attr4_Min < -0.01 ) { return new Prediction("NULL", 98, 17); }
		if( Attr4_Min >= -0.01 ) { return new Prediction("smoking", 17, 4); }
	}
	}
	}
	if( Attr2_Mean >= -3.04 ) { 
	if( Attr6_Max >= 0.19 ) { 
		if( Attr3_Max >= 8.39 ) { return new Prediction("NULL", 23, 0); }
	if( Attr3_Max < 8.39 ) { 
		if( Attr4_Mean >= -0.02 ) { return new Prediction("NULL", 42, 7); }
		if( Attr4_Mean < -0.02 ) { return new Prediction("smoking", 16, 5); }
	}
	}
	if( Attr6_Max < 0.19 ) { 
		if( Attr4_Mean >= -0 ) { return new Prediction("NULL", 161, 0); }
	if( Attr4_Mean < -0 ) { 
		if( Attr5_Mean >= 0 ) { return new Prediction("NULL", 17, 0); }
		if( Attr5_Mean < 0 ) { return new Prediction("NULL", 6, 1); }
	}
	}
	}
	}
	if( Attr1_Min >= -5.21 ) { 
	if( Attr2_Mean < -1.24 ) { 
	if( Attr3_Min >= -4.96 ) { 
	if( Attr1_Mean >= 8.36 ) { 
		if( Attr8_Max < 6.9 ) { return new Prediction("NULL", 118, 6); }
		if( Attr8_Max >= 6.9 ) { return new Prediction("NULL", 177, 72); }
	}
	if( Attr1_Mean < 8.36 ) { 
		if( Attr2_Min < -10.78 ) { return new Prediction("NULL", 197, 38); }
		if( Attr2_Min >= -10.78 ) { return new Prediction("NULL", 2194, 149); }
	}
	}
	if( Attr3_Min < -4.96 ) { 
	if( Attr2_Mean >= -9.99 ) { 
		if( Attr6_Max >= 3.12 ) { return new Prediction("smoking", 3, 1); }
		if( Attr6_Max < 3.12 ) { return new Prediction("NULL", 521, 10); }
	}
		if( Attr2_Mean < -9.99 ) { return new Prediction("smoking", 3, 0); }
	}
	}
	if( Attr2_Mean >= -1.24 ) { 
		if( Attr3_Max >= 6.96 ) { return new Prediction("NULL", 1174, 0); }
	if( Attr3_Max < 6.96 ) { 
		if( Attr3_Max >= 6.81 ) { return new Prediction("smoking", 2, 0); }
	if( Attr3_Max < 6.81 ) { 
		if( Attr5_Min >= -1.09 ) { return new Prediction("NULL", 343, 5); }
		if( Attr5_Min < -1.09 ) { return new Prediction("NULL", 15, 3); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree63() {
	if( Attr6_Min >= -2.12 ) { 
	if( Attr5_Max < 0.75 ) { 
	if( Attr1_Max >= 8.32 ) { 
	if( Attr2_Min < -2.93 ) { 
	if( Attr7_Max < -24.57 ) { 
		if( Attr7_Max >= -33.73 ) { return new Prediction("NULL", 204, 2); }
		if( Attr7_Max < -33.73 ) { return new Prediction("NULL", 55, 19); }
	}
	if( Attr7_Max >= -24.57 ) { 
		if( Attr6_Max >= 2.13 ) { return new Prediction("smoking", 43, 14); }
		if( Attr6_Max < 2.13 ) { return new Prediction("NULL", 352, 107); }
	}
	}
	if( Attr2_Min >= -2.93 ) { 
		if( Attr8_Mean < -1.38 ) { return new Prediction("NULL", 169, 0); }
	if( Attr8_Mean >= -1.38 ) { 
		if( Attr9_Max >= -6.26 ) { return new Prediction("NULL", 120, 5); }
		if( Attr9_Max < -6.26 ) { return new Prediction("NULL", 18, 5); }
	}
	}
	}
	if( Attr1_Max < 8.32 ) { 
	if( Attr2_Min < -1.93 ) { 
	if( Attr2_Min < -9.9 ) { 
		if( Attr4_Mean < 0.03 ) { return new Prediction("NULL", 601, 78); }
		if( Attr4_Mean >= 0.03 ) { return new Prediction("NULL", 66, 24); }
	}
	if( Attr2_Min >= -9.9 ) { 
		if( Attr3_Mean < 7.73 ) { return new Prediction("NULL", 2235, 168); }
		if( Attr3_Mean >= 7.73 ) { return new Prediction("NULL", 636, 10); }
	}
	}
	if( Attr2_Min >= -1.93 ) { 
		if( Attr3_Mean >= 7.89 ) { return new Prediction("NULL", 1164, 0); }
	if( Attr3_Mean < 7.89 ) { 
		if( Attr4_Max >= 0.22 ) { return new Prediction("NULL", 96, 13); }
		if( Attr4_Max < 0.22 ) { return new Prediction("NULL", 224, 2); }
	}
	}
	}
	}
	if( Attr5_Max >= 0.75 ) { 
	if( Attr1_Max < 13.45 ) { 
	if( Attr4_Mean >= -0.17 ) { 
	if( Attr1_Min < -13.28 ) { 
		if( Attr7_Min < -3.42 ) { return new Prediction("NULL", 97, 26); }
		if( Attr7_Min >= -3.42 ) { return new Prediction("NULL", 210, 11); }
	}
	if( Attr1_Min >= -13.28 ) { 
		if( Attr1_Mean < -4.68 ) { return new Prediction("smoking", 330, 163); }
		if( Attr1_Mean >= -4.68 ) { return new Prediction("NULL", 2094, 508); }
	}
	}
	if( Attr4_Mean < -0.17 ) { 
	if( Attr5_Min < -2.86 ) { 
		if( Attr9_Min < -73.47 ) { return new Prediction("smoking", 1, 0); }
		if( Attr9_Min >= -73.47 ) { return new Prediction("NULL", 4, 0); }
	}
		if( Attr5_Min >= -2.86 ) { return new Prediction("NULL", 88, 0); }
	}
	}
	if( Attr1_Max >= 13.45 ) { 
	if( Attr3_Min >= -5 ) { 
	if( Attr8_Max < 5.57 ) { 
		if( Attr6_Max < 2.65 ) { return new Prediction("smoking", 9, 0); }
		if( Attr6_Max >= 2.65 ) { return new Prediction("NULL", 1, 0); }
	}
	if( Attr8_Max >= 5.57 ) { 
		if( Attr5_Mean < 0.01 ) { return new Prediction("NULL", 47, 7); }
		if( Attr5_Mean >= 0.01 ) { return new Prediction("smoking", 27, 13); }
	}
	}
	if( Attr3_Min < -5 ) { 
	if( Attr6_Mean < 0.21 ) { 
		if( Attr8_Max < 19.39 ) { return new Prediction("NULL", 54, 0); }
		if( Attr8_Max >= 19.39 ) { return new Prediction("NULL", 221, 12); }
	}
	if( Attr6_Mean >= 0.21 ) { 
		if( Attr8_Max >= 56.53 ) { return new Prediction("smoking", 4, 0); }
		if( Attr8_Max < 56.53 ) { return new Prediction("NULL", 2, 0); }
	}
	}
	}
	}
	}
	if( Attr6_Min < -2.12 ) { 
	if( Attr4_Max < 4.11 ) { 
	if( Attr8_Max >= 34.91 ) { 
	if( Attr2_Min >= -16.88 ) { 
	if( Attr6_Max >= 3.9 ) { 
		if( Attr1_Max >= 7 ) { return new Prediction("smoking", 547, 48); }
		if( Attr1_Max < 7 ) { return new Prediction("smoking", 36, 18); }
	}
	if( Attr6_Max < 3.9 ) { 
		if( Attr6_Min < -2.66 ) { return new Prediction("smoking", 908, 216); }
		if( Attr6_Min >= -2.66 ) { return new Prediction("NULL", 274, 128); }
	}
	}
	if( Attr2_Min < -16.88 ) { 
	if( Attr2_Mean >= -8.17 ) { 
		if( Attr6_Max >= 3.99 ) { return new Prediction("smoking", 91, 20); }
		if( Attr6_Max < 3.99 ) { return new Prediction("NULL", 123, 49); }
	}
	if( Attr2_Mean < -8.17 ) { 
		if( Attr7_Mean >= -18.93 ) { return new Prediction("NULL", 35, 11); }
		if( Attr7_Mean < -18.93 ) { return new Prediction("NULL", 23, 0); }
	}
	}
	}
	if( Attr8_Max < 34.91 ) { 
	if( Attr6_Max < 4.12 ) { 
	if( Attr6_Max >= 1.04 ) { 
		if( Attr7_Max < 17.72 ) { return new Prediction("NULL", 363, 129); }
		if( Attr7_Max >= 17.72 ) { return new Prediction("smoking", 365, 139); }
	}
	if( Attr6_Max < 1.04 ) { 
		if( Attr4_Max < 1.57 ) { return new Prediction("NULL", 38, 15); }
		if( Attr4_Max >= 1.57 ) { return new Prediction("NULL", 55, 3); }
	}
	}
	if( Attr6_Max >= 4.12 ) { 
	if( Attr1_Max < 7.09 ) { 
		if( Attr9_Min >= -26.79 ) { return new Prediction("NULL", 13, 0); }
		if( Attr9_Min < -26.79 ) { return new Prediction("smoking", 19, 6); }
	}
	if( Attr1_Max >= 7.09 ) { 
		if( Attr3_Max < 8.98 ) { return new Prediction("smoking", 167, 14); }
		if( Attr3_Max >= 8.98 ) { return new Prediction("smoking", 60, 28); }
	}
	}
	}
	}
	if( Attr4_Max >= 4.11 ) { 
	if( Attr1_Max >= 0.87 ) { 
	if( Attr3_Max >= 13.46 ) { 
	if( Attr4_Mean < -0.13 ) { 
		if( Attr1_Min >= -14.61 ) { return new Prediction("NULL", 55, 0); }
		if( Attr1_Min < -14.61 ) { return new Prediction("NULL", 66, 6); }
	}
	if( Attr4_Mean >= -0.13 ) { 
		if( Attr3_Min >= -19.66 ) { return new Prediction("NULL", 1099, 273); }
		if( Attr3_Min < -19.66 ) { return new Prediction("NULL", 85, 4); }
	}
	}
	if( Attr3_Max < 13.46 ) { 
	if( Attr6_Mean < 0.87 ) { 
		if( Attr1_Mean >= 1.27 ) { return new Prediction("NULL", 1072, 318); }
		if( Attr1_Mean < 1.27 ) { return new Prediction("NULL", 974, 460); }
	}
	if( Attr6_Mean >= 0.87 ) { 
		if( Attr7_Mean >= -8.66 ) { return new Prediction("smoking", 27, 0); }
		if( Attr7_Mean < -8.66 ) { return new Prediction("NULL", 1, 0); }
	}
	}
	}
	if( Attr1_Max < 0.87 ) { 
	if( Attr2_Max < 5.29 ) { 
	if( Attr3_Min < -4.14 ) { 
		if( Attr2_Min >= -13.35 ) { return new Prediction("NULL", 30, 0); }
		if( Attr2_Min < -13.35 ) { return new Prediction("NULL", 16, 5); }
	}
	if( Attr3_Min >= -4.14 ) { 
		if( Attr7_Max >= 19.04 ) { return new Prediction("smoking", 35, 13); }
		if( Attr7_Max < 19.04 ) { return new Prediction("NULL", 11, 0); }
	}
	}
	if( Attr2_Max >= 5.29 ) { 
		if( Attr9_Mean < -23.87 ) { return new Prediction("smoking", 50, 0); }
	if( Attr9_Mean >= -23.87 ) { 
		if( Attr3_Mean >= 2.95 ) { return new Prediction("smoking", 53, 7); }
		if( Attr3_Mean < 2.95 ) { return new Prediction("NULL", 15, 1); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree64() {
	if( Attr2_Min >= -8.9 ) { 
	if( Attr1_Min < -8.38 ) { 
	if( Attr2_Min >= -0.34 ) { 
		if( Attr1_Min >= -9.74 ) { return new Prediction("NULL", 91, 0); }
	if( Attr1_Min < -9.74 ) { 
		if( Attr3_Max < 1.81 ) { return new Prediction("smoking", 1, 0); }
		if( Attr3_Max >= 1.81 ) { return new Prediction("NULL", 8, 0); }
	}
	}
	if( Attr2_Min < -0.34 ) { 
	if( Attr5_Mean >= -0.07 ) { 
	if( Attr1_Max >= -4.12 ) { 
		if( Attr4_Max < 5.04 ) { return new Prediction("smoking", 224, 103); }
		if( Attr4_Max >= 5.04 ) { return new Prediction("smoking", 71, 11); }
	}
	if( Attr1_Max < -4.12 ) { 
		if( Attr5_Mean >= 0.03 ) { return new Prediction("NULL", 31, 0); }
		if( Attr5_Mean < 0.03 ) { return new Prediction("NULL", 252, 77); }
	}
	}
	if( Attr5_Mean < -0.07 ) { 
	if( Attr6_Mean >= -0.02 ) { 
		if( Attr4_Min >= -4.72 ) { return new Prediction("smoking", 4, 2); }
		if( Attr4_Min < -4.72 ) { return new Prediction("NULL", 5, 0); }
	}
		if( Attr6_Mean < -0.02 ) { return new Prediction("NULL", 59, 0); }
	}
	}
	}
	if( Attr1_Min >= -8.38 ) { 
	if( Attr6_Max >= 0.46 ) { 
	if( Attr3_Min < 5.45 ) { 
	if( Attr4_Mean < -0.07 ) { 
		if( Attr2_Mean < 6.08 ) { return new Prediction("NULL", 79, 0); }
		if( Attr2_Mean >= 6.08 ) { return new Prediction("smoking", 2, 0); }
	}
	if( Attr4_Mean >= -0.07 ) { 
		if( Attr7_Max >= 5.75 ) { return new Prediction("NULL", 256, 94); }
		if( Attr7_Max < 5.75 ) { return new Prediction("NULL", 409, 77); }
	}
	}
	if( Attr3_Min >= 5.45 ) { 
	if( Attr9_Max < -91.44 ) { 
		if( Attr1_Max < 2.72 ) { return new Prediction("NULL", 1, 0); }
		if( Attr1_Max >= 2.72 ) { return new Prediction("smoking", 3, 0); }
	}
	if( Attr9_Max >= -91.44 ) { 
		if( Attr5_Min >= -0.81 ) { return new Prediction("NULL", 164, 12); }
		if( Attr5_Min < -0.81 ) { return new Prediction("NULL", 112, 1); }
	}
	}
	}
	if( Attr6_Max < 0.46 ) { 
	if( Attr2_Mean < -1.84 ) { 
	if( Attr3_Mean >= -3.8 ) { 
		if( Attr3_Max < 9.34 ) { return new Prediction("NULL", 1542, 150); }
		if( Attr3_Max >= 9.34 ) { return new Prediction("NULL", 221, 1); }
	}
	if( Attr3_Mean < -3.8 ) { 
		if( Attr2_Mean < -2.92 ) { return new Prediction("NULL", 356, 2); }
		if( Attr2_Mean >= -2.92 ) { return new Prediction("NULL", 9, 3); }
	}
	}
	if( Attr2_Mean >= -1.84 ) { 
	if( Attr3_Mean < 7.9 ) { 
		if( Attr5_Max < 0.98 ) { return new Prediction("NULL", 455, 7); }
		if( Attr5_Max >= 0.98 ) { return new Prediction("NULL", 5, 2); }
	}
		if( Attr3_Mean >= 7.9 ) { return new Prediction("NULL", 1148, 0); }
	}
	}
	}
	}
	if( Attr2_Min < -8.9 ) { 
	if( Attr7_Min < -37.55 ) { 
	if( Attr6_Min >= -2.72 ) { 
	if( Attr2_Max >= -5.17 ) { 
	if( Attr7_Max >= 25.91 ) { 
		if( Attr3_Max >= 7.96 ) { return new Prediction("NULL", 181, 62); }
		if( Attr3_Max < 7.96 ) { return new Prediction("smoking", 175, 58); }
	}
	if( Attr7_Max < 25.91 ) { 
		if( Attr1_Max < 17.11 ) { return new Prediction("NULL", 591, 193); }
		if( Attr1_Max >= 17.11 ) { return new Prediction("NULL", 62, 4); }
	}
	}
	if( Attr2_Max < -5.17 ) { 
	if( Attr2_Min < -9.26 ) { 
		if( Attr9_Min >= -22.06 ) { return new Prediction("NULL", 26, 4); }
		if( Attr9_Min < -22.06 ) { return new Prediction("NULL", 60, 0); }
	}
	if( Attr2_Min >= -9.26 ) { 
		if( Attr9_Max >= -46.92 ) { return new Prediction("NULL", 14, 3); }
		if( Attr9_Max < -46.92 ) { return new Prediction("smoking", 7, 0); }
	}
	}
	}
	if( Attr6_Min < -2.72 ) { 
	if( Attr2_Min >= -13.98 ) { 
	if( Attr7_Min < -48.46 ) { 
		if( Attr1_Mean >= -4.35 ) { return new Prediction("smoking", 175, 76); }
		if( Attr1_Mean < -4.35 ) { return new Prediction("smoking", 70, 8); }
	}
	if( Attr7_Min >= -48.46 ) { 
		if( Attr7_Max >= 19.48 ) { return new Prediction("smoking", 557, 40); }
		if( Attr7_Max < 19.48 ) { return new Prediction("smoking", 173, 73); }
	}
	}
	if( Attr2_Min < -13.98 ) { 
	if( Attr3_Min >= -6.95 ) { 
		if( Attr5_Max < 3.74 ) { return new Prediction("smoking", 420, 108); }
		if( Attr5_Max >= 3.74 ) { return new Prediction("NULL", 58, 15); }
	}
	if( Attr3_Min < -6.95 ) { 
		if( Attr4_Max >= 3.71 ) { return new Prediction("NULL", 642, 191); }
		if( Attr4_Max < 3.71 ) { return new Prediction("smoking", 114, 37); }
	}
	}
	}
	}
	if( Attr7_Min >= -37.55 ) { 
	if( Attr2_Max < -3.48 ) { 
	if( Attr9_Mean >= -5.76 ) { 
	if( Attr8_Max < 81.18 ) { 
		if( Attr6_Mean < -0 ) { return new Prediction("NULL", 196, 3); }
		if( Attr6_Mean >= -0 ) { return new Prediction("NULL", 650, 54); }
	}
		if( Attr8_Max >= 81.18 ) { return new Prediction("smoking", 3, 0); }
	}
	if( Attr9_Mean < -5.76 ) { 
	if( Attr2_Max >= -5.62 ) { 
		if( Attr9_Max < 8.02 ) { return new Prediction("NULL", 131, 51); }
		if( Attr9_Max >= 8.02 ) { return new Prediction("NULL", 54, 6); }
	}
	if( Attr2_Max < -5.62 ) { 
		if( Attr2_Mean >= -9.72 ) { return new Prediction("NULL", 287, 24); }
		if( Attr2_Mean < -9.72 ) { return new Prediction("smoking", 13, 2); }
	}
	}
	}
	if( Attr2_Max >= -3.48 ) { 
	if( Attr1_Min < -7.01 ) { 
	if( Attr2_Max < 8.38 ) { 
		if( Attr1_Min < -10.06 ) { return new Prediction("NULL", 1533, 586); }
		if( Attr1_Min >= -10.06 ) { return new Prediction("smoking", 1316, 507); }
	}
	if( Attr2_Max >= 8.38 ) { 
		if( Attr9_Max < -13.3 ) { return new Prediction("smoking", 95, 40); }
		if( Attr9_Max >= -13.3 ) { return new Prediction("NULL", 667, 137); }
	}
	}
	if( Attr1_Min >= -7.01 ) { 
	if( Attr9_Mean >= 2.23 ) { 
		if( Attr1_Min < 3.33 ) { return new Prediction("NULL", 499, 70); }
		if( Attr1_Min >= 3.33 ) { return new Prediction("NULL", 54, 0); }
	}
	if( Attr9_Mean < 2.23 ) { 
		if( Attr2_Mean < -0.91 ) { return new Prediction("NULL", 1491, 354); }
		if( Attr2_Mean >= -0.91 ) { return new Prediction("NULL", 56, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree65() {
	if( Attr2_Min < -9.53 ) { 
	if( Attr1_Min >= -6.67 ) { 
	if( Attr2_Max >= -4.16 ) { 
	if( Attr4_Mean >= -0.15 ) { 
	if( Attr3_Min >= -4.36 ) { 
		if( Attr1_Max >= 6.5 ) { return new Prediction("NULL", 923, 292); }
		if( Attr1_Max < 6.5 ) { return new Prediction("NULL", 315, 51); }
	}
	if( Attr3_Min < -4.36 ) { 
		if( Attr3_Min >= -4.46 ) { return new Prediction("NULL", 22, 0); }
		if( Attr3_Min < -4.46 ) { return new Prediction("NULL", 1649, 320); }
	}
	}
	if( Attr4_Mean < -0.15 ) { 
		if( Attr9_Max < -30.41 ) { return new Prediction("smoking", 1, 0); }
	if( Attr9_Max >= -30.41 ) { 
		if( Attr5_Max >= 0.4 ) { return new Prediction("NULL", 101, 1); }
		if( Attr5_Max < 0.4 ) { return new Prediction("NULL", 3, 1); }
	}
	}
	}
	if( Attr2_Max < -4.16 ) { 
	if( Attr7_Mean < -17.18 ) { 
		if( Attr2_Mean < -8.25 ) { return new Prediction("NULL", 175, 0); }
	if( Attr2_Mean >= -8.25 ) { 
		if( Attr5_Mean < -0.02 ) { return new Prediction("smoking", 5, 0); }
		if( Attr5_Mean >= -0.02 ) { return new Prediction("NULL", 41, 4); }
	}
	}
	if( Attr7_Mean >= -17.18 ) { 
	if( Attr3_Min >= -1.55 ) { 
		if( Attr6_Max >= 1.04 ) { return new Prediction("smoking", 49, 22); }
		if( Attr6_Max < 1.04 ) { return new Prediction("NULL", 245, 42); }
	}
	if( Attr3_Min < -1.55 ) { 
		if( Attr7_Mean >= -16.34 ) { return new Prediction("NULL", 354, 29); }
		if( Attr7_Mean < -16.34 ) { return new Prediction("smoking", 11, 5); }
	}
	}
	}
	}
	if( Attr1_Min < -6.67 ) { 
	if( Attr3_Max < 11.53 ) { 
	if( Attr1_Max < 6.94 ) { 
	if( Attr3_Min < -1.08 ) { 
		if( Attr6_Min >= -2.35 ) { return new Prediction("NULL", 492, 83); }
		if( Attr6_Min < -2.35 ) { return new Prediction("smoking", 556, 213); }
	}
	if( Attr3_Min >= -1.08 ) { 
		if( Attr6_Min < -2.15 ) { return new Prediction("smoking", 174, 20); }
		if( Attr6_Min >= -2.15 ) { return new Prediction("NULL", 113, 48); }
	}
	}
	if( Attr1_Max >= 6.94 ) { 
	if( Attr2_Min < -14.45 ) { 
		if( Attr4_Max < 4.12 ) { return new Prediction("smoking", 493, 118); }
		if( Attr4_Max >= 4.12 ) { return new Prediction("NULL", 499, 247); }
	}
	if( Attr2_Min >= -14.45 ) { 
		if( Attr6_Mean < -0.34 ) { return new Prediction("NULL", 9, 0); }
		if( Attr6_Mean >= -0.34 ) { return new Prediction("smoking", 1374, 198); }
	}
	}
	}
	if( Attr3_Max >= 11.53 ) { 
	if( Attr9_Max < -8.31 ) { 
	if( Attr7_Mean >= -1.57 ) { 
		if( Attr8_Min < -30.51 ) { return new Prediction("smoking", 53, 9); }
		if( Attr8_Min >= -30.51 ) { return new Prediction("NULL", 176, 82); }
	}
	if( Attr7_Mean < -1.57 ) { 
		if( Attr7_Max < -22.89 ) { return new Prediction("NULL", 31, 1); }
		if( Attr7_Max >= -22.89 ) { return new Prediction("NULL", 62, 21); }
	}
	}
	if( Attr9_Max >= -8.31 ) { 
	if( Attr5_Max >= 4.72 ) { 
		if( Attr1_Max >= 19.5 ) { return new Prediction("NULL", 79, 23); }
		if( Attr1_Max < 19.5 ) { return new Prediction("NULL", 280, 36); }
	}
	if( Attr5_Max < 4.72 ) { 
		if( Attr7_Mean >= -13.92 ) { return new Prediction("NULL", 1113, 302); }
		if( Attr7_Mean < -13.92 ) { return new Prediction("NULL", 300, 133); }
	}
	}
	}
	}
	}
	if( Attr2_Min >= -9.53 ) { 
	if( Attr6_Max >= 0.33 ) { 
	if( Attr1_Min >= -8.07 ) { 
	if( Attr6_Min < -1.51 ) { 
	if( Attr4_Max >= 3.51 ) { 
		if( Attr6_Max >= 6.45 ) { return new Prediction("smoking", 2, 0); }
		if( Attr6_Max < 6.45 ) { return new Prediction("NULL", 144, 14); }
	}
	if( Attr4_Max < 3.51 ) { 
		if( Attr4_Mean < -0.07 ) { return new Prediction("NULL", 17, 0); }
		if( Attr4_Mean >= -0.07 ) { return new Prediction("NULL", 236, 96); }
	}
	}
	if( Attr6_Min >= -1.51 ) { 
	if( Attr1_Max >= 7.21 ) { 
		if( Attr9_Max < 51.38 ) { return new Prediction("NULL", 440, 75); }
		if( Attr9_Max >= 51.38 ) { return new Prediction("smoking", 6, 0); }
	}
	if( Attr1_Max < 7.21 ) { 
		if( Attr6_Min >= -0.17 ) { return new Prediction("NULL", 83, 0); }
		if( Attr6_Min < -0.17 ) { return new Prediction("NULL", 484, 38); }
	}
	}
	}
	if( Attr1_Min < -8.07 ) { 
	if( Attr3_Mean < 2.82 ) { 
		if( Attr4_Mean >= 0.18 ) { return new Prediction("NULL", 30, 0); }
	if( Attr4_Mean < 0.18 ) { 
		if( Attr3_Mean >= -5.53 ) { return new Prediction("NULL", 252, 64); }
		if( Attr3_Mean < -5.53 ) { return new Prediction("smoking", 13, 0); }
	}
	}
	if( Attr3_Mean >= 2.82 ) { 
	if( Attr5_Max >= 0.82 ) { 
		if( Attr3_Mean < 8.22 ) { return new Prediction("smoking", 299, 55); }
		if( Attr3_Mean >= 8.22 ) { return new Prediction("NULL", 20, 1); }
	}
	if( Attr5_Max < 0.82 ) { 
		if( Attr1_Mean >= -8.94 ) { return new Prediction("NULL", 58, 5); }
		if( Attr1_Mean < -8.94 ) { return new Prediction("smoking", 5, 1); }
	}
	}
	}
	}
	if( Attr6_Max < 0.33 ) { 
	if( Attr6_Max < 0.01 ) { 
	if( Attr2_Min < -0.53 ) { 
	if( Attr4_Max < 0 ) { 
		if( Attr5_Max < -0 ) { return new Prediction("NULL", 74, 0); }
		if( Attr5_Max >= -0 ) { return new Prediction("NULL", 97, 21); }
	}
		if( Attr4_Max >= 0 ) { return new Prediction("NULL", 219, 0); }
	}
		if( Attr2_Min >= -0.53 ) { return new Prediction("NULL", 853, 0); }
	}
	if( Attr6_Max >= 0.01 ) { 
	if( Attr3_Mean < 8.83 ) { 
	if( Attr1_Mean < -8.64 ) { 
		if( Attr3_Max >= 4.56 ) { return new Prediction("smoking", 6, 0); }
		if( Attr3_Max < 4.56 ) { return new Prediction("NULL", 54, 11); }
	}
	if( Attr1_Mean >= -8.64 ) { 
		if( Attr4_Mean >= -0.01 ) { return new Prediction("NULL", 1872, 102); }
		if( Attr4_Mean < -0.01 ) { return new Prediction("NULL", 402, 61); }
	}
	}
		if( Attr3_Mean >= 8.83 ) { return new Prediction("NULL", 514, 0); }
	}
	}
	}
return null;
}
private Prediction runTree66() {
	if( Attr6_Min < -1.93 ) { 
	if( Attr5_Min >= -3.85 ) { 
	if( Attr6_Min >= -4.82 ) { 
	if( Attr1_Min < -6.62 ) { 
	if( Attr3_Max < 12.07 ) { 
		if( Attr4_Mean >= -0.17 ) { return new Prediction("smoking", 2275, 670); }
		if( Attr4_Mean < -0.17 ) { return new Prediction("NULL", 76, 13); }
	}
	if( Attr3_Max >= 12.07 ) { 
		if( Attr3_Max < 14.12 ) { return new Prediction("NULL", 359, 151); }
		if( Attr3_Max >= 14.12 ) { return new Prediction("NULL", 411, 102); }
	}
	}
	if( Attr1_Min >= -6.62 ) { 
	if( Attr4_Mean < -0.11 ) { 
		if( Attr1_Max >= 19.07 ) { return new Prediction("NULL", 8, 1); }
		if( Attr1_Max < 19.07 ) { return new Prediction("NULL", 75, 0); }
	}
	if( Attr4_Mean >= -0.11 ) { 
		if( Attr9_Max < 20.01 ) { return new Prediction("NULL", 877, 261); }
		if( Attr9_Max >= 20.01 ) { return new Prediction("NULL", 667, 121); }
	}
	}
	}
	if( Attr6_Min < -4.82 ) { 
	if( Attr5_Max >= 2.13 ) { 
	if( Attr2_Min >= -14.43 ) { 
		if( Attr6_Max >= 2.19 ) { return new Prediction("smoking", 211, 25); }
		if( Attr6_Max < 2.19 ) { return new Prediction("NULL", 18, 6); }
	}
	if( Attr2_Min < -14.43 ) { 
		if( Attr3_Max >= 13.47 ) { return new Prediction("NULL", 121, 37); }
		if( Attr3_Max < 13.47 ) { return new Prediction("smoking", 314, 109); }
	}
	}
	if( Attr5_Max < 2.13 ) { 
	if( Attr4_Max >= 3.2 ) { 
		if( Attr1_Min < -11.08 ) { return new Prediction("smoking", 99, 5); }
		if( Attr1_Min >= -11.08 ) { return new Prediction("smoking", 78, 28); }
	}
	if( Attr4_Max < 3.2 ) { 
		if( Attr7_Mean >= 30.36 ) { return new Prediction("NULL", 3, 0); }
		if( Attr7_Mean < 30.36 ) { return new Prediction("smoking", 225, 9); }
	}
	}
	}
	}
	if( Attr5_Min < -3.85 ) { 
	if( Attr4_Max < 4.18 ) { 
	if( Attr2_Mean < -3.28 ) { 
	if( Attr2_Mean >= -8.16 ) { 
		if( Attr2_Max < 5 ) { return new Prediction("smoking", 122, 23); }
		if( Attr2_Max >= 5 ) { return new Prediction("NULL", 27, 12); }
	}
	if( Attr2_Mean < -8.16 ) { 
		if( Attr9_Mean >= 11.48 ) { return new Prediction("smoking", 3, 1); }
		if( Attr9_Mean < 11.48 ) { return new Prediction("NULL", 14, 0); }
	}
	}
	if( Attr2_Mean >= -3.28 ) { 
		if( Attr1_Min < -12.07 ) { return new Prediction("NULL", 16, 0); }
	if( Attr1_Min >= -12.07 ) { 
		if( Attr5_Min < -4.09 ) { return new Prediction("smoking", 26, 12); }
		if( Attr5_Min >= -4.09 ) { return new Prediction("NULL", 8, 0); }
	}
	}
	}
	if( Attr4_Max >= 4.18 ) { 
	if( Attr1_Min >= -19.94 ) { 
	if( Attr3_Max < 9.36 ) { 
		if( Attr4_Mean >= 0.92 ) { return new Prediction("smoking", 10, 0); }
		if( Attr4_Mean < 0.92 ) { return new Prediction("NULL", 144, 64); }
	}
	if( Attr3_Max >= 9.36 ) { 
		if( Attr3_Mean >= 8.27 ) { return new Prediction("NULL", 24, 0); }
		if( Attr3_Mean < 8.27 ) { return new Prediction("NULL", 837, 207); }
	}
	}
	if( Attr1_Min < -19.94 ) { 
		if( Attr5_Mean < -1.46 ) { return new Prediction("smoking", 4, 0); }
	if( Attr5_Mean >= -1.46 ) { 
		if( Attr3_Min >= -17.69 ) { return new Prediction("NULL", 96, 11); }
		if( Attr3_Min < -17.69 ) { return new Prediction("NULL", 38, 0); }
	}
	}
	}
	}
	}
	if( Attr6_Min >= -1.93 ) { 
	if( Attr3_Min < 7.05 ) { 
	if( Attr5_Max < 0.3 ) { 
	if( Attr5_Mean >= 0 ) { 
		if( Attr4_Mean >= 0.05 ) { return new Prediction("NULL", 128, 0); }
	if( Attr4_Mean < 0.05 ) { 
		if( Attr1_Mean < 7.99 ) { return new Prediction("NULL", 707, 104); }
		if( Attr1_Mean >= 7.99 ) { return new Prediction("NULL", 86, 38); }
	}
	}
	if( Attr5_Mean < 0 ) { 
	if( Attr3_Max >= -1.45 ) { 
		if( Attr8_Max < 10.31 ) { return new Prediction("NULL", 463, 15); }
		if( Attr8_Max >= 10.31 ) { return new Prediction("NULL", 947, 111); }
	}
	if( Attr3_Max < -1.45 ) { 
		if( Attr2_Min >= -9.05 ) { return new Prediction("NULL", 493, 3); }
		if( Attr2_Min < -9.05 ) { return new Prediction("NULL", 148, 8); }
	}
	}
	}
	if( Attr5_Max >= 0.3 ) { 
	if( Attr5_Mean >= 0.14 ) { 
	if( Attr6_Min < -1.66 ) { 
		if( Attr5_Min < -0.57 ) { return new Prediction("NULL", 13, 0); }
		if( Attr5_Min >= -0.57 ) { return new Prediction("smoking", 1, 0); }
	}
		if( Attr6_Min >= -1.66 ) { return new Prediction("NULL", 144, 0); }
	}
	if( Attr5_Mean < 0.14 ) { 
	if( Attr7_Min < -28.29 ) { 
		if( Attr9_Min < -7.39 ) { return new Prediction("NULL", 1289, 389); }
		if( Attr9_Min >= -7.39 ) { return new Prediction("NULL", 259, 31); }
	}
	if( Attr7_Min >= -28.29 ) { 
		if( Attr1_Min >= -5.81 ) { return new Prediction("NULL", 1344, 181); }
		if( Attr1_Min < -5.81 ) { return new Prediction("NULL", 984, 240); }
	}
	}
	}
	}
	if( Attr3_Min >= 7.05 ) { 
		if( Attr4_Max < 0.03 ) { return new Prediction("NULL", 1072, 0); }
	if( Attr4_Max >= 0.03 ) { 
	if( Attr3_Mean < 8.93 ) { 
	if( Attr1_Mean >= 2.62 ) { 
		if( Attr1_Mean < 3.59 ) { return new Prediction("smoking", 7, 0); }
		if( Attr1_Mean >= 3.59 ) { return new Prediction("NULL", 11, 0); }
	}
	if( Attr1_Mean < 2.62 ) { 
		if( Attr6_Max >= 0.63 ) { return new Prediction("NULL", 20, 4); }
		if( Attr6_Max < 0.63 ) { return new Prediction("NULL", 311, 3); }
	}
	}
		if( Attr3_Mean >= 8.93 ) { return new Prediction("NULL", 265, 0); }
	}
	}
	}
return null;
}
private Prediction runTree67() {
	if( Attr5_Max >= 0.44 ) { 
	if( Attr3_Max >= 12.5 ) { 
	if( Attr3_Max >= 14.24 ) { 
	if( Attr1_Mean >= 0.92 ) { 
	if( Attr1_Min >= -1.92 ) { 
		if( Attr6_Min < -3.96 ) { return new Prediction("NULL", 6, 2); }
		if( Attr6_Min >= -3.96 ) { return new Prediction("NULL", 43, 0); }
	}
	if( Attr1_Min < -1.92 ) { 
		if( Attr2_Min < -19.79 ) { return new Prediction("NULL", 101, 11); }
		if( Attr2_Min >= -19.79 ) { return new Prediction("NULL", 539, 185); }
	}
	}
	if( Attr1_Mean < 0.92 ) { 
	if( Attr3_Mean < 8.29 ) { 
		if( Attr4_Mean < -0.05 ) { return new Prediction("NULL", 168, 17); }
		if( Attr4_Mean >= -0.05 ) { return new Prediction("NULL", 674, 148); }
	}
	if( Attr3_Mean >= 8.29 ) { 
		if( Attr8_Mean >= -37.41 ) { return new Prediction("NULL", 62, 0); }
		if( Attr8_Mean < -37.41 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	}
	if( Attr3_Max < 14.24 ) { 
	if( Attr3_Max < 14.23 ) { 
	if( Attr4_Mean < 0.14 ) { 
		if( Attr3_Mean < 9.26 ) { return new Prediction("NULL", 764, 250); }
		if( Attr3_Mean >= 9.26 ) { return new Prediction("NULL", 34, 0); }
	}
	if( Attr4_Mean >= 0.14 ) { 
		if( Attr2_Min < -28.96 ) { return new Prediction("smoking", 1, 0); }
		if( Attr2_Min >= -28.96 ) { return new Prediction("NULL", 42, 3); }
	}
	}
		if( Attr3_Max >= 14.23 ) { return new Prediction("smoking", 8, 0); }
	}
	}
	if( Attr3_Max < 12.5 ) { 
	if( Attr5_Max >= 1.26 ) { 
	if( Attr7_Max >= 19.01 ) { 
	if( Attr4_Max >= 4.74 ) { 
		if( Attr7_Mean < 42.24 ) { return new Prediction("NULL", 1186, 517); }
		if( Attr7_Mean >= 42.24 ) { return new Prediction("NULL", 37, 3); }
	}
	if( Attr4_Max < 4.74 ) { 
		if( Attr1_Max < 6.82 ) { return new Prediction("NULL", 810, 371); }
		if( Attr1_Max >= 6.82 ) { return new Prediction("smoking", 1604, 388); }
	}
	}
	if( Attr7_Max < 19.01 ) { 
	if( Attr1_Min >= -6.57 ) { 
		if( Attr9_Max < 19.3 ) { return new Prediction("NULL", 636, 181); }
		if( Attr9_Max >= 19.3 ) { return new Prediction("NULL", 578, 92); }
	}
	if( Attr1_Min < -6.57 ) { 
		if( Attr3_Mean < -1.78 ) { return new Prediction("NULL", 95, 32); }
		if( Attr3_Mean >= -1.78 ) { return new Prediction("smoking", 557, 204); }
	}
	}
	}
	if( Attr5_Max < 1.26 ) { 
	if( Attr3_Mean >= 7.14 ) { 
	if( Attr7_Min < -5.7 ) { 
		if( Attr5_Max >= 1 ) { return new Prediction("NULL", 51, 0); }
		if( Attr5_Max < 1 ) { return new Prediction("NULL", 167, 32); }
	}
	if( Attr7_Min >= -5.7 ) { 
		if( Attr3_Max >= 10.07 ) { return new Prediction("NULL", 97, 0); }
		if( Attr3_Max < 10.07 ) { return new Prediction("NULL", 29, 2); }
	}
	}
	if( Attr3_Mean < 7.14 ) { 
	if( Attr7_Max < 21.85 ) { 
		if( Attr3_Mean >= -0.95 ) { return new Prediction("NULL", 989, 258); }
		if( Attr3_Mean < -0.95 ) { return new Prediction("NULL", 484, 51); }
	}
	if( Attr7_Max >= 21.85 ) { 
		if( Attr7_Max >= 45.35 ) { return new Prediction("NULL", 171, 35); }
		if( Attr7_Max < 45.35 ) { return new Prediction("smoking", 851, 398); }
	}
	}
	}
	}
	}
	if( Attr5_Max < 0.44 ) { 
	if( Attr2_Min >= -1.96 ) { 
	if( Attr2_Mean < 9.63 ) { 
	if( Attr6_Max >= 0.33 ) { 
	if( Attr1_Max < -3.68 ) { 
		if( Attr2_Max < 6.8 ) { return new Prediction("smoking", 2, 0); }
		if( Attr2_Max >= 6.8 ) { return new Prediction("NULL", 2, 0); }
	}
	if( Attr1_Max >= -3.68 ) { 
		if( Attr1_Max < 9.81 ) { return new Prediction("NULL", 28, 0); }
		if( Attr1_Max >= 9.81 ) { return new Prediction("smoking", 2, 1); }
	}
	}
	if( Attr6_Max < 0.33 ) { 
		if( Attr3_Min >= 3.15 ) { return new Prediction("NULL", 1280, 0); }
	if( Attr3_Min < 3.15 ) { 
		if( Attr5_Min >= -0.01 ) { return new Prediction("NULL", 185, 0); }
		if( Attr5_Min < -0.01 ) { return new Prediction("NULL", 200, 3); }
	}
	}
	}
		if( Attr2_Mean >= 9.63 ) { return new Prediction("smoking", 3, 0); }
	}
	if( Attr2_Min < -1.96 ) { 
	if( Attr3_Mean < 7.76 ) { 
	if( Attr7_Max >= 39.16 ) { 
	if( Attr9_Min >= -31.29 ) { 
		if( Attr1_Min < -7.47 ) { return new Prediction("smoking", 75, 14); }
		if( Attr1_Min >= -7.47 ) { return new Prediction("NULL", 90, 18); }
	}
	if( Attr9_Min < -31.29 ) { 
		if( Attr6_Max < 0.45 ) { return new Prediction("NULL", 62, 1); }
		if( Attr6_Max >= 0.45 ) { return new Prediction("NULL", 20, 6); }
	}
	}
	if( Attr7_Max < 39.16 ) { 
	if( Attr3_Mean >= -2.4 ) { 
		if( Attr5_Min >= -2.35 ) { return new Prediction("NULL", 1805, 232); }
		if( Attr5_Min < -2.35 ) { return new Prediction("smoking", 32, 12); }
	}
	if( Attr3_Mean < -2.4 ) { 
		if( Attr1_Min >= 8.72 ) { return new Prediction("smoking", 12, 6); }
		if( Attr1_Min < 8.72 ) { return new Prediction("NULL", 726, 31); }
	}
	}
	}
	if( Attr3_Mean >= 7.76 ) { 
	if( Attr1_Max >= 6.88 ) { 
	if( Attr5_Max >= 0.01 ) { 
		if( Attr3_Max >= 13.08 ) { return new Prediction("NULL", 5, 0); }
		if( Attr3_Max < 13.08 ) { return new Prediction("smoking", 6, 1); }
	}
		if( Attr5_Max < 0.01 ) { return new Prediction("NULL", 7, 0); }
	}
	if( Attr1_Max < 6.88 ) { 
	if( Attr2_Mean >= -3.22 ) { 
		if( Attr4_Min >= -2.48 ) { return new Prediction("NULL", 150, 3); }
		if( Attr4_Min < -2.48 ) { return new Prediction("NULL", 8, 2); }
	}
		if( Attr2_Mean < -3.22 ) { return new Prediction("NULL", 393, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree68() {
	if( Attr5_Max >= 0.53 ) { 
	if( Attr6_Max >= 2.04 ) { 
	if( Attr2_Max < 3.19 ) { 
	if( Attr1_Min >= -6.8 ) { 
	if( Attr4_Min >= -5.17 ) { 
		if( Attr7_Min < -31.49 ) { return new Prediction("NULL", 444, 201); }
		if( Attr7_Min >= -31.49 ) { return new Prediction("NULL", 338, 76); }
	}
	if( Attr4_Min < -5.17 ) { 
		if( Attr1_Mean < 8.74 ) { return new Prediction("NULL", 228, 32); }
		if( Attr1_Mean >= 8.74 ) { return new Prediction("smoking", 6, 2); }
	}
	}
	if( Attr1_Min < -6.8 ) { 
	if( Attr4_Max < 3.22 ) { 
		if( Attr1_Mean >= -8.71 ) { return new Prediction("smoking", 1102, 160); }
		if( Attr1_Mean < -8.71 ) { return new Prediction("NULL", 35, 7); }
	}
	if( Attr4_Max >= 3.22 ) { 
		if( Attr1_Max < 7.49 ) { return new Prediction("NULL", 312, 109); }
		if( Attr1_Max >= 7.49 ) { return new Prediction("smoking", 774, 261); }
	}
	}
	}
	if( Attr2_Max >= 3.19 ) { 
	if( Attr4_Max >= 6.84 ) { 
	if( Attr1_Min < -3.53 ) { 
		if( Attr2_Min >= -24.6 ) { return new Prediction("NULL", 1138, 342); }
		if( Attr2_Min < -24.6 ) { return new Prediction("NULL", 89, 6); }
	}
	if( Attr1_Min >= -3.53 ) { 
		if( Attr9_Min >= -39.52 ) { return new Prediction("NULL", 85, 13); }
		if( Attr9_Min < -39.52 ) { return new Prediction("NULL", 54, 0); }
	}
	}
	if( Attr4_Max < 6.84 ) { 
	if( Attr1_Mean < -2.8 ) { 
		if( Attr3_Mean < 2.97 ) { return new Prediction("NULL", 213, 93); }
		if( Attr3_Mean >= 2.97 ) { return new Prediction("smoking", 364, 106); }
	}
	if( Attr1_Mean >= -2.8 ) { 
		if( Attr2_Mean < -1.38 ) { return new Prediction("NULL", 1170, 474); }
		if( Attr2_Mean >= -1.38 ) { return new Prediction("NULL", 186, 28); }
	}
	}
	}
	}
	if( Attr6_Max < 2.04 ) { 
	if( Attr2_Max < -4.37 ) { 
	if( Attr7_Max >= -71.93 ) { 
	if( Attr5_Min >= -1.59 ) { 
		if( Attr8_Min < -3.76 ) { return new Prediction("NULL", 59, 0); }
		if( Attr8_Min >= -3.76 ) { return new Prediction("NULL", 251, 27); }
	}
	if( Attr5_Min < -1.59 ) { 
		if( Attr3_Min < -2.58 ) { return new Prediction("NULL", 32, 3); }
		if( Attr3_Min >= -2.58 ) { return new Prediction("NULL", 35, 17); }
	}
	}
		if( Attr7_Max < -71.93 ) { return new Prediction("smoking", 6, 0); }
	}
	if( Attr2_Max >= -4.37 ) { 
	if( Attr1_Min < -6.69 ) { 
	if( Attr2_Max >= 11.1 ) { 
		if( Attr9_Max >= 65.39 ) { return new Prediction("smoking", 1, 0); }
		if( Attr9_Max < 65.39 ) { return new Prediction("NULL", 84, 4); }
	}
	if( Attr2_Max < 11.1 ) { 
		if( Attr4_Min < -2.19 ) { return new Prediction("NULL", 935, 457); }
		if( Attr4_Min >= -2.19 ) { return new Prediction("NULL", 434, 104); }
	}
	}
	if( Attr1_Min >= -6.69 ) { 
	if( Attr1_Max < 5.05 ) { 
		if( Attr8_Min >= 30.78 ) { return new Prediction("NULL", 36, 13); }
		if( Attr8_Min < 30.78 ) { return new Prediction("NULL", 522, 34); }
	}
	if( Attr1_Max >= 5.05 ) { 
		if( Attr7_Mean < -20.81 ) { return new Prediction("NULL", 604, 69); }
		if( Attr7_Mean >= -20.81 ) { return new Prediction("NULL", 841, 226); }
	}
	}
	}
	}
	}
	if( Attr5_Max < 0.53 ) { 
	if( Attr1_Min >= -7.41 ) { 
	if( Attr3_Max >= 8.1 ) { 
	if( Attr1_Mean >= 2.67 ) { 
	if( Attr5_Max >= 0.46 ) { 
		if( Attr5_Mean >= 0 ) { return new Prediction("smoking", 9, 0); }
		if( Attr5_Mean < 0 ) { return new Prediction("NULL", 17, 5); }
	}
	if( Attr5_Max < 0.46 ) { 
		if( Attr8_Max < 16 ) { return new Prediction("NULL", 49, 1); }
		if( Attr8_Max >= 16 ) { return new Prediction("NULL", 40, 11); }
	}
	}
	if( Attr1_Mean < 2.67 ) { 
	if( Attr2_Min >= -4.95 ) { 
		if( Attr3_Mean < 8.73 ) { return new Prediction("NULL", 74, 1); }
		if( Attr3_Mean >= 8.73 ) { return new Prediction("NULL", 1256, 0); }
	}
	if( Attr2_Min < -4.95 ) { 
		if( Attr4_Mean >= -0 ) { return new Prediction("NULL", 239, 2); }
		if( Attr4_Mean < -0 ) { return new Prediction("NULL", 192, 14); }
	}
	}
	}
	if( Attr3_Max < 8.1 ) { 
	if( Attr3_Mean >= -3.32 ) { 
	if( Attr8_Max < 10.33 ) { 
		if( Attr3_Max >= -1.96 ) { return new Prediction("NULL", 597, 23); }
		if( Attr3_Max < -1.96 ) { return new Prediction("smoking", 20, 10); }
	}
	if( Attr8_Max >= 10.33 ) { 
		if( Attr7_Mean < -46.52 ) { return new Prediction("smoking", 29, 8); }
		if( Attr7_Mean >= -46.52 ) { return new Prediction("NULL", 1792, 219); }
	}
	}
	if( Attr3_Mean < -3.32 ) { 
	if( Attr6_Max < 1.34 ) { 
		if( Attr2_Mean >= -10.3 ) { return new Prediction("NULL", 688, 16); }
		if( Attr2_Mean < -10.3 ) { return new Prediction("smoking", 2, 0); }
	}
	if( Attr6_Max >= 1.34 ) { 
		if( Attr1_Mean >= 2.75 ) { return new Prediction("NULL", 4, 0); }
		if( Attr1_Mean < 2.75 ) { return new Prediction("smoking", 5, 0); }
	}
	}
	}
	}
	if( Attr1_Min < -7.41 ) { 
		if( Attr3_Max < -2.07 ) { return new Prediction("NULL", 98, 0); }
	if( Attr3_Max >= -2.07 ) { 
	if( Attr2_Min < -10.51 ) { 
	if( Attr9_Mean < -7.35 ) { 
		if( Attr5_Mean >= 0 ) { return new Prediction("smoking", 2, 0); }
		if( Attr5_Mean < 0 ) { return new Prediction("NULL", 19, 3); }
	}
	if( Attr9_Mean >= -7.35 ) { 
		if( Attr3_Min >= -9.69 ) { return new Prediction("smoking", 70, 3); }
		if( Attr3_Min < -9.69 ) { return new Prediction("NULL", 6, 0); }
	}
	}
	if( Attr2_Min >= -10.51 ) { 
		if( Attr8_Mean < -9.15 ) { return new Prediction("NULL", 49, 0); }
	if( Attr8_Mean >= -9.15 ) { 
		if( Attr9_Max >= 10.48 ) { return new Prediction("NULL", 90, 41); }
		if( Attr9_Max < 10.48 ) { return new Prediction("NULL", 153, 22); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree69() {
	if( Attr5_Max < 0.54 ) { 
	if( Attr1_Min >= -7.41 ) { 
	if( Attr3_Mean < 8.93 ) { 
		if( Attr5_Max < -0 ) { return new Prediction("NULL", 253, 0); }
	if( Attr5_Max >= -0 ) { 
	if( Attr1_Mean >= 0.26 ) { 
		if( Attr2_Mean < 0.05 ) { return new Prediction("NULL", 2029, 274); }
		if( Attr2_Mean >= 0.05 ) { return new Prediction("NULL", 297, 5); }
	}
	if( Attr1_Mean < 0.26 ) { 
		if( Attr5_Min >= -0.46 ) { return new Prediction("NULL", 934, 40); }
		if( Attr5_Min < -0.46 ) { return new Prediction("NULL", 119, 18); }
	}
	}
	}
		if( Attr3_Mean >= 8.93 ) { return new Prediction("NULL", 1309, 0); }
	}
	if( Attr1_Min < -7.41 ) { 
	if( Attr4_Max < 0.14 ) { 
	if( Attr2_Min < -2.91 ) { 
	if( Attr2_Min < -3.98 ) { 
		if( Attr3_Mean >= 1.28 ) { return new Prediction("NULL", 25, 1); }
		if( Attr3_Mean < 1.28 ) { return new Prediction("NULL", 15, 7); }
	}
	if( Attr2_Min >= -3.98 ) { 
		if( Attr1_Max < -5.38 ) { return new Prediction("smoking", 5, 0); }
		if( Attr1_Max >= -5.38 ) { return new Prediction("NULL", 1, 0); }
	}
	}
	if( Attr2_Min >= -2.91 ) { 
	if( Attr5_Mean >= 0 ) { 
		if( Attr1_Min >= -9.48 ) { return new Prediction("NULL", 8, 0); }
		if( Attr1_Min < -9.48 ) { return new Prediction("smoking", 1, 0); }
	}
		if( Attr5_Mean < 0 ) { return new Prediction("NULL", 134, 0); }
	}
	}
	if( Attr4_Max >= 0.14 ) { 
	if( Attr6_Max < 1.46 ) { 
	if( Attr7_Mean >= 37.5 ) { 
		if( Attr5_Mean < -0.25 ) { return new Prediction("NULL", 4, 0); }
		if( Attr5_Mean >= -0.25 ) { return new Prediction("smoking", 24, 5); }
	}
	if( Attr7_Mean < 37.5 ) { 
		if( Attr9_Mean >= -2.58 ) { return new Prediction("NULL", 43, 14); }
		if( Attr9_Mean < -2.58 ) { return new Prediction("NULL", 109, 10); }
	}
	}
	if( Attr6_Max >= 1.46 ) { 
	if( Attr1_Max >= -0.36 ) { 
		if( Attr1_Min < -21.36 ) { return new Prediction("NULL", 1, 0); }
		if( Attr1_Min >= -21.36 ) { return new Prediction("smoking", 76, 0); }
	}
	if( Attr1_Max < -0.36 ) { 
		if( Attr6_Max < 1.92 ) { return new Prediction("smoking", 4, 1); }
		if( Attr6_Max >= 1.92 ) { return new Prediction("NULL", 13, 1); }
	}
	}
	}
	}
	}
	if( Attr5_Max >= 0.54 ) { 
	if( Attr3_Max >= 11.98 ) { 
	if( Attr3_Min < 5.09 ) { 
	if( Attr3_Max >= 14.29 ) { 
	if( Attr1_Max < 19.94 ) { 
		if( Attr9_Max >= -64.3 ) { return new Prediction("NULL", 1477, 364); }
		if( Attr9_Max < -64.3 ) { return new Prediction("smoking", 11, 2); }
	}
	if( Attr1_Max >= 19.94 ) { 
		if( Attr2_Max >= 12.09 ) { return new Prediction("NULL", 49, 0); }
		if( Attr2_Max < 12.09 ) { return new Prediction("NULL", 28, 5); }
	}
	}
	if( Attr3_Max < 14.29 ) { 
	if( Attr3_Min >= -3.96 ) { 
		if( Attr1_Min >= -4.8 ) { return new Prediction("NULL", 153, 40); }
		if( Attr1_Min < -4.8 ) { return new Prediction("smoking", 297, 142); }
	}
	if( Attr3_Min < -3.96 ) { 
		if( Attr1_Max >= 8.9 ) { return new Prediction("NULL", 500, 172); }
		if( Attr1_Max < 8.9 ) { return new Prediction("NULL", 229, 29); }
	}
	}
	}
	if( Attr3_Min >= 5.09 ) { 
	if( Attr6_Max >= 0.19 ) { 
	if( Attr2_Max >= 1.92 ) { 
		if( Attr2_Max >= 1.98 ) { return new Prediction("NULL", 39, 1); }
		if( Attr2_Max < 1.98 ) { return new Prediction("smoking", 1, 0); }
	}
		if( Attr2_Max < 1.92 ) { return new Prediction("NULL", 60, 0); }
	}
		if( Attr6_Max < 0.19 ) { return new Prediction("smoking", 2, 0); }
	}
	}
	if( Attr3_Max < 11.98 ) { 
	if( Attr5_Min < -0.97 ) { 
	if( Attr3_Min >= -8.85 ) { 
	if( Attr1_Min >= -6.65 ) { 
		if( Attr6_Min < -4.8 ) { return new Prediction("smoking", 77, 35); }
		if( Attr6_Min >= -4.8 ) { return new Prediction("NULL", 1624, 387); }
	}
	if( Attr1_Min < -6.65 ) { 
		if( Attr1_Max >= 6.36 ) { return new Prediction("smoking", 1745, 343); }
		if( Attr1_Max < 6.36 ) { return new Prediction("smoking", 1145, 568); }
	}
	}
	if( Attr3_Min < -8.85 ) { 
	if( Attr4_Max < 4.13 ) { 
		if( Attr7_Max >= 28.71 ) { return new Prediction("smoking", 285, 104); }
		if( Attr7_Max < 28.71 ) { return new Prediction("NULL", 305, 72); }
	}
	if( Attr4_Max >= 4.13 ) { 
		if( Attr6_Max >= 3.8 ) { return new Prediction("NULL", 338, 127); }
		if( Attr6_Max < 3.8 ) { return new Prediction("NULL", 606, 129); }
	}
	}
	}
	if( Attr5_Min >= -0.97 ) { 
	if( Attr1_Min < -6.83 ) { 
	if( Attr1_Mean >= -6.91 ) { 
		if( Attr7_Min >= -39.5 ) { return new Prediction("smoking", 260, 107); }
		if( Attr7_Min < -39.5 ) { return new Prediction("smoking", 82, 6); }
	}
	if( Attr1_Mean < -6.91 ) { 
		if( Attr2_Mean < -2.22 ) { return new Prediction("NULL", 116, 18); }
		if( Attr2_Mean >= -2.22 ) { return new Prediction("smoking", 72, 34); }
	}
	}
	if( Attr1_Min >= -6.83 ) { 
	if( Attr3_Max >= 11.55 ) { 
		if( Attr3_Mean >= 8.75 ) { return new Prediction("NULL", 22, 0); }
		if( Attr3_Mean < 8.75 ) { return new Prediction("smoking", 29, 6); }
	}
	if( Attr3_Max < 11.55 ) { 
		if( Attr1_Max >= 7.94 ) { return new Prediction("NULL", 406, 91); }
		if( Attr1_Max < 7.94 ) { return new Prediction("NULL", 516, 43); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree70() {
	if( Attr1_Min >= -6.54 ) { 
	if( Attr3_Mean >= 9.25 ) { 
	if( Attr6_Max >= 2.31 ) { 
		if( Attr1_Mean < -0.98 ) { return new Prediction("smoking", 1, 0); }
		if( Attr1_Mean >= -0.98 ) { return new Prediction("NULL", 15, 0); }
	}
		if( Attr6_Max < 2.31 ) { return new Prediction("NULL", 1283, 0); }
	}
	if( Attr3_Mean < 9.25 ) { 
	if( Attr4_Max >= 1.3 ) { 
	if( Attr6_Max < 1.01 ) { 
	if( Attr7_Max >= -75.3 ) { 
		if( Attr1_Mean >= -1.15 ) { return new Prediction("NULL", 763, 92); }
		if( Attr1_Mean < -1.15 ) { return new Prediction("NULL", 113, 2); }
	}
	if( Attr7_Max < -75.3 ) { 
		if( Attr2_Max >= -1.8 ) { return new Prediction("NULL", 1, 0); }
		if( Attr2_Max < -1.8 ) { return new Prediction("smoking", 7, 0); }
	}
	}
	if( Attr6_Max >= 1.01 ) { 
	if( Attr4_Max < 3.91 ) { 
		if( Attr3_Mean < -0.88 ) { return new Prediction("NULL", 366, 80); }
		if( Attr3_Mean >= -0.88 ) { return new Prediction("NULL", 1141, 412); }
	}
	if( Attr4_Max >= 3.91 ) { 
		if( Attr8_Min >= -26.73 ) { return new Prediction("NULL", 1185, 241); }
		if( Attr8_Min < -26.73 ) { return new Prediction("NULL", 300, 34); }
	}
	}
	}
	if( Attr4_Max < 1.3 ) { 
		if( Attr5_Max < -0 ) { return new Prediction("NULL", 210, 0); }
	if( Attr5_Max >= -0 ) { 
	if( Attr8_Mean < 6.56 ) { 
		if( Attr2_Max < 4.58 ) { return new Prediction("NULL", 964, 30); }
		if( Attr2_Max >= 4.58 ) { return new Prediction("NULL", 71, 13); }
	}
	if( Attr8_Mean >= 6.56 ) { 
		if( Attr2_Min < -10.54 ) { return new Prediction("NULL", 297, 75); }
		if( Attr2_Min >= -10.54 ) { return new Prediction("NULL", 2286, 223); }
	}
	}
	}
	}
	}
	if( Attr1_Min < -6.54 ) { 
	if( Attr7_Min < -37.55 ) { 
	if( Attr3_Max < 11.17 ) { 
	if( Attr3_Max >= 4.65 ) { 
	if( Attr5_Min < -5.07 ) { 
		if( Attr1_Mean >= -2.99 ) { return new Prediction("NULL", 49, 8); }
		if( Attr1_Mean < -2.99 ) { return new Prediction("smoking", 5, 0); }
	}
	if( Attr5_Min >= -5.07 ) { 
		if( Attr3_Min >= -14.77 ) { return new Prediction("smoking", 1285, 219); }
		if( Attr3_Min < -14.77 ) { return new Prediction("NULL", 37, 7); }
	}
	}
	if( Attr3_Max < 4.65 ) { 
	if( Attr1_Max < 6.19 ) { 
		if( Attr8_Mean < 39.3 ) { return new Prediction("NULL", 81, 12); }
		if( Attr8_Mean >= 39.3 ) { return new Prediction("smoking", 3, 0); }
	}
	if( Attr1_Max >= 6.19 ) { 
		if( Attr5_Max >= 3.3 ) { return new Prediction("NULL", 19, 6); }
		if( Attr5_Max < 3.3 ) { return new Prediction("smoking", 96, 14); }
	}
	}
	}
	if( Attr3_Max >= 11.17 ) { 
	if( Attr5_Max >= 3.54 ) { 
	if( Attr1_Mean >= 4.28 ) { 
		if( Attr1_Min < -6.95 ) { return new Prediction("NULL", 41, 18); }
		if( Attr1_Min >= -6.95 ) { return new Prediction("smoking", 8, 0); }
	}
	if( Attr1_Mean < 4.28 ) { 
		if( Attr5_Min >= -6.34 ) { return new Prediction("NULL", 192, 48); }
		if( Attr5_Min < -6.34 ) { return new Prediction("NULL", 59, 2); }
	}
	}
	if( Attr5_Max < 3.54 ) { 
	if( Attr2_Max < 9.96 ) { 
		if( Attr6_Min < -1.87 ) { return new Prediction("smoking", 297, 116); }
		if( Attr6_Min >= -1.87 ) { return new Prediction("NULL", 38, 8); }
	}
	if( Attr2_Max >= 9.96 ) { 
		if( Attr5_Max < 2.25 ) { return new Prediction("NULL", 49, 4); }
		if( Attr5_Max >= 2.25 ) { return new Prediction("NULL", 70, 31); }
	}
	}
	}
	}
	if( Attr7_Min >= -37.55 ) { 
	if( Attr6_Max >= 1.63 ) { 
	if( Attr2_Min < -15.7 ) { 
	if( Attr3_Min < -9.51 ) { 
		if( Attr6_Mean < -0.17 ) { return new Prediction("NULL", 36, 0); }
		if( Attr6_Mean >= -0.17 ) { return new Prediction("NULL", 679, 151); }
	}
	if( Attr3_Min >= -9.51 ) { 
		if( Attr3_Max < 8.86 ) { return new Prediction("smoking", 131, 60); }
		if( Attr3_Max >= 8.86 ) { return new Prediction("NULL", 445, 131); }
	}
	}
	if( Attr2_Min >= -15.7 ) { 
	if( Attr4_Max < 5.27 ) { 
		if( Attr1_Max >= -2.53 ) { return new Prediction("smoking", 1355, 416); }
		if( Attr1_Max < -2.53 ) { return new Prediction("NULL", 101, 27); }
	}
	if( Attr4_Max >= 5.27 ) { 
		if( Attr5_Max < 2.06 ) { return new Prediction("smoking", 169, 77); }
		if( Attr5_Max >= 2.06 ) { return new Prediction("NULL", 362, 101); }
	}
	}
	}
	if( Attr6_Max < 1.63 ) { 
	if( Attr8_Max >= -10.87 ) { 
	if( Attr1_Min >= -13.23 ) { 
		if( Attr1_Min >= -7.7 ) { return new Prediction("NULL", 189, 28); }
		if( Attr1_Min < -7.7 ) { return new Prediction("NULL", 715, 252); }
	}
	if( Attr1_Min < -13.23 ) { 
		if( Attr4_Min < -1.94 ) { return new Prediction("NULL", 140, 13); }
		if( Attr4_Min >= -1.94 ) { return new Prediction("NULL", 104, 0); }
	}
	}
	if( Attr8_Max < -10.87 ) { 
	if( Attr5_Max >= 1.51 ) { 
		if( Attr7_Mean >= -8.72 ) { return new Prediction("smoking", 2, 0); }
		if( Attr7_Mean < -8.72 ) { return new Prediction("NULL", 8, 0); }
	}
		if( Attr5_Max < 1.51 ) { return new Prediction("NULL", 110, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree71() {
	if( Attr4_Max < 0.94 ) { 
	if( Attr3_Mean < 8.93 ) { 
	if( Attr3_Max < -2.51 ) { 
	if( Attr9_Max < 7.93 ) { 
	if( Attr7_Mean < -22.59 ) { 
		if( Attr2_Mean < -6.82 ) { return new Prediction("smoking", 9, 2); }
		if( Attr2_Mean >= -6.82 ) { return new Prediction("NULL", 32, 1); }
	}
	if( Attr7_Mean >= -22.59 ) { 
		if( Attr8_Max < 36.36 ) { return new Prediction("NULL", 96, 0); }
		if( Attr8_Max >= 36.36 ) { return new Prediction("NULL", 21, 3); }
	}
	}
	if( Attr9_Max >= 7.93 ) { 
	if( Attr6_Max >= 0.07 ) { 
		if( Attr3_Max >= -7.89 ) { return new Prediction("NULL", 278, 6); }
		if( Attr3_Max < -7.89 ) { return new Prediction("smoking", 3, 0); }
	}
	if( Attr6_Max < 0.07 ) { 
		if( Attr8_Mean < 49.84 ) { return new Prediction("NULL", 239, 0); }
		if( Attr8_Mean >= 49.84 ) { return new Prediction("NULL", 3, 1); }
	}
	}
	}
	if( Attr3_Max >= -2.51 ) { 
	if( Attr6_Max < 0.52 ) { 
	if( Attr3_Min >= 3.8 ) { 
		if( Attr8_Max < 10.33 ) { return new Prediction("NULL", 226, 0); }
		if( Attr8_Max >= 10.33 ) { return new Prediction("NULL", 721, 41); }
	}
	if( Attr3_Min < 3.8 ) { 
		if( Attr8_Max >= 17.39 ) { return new Prediction("NULL", 1135, 179); }
		if( Attr8_Max < 17.39 ) { return new Prediction("NULL", 648, 28); }
	}
	}
	if( Attr6_Max >= 0.52 ) { 
	if( Attr8_Min >= 14.29 ) { 
		if( Attr5_Mean >= 0 ) { return new Prediction("NULL", 27, 6); }
		if( Attr5_Mean < 0 ) { return new Prediction("NULL", 60, 1); }
	}
	if( Attr8_Min < 14.29 ) { 
		if( Attr8_Min < -9.1 ) { return new Prediction("NULL", 101, 16); }
		if( Attr8_Min >= -9.1 ) { return new Prediction("NULL", 125, 61); }
	}
	}
	}
	}
		if( Attr3_Mean >= 8.93 ) { return new Prediction("NULL", 1267, 0); }
	}
	if( Attr4_Max >= 0.94 ) { 
	if( Attr3_Max >= 11.98 ) { 
	if( Attr5_Min >= -9.41 ) { 
	if( Attr1_Min < -4.37 ) { 
	if( Attr8_Max >= 1.45 ) { 
		if( Attr2_Min < -19.79 ) { return new Prediction("NULL", 316, 47); }
		if( Attr2_Min >= -19.79 ) { return new Prediction("NULL", 1773, 519); }
	}
	if( Attr8_Max < 1.45 ) { 
		if( Attr6_Mean >= 0.09 ) { return new Prediction("smoking", 10, 0); }
		if( Attr6_Mean < 0.09 ) { return new Prediction("smoking", 116, 56); }
	}
	}
	if( Attr1_Min >= -4.37 ) { 
	if( Attr3_Min < 6.28 ) { 
		if( Attr7_Max >= 3.9 ) { return new Prediction("NULL", 326, 83); }
		if( Attr7_Max < 3.9 ) { return new Prediction("NULL", 176, 17); }
	}
		if( Attr3_Min >= 6.28 ) { return new Prediction("NULL", 39, 0); }
	}
	}
	if( Attr5_Min < -9.41 ) { 
	if( Attr7_Min >= -7.52 ) { 
		if( Attr1_Max < 4.3 ) { return new Prediction("smoking", 1, 0); }
		if( Attr1_Max >= 4.3 ) { return new Prediction("NULL", 15, 0); }
	}
		if( Attr7_Min < -7.52 ) { return new Prediction("NULL", 61, 0); }
	}
	}
	if( Attr3_Max < 11.98 ) { 
	if( Attr6_Max < 2.14 ) { 
	if( Attr1_Min >= -7.34 ) { 
	if( Attr5_Max < 1.24 ) { 
		if( Attr2_Max < 3.18 ) { return new Prediction("NULL", 1406, 193); }
		if( Attr2_Max >= 3.18 ) { return new Prediction("NULL", 188, 4); }
	}
	if( Attr5_Max >= 1.24 ) { 
		if( Attr7_Min < -7.29 ) { return new Prediction("NULL", 752, 187); }
		if( Attr7_Min >= -7.29 ) { return new Prediction("NULL", 134, 7); }
	}
	}
	if( Attr1_Min < -7.34 ) { 
	if( Attr4_Min < -2.55 ) { 
		if( Attr1_Min >= -10.44 ) { return new Prediction("smoking", 436, 150); }
		if( Attr1_Min < -10.44 ) { return new Prediction("NULL", 221, 59); }
	}
	if( Attr4_Min >= -2.55 ) { 
		if( Attr1_Max < 0.15 ) { return new Prediction("NULL", 325, 43); }
		if( Attr1_Max >= 0.15 ) { return new Prediction("NULL", 216, 88); }
	}
	}
	}
	if( Attr6_Max >= 2.14 ) { 
	if( Attr4_Max >= 5.33 ) { 
	if( Attr2_Mean < -6.37 ) { 
		if( Attr5_Mean < 0.08 ) { return new Prediction("NULL", 253, 53); }
		if( Attr5_Mean >= 0.08 ) { return new Prediction("NULL", 24, 0); }
	}
	if( Attr2_Mean >= -6.37 ) { 
		if( Attr4_Min < -4.78 ) { return new Prediction("NULL", 599, 216); }
		if( Attr4_Min >= -4.78 ) { return new Prediction("smoking", 288, 112); }
	}
	}
	if( Attr4_Max < 5.33 ) { 
	if( Attr6_Max < 3.88 ) { 
		if( Attr1_Mean >= 1.39 ) { return new Prediction("NULL", 705, 259); }
		if( Attr1_Mean < 1.39 ) { return new Prediction("smoking", 1188, 381); }
	}
	if( Attr6_Max >= 3.88 ) { 
		if( Attr2_Mean >= -6.13 ) { return new Prediction("smoking", 1165, 182); }
		if( Attr2_Mean < -6.13 ) { return new Prediction("NULL", 154, 52); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree72() {
	if( Attr2_Max >= -4.16 ) { 
	if( Attr5_Max >= 0.45 ) { 
	if( Attr1_Min >= -6.65 ) { 
	if( Attr6_Max >= 1.2 ) { 
	if( Attr2_Max < -0.75 ) { 
		if( Attr5_Mean < 0.11 ) { return new Prediction("NULL", 529, 200); }
		if( Attr5_Mean >= 0.11 ) { return new Prediction("NULL", 21, 0); }
	}
	if( Attr2_Max >= -0.75 ) { 
		if( Attr9_Max < 23.34 ) { return new Prediction("NULL", 1329, 345); }
		if( Attr9_Max >= 23.34 ) { return new Prediction("NULL", 931, 144); }
	}
	}
	if( Attr6_Max < 1.2 ) { 
	if( Attr3_Min >= 5.87 ) { 
		if( Attr5_Min >= -0.74 ) { return new Prediction("NULL", 72, 0); }
		if( Attr5_Min < -0.74 ) { return new Prediction("NULL", 40, 4); }
	}
	if( Attr3_Min < 5.87 ) { 
		if( Attr2_Mean >= -1.56 ) { return new Prediction("NULL", 132, 5); }
		if( Attr2_Mean < -1.56 ) { return new Prediction("NULL", 816, 138); }
	}
	}
	}
	if( Attr1_Min < -6.65 ) { 
	if( Attr4_Max >= 5.45 ) { 
	if( Attr3_Max >= 13.51 ) { 
		if( Attr4_Min < -14.52 ) { return new Prediction("smoking", 87, 42); }
		if( Attr4_Min >= -14.52 ) { return new Prediction("NULL", 833, 158); }
	}
	if( Attr3_Max < 13.51 ) { 
		if( Attr1_Min >= -13.67 ) { return new Prediction("smoking", 661, 323); }
		if( Attr1_Min < -13.67 ) { return new Prediction("NULL", 382, 124); }
	}
	}
	if( Attr4_Max < 5.45 ) { 
	if( Attr1_Max < 6.59 ) { 
		if( Attr1_Mean < -3.32 ) { return new Prediction("NULL", 1147, 356); }
		if( Attr1_Mean >= -3.32 ) { return new Prediction("smoking", 674, 277); }
	}
	if( Attr1_Max >= 6.59 ) { 
		if( Attr2_Max >= 5.26 ) { return new Prediction("NULL", 471, 193); }
		if( Attr2_Max < 5.26 ) { return new Prediction("smoking", 1983, 395); }
	}
	}
	}
	}
	if( Attr5_Max < 0.45 ) { 
	if( Attr3_Mean < 8.83 ) { 
	if( Attr6_Min < -2.17 ) { 
	if( Attr8_Max < 33.68 ) { 
		if( Attr5_Mean >= -1.18 ) { return new Prediction("NULL", 23, 2); }
		if( Attr5_Mean < -1.18 ) { return new Prediction("smoking", 2, 0); }
	}
	if( Attr8_Max >= 33.68 ) { 
		if( Attr8_Max >= 52.04 ) { return new Prediction("NULL", 7, 2); }
		if( Attr8_Max < 52.04 ) { return new Prediction("smoking", 40, 4); }
	}
	}
	if( Attr6_Min >= -2.17 ) { 
	if( Attr3_Min < 3.12 ) { 
		if( Attr5_Mean >= 0 ) { return new Prediction("NULL", 371, 91); }
		if( Attr5_Mean < 0 ) { return new Prediction("NULL", 745, 65); }
	}
	if( Attr3_Min >= 3.12 ) { 
		if( Attr9_Max < -19.44 ) { return new Prediction("NULL", 157, 13); }
		if( Attr9_Max >= -19.44 ) { return new Prediction("NULL", 280, 4); }
	}
	}
	}
		if( Attr3_Mean >= 8.83 ) { return new Prediction("NULL", 1350, 0); }
	}
	}
	if( Attr2_Max < -4.16 ) { 
	if( Attr3_Max >= -2.28 ) { 
	if( Attr7_Min < -80.54 ) { 
		if( Attr1_Min < 1.68 ) { return new Prediction("NULL", 14, 0); }
	if( Attr1_Min >= 1.68 ) { 
		if( Attr2_Mean >= -6.04 ) { return new Prediction("NULL", 1, 0); }
		if( Attr2_Mean < -6.04 ) { return new Prediction("smoking", 21, 0); }
	}
	}
	if( Attr7_Min >= -80.54 ) { 
	if( Attr8_Min >= -16.99 ) { 
	if( Attr6_Max < 1.23 ) { 
		if( Attr1_Max < -8.15 ) { return new Prediction("smoking", 6, 0); }
		if( Attr1_Max >= -8.15 ) { return new Prediction("NULL", 1775, 170); }
	}
	if( Attr6_Max >= 1.23 ) { 
		if( Attr7_Mean < 1.74 ) { return new Prediction("NULL", 64, 9); }
		if( Attr7_Mean >= 1.74 ) { return new Prediction("smoking", 68, 34); }
	}
	}
	if( Attr8_Min < -16.99 ) { 
		if( Attr8_Min >= -35.91 ) { return new Prediction("NULL", 183, 0); }
	if( Attr8_Min < -35.91 ) { 
		if( Attr2_Max < -8 ) { return new Prediction("smoking", 11, 5); }
		if( Attr2_Max >= -8 ) { return new Prediction("NULL", 37, 1); }
	}
	}
	}
	}
	if( Attr3_Max < -2.28 ) { 
	if( Attr2_Min < -10.54 ) { 
	if( Attr2_Max < -5.55 ) { 
	if( Attr7_Mean < 24.82 ) { 
		if( Attr3_Max < -2.87 ) { return new Prediction("smoking", 5, 0); }
		if( Attr3_Max >= -2.87 ) { return new Prediction("NULL", 1, 0); }
	}
		if( Attr7_Mean >= 24.82 ) { return new Prediction("NULL", 3, 0); }
	}
		if( Attr2_Max >= -5.55 ) { return new Prediction("NULL", 7, 0); }
	}
	if( Attr2_Min >= -10.54 ) { 
		if( Attr3_Min < -6.25 ) { return new Prediction("NULL", 243, 0); }
	if( Attr3_Min >= -6.25 ) { 
	if( Attr4_Max >= 0.75 ) { 
		if( Attr2_Mean < -8.88 ) { return new Prediction("smoking", 4, 0); }
		if( Attr2_Mean >= -8.88 ) { return new Prediction("NULL", 12, 2); }
	}
	if( Attr4_Max < 0.75 ) { 
		if( Attr9_Max >= 40.34 ) { return new Prediction("NULL", 27, 5); }
		if( Attr9_Max < 40.34 ) { return new Prediction("NULL", 313, 7); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree73() {
	if( Attr1_Min >= -6.54 ) { 
	if( Attr6_Max < 0.49 ) { 
	if( Attr5_Mean >= 0 ) { 
	if( Attr2_Min < -2.7 ) { 
	if( Attr3_Mean < 7.76 ) { 
		if( Attr2_Max < -4.49 ) { return new Prediction("NULL", 601, 72); }
		if( Attr2_Max >= -4.49 ) { return new Prediction("NULL", 346, 87); }
	}
	if( Attr3_Mean >= 7.76 ) { 
		if( Attr4_Max >= -0.01 ) { return new Prediction("NULL", 197, 2); }
		if( Attr4_Max < -0.01 ) { return new Prediction("NULL", 10, 3); }
	}
	}
	if( Attr2_Min >= -2.7 ) { 
		if( Attr6_Min >= -0.27 ) { return new Prediction("NULL", 342, 0); }
	if( Attr6_Min < -0.27 ) { 
		if( Attr2_Max >= 9.54 ) { return new Prediction("smoking", 3, 1); }
		if( Attr2_Max < 9.54 ) { return new Prediction("NULL", 20, 0); }
	}
	}
	}
	if( Attr5_Mean < 0 ) { 
		if( Attr3_Mean >= 9.25 ) { return new Prediction("NULL", 948, 0); }
	if( Attr3_Mean < 9.25 ) { 
	if( Attr2_Min < -10.59 ) { 
		if( Attr6_Mean < -0.05 ) { return new Prediction("NULL", 33, 0); }
		if( Attr6_Mean >= -0.05 ) { return new Prediction("NULL", 95, 32); }
	}
	if( Attr2_Min >= -10.59 ) { 
		if( Attr5_Max >= 0.02 ) { return new Prediction("NULL", 1621, 111); }
		if( Attr5_Max < 0.02 ) { return new Prediction("NULL", 564, 4); }
	}
	}
	}
	}
	if( Attr6_Max >= 0.49 ) { 
	if( Attr3_Mean < 9.4 ) { 
	if( Attr1_Mean >= 10.71 ) { 
	if( Attr1_Mean < 11.2 ) { 
		if( Attr9_Max >= 17.92 ) { return new Prediction("smoking", 18, 0); }
		if( Attr9_Max < 17.92 ) { return new Prediction("smoking", 15, 5); }
	}
	if( Attr1_Mean >= 11.2 ) { 
		if( Attr8_Min < -26.45 ) { return new Prediction("smoking", 2, 0); }
		if( Attr8_Min >= -26.45 ) { return new Prediction("NULL", 15, 0); }
	}
	}
	if( Attr1_Mean < 10.71 ) { 
	if( Attr6_Min < -1.57 ) { 
		if( Attr2_Min >= -23.45 ) { return new Prediction("NULL", 2308, 538); }
		if( Attr2_Min < -23.45 ) { return new Prediction("NULL", 47, 0); }
	}
	if( Attr6_Min >= -1.57 ) { 
		if( Attr7_Min >= -25 ) { return new Prediction("NULL", 856, 98); }
		if( Attr7_Min < -25 ) { return new Prediction("NULL", 914, 190); }
	}
	}
	}
		if( Attr3_Mean >= 9.4 ) { return new Prediction("NULL", 57, 0); }
	}
	}
	if( Attr1_Min < -6.54 ) { 
	if( Attr6_Max < 1.67 ) { 
	if( Attr1_Max >= -0.44 ) { 
	if( Attr6_Min >= -2.18 ) { 
	if( Attr8_Max < 43.99 ) { 
		if( Attr2_Min < -15.87 ) { return new Prediction("NULL", 105, 4); }
		if( Attr2_Min >= -15.87 ) { return new Prediction("NULL", 232, 80); }
	}
	if( Attr8_Max >= 43.99 ) { 
		if( Attr2_Mean >= -3.26 ) { return new Prediction("smoking", 23, 3); }
		if( Attr2_Mean < -3.26 ) { return new Prediction("NULL", 43, 17); }
	}
	}
	if( Attr6_Min < -2.18 ) { 
	if( Attr2_Max >= 1.12 ) { 
		if( Attr9_Min < -13.64 ) { return new Prediction("NULL", 117, 41); }
		if( Attr9_Min >= -13.64 ) { return new Prediction("NULL", 16, 0); }
	}
	if( Attr2_Max < 1.12 ) { 
		if( Attr4_Max >= 1.69 ) { return new Prediction("smoking", 118, 57); }
		if( Attr4_Max < 1.69 ) { return new Prediction("smoking", 65, 1); }
	}
	}
	}
	if( Attr1_Max < -0.44 ) { 
	if( Attr9_Mean >= -44.54 ) { 
	if( Attr5_Max < 0.74 ) { 
		if( Attr6_Mean < 0 ) { return new Prediction("NULL", 248, 5); }
		if( Attr6_Mean >= 0 ) { return new Prediction("NULL", 162, 30); }
	}
	if( Attr5_Max >= 0.74 ) { 
		if( Attr2_Mean >= -2.88 ) { return new Prediction("smoking", 110, 41); }
		if( Attr2_Mean < -2.88 ) { return new Prediction("NULL", 219, 15); }
	}
	}
	if( Attr9_Mean < -44.54 ) { 
		if( Attr5_Mean >= -0.12 ) { return new Prediction("smoking", 16, 0); }
		if( Attr5_Mean < -0.12 ) { return new Prediction("NULL", 2, 0); }
	}
	}
	}
	if( Attr6_Max >= 1.67 ) { 
	if( Attr7_Min >= -37.49 ) { 
	if( Attr5_Max < 2.3 ) { 
	if( Attr5_Min < -1.87 ) { 
		if( Attr6_Min < -2.78 ) { return new Prediction("smoking", 415, 155); }
		if( Attr6_Min >= -2.78 ) { return new Prediction("NULL", 262, 72); }
	}
	if( Attr5_Min >= -1.87 ) { 
		if( Attr1_Mean >= -9.17 ) { return new Prediction("smoking", 845, 269); }
		if( Attr1_Mean < -9.17 ) { return new Prediction("NULL", 43, 6); }
	}
	}
	if( Attr5_Max >= 2.3 ) { 
	if( Attr4_Max < 4.18 ) { 
		if( Attr3_Max < 9.44 ) { return new Prediction("smoking", 256, 49); }
		if( Attr3_Max >= 9.44 ) { return new Prediction("NULL", 199, 83); }
	}
	if( Attr4_Max >= 4.18 ) { 
		if( Attr5_Max >= 5.54 ) { return new Prediction("NULL", 215, 24); }
		if( Attr5_Max < 5.54 ) { return new Prediction("NULL", 1070, 312); }
	}
	}
	}
	if( Attr7_Min < -37.49 ) { 
	if( Attr5_Min < -4.56 ) { 
		if( Attr3_Mean >= 4.39 ) { return new Prediction("NULL", 44, 0); }
	if( Attr3_Mean < 4.39 ) { 
		if( Attr3_Min < -4.7 ) { return new Prediction("NULL", 237, 64); }
		if( Attr3_Min >= -4.7 ) { return new Prediction("smoking", 9, 0); }
	}
	}
	if( Attr5_Min >= -4.56 ) { 
	if( Attr9_Mean >= 2.56 ) { 
		if( Attr4_Max >= 4.89 ) { return new Prediction("smoking", 172, 77); }
		if( Attr4_Max < 4.89 ) { return new Prediction("smoking", 605, 64); }
	}
	if( Attr9_Mean < 2.56 ) { 
		if( Attr3_Max < 11.68 ) { return new Prediction("smoking", 706, 166); }
		if( Attr3_Max >= 11.68 ) { return new Prediction("NULL", 312, 155); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree74() {
	if( Attr4_Max < 0.95 ) { 
	if( Attr6_Min < -2.03 ) { 
	if( Attr1_Min < -5.92 ) { 
		if( Attr8_Mean < 38.64 ) { return new Prediction("smoking", 46, 0); }
	if( Attr8_Mean >= 38.64 ) { 
		if( Attr5_Min < -0.4 ) { return new Prediction("NULL", 3, 0); }
		if( Attr5_Min >= -0.4 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	if( Attr1_Min >= -5.92 ) { 
		if( Attr7_Max < -22.92 ) { return new Prediction("smoking", 4, 0); }
	if( Attr7_Max >= -22.92 ) { 
	if( Attr9_Mean < 1.25 ) { 
		if( Attr7_Mean < -9.39 ) { return new Prediction("NULL", 17, 0); }
		if( Attr7_Mean >= -9.39 ) { return new Prediction("smoking", 4, 2); }
	}
	if( Attr9_Mean >= 1.25 ) { 
		if( Attr1_Max < 10.15 ) { return new Prediction("NULL", 2, 0); }
		if( Attr1_Max >= 10.15 ) { return new Prediction("smoking", 3, 0); }
	}
	}
	}
	}
	if( Attr6_Min >= -2.03 ) { 
	if( Attr3_Mean < 8.93 ) { 
	if( Attr2_Mean < -1.25 ) { 
	if( Attr3_Min < 3.7 ) { 
		if( Attr1_Max < 8.59 ) { return new Prediction("NULL", 1812, 177); }
		if( Attr1_Max >= 8.59 ) { return new Prediction("NULL", 375, 95); }
	}
	if( Attr3_Min >= 3.7 ) { 
		if( Attr2_Mean >= -5.95 ) { return new Prediction("NULL", 529, 13); }
		if( Attr2_Mean < -5.95 ) { return new Prediction("NULL", 402, 36); }
	}
	}
	if( Attr2_Mean >= -1.25 ) { 
	if( Attr1_Mean >= -9.65 ) { 
		if( Attr7_Max < -45.85 ) { return new Prediction("NULL", 16, 2); }
		if( Attr7_Max >= -45.85 ) { return new Prediction("NULL", 556, 4); }
	}
		if( Attr1_Mean < -9.65 ) { return new Prediction("smoking", 4, 0); }
	}
	}
		if( Attr3_Mean >= 8.93 ) { return new Prediction("NULL", 1374, 0); }
	}
	}
	if( Attr4_Max >= 0.95 ) { 
	if( Attr5_Max >= 1.08 ) { 
	if( Attr6_Max < 2.18 ) { 
	if( Attr1_Mean >= 3.32 ) { 
	if( Attr1_Max < 8.39 ) { 
		if( Attr3_Min < 4.14 ) { return new Prediction("NULL", 68, 0); }
		if( Attr3_Min >= 4.14 ) { return new Prediction("smoking", 1, 0); }
	}
	if( Attr1_Max >= 8.39 ) { 
		if( Attr9_Max >= -1.66 ) { return new Prediction("NULL", 585, 93); }
		if( Attr9_Max < -1.66 ) { return new Prediction("NULL", 113, 42); }
	}
	}
	if( Attr1_Mean < 3.32 ) { 
	if( Attr9_Mean < 5.28 ) { 
		if( Attr8_Min < -26.23 ) { return new Prediction("smoking", 229, 108); }
		if( Attr8_Min >= -26.23 ) { return new Prediction("NULL", 1034, 283); }
	}
	if( Attr9_Mean >= 5.28 ) { 
		if( Attr1_Min >= -12.45 ) { return new Prediction("smoking", 428, 195); }
		if( Attr1_Min < -12.45 ) { return new Prediction("NULL", 69, 8); }
	}
	}
	}
	if( Attr6_Max >= 2.18 ) { 
	if( Attr4_Max < 4.23 ) { 
	if( Attr6_Min >= -2.73 ) { 
		if( Attr4_Mean < -0.11 ) { return new Prediction("NULL", 43, 0); }
		if( Attr4_Mean >= -0.11 ) { return new Prediction("NULL", 697, 294); }
	}
	if( Attr6_Min < -2.73 ) { 
		if( Attr1_Min >= -7.34 ) { return new Prediction("NULL", 309, 114); }
		if( Attr1_Min < -7.34 ) { return new Prediction("smoking", 1451, 233); }
	}
	}
	if( Attr4_Max >= 4.23 ) { 
	if( Attr2_Min >= -13.56 ) { 
		if( Attr1_Mean < -3.43 ) { return new Prediction("smoking", 319, 112); }
		if( Attr1_Mean >= -3.43 ) { return new Prediction("NULL", 567, 206); }
	}
	if( Attr2_Min < -13.56 ) { 
		if( Attr7_Min < -41.61 ) { return new Prediction("NULL", 674, 269); }
		if( Attr7_Min >= -41.61 ) { return new Prediction("NULL", 1680, 419); }
	}
	}
	}
	}
	if( Attr5_Max < 1.08 ) { 
	if( Attr2_Min >= -10.76 ) { 
	if( Attr3_Min >= 4.87 ) { 
		if( Attr7_Min >= 5.44 ) { return new Prediction("NULL", 89, 0); }
	if( Attr7_Min < 5.44 ) { 
		if( Attr2_Mean < 2.04 ) { return new Prediction("NULL", 148, 10); }
		if( Attr2_Mean >= 2.04 ) { return new Prediction("smoking", 6, 1); }
	}
	}
	if( Attr3_Min < 4.87 ) { 
	if( Attr6_Min >= -2.12 ) { 
		if( Attr7_Mean < -77.58 ) { return new Prediction("smoking", 19, 3); }
		if( Attr7_Mean >= -77.58 ) { return new Prediction("NULL", 1045, 139); }
	}
	if( Attr6_Min < -2.12 ) { 
		if( Attr3_Mean >= -0.42 ) { return new Prediction("smoking", 89, 37); }
		if( Attr3_Mean < -0.42 ) { return new Prediction("NULL", 42, 9); }
	}
	}
	}
	if( Attr2_Min < -10.76 ) { 
	if( Attr9_Mean >= 2.67 ) { 
	if( Attr8_Max >= 34.26 ) { 
		if( Attr6_Min >= -2.35 ) { return new Prediction("NULL", 136, 38); }
		if( Attr6_Min < -2.35 ) { return new Prediction("smoking", 141, 13); }
	}
	if( Attr8_Max < 34.26 ) { 
		if( Attr3_Mean >= -0.39 ) { return new Prediction("NULL", 43, 21); }
		if( Attr3_Mean < -0.39 ) { return new Prediction("NULL", 63, 2); }
	}
	}
	if( Attr9_Mean < 2.67 ) { 
	if( Attr2_Mean < -8.12 ) { 
		if( Attr5_Min < -0.17 ) { return new Prediction("NULL", 132, 11); }
		if( Attr5_Min >= -0.17 ) { return new Prediction("smoking", 3, 0); }
	}
	if( Attr2_Mean >= -8.12 ) { 
		if( Attr3_Mean < 4.63 ) { return new Prediction("NULL", 325, 159); }
		if( Attr3_Mean >= 4.63 ) { return new Prediction("NULL", 182, 40); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree75() {
	if( Attr6_Max < 1.03 ) { 
	if( Attr2_Min >= -1.73 ) { 
	if( Attr3_Min < 6.55 ) { 
	if( Attr6_Max >= 0.33 ) { 
	if( Attr7_Min >= -5.02 ) { 
		if( Attr8_Min < -33.59 ) { return new Prediction("NULL", 7, 0); }
		if( Attr8_Min >= -33.59 ) { return new Prediction("smoking", 26, 9); }
	}
		if( Attr7_Min < -5.02 ) { return new Prediction("NULL", 40, 0); }
	}
	if( Attr6_Max < 0.33 ) { 
		if( Attr1_Mean < -9.67 ) { return new Prediction("smoking", 2, 0); }
	if( Attr1_Mean >= -9.67 ) { 
		if( Attr2_Mean >= 0.09 ) { return new Prediction("NULL", 386, 2); }
		if( Attr2_Mean < 0.09 ) { return new Prediction("NULL", 58, 7); }
	}
	}
	}
		if( Attr3_Min >= 6.55 ) { return new Prediction("NULL", 1183, 0); }
	}
	if( Attr2_Min < -1.73 ) { 
	if( Attr4_Max >= 4.01 ) { 
	if( Attr1_Mean >= -4.86 ) { 
	if( Attr8_Max < 28.73 ) { 
		if( Attr7_Min >= 14.46 ) { return new Prediction("NULL", 7, 3); }
		if( Attr7_Min < 14.46 ) { return new Prediction("NULL", 77, 0); }
	}
	if( Attr8_Max >= 28.73 ) { 
		if( Attr2_Mean >= -4.33 ) { return new Prediction("NULL", 23, 0); }
		if( Attr2_Mean < -4.33 ) { return new Prediction("NULL", 116, 27); }
	}
	}
	if( Attr1_Mean < -4.86 ) { 
	if( Attr1_Min >= -13.94 ) { 
		if( Attr4_Max < 4.65 ) { return new Prediction("smoking", 18, 4); }
		if( Attr4_Max >= 4.65 ) { return new Prediction("smoking", 46, 0); }
	}
	if( Attr1_Min < -13.94 ) { 
		if( Attr2_Mean < -0.26 ) { return new Prediction("NULL", 8, 0); }
		if( Attr2_Mean >= -0.26 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	}
	if( Attr4_Max < 4.01 ) { 
	if( Attr4_Mean >= -0.01 ) { 
	if( Attr4_Mean >= 0.12 ) { 
		if( Attr7_Min < -48.71 ) { return new Prediction("NULL", 4, 1); }
		if( Attr7_Min >= -48.71 ) { return new Prediction("NULL", 203, 0); }
	}
	if( Attr4_Mean < 0.12 ) { 
		if( Attr1_Min >= -7.79 ) { return new Prediction("NULL", 2984, 222); }
		if( Attr1_Min < -7.79 ) { return new Prediction("NULL", 280, 67); }
	}
	}
	if( Attr4_Mean < -0.01 ) { 
	if( Attr5_Mean >= -0.11 ) { 
		if( Attr5_Max >= 2.22 ) { return new Prediction("smoking", 38, 13); }
		if( Attr5_Max < 2.22 ) { return new Prediction("NULL", 1109, 210); }
	}
	if( Attr5_Mean < -0.11 ) { 
		if( Attr2_Mean >= -9.34 ) { return new Prediction("NULL", 141, 0); }
		if( Attr2_Mean < -9.34 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	}
	}
	}
	if( Attr6_Max >= 1.03 ) { 
	if( Attr3_Min >= -8.22 ) { 
	if( Attr6_Min >= -2.71 ) { 
	if( Attr3_Mean >= 8.08 ) { 
	if( Attr5_Max >= 1.15 ) { 
		if( Attr8_Min < 26.97 ) { return new Prediction("NULL", 151, 32); }
		if( Attr8_Min >= 26.97 ) { return new Prediction("smoking", 5, 1); }
	}
	if( Attr5_Max < 1.15 ) { 
		if( Attr3_Max >= 10.43 ) { return new Prediction("NULL", 117, 0); }
		if( Attr3_Max < 10.43 ) { return new Prediction("NULL", 20, 5); }
	}
	}
	if( Attr3_Mean < 8.08 ) { 
	if( Attr3_Min < -1.15 ) { 
		if( Attr5_Mean >= 0.21 ) { return new Prediction("NULL", 36, 0); }
		if( Attr5_Mean < 0.21 ) { return new Prediction("NULL", 1744, 501); }
	}
	if( Attr3_Min >= -1.15 ) { 
		if( Attr6_Min < -1.97 ) { return new Prediction("smoking", 288, 105); }
		if( Attr6_Min >= -1.97 ) { return new Prediction("NULL", 518, 186); }
	}
	}
	}
	if( Attr6_Min < -2.71 ) { 
	if( Attr3_Max >= 12.62 ) { 
	if( Attr5_Max < 2.03 ) { 
		if( Attr7_Mean < 22.63 ) { return new Prediction("smoking", 136, 61); }
		if( Attr7_Mean >= 22.63 ) { return new Prediction("NULL", 17, 1); }
	}
	if( Attr5_Max >= 2.03 ) { 
		if( Attr6_Max >= 3.99 ) { return new Prediction("NULL", 157, 69); }
		if( Attr6_Max < 3.99 ) { return new Prediction("NULL", 229, 32); }
	}
	}
	if( Attr3_Max < 12.62 ) { 
	if( Attr6_Max >= 3.62 ) { 
		if( Attr1_Max < 7.76 ) { return new Prediction("NULL", 146, 65); }
		if( Attr1_Max >= 7.76 ) { return new Prediction("smoking", 1132, 191); }
	}
	if( Attr6_Max < 3.62 ) { 
		if( Attr1_Max < 9.33 ) { return new Prediction("smoking", 731, 193); }
		if( Attr1_Max >= 9.33 ) { return new Prediction("smoking", 547, 266); }
	}
	}
	}
	}
	if( Attr3_Min < -8.22 ) { 
	if( Attr1_Mean >= 1.05 ) { 
	if( Attr9_Mean >= 6.63 ) { 
	if( Attr7_Max >= 16.05 ) { 
		if( Attr1_Min < -3.42 ) { return new Prediction("NULL", 175, 56); }
		if( Attr1_Min >= -3.42 ) { return new Prediction("NULL", 45, 1); }
	}
	if( Attr7_Max < 16.05 ) { 
		if( Attr1_Min < -0.12 ) { return new Prediction("NULL", 164, 22); }
		if( Attr1_Min >= -0.12 ) { return new Prediction("NULL", 92, 0); }
	}
	}
	if( Attr9_Mean < 6.63 ) { 
	if( Attr9_Min >= -35.2 ) { 
		if( Attr9_Mean >= -14.91 ) { return new Prediction("NULL", 335, 101); }
		if( Attr9_Mean < -14.91 ) { return new Prediction("smoking", 63, 23); }
	}
	if( Attr9_Min < -35.2 ) { 
		if( Attr6_Mean < -0.04 ) { return new Prediction("NULL", 127, 41); }
		if( Attr6_Mean >= -0.04 ) { return new Prediction("NULL", 535, 99); }
	}
	}
	}
	if( Attr1_Mean < 1.05 ) { 
	if( Attr8_Min < -13.63 ) { 
	if( Attr7_Max >= 46.91 ) { 
		if( Attr5_Max < 1.29 ) { return new Prediction("smoking", 5, 0); }
		if( Attr5_Max >= 1.29 ) { return new Prediction("NULL", 181, 20); }
	}
	if( Attr7_Max < 46.91 ) { 
		if( Attr5_Max >= 3.42 ) { return new Prediction("NULL", 255, 45); }
		if( Attr5_Max < 3.42 ) { return new Prediction("NULL", 323, 135); }
	}
	}
	if( Attr8_Min >= -13.63 ) { 
	if( Attr7_Min >= -37.12 ) { 
		if( Attr7_Mean < -0.45 ) { return new Prediction("NULL", 163, 81); }
		if( Attr7_Mean >= -0.45 ) { return new Prediction("NULL", 434, 137); }
	}
	if( Attr7_Min < -37.12 ) { 
		if( Attr4_Max >= 4.52 ) { return new Prediction("NULL", 123, 56); }
		if( Attr4_Max < 4.52 ) { return new Prediction("smoking", 126, 11); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree76() {
	if( Attr6_Min < -2.22 ) { 
	if( Attr7_Max < 19.83 ) { 
	if( Attr1_Mean >= -3.53 ) { 
	if( Attr6_Mean < -0.15 ) { 
		if( Attr8_Max < 39.93 ) { return new Prediction("NULL", 48, 0); }
	if( Attr8_Max >= 39.93 ) { 
		if( Attr2_Max >= 11.1 ) { return new Prediction("NULL", 9, 0); }
		if( Attr2_Max < 11.1 ) { return new Prediction("NULL", 5, 2); }
	}
	}
	if( Attr6_Mean >= -0.15 ) { 
		if( Attr2_Min < -25.07 ) { return new Prediction("NULL", 39, 0); }
	if( Attr2_Min >= -25.07 ) { 
		if( Attr9_Mean >= 18.93 ) { return new Prediction("NULL", 145, 24); }
		if( Attr9_Mean < 18.93 ) { return new Prediction("NULL", 1548, 560); }
	}
	}
	}
	if( Attr1_Mean < -3.53 ) { 
	if( Attr3_Mean < -1.29 ) { 
		if( Attr1_Mean < -4.72 ) { return new Prediction("NULL", 15, 0); }
	if( Attr1_Mean >= -4.72 ) { 
		if( Attr5_Mean < -0.01 ) { return new Prediction("smoking", 1, 0); }
		if( Attr5_Mean >= -0.01 ) { return new Prediction("NULL", 1, 0); }
	}
	}
	if( Attr3_Mean >= -1.29 ) { 
	if( Attr4_Max < 2.85 ) { 
		if( Attr2_Mean < -6.24 ) { return new Prediction("smoking", 3, 1); }
		if( Attr2_Mean >= -6.24 ) { return new Prediction("smoking", 39, 0); }
	}
	if( Attr4_Max >= 2.85 ) { 
		if( Attr1_Mean >= -8.67 ) { return new Prediction("smoking", 126, 42); }
		if( Attr1_Mean < -8.67 ) { return new Prediction("NULL", 17, 1); }
	}
	}
	}
	}
	if( Attr7_Max >= 19.83 ) { 
	if( Attr4_Max < 3.81 ) { 
	if( Attr1_Min >= -5.97 ) { 
	if( Attr7_Mean >= -5.88 ) { 
		if( Attr9_Mean >= 11.49 ) { return new Prediction("smoking", 20, 7); }
		if( Attr9_Mean < 11.49 ) { return new Prediction("NULL", 120, 20); }
	}
	if( Attr7_Mean < -5.88 ) { 
		if( Attr2_Min < -14.46 ) { return new Prediction("NULL", 16, 5); }
		if( Attr2_Min >= -14.46 ) { return new Prediction("smoking", 39, 5); }
	}
	}
	if( Attr1_Min < -5.97 ) { 
	if( Attr3_Mean >= 4.35 ) { 
		if( Attr8_Mean >= 19.95 ) { return new Prediction("smoking", 91, 23); }
		if( Attr8_Mean < 19.95 ) { return new Prediction("smoking", 150, 75); }
	}
	if( Attr3_Mean < 4.35 ) { 
		if( Attr5_Mean >= -0.49 ) { return new Prediction("smoking", 1529, 203); }
		if( Attr5_Mean < -0.49 ) { return new Prediction("NULL", 15, 0); }
	}
	}
	}
	if( Attr4_Max >= 3.81 ) { 
	if( Attr2_Min < -14.32 ) { 
	if( Attr3_Max < 13.36 ) { 
		if( Attr3_Min >= -7.27 ) { return new Prediction("smoking", 266, 112); }
		if( Attr3_Min < -7.27 ) { return new Prediction("NULL", 607, 186); }
	}
	if( Attr3_Max >= 13.36 ) { 
		if( Attr8_Max >= 15.56 ) { return new Prediction("NULL", 730, 152); }
		if( Attr8_Max < 15.56 ) { return new Prediction("NULL", 78, 35); }
	}
	}
	if( Attr2_Min >= -14.32 ) { 
	if( Attr5_Min < -4.02 ) { 
		if( Attr3_Max < 11.59 ) { return new Prediction("NULL", 56, 25); }
		if( Attr3_Max >= 11.59 ) { return new Prediction("NULL", 86, 4); }
	}
	if( Attr5_Min >= -4.02 ) { 
		if( Attr4_Min < -4.56 ) { return new Prediction("NULL", 327, 145); }
		if( Attr4_Min >= -4.56 ) { return new Prediction("smoking", 406, 131); }
	}
	}
	}
	}
	}
	if( Attr6_Min >= -2.22 ) { 
	if( Attr6_Max < 0.48 ) { 
	if( Attr3_Max >= 9.4 ) { 
	if( Attr5_Max >= 0.51 ) { 
		if( Attr1_Mean < -4.08 ) { return new Prediction("smoking", 4, 0); }
	if( Attr1_Mean >= -4.08 ) { 
		if( Attr1_Max < 5.5 ) { return new Prediction("NULL", 61, 1); }
		if( Attr1_Max >= 5.5 ) { return new Prediction("NULL", 17, 5); }
	}
	}
	if( Attr5_Max < 0.51 ) { 
	if( Attr2_Min < -4.82 ) { 
		if( Attr5_Max >= 0.14 ) { return new Prediction("NULL", 101, 0); }
		if( Attr5_Max < 0.14 ) { return new Prediction("NULL", 69, 6); }
	}
		if( Attr2_Min >= -4.82 ) { return new Prediction("NULL", 1188, 0); }
	}
	}
	if( Attr3_Max < 9.4 ) { 
	if( Attr9_Mean < 36.19 ) { 
	if( Attr1_Min < -8 ) { 
		if( Attr4_Max >= 3.1 ) { return new Prediction("smoking", 13, 2); }
		if( Attr4_Max < 3.1 ) { return new Prediction("NULL", 226, 44); }
	}
	if( Attr1_Min >= -8 ) { 
		if( Attr4_Mean >= 0.04 ) { return new Prediction("NULL", 260, 0); }
		if( Attr4_Mean < 0.04 ) { return new Prediction("NULL", 2988, 267); }
	}
	}
		if( Attr9_Mean >= 36.19 ) { return new Prediction("NULL", 217, 0); }
	}
	}
	if( Attr6_Max >= 0.48 ) { 
	if( Attr3_Min >= 5.23 ) { 
	if( Attr1_Max < 2.19 ) { 
	if( Attr1_Min >= -1.64 ) { 
		if( Attr8_Max < 42.35 ) { return new Prediction("NULL", 32, 4); }
		if( Attr8_Max >= 42.35 ) { return new Prediction("NULL", 20, 0); }
	}
		if( Attr1_Min < -1.64 ) { return new Prediction("NULL", 130, 0); }
	}
	if( Attr1_Max >= 2.19 ) { 
	if( Attr3_Max >= 10.34 ) { 
		if( Attr9_Max >= -28.12 ) { return new Prediction("NULL", 70, 0); }
		if( Attr9_Max < -28.12 ) { return new Prediction("NULL", 14, 5); }
	}
	if( Attr3_Max < 10.34 ) { 
		if( Attr5_Min < -1.07 ) { return new Prediction("NULL", 11, 0); }
		if( Attr5_Min >= -1.07 ) { return new Prediction("NULL", 33, 13); }
	}
	}
	}
	if( Attr3_Min < 5.23 ) { 
	if( Attr6_Max >= 1.39 ) { 
	if( Attr3_Min < -0.88 ) { 
		if( Attr2_Mean < -1.24 ) { return new Prediction("NULL", 1541, 399); }
		if( Attr2_Mean >= -1.24 ) { return new Prediction("NULL", 138, 10); }
	}
	if( Attr3_Min >= -0.88 ) { 
		if( Attr1_Mean >= -5.56 ) { return new Prediction("NULL", 397, 150); }
		if( Attr1_Mean < -5.56 ) { return new Prediction("smoking", 87, 22); }
	}
	}
	if( Attr6_Max < 1.39 ) { 
	if( Attr3_Min < -0.88 ) { 
		if( Attr5_Mean >= 0.06 ) { return new Prediction("NULL", 75, 0); }
		if( Attr5_Mean < 0.06 ) { return new Prediction("NULL", 1187, 180); }
	}
	if( Attr3_Min >= -0.88 ) { 
		if( Attr5_Max < 1.18 ) { return new Prediction("NULL", 328, 53); }
		if( Attr5_Max >= 1.18 ) { return new Prediction("smoking", 139, 65); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree77() {
	if( Attr1_Min >= -6.74 ) { 
	if( Attr3_Min < 7.37 ) { 
	if( Attr6_Max < 1.23 ) { 
	if( Attr8_Mean < 6.21 ) { 
	if( Attr3_Max < 7.49 ) { 
		if( Attr1_Max >= 1.74 ) { return new Prediction("NULL", 790, 34); }
		if( Attr1_Max < 1.74 ) { return new Prediction("NULL", 147, 0); }
	}
	if( Attr3_Max >= 7.49 ) { 
		if( Attr9_Mean < -40.99 ) { return new Prediction("NULL", 57, 0); }
		if( Attr9_Mean >= -40.99 ) { return new Prediction("NULL", 268, 31); }
	}
	}
	if( Attr8_Mean >= 6.21 ) { 
	if( Attr7_Max >= -75.3 ) { 
		if( Attr7_Min < -27.72 ) { return new Prediction("NULL", 1002, 182); }
		if( Attr7_Min >= -27.72 ) { return new Prediction("NULL", 2172, 205); }
	}
	if( Attr7_Max < -75.3 ) { 
		if( Attr7_Mean >= -86.32 ) { return new Prediction("smoking", 19, 0); }
		if( Attr7_Mean < -86.32 ) { return new Prediction("NULL", 6, 2); }
	}
	}
	}
	if( Attr6_Max >= 1.23 ) { 
	if( Attr4_Mean < -0.1 ) { 
	if( Attr3_Min < -19.51 ) { 
		if( Attr5_Mean < 0.05 ) { return new Prediction("NULL", 4, 0); }
		if( Attr5_Mean >= 0.05 ) { return new Prediction("smoking", 5, 0); }
	}
	if( Attr3_Min >= -19.51 ) { 
		if( Attr4_Max >= 18.5 ) { return new Prediction("smoking", 2, 0); }
		if( Attr4_Max < 18.5 ) { return new Prediction("NULL", 167, 6); }
	}
	}
	if( Attr4_Mean >= -0.1 ) { 
	if( Attr4_Min < -4.38 ) { 
		if( Attr1_Min >= 4.13 ) { return new Prediction("NULL", 32, 0); }
		if( Attr1_Min < 4.13 ) { return new Prediction("NULL", 999, 205); }
	}
	if( Attr4_Min >= -4.38 ) { 
		if( Attr3_Min < 3.05 ) { return new Prediction("NULL", 1481, 477); }
		if( Attr3_Min >= 3.05 ) { return new Prediction("NULL", 207, 33); }
	}
	}
	}
	}
	if( Attr3_Min >= 7.37 ) { 
	if( Attr5_Max < 0.04 ) { 
	if( Attr6_Min >= 0.01 ) { 
		if( Attr2_Max < -9.27 ) { return new Prediction("smoking", 1, 0); }
		if( Attr2_Max >= -9.27 ) { return new Prediction("NULL", 38, 0); }
	}
		if( Attr6_Min < 0.01 ) { return new Prediction("NULL", 1206, 0); }
	}
	if( Attr5_Max >= 0.04 ) { 
	if( Attr8_Min < 8.96 ) { 
	if( Attr7_Mean >= 40.25 ) { 
		if( Attr3_Max < 10.08 ) { return new Prediction("NULL", 2, 0); }
		if( Attr3_Max >= 10.08 ) { return new Prediction("smoking", 1, 0); }
	}
	if( Attr7_Mean < 40.25 ) { 
		if( Attr4_Mean < 0.01 ) { return new Prediction("NULL", 267, 0); }
		if( Attr4_Mean >= 0.01 ) { return new Prediction("NULL", 25, 1); }
	}
	}
	if( Attr8_Min >= 8.96 ) { 
	if( Attr4_Max >= 0.18 ) { 
		if( Attr3_Max >= 8.63 ) { return new Prediction("NULL", 64, 1); }
		if( Attr3_Max < 8.63 ) { return new Prediction("smoking", 1, 0); }
	}
	if( Attr4_Max < 0.18 ) { 
		if( Attr9_Mean < -25.92 ) { return new Prediction("smoking", 12, 4); }
		if( Attr9_Mean >= -25.92 ) { return new Prediction("NULL", 13, 0); }
	}
	}
	}
	}
	}
	if( Attr1_Min < -6.74 ) { 
	if( Attr1_Mean >= -7.57 ) { 
	if( Attr2_Max < 8.57 ) { 
	if( Attr7_Mean >= 35.36 ) { 
	if( Attr6_Min >= -2.76 ) { 
		if( Attr1_Max >= 8.42 ) { return new Prediction("NULL", 21, 10); }
		if( Attr1_Max < 8.42 ) { return new Prediction("NULL", 108, 5); }
	}
	if( Attr6_Min < -2.76 ) { 
		if( Attr5_Max >= 2.01 ) { return new Prediction("smoking", 56, 22); }
		if( Attr5_Max < 2.01 ) { return new Prediction("NULL", 24, 5); }
	}
	}
	if( Attr7_Mean < 35.36 ) { 
	if( Attr6_Min < -2.22 ) { 
		if( Attr2_Min >= -15.89 ) { return new Prediction("smoking", 2510, 533); }
		if( Attr2_Min < -15.89 ) { return new Prediction("NULL", 1036, 457); }
	}
	if( Attr6_Min >= -2.22 ) { 
		if( Attr2_Mean >= -4.16 ) { return new Prediction("smoking", 324, 134); }
		if( Attr2_Mean < -4.16 ) { return new Prediction("NULL", 767, 188); }
	}
	}
	}
	if( Attr2_Max >= 8.57 ) { 
	if( Attr2_Mean < -6.88 ) { 
	if( Attr6_Min < -3.08 ) { 
		if( Attr9_Mean < -7.36 ) { return new Prediction("NULL", 19, 7); }
		if( Attr9_Mean >= -7.36 ) { return new Prediction("NULL", 49, 1); }
	}
		if( Attr6_Min >= -3.08 ) { return new Prediction("NULL", 30, 0); }
	}
	if( Attr2_Mean >= -6.88 ) { 
	if( Attr3_Mean < 6.97 ) { 
		if( Attr5_Max < 4.83 ) { return new Prediction("NULL", 634, 259); }
		if( Attr5_Max >= 4.83 ) { return new Prediction("NULL", 307, 43); }
	}
	if( Attr3_Mean >= 6.97 ) { 
		if( Attr8_Min >= -31.46 ) { return new Prediction("NULL", 110, 5); }
		if( Attr8_Min < -31.46 ) { return new Prediction("NULL", 22, 7); }
	}
	}
	}
	}
	if( Attr1_Mean < -7.57 ) { 
	if( Attr5_Min >= -0.08 ) { 
	if( Attr4_Mean >= -0 ) { 
		if( Attr5_Max >= 0 ) { return new Prediction("NULL", 137, 0); }
	if( Attr5_Max < 0 ) { 
		if( Attr1_Max >= -8.44 ) { return new Prediction("NULL", 16, 0); }
		if( Attr1_Max < -8.44 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	if( Attr4_Mean < -0 ) { 
	if( Attr2_Min >= -2.88 ) { 
		if( Attr1_Max < -9.61 ) { return new Prediction("smoking", 1, 0); }
		if( Attr1_Max >= -9.61 ) { return new Prediction("NULL", 17, 0); }
	}
	if( Attr2_Min < -2.88 ) { 
		if( Attr4_Min < -0.01 ) { return new Prediction("NULL", 1, 0); }
		if( Attr4_Min >= -0.01 ) { return new Prediction("smoking", 10, 0); }
	}
	}
	}
	if( Attr5_Min < -0.08 ) { 
	if( Attr1_Max < 7.48 ) { 
	if( Attr1_Min >= -10.88 ) { 
		if( Attr7_Max >= 46.81 ) { return new Prediction("smoking", 25, 4); }
		if( Attr7_Max < 46.81 ) { return new Prediction("NULL", 173, 61); }
	}
	if( Attr1_Min < -10.88 ) { 
		if( Attr6_Min >= -3.18 ) { return new Prediction("NULL", 328, 24); }
		if( Attr6_Min < -3.18 ) { return new Prediction("NULL", 96, 32); }
	}
	}
	if( Attr1_Max >= 7.48 ) { 
		if( Attr2_Min < -20.49 ) { return new Prediction("NULL", 6, 0); }
	if( Attr2_Min >= -20.49 ) { 
		if( Attr3_Mean < -2.03 ) { return new Prediction("NULL", 2, 0); }
		if( Attr3_Mean >= -2.03 ) { return new Prediction("smoking", 60, 5); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree78() {
	if( Attr1_Min >= -6.8 ) { 
	if( Attr6_Max < 0.67 ) { 
	if( Attr8_Mean >= -1.78 ) { 
	if( Attr3_Min < 7.45 ) { 
	if( Attr3_Min >= -3.42 ) { 
		if( Attr1_Max >= 9.11 ) { return new Prediction("NULL", 308, 66); }
		if( Attr1_Max < 9.11 ) { return new Prediction("NULL", 1702, 179); }
	}
	if( Attr3_Min < -3.42 ) { 
		if( Attr9_Min < 1.17 ) { return new Prediction("NULL", 430, 36); }
		if( Attr9_Min >= 1.17 ) { return new Prediction("NULL", 546, 9); }
	}
	}
	if( Attr3_Min >= 7.45 ) { 
	if( Attr4_Min < -0.02 ) { 
		if( Attr2_Max < -9.44 ) { return new Prediction("smoking", 1, 0); }
		if( Attr2_Max >= -9.44 ) { return new Prediction("NULL", 418, 5); }
	}
		if( Attr4_Min >= -0.02 ) { return new Prediction("NULL", 781, 0); }
	}
	}
	if( Attr8_Mean < -1.78 ) { 
	if( Attr8_Min < -32.94 ) { 
	if( Attr8_Min >= -33.42 ) { 
		if( Attr2_Mean >= 1.42 ) { return new Prediction("smoking", 3, 0); }
		if( Attr2_Mean < 1.42 ) { return new Prediction("NULL", 14, 1); }
	}
	if( Attr8_Min < -33.42 ) { 
		if( Attr1_Mean >= 8.7 ) { return new Prediction("smoking", 8, 4); }
		if( Attr1_Mean < 8.7 ) { return new Prediction("NULL", 275, 4); }
	}
	}
	if( Attr8_Min >= -32.94 ) { 
	if( Attr3_Mean >= -9.31 ) { 
		if( Attr5_Min < -0.16 ) { return new Prediction("NULL", 241, 3); }
		if( Attr5_Min >= -0.16 ) { return new Prediction("NULL", 548, 0); }
	}
		if( Attr3_Mean < -9.31 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	}
	if( Attr6_Max >= 0.67 ) { 
	if( Attr7_Min >= -27.56 ) { 
	if( Attr3_Min >= -12.45 ) { 
		if( Attr4_Mean < -0.13 ) { return new Prediction("NULL", 78, 0); }
	if( Attr4_Mean >= -0.13 ) { 
		if( Attr5_Mean >= -0 ) { return new Prediction("NULL", 857, 115); }
		if( Attr5_Mean < -0 ) { return new Prediction("NULL", 559, 122); }
	}
	}
	if( Attr3_Min < -12.45 ) { 
	if( Attr7_Max < 34.55 ) { 
		if( Attr5_Max >= 2 ) { return new Prediction("smoking", 71, 32); }
		if( Attr5_Max < 2 ) { return new Prediction("NULL", 28, 3); }
	}
	if( Attr7_Max >= 34.55 ) { 
		if( Attr7_Max < 52.99 ) { return new Prediction("NULL", 21, 0); }
		if( Attr7_Max >= 52.99 ) { return new Prediction("NULL", 7, 2); }
	}
	}
	}
	if( Attr7_Min < -27.56 ) { 
	if( Attr3_Min >= -6.96 ) { 
	if( Attr6_Max < 1.19 ) { 
		if( Attr3_Mean < 2.12 ) { return new Prediction("NULL", 142, 39); }
		if( Attr3_Mean >= 2.12 ) { return new Prediction("NULL", 148, 14); }
	}
	if( Attr6_Max >= 1.19 ) { 
		if( Attr3_Mean >= 8.85 ) { return new Prediction("NULL", 46, 0); }
		if( Attr3_Mean < 8.85 ) { return new Prediction("NULL", 1178, 412); }
	}
	}
	if( Attr3_Min < -6.96 ) { 
	if( Attr1_Mean >= 4.66 ) { 
		if( Attr9_Mean < 7.09 ) { return new Prediction("NULL", 269, 45); }
		if( Attr9_Mean >= 7.09 ) { return new Prediction("NULL", 185, 5); }
	}
	if( Attr1_Mean < 4.66 ) { 
		if( Attr3_Mean >= 1.02 ) { return new Prediction("NULL", 135, 24); }
		if( Attr3_Mean < 1.02 ) { return new Prediction("NULL", 203, 78); }
	}
	}
	}
	}
	}
	if( Attr1_Min < -6.8 ) { 
	if( Attr6_Min < -2.22 ) { 
	if( Attr5_Min >= -4.11 ) { 
	if( Attr3_Min >= -8.26 ) { 
	if( Attr3_Max < 11.94 ) { 
		if( Attr1_Mean < -7.82 ) { return new Prediction("NULL", 165, 73); }
		if( Attr1_Mean >= -7.82 ) { return new Prediction("smoking", 2044, 370); }
	}
	if( Attr3_Max >= 11.94 ) { 
		if( Attr8_Max >= 47.11 ) { return new Prediction("NULL", 100, 19); }
		if( Attr8_Max < 47.11 ) { return new Prediction("NULL", 416, 188); }
	}
	}
	if( Attr3_Min < -8.26 ) { 
	if( Attr1_Min < -9.76 ) { 
		if( Attr2_Mean >= -5.59 ) { return new Prediction("NULL", 410, 171); }
		if( Attr2_Mean < -5.59 ) { return new Prediction("NULL", 302, 59); }
	}
	if( Attr1_Min >= -9.76 ) { 
		if( Attr3_Max < 9.81 ) { return new Prediction("smoking", 219, 37); }
		if( Attr3_Max >= 9.81 ) { return new Prediction("NULL", 210, 78); }
	}
	}
	}
	if( Attr5_Min < -4.11 ) { 
	if( Attr3_Min < -9.7 ) { 
	if( Attr3_Max >= 6.17 ) { 
		if( Attr4_Max < 4.11 ) { return new Prediction("smoking", 32, 15); }
		if( Attr4_Max >= 4.11 ) { return new Prediction("NULL", 525, 96); }
	}
	if( Attr3_Max < 6.17 ) { 
		if( Attr3_Min >= -17.91 ) { return new Prediction("smoking", 31, 4); }
		if( Attr3_Min < -17.91 ) { return new Prediction("NULL", 4, 0); }
	}
	}
	if( Attr3_Min >= -9.7 ) { 
	if( Attr2_Min < -10.87 ) { 
		if( Attr3_Max < 10.12 ) { return new Prediction("smoking", 93, 15); }
		if( Attr3_Max >= 10.12 ) { return new Prediction("NULL", 174, 65); }
	}
	if( Attr2_Min >= -10.87 ) { 
		if( Attr6_Mean >= 0.16 ) { return new Prediction("smoking", 2, 0); }
		if( Attr6_Mean < 0.16 ) { return new Prediction("NULL", 30, 2); }
	}
	}
	}
	}
	if( Attr6_Min >= -2.22 ) { 
	if( Attr1_Min < -10.91 ) { 
	if( Attr7_Max >= -42.94 ) { 
	if( Attr4_Mean >= -0.01 ) { 
		if( Attr8_Max < 91.84 ) { return new Prediction("NULL", 439, 35); }
		if( Attr8_Max >= 91.84 ) { return new Prediction("smoking", 4, 0); }
	}
	if( Attr4_Mean < -0.01 ) { 
		if( Attr9_Min >= -0.86 ) { return new Prediction("smoking", 18, 5); }
		if( Attr9_Min < -0.86 ) { return new Prediction("NULL", 225, 38); }
	}
	}
		if( Attr7_Max < -42.94 ) { return new Prediction("smoking", 3, 0); }
	}
	if( Attr1_Min >= -10.91 ) { 
	if( Attr2_Min >= -0.34 ) { 
		if( Attr4_Mean >= -0 ) { return new Prediction("NULL", 115, 0); }
	if( Attr4_Mean < -0 ) { 
		if( Attr1_Max < -8.77 ) { return new Prediction("smoking", 2, 0); }
		if( Attr1_Max >= -8.77 ) { return new Prediction("NULL", 7, 0); }
	}
	}
	if( Attr2_Min < -0.34 ) { 
	if( Attr2_Min < -15.14 ) { 
		if( Attr1_Max < -2.08 ) { return new Prediction("smoking", 2, 0); }
		if( Attr1_Max >= -2.08 ) { return new Prediction("NULL", 152, 20); }
	}
	if( Attr2_Min >= -15.14 ) { 
		if( Attr4_Max >= 1.24 ) { return new Prediction("NULL", 645, 310); }
		if( Attr4_Max < 1.24 ) { return new Prediction("NULL", 306, 77); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree79() {
	if( Attr1_Max < 7.33 ) { 
	if( Attr6_Max < 1.03 ) { 
	if( Attr4_Min < -1.97 ) { 
	if( Attr1_Min >= -7.37 ) { 
	if( Attr8_Min >= -10.09 ) { 
		if( Attr7_Min < -83.63 ) { return new Prediction("smoking", 9, 2); }
		if( Attr7_Min >= -83.63 ) { return new Prediction("NULL", 280, 28); }
	}
		if( Attr8_Min < -10.09 ) { return new Prediction("NULL", 89, 0); }
	}
	if( Attr1_Min < -7.37 ) { 
	if( Attr9_Min >= -32.79 ) { 
		if( Attr5_Mean < 0.09 ) { return new Prediction("NULL", 123, 28); }
		if( Attr5_Mean >= 0.09 ) { return new Prediction("smoking", 6, 1); }
	}
	if( Attr9_Min < -32.79 ) { 
		if( Attr3_Min >= -3.07 ) { return new Prediction("smoking", 106, 20); }
		if( Attr3_Min < -3.07 ) { return new Prediction("NULL", 38, 10); }
	}
	}
	}
	if( Attr4_Min >= -1.97 ) { 
	if( Attr2_Min < -1.74 ) { 
	if( Attr8_Min < -10.9 ) { 
		if( Attr1_Max < -7.79 ) { return new Prediction("NULL", 21, 6); }
		if( Attr1_Max >= -7.79 ) { return new Prediction("NULL", 595, 5); }
	}
	if( Attr8_Min >= -10.9 ) { 
		if( Attr5_Max < -0 ) { return new Prediction("NULL", 183, 0); }
		if( Attr5_Max >= -0 ) { return new Prediction("NULL", 2501, 209); }
	}
	}
	if( Attr2_Min >= -1.74 ) { 
	if( Attr6_Mean < -0 ) { 
		if( Attr9_Min < -15.69 ) { return new Prediction("NULL", 60, 0); }
		if( Attr9_Min >= -15.69 ) { return new Prediction("NULL", 43, 7); }
	}
		if( Attr6_Mean >= -0 ) { return new Prediction("NULL", 1363, 0); }
	}
	}
	}
	if( Attr6_Max >= 1.03 ) { 
	if( Attr7_Max < 27.88 ) { 
	if( Attr6_Min < -1.88 ) { 
	if( Attr3_Max >= 15.26 ) { 
		if( Attr8_Max < -2.77 ) { return new Prediction("smoking", 7, 2); }
		if( Attr8_Max >= -2.77 ) { return new Prediction("NULL", 57, 0); }
	}
	if( Attr3_Max < 15.26 ) { 
		if( Attr3_Min < -2.65 ) { return new Prediction("NULL", 269, 78); }
		if( Attr3_Min >= -2.65 ) { return new Prediction("smoking", 247, 104); }
	}
	}
	if( Attr6_Min >= -1.88 ) { 
	if( Attr3_Min < 2.74 ) { 
		if( Attr6_Max < 1.21 ) { return new Prediction("NULL", 72, 26); }
		if( Attr6_Max >= 1.21 ) { return new Prediction("NULL", 300, 43); }
	}
	if( Attr3_Min >= 2.74 ) { 
		if( Attr7_Min >= -8.88 ) { return new Prediction("NULL", 68, 0); }
		if( Attr7_Min < -8.88 ) { return new Prediction("NULL", 108, 8); }
	}
	}
	}
	if( Attr7_Max >= 27.88 ) { 
	if( Attr7_Mean >= 24.96 ) { 
	if( Attr1_Min < -11.31 ) { 
		if( Attr7_Min >= 20.85 ) { return new Prediction("NULL", 87, 1); }
		if( Attr7_Min < 20.85 ) { return new Prediction("NULL", 216, 47); }
	}
	if( Attr1_Min >= -11.31 ) { 
		if( Attr6_Min < -2.3 ) { return new Prediction("smoking", 98, 23); }
		if( Attr6_Min >= -2.3 ) { return new Prediction("NULL", 120, 35); }
	}
	}
	if( Attr7_Mean < 24.96 ) { 
	if( Attr5_Max < 2.9 ) { 
		if( Attr3_Min < 6.79 ) { return new Prediction("smoking", 943, 363); }
		if( Attr3_Min >= 6.79 ) { return new Prediction("NULL", 28, 1); }
	}
	if( Attr5_Max >= 2.9 ) { 
		if( Attr4_Min >= -9.43 ) { return new Prediction("NULL", 150, 41); }
		if( Attr4_Min < -9.43 ) { return new Prediction("NULL", 36, 2); }
	}
	}
	}
	}
	}
	if( Attr1_Max >= 7.33 ) { 
	if( Attr1_Min < -7.33 ) { 
	if( Attr3_Mean >= 4.48 ) { 
	if( Attr4_Mean < 0.01 ) { 
	if( Attr9_Min >= -35.88 ) { 
		if( Attr5_Mean < 0.04 ) { return new Prediction("NULL", 79, 0); }
		if( Attr5_Mean >= 0.04 ) { return new Prediction("smoking", 6, 2); }
	}
	if( Attr9_Min < -35.88 ) { 
		if( Attr7_Mean >= -24.06 ) { return new Prediction("NULL", 160, 37); }
		if( Attr7_Mean < -24.06 ) { return new Prediction("smoking", 12, 2); }
	}
	}
	if( Attr4_Mean >= 0.01 ) { 
	if( Attr3_Max < 14.23 ) { 
		if( Attr1_Max >= 10.04 ) { return new Prediction("NULL", 62, 28); }
		if( Attr1_Max < 10.04 ) { return new Prediction("smoking", 33, 6); }
	}
	if( Attr3_Max >= 14.23 ) { 
		if( Attr5_Max >= 3.59 ) { return new Prediction("NULL", 42, 3); }
		if( Attr5_Max < 3.59 ) { return new Prediction("NULL", 75, 29); }
	}
	}
	}
	if( Attr3_Mean < 4.48 ) { 
	if( Attr4_Min < -5.3 ) { 
	if( Attr4_Max >= 4.45 ) { 
		if( Attr5_Max >= 4.85 ) { return new Prediction("NULL", 322, 61); }
		if( Attr5_Max < 4.85 ) { return new Prediction("NULL", 646, 257); }
	}
	if( Attr4_Max < 4.45 ) { 
		if( Attr3_Max >= 10.36 ) { return new Prediction("smoking", 88, 43); }
		if( Attr3_Max < 10.36 ) { return new Prediction("smoking", 146, 30); }
	}
	}
	if( Attr4_Min >= -5.3 ) { 
	if( Attr6_Min >= -4.02 ) { 
		if( Attr1_Max >= 9.56 ) { return new Prediction("NULL", 442, 209); }
		if( Attr1_Max < 9.56 ) { return new Prediction("smoking", 440, 68); }
	}
	if( Attr6_Min < -4.02 ) { 
		if( Attr4_Min < -3.59 ) { return new Prediction("smoking", 546, 110); }
		if( Attr4_Min >= -3.59 ) { return new Prediction("smoking", 610, 45); }
	}
	}
	}
	}
	if( Attr1_Min >= -7.33 ) { 
	if( Attr1_Min >= -0.34 ) { 
	if( Attr6_Min < -4.8 ) { 
	if( Attr9_Max >= 7.66 ) { 
		if( Attr7_Mean >= -36.89 ) { return new Prediction("smoking", 21, 7); }
		if( Attr7_Mean < -36.89 ) { return new Prediction("smoking", 15, 0); }
	}
	if( Attr9_Max < 7.66 ) { 
		if( Attr4_Mean < 0.01 ) { return new Prediction("NULL", 7, 0); }
		if( Attr4_Mean >= 0.01 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	if( Attr6_Min >= -4.8 ) { 
	if( Attr6_Mean >= -0.12 ) { 
		if( Attr1_Mean >= 10.1 ) { return new Prediction("smoking", 33, 10); }
		if( Attr1_Mean < 10.1 ) { return new Prediction("NULL", 1879, 283); }
	}
		if( Attr6_Mean < -0.12 ) { return new Prediction("NULL", 80, 0); }
	}
	}
	if( Attr1_Min < -0.34 ) { 
	if( Attr9_Min < -45.67 ) { 
	if( Attr4_Mean < 0.08 ) { 
		if( Attr8_Mean < 37.48 ) { return new Prediction("NULL", 314, 53); }
		if( Attr8_Mean >= 37.48 ) { return new Prediction("NULL", 34, 0); }
	}
		if( Attr4_Mean >= 0.08 ) { return new Prediction("NULL", 30, 0); }
	}
	if( Attr9_Min >= -45.67 ) { 
	if( Attr1_Max >= 10.66 ) { 
		if( Attr4_Max < 3.36 ) { return new Prediction("NULL", 268, 103); }
		if( Attr4_Max >= 3.36 ) { return new Prediction("NULL", 604, 129); }
	}
	if( Attr1_Max < 10.66 ) { 
		if( Attr4_Min >= -5 ) { return new Prediction("NULL", 479, 236); }
		if( Attr4_Min < -5 ) { return new Prediction("NULL", 181, 40); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree80() {
	if( Attr1_Min < -6.53 ) { 
	if( Attr6_Min < -1.96 ) { 
	if( Attr1_Min < -9.87 ) { 
	if( Attr4_Min >= -5.03 ) { 
	if( Attr6_Min >= -3.99 ) { 
		if( Attr2_Min < -15.6 ) { return new Prediction("NULL", 160, 38); }
		if( Attr2_Min >= -15.6 ) { return new Prediction("smoking", 553, 244); }
	}
	if( Attr6_Min < -3.99 ) { 
		if( Attr1_Mean >= 6.1 ) { return new Prediction("smoking", 160, 6); }
		if( Attr1_Mean < 6.1 ) { return new Prediction("smoking", 676, 143); }
	}
	}
	if( Attr4_Min < -5.03 ) { 
	if( Attr5_Max < 3.44 ) { 
		if( Attr6_Max >= 4.59 ) { return new Prediction("smoking", 229, 82); }
		if( Attr6_Max < 4.59 ) { return new Prediction("NULL", 485, 159); }
	}
	if( Attr5_Max >= 3.44 ) { 
		if( Attr8_Max < 50.13 ) { return new Prediction("NULL", 684, 174); }
		if( Attr8_Max >= 50.13 ) { return new Prediction("NULL", 135, 6); }
	}
	}
	}
	if( Attr1_Min >= -9.87 ) { 
	if( Attr3_Max < 11.14 ) { 
	if( Attr9_Mean >= 8.99 ) { 
		if( Attr7_Max < 32.99 ) { return new Prediction("smoking", 133, 32); }
		if( Attr7_Max >= 32.99 ) { return new Prediction("smoking", 435, 11); }
	}
	if( Attr9_Mean < 8.99 ) { 
		if( Attr6_Mean < -0.18 ) { return new Prediction("NULL", 13, 1); }
		if( Attr6_Mean >= -0.18 ) { return new Prediction("smoking", 969, 234); }
	}
	}
	if( Attr3_Max >= 11.14 ) { 
	if( Attr5_Max >= 2.23 ) { 
		if( Attr7_Min >= -39.47 ) { return new Prediction("NULL", 280, 64); }
		if( Attr7_Min < -39.47 ) { return new Prediction("NULL", 146, 61); }
	}
	if( Attr5_Max < 2.23 ) { 
		if( Attr2_Mean < -1.85 ) { return new Prediction("NULL", 195, 97); }
		if( Attr2_Mean >= -1.85 ) { return new Prediction("smoking", 49, 7); }
	}
	}
	}
	}
	if( Attr6_Min >= -1.96 ) { 
	if( Attr1_Max < 7.27 ) { 
	if( Attr1_Min < -12.04 ) { 
	if( Attr9_Min >= -32.45 ) { 
		if( Attr8_Min >= 29.56 ) { return new Prediction("NULL", 11, 4); }
		if( Attr8_Min < 29.56 ) { return new Prediction("NULL", 201, 4); }
	}
	if( Attr9_Min < -32.45 ) { 
		if( Attr2_Min < -7.17 ) { return new Prediction("NULL", 113, 10); }
		if( Attr2_Min >= -7.17 ) { return new Prediction("smoking", 22, 11); }
	}
	}
	if( Attr1_Min >= -12.04 ) { 
	if( Attr5_Min < -0.73 ) { 
		if( Attr3_Mean >= 2.54 ) { return new Prediction("NULL", 325, 156); }
		if( Attr3_Mean < 2.54 ) { return new Prediction("NULL", 216, 42); }
	}
	if( Attr5_Min >= -0.73 ) { 
		if( Attr8_Max < -9.78 ) { return new Prediction("NULL", 82, 0); }
		if( Attr8_Max >= -9.78 ) { return new Prediction("NULL", 411, 83); }
	}
	}
	}
	if( Attr1_Max >= 7.27 ) { 
	if( Attr3_Max >= 9.43 ) { 
	if( Attr2_Min < -18.06 ) { 
		if( Attr2_Min >= -19.32 ) { return new Prediction("NULL", 32, 0); }
		if( Attr2_Min < -19.32 ) { return new Prediction("NULL", 32, 4); }
	}
	if( Attr2_Min >= -18.06 ) { 
		if( Attr6_Mean < -0.05 ) { return new Prediction("smoking", 9, 0); }
		if( Attr6_Mean >= -0.05 ) { return new Prediction("NULL", 97, 24); }
	}
	}
	if( Attr3_Max < 9.43 ) { 
	if( Attr2_Min >= -17.67 ) { 
		if( Attr1_Max >= 12.03 ) { return new Prediction("NULL", 16, 4); }
		if( Attr1_Max < 12.03 ) { return new Prediction("smoking", 130, 33); }
	}
		if( Attr2_Min < -17.67 ) { return new Prediction("NULL", 16, 0); }
	}
	}
	}
	}
	if( Attr1_Min >= -6.53 ) { 
	if( Attr1_Max < 1.76 ) { 
		if( Attr2_Min >= -3.15 ) { return new Prediction("NULL", 1143, 0); }
	if( Attr2_Min < -3.15 ) { 
	if( Attr1_Min < -5.02 ) { 
		if( Attr2_Mean < -8.14 ) { return new Prediction("NULL", 30, 0); }
	if( Attr2_Mean >= -8.14 ) { 
		if( Attr8_Mean >= 27.33 ) { return new Prediction("NULL", 32, 15); }
		if( Attr8_Mean < 27.33 ) { return new Prediction("NULL", 75, 10); }
	}
	}
	if( Attr1_Min >= -5.02 ) { 
	if( Attr8_Min >= -3.96 ) { 
		if( Attr5_Mean < 0.01 ) { return new Prediction("NULL", 861, 60); }
		if( Attr5_Mean >= 0.01 ) { return new Prediction("NULL", 188, 0); }
	}
	if( Attr8_Min < -3.96 ) { 
		if( Attr7_Mean >= 41.32 ) { return new Prediction("NULL", 7, 2); }
		if( Attr7_Mean < 41.32 ) { return new Prediction("NULL", 483, 1); }
	}
	}
	}
	}
	if( Attr1_Max >= 1.76 ) { 
	if( Attr1_Max < 7.85 ) { 
	if( Attr6_Min < -1.5 ) { 
	if( Attr4_Mean >= 0.04 ) { 
		if( Attr3_Min < -3.46 ) { return new Prediction("NULL", 39, 8); }
		if( Attr3_Min >= -3.46 ) { return new Prediction("smoking", 29, 7); }
	}
	if( Attr4_Mean < 0.04 ) { 
		if( Attr9_Max >= 44.3 ) { return new Prediction("NULL", 31, 0); }
		if( Attr9_Max < 44.3 ) { return new Prediction("NULL", 325, 60); }
	}
	}
	if( Attr6_Min >= -1.5 ) { 
	if( Attr7_Min < -29.23 ) { 
		if( Attr9_Max < -43.65 ) { return new Prediction("smoking", 22, 8); }
		if( Attr9_Max >= -43.65 ) { return new Prediction("NULL", 376, 60); }
	}
	if( Attr7_Min >= -29.23 ) { 
		if( Attr9_Max < -9.81 ) { return new Prediction("NULL", 542, 70); }
		if( Attr9_Max >= -9.81 ) { return new Prediction("NULL", 1010, 40); }
	}
	}
	}
	if( Attr1_Max >= 7.85 ) { 
	if( Attr7_Mean < -19.46 ) { 
	if( Attr8_Max < 11.1 ) { 
		if( Attr6_Min < -0.66 ) { return new Prediction("NULL", 74, 13); }
		if( Attr6_Min >= -0.66 ) { return new Prediction("NULL", 287, 2); }
	}
	if( Attr8_Max >= 11.1 ) { 
		if( Attr7_Max < -9.33 ) { return new Prediction("NULL", 953, 151); }
		if( Attr7_Max >= -9.33 ) { return new Prediction("NULL", 526, 147); }
	}
	}
	if( Attr7_Mean >= -19.46 ) { 
	if( Attr4_Max >= 4.79 ) { 
		if( Attr1_Min >= 1.83 ) { return new Prediction("NULL", 44, 0); }
		if( Attr1_Min < 1.83 ) { return new Prediction("NULL", 602, 108); }
	}
	if( Attr4_Max < 4.79 ) { 
		if( Attr3_Mean < -2.21 ) { return new Prediction("NULL", 203, 25); }
		if( Attr3_Mean >= -2.21 ) { return new Prediction("NULL", 981, 348); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree81() {
	if( Attr6_Max < 1.03 ) { 
	if( Attr2_Mean >= -0.28 ) { 
	if( Attr5_Min >= -0.75 ) { 
		if( Attr3_Mean >= 7.89 ) { return new Prediction("NULL", 1127, 0); }
	if( Attr3_Mean < 7.89 ) { 
	if( Attr3_Max < 6.66 ) { 
		if( Attr9_Max >= 27.28 ) { return new Prediction("NULL", 127, 0); }
		if( Attr9_Max < 27.28 ) { return new Prediction("NULL", 352, 9); }
	}
	if( Attr3_Max >= 6.66 ) { 
		if( Attr1_Max < -1.7 ) { return new Prediction("smoking", 14, 7); }
		if( Attr1_Max >= -1.7 ) { return new Prediction("NULL", 19, 1); }
	}
	}
	}
	if( Attr5_Min < -0.75 ) { 
	if( Attr2_Mean < 3.2 ) { 
	if( Attr1_Min >= -6.92 ) { 
		if( Attr6_Mean >= 0.01 ) { return new Prediction("smoking", 2, 0); }
		if( Attr6_Mean < 0.01 ) { return new Prediction("NULL", 20, 2); }
	}
	if( Attr1_Min < -6.92 ) { 
		if( Attr1_Max >= -6.11 ) { return new Prediction("smoking", 52, 1); }
		if( Attr1_Max < -6.11 ) { return new Prediction("NULL", 3, 1); }
	}
	}
	if( Attr2_Mean >= 3.2 ) { 
	if( Attr8_Max >= -4.96 ) { 
		if( Attr5_Mean >= -0 ) { return new Prediction("NULL", 5, 2); }
		if( Attr5_Mean < -0 ) { return new Prediction("NULL", 11, 0); }
	}
		if( Attr8_Max < -4.96 ) { return new Prediction("NULL", 23, 0); }
	}
	}
	}
	if( Attr2_Mean < -0.28 ) { 
	if( Attr1_Max >= 8.29 ) { 
	if( Attr2_Mean < -3.54 ) { 
	if( Attr6_Min < -0 ) { 
		if( Attr7_Min < -29.46 ) { return new Prediction("NULL", 286, 44); }
		if( Attr7_Min >= -29.46 ) { return new Prediction("NULL", 213, 79); }
	}
	if( Attr6_Min >= -0 ) { 
		if( Attr1_Mean < 8.34 ) { return new Prediction("NULL", 13, 3); }
		if( Attr1_Mean >= 8.34 ) { return new Prediction("smoking", 39, 5); }
	}
	}
	if( Attr2_Mean >= -3.54 ) { 
	if( Attr8_Min < 26.24 ) { 
		if( Attr3_Max >= 11.04 ) { return new Prediction("NULL", 23, 7); }
		if( Attr3_Max < 11.04 ) { return new Prediction("NULL", 308, 27); }
	}
	if( Attr8_Min >= 26.24 ) { 
		if( Attr3_Max < 1.3 ) { return new Prediction("smoking", 5, 0); }
		if( Attr3_Max >= 1.3 ) { return new Prediction("NULL", 8, 2); }
	}
	}
	}
	if( Attr1_Max < 8.29 ) { 
	if( Attr3_Min < 3.7 ) { 
	if( Attr1_Min >= -7.04 ) { 
		if( Attr5_Max >= 0 ) { return new Prediction("NULL", 2034, 173); }
		if( Attr5_Max < 0 ) { return new Prediction("NULL", 140, 0); }
	}
	if( Attr1_Min < -7.04 ) { 
		if( Attr4_Mean < 0.1 ) { return new Prediction("NULL", 533, 148); }
		if( Attr4_Mean >= 0.1 ) { return new Prediction("NULL", 100, 0); }
	}
	}
	if( Attr3_Min >= 3.7 ) { 
	if( Attr3_Min < 8.48 ) { 
		if( Attr9_Min >= -43.14 ) { return new Prediction("NULL", 966, 74); }
		if( Attr9_Min < -43.14 ) { return new Prediction("NULL", 218, 0); }
	}
		if( Attr3_Min >= 8.48 ) { return new Prediction("NULL", 194, 0); }
	}
	}
	}
	}
	if( Attr6_Max >= 1.03 ) { 
	if( Attr1_Min >= -6.65 ) { 
	if( Attr1_Max < 7.56 ) { 
	if( Attr1_Mean < -3.4 ) { 
	if( Attr1_Min < -5.28 ) { 
		if( Attr4_Min >= -6.89 ) { return new Prediction("smoking", 15, 1); }
		if( Attr4_Min < -6.89 ) { return new Prediction("NULL", 2, 0); }
	}
		if( Attr1_Min >= -5.28 ) { return new Prediction("NULL", 7, 0); }
	}
	if( Attr1_Mean >= -3.4 ) { 
	if( Attr3_Min < 5.02 ) { 
		if( Attr7_Max >= 45 ) { return new Prediction("NULL", 29, 0); }
		if( Attr7_Max < 45 ) { return new Prediction("NULL", 550, 100); }
	}
	if( Attr3_Min >= 5.02 ) { 
		if( Attr7_Max >= -43.89 ) { return new Prediction("NULL", 202, 6); }
		if( Attr7_Max < -43.89 ) { return new Prediction("smoking", 6, 3); }
	}
	}
	}
	if( Attr1_Max >= 7.56 ) { 
	if( Attr4_Max >= 3.35 ) { 
	if( Attr2_Max >= 2.63 ) { 
		if( Attr1_Mean >= 9.67 ) { return new Prediction("smoking", 13, 3); }
		if( Attr1_Mean < 9.67 ) { return new Prediction("NULL", 833, 132); }
	}
	if( Attr2_Max < 2.63 ) { 
		if( Attr7_Min >= -26.07 ) { return new Prediction("NULL", 175, 26); }
		if( Attr7_Min < -26.07 ) { return new Prediction("NULL", 552, 170); }
	}
	}
	if( Attr4_Max < 3.35 ) { 
	if( Attr5_Mean < 0.12 ) { 
		if( Attr1_Max < 9.51 ) { return new Prediction("smoking", 206, 91); }
		if( Attr1_Max >= 9.51 ) { return new Prediction("NULL", 707, 240); }
	}
		if( Attr5_Mean >= 0.12 ) { return new Prediction("NULL", 39, 0); }
	}
	}
	}
	if( Attr1_Min < -6.65 ) { 
	if( Attr2_Max >= 6.12 ) { 
	if( Attr4_Min >= -6.64 ) { 
	if( Attr2_Min < -20.62 ) { 
		if( Attr9_Min < -32.07 ) { return new Prediction("NULL", 32, 0); }
		if( Attr9_Min >= -32.07 ) { return new Prediction("NULL", 13, 2); }
	}
	if( Attr2_Min >= -20.62 ) { 
		if( Attr3_Min < -1.7 ) { return new Prediction("NULL", 641, 235); }
		if( Attr3_Min >= -1.7 ) { return new Prediction("smoking", 227, 74); }
	}
	}
	if( Attr4_Min < -6.64 ) { 
	if( Attr2_Max < 20.57 ) { 
		if( Attr1_Max < 11.64 ) { return new Prediction("NULL", 329, 58); }
		if( Attr1_Max >= 11.64 ) { return new Prediction("NULL", 440, 143); }
	}
	if( Attr2_Max >= 20.57 ) { 
		if( Attr1_Min < -13.61 ) { return new Prediction("NULL", 46, 0); }
		if( Attr1_Min >= -13.61 ) { return new Prediction("NULL", 5, 2); }
	}
	}
	}
	if( Attr2_Max < 6.12 ) { 
	if( Attr4_Min >= -5.25 ) { 
	if( Attr9_Mean >= 7.21 ) { 
		if( Attr7_Max >= 38.01 ) { return new Prediction("smoking", 600, 56); }
		if( Attr7_Max < 38.01 ) { return new Prediction("smoking", 329, 119); }
	}
	if( Attr9_Mean < 7.21 ) { 
		if( Attr7_Mean < 24.58 ) { return new Prediction("smoking", 1586, 532); }
		if( Attr7_Mean >= 24.58 ) { return new Prediction("NULL", 470, 219); }
	}
	}
	if( Attr4_Min < -5.25 ) { 
	if( Attr7_Min < -37.9 ) { 
		if( Attr4_Max < 3.42 ) { return new Prediction("smoking", 74, 7); }
		if( Attr4_Max >= 3.42 ) { return new Prediction("smoking", 303, 146); }
	}
	if( Attr7_Min >= -37.9 ) { 
		if( Attr3_Min >= -4.73 ) { return new Prediction("smoking", 140, 53); }
		if( Attr3_Min < -4.73 ) { return new Prediction("NULL", 472, 131); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree82() {
	if( Attr4_Min < -1.7 ) { 
	if( Attr6_Max < 2.03 ) { 
	if( Attr1_Min < -6.73 ) { 
	if( Attr6_Min >= -2.25 ) { 
	if( Attr1_Min < -12.97 ) { 
		if( Attr4_Max >= 3.1 ) { return new Prediction("NULL", 49, 14); }
		if( Attr4_Max < 3.1 ) { return new Prediction("NULL", 139, 7); }
	}
	if( Attr1_Min >= -12.97 ) { 
		if( Attr2_Mean >= -2.24 ) { return new Prediction("smoking", 161, 53); }
		if( Attr2_Mean < -2.24 ) { return new Prediction("NULL", 315, 77); }
	}
	}
	if( Attr6_Min < -2.25 ) { 
	if( Attr2_Max < 0.92 ) { 
		if( Attr4_Max < 3 ) { return new Prediction("smoking", 165, 18); }
		if( Attr4_Max >= 3 ) { return new Prediction("NULL", 62, 27); }
	}
	if( Attr2_Max >= 0.92 ) { 
		if( Attr5_Mean >= -0.1 ) { return new Prediction("smoking", 276, 128); }
		if( Attr5_Mean < -0.1 ) { return new Prediction("NULL", 38, 4); }
	}
	}
	}
	if( Attr1_Min >= -6.73 ) { 
	if( Attr9_Min >= -12.55 ) { 
		if( Attr8_Min >= 25.81 ) { return new Prediction("NULL", 66, 0); }
	if( Attr8_Min < 25.81 ) { 
		if( Attr8_Max < 45.26 ) { return new Prediction("NULL", 309, 18); }
		if( Attr8_Max >= 45.26 ) { return new Prediction("smoking", 7, 3); }
	}
	}
	if( Attr9_Min < -12.55 ) { 
	if( Attr7_Min < -28.28 ) { 
		if( Attr7_Mean >= -18.92 ) { return new Prediction("NULL", 269, 111); }
		if( Attr7_Mean < -18.92 ) { return new Prediction("NULL", 426, 87); }
	}
	if( Attr7_Min >= -28.28 ) { 
		if( Attr2_Mean < -9.71 ) { return new Prediction("smoking", 3, 0); }
		if( Attr2_Mean >= -9.71 ) { return new Prediction("NULL", 762, 90); }
	}
	}
	}
	}
	if( Attr6_Max >= 2.03 ) { 
	if( Attr4_Max >= 4.17 ) { 
	if( Attr1_Min < -6.47 ) { 
	if( Attr3_Max < 11.95 ) { 
		if( Attr8_Max < 55.24 ) { return new Prediction("smoking", 1157, 515); }
		if( Attr8_Max >= 55.24 ) { return new Prediction("NULL", 72, 15); }
	}
	if( Attr3_Max >= 11.95 ) { 
		if( Attr1_Min >= -14.05 ) { return new Prediction("NULL", 799, 267); }
		if( Attr1_Min < -14.05 ) { return new Prediction("NULL", 630, 128); }
	}
	}
	if( Attr1_Min >= -6.47 ) { 
	if( Attr1_Mean < 0.5 ) { 
		if( Attr1_Mean < -0.06 ) { return new Prediction("NULL", 77, 6); }
		if( Attr1_Mean >= -0.06 ) { return new Prediction("NULL", 43, 0); }
	}
	if( Attr1_Mean >= 0.5 ) { 
		if( Attr4_Max >= 6.86 ) { return new Prediction("NULL", 317, 54); }
		if( Attr4_Max < 6.86 ) { return new Prediction("NULL", 513, 139); }
	}
	}
	}
	if( Attr4_Max < 4.17 ) { 
	if( Attr7_Max < 23.87 ) { 
	if( Attr6_Min < -3.61 ) { 
		if( Attr2_Max < 3.25 ) { return new Prediction("smoking", 233, 48); }
		if( Attr2_Max >= 3.25 ) { return new Prediction("NULL", 88, 31); }
	}
	if( Attr6_Min >= -3.61 ) { 
		if( Attr1_Max >= 13.85 ) { return new Prediction("NULL", 130, 22); }
		if( Attr1_Max < 13.85 ) { return new Prediction("NULL", 554, 239); }
	}
	}
	if( Attr7_Max >= 23.87 ) { 
	if( Attr8_Max >= 32.1 ) { 
		if( Attr3_Max >= 10.98 ) { return new Prediction("NULL", 232, 115); }
		if( Attr3_Max < 10.98 ) { return new Prediction("smoking", 1301, 200); }
	}
	if( Attr8_Max < 32.1 ) { 
		if( Attr2_Min >= -7.79 ) { return new Prediction("NULL", 33, 6); }
		if( Attr2_Min < -7.79 ) { return new Prediction("smoking", 283, 114); }
	}
	}
	}
	}
	}
	if( Attr4_Min >= -1.7 ) { 
	if( Attr3_Min < 7.1 ) { 
	if( Attr5_Min < -0.36 ) { 
	if( Attr6_Mean < -0.14 ) { 
	if( Attr2_Mean >= -9.34 ) { 
		if( Attr1_Mean < 9.21 ) { return new Prediction("NULL", 142, 0); }
		if( Attr1_Mean >= 9.21 ) { return new Prediction("NULL", 16, 1); }
	}
		if( Attr2_Mean < -9.34 ) { return new Prediction("smoking", 1, 0); }
	}
	if( Attr6_Mean >= -0.14 ) { 
	if( Attr1_Max < 7.84 ) { 
		if( Attr6_Min < -1.97 ) { return new Prediction("smoking", 105, 50); }
		if( Attr6_Min >= -1.97 ) { return new Prediction("NULL", 835, 109); }
	}
	if( Attr1_Max >= 7.84 ) { 
		if( Attr7_Max >= 12.79 ) { return new Prediction("smoking", 183, 91); }
		if( Attr7_Max < 12.79 ) { return new Prediction("NULL", 367, 94); }
	}
	}
	}
	if( Attr5_Min >= -0.36 ) { 
	if( Attr2_Mean >= 0.09 ) { 
	if( Attr6_Max < 0.38 ) { 
		if( Attr3_Mean < 1.27 ) { return new Prediction("NULL", 285, 0); }
		if( Attr3_Mean >= 1.27 ) { return new Prediction("NULL", 103, 5); }
	}
	if( Attr6_Max >= 0.38 ) { 
		if( Attr1_Max >= -0.37 ) { return new Prediction("NULL", 10, 0); }
		if( Attr1_Max < -0.37 ) { return new Prediction("smoking", 5, 1); }
	}
	}
	if( Attr2_Mean < 0.09 ) { 
	if( Attr2_Min >= -10.96 ) { 
		if( Attr5_Min < 0 ) { return new Prediction("NULL", 2080, 169); }
		if( Attr5_Min >= 0 ) { return new Prediction("NULL", 358, 74); }
	}
	if( Attr2_Min < -10.96 ) { 
		if( Attr9_Mean < 9.88 ) { return new Prediction("NULL", 101, 47); }
		if( Attr9_Mean >= 9.88 ) { return new Prediction("NULL", 29, 1); }
	}
	}
	}
	}
	if( Attr3_Min >= 7.1 ) { 
	if( Attr4_Max < 0.03 ) { 
	if( Attr1_Mean >= 1.66 ) { 
		if( Attr1_Mean < 1.88 ) { return new Prediction("smoking", 3, 0); }
		if( Attr1_Mean >= 1.88 ) { return new Prediction("NULL", 53, 0); }
	}
		if( Attr1_Mean < 1.66 ) { return new Prediction("NULL", 1103, 0); }
	}
	if( Attr4_Max >= 0.03 ) { 
	if( Attr3_Max < 9.48 ) { 
	if( Attr1_Max >= 0.32 ) { 
		if( Attr3_Max < 9 ) { return new Prediction("NULL", 93, 5); }
		if( Attr3_Max >= 9 ) { return new Prediction("NULL", 47, 10); }
	}
		if( Attr1_Max < 0.32 ) { return new Prediction("NULL", 172, 0); }
	}
	if( Attr3_Max >= 9.48 ) { 
	if( Attr7_Max >= 56.19 ) { 
		if( Attr5_Mean < 0.01 ) { return new Prediction("NULL", 11, 0); }
		if( Attr5_Mean >= 0.01 ) { return new Prediction("smoking", 1, 0); }
	}
		if( Attr7_Max < 56.19 ) { return new Prediction("NULL", 266, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree83() {
	if( Attr1_Min < -7.01 ) { 
	if( Attr2_Max >= 8.16 ) { 
	if( Attr3_Max >= 11.2 ) { 
	if( Attr1_Mean >= 0.93 ) { 
	if( Attr3_Mean < 1.16 ) { 
		if( Attr4_Mean >= -0.01 ) { return new Prediction("NULL", 67, 3); }
		if( Attr4_Mean < -0.01 ) { return new Prediction("NULL", 59, 15); }
	}
	if( Attr3_Mean >= 1.16 ) { 
		if( Attr8_Mean >= 15.04 ) { return new Prediction("NULL", 120, 32); }
		if( Attr8_Mean < 15.04 ) { return new Prediction("smoking", 106, 42); }
	}
	}
	if( Attr1_Mean < 0.93 ) { 
	if( Attr6_Max < 2.1 ) { 
		if( Attr8_Mean >= 10.68 ) { return new Prediction("NULL", 55, 0); }
		if( Attr8_Mean < 10.68 ) { return new Prediction("NULL", 47, 5); }
	}
	if( Attr6_Max >= 2.1 ) { 
		if( Attr6_Max < 2.21 ) { return new Prediction("smoking", 7, 0); }
		if( Attr6_Max >= 2.21 ) { return new Prediction("NULL", 581, 105); }
	}
	}
	}
	if( Attr3_Max < 11.2 ) { 
	if( Attr1_Max >= 1.43 ) { 
	if( Attr2_Min >= -13.41 ) { 
		if( Attr5_Min < -5.16 ) { return new Prediction("NULL", 6, 1); }
		if( Attr5_Min >= -5.16 ) { return new Prediction("NULL", 20, 0); }
	}
	if( Attr2_Min < -13.41 ) { 
		if( Attr7_Min >= -44.16 ) { return new Prediction("NULL", 98, 32); }
		if( Attr7_Min < -44.16 ) { return new Prediction("smoking", 40, 15); }
	}
	}
	if( Attr1_Max < 1.43 ) { 
	if( Attr3_Max < 7.25 ) { 
		if( Attr8_Mean >= -11.77 ) { return new Prediction("NULL", 15, 0); }
		if( Attr8_Mean < -11.77 ) { return new Prediction("smoking", 1, 0); }
	}
	if( Attr3_Max >= 7.25 ) { 
		if( Attr2_Mean >= -0.79 ) { return new Prediction("smoking", 38, 0); }
		if( Attr2_Mean < -0.79 ) { return new Prediction("NULL", 7, 2); }
	}
	}
	}
	}
	if( Attr2_Max < 8.16 ) { 
	if( Attr4_Max < 0.26 ) { 
	if( Attr6_Mean < 0 ) { 
	if( Attr4_Min >= -2.74 ) { 
		if( Attr1_Max >= -9.64 ) { return new Prediction("NULL", 163, 1); }
		if( Attr1_Max < -9.64 ) { return new Prediction("smoking", 1, 0); }
	}
		if( Attr4_Min < -2.74 ) { return new Prediction("smoking", 2, 0); }
	}
	if( Attr6_Mean >= 0 ) { 
		if( Attr4_Mean >= -0.01 ) { return new Prediction("NULL", 31, 0); }
	if( Attr4_Mean < -0.01 ) { 
		if( Attr6_Mean >= 0.01 ) { return new Prediction("NULL", 10, 0); }
		if( Attr6_Mean < 0.01 ) { return new Prediction("smoking", 25, 9); }
	}
	}
	}
	if( Attr4_Max >= 0.26 ) { 
	if( Attr6_Min >= -2.35 ) { 
	if( Attr2_Min < -13.39 ) { 
		if( Attr1_Min >= -10.77 ) { return new Prediction("NULL", 270, 76); }
		if( Attr1_Min < -10.77 ) { return new Prediction("NULL", 251, 30); }
	}
	if( Attr2_Min >= -13.39 ) { 
		if( Attr2_Mean < -0.77 ) { return new Prediction("NULL", 954, 309); }
		if( Attr2_Mean >= -0.77 ) { return new Prediction("smoking", 149, 41); }
	}
	}
	if( Attr6_Min < -2.35 ) { 
	if( Attr4_Min < -5.43 ) { 
		if( Attr4_Max >= 5.31 ) { return new Prediction("NULL", 660, 243); }
		if( Attr4_Max < 5.31 ) { return new Prediction("smoking", 377, 130); }
	}
	if( Attr4_Min >= -5.43 ) { 
		if( Attr8_Max >= 34.5 ) { return new Prediction("smoking", 1916, 345); }
		if( Attr8_Max < 34.5 ) { return new Prediction("smoking", 661, 222); }
	}
	}
	}
	}
	}
	if( Attr1_Min >= -7.01 ) { 
	if( Attr2_Min < -8.86 ) { 
	if( Attr6_Max >= 1.06 ) { 
	if( Attr3_Mean < -0.88 ) { 
	if( Attr1_Mean >= 4.66 ) { 
		if( Attr9_Max >= 13.16 ) { return new Prediction("NULL", 339, 17); }
		if( Attr9_Max < 13.16 ) { return new Prediction("NULL", 79, 26); }
	}
	if( Attr1_Mean < 4.66 ) { 
		if( Attr6_Max < 1.15 ) { return new Prediction("NULL", 25, 0); }
		if( Attr6_Max >= 1.15 ) { return new Prediction("NULL", 308, 89); }
	}
	}
	if( Attr3_Mean >= -0.88 ) { 
	if( Attr4_Max >= 3.52 ) { 
		if( Attr8_Max >= 41.93 ) { return new Prediction("NULL", 398, 59); }
		if( Attr8_Max < 41.93 ) { return new Prediction("NULL", 822, 201); }
	}
	if( Attr4_Max < 3.52 ) { 
		if( Attr7_Min < -31.41 ) { return new Prediction("NULL", 425, 202); }
		if( Attr7_Min >= -31.41 ) { return new Prediction("NULL", 490, 137); }
	}
	}
	}
	if( Attr6_Max < 1.06 ) { 
		if( Attr7_Max < -71.03 ) { return new Prediction("smoking", 11, 0); }
	if( Attr7_Max >= -71.03 ) { 
	if( Attr2_Min < -11 ) { 
		if( Attr5_Max < 0.13 ) { return new Prediction("NULL", 53, 25); }
		if( Attr5_Max >= 0.13 ) { return new Prediction("NULL", 528, 78); }
	}
	if( Attr2_Min >= -11 ) { 
		if( Attr1_Min < 6.82 ) { return new Prediction("NULL", 1235, 109); }
		if( Attr1_Min >= 6.82 ) { return new Prediction("smoking", 5, 0); }
	}
	}
	}
	}
	if( Attr2_Min >= -8.86 ) { 
	if( Attr1_Max < 3.23 ) { 
		if( Attr3_Min >= 8.4 ) { return new Prediction("NULL", 1231, 0); }
	if( Attr3_Min < 8.4 ) { 
	if( Attr9_Mean < -12.95 ) { 
		if( Attr7_Mean < -9.87 ) { return new Prediction("NULL", 204, 0); }
		if( Attr7_Mean >= -9.87 ) { return new Prediction("NULL", 521, 30); }
	}
	if( Attr9_Mean >= -12.95 ) { 
		if( Attr9_Min < 39.24 ) { return new Prediction("NULL", 565, 4); }
		if( Attr9_Min >= 39.24 ) { return new Prediction("smoking", 6, 3); }
	}
	}
	}
	if( Attr1_Max >= 3.23 ) { 
	if( Attr4_Max < 0 ) { 
	if( Attr4_Mean >= -0.02 ) { 
		if( Attr3_Min >= 0.96 ) { return new Prediction("NULL", 51, 9); }
		if( Attr3_Min < 0.96 ) { return new Prediction("smoking", 49, 13); }
	}
		if( Attr4_Mean < -0.02 ) { return new Prediction("NULL", 50, 0); }
	}
	if( Attr4_Max >= 0 ) { 
	if( Attr4_Min < -0.01 ) { 
		if( Attr7_Max >= 6.86 ) { return new Prediction("NULL", 358, 81); }
		if( Attr7_Max < 6.86 ) { return new Prediction("NULL", 1147, 118); }
	}
	if( Attr4_Min >= -0.01 ) { 
		if( Attr4_Mean >= -0 ) { return new Prediction("NULL", 239, 0); }
		if( Attr4_Mean < -0 ) { return new Prediction("smoking", 2, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree84() {
	if( Attr1_Min >= -6.8 ) { 
	if( Attr1_Mean < 0.38 ) { 
	if( Attr4_Min >= -0.41 ) { 
	if( Attr3_Mean < 7.77 ) { 
	if( Attr8_Max >= 45.18 ) { 
		if( Attr7_Min < 4.49 ) { return new Prediction("NULL", 35, 5); }
		if( Attr7_Min >= 4.49 ) { return new Prediction("smoking", 4, 0); }
	}
	if( Attr8_Max < 45.18 ) { 
		if( Attr9_Min < -27.3 ) { return new Prediction("NULL", 120, 11); }
		if( Attr9_Min >= -27.3 ) { return new Prediction("NULL", 366, 8); }
	}
	}
	if( Attr3_Mean >= 7.77 ) { 
		if( Attr5_Max < 0.04 ) { return new Prediction("NULL", 1090, 0); }
	if( Attr5_Max >= 0.04 ) { 
		if( Attr4_Min >= -0.05 ) { return new Prediction("NULL", 30, 1); }
		if( Attr4_Min < -0.05 ) { return new Prediction("NULL", 228, 0); }
	}
	}
	}
	if( Attr4_Min < -0.41 ) { 
	if( Attr6_Min >= -1.75 ) { 
	if( Attr6_Mean >= 0.01 ) { 
		if( Attr3_Max < 10.92 ) { return new Prediction("NULL", 164, 34); }
		if( Attr3_Max >= 10.92 ) { return new Prediction("NULL", 94, 6); }
	}
	if( Attr6_Mean < 0.01 ) { 
		if( Attr4_Min >= -0.43 ) { return new Prediction("NULL", 24, 9); }
		if( Attr4_Min < -0.43 ) { return new Prediction("NULL", 682, 33); }
	}
	}
	if( Attr6_Min < -1.75 ) { 
	if( Attr9_Min < -35.58 ) { 
		if( Attr6_Mean < -0 ) { return new Prediction("NULL", 103, 8); }
		if( Attr6_Mean >= -0 ) { return new Prediction("NULL", 71, 22); }
	}
	if( Attr9_Min >= -35.58 ) { 
		if( Attr8_Max < 48.5 ) { return new Prediction("NULL", 154, 64); }
		if( Attr8_Max >= 48.5 ) { return new Prediction("NULL", 22, 1); }
	}
	}
	}
	}
	if( Attr1_Mean >= 0.38 ) { 
	if( Attr7_Min >= -27.41 ) { 
	if( Attr4_Min < -0.78 ) { 
	if( Attr1_Min >= 0.12 ) { 
		if( Attr9_Min < 30.05 ) { return new Prediction("NULL", 611, 54); }
		if( Attr9_Min >= 30.05 ) { return new Prediction("smoking", 4, 0); }
	}
	if( Attr1_Min < 0.12 ) { 
		if( Attr9_Min >= -35.16 ) { return new Prediction("NULL", 480, 138); }
		if( Attr9_Min < -35.16 ) { return new Prediction("NULL", 377, 45); }
	}
	}
	if( Attr4_Min >= -0.78 ) { 
		if( Attr2_Max < -11 ) { return new Prediction("smoking", 9, 0); }
	if( Attr2_Max >= -11 ) { 
		if( Attr4_Max >= -0.02 ) { return new Prediction("NULL", 1291, 89); }
		if( Attr4_Max < -0.02 ) { return new Prediction("NULL", 110, 0); }
	}
	}
	}
	if( Attr7_Min < -27.41 ) { 
	if( Attr2_Min >= -7.49 ) { 
	if( Attr2_Max < 11.07 ) { 
		if( Attr1_Min < 9.75 ) { return new Prediction("NULL", 872, 105); }
		if( Attr1_Min >= 9.75 ) { return new Prediction("NULL", 78, 0); }
	}
	if( Attr2_Max >= 11.07 ) { 
		if( Attr8_Mean >= -18.43 ) { return new Prediction("NULL", 8, 2); }
		if( Attr8_Mean < -18.43 ) { return new Prediction("smoking", 9, 0); }
	}
	}
	if( Attr2_Min < -7.49 ) { 
	if( Attr3_Min < -7.11 ) { 
		if( Attr3_Max >= 1.54 ) { return new Prediction("NULL", 704, 143); }
		if( Attr3_Max < 1.54 ) { return new Prediction("NULL", 81, 2); }
	}
	if( Attr3_Min >= -7.11 ) { 
		if( Attr7_Max >= 6.64 ) { return new Prediction("NULL", 452, 200); }
		if( Attr7_Max < 6.64 ) { return new Prediction("NULL", 879, 232); }
	}
	}
	}
	}
	}
	if( Attr1_Min < -6.8 ) { 
	if( Attr6_Max >= 1.48 ) { 
	if( Attr6_Min >= -2.7 ) { 
	if( Attr2_Min >= -13.25 ) { 
	if( Attr5_Max >= 2.66 ) { 
		if( Attr3_Max >= 13.61 ) { return new Prediction("NULL", 44, 1); }
		if( Attr3_Max < 13.61 ) { return new Prediction("NULL", 71, 24); }
	}
	if( Attr5_Max < 2.66 ) { 
		if( Attr3_Max < 12.43 ) { return new Prediction("smoking", 570, 221); }
		if( Attr3_Max >= 12.43 ) { return new Prediction("NULL", 76, 23); }
	}
	}
	if( Attr2_Min < -13.25 ) { 
	if( Attr1_Min < -8.16 ) { 
		if( Attr7_Min < -37 ) { return new Prediction("NULL", 110, 39); }
		if( Attr7_Min >= -37 ) { return new Prediction("NULL", 399, 57); }
	}
	if( Attr1_Min >= -8.16 ) { 
		if( Attr3_Max >= 8.89 ) { return new Prediction("NULL", 97, 28); }
		if( Attr3_Max < 8.89 ) { return new Prediction("smoking", 45, 13); }
	}
	}
	}
	if( Attr6_Min < -2.7 ) { 
	if( Attr3_Min >= -9.1 ) { 
	if( Attr2_Max >= 5.87 ) { 
		if( Attr2_Min >= -21.23 ) { return new Prediction("smoking", 477, 222); }
		if( Attr2_Min < -21.23 ) { return new Prediction("NULL", 32, 2); }
	}
	if( Attr2_Max < 5.87 ) { 
		if( Attr9_Min >= -26.2 ) { return new Prediction("smoking", 809, 87); }
		if( Attr9_Min < -26.2 ) { return new Prediction("smoking", 1286, 301); }
	}
	}
	if( Attr3_Min < -9.1 ) { 
	if( Attr2_Mean < -2.85 ) { 
		if( Attr2_Min >= -15 ) { return new Prediction("smoking", 269, 108); }
		if( Attr2_Min < -15 ) { return new Prediction("NULL", 965, 294); }
	}
	if( Attr2_Mean >= -2.85 ) { 
		if( Attr7_Max >= 35.37 ) { return new Prediction("NULL", 77, 13); }
		if( Attr7_Max < 35.37 ) { return new Prediction("NULL", 79, 0); }
	}
	}
	}
	}
	if( Attr6_Max < 1.48 ) { 
	if( Attr6_Min >= -2.11 ) { 
	if( Attr9_Min < -34.72 ) { 
	if( Attr6_Max < 0.09 ) { 
		if( Attr4_Min >= 0 ) { return new Prediction("smoking", 2, 0); }
		if( Attr4_Min < 0 ) { return new Prediction("NULL", 45, 0); }
	}
	if( Attr6_Max >= 0.09 ) { 
		if( Attr3_Mean >= 3.01 ) { return new Prediction("smoking", 172, 84); }
		if( Attr3_Mean < 3.01 ) { return new Prediction("NULL", 114, 26); }
	}
	}
	if( Attr9_Min >= -34.72 ) { 
	if( Attr4_Mean >= -0 ) { 
		if( Attr6_Mean < 0 ) { return new Prediction("NULL", 314, 8); }
		if( Attr6_Mean >= 0 ) { return new Prediction("NULL", 119, 16); }
	}
	if( Attr4_Mean < -0 ) { 
		if( Attr1_Min < -11.3 ) { return new Prediction("NULL", 91, 3); }
		if( Attr1_Min >= -11.3 ) { return new Prediction("NULL", 184, 52); }
	}
	}
	}
	if( Attr6_Min < -2.11 ) { 
	if( Attr1_Min < -9.5 ) { 
	if( Attr6_Mean >= -0.24 ) { 
		if( Attr1_Max < -0.74 ) { return new Prediction("smoking", 9, 1); }
		if( Attr1_Max >= -0.74 ) { return new Prediction("NULL", 107, 33); }
	}
		if( Attr6_Mean < -0.24 ) { return new Prediction("NULL", 18, 0); }
	}
	if( Attr1_Min >= -9.5 ) { 
	if( Attr7_Min >= -37.68 ) { 
		if( Attr8_Mean < 19.18 ) { return new Prediction("NULL", 42, 16); }
		if( Attr8_Mean >= 19.18 ) { return new Prediction("smoking", 43, 12); }
	}
	if( Attr7_Min < -37.68 ) { 
		if( Attr7_Max < 12.47 ) { return new Prediction("NULL", 10, 4); }
		if( Attr7_Max >= 12.47 ) { return new Prediction("smoking", 50, 2); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree85() {
	if( Attr4_Max < 0.94 ) { 
	if( Attr3_Mean < 9.04 ) { 
	if( Attr2_Min < -10.54 ) { 
	if( Attr1_Min >= -5.27 ) { 
	if( Attr5_Min < -0.04 ) { 
		if( Attr2_Mean < -7.15 ) { return new Prediction("NULL", 149, 10); }
		if( Attr2_Mean >= -7.15 ) { return new Prediction("NULL", 41, 12); }
	}
	if( Attr5_Min >= -0.04 ) { 
		if( Attr4_Min < -0 ) { return new Prediction("NULL", 18, 4); }
		if( Attr4_Min >= -0 ) { return new Prediction("smoking", 6, 0); }
	}
	}
	if( Attr1_Min < -5.27 ) { 
	if( Attr3_Mean < 0.83 ) { 
		if( Attr3_Min >= -4.81 ) { return new Prediction("smoking", 32, 1); }
		if( Attr3_Min < -4.81 ) { return new Prediction("smoking", 24, 10); }
	}
	if( Attr3_Mean >= 0.83 ) { 
		if( Attr3_Min < 2.55 ) { return new Prediction("NULL", 44, 8); }
		if( Attr3_Min >= 2.55 ) { return new Prediction("smoking", 5, 0); }
	}
	}
	}
	if( Attr2_Min >= -10.54 ) { 
	if( Attr4_Mean >= -0 ) { 
	if( Attr9_Min < 8.75 ) { 
		if( Attr2_Mean >= -1.29 ) { return new Prediction("NULL", 303, 5); }
		if( Attr2_Mean < -1.29 ) { return new Prediction("NULL", 1661, 148); }
	}
	if( Attr9_Min >= 8.75 ) { 
		if( Attr9_Min >= 16.04 ) { return new Prediction("NULL", 302, 7); }
		if( Attr9_Min < 16.04 ) { return new Prediction("NULL", 217, 0); }
	}
	}
	if( Attr4_Mean < -0 ) { 
	if( Attr5_Max >= 0 ) { 
		if( Attr4_Min < -0.01 ) { return new Prediction("NULL", 723, 103); }
		if( Attr4_Min >= -0.01 ) { return new Prediction("NULL", 120, 43); }
	}
		if( Attr5_Max < 0 ) { return new Prediction("NULL", 127, 0); }
	}
	}
	}
		if( Attr3_Mean >= 9.04 ) { return new Prediction("NULL", 1235, 0); }
	}
	if( Attr4_Max >= 0.94 ) { 
	if( Attr6_Min < -2.63 ) { 
	if( Attr4_Min < -5.32 ) { 
	if( Attr2_Max >= 19.82 ) { 
		if( Attr7_Min >= -46.29 ) { return new Prediction("NULL", 76, 0); }
	if( Attr7_Min < -46.29 ) { 
		if( Attr7_Min < -47.39 ) { return new Prediction("NULL", 18, 0); }
		if( Attr7_Min >= -47.39 ) { return new Prediction("smoking", 5, 1); }
	}
	}
	if( Attr2_Max < 19.82 ) { 
	if( Attr3_Min < -10.54 ) { 
		if( Attr1_Min >= -20.71 ) { return new Prediction("NULL", 934, 247); }
		if( Attr1_Min < -20.71 ) { return new Prediction("NULL", 68, 1); }
	}
	if( Attr3_Min >= -10.54 ) { 
		if( Attr1_Mean < -4.95 ) { return new Prediction("smoking", 201, 79); }
		if( Attr1_Mean >= -4.95 ) { return new Prediction("NULL", 882, 338); }
	}
	}
	}
	if( Attr4_Min >= -5.32 ) { 
	if( Attr4_Max >= 3.05 ) { 
	if( Attr6_Max >= 4.43 ) { 
		if( Attr1_Max < 7.75 ) { return new Prediction("NULL", 62, 19); }
		if( Attr1_Max >= 7.75 ) { return new Prediction("smoking", 615, 124); }
	}
	if( Attr6_Max < 4.43 ) { 
		if( Attr7_Mean >= 12.74 ) { return new Prediction("smoking", 412, 166); }
		if( Attr7_Mean < 12.74 ) { return new Prediction("NULL", 881, 357); }
	}
	}
	if( Attr4_Max < 3.05 ) { 
	if( Attr2_Min >= -9.82 ) { 
		if( Attr8_Max < 35.71 ) { return new Prediction("NULL", 81, 32); }
		if( Attr8_Max >= 35.71 ) { return new Prediction("smoking", 63, 14); }
	}
	if( Attr2_Min < -9.82 ) { 
		if( Attr9_Mean < -1.31 ) { return new Prediction("smoking", 504, 127); }
		if( Attr9_Mean >= -1.31 ) { return new Prediction("smoking", 646, 69); }
	}
	}
	}
	}
	if( Attr6_Min >= -2.63 ) { 
	if( Attr5_Min < -0.96 ) { 
	if( Attr1_Max < 14.11 ) { 
	if( Attr2_Min < -14.3 ) { 
		if( Attr1_Max < 8.27 ) { return new Prediction("NULL", 463, 54); }
		if( Attr1_Max >= 8.27 ) { return new Prediction("NULL", 416, 105); }
	}
	if( Attr2_Min >= -14.3 ) { 
		if( Attr3_Min >= -1.02 ) { return new Prediction("NULL", 772, 335); }
		if( Attr3_Min < -1.02 ) { return new Prediction("NULL", 1696, 507); }
	}
	}
	if( Attr1_Max >= 14.11 ) { 
	if( Attr3_Mean < -0.66 ) { 
		if( Attr1_Min < -4.87 ) { return new Prediction("NULL", 25, 1); }
		if( Attr1_Min >= -4.87 ) { return new Prediction("NULL", 145, 0); }
	}
	if( Attr3_Mean >= -0.66 ) { 
		if( Attr3_Mean < -0.64 ) { return new Prediction("smoking", 3, 0); }
		if( Attr3_Mean >= -0.64 ) { return new Prediction("NULL", 228, 41); }
	}
	}
	}
	if( Attr5_Min >= -0.96 ) { 
	if( Attr6_Max >= 1.66 ) { 
		if( Attr4_Min < -4.04 ) { return new Prediction("NULL", 40, 0); }
	if( Attr4_Min >= -4.04 ) { 
		if( Attr3_Mean >= 7.84 ) { return new Prediction("NULL", 46, 2); }
		if( Attr3_Mean < 7.84 ) { return new Prediction("NULL", 228, 100); }
	}
	}
	if( Attr6_Max < 1.66 ) { 
	if( Attr9_Mean >= -40.69 ) { 
		if( Attr8_Max >= -6.59 ) { return new Prediction("NULL", 1198, 128); }
		if( Attr8_Max < -6.59 ) { return new Prediction("NULL", 100, 0); }
	}
	if( Attr9_Mean < -40.69 ) { 
		if( Attr8_Mean < 24.21 ) { return new Prediction("NULL", 42, 6); }
		if( Attr8_Mean >= 24.21 ) { return new Prediction("smoking", 21, 5); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree86() {
	if( Attr4_Max >= 0.98 ) { 
	if( Attr8_Max >= 35.28 ) { 
	if( Attr6_Min < -2.67 ) { 
	if( Attr2_Max >= 3.32 ) { 
	if( Attr3_Min >= -2.6 ) { 
		if( Attr2_Mean < -3.99 ) { return new Prediction("smoking", 55, 24); }
		if( Attr2_Mean >= -3.99 ) { return new Prediction("smoking", 165, 27); }
	}
	if( Attr3_Min < -2.6 ) { 
		if( Attr6_Min >= -3.2 ) { return new Prediction("NULL", 243, 44); }
		if( Attr6_Min < -3.2 ) { return new Prediction("NULL", 1240, 427); }
	}
	}
	if( Attr2_Max < 3.32 ) { 
	if( Attr7_Max >= 22.53 ) { 
		if( Attr9_Min >= -30.94 ) { return new Prediction("smoking", 729, 86); }
		if( Attr9_Min < -30.94 ) { return new Prediction("smoking", 737, 209); }
	}
	if( Attr7_Max < 22.53 ) { 
		if( Attr4_Min >= -4.09 ) { return new Prediction("smoking", 216, 84); }
		if( Attr4_Min < -4.09 ) { return new Prediction("NULL", 196, 62); }
	}
	}
	}
	if( Attr6_Min >= -2.67 ) { 
	if( Attr6_Min < -1.79 ) { 
	if( Attr2_Mean < -1.38 ) { 
		if( Attr2_Max < 2.5 ) { return new Prediction("NULL", 626, 245); }
		if( Attr2_Max >= 2.5 ) { return new Prediction("NULL", 455, 105); }
	}
	if( Attr2_Mean >= -1.38 ) { 
		if( Attr3_Max >= 7.27 ) { return new Prediction("smoking", 76, 15); }
		if( Attr3_Max < 7.27 ) { return new Prediction("NULL", 8, 0); }
	}
	}
	if( Attr6_Min >= -1.79 ) { 
	if( Attr6_Max >= 2.07 ) { 
		if( Attr5_Mean < 0.09 ) { return new Prediction("NULL", 337, 135); }
		if( Attr5_Mean >= 0.09 ) { return new Prediction("NULL", 26, 1); }
	}
	if( Attr6_Max < 2.07 ) { 
		if( Attr2_Mean < -0.3 ) { return new Prediction("NULL", 1040, 163); }
		if( Attr2_Mean >= -0.3 ) { return new Prediction("smoking", 55, 22); }
	}
	}
	}
	}
	if( Attr8_Max < 35.28 ) { 
	if( Attr6_Min >= -2.05 ) { 
	if( Attr6_Max >= 1.39 ) { 
		if( Attr6_Mean < -0.07 ) { return new Prediction("NULL", 39, 0); }
	if( Attr6_Mean >= -0.07 ) { 
		if( Attr6_Max < 1.4 ) { return new Prediction("smoking", 10, 0); }
		if( Attr6_Max >= 1.4 ) { return new Prediction("NULL", 897, 241); }
	}
	}
	if( Attr6_Max < 1.39 ) { 
	if( Attr9_Max < -2.71 ) { 
		if( Attr2_Min < -6.58 ) { return new Prediction("NULL", 338, 82); }
		if( Attr2_Min >= -6.58 ) { return new Prediction("NULL", 160, 10); }
	}
	if( Attr9_Max >= -2.71 ) { 
		if( Attr8_Min < -9.9 ) { return new Prediction("NULL", 197, 8); }
		if( Attr8_Min >= -9.9 ) { return new Prediction("NULL", 566, 65); }
	}
	}
	}
	if( Attr6_Min < -2.05 ) { 
	if( Attr4_Min < -5.05 ) { 
	if( Attr1_Min < -6.7 ) { 
		if( Attr7_Max < 106.16 ) { return new Prediction("NULL", 616, 210); }
		if( Attr7_Max >= 106.16 ) { return new Prediction("smoking", 7, 0); }
	}
	if( Attr1_Min >= -6.7 ) { 
		if( Attr1_Mean >= 0.54 ) { return new Prediction("NULL", 290, 58); }
		if( Attr1_Mean < 0.54 ) { return new Prediction("NULL", 40, 0); }
	}
	}
	if( Attr4_Min >= -5.05 ) { 
	if( Attr6_Max >= 4.07 ) { 
		if( Attr3_Mean < 4.94 ) { return new Prediction("smoking", 275, 62); }
		if( Attr3_Mean >= 4.94 ) { return new Prediction("NULL", 40, 6); }
	}
	if( Attr6_Max < 4.07 ) { 
		if( Attr1_Min >= -7.54 ) { return new Prediction("NULL", 540, 148); }
		if( Attr1_Min < -7.54 ) { return new Prediction("smoking", 580, 222); }
	}
	}
	}
	}
	}
	if( Attr4_Max < 0.98 ) { 
	if( Attr2_Mean < -1.25 ) { 
	if( Attr1_Max < 8.94 ) { 
	if( Attr1_Max < -8.32 ) { 
		if( Attr8_Mean < -10.57 ) { return new Prediction("NULL", 4, 0); }
	if( Attr8_Mean >= -10.57 ) { 
		if( Attr4_Max >= -0.01 ) { return new Prediction("smoking", 14, 0); }
		if( Attr4_Max < -0.01 ) { return new Prediction("NULL", 4, 0); }
	}
	}
	if( Attr1_Max >= -8.32 ) { 
	if( Attr7_Mean >= -73.97 ) { 
		if( Attr4_Max >= -0 ) { return new Prediction("NULL", 2715, 193); }
		if( Attr4_Max < -0 ) { return new Prediction("NULL", 307, 47); }
	}
	if( Attr7_Mean < -73.97 ) { 
		if( Attr2_Max >= -7.05 ) { return new Prediction("NULL", 9, 3); }
		if( Attr2_Max < -7.05 ) { return new Prediction("smoking", 9, 0); }
	}
	}
	}
	if( Attr1_Max >= 8.94 ) { 
	if( Attr2_Max < -3.34 ) { 
		if( Attr3_Min >= 0.68 ) { return new Prediction("NULL", 9, 0); }
	if( Attr3_Min < 0.68 ) { 
		if( Attr6_Mean >= 0.01 ) { return new Prediction("smoking", 9, 0); }
		if( Attr6_Mean < 0.01 ) { return new Prediction("smoking", 36, 13); }
	}
	}
	if( Attr2_Max >= -3.34 ) { 
	if( Attr7_Mean >= -18.11 ) { 
		if( Attr8_Max < 44.33 ) { return new Prediction("NULL", 93, 32); }
		if( Attr8_Max >= 44.33 ) { return new Prediction("smoking", 10, 1); }
	}
	if( Attr7_Mean < -18.11 ) { 
		if( Attr2_Min >= -11.6 ) { return new Prediction("NULL", 146, 15); }
		if( Attr2_Min < -11.6 ) { return new Prediction("smoking", 10, 2); }
	}
	}
	}
	}
	if( Attr2_Mean >= -1.25 ) { 
	if( Attr3_Max < 8 ) { 
	if( Attr2_Min >= -4.38 ) { 
	if( Attr4_Max < 0.89 ) { 
		if( Attr3_Max >= 0.08 ) { return new Prediction("NULL", 281, 4); }
		if( Attr3_Max < 0.08 ) { return new Prediction("NULL", 179, 0); }
	}
	if( Attr4_Max >= 0.89 ) { 
		if( Attr4_Min >= -4.88 ) { return new Prediction("NULL", 4, 0); }
		if( Attr4_Min < -4.88 ) { return new Prediction("smoking", 2, 0); }
	}
	}
	if( Attr2_Min < -4.38 ) { 
		if( Attr8_Min < -4.52 ) { return new Prediction("NULL", 9, 0); }
	if( Attr8_Min >= -4.52 ) { 
		if( Attr8_Min >= -1.69 ) { return new Prediction("NULL", 7, 2); }
		if( Attr8_Min < -1.69 ) { return new Prediction("smoking", 5, 0); }
	}
	}
	}
	if( Attr3_Max >= 8 ) { 
		if( Attr5_Max < 0.8 ) { return new Prediction("NULL", 1208, 0); }
	if( Attr5_Max >= 0.8 ) { 
		if( Attr1_Mean < 1.35 ) { return new Prediction("NULL", 7, 0); }
	if( Attr1_Mean >= 1.35 ) { 
		if( Attr3_Mean < 8.77 ) { return new Prediction("NULL", 1, 0); }
		if( Attr3_Mean >= 8.77 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree87() {
	if( Attr2_Min < -9.53 ) { 
	if( Attr6_Min < -2.39 ) { 
	if( Attr3_Max >= 8.75 ) { 
	if( Attr3_Min < -8.24 ) { 
	if( Attr1_Max < 21.17 ) { 
		if( Attr4_Max >= 5.28 ) { return new Prediction("NULL", 1251, 251); }
		if( Attr4_Max < 5.28 ) { return new Prediction("NULL", 390, 144); }
	}
	if( Attr1_Max >= 21.17 ) { 
		if( Attr2_Min < -16.34 ) { return new Prediction("NULL", 39, 0); }
		if( Attr2_Min >= -16.34 ) { return new Prediction("NULL", 8, 1); }
	}
	}
	if( Attr3_Min >= -8.24 ) { 
	if( Attr1_Max >= 18.04 ) { 
		if( Attr1_Min >= -10.16 ) { return new Prediction("NULL", 66, 26); }
		if( Attr1_Min < -10.16 ) { return new Prediction("smoking", 147, 6); }
	}
	if( Attr1_Max < 18.04 ) { 
		if( Attr1_Min < -6.63 ) { return new Prediction("smoking", 1124, 519); }
		if( Attr1_Min >= -6.63 ) { return new Prediction("NULL", 396, 89); }
	}
	}
	}
	if( Attr3_Max < 8.75 ) { 
	if( Attr1_Mean >= 1.6 ) { 
	if( Attr4_Max < 2.87 ) { 
		if( Attr7_Min < -38.24 ) { return new Prediction("smoking", 150, 15); }
		if( Attr7_Min >= -38.24 ) { return new Prediction("smoking", 150, 61); }
	}
	if( Attr4_Max >= 2.87 ) { 
		if( Attr6_Min >= -5.14 ) { return new Prediction("NULL", 349, 97); }
		if( Attr6_Min < -5.14 ) { return new Prediction("smoking", 144, 36); }
	}
	}
	if( Attr1_Mean < 1.6 ) { 
	if( Attr1_Min < -6.77 ) { 
		if( Attr4_Max < 2.84 ) { return new Prediction("smoking", 625, 44); }
		if( Attr4_Max >= 2.84 ) { return new Prediction("smoking", 701, 162); }
	}
	if( Attr1_Min >= -6.77 ) { 
		if( Attr7_Min < -26.01 ) { return new Prediction("NULL", 29, 3); }
		if( Attr7_Min >= -26.01 ) { return new Prediction("NULL", 36, 16); }
	}
	}
	}
	}
	if( Attr6_Min >= -2.39 ) { 
	if( Attr6_Max >= 1.2 ) { 
	if( Attr2_Max < 0.46 ) { 
		if( Attr7_Mean >= 38.6 ) { return new Prediction("NULL", 24, 0); }
	if( Attr7_Mean < 38.6 ) { 
		if( Attr4_Min >= -1.04 ) { return new Prediction("smoking", 61, 14); }
		if( Attr4_Min < -1.04 ) { return new Prediction("NULL", 964, 365); }
	}
	}
	if( Attr2_Max >= 0.46 ) { 
	if( Attr9_Min < -14.18 ) { 
		if( Attr4_Mean >= -0.15 ) { return new Prediction("NULL", 1052, 258); }
		if( Attr4_Mean < -0.15 ) { return new Prediction("NULL", 51, 0); }
	}
	if( Attr9_Min >= -14.18 ) { 
		if( Attr8_Min >= 12.76 ) { return new Prediction("NULL", 65, 14); }
		if( Attr8_Min < 12.76 ) { return new Prediction("NULL", 195, 7); }
	}
	}
	}
	if( Attr6_Max < 1.2 ) { 
	if( Attr5_Max < 2.11 ) { 
	if( Attr2_Mean >= -3.3 ) { 
		if( Attr2_Min >= -14.16 ) { return new Prediction("NULL", 87, 33); }
		if( Attr2_Min < -14.16 ) { return new Prediction("NULL", 23, 0); }
	}
	if( Attr2_Mean < -3.3 ) { 
		if( Attr8_Min < -18.77 ) { return new Prediction("NULL", 184, 4); }
		if( Attr8_Min >= -18.77 ) { return new Prediction("NULL", 1242, 163); }
	}
	}
	if( Attr5_Max >= 2.11 ) { 
	if( Attr4_Mean >= -0.03 ) { 
		if( Attr8_Mean < 22.58 ) { return new Prediction("NULL", 32, 15); }
		if( Attr8_Mean >= 22.58 ) { return new Prediction("NULL", 40, 4); }
	}
	if( Attr4_Mean < -0.03 ) { 
		if( Attr5_Mean < -0.01 ) { return new Prediction("NULL", 9, 2); }
		if( Attr5_Mean >= -0.01 ) { return new Prediction("smoking", 17, 1); }
	}
	}
	}
	}
	}
	if( Attr2_Min >= -9.53 ) { 
	if( Attr6_Mean >= 0.01 ) { 
	if( Attr1_Min >= -7.65 ) { 
	if( Attr1_Max < 7.48 ) { 
	if( Attr4_Min >= -1.62 ) { 
		if( Attr8_Max < 31.77 ) { return new Prediction("NULL", 364, 2); }
		if( Attr8_Max >= 31.77 ) { return new Prediction("NULL", 214, 12); }
	}
	if( Attr4_Min < -1.62 ) { 
		if( Attr9_Min >= -26.91 ) { return new Prediction("NULL", 20, 0); }
		if( Attr9_Min < -26.91 ) { return new Prediction("NULL", 57, 15); }
	}
	}
	if( Attr1_Max >= 7.48 ) { 
	if( Attr4_Max < 4.28 ) { 
		if( Attr4_Max < 2.1 ) { return new Prediction("NULL", 207, 35); }
		if( Attr4_Max >= 2.1 ) { return new Prediction("NULL", 111, 49); }
	}
		if( Attr4_Max >= 4.28 ) { return new Prediction("NULL", 37, 0); }
	}
	}
	if( Attr1_Min < -7.65 ) { 
	if( Attr4_Max < 4.33 ) { 
	if( Attr6_Max < 3.74 ) { 
		if( Attr5_Mean >= 0 ) { return new Prediction("smoking", 100, 46); }
		if( Attr5_Mean < 0 ) { return new Prediction("NULL", 81, 10); }
	}
	if( Attr6_Max >= 3.74 ) { 
		if( Attr3_Min >= -6.86 ) { return new Prediction("smoking", 39, 7); }
		if( Attr3_Min < -6.86 ) { return new Prediction("NULL", 5, 0); }
	}
	}
	if( Attr4_Max >= 4.33 ) { 
	if( Attr3_Min < -2.28 ) { 
		if( Attr2_Max < 0.83 ) { return new Prediction("smoking", 5, 0); }
		if( Attr2_Max >= 0.83 ) { return new Prediction("NULL", 14, 2); }
	}
	if( Attr3_Min >= -2.28 ) { 
		if( Attr3_Mean >= 2.69 ) { return new Prediction("smoking", 70, 0); }
		if( Attr3_Mean < 2.69 ) { return new Prediction("NULL", 4, 0); }
	}
	}
	}
	}
	if( Attr6_Mean < 0.01 ) { 
	if( Attr1_Min >= -8.65 ) { 
	if( Attr5_Max >= 0.25 ) { 
	if( Attr6_Min >= -2.07 ) { 
		if( Attr8_Mean >= 9.81 ) { return new Prediction("NULL", 576, 79); }
		if( Attr8_Mean < 9.81 ) { return new Prediction("NULL", 466, 27); }
	}
	if( Attr6_Min < -2.07 ) { 
		if( Attr9_Max >= -36.61 ) { return new Prediction("NULL", 164, 43); }
		if( Attr9_Max < -36.61 ) { return new Prediction("smoking", 16, 2); }
	}
	}
	if( Attr5_Max < 0.25 ) { 
	if( Attr1_Max >= 0.72 ) { 
		if( Attr6_Max >= -0 ) { return new Prediction("NULL", 1313, 94); }
		if( Attr6_Max < -0 ) { return new Prediction("NULL", 179, 0); }
	}
	if( Attr1_Max < 0.72 ) { 
		if( Attr4_Min >= -0.07 ) { return new Prediction("NULL", 1184, 0); }
		if( Attr4_Min < -0.07 ) { return new Prediction("NULL", 465, 6); }
	}
	}
	}
	if( Attr1_Min < -8.65 ) { 
	if( Attr5_Max >= 1.17 ) { 
	if( Attr1_Mean < -2.5 ) { 
		if( Attr3_Min >= -0.77 ) { return new Prediction("smoking", 115, 8); }
		if( Attr3_Min < -0.77 ) { return new Prediction("smoking", 66, 32); }
	}
	if( Attr1_Mean >= -2.5 ) { 
		if( Attr2_Max >= 2.52 ) { return new Prediction("NULL", 41, 0); }
		if( Attr2_Max < 2.52 ) { return new Prediction("smoking", 8, 3); }
	}
	}
	if( Attr5_Max < 1.17 ) { 
	if( Attr4_Max >= 0.19 ) { 
		if( Attr8_Max < -6.2 ) { return new Prediction("NULL", 34, 0); }
		if( Attr8_Max >= -6.2 ) { return new Prediction("NULL", 191, 36); }
	}
	if( Attr4_Max < 0.19 ) { 
		if( Attr4_Min < -0 ) { return new Prediction("NULL", 79, 0); }
		if( Attr4_Min >= -0 ) { return new Prediction("smoking", 2, 1); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree88() {
	if( Attr4_Min >= -1.39 ) { 
	if( Attr4_Min < -0.01 ) { 
	if( Attr1_Max >= 8.32 ) { 
	if( Attr2_Max >= -1.29 ) { 
	if( Attr1_Min < 1.89 ) { 
		if( Attr6_Max >= 0.44 ) { return new Prediction("NULL", 86, 42); }
		if( Attr6_Max < 0.44 ) { return new Prediction("NULL", 35, 5); }
	}
	if( Attr1_Min >= 1.89 ) { 
		if( Attr8_Max < 0.93 ) { return new Prediction("NULL", 72, 0); }
		if( Attr8_Max >= 0.93 ) { return new Prediction("NULL", 226, 19); }
	}
	}
	if( Attr2_Max < -1.29 ) { 
	if( Attr3_Max < -0.85 ) { 
		if( Attr6_Min >= 0.01 ) { return new Prediction("smoking", 6, 0); }
		if( Attr6_Min < 0.01 ) { return new Prediction("NULL", 74, 7); }
	}
	if( Attr3_Max >= -0.85 ) { 
		if( Attr3_Mean < -2.02 ) { return new Prediction("NULL", 13, 0); }
		if( Attr3_Mean >= -2.02 ) { return new Prediction("smoking", 197, 85); }
	}
	}
	}
	if( Attr1_Max < 8.32 ) { 
	if( Attr3_Max < 9.34 ) { 
	if( Attr2_Min >= -10.57 ) { 
		if( Attr9_Max >= -17.15 ) { return new Prediction("NULL", 1984, 113); }
		if( Attr9_Max < -17.15 ) { return new Prediction("NULL", 506, 72); }
	}
	if( Attr2_Min < -10.57 ) { 
		if( Attr8_Mean < 18.41 ) { return new Prediction("NULL", 106, 3); }
		if( Attr8_Mean >= 18.41 ) { return new Prediction("NULL", 232, 72); }
	}
	}
	if( Attr3_Max >= 9.34 ) { 
	if( Attr5_Max < 1.99 ) { 
		if( Attr7_Max >= 56.19 ) { return new Prediction("NULL", 8, 3); }
		if( Attr7_Max < 56.19 ) { return new Prediction("NULL", 718, 11); }
	}
	if( Attr5_Max >= 1.99 ) { 
		if( Attr2_Mean >= -3.67 ) { return new Prediction("NULL", 5, 0); }
		if( Attr2_Mean < -3.67 ) { return new Prediction("smoking", 8, 2); }
	}
	}
	}
	}
	if( Attr4_Min >= -0.01 ) { 
	if( Attr2_Max >= -2.7 ) { 
	if( Attr2_Min < -9.2 ) { 
		if( Attr2_Min >= -11.16 ) { return new Prediction("smoking", 4, 0); }
		if( Attr2_Min < -11.16 ) { return new Prediction("NULL", 7, 0); }
	}
	if( Attr2_Min >= -9.2 ) { 
	if( Attr1_Min >= 7.98 ) { 
		if( Attr1_Mean < 8.44 ) { return new Prediction("smoking", 1, 0); }
		if( Attr1_Mean >= 8.44 ) { return new Prediction("NULL", 122, 1); }
	}
		if( Attr1_Min < 7.98 ) { return new Prediction("NULL", 1065, 0); }
	}
	}
	if( Attr2_Max < -2.7 ) { 
	if( Attr8_Max >= 31.94 ) { 
	if( Attr5_Max >= 0 ) { 
		if( Attr9_Mean >= -27.2 ) { return new Prediction("NULL", 30, 14); }
		if( Attr9_Mean < -27.2 ) { return new Prediction("NULL", 11, 0); }
	}
	if( Attr5_Max < 0 ) { 
		if( Attr7_Max >= 35.86 ) { return new Prediction("NULL", 3, 1); }
		if( Attr7_Max < 35.86 ) { return new Prediction("NULL", 32, 0); }
	}
	}
	if( Attr8_Max < 31.94 ) { 
	if( Attr2_Mean >= -4.26 ) { 
		if( Attr1_Mean < 8.67 ) { return new Prediction("NULL", 27, 4); }
		if( Attr1_Mean >= 8.67 ) { return new Prediction("smoking", 4, 0); }
	}
	if( Attr2_Mean < -4.26 ) { 
		if( Attr9_Min >= -12.8 ) { return new Prediction("NULL", 69, 3); }
		if( Attr9_Min < -12.8 ) { return new Prediction("NULL", 170, 0); }
	}
	}
	}
	}
	}
	if( Attr4_Min < -1.39 ) { 
	if( Attr1_Min < -6.82 ) { 
	if( Attr2_Max >= 9.47 ) { 
	if( Attr1_Mean < 5.21 ) { 
	if( Attr8_Max < -5.32 ) { 
		if( Attr7_Max < 30.07 ) { return new Prediction("smoking", 27, 7); }
		if( Attr7_Max >= 30.07 ) { return new Prediction("NULL", 10, 0); }
	}
	if( Attr8_Max >= -5.32 ) { 
		if( Attr9_Mean >= 19.98 ) { return new Prediction("NULL", 49, 1); }
		if( Attr9_Mean < 19.98 ) { return new Prediction("NULL", 852, 183); }
	}
	}
	if( Attr1_Mean >= 5.21 ) { 
	if( Attr9_Mean < -11.21 ) { 
		if( Attr1_Max < 21.52 ) { return new Prediction("smoking", 37, 5); }
		if( Attr1_Max >= 21.52 ) { return new Prediction("NULL", 3, 0); }
	}
	if( Attr9_Mean >= -11.21 ) { 
		if( Attr9_Mean < -1.39 ) { return new Prediction("NULL", 18, 0); }
		if( Attr9_Mean >= -1.39 ) { return new Prediction("smoking", 31, 14); }
	}
	}
	}
	if( Attr2_Max < 9.47 ) { 
	if( Attr4_Min < -5.41 ) { 
	if( Attr3_Min >= -1.73 ) { 
		if( Attr7_Min >= -26.37 ) { return new Prediction("smoking", 50, 23); }
		if( Attr7_Min < -26.37 ) { return new Prediction("smoking", 71, 3); }
	}
	if( Attr3_Min < -1.73 ) { 
		if( Attr3_Max >= 13.31 ) { return new Prediction("NULL", 410, 94); }
		if( Attr3_Max < 13.31 ) { return new Prediction("NULL", 831, 378); }
	}
	}
	if( Attr4_Min >= -5.41 ) { 
	if( Attr6_Min >= -2.35 ) { 
		if( Attr2_Max >= 5.04 ) { return new Prediction("smoking", 253, 119); }
		if( Attr2_Max < 5.04 ) { return new Prediction("NULL", 924, 267); }
	}
	if( Attr6_Min < -2.35 ) { 
		if( Attr2_Max >= 2.12 ) { return new Prediction("smoking", 1060, 357); }
		if( Attr2_Max < 2.12 ) { return new Prediction("smoking", 1545, 262); }
	}
	}
	}
	}
	if( Attr1_Min >= -6.82 ) { 
	if( Attr6_Max < 1.71 ) { 
	if( Attr6_Mean >= -0.01 ) { 
	if( Attr9_Min >= -19.26 ) { 
		if( Attr6_Min >= -0.63 ) { return new Prediction("NULL", 182, 1); }
		if( Attr6_Min < -0.63 ) { return new Prediction("NULL", 263, 22); }
	}
	if( Attr9_Min < -19.26 ) { 
		if( Attr2_Min < -8.52 ) { return new Prediction("NULL", 474, 96); }
		if( Attr2_Min >= -8.52 ) { return new Prediction("NULL", 176, 10); }
	}
	}
	if( Attr6_Mean < -0.01 ) { 
	if( Attr2_Max >= 2.82 ) { 
		if( Attr3_Max >= 2.13 ) { return new Prediction("NULL", 138, 6); }
		if( Attr3_Max < 2.13 ) { return new Prediction("NULL", 7, 2); }
	}
	if( Attr2_Max < 2.82 ) { 
		if( Attr4_Max >= 3.07 ) { return new Prediction("NULL", 191, 29); }
		if( Attr4_Max < 3.07 ) { return new Prediction("NULL", 265, 96); }
	}
	}
	}
	if( Attr6_Max >= 1.71 ) { 
	if( Attr4_Max >= 3.9 ) { 
	if( Attr2_Min < -19.54 ) { 
		if( Attr4_Min >= -4.25 ) { return new Prediction("NULL", 6, 2); }
		if( Attr4_Min < -4.25 ) { return new Prediction("NULL", 106, 4); }
	}
	if( Attr2_Min >= -19.54 ) { 
		if( Attr7_Min >= -37.39 ) { return new Prediction("NULL", 659, 111); }
		if( Attr7_Min < -37.39 ) { return new Prediction("NULL", 422, 116); }
	}
	}
	if( Attr4_Max < 3.9 ) { 
	if( Attr3_Min < -5.79 ) { 
		if( Attr6_Max < 4.98 ) { return new Prediction("NULL", 287, 47); }
		if( Attr6_Max >= 4.98 ) { return new Prediction("smoking", 17, 7); }
	}
	if( Attr3_Min >= -5.79 ) { 
		if( Attr1_Max < 4.18 ) { return new Prediction("NULL", 88, 11); }
		if( Attr1_Max >= 4.18 ) { return new Prediction("NULL", 605, 246); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree89() {
	if( Attr3_Mean >= 8.08 ) { 
	if( Attr4_Min >= -0.68 ) { 
		if( Attr3_Mean >= 8.85 ) { return new Prediction("NULL", 1279, 0); }
	if( Attr3_Mean < 8.85 ) { 
		if( Attr8_Min < 8.79 ) { return new Prediction("NULL", 206, 0); }
	if( Attr8_Min >= 8.79 ) { 
	if( Attr8_Mean >= 21.14 ) { 
		if( Attr1_Mean >= 1.3 ) { return new Prediction("smoking", 1, 0); }
		if( Attr1_Mean < 1.3 ) { return new Prediction("NULL", 59, 0); }
	}
	if( Attr8_Mean < 21.14 ) { 
		if( Attr7_Min >= -45.34 ) { return new Prediction("smoking", 5, 0); }
		if( Attr7_Min < -45.34 ) { return new Prediction("NULL", 2, 0); }
	}
	}
	}
	}
	if( Attr4_Min < -0.68 ) { 
	if( Attr4_Max >= 2.26 ) { 
		if( Attr5_Min < -3.45 ) { return new Prediction("NULL", 44, 0); }
	if( Attr5_Min >= -3.45 ) { 
	if( Attr1_Mean >= -0.34 ) { 
		if( Attr9_Mean < -47.65 ) { return new Prediction("smoking", 7, 2); }
		if( Attr9_Mean >= -47.65 ) { return new Prediction("NULL", 66, 3); }
	}
	if( Attr1_Mean < -0.34 ) { 
		if( Attr3_Mean >= 8.16 ) { return new Prediction("smoking", 75, 31); }
		if( Attr3_Mean < 8.16 ) { return new Prediction("NULL", 8, 0); }
	}
	}
	}
	if( Attr4_Max < 2.26 ) { 
	if( Attr5_Mean < -0.03 ) { 
		if( Attr5_Min < -2.68 ) { return new Prediction("NULL", 9, 0); }
		if( Attr5_Min >= -2.68 ) { return new Prediction("smoking", 6, 0); }
	}
	if( Attr5_Mean >= -0.03 ) { 
	if( Attr2_Max < -2.65 ) { 
		if( Attr5_Mean < 0.01 ) { return new Prediction("NULL", 13, 1); }
		if( Attr5_Mean >= 0.01 ) { return new Prediction("smoking", 3, 0); }
	}
	if( Attr2_Max >= -2.65 ) { 
		if( Attr7_Mean >= 41.89 ) { return new Prediction("smoking", 6, 3); }
		if( Attr7_Mean < 41.89 ) { return new Prediction("NULL", 297, 11); }
	}
	}
	}
	}
	}
	if( Attr3_Mean < 8.08 ) { 
	if( Attr4_Max >= 1.24 ) { 
	if( Attr7_Min < -37.55 ) { 
	if( Attr3_Max < 11.25 ) { 
	if( Attr6_Min < -2.63 ) { 
		if( Attr7_Max >= 23.5 ) { return new Prediction("smoking", 1101, 198); }
		if( Attr7_Max < 23.5 ) { return new Prediction("smoking", 433, 197); }
	}
	if( Attr6_Min >= -2.63 ) { 
		if( Attr1_Min >= -6.67 ) { return new Prediction("NULL", 598, 151); }
		if( Attr1_Min < -6.67 ) { return new Prediction("smoking", 255, 88); }
	}
	}
	if( Attr3_Max >= 11.25 ) { 
	if( Attr6_Max < 2.16 ) { 
		if( Attr2_Mean < -6.62 ) { return new Prediction("smoking", 28, 14); }
		if( Attr2_Mean >= -6.62 ) { return new Prediction("NULL", 148, 18); }
	}
	if( Attr6_Max >= 2.16 ) { 
		if( Attr3_Min < -10.35 ) { return new Prediction("NULL", 388, 101); }
		if( Attr3_Min >= -10.35 ) { return new Prediction("NULL", 480, 225); }
	}
	}
	}
	if( Attr7_Min >= -37.55 ) { 
	if( Attr1_Min < -6.06 ) { 
	if( Attr3_Max < 13.34 ) { 
		if( Attr6_Mean < -0.14 ) { return new Prediction("NULL", 157, 12); }
		if( Attr6_Mean >= -0.14 ) { return new Prediction("smoking", 2928, 1461); }
	}
	if( Attr3_Max >= 13.34 ) { 
		if( Attr5_Max >= 2.45 ) { return new Prediction("NULL", 697, 122); }
		if( Attr5_Max < 2.45 ) { return new Prediction("NULL", 299, 92); }
	}
	}
	if( Attr1_Min >= -6.06 ) { 
	if( Attr1_Max < 5.06 ) { 
		if( Attr5_Max < 2.25 ) { return new Prediction("NULL", 438, 35); }
		if( Attr5_Max >= 2.25 ) { return new Prediction("NULL", 44, 15); }
	}
	if( Attr1_Max >= 5.06 ) { 
		if( Attr1_Min < 0.75 ) { return new Prediction("NULL", 1235, 337); }
		if( Attr1_Min >= 0.75 ) { return new Prediction("NULL", 655, 69); }
	}
	}
	}
	}
	if( Attr4_Max < 1.24 ) { 
	if( Attr3_Mean < -2.32 ) { 
	if( Attr6_Min < -2.01 ) { 
		if( Attr1_Mean >= -1.59 ) { return new Prediction("smoking", 9, 0); }
		if( Attr1_Mean < -1.59 ) { return new Prediction("NULL", 2, 0); }
	}
	if( Attr6_Min >= -2.01 ) { 
	if( Attr2_Min >= -8.44 ) { 
		if( Attr6_Max < 0.34 ) { return new Prediction("NULL", 533, 7); }
		if( Attr6_Max >= 0.34 ) { return new Prediction("NULL", 56, 7); }
	}
	if( Attr2_Min < -8.44 ) { 
		if( Attr9_Max >= 0.1 ) { return new Prediction("NULL", 385, 38); }
		if( Attr9_Max < 0.1 ) { return new Prediction("NULL", 73, 0); }
	}
	}
	}
	if( Attr3_Mean >= -2.32 ) { 
	if( Attr2_Min >= -11.06 ) { 
	if( Attr8_Max < -3.52 ) { 
		if( Attr9_Max >= -30.62 ) { return new Prediction("NULL", 298, 5); }
		if( Attr9_Max < -30.62 ) { return new Prediction("NULL", 30, 4); }
	}
	if( Attr8_Max >= -3.52 ) { 
		if( Attr6_Max < 0.53 ) { return new Prediction("NULL", 1974, 222); }
		if( Attr6_Max >= 0.53 ) { return new Prediction("NULL", 238, 70); }
	}
	}
	if( Attr2_Min < -11.06 ) { 
	if( Attr1_Mean < 5.11 ) { 
		if( Attr3_Max >= 6.45 ) { return new Prediction("NULL", 121, 24); }
		if( Attr3_Max < 6.45 ) { return new Prediction("NULL", 140, 68); }
	}
	if( Attr1_Mean >= 5.11 ) { 
		if( Attr3_Max >= 7 ) { return new Prediction("NULL", 13, 2); }
		if( Attr3_Max < 7 ) { return new Prediction("smoking", 36, 3); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree90() {
	if( Attr3_Min < 3.52 ) { 
	if( Attr1_Min >= -6.65 ) { 
	if( Attr2_Max >= -4.14 ) { 
	if( Attr6_Max < 1.19 ) { 
	if( Attr2_Mean < -1.44 ) { 
		if( Attr3_Min < -3.73 ) { return new Prediction("NULL", 475, 48); }
		if( Attr3_Min >= -3.73 ) { return new Prediction("NULL", 681, 160); }
	}
	if( Attr2_Mean >= -1.44 ) { 
		if( Attr1_Min < 0.99 ) { return new Prediction("NULL", 96, 19); }
		if( Attr1_Min >= 0.99 ) { return new Prediction("NULL", 405, 10); }
	}
	}
	if( Attr6_Max >= 1.19 ) { 
	if( Attr4_Min >= -4.8 ) { 
		if( Attr9_Min >= -13.63 ) { return new Prediction("NULL", 317, 53); }
		if( Attr9_Min < -13.63 ) { return new Prediction("NULL", 1315, 430); }
	}
	if( Attr4_Min < -4.8 ) { 
		if( Attr5_Min < -4.03 ) { return new Prediction("NULL", 152, 46); }
		if( Attr5_Min >= -4.03 ) { return new Prediction("NULL", 901, 143); }
	}
	}
	}
	if( Attr2_Max < -4.14 ) { 
	if( Attr9_Max < -43.22 ) { 
		if( Attr9_Min < -83.01 ) { return new Prediction("NULL", 17, 0); }
	if( Attr9_Min >= -83.01 ) { 
		if( Attr1_Min >= 7.27 ) { return new Prediction("NULL", 4, 0); }
		if( Attr1_Min < 7.27 ) { return new Prediction("smoking", 28, 3); }
	}
	}
	if( Attr9_Max >= -43.22 ) { 
	if( Attr3_Min >= -3.32 ) { 
		if( Attr1_Mean < 8.17 ) { return new Prediction("NULL", 949, 72); }
		if( Attr1_Mean >= 8.17 ) { return new Prediction("NULL", 79, 24); }
	}
	if( Attr3_Min < -3.32 ) { 
		if( Attr2_Min < -8.98 ) { return new Prediction("NULL", 483, 21); }
		if( Attr2_Min >= -8.98 ) { return new Prediction("NULL", 397, 4); }
	}
	}
	}
	}
	if( Attr1_Min < -6.65 ) { 
	if( Attr4_Max < 5.79 ) { 
	if( Attr4_Min < -1.7 ) { 
	if( Attr1_Max >= 7.18 ) { 
		if( Attr2_Max >= 5.14 ) { return new Prediction("NULL", 539, 237); }
		if( Attr2_Max < 5.14 ) { return new Prediction("smoking", 1856, 371); }
	}
	if( Attr1_Max < 7.18 ) { 
		if( Attr7_Mean >= 32.94 ) { return new Prediction("NULL", 216, 33); }
		if( Attr7_Mean < 32.94 ) { return new Prediction("smoking", 1465, 712); }
	}
	}
	if( Attr4_Min >= -1.7 ) { 
	if( Attr7_Min < 12.08 ) { 
		if( Attr5_Min >= -1.63 ) { return new Prediction("NULL", 329, 102); }
		if( Attr5_Min < -1.63 ) { return new Prediction("smoking", 92, 30); }
	}
	if( Attr7_Min >= 12.08 ) { 
		if( Attr7_Max >= 39.16 ) { return new Prediction("NULL", 147, 37); }
		if( Attr7_Max < 39.16 ) { return new Prediction("NULL", 198, 18); }
	}
	}
	}
	if( Attr4_Max >= 5.79 ) { 
	if( Attr4_Min < -5.32 ) { 
	if( Attr5_Max >= 2.35 ) { 
		if( Attr4_Min < -15.35 ) { return new Prediction("NULL", 103, 44); }
		if( Attr4_Min >= -15.35 ) { return new Prediction("NULL", 1028, 239); }
	}
	if( Attr5_Max < 2.35 ) { 
		if( Attr3_Min >= -4.46 ) { return new Prediction("smoking", 44, 9); }
		if( Attr3_Min < -4.46 ) { return new Prediction("NULL", 178, 69); }
	}
	}
	if( Attr4_Min >= -5.32 ) { 
	if( Attr2_Max < 10.93 ) { 
		if( Attr7_Min < -43.16 ) { return new Prediction("smoking", 101, 17); }
		if( Attr7_Min >= -43.16 ) { return new Prediction("NULL", 334, 151); }
	}
	if( Attr2_Max >= 10.93 ) { 
		if( Attr5_Max < 3.7 ) { return new Prediction("NULL", 47, 12); }
		if( Attr5_Max >= 3.7 ) { return new Prediction("NULL", 26, 0); }
	}
	}
	}
	}
	}
	if( Attr3_Min >= 3.52 ) { 
	if( Attr3_Mean < 9.4 ) { 
	if( Attr4_Min >= -1.1 ) { 
	if( Attr2_Mean < -8.88 ) { 
		if( Attr3_Min >= 5.57 ) { return new Prediction("NULL", 3, 0); }
		if( Attr3_Min < 5.57 ) { return new Prediction("smoking", 6, 0); }
	}
	if( Attr2_Mean >= -8.88 ) { 
	if( Attr6_Max < 0.36 ) { 
		if( Attr8_Min < -6.21 ) { return new Prediction("NULL", 366, 1); }
		if( Attr8_Min >= -6.21 ) { return new Prediction("NULL", 708, 34); }
	}
	if( Attr6_Max >= 0.36 ) { 
		if( Attr7_Mean < 14.89 ) { return new Prediction("NULL", 136, 22); }
		if( Attr7_Mean >= 14.89 ) { return new Prediction("NULL", 50, 0); }
	}
	}
	}
	if( Attr4_Min < -1.1 ) { 
	if( Attr7_Mean < 22.06 ) { 
	if( Attr1_Min >= -4.82 ) { 
		if( Attr1_Mean >= 3.47 ) { return new Prediction("smoking", 24, 9); }
		if( Attr1_Mean < 3.47 ) { return new Prediction("NULL", 267, 31); }
	}
	if( Attr1_Min < -4.82 ) { 
		if( Attr2_Max >= 3.23 ) { return new Prediction("NULL", 30, 11); }
		if( Attr2_Max < 3.23 ) { return new Prediction("smoking", 36, 7); }
	}
	}
	if( Attr7_Mean >= 22.06 ) { 
	if( Attr6_Mean < -0.05 ) { 
		if( Attr1_Mean < -4.83 ) { return new Prediction("smoking", 1, 0); }
		if( Attr1_Mean >= -4.83 ) { return new Prediction("NULL", 2, 0); }
	}
		if( Attr6_Mean >= -0.05 ) { return new Prediction("NULL", 45, 0); }
	}
	}
	}
		if( Attr3_Mean >= 9.4 ) { return new Prediction("NULL", 1202, 0); }
	}
return null;
}
private Prediction runTree91() {
	if( Attr6_Max >= 1.63 ) { 
	if( Attr3_Max < 11.17 ) { 
	if( Attr7_Min >= -37.41 ) { 
	if( Attr6_Min < -2.75 ) { 
	if( Attr1_Min >= -6.71 ) { 
		if( Attr1_Mean >= 4.67 ) { return new Prediction("NULL", 139, 16); }
		if( Attr1_Mean < 4.67 ) { return new Prediction("NULL", 171, 51); }
	}
	if( Attr1_Min < -6.71 ) { 
		if( Attr5_Max < 0.92 ) { return new Prediction("smoking", 112, 6); }
		if( Attr5_Max >= 0.92 ) { return new Prediction("smoking", 1038, 313); }
	}
	}
	if( Attr6_Min >= -2.75 ) { 
	if( Attr1_Max >= 11.98 ) { 
		if( Attr2_Min < -18.49 ) { return new Prediction("NULL", 37, 0); }
		if( Attr2_Min >= -18.49 ) { return new Prediction("NULL", 193, 23); }
	}
	if( Attr1_Max < 11.98 ) { 
		if( Attr6_Mean >= -0.08 ) { return new Prediction("NULL", 1088, 395); }
		if( Attr6_Mean < -0.08 ) { return new Prediction("NULL", 39, 1); }
	}
	}
	}
	if( Attr7_Min < -37.41 ) { 
	if( Attr1_Min >= -6.65 ) { 
	if( Attr8_Min < -34.03 ) { 
		if( Attr2_Max >= 0.22 ) { return new Prediction("NULL", 50, 0); }
		if( Attr2_Max < 0.22 ) { return new Prediction("NULL", 9, 2); }
	}
	if( Attr8_Min >= -34.03 ) { 
		if( Attr4_Max >= 5.55 ) { return new Prediction("NULL", 149, 25); }
		if( Attr4_Max < 5.55 ) { return new Prediction("NULL", 424, 157); }
	}
	}
	if( Attr1_Min < -6.65 ) { 
	if( Attr2_Min >= -15.01 ) { 
		if( Attr6_Min < -2.9 ) { return new Prediction("smoking", 787, 67); }
		if( Attr6_Min >= -2.9 ) { return new Prediction("smoking", 231, 56); }
	}
	if( Attr2_Min < -15.01 ) { 
		if( Attr3_Min < -8.6 ) { return new Prediction("smoking", 185, 89); }
		if( Attr3_Min >= -8.6 ) { return new Prediction("smoking", 238, 46); }
	}
	}
	}
	}
	if( Attr3_Max >= 11.17 ) { 
	if( Attr3_Min >= -6 ) { 
	if( Attr1_Min < -6.47 ) { 
	if( Attr5_Max >= 2.35 ) { 
		if( Attr4_Mean >= 0.06 ) { return new Prediction("smoking", 61, 21); }
		if( Attr4_Mean < 0.06 ) { return new Prediction("NULL", 268, 84); }
	}
	if( Attr5_Max < 2.35 ) { 
		if( Attr2_Mean < -1.24 ) { return new Prediction("smoking", 294, 135); }
		if( Attr2_Mean >= -1.24 ) { return new Prediction("smoking", 72, 12); }
	}
	}
	if( Attr1_Min >= -6.47 ) { 
		if( Attr4_Mean < -0.07 ) { return new Prediction("NULL", 27, 0); }
	if( Attr4_Mean >= -0.07 ) { 
		if( Attr1_Mean >= 0.46 ) { return new Prediction("NULL", 235, 86); }
		if( Attr1_Mean < 0.46 ) { return new Prediction("NULL", 128, 10); }
	}
	}
	}
	if( Attr3_Min < -6 ) { 
	if( Attr3_Mean < 7.23 ) { 
	if( Attr9_Max < 5.29 ) { 
		if( Attr8_Min >= -36.14 ) { return new Prediction("NULL", 244, 100); }
		if( Attr8_Min < -36.14 ) { return new Prediction("NULL", 20, 0); }
	}
	if( Attr9_Max >= 5.29 ) { 
		if( Attr2_Min < -19.79 ) { return new Prediction("NULL", 279, 33); }
		if( Attr2_Min >= -19.79 ) { return new Prediction("NULL", 1123, 295); }
	}
	}
	if( Attr3_Mean >= 7.23 ) { 
		if( Attr1_Min >= -19.54 ) { return new Prediction("NULL", 39, 0); }
	if( Attr1_Min < -19.54 ) { 
		if( Attr2_Max < 12.07 ) { return new Prediction("smoking", 1, 0); }
		if( Attr2_Max >= 12.07 ) { return new Prediction("NULL", 7, 0); }
	}
	}
	}
	}
	}
	if( Attr6_Max < 1.63 ) { 
	if( Attr2_Min >= -1.6 ) { 
	if( Attr6_Max < 0.23 ) { 
		if( Attr2_Mean >= 9.58 ) { return new Prediction("smoking", 2, 0); }
	if( Attr2_Mean < 9.58 ) { 
	if( Attr8_Min >= 4.71 ) { 
		if( Attr6_Mean < 0 ) { return new Prediction("NULL", 263, 5); }
		if( Attr6_Mean >= 0 ) { return new Prediction("NULL", 172, 0); }
	}
	if( Attr8_Min < 4.71 ) { 
		if( Attr1_Max >= -9.64 ) { return new Prediction("NULL", 1172, 0); }
		if( Attr1_Max < -9.64 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	}
	if( Attr6_Max >= 0.23 ) { 
		if( Attr7_Max < -2.19 ) { return new Prediction("NULL", 45, 0); }
	if( Attr7_Max >= -2.19 ) { 
	if( Attr5_Mean >= 0.02 ) { 
		if( Attr1_Min >= -1.49 ) { return new Prediction("smoking", 7, 0); }
		if( Attr1_Min < -1.49 ) { return new Prediction("NULL", 2, 0); }
	}
	if( Attr5_Mean < 0.02 ) { 
		if( Attr6_Mean < 0 ) { return new Prediction("NULL", 52, 11); }
		if( Attr6_Mean >= 0 ) { return new Prediction("NULL", 22, 0); }
	}
	}
	}
	}
	if( Attr2_Min < -1.6 ) { 
	if( Attr3_Min < 3.7 ) { 
	if( Attr6_Max >= 0.26 ) { 
	if( Attr3_Max < 3.09 ) { 
		if( Attr9_Max < 13.18 ) { return new Prediction("NULL", 281, 58); }
		if( Attr9_Max >= 13.18 ) { return new Prediction("NULL", 524, 48); }
	}
	if( Attr3_Max >= 3.09 ) { 
		if( Attr2_Min < -10.65 ) { return new Prediction("NULL", 1424, 291); }
		if( Attr2_Min >= -10.65 ) { return new Prediction("NULL", 883, 272); }
	}
	}
	if( Attr6_Max < 0.26 ) { 
	if( Attr2_Max >= -4.76 ) { 
		if( Attr6_Max >= -0 ) { return new Prediction("NULL", 638, 126); }
		if( Attr6_Max < -0 ) { return new Prediction("NULL", 58, 0); }
	}
	if( Attr2_Max < -4.76 ) { 
		if( Attr3_Mean >= 2.24 ) { return new Prediction("NULL", 269, 46); }
		if( Attr3_Mean < 2.24 ) { return new Prediction("NULL", 989, 55); }
	}
	}
	}
	if( Attr3_Min >= 3.7 ) { 
	if( Attr5_Min >= -1.05 ) { 
	if( Attr7_Min >= 7.14 ) { 
		if( Attr1_Mean < -3.33 ) { return new Prediction("NULL", 32, 3); }
		if( Attr1_Mean >= -3.33 ) { return new Prediction("NULL", 263, 1); }
	}
	if( Attr7_Min < 7.14 ) { 
		if( Attr9_Mean < -12 ) { return new Prediction("NULL", 737, 60); }
		if( Attr9_Mean >= -12 ) { return new Prediction("NULL", 279, 4); }
	}
	}
	if( Attr5_Min < -1.05 ) { 
	if( Attr1_Mean < 1.29 ) { 
		if( Attr6_Mean >= 0.01 ) { return new Prediction("NULL", 16, 0); }
		if( Attr6_Mean < 0.01 ) { return new Prediction("NULL", 37, 17); }
	}
		if( Attr1_Mean >= 1.29 ) { return new Prediction("NULL", 22, 0); }
	}
	}
	}
	}
return null;
}
private Prediction runTree92() {
	if( Attr1_Min < -6.53 ) { 
	if( Attr3_Max < 13.5 ) { 
	if( Attr6_Mean < -0.16 ) { 
		if( Attr9_Max >= 30.35 ) { return new Prediction("NULL", 55, 0); }
	if( Attr9_Max < 30.35 ) { 
	if( Attr6_Max >= 1.25 ) { 
		if( Attr4_Min >= -2.62 ) { return new Prediction("smoking", 6, 0); }
		if( Attr4_Min < -2.62 ) { return new Prediction("NULL", 40, 12); }
	}
		if( Attr6_Max < 1.25 ) { return new Prediction("NULL", 46, 0); }
	}
	}
	if( Attr6_Mean >= -0.16 ) { 
	if( Attr3_Min < -9.59 ) { 
	if( Attr7_Min >= -43.91 ) { 
		if( Attr9_Max >= 40.56 ) { return new Prediction("NULL", 262, 129); }
		if( Attr9_Max < 40.56 ) { return new Prediction("NULL", 478, 144); }
	}
	if( Attr7_Min < -43.91 ) { 
		if( Attr2_Min >= -14.43 ) { return new Prediction("smoking", 83, 19); }
		if( Attr2_Min < -14.43 ) { return new Prediction("NULL", 167, 82); }
	}
	}
	if( Attr3_Min >= -9.59 ) { 
	if( Attr1_Max >= -2.17 ) { 
		if( Attr3_Max >= 8.93 ) { return new Prediction("smoking", 1493, 618); }
		if( Attr3_Max < 8.93 ) { return new Prediction("smoking", 2018, 478); }
	}
	if( Attr1_Max < -2.17 ) { 
		if( Attr7_Mean < 16.42 ) { return new Prediction("NULL", 229, 96); }
		if( Attr7_Mean >= 16.42 ) { return new Prediction("NULL", 595, 98); }
	}
	}
	}
	}
	if( Attr3_Max >= 13.5 ) { 
	if( Attr1_Mean < 5.21 ) { 
	if( Attr5_Min < -4.77 ) { 
	if( Attr4_Max >= 17.08 ) { 
		if( Attr3_Min < -19.5 ) { return new Prediction("NULL", 9, 0); }
		if( Attr3_Min >= -19.5 ) { return new Prediction("smoking", 8, 1); }
	}
	if( Attr4_Max < 17.08 ) { 
		if( Attr5_Max >= 5.38 ) { return new Prediction("NULL", 169, 5); }
		if( Attr5_Max < 5.38 ) { return new Prediction("NULL", 169, 29); }
	}
	}
	if( Attr5_Min >= -4.77 ) { 
	if( Attr5_Mean < 0.01 ) { 
		if( Attr4_Max >= 3.68 ) { return new Prediction("NULL", 455, 117); }
		if( Attr4_Max < 3.68 ) { return new Prediction("NULL", 98, 10); }
	}
	if( Attr5_Mean >= 0.01 ) { 
		if( Attr1_Min < -7.1 ) { return new Prediction("NULL", 390, 124); }
		if( Attr1_Min >= -7.1 ) { return new Prediction("smoking", 9, 0); }
	}
	}
	}
	if( Attr1_Mean >= 5.21 ) { 
	if( Attr9_Min < -2.76 ) { 
	if( Attr3_Max < 17.46 ) { 
		if( Attr7_Max < 29.74 ) { return new Prediction("NULL", 30, 2); }
		if( Attr7_Max >= 29.74 ) { return new Prediction("smoking", 16, 7); }
	}
	if( Attr3_Max >= 17.46 ) { 
		if( Attr6_Mean < 0.08 ) { return new Prediction("smoking", 48, 21); }
		if( Attr6_Mean >= 0.08 ) { return new Prediction("smoking", 12, 0); }
	}
	}
		if( Attr9_Min >= -2.76 ) { return new Prediction("NULL", 10, 0); }
	}
	}
	}
	if( Attr1_Min >= -6.53 ) { 
	if( Attr3_Min < 7.37 ) { 
	if( Attr2_Max < -4.73 ) { 
	if( Attr6_Max < 1.24 ) { 
		if( Attr7_Mean < -74 ) { return new Prediction("smoking", 13, 0); }
	if( Attr7_Mean >= -74 ) { 
		if( Attr6_Mean >= 0.01 ) { return new Prediction("NULL", 150, 0); }
		if( Attr6_Mean < 0.01 ) { return new Prediction("NULL", 1906, 122); }
	}
	}
	if( Attr6_Max >= 1.24 ) { 
	if( Attr6_Min < -1.28 ) { 
		if( Attr3_Min < 2.74 ) { return new Prediction("NULL", 52, 4); }
		if( Attr3_Min >= 2.74 ) { return new Prediction("smoking", 2, 0); }
	}
	if( Attr6_Min >= -1.28 ) { 
		if( Attr8_Mean < 13.84 ) { return new Prediction("NULL", 10, 0); }
		if( Attr8_Mean >= 13.84 ) { return new Prediction("smoking", 52, 22); }
	}
	}
	}
	if( Attr2_Max >= -4.73 ) { 
	if( Attr1_Max < 7.44 ) { 
	if( Attr7_Min >= -27.92 ) { 
		if( Attr1_Mean >= -3.29 ) { return new Prediction("NULL", 1091, 91); }
		if( Attr1_Mean < -3.29 ) { return new Prediction("NULL", 49, 16); }
	}
	if( Attr7_Min < -27.92 ) { 
		if( Attr8_Mean < 27.35 ) { return new Prediction("NULL", 307, 46); }
		if( Attr8_Mean >= 27.35 ) { return new Prediction("smoking", 62, 31); }
	}
	}
	if( Attr1_Max >= 7.44 ) { 
	if( Attr5_Min < -0.22 ) { 
		if( Attr9_Max >= 13.62 ) { return new Prediction("NULL", 1685, 316); }
		if( Attr9_Max < 13.62 ) { return new Prediction("NULL", 1399, 422); }
	}
	if( Attr5_Min >= -0.22 ) { 
		if( Attr4_Max < 0 ) { return new Prediction("NULL", 77, 26); }
		if( Attr4_Max >= 0 ) { return new Prediction("NULL", 428, 26); }
	}
	}
	}
	}
	if( Attr3_Min >= 7.37 ) { 
	if( Attr3_Max >= 9.19 ) { 
	if( Attr3_Max >= 10.28 ) { 
	if( Attr6_Mean >= 0.01 ) { 
		if( Attr6_Max < 0.73 ) { return new Prediction("smoking", 2, 0); }
		if( Attr6_Max >= 0.73 ) { return new Prediction("NULL", 17, 0); }
	}
		if( Attr6_Mean < 0.01 ) { return new Prediction("NULL", 141, 0); }
	}
		if( Attr3_Max < 10.28 ) { return new Prediction("NULL", 1241, 0); }
	}
	if( Attr3_Max < 9.19 ) { 
	if( Attr3_Max < 9.13 ) { 
	if( Attr7_Max < 8.59 ) { 
		if( Attr4_Mean >= -0 ) { return new Prediction("NULL", 56, 0); }
		if( Attr4_Mean < -0 ) { return new Prediction("NULL", 39, 5); }
	}
		if( Attr7_Max >= 8.59 ) { return new Prediction("NULL", 172, 0); }
	}
	if( Attr3_Max >= 9.13 ) { 
		if( Attr2_Min < -4.02 ) { return new Prediction("NULL", 13, 0); }
	if( Attr2_Min >= -4.02 ) { 
		if( Attr3_Mean >= 8.84 ) { return new Prediction("NULL", 9, 0); }
		if( Attr3_Mean < 8.84 ) { return new Prediction("smoking", 10, 1); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree93() {
	if( Attr6_Max >= 1.48 ) { 
	if( Attr1_Mean >= 0.13 ) { 
	if( Attr6_Max < 3.79 ) { 
	if( Attr1_Min >= -6.8 ) { 
	if( Attr2_Max >= 3.76 ) { 
		if( Attr7_Mean < -22.48 ) { return new Prediction("NULL", 193, 11); }
		if( Attr7_Mean >= -22.48 ) { return new Prediction("NULL", 387, 74); }
	}
	if( Attr2_Max < 3.76 ) { 
		if( Attr7_Min < -31.54 ) { return new Prediction("NULL", 750, 259); }
		if( Attr7_Min >= -31.54 ) { return new Prediction("NULL", 615, 125); }
	}
	}
	if( Attr1_Min < -6.8 ) { 
	if( Attr8_Min >= -28.08 ) { 
		if( Attr3_Min < -9.58 ) { return new Prediction("NULL", 256, 74); }
		if( Attr3_Min >= -9.58 ) { return new Prediction("smoking", 493, 172); }
	}
	if( Attr8_Min < -28.08 ) { 
		if( Attr3_Min >= -16.21 ) { return new Prediction("NULL", 128, 33); }
		if( Attr3_Min < -16.21 ) { return new Prediction("NULL", 16, 0); }
	}
	}
	}
	if( Attr6_Max >= 3.79 ) { 
	if( Attr2_Min < -18.6 ) { 
	if( Attr1_Min < -2.21 ) { 
		if( Attr7_Max < 16.66 ) { return new Prediction("NULL", 106, 19); }
		if( Attr7_Max >= 16.66 ) { return new Prediction("NULL", 279, 100); }
	}
		if( Attr1_Min >= -2.21 ) { return new Prediction("NULL", 32, 0); }
	}
	if( Attr2_Min >= -18.6 ) { 
	if( Attr5_Max < 1.98 ) { 
		if( Attr3_Min < -5.48 ) { return new Prediction("smoking", 94, 46); }
		if( Attr3_Min >= -5.48 ) { return new Prediction("smoking", 258, 40); }
	}
	if( Attr5_Max >= 1.98 ) { 
		if( Attr1_Max < 19.51 ) { return new Prediction("NULL", 500, 216); }
		if( Attr1_Max >= 19.51 ) { return new Prediction("smoking", 109, 28); }
	}
	}
	}
	}
	if( Attr1_Mean < 0.13 ) { 
	if( Attr4_Max >= 4.1 ) { 
	if( Attr2_Max >= 15.19 ) { 
	if( Attr8_Min >= -31.06 ) { 
		if( Attr4_Min < -23.84 ) { return new Prediction("smoking", 15, 5); }
		if( Attr4_Min >= -23.84 ) { return new Prediction("NULL", 126, 18); }
	}
		if( Attr8_Min < -31.06 ) { return new Prediction("NULL", 71, 0); }
	}
	if( Attr2_Max < 15.19 ) { 
	if( Attr4_Max >= 5.81 ) { 
		if( Attr5_Max >= 2.09 ) { return new Prediction("NULL", 690, 227); }
		if( Attr5_Max < 2.09 ) { return new Prediction("smoking", 215, 102); }
	}
	if( Attr4_Max < 5.81 ) { 
		if( Attr3_Min >= -3.12 ) { return new Prediction("smoking", 274, 85); }
		if( Attr3_Min < -3.12 ) { return new Prediction("NULL", 453, 188); }
	}
	}
	}
	if( Attr4_Max < 4.1 ) { 
	if( Attr3_Max >= 9.51 ) { 
	if( Attr5_Max < 1.29 ) { 
		if( Attr1_Max >= -0.62 ) { return new Prediction("NULL", 147, 22); }
		if( Attr1_Max < -0.62 ) { return new Prediction("smoking", 13, 3); }
	}
	if( Attr5_Max >= 1.29 ) { 
		if( Attr2_Min < -16.09 ) { return new Prediction("NULL", 122, 37); }
		if( Attr2_Min >= -16.09 ) { return new Prediction("smoking", 400, 166); }
	}
	}
	if( Attr3_Max < 9.51 ) { 
	if( Attr6_Min >= -2.21 ) { 
		if( Attr8_Mean >= -15.7 ) { return new Prediction("NULL", 273, 118); }
		if( Attr8_Mean < -15.7 ) { return new Prediction("NULL", 16, 0); }
	}
	if( Attr6_Min < -2.21 ) { 
		if( Attr1_Max < -0.11 ) { return new Prediction("NULL", 123, 60); }
		if( Attr1_Max >= -0.11 ) { return new Prediction("smoking", 978, 99); }
	}
	}
	}
	}
	}
	if( Attr6_Max < 1.48 ) { 
	if( Attr3_Min < 7.45 ) { 
	if( Attr6_Min >= -2.06 ) { 
	if( Attr8_Max >= -4.66 ) { 
	if( Attr1_Min < -8.01 ) { 
		if( Attr2_Mean >= 0.49 ) { return new Prediction("smoking", 77, 21); }
		if( Attr2_Mean < 0.49 ) { return new Prediction("NULL", 667, 112); }
	}
	if( Attr1_Min >= -8.01 ) { 
		if( Attr7_Max >= -75.3 ) { return new Prediction("NULL", 4264, 466); }
		if( Attr7_Max < -75.3 ) { return new Prediction("smoking", 26, 7); }
	}
	}
	if( Attr8_Max < -4.66 ) { 
		if( Attr7_Mean < -17.91 ) { return new Prediction("NULL", 163, 0); }
	if( Attr7_Mean >= -17.91 ) { 
		if( Attr9_Min < -85.49 ) { return new Prediction("NULL", 5, 2); }
		if( Attr9_Min >= -85.49 ) { return new Prediction("NULL", 351, 7); }
	}
	}
	}
	if( Attr6_Min < -2.06 ) { 
	if( Attr1_Min < -7.26 ) { 
	if( Attr2_Max < 1.04 ) { 
		if( Attr2_Min >= -19.25 ) { return new Prediction("smoking", 131, 37); }
		if( Attr2_Min < -19.25 ) { return new Prediction("NULL", 9, 0); }
	}
	if( Attr2_Max >= 1.04 ) { 
		if( Attr4_Min >= -7.72 ) { return new Prediction("NULL", 111, 49); }
		if( Attr4_Min < -7.72 ) { return new Prediction("NULL", 14, 0); }
	}
	}
	if( Attr1_Min >= -7.26 ) { 
	if( Attr7_Min >= -27.04 ) { 
		if( Attr9_Min < -17.86 ) { return new Prediction("NULL", 107, 4); }
		if( Attr9_Min >= -17.86 ) { return new Prediction("NULL", 25, 9); }
	}
	if( Attr7_Min < -27.04 ) { 
		if( Attr4_Mean < 0.03 ) { return new Prediction("NULL", 165, 61); }
		if( Attr4_Mean >= 0.03 ) { return new Prediction("NULL", 46, 3); }
	}
	}
	}
	}
	if( Attr3_Min >= 7.45 ) { 
		if( Attr3_Mean >= 8.94 ) { return new Prediction("NULL", 1264, 0); }
	if( Attr3_Mean < 8.94 ) { 
	if( Attr1_Max >= 0.29 ) { 
	if( Attr1_Min >= 0.28 ) { 
		if( Attr2_Min < -9.92 ) { return new Prediction("smoking", 1, 0); }
		if( Attr2_Min >= -9.92 ) { return new Prediction("NULL", 76, 1); }
	}
	if( Attr1_Min < 0.28 ) { 
		if( Attr2_Mean < -3.43 ) { return new Prediction("NULL", 37, 4); }
		if( Attr2_Mean >= -3.43 ) { return new Prediction("smoking", 9, 3); }
	}
	}
		if( Attr1_Max < 0.29 ) { return new Prediction("NULL", 198, 0); }
	}
	}
	}
return null;
}
private Prediction runTree94() {
	if( Attr5_Max < 0.56 ) { 
	if( Attr6_Min >= -2.21 ) { 
	if( Attr3_Mean < 8.86 ) { 
	if( Attr6_Max < 1.55 ) { 
		if( Attr5_Max < -0 ) { return new Prediction("NULL", 268, 0); }
	if( Attr5_Max >= -0 ) { 
		if( Attr4_Max >= -0 ) { return new Prediction("NULL", 3403, 274); }
		if( Attr4_Max < -0 ) { return new Prediction("NULL", 259, 61); }
	}
	}
	if( Attr6_Max >= 1.55 ) { 
	if( Attr6_Mean < 0.03 ) { 
		if( Attr1_Min < 3.11 ) { return new Prediction("NULL", 42, 1); }
		if( Attr1_Min >= 3.11 ) { return new Prediction("smoking", 10, 3); }
	}
	if( Attr6_Mean >= 0.03 ) { 
		if( Attr9_Mean < 23.5 ) { return new Prediction("NULL", 48, 22); }
		if( Attr9_Mean >= 23.5 ) { return new Prediction("smoking", 10, 0); }
	}
	}
	}
		if( Attr3_Mean >= 8.86 ) { return new Prediction("NULL", 1296, 0); }
	}
	if( Attr6_Min < -2.21 ) { 
	if( Attr7_Max < 25.75 ) { 
	if( Attr2_Min >= -13.05 ) { 
		if( Attr3_Max < 12.03 ) { return new Prediction("NULL", 38, 0); }
	if( Attr3_Max >= 12.03 ) { 
		if( Attr2_Min >= -6.24 ) { return new Prediction("NULL", 1, 0); }
		if( Attr2_Min < -6.24 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	if( Attr2_Min < -13.05 ) { 
		if( Attr6_Mean < -0.04 ) { return new Prediction("NULL", 5, 0); }
	if( Attr6_Mean >= -0.04 ) { 
		if( Attr3_Min >= -0.97 ) { return new Prediction("NULL", 2, 0); }
		if( Attr3_Min < -0.97 ) { return new Prediction("smoking", 6, 0); }
	}
	}
	}
	if( Attr7_Max >= 25.75 ) { 
		if( Attr8_Max < 31.43 ) { return new Prediction("NULL", 9, 0); }
	if( Attr8_Max >= 31.43 ) { 
	if( Attr6_Max < 0.28 ) { 
		if( Attr1_Min >= -11.62 ) { return new Prediction("smoking", 7, 0); }
		if( Attr1_Min < -11.62 ) { return new Prediction("NULL", 1, 0); }
	}
		if( Attr6_Max >= 0.28 ) { return new Prediction("smoking", 61, 0); }
	}
	}
	}
	}
	if( Attr5_Max >= 0.56 ) { 
	if( Attr1_Max >= 7.35 ) { 
	if( Attr3_Max < 13.48 ) { 
	if( Attr4_Max < 4.11 ) { 
	if( Attr1_Min >= -6.74 ) { 
		if( Attr7_Max < -1.02 ) { return new Prediction("NULL", 753, 146); }
		if( Attr7_Max >= -1.02 ) { return new Prediction("NULL", 754, 257); }
	}
	if( Attr1_Min < -6.74 ) { 
		if( Attr2_Max < 5.95 ) { return new Prediction("smoking", 1452, 204); }
		if( Attr2_Max >= 5.95 ) { return new Prediction("NULL", 112, 42); }
	}
	}
	if( Attr4_Max >= 4.11 ) { 
	if( Attr7_Max >= 18.58 ) { 
		if( Attr9_Min < -26.24 ) { return new Prediction("NULL", 964, 394); }
		if( Attr9_Min >= -26.24 ) { return new Prediction("smoking", 279, 110); }
	}
	if( Attr7_Max < 18.58 ) { 
		if( Attr4_Max >= 15.43 ) { return new Prediction("smoking", 10, 0); }
		if( Attr4_Max < 15.43 ) { return new Prediction("NULL", 945, 284); }
	}
	}
	}
	if( Attr3_Max >= 13.48 ) { 
	if( Attr5_Max >= 4.24 ) { 
	if( Attr3_Mean < 7.1 ) { 
		if( Attr1_Min >= -19.6 ) { return new Prediction("NULL", 338, 79); }
		if( Attr1_Min < -19.6 ) { return new Prediction("NULL", 115, 4); }
	}
		if( Attr3_Mean >= 7.1 ) { return new Prediction("NULL", 27, 0); }
	}
	if( Attr5_Max < 4.24 ) { 
	if( Attr2_Max < 19.87 ) { 
		if( Attr4_Max >= 3.97 ) { return new Prediction("NULL", 735, 192); }
		if( Attr4_Max < 3.97 ) { return new Prediction("NULL", 203, 86); }
	}
	if( Attr2_Max >= 19.87 ) { 
		if( Attr7_Max >= 54.14 ) { return new Prediction("smoking", 2, 0); }
		if( Attr7_Max < 54.14 ) { return new Prediction("NULL", 53, 0); }
	}
	}
	}
	}
	if( Attr1_Max < 7.35 ) { 
	if( Attr1_Min >= -6.8 ) { 
	if( Attr4_Min < -1.51 ) { 
	if( Attr7_Mean < 26.45 ) { 
		if( Attr5_Min >= -1.59 ) { return new Prediction("NULL", 488, 55); }
		if( Attr5_Min < -1.59 ) { return new Prediction("NULL", 308, 69); }
	}
	if( Attr7_Mean >= 26.45 ) { 
		if( Attr1_Mean >= -4.87 ) { return new Prediction("NULL", 56, 0); }
		if( Attr1_Mean < -4.87 ) { return new Prediction("smoking", 1, 0); }
	}
	}
	if( Attr4_Min >= -1.51 ) { 
	if( Attr6_Min >= -0.31 ) { 
		if( Attr9_Max < -22.41 ) { return new Prediction("smoking", 12, 4); }
		if( Attr9_Max >= -22.41 ) { return new Prediction("NULL", 59, 5); }
	}
	if( Attr6_Min < -0.31 ) { 
		if( Attr1_Mean < 2.44 ) { return new Prediction("NULL", 268, 7); }
		if( Attr1_Mean >= 2.44 ) { return new Prediction("NULL", 39, 8); }
	}
	}
	}
	if( Attr1_Min < -6.8 ) { 
	if( Attr3_Max >= 15.26 ) { 
		if( Attr8_Mean >= 207 ) { return new Prediction("smoking", 2, 0); }
	if( Attr8_Mean < 207 ) { 
		if( Attr7_Min < 4.06 ) { return new Prediction("NULL", 155, 18); }
		if( Attr7_Min >= 4.06 ) { return new Prediction("NULL", 42, 0); }
	}
	}
	if( Attr3_Max < 15.26 ) { 
	if( Attr5_Mean >= -0.07 ) { 
		if( Attr6_Max >= 1.97 ) { return new Prediction("smoking", 1184, 504); }
		if( Attr6_Max < 1.97 ) { return new Prediction("NULL", 888, 290); }
	}
	if( Attr5_Mean < -0.07 ) { 
		if( Attr5_Max >= 2.65 ) { return new Prediction("NULL", 43, 0); }
		if( Attr5_Max < 2.65 ) { return new Prediction("NULL", 124, 25); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree95() {
	if( Attr6_Min < -1.87 ) { 
	if( Attr4_Min < -5.33 ) { 
	if( Attr1_Min >= -2.89 ) { 
		if( Attr8_Max < -13.69 ) { return new Prediction("smoking", 3, 0); }
	if( Attr8_Max >= -13.69 ) { 
	if( Attr7_Max >= 39.16 ) { 
		if( Attr6_Mean < 0 ) { return new Prediction("smoking", 21, 8); }
		if( Attr6_Mean >= 0 ) { return new Prediction("NULL", 16, 0); }
	}
	if( Attr7_Max < 39.16 ) { 
		if( Attr7_Min >= -45.26 ) { return new Prediction("NULL", 261, 29); }
		if( Attr7_Min < -45.26 ) { return new Prediction("NULL", 39, 0); }
	}
	}
	}
	if( Attr1_Min < -2.89 ) { 
	if( Attr2_Min < -19.79 ) { 
	if( Attr6_Max < 7.9 ) { 
		if( Attr5_Max >= 4.57 ) { return new Prediction("NULL", 140, 13); }
		if( Attr5_Max < 4.57 ) { return new Prediction("NULL", 212, 51); }
	}
		if( Attr6_Max >= 7.9 ) { return new Prediction("NULL", 28, 0); }
	}
	if( Attr2_Min >= -19.79 ) { 
	if( Attr5_Max >= 6.53 ) { 
		if( Attr4_Mean >= -0.09 ) { return new Prediction("NULL", 111, 28); }
		if( Attr4_Mean < -0.09 ) { return new Prediction("NULL", 36, 0); }
	}
	if( Attr5_Max < 6.53 ) { 
		if( Attr3_Max >= 12.53 ) { return new Prediction("NULL", 872, 239); }
		if( Attr3_Max < 12.53 ) { return new Prediction("NULL", 995, 461); }
	}
	}
	}
	}
	if( Attr4_Min >= -5.33 ) { 
	if( Attr1_Min < -7.3 ) { 
	if( Attr4_Max < 3.23 ) { 
	if( Attr7_Max < 22.69 ) { 
		if( Attr9_Min >= -39.52 ) { return new Prediction("smoking", 201, 78); }
		if( Attr9_Min < -39.52 ) { return new Prediction("smoking", 83, 7); }
	}
	if( Attr7_Max >= 22.69 ) { 
		if( Attr2_Max >= 8.15 ) { return new Prediction("NULL", 32, 8); }
		if( Attr2_Max < 8.15 ) { return new Prediction("smoking", 1192, 148); }
	}
	}
	if( Attr4_Max >= 3.23 ) { 
	if( Attr2_Min < -15.16 ) { 
		if( Attr3_Max < 10.03 ) { return new Prediction("smoking", 248, 88); }
		if( Attr3_Max >= 10.03 ) { return new Prediction("NULL", 324, 89); }
	}
	if( Attr2_Min >= -15.16 ) { 
		if( Attr6_Min >= -4.65 ) { return new Prediction("smoking", 773, 298); }
		if( Attr6_Min < -4.65 ) { return new Prediction("smoking", 259, 42); }
	}
	}
	}
	if( Attr1_Min >= -7.3 ) { 
	if( Attr2_Max < 3.1 ) { 
	if( Attr2_Mean < -1.97 ) { 
		if( Attr2_Max < 2.98 ) { return new Prediction("NULL", 956, 312); }
		if( Attr2_Max >= 2.98 ) { return new Prediction("smoking", 16, 2); }
	}
	if( Attr2_Mean >= -1.97 ) { 
		if( Attr6_Max < 1.99 ) { return new Prediction("NULL", 13, 5); }
		if( Attr6_Max >= 1.99 ) { return new Prediction("smoking", 26, 4); }
	}
	}
	if( Attr2_Max >= 3.1 ) { 
	if( Attr9_Max >= -28.2 ) { 
		if( Attr1_Max >= 2.16 ) { return new Prediction("NULL", 418, 81); }
		if( Attr1_Max < 2.16 ) { return new Prediction("NULL", 14, 0); }
	}
	if( Attr9_Max < -28.2 ) { 
		if( Attr4_Max >= 5.59 ) { return new Prediction("NULL", 3, 0); }
		if( Attr4_Max < 5.59 ) { return new Prediction("smoking", 16, 3); }
	}
	}
	}
	}
	}
	if( Attr6_Min >= -1.87 ) { 
	if( Attr6_Min < -0.18 ) { 
	if( Attr1_Max < 7.05 ) { 
	if( Attr3_Mean >= 2.55 ) { 
	if( Attr6_Mean >= 0.01 ) { 
		if( Attr5_Mean >= 0 ) { return new Prediction("smoking", 122, 54); }
		if( Attr5_Mean < 0 ) { return new Prediction("NULL", 259, 57); }
	}
	if( Attr6_Mean < 0.01 ) { 
		if( Attr1_Mean >= -5.69 ) { return new Prediction("NULL", 1071, 110); }
		if( Attr1_Mean < -5.69 ) { return new Prediction("NULL", 139, 53); }
	}
	}
	if( Attr3_Mean < 2.55 ) { 
	if( Attr9_Max < -42.86 ) { 
		if( Attr4_Mean < 0 ) { return new Prediction("smoking", 6, 0); }
		if( Attr4_Mean >= 0 ) { return new Prediction("NULL", 3, 1); }
	}
	if( Attr9_Max >= -42.86 ) { 
		if( Attr1_Min >= 1 ) { return new Prediction("NULL", 206, 1); }
		if( Attr1_Min < 1 ) { return new Prediction("NULL", 1058, 103); }
	}
	}
	}
	if( Attr1_Max >= 7.05 ) { 
	if( Attr1_Min < -2.2 ) { 
	if( Attr1_Mean < -5.45 ) { 
		if( Attr7_Mean >= 41.8 ) { return new Prediction("NULL", 3, 0); }
		if( Attr7_Mean < 41.8 ) { return new Prediction("smoking", 30, 1); }
	}
	if( Attr1_Mean >= -5.45 ) { 
		if( Attr4_Mean >= -0.24 ) { return new Prediction("NULL", 522, 196); }
		if( Attr4_Mean < -0.24 ) { return new Prediction("NULL", 23, 0); }
	}
	}
	if( Attr1_Min >= -2.2 ) { 
	if( Attr7_Mean >= -19.33 ) { 
		if( Attr8_Max >= 12.31 ) { return new Prediction("NULL", 468, 139); }
		if( Attr8_Max < 12.31 ) { return new Prediction("NULL", 60, 4); }
	}
	if( Attr7_Mean < -19.33 ) { 
		if( Attr8_Mean >= 8.01 ) { return new Prediction("NULL", 479, 87); }
		if( Attr8_Mean < 8.01 ) { return new Prediction("NULL", 299, 16); }
	}
	}
	}
	}
	if( Attr6_Min >= -0.18 ) { 
	if( Attr3_Mean < 8.86 ) { 
	if( Attr5_Mean >= 0 ) { 
	if( Attr4_Min < 0.02 ) { 
		if( Attr5_Max >= 0.01 ) { return new Prediction("NULL", 825, 95); }
		if( Attr5_Max < 0.01 ) { return new Prediction("NULL", 146, 66); }
	}
		if( Attr4_Min >= 0.02 ) { return new Prediction("NULL", 133, 0); }
	}
	if( Attr5_Mean < 0 ) { 
	if( Attr4_Min >= -0.04 ) { 
		if( Attr1_Max < 0.7 ) { return new Prediction("NULL", 220, 0); }
		if( Attr1_Max >= 0.7 ) { return new Prediction("NULL", 304, 9); }
	}
	if( Attr4_Min < -0.04 ) { 
		if( Attr7_Mean >= -74.02 ) { return new Prediction("NULL", 977, 61); }
		if( Attr7_Mean < -74.02 ) { return new Prediction("smoking", 10, 1); }
	}
	}
	}
		if( Attr3_Mean >= 8.86 ) { return new Prediction("NULL", 1207, 0); }
	}
	}
return null;
}
private Prediction runTree96() {
	if( Attr6_Min < -1.79 ) { 
	if( Attr4_Min >= -5.51 ) { 
	if( Attr3_Max >= 12.05 ) { 
	if( Attr3_Max < 14.37 ) { 
	if( Attr3_Min < 0.48 ) { 
		if( Attr6_Min >= -3.86 ) { return new Prediction("NULL", 256, 68); }
		if( Attr6_Min < -3.86 ) { return new Prediction("NULL", 105, 52); }
	}
	if( Attr3_Min >= 0.48 ) { 
		if( Attr3_Min >= 5.22 ) { return new Prediction("NULL", 26, 1); }
		if( Attr3_Min < 5.22 ) { return new Prediction("smoking", 90, 24); }
	}
	}
	if( Attr3_Max >= 14.37 ) { 
	if( Attr9_Max >= -23.26 ) { 
		if( Attr9_Mean < 20.67 ) { return new Prediction("NULL", 346, 78); }
		if( Attr9_Mean >= 20.67 ) { return new Prediction("NULL", 25, 0); }
	}
	if( Attr9_Max < -23.26 ) { 
		if( Attr9_Mean < -32.23 ) { return new Prediction("NULL", 22, 8); }
		if( Attr9_Mean >= -32.23 ) { return new Prediction("smoking", 11, 1); }
	}
	}
	}
	if( Attr3_Max < 12.05 ) { 
	if( Attr7_Max < 23.48 ) { 
		if( Attr4_Mean >= 0.18 ) { return new Prediction("NULL", 38, 0); }
	if( Attr4_Mean < 0.18 ) { 
		if( Attr6_Mean < -0.18 ) { return new Prediction("NULL", 30, 0); }
		if( Attr6_Mean >= -0.18 ) { return new Prediction("NULL", 1359, 665); }
	}
	}
	if( Attr7_Max >= 23.48 ) { 
	if( Attr4_Max >= 3.5 ) { 
		if( Attr9_Min < -24.52 ) { return new Prediction("smoking", 780, 355); }
		if( Attr9_Min >= -24.52 ) { return new Prediction("smoking", 265, 77); }
	}
	if( Attr4_Max < 3.5 ) { 
		if( Attr6_Min < -2.22 ) { return new Prediction("smoking", 1349, 184); }
		if( Attr6_Min >= -2.22 ) { return new Prediction("NULL", 119, 48); }
	}
	}
	}
	}
	if( Attr4_Min < -5.51 ) { 
	if( Attr1_Min >= -6.38 ) { 
	if( Attr8_Mean >= 42.31 ) { 
		if( Attr1_Mean < 4.04 ) { return new Prediction("smoking", 6, 0); }
		if( Attr1_Mean >= 4.04 ) { return new Prediction("NULL", 2, 0); }
	}
	if( Attr8_Mean < 42.31 ) { 
	if( Attr2_Min >= -14.04 ) { 
		if( Attr2_Mean >= -2.88 ) { return new Prediction("NULL", 61, 3); }
		if( Attr2_Mean < -2.88 ) { return new Prediction("NULL", 169, 46); }
	}
	if( Attr2_Min < -14.04 ) { 
		if( Attr9_Max >= 25.04 ) { return new Prediction("NULL", 191, 7); }
		if( Attr9_Max < 25.04 ) { return new Prediction("NULL", 196, 32); }
	}
	}
	}
	if( Attr1_Min < -6.38 ) { 
	if( Attr3_Min < -9.58 ) { 
	if( Attr1_Min >= -20.71 ) { 
		if( Attr7_Mean < -7.82 ) { return new Prediction("NULL", 335, 136); }
		if( Attr7_Mean >= -7.82 ) { return new Prediction("NULL", 673, 147); }
	}
	if( Attr1_Min < -20.71 ) { 
		if( Attr1_Mean >= 4.82 ) { return new Prediction("smoking", 1, 0); }
		if( Attr1_Mean < 4.82 ) { return new Prediction("NULL", 115, 3); }
	}
	}
	if( Attr3_Min >= -9.58 ) { 
	if( Attr1_Max < 7.25 ) { 
		if( Attr6_Min >= -2.73 ) { return new Prediction("NULL", 85, 11); }
		if( Attr6_Min < -2.73 ) { return new Prediction("NULL", 152, 68); }
	}
	if( Attr1_Max >= 7.25 ) { 
		if( Attr2_Max < 5.91 ) { return new Prediction("smoking", 327, 98); }
		if( Attr2_Max >= 5.91 ) { return new Prediction("NULL", 243, 85); }
	}
	}
	}
	}
	}
	if( Attr6_Min >= -1.79 ) { 
	if( Attr6_Max < 0.45 ) { 
	if( Attr3_Min < 7.45 ) { 
	if( Attr5_Mean >= 0 ) { 
	if( Attr5_Mean >= 0.03 ) { 
		if( Attr8_Mean < 28.5 ) { return new Prediction("NULL", 160, 0); }
		if( Attr8_Mean >= 28.5 ) { return new Prediction("NULL", 19, 2); }
	}
	if( Attr5_Mean < 0.03 ) { 
		if( Attr5_Max >= 0.01 ) { return new Prediction("NULL", 810, 103); }
		if( Attr5_Max < 0.01 ) { return new Prediction("NULL", 135, 63); }
	}
	}
	if( Attr5_Mean < 0 ) { 
	if( Attr7_Mean >= -70.98 ) { 
		if( Attr3_Min >= -3.42 ) { return new Prediction("NULL", 1677, 119); }
		if( Attr3_Min < -3.42 ) { return new Prediction("NULL", 656, 12); }
	}
	if( Attr7_Mean < -70.98 ) { 
		if( Attr2_Min >= -8.11 ) { return new Prediction("NULL", 16, 1); }
		if( Attr2_Min < -8.11 ) { return new Prediction("smoking", 15, 0); }
	}
	}
	}
	if( Attr3_Min >= 7.45 ) { 
		if( Attr4_Mean >= -0 ) { return new Prediction("NULL", 1102, 0); }
	if( Attr4_Mean < -0 ) { 
	if( Attr8_Max < 22.4 ) { 
		if( Attr2_Mean >= -9.77 ) { return new Prediction("NULL", 231, 4); }
		if( Attr2_Mean < -9.77 ) { return new Prediction("smoking", 2, 0); }
	}
		if( Attr8_Max >= 22.4 ) { return new Prediction("NULL", 258, 0); }
	}
	}
	}
	if( Attr6_Max >= 0.45 ) { 
	if( Attr4_Mean >= -0.17 ) { 
	if( Attr6_Max >= 2.06 ) { 
	if( Attr9_Min < -47.95 ) { 
		if( Attr2_Mean >= -3.96 ) { return new Prediction("NULL", 54, 2); }
		if( Attr2_Mean < -3.96 ) { return new Prediction("NULL", 46, 11); }
	}
	if( Attr9_Min >= -47.95 ) { 
		if( Attr4_Mean < 0.1 ) { return new Prediction("NULL", 607, 230); }
		if( Attr4_Mean >= 0.1 ) { return new Prediction("NULL", 40, 2); }
	}
	}
	if( Attr6_Max < 2.06 ) { 
	if( Attr9_Min >= -8.94 ) { 
		if( Attr3_Min < -3.72 ) { return new Prediction("NULL", 317, 10); }
		if( Attr3_Min >= -3.72 ) { return new Prediction("NULL", 195, 32); }
	}
	if( Attr9_Min < -8.94 ) { 
		if( Attr6_Mean >= 0.01 ) { return new Prediction("NULL", 728, 207); }
		if( Attr6_Mean < 0.01 ) { return new Prediction("NULL", 1335, 228); }
	}
	}
	}
		if( Attr4_Mean < -0.17 ) { return new Prediction("NULL", 98, 0); }
	}
	}
return null;
}
private Prediction runTree97() {
	if( Attr5_Max >= 0.44 ) { 
	if( Attr6_Min >= -2.32 ) { 
	if( Attr1_Max >= 7.03 ) { 
	if( Attr1_Max < 10 ) { 
	if( Attr7_Max < -12.86 ) { 
		if( Attr5_Mean >= 0 ) { return new Prediction("NULL", 88, 8); }
		if( Attr5_Mean < 0 ) { return new Prediction("NULL", 114, 33); }
	}
	if( Attr7_Max >= -12.86 ) { 
		if( Attr1_Min < 0.83 ) { return new Prediction("smoking", 573, 284); }
		if( Attr1_Min >= 0.83 ) { return new Prediction("NULL", 161, 37); }
	}
	}
	if( Attr1_Max >= 10 ) { 
	if( Attr2_Mean < -1.04 ) { 
		if( Attr9_Max >= 12.92 ) { return new Prediction("NULL", 673, 115); }
		if( Attr9_Max < 12.92 ) { return new Prediction("NULL", 449, 138); }
	}
	if( Attr2_Mean >= -1.04 ) { 
		if( Attr5_Min >= -2.18 ) { return new Prediction("NULL", 84, 0); }
		if( Attr5_Min < -2.18 ) { return new Prediction("NULL", 28, 3); }
	}
	}
	}
	if( Attr1_Max < 7.03 ) { 
	if( Attr6_Min < -1.86 ) { 
	if( Attr5_Max < 2.91 ) { 
		if( Attr2_Mean < -0.74 ) { return new Prediction("NULL", 331, 105); }
		if( Attr2_Mean >= -0.74 ) { return new Prediction("smoking", 49, 14); }
	}
	if( Attr5_Max >= 2.91 ) { 
		if( Attr6_Min < -2.03 ) { return new Prediction("NULL", 30, 0); }
		if( Attr6_Min >= -2.03 ) { return new Prediction("NULL", 12, 2); }
	}
	}
	if( Attr6_Min >= -1.86 ) { 
	if( Attr1_Max < -1.91 ) { 
		if( Attr2_Max < 3.79 ) { return new Prediction("NULL", 340, 63); }
		if( Attr2_Max >= 3.79 ) { return new Prediction("smoking", 95, 39); }
	}
	if( Attr1_Max >= -1.91 ) { 
		if( Attr6_Mean < 0.03 ) { return new Prediction("NULL", 1202, 105); }
		if( Attr6_Mean >= 0.03 ) { return new Prediction("NULL", 298, 73); }
	}
	}
	}
	}
	if( Attr6_Min < -2.32 ) { 
	if( Attr3_Max >= 11.98 ) { 
	if( Attr3_Min < -10.34 ) { 
	if( Attr1_Mean >= -4.62 ) { 
		if( Attr2_Mean < -2.55 ) { return new Prediction("NULL", 724, 179); }
		if( Attr2_Mean >= -2.55 ) { return new Prediction("NULL", 83, 4); }
	}
	if( Attr1_Mean < -4.62 ) { 
		if( Attr7_Max < 30.19 ) { return new Prediction("NULL", 8, 2); }
		if( Attr7_Max >= 30.19 ) { return new Prediction("NULL", 126, 2); }
	}
	}
	if( Attr3_Min >= -10.34 ) { 
	if( Attr8_Mean >= 10.18 ) { 
		if( Attr3_Max >= 14.68 ) { return new Prediction("NULL", 299, 57); }
		if( Attr3_Max < 14.68 ) { return new Prediction("NULL", 399, 151); }
	}
	if( Attr8_Mean < 10.18 ) { 
		if( Attr1_Min >= -6.67 ) { return new Prediction("NULL", 146, 31); }
		if( Attr1_Min < -6.67 ) { return new Prediction("NULL", 347, 171); }
	}
	}
	}
	if( Attr3_Max < 11.98 ) { 
	if( Attr3_Max < 8.5 ) { 
	if( Attr8_Max < 34.1 ) { 
		if( Attr6_Min < -4.48 ) { return new Prediction("smoking", 226, 47); }
		if( Attr6_Min >= -4.48 ) { return new Prediction("NULL", 479, 210); }
	}
	if( Attr8_Max >= 34.1 ) { 
		if( Attr4_Max < 5.06 ) { return new Prediction("smoking", 1382, 257); }
		if( Attr4_Max >= 5.06 ) { return new Prediction("NULL", 238, 96); }
	}
	}
	if( Attr3_Max >= 8.5 ) { 
	if( Attr1_Min >= -7.06 ) { 
		if( Attr5_Min >= -2.09 ) { return new Prediction("NULL", 237, 83); }
		if( Attr5_Min < -2.09 ) { return new Prediction("NULL", 334, 64); }
	}
	if( Attr1_Min < -7.06 ) { 
		if( Attr5_Min >= -2.13 ) { return new Prediction("smoking", 525, 99); }
		if( Attr5_Min < -2.13 ) { return new Prediction("smoking", 748, 322); }
	}
	}
	}
	}
	}
	if( Attr5_Max < 0.44 ) { 
	if( Attr2_Mean < -1.24 ) { 
	if( Attr6_Min < -2.16 ) { 
	if( Attr6_Mean < -0 ) { 
	if( Attr5_Min >= -2.84 ) { 
		if( Attr3_Mean < 0.43 ) { return new Prediction("NULL", 8, 0); }
		if( Attr3_Mean >= 0.43 ) { return new Prediction("smoking", 25, 7); }
	}
		if( Attr5_Min < -2.84 ) { return new Prediction("NULL", 8, 0); }
	}
		if( Attr6_Mean >= -0 ) { return new Prediction("smoking", 27, 0); }
	}
	if( Attr6_Min >= -2.16 ) { 
	if( Attr1_Max < 8.59 ) { 
	if( Attr3_Min >= 7.87 ) { 
		if( Attr1_Max < 2.94 ) { return new Prediction("NULL", 336, 1); }
		if( Attr1_Max >= 2.94 ) { return new Prediction("NULL", 3, 1); }
	}
	if( Attr3_Min < 7.87 ) { 
		if( Attr1_Max >= -7.39 ) { return new Prediction("NULL", 2522, 204); }
		if( Attr1_Max < -7.39 ) { return new Prediction("NULL", 62, 25); }
	}
	}
	if( Attr1_Max >= 8.59 ) { 
	if( Attr7_Mean < -26.94 ) { 
		if( Attr7_Min < -35.75 ) { return new Prediction("NULL", 89, 22); }
		if( Attr7_Min >= -35.75 ) { return new Prediction("NULL", 118, 3); }
	}
	if( Attr7_Mean >= -26.94 ) { 
		if( Attr3_Mean < -2.3 ) { return new Prediction("NULL", 27, 2); }
		if( Attr3_Mean >= -2.3 ) { return new Prediction("NULL", 168, 82); }
	}
	}
	}
	}
	if( Attr2_Mean >= -1.24 ) { 
	if( Attr1_Mean < -8.84 ) { 
	if( Attr3_Mean >= 1.24 ) { 
		if( Attr2_Max >= 5.04 ) { return new Prediction("smoking", 3, 0); }
	if( Attr2_Max < 5.04 ) { 
		if( Attr1_Min < -9.82 ) { return new Prediction("NULL", 5, 0); }
		if( Attr1_Min >= -9.82 ) { return new Prediction("NULL", 7, 3); }
	}
	}
		if( Attr3_Mean < 1.24 ) { return new Prediction("NULL", 46, 0); }
	}
	if( Attr1_Mean >= -8.84 ) { 
	if( Attr3_Mean < 7.9 ) { 
	if( Attr2_Mean >= 0.09 ) { 
		if( Attr1_Min >= 0.81 ) { return new Prediction("NULL", 260, 0); }
		if( Attr1_Min < 0.81 ) { return new Prediction("NULL", 136, 5); }
	}
	if( Attr2_Mean < 0.09 ) { 
		if( Attr4_Max < 0.16 ) { return new Prediction("NULL", 46, 8); }
		if( Attr4_Max >= 0.16 ) { return new Prediction("NULL", 43, 1); }
	}
	}
		if( Attr3_Mean >= 7.9 ) { return new Prediction("NULL", 1111, 0); }
	}
	}
	}
return null;
}
private Prediction runTree98() {
	if( Attr1_Min >= -6.8 ) { 
	if( Attr2_Mean < -1.14 ) { 
	if( Attr6_Max >= 1.05 ) { 
	if( Attr3_Min < 5 ) { 
	if( Attr9_Max < 19.39 ) { 
		if( Attr3_Max < 12.43 ) { return new Prediction("NULL", 1164, 400); }
		if( Attr3_Max >= 12.43 ) { return new Prediction("NULL", 303, 63); }
	}
	if( Attr9_Max >= 19.39 ) { 
		if( Attr1_Min >= 0.09 ) { return new Prediction("NULL", 394, 50); }
		if( Attr1_Min < 0.09 ) { return new Prediction("NULL", 1006, 242); }
	}
	}
	if( Attr3_Min >= 5 ) { 
	if( Attr1_Mean < 0.75 ) { 
		if( Attr9_Mean >= -64.28 ) { return new Prediction("NULL", 146, 2); }
		if( Attr9_Mean < -64.28 ) { return new Prediction("smoking", 3, 1); }
	}
	if( Attr1_Mean >= 0.75 ) { 
		if( Attr7_Mean >= -0.03 ) { return new Prediction("NULL", 15, 0); }
		if( Attr7_Mean < -0.03 ) { return new Prediction("smoking", 7, 3); }
	}
	}
	}
	if( Attr6_Max < 1.05 ) { 
	if( Attr1_Min >= 7.99 ) { 
	if( Attr4_Max < 0 ) { 
		if( Attr4_Mean >= -0.01 ) { return new Prediction("smoking", 26, 1); }
		if( Attr4_Mean < -0.01 ) { return new Prediction("NULL", 14, 1); }
	}
	if( Attr4_Max >= 0 ) { 
		if( Attr6_Max >= 0.61 ) { return new Prediction("smoking", 27, 12); }
		if( Attr6_Max < 0.61 ) { return new Prediction("NULL", 248, 29); }
	}
	}
	if( Attr1_Min < 7.99 ) { 
		if( Attr5_Max < -0 ) { return new Prediction("NULL", 215, 0); }
	if( Attr5_Max >= -0 ) { 
		if( Attr8_Max >= -3.54 ) { return new Prediction("NULL", 3501, 328); }
		if( Attr8_Max < -3.54 ) { return new Prediction("NULL", 184, 0); }
	}
	}
	}
	}
	if( Attr2_Mean >= -1.14 ) { 
	if( Attr4_Min < -0.27 ) { 
	if( Attr2_Min >= 7.92 ) { 
	if( Attr4_Max >= 0.56 ) { 
		if( Attr1_Min >= -1.38 ) { return new Prediction("NULL", 3, 0); }
		if( Attr1_Min < -1.38 ) { return new Prediction("smoking", 2, 0); }
	}
		if( Attr4_Max < 0.56 ) { return new Prediction("smoking", 9, 0); }
	}
	if( Attr2_Min < 7.92 ) { 
	if( Attr9_Min >= -97.89 ) { 
		if( Attr6_Min >= -1.45 ) { return new Prediction("NULL", 302, 6); }
		if( Attr6_Min < -1.45 ) { return new Prediction("NULL", 135, 18); }
	}
	if( Attr9_Min < -97.89 ) { 
		if( Attr1_Max >= 4.46 ) { return new Prediction("smoking", 13, 1); }
		if( Attr1_Max < 4.46 ) { return new Prediction("NULL", 3, 0); }
	}
	}
	}
	if( Attr4_Min >= -0.27 ) { 
		if( Attr3_Min >= 0.88 ) { return new Prediction("NULL", 1291, 0); }
	if( Attr3_Min < 0.88 ) { 
	if( Attr2_Min < 0.07 ) { 
		if( Attr6_Mean >= 0.01 ) { return new Prediction("smoking", 2, 0); }
		if( Attr6_Mean < 0.01 ) { return new Prediction("NULL", 52, 5); }
	}
		if( Attr2_Min >= 0.07 ) { return new Prediction("NULL", 110, 0); }
	}
	}
	}
	}
	if( Attr1_Min < -6.8 ) { 
	if( Attr6_Min < -2.28 ) { 
	if( Attr4_Max < 4.11 ) { 
	if( Attr2_Min < -17.59 ) { 
	if( Attr1_Max >= 7.55 ) { 
		if( Attr1_Min >= -19.11 ) { return new Prediction("smoking", 152, 43); }
		if( Attr1_Min < -19.11 ) { return new Prediction("NULL", 28, 6); }
	}
	if( Attr1_Max < 7.55 ) { 
		if( Attr2_Max >= 2.63 ) { return new Prediction("NULL", 30, 1); }
		if( Attr2_Max < 2.63 ) { return new Prediction("NULL", 28, 13); }
	}
	}
	if( Attr2_Min >= -17.59 ) { 
	if( Attr8_Max >= 30.77 ) { 
		if( Attr7_Min < -50.99 ) { return new Prediction("smoking", 120, 38); }
		if( Attr7_Min >= -50.99 ) { return new Prediction("smoking", 1468, 159); }
	}
	if( Attr8_Max < 30.77 ) { 
		if( Attr2_Mean >= -7.07 ) { return new Prediction("smoking", 415, 126); }
		if( Attr2_Mean < -7.07 ) { return new Prediction("NULL", 22, 2); }
	}
	}
	}
	if( Attr4_Max >= 4.11 ) { 
	if( Attr4_Min < -5.3 ) { 
	if( Attr2_Max >= 9.09 ) { 
		if( Attr4_Mean >= -0.14 ) { return new Prediction("NULL", 638, 158); }
		if( Attr4_Mean < -0.14 ) { return new Prediction("NULL", 63, 4); }
	}
	if( Attr2_Max < 9.09 ) { 
		if( Attr6_Min >= -4.08 ) { return new Prediction("NULL", 462, 147); }
		if( Attr6_Min < -4.08 ) { return new Prediction("NULL", 422, 204); }
	}
	}
	if( Attr4_Min >= -5.3 ) { 
	if( Attr5_Max < 2.82 ) { 
		if( Attr6_Mean >= -0.2 ) { return new Prediction("smoking", 553, 200); }
		if( Attr6_Mean < -0.2 ) { return new Prediction("NULL", 15, 0); }
	}
	if( Attr5_Max >= 2.82 ) { 
		if( Attr3_Max < 11.5 ) { return new Prediction("smoking", 158, 71); }
		if( Attr3_Max >= 11.5 ) { return new Prediction("NULL", 155, 32); }
	}
	}
	}
	}
	if( Attr6_Min >= -2.28 ) { 
	if( Attr5_Max >= 1.03 ) { 
	if( Attr2_Mean >= -4.13 ) { 
	if( Attr1_Min < -13.19 ) { 
		if( Attr1_Max < -5.45 ) { return new Prediction("smoking", 4, 0); }
		if( Attr1_Max >= -5.45 ) { return new Prediction("NULL", 152, 29); }
	}
	if( Attr1_Min >= -13.19 ) { 
		if( Attr1_Mean < -3.1 ) { return new Prediction("smoking", 185, 39); }
		if( Attr1_Mean >= -3.1 ) { return new Prediction("smoking", 118, 56); }
	}
	}
	if( Attr2_Mean < -4.13 ) { 
	if( Attr9_Min < -6.58 ) { 
		if( Attr9_Mean >= 14.9 ) { return new Prediction("smoking", 62, 28); }
		if( Attr9_Mean < 14.9 ) { return new Prediction("NULL", 570, 130); }
	}
	if( Attr9_Min >= -6.58 ) { 
		if( Attr4_Min < -2.37 ) { return new Prediction("NULL", 42, 0); }
		if( Attr4_Min >= -2.37 ) { return new Prediction("NULL", 27, 2); }
	}
	}
	}
	if( Attr5_Max < 1.03 ) { 
		if( Attr2_Max < -6.61 ) { return new Prediction("smoking", 10, 0); }
	if( Attr2_Max >= -6.61 ) { 
	if( Attr8_Mean >= -10.04 ) { 
		if( Attr2_Min >= -0.34 ) { return new Prediction("NULL", 63, 0); }
		if( Attr2_Min < -0.34 ) { return new Prediction("NULL", 592, 140); }
	}
	if( Attr8_Mean < -10.04 ) { 
		if( Attr9_Min >= -39.66 ) { return new Prediction("NULL", 135, 0); }
		if( Attr9_Min < -39.66 ) { return new Prediction("NULL", 14, 2); }
	}
	}
	}
	}
	}
return null;
}
private Prediction runTree99() {
	if( Attr1_Min < -6.58 ) { 
	if( Attr6_Min >= -2.32 ) { 
	if( Attr3_Max >= -2.11 ) { 
	if( Attr5_Max >= 1.02 ) { 
	if( Attr1_Min >= -10.92 ) { 
		if( Attr8_Min < -24.58 ) { return new Prediction("smoking", 136, 45); }
		if( Attr8_Min >= -24.58 ) { return new Prediction("NULL", 597, 254); }
	}
	if( Attr1_Min < -10.92 ) { 
		if( Attr2_Min < -11.46 ) { return new Prediction("NULL", 406, 47); }
		if( Attr2_Min >= -11.46 ) { return new Prediction("NULL", 167, 54); }
	}
	}
	if( Attr5_Max < 1.02 ) { 
	if( Attr1_Mean >= -2.95 ) { 
		if( Attr3_Mean >= 2.59 ) { return new Prediction("NULL", 66, 16); }
		if( Attr3_Mean < 2.59 ) { return new Prediction("smoking", 69, 26); }
	}
	if( Attr1_Mean < -2.95 ) { 
		if( Attr6_Mean < 0 ) { return new Prediction("NULL", 304, 23); }
		if( Attr6_Mean >= 0 ) { return new Prediction("NULL", 288, 64); }
	}
	}
	}
		if( Attr3_Max < -2.11 ) { return new Prediction("NULL", 112, 0); }
	}
	if( Attr6_Min < -2.32 ) { 
	if( Attr5_Mean >= 0.15 ) { 
	if( Attr1_Max < 8.52 ) { 
	if( Attr4_Max < 2.48 ) { 
		if( Attr2_Mean >= -3.14 ) { return new Prediction("NULL", 3, 0); }
		if( Attr2_Mean < -3.14 ) { return new Prediction("smoking", 3, 0); }
	}
		if( Attr4_Max >= 2.48 ) { return new Prediction("NULL", 41, 0); }
	}
	if( Attr1_Max >= 8.52 ) { 
	if( Attr5_Min >= -3.11 ) { 
		if( Attr5_Max < 4.5 ) { return new Prediction("NULL", 21, 10); }
		if( Attr5_Max >= 4.5 ) { return new Prediction("smoking", 10, 0); }
	}
	if( Attr5_Min < -3.11 ) { 
		if( Attr3_Min >= -14.72 ) { return new Prediction("NULL", 36, 14); }
		if( Attr3_Min < -14.72 ) { return new Prediction("NULL", 25, 0); }
	}
	}
	}
	if( Attr5_Mean < 0.15 ) { 
	if( Attr3_Min >= -8.16 ) { 
	if( Attr3_Max >= 12.63 ) { 
		if( Attr9_Max >= -25.57 ) { return new Prediction("NULL", 441, 154); }
		if( Attr9_Max < -25.57 ) { return new Prediction("smoking", 59, 18); }
	}
	if( Attr3_Max < 12.63 ) { 
		if( Attr4_Max >= 2.91 ) { return new Prediction("smoking", 1394, 367); }
		if( Attr4_Max < 2.91 ) { return new Prediction("smoking", 962, 122); }
	}
	}
	if( Attr3_Min < -8.16 ) { 
	if( Attr4_Max < 4.11 ) { 
		if( Attr2_Mean < -2.13 ) { return new Prediction("smoking", 350, 88); }
		if( Attr2_Mean >= -2.13 ) { return new Prediction("NULL", 16, 0); }
	}
	if( Attr4_Max >= 4.11 ) { 
		if( Attr5_Mean >= -1.29 ) { return new Prediction("NULL", 1299, 327); }
		if( Attr5_Mean < -1.29 ) { return new Prediction("smoking", 16, 0); }
	}
	}
	}
	}
	}
	if( Attr1_Min >= -6.58 ) { 
	if( Attr3_Min < 7.05 ) { 
	if( Attr5_Max < 0.56 ) { 
	if( Attr8_Max >= -7.01 ) { 
	if( Attr6_Mean < 0 ) { 
		if( Attr9_Mean >= 9.39 ) { return new Prediction("NULL", 663, 17); }
		if( Attr9_Mean < 9.39 ) { return new Prediction("NULL", 1400, 121); }
	}
	if( Attr6_Mean >= 0 ) { 
		if( Attr4_Max < 0.32 ) { return new Prediction("NULL", 448, 98); }
		if( Attr4_Max >= 0.32 ) { return new Prediction("NULL", 548, 50); }
	}
	}
	if( Attr8_Max < -7.01 ) { 
		if( Attr2_Max < 10.74 ) { return new Prediction("NULL", 248, 0); }
	if( Attr2_Max >= 10.74 ) { 
		if( Attr2_Mean < 9.47 ) { return new Prediction("NULL", 5, 0); }
		if( Attr2_Mean >= 9.47 ) { return new Prediction("smoking", 2, 0); }
	}
	}
	}
	if( Attr5_Max >= 0.56 ) { 
	if( Attr4_Mean >= -0.08 ) { 
	if( Attr3_Min < -5.88 ) { 
		if( Attr6_Max >= 1.25 ) { return new Prediction("NULL", 1102, 220); }
		if( Attr6_Max < 1.25 ) { return new Prediction("NULL", 353, 33); }
	}
	if( Attr3_Min >= -5.88 ) { 
		if( Attr1_Max < 5.86 ) { return new Prediction("NULL", 620, 86); }
		if( Attr1_Max >= 5.86 ) { return new Prediction("NULL", 1580, 517); }
	}
	}
	if( Attr4_Mean < -0.08 ) { 
	if( Attr6_Min >= -1.63 ) { 
		if( Attr9_Max < 43.87 ) { return new Prediction("NULL", 122, 0); }
		if( Attr9_Max >= 43.87 ) { return new Prediction("smoking", 2, 1); }
	}
	if( Attr6_Min < -1.63 ) { 
		if( Attr5_Max < 2.14 ) { return new Prediction("NULL", 85, 1); }
		if( Attr5_Max >= 2.14 ) { return new Prediction("NULL", 142, 30); }
	}
	}
	}
	}
	if( Attr3_Min >= 7.05 ) { 
	if( Attr1_Max < 2.64 ) { 
		if( Attr2_Min < -11.79 ) { return new Prediction("smoking", 1, 0); }
	if( Attr2_Min >= -11.79 ) { 
	if( Attr5_Max >= 0.6 ) { 
		if( Attr5_Max >= 0.61 ) { return new Prediction("NULL", 60, 1); }
		if( Attr5_Max < 0.61 ) { return new Prediction("smoking", 1, 0); }
	}
	if( Attr5_Max < 0.6 ) { 
		if( Attr2_Min < -5.93 ) { return new Prediction("NULL", 57, 1); }
		if( Attr2_Min >= -5.93 ) { return new Prediction("NULL", 1514, 0); }
	}
	}
	}
	if( Attr1_Max >= 2.64 ) { 
	if( Attr3_Max < 7.69 ) { 
		if( Attr2_Max < -2.11 ) { return new Prediction("smoking", 3, 0); }
		if( Attr2_Max >= -2.11 ) { return new Prediction("NULL", 1, 0); }
	}
	if( Attr3_Max >= 7.69 ) { 
	if( Attr7_Min < -24.11 ) { 
		if( Attr8_Min >= 8.13 ) { return new Prediction("smoking", 4, 1); }
		if( Attr8_Min < 8.13 ) { return new Prediction("NULL", 26, 2); }
	}
		if( Attr7_Min >= -24.11 ) { return new Prediction("NULL", 70, 0); }
	}
	}
	}
	}
return null;
}
}

