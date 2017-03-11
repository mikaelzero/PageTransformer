package miaoyongjun.pagetransformer;

import android.view.View;


public class ZoomPageTransformer extends BasePageTransformer {
    private float mMinScale = 0.85f;
    private float mMinAlpha = 0.65f;
    private boolean  isShowAlpha = true;

    public ZoomPageTransformer() {
    }

    public ZoomPageTransformer(boolean isShowAlpha) {
        this.isShowAlpha = isShowAlpha;
    }

    public ZoomPageTransformer(float minAlpha, float minScale) {
        setMinAlpha(minAlpha);
        setMinScale(minScale);
    }

    @Override
    public void handleInvisiblePage(View view, float position) {
        if (isShowAlpha)view.setAlpha(0);
    }

    @Override
    public void handleLeftPage(View view, float position) {
        handler(view, position);
    }

    @Override
    public void handleRightPage(View view, float position) {
        handler(view, position);
    }

    private void handler(View view, float position) {
        int pageWidth = view.getWidth();
        int pageHeight = view.getHeight();
        // Modify the default slide transition to shrink the page as well
        float scaleFactor = Math.max(mMinScale, 1 - Math.abs(position));
        float vertMargin = pageHeight * (1 - scaleFactor) / 2;
        float horzMargin = pageWidth * (1 - scaleFactor) / 2;
        if (position < 0) {
            view.setTranslationX(horzMargin - vertMargin / 2);
        } else {
            view.setTranslationX(-horzMargin + vertMargin / 2);
        }

        // Scale the page down (between MIN_SCALE and 1)
        view.setScaleX(scaleFactor);
        view.setScaleY(scaleFactor);

        // Fade the page relative to its size.
        if (isShowAlpha){
            view.setAlpha(mMinAlpha +
                    (scaleFactor - mMinScale) /
                            (1 - mMinScale) * (1 - mMinAlpha));
        }
    }

    public void setMinAlpha(float minAlpha) {
        mMinAlpha = minAlpha;
    }

    public void setMinScale(float minScale) {
        mMinScale = minScale;
    }
}