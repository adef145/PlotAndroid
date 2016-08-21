package com.teslacode.plotandroid.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.teslacode.plot.Plot;
import com.teslacode.plot.annotation.PlotBundle;
import com.teslacode.plotandroid.Constant;
import com.teslacode.plotandroid.R;
import com.teslacode.plotandroid.model.UserParcelable;
import com.teslacode.plotandroid.model.UserSerializable;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @PlotBundle(key = Constant.KEYS.PLOT_INT)
    Integer plotInt = 1;

    @PlotBundle(key = Constant.KEYS.PLOT_DOUBLE)
    double plotDouble = 2;

    @PlotBundle(key = Constant.KEYS.PLOT_FLOAT)
    float plotFloat = 3;

    @PlotBundle(key = Constant.KEYS.PLOT_BYTE)
    byte plotByte = 4;

    @PlotBundle(key = Constant.KEYS.PLOT_BOOLEAN)
    boolean plotBoolean = false;

    @PlotBundle(key = Constant.KEYS.PLOT_CHAR)
    char plotChar = 'a';

    @PlotBundle(key = Constant.KEYS.PLOT_STRING)
    String plotString = "String";

    @PlotBundle(key = Constant.KEYS.PLOT_USER_PARCELABLE)
    UserParcelable plotUserParcelable = new UserParcelable();

    @PlotBundle(key = Constant.KEYS.PLOT_USER_SERIALIZABLE)
    UserSerializable plotUserSerializable = new UserSerializable();

    @PlotBundle(key = Constant.KEYS.PLOT_INTEGER_ARRAY)
    int[] plotIntegerArray = {1};

    @PlotBundle(key = Constant.KEYS.PLOT_INTEGER_ARRAYLIST)
    ArrayList<Integer> plotIntegerArrayList = new ArrayList<Integer>();

    @PlotBundle(key = Constant.KEYS.PLOT_STRING_ARRAY)
    String[] plotStringArray = {"String"};

    @PlotBundle(key = Constant.KEYS.PLOT_STRING_ARRAYLIST)
    ArrayList<String> plotStringArrayList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plotIntegerArrayList.add(1);
        plotStringArrayList.add("String");

        TextView plotIntText = (TextView) findViewById(R.id.plot_int);
        TextView plotDoubleText = (TextView) findViewById(R.id.plot_double);
        TextView plotFloatText = (TextView) findViewById(R.id.plot_float);
        TextView plotByteText = (TextView) findViewById(R.id.plot_byte);
        TextView plotBooleanText = (TextView) findViewById(R.id.plot_boolean);
        TextView plotCharText = (TextView) findViewById(R.id.plot_char);
        TextView plotStringText = (TextView) findViewById(R.id.plot_string);
        TextView plotUserParcelableNameText = (TextView) findViewById(R.id.plot_user_parcelable_name);
        TextView plotUserParcelableAgeText = (TextView) findViewById(R.id.plot_user_parcelable_age);
        TextView plotUserSerializableNameText = (TextView) findViewById(R.id.plot_user_serializable_name);
        TextView plotUserSerializableAgeText = (TextView) findViewById(R.id.plot_user_serializable_age);
        TextView plotIntegerArrayText = (TextView) findViewById(R.id.plot_integer_array);
        TextView plotIntegerArrayListText = (TextView) findViewById(R.id.plot_integer_arraylist);
        TextView plotStringArrayText = (TextView) findViewById(R.id.plot_string_array);
        TextView plotStringArrayListText = (TextView) findViewById(R.id.plot_string_arraylist);

        plotIntText.setText("" + plotInt);
        plotDoubleText.setText("" + plotDouble);
        plotFloatText.setText("" + plotFloat);
        plotByteText.setText("" + plotByte);
        plotBooleanText.setText("" + plotBoolean);
        plotCharText.setText("" + plotChar);
        plotStringText.setText("" + plotString);
        plotUserParcelableNameText.setText("" + plotUserParcelable.name);
        plotUserParcelableAgeText.setText("" + plotUserParcelable.age);
        plotUserSerializableNameText.setText("" + plotUserSerializable.name);
        plotUserSerializableAgeText.setText("" + plotUserSerializable.age);
        plotIntegerArrayText.setText("" + plotIntegerArray);
        plotIntegerArrayListText.setText("" + plotIntegerArrayList);
        plotStringArrayText.setText("" + plotStringArray);
        plotStringArrayListText.setText("" + plotStringArrayList);

        Button next = (Button) findViewById(R.id.next);

        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getBaseContext(), DetailActivity.class);
        Bundle bundle = Plot.exportBundle(this);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
