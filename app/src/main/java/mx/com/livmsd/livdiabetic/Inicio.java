package mx.com.livmsd.livdiabetic;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.Random;

public class Inicio extends AppCompatActivity {
    private final Handler mHandler = new Handler();
    private Runnable mTimer;
    private double graphLastXValue = 5d;
    private LineGraphSeries<DataPoint> mSeries;
    Button medicinas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        GraphView graph = (GraphView) this.findViewById(R.id.graph);
        initGraph(graph);
        medicinas=(Button) findViewById(R.id.btnMedicinas);
        medicinas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this,
                        Medicinas.class);
                startActivity(intent);
            }
        });
       // graficas();
    }
   /* public void graficas(){
        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });
        graph.addSeries(series);
    }*/

    public void initGraph(GraphView graph) {
        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMinX(0);
        graph.getViewport().setMaxX(4);

        graph.getGridLabelRenderer().setLabelVerticalWidth(100);

        // first mSeries is a line
        mSeries = new LineGraphSeries<>();
        mSeries.setDrawDataPoints(true);
        mSeries.setDrawBackground(true);
        graph.addSeries(mSeries);
    }
    @Override
    public void onResume() {
        mTimer = new Runnable() {
            @Override
            public void run() {
                graphLastXValue += 0.25d;
                mSeries.appendData(new DataPoint(graphLastXValue, getRandom()), true, 22);
                mHandler.postDelayed(this, 330);
            }
        };
        mHandler.postDelayed(mTimer, 1500);
        super.onResume();
    }
    @Override
    public void onPause() {
        mHandler.removeCallbacks(mTimer);
        super.onPause();
    }

    double mLastRandom = 2;
    Random mRand = new Random();
    private double getRandom() {
        return mLastRandom += mRand.nextDouble()*0.5 - 0.25;
    }
}
