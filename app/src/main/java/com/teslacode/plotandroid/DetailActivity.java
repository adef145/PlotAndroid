package com.teslacode.plotandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.teslacode.plot.Plot;
import com.teslacode.plot.annotation.PlotBundle;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Plot.importBundle(this, getIntent().getExtras());

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
    }
}
