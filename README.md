# Plot

Field binding for Android bundle.
Eliminate `bundle.get` & `bundle.put` calls by using `Plot.unpack(this, bundle)` & `Plot.pack(this)` in Android lifecycle with annotation `@PlotBundle` on field.

## Example

#### pack
```java
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @PlotBundle(key = Constant.KEYS.PLOT_INT)
    Integer plotInt = 1;

    @PlotBundle(key = Constant.KEYS.PLOT_DOUBLE)
    double plotDouble = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView plotIntText = (TextView) findViewById(R.id.plot_int);
        TextView plotDoubleText = (TextView) findViewById(R.id.plot_double);

        plotIntText.setText("" + plotInt);
        plotDoubleText.setText("" + plotDouble);

        Button next = (Button) findViewById(R.id.next);

        next.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getBaseContext(), DetailActivity.class);
        Bundle bundle = Plot.pack(this);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
```

#### unpack
```java
public class DetailActivity extends AppCompatActivity {

    @PlotBundle(key = Constant.KEYS.PLOT_INT)
    int plotInt;

    @PlotBundle(key = Constant.KEYS.PLOT_DOUBLE)
    double plotDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Plot.unpack(this, getIntent().getExtras());

        TextView plotIntText = (TextView) findViewById(R.id.plot_int);
        TextView plotDoubleText = (TextView) findViewById(R.id.plot_double);

        plotIntText.setText("" + plotInt);
        plotDoubleText.setText("" + plotDouble);
    }
}
```

## Download
Configure your project-level build.gradle to include the 'android-apt' plugin:
```gradle
repositories {
    maven {
        url 'https://dl.bintray.com/adef145/teslacode/'
    }
}

...

dependencies {
    compile 'com.teslacode.plot:plot:0.1.1'
}
```
