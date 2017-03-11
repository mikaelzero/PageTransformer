package miaoyongjun.pagetransformer;

import android.support.v4.view.ViewPager;
import android.view.View;


public class DefaultPageTransformer implements ViewPager.PageTransformer {


    /**
     * Apply a property transformation to the given page.
     *
     * @param view     Apply the transformation to this page
     * @param position Position of page relative to the current front-and-center
     *                 position of the pager. 0 is front and center. 1 is one full
     */
    @Override
    public void transformPage(View view, float position) {
        view.setAlpha(1);
        view.setTranslationX(0);
        view.setTranslationY(0);
        view.setPivotX(view.getWidth() / 2);
        view.setPivotY(view.getHeight() / 2);
        view.setScaleX(1);
        view.setScaleY(1);
        view.setRotation(0);
    }
}