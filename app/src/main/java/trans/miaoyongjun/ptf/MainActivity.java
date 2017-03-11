package trans.miaoyongjun.ptf;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import miaoyongjun.pagetransformer.TransitionEffect;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.slowBtn).setOnClickListener(this);
        findViewById(R.id.zoom).setOnClickListener(this);
        findViewById(R.id.zoomStack).setOnClickListener(this);
        findViewById(R.id.cube).setOnClickListener(this);
        findViewById(R.id.depth).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.slowBtn:
                ShowActivity.transitionEffect = TransitionEffect.SlowBackground;
                startActivity(new Intent(MainActivity.this, ShowActivity.class));
                break;
            case R.id.zoom:
                ShowZoomActivity.transitionEffect = TransitionEffect.Zoom;
                startActivity(new Intent(MainActivity.this, ShowZoomActivity.class));
                break;
            case R.id.zoomStack:
                ShowActivity.transitionEffect = TransitionEffect.ZoomStack;
                startActivity(new Intent(MainActivity.this, ShowActivity.class));
                break;
            case R.id.cube:
                ShowActivity.transitionEffect = TransitionEffect.Cube;
                startActivity(new Intent(MainActivity.this, ShowActivity.class));
                break;
            case R.id.depth:
                ShowActivity.transitionEffect = TransitionEffect.Depth;
                startActivity(new Intent(MainActivity.this, ShowActivity.class));
                break;
        }
    }
}
