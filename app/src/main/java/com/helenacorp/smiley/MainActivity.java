package com.helenacorp.smiley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.cipherthinkers.shapeflyer.ShapeFlyer;
import com.cipherthinkers.shapeflyer.flyschool.FPoint;
import com.cipherthinkers.shapeflyer.flyschool.FlyBluePrint;
import com.cipherthinkers.shapeflyer.flyschool.FlyPath;
import com.nacho91.panningview.HorizontalPanning;
import com.nacho91.panningview.PanningView;
import com.thunderrise.animations.FlipAnimation;
import com.thunderrise.animations.PulseAnimation;
import com.thunderrise.animations.RotateAnimation;
import com.thunderrise.animations.ShakeAnimation;

import static com.helenacorp.smiley.R.drawable.jj21;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        HorizontalPanning panning = new HorizontalPanning(HorizontalPanning.LEFT_TO_RIGHT);
        PanningView JJ = (PanningView) findViewById(R.id.JJ);
        JJ.setPanning(panning);
        JJ.start();

        //ImageView JJ = (ImageView)findViewById(R.id.JJ);

        FlipAnimation.create().with(JJ)
                .setRepeatCount(PulseAnimation.INFINITE)
                .setDuration(2000)
                .start();
       /* RotateAnimation.create().with(JJ)
                .setRepeatCount(RotateAnimation.INFINITE)
                .start(); */


    }
}
