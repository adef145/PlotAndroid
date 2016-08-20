package com.teslacode.plotandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.teslacode.plot.Plot;
import com.teslacode.plot.annotation.PlotBundle;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView plotIntText = (TextView) findViewById(R.id.plot_int);
        TextView plotDoubleText = (TextView) findViewById(R.id.plot_double);
        TextView plotFloatText = (TextView) findViewById(R.id.plot_float);
        TextView plotByteText = (TextView) findViewById(R.id.plot_byte);
        TextView plotBooleanText = (TextView) findViewById(R.id.plot_boolean);
        TextView plotCharText = (TextView) findViewById(R.id.plot_char);
        TextView plotStringText = (TextView) findViewById(R.id.plot_string);

        plotIntText.setText("" + plotInt);
        plotDoubleText.setText("" + plotDouble);
        plotFloatText.setText("" + plotFloat);
        plotByteText.setText("" + plotByte);
        plotBooleanText.setText("" + plotBoolean);
        plotCharText.setText("" + plotChar);
        plotStringText.setText("" + plotString);

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
