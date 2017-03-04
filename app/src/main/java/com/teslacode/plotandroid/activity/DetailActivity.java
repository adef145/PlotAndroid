package com.teslacode.plotandroid.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.teslacode.plot.Plot;
import com.teslacode.plot.annotation.PlotBundle;
import com.teslacode.plotandroid.Constant;
import com.teslacode.plotandroid.R;
import com.teslacode.plotandroid.model.UserParcelable;
import com.teslacode.plotandroid.model.UserParceler;
import com.teslacode.plotandroid.model.UserSerializable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DetailActivity extends AppCompatActivity {

    @PlotBundle(key = Constant.KEYS.PLOT_INT)
    int plotInt;

    @PlotBundle(key = Constant.KEYS.PLOT_DOUBLE)
    double plotDouble;

    @PlotBundle(key = Constant.KEYS.PLOT_FLOAT)
    float plotFloat;

    @PlotBundle(key = Constant.KEYS.PLOT_BYTE)
    byte plotByte;

    @PlotBundle(key = Constant.KEYS.PLOT_BOOLEAN)
    boolean plotBoolean;

    @PlotBundle(key = Constant.KEYS.PLOT_CHAR)
    char plotChar;

    @PlotBundle(key = Constant.KEYS.PLOT_STRING)
    String plotString;

    @PlotBundle(key = Constant.KEYS.PLOT_USER_PARCELABLE)
    UserParcelable plotUserParcelable;

    @PlotBundle(key = Constant.KEYS.PLOT_USER_PARCELER)
    UserParceler plotUserParceler;

    @PlotBundle(key = Constant.KEYS.PLOT_USER_SERIALIZABLE)
    UserSerializable plotUserSerializable;

    @PlotBundle(key = Constant.KEYS.PLOT_INTEGER_ARRAY)
    int[] plotIntegerArray;

    @PlotBundle(key = Constant.KEYS.PLOT_INTEGER_ARRAYLIST)
    ArrayList<Integer> plotIntegerArrayList;

    @PlotBundle(key = Constant.KEYS.PLOT_STRING_ARRAY)
    String[] plotStringArray;

    @PlotBundle(key = Constant.KEYS.PLOT_STRING_ARRAYLIST)
    ArrayList<String> plotStringArrayList;

    @PlotBundle(key = Constant.KEYS.PLOT_STRING_LIST)
    List<String> plotStringList;

    @PlotBundle(key = Constant.KEYS.PLOT_MAP)
    Map<String, String> plotMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Plot.unpack(this, getIntent().getExtras());

        TextView plotIntText = (TextView) findViewById(R.id.plot_int);
        TextView plotDoubleText = (TextView) findViewById(R.id.plot_double);
        TextView plotFloatText = (TextView) findViewById(R.id.plot_float);
        TextView plotByteText = (TextView) findViewById(R.id.plot_byte);
        TextView plotBooleanText = (TextView) findViewById(R.id.plot_boolean);
        TextView plotCharText = (TextView) findViewById(R.id.plot_char);
        TextView plotStringText = (TextView) findViewById(R.id.plot_string);
        TextView plotUserParcelableNameText = (TextView) findViewById(R.id.plot_user_parcelable_name);
        TextView plotUserParcelableAgeText = (TextView) findViewById(R.id.plot_user_parcelable_age);
        TextView plotUserParcelerNameText = (TextView) findViewById(R.id.plot_user_parceler_name);
        TextView plotUserSerializableNameText = (TextView) findViewById(R.id.plot_user_serializable_name);
        TextView plotUserSerializableAgeText = (TextView) findViewById(R.id.plot_user_serializable_age);
        TextView plotIntegerArrayText = (TextView) findViewById(R.id.plot_integer_array);
        TextView plotIntegerArrayListText = (TextView) findViewById(R.id.plot_integer_arraylist);
        TextView plotStringArrayText = (TextView) findViewById(R.id.plot_string_array);
        TextView plotStringArrayListText = (TextView) findViewById(R.id.plot_string_arraylist);
        TextView plotStringListText = (TextView) findViewById(R.id.plot_string_list);
        TextView plotMapText = (TextView) findViewById(R.id.plot_map);

        plotIntText.setText("" + plotInt);
        plotDoubleText.setText("" + plotDouble);
        plotFloatText.setText("" + plotFloat);
        plotByteText.setText("" + plotByte);
        plotBooleanText.setText("" + plotBoolean);
        plotCharText.setText("" + plotChar);
        plotStringText.setText("" + plotString);
        plotUserParcelableNameText.setText("" + plotUserParcelable.name);
        plotUserParcelableAgeText.setText("" + plotUserParcelable.age);
        plotUserParcelerNameText.setText("" + plotUserParceler.getName());
        plotUserSerializableNameText.setText("" + plotUserSerializable.name);
        plotUserSerializableAgeText.setText("" + plotUserSerializable.age);
        plotIntegerArrayText.setText("" + plotIntegerArray);
        plotIntegerArrayListText.setText("" + plotIntegerArrayList);
        plotStringArrayText.setText("" + plotStringArray);
        plotStringArrayListText.setText("" + plotStringArrayList);
        plotStringListText.setText("" + plotStringList);
        plotMapText.setText("" + plotMap);
    }
}
