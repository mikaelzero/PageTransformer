package miaoyongjun.pagetransformer;

import android.view.View;


public class FlipPageTransformer extends BasePageTransformer {
    private static final float ROTATION = 180.0f;

    @Override
    public void handleInvisiblePage(View view, float position) {
    }

    @Override
    public void handleLeftPage(View view, float position) {
        view.setTranslationX(-view.getWidth() * position);
        float rotation = (ROTATION * position);
        view.setRotationY(rotation);
        view.setVisibility(position > -0.5 ? View.VISIBLE : View.INVISIBLE);
    }

    @Override
    public void handleRightPage(View view, float position) {
        view.setTranslationX(-view.getWidth() * position);
        float rotation = (ROTATION * position);
        view.setRotationY(rotation);
        view.setVisibility(position < 0.5 ? View.VISIBLE : View.INVISIBLE);
    }

}