package miaoyongjun.pagetransformer;

import android.support.v4.view.ViewPager;

/**
 * Created by miaoyongjun.
 * Date:  2017/3/11
 */

public class MagicTransformer {
    public static ViewPager.PageTransformer getPageTransformer(TransitionEffect effect) {
        switch (effect) {
            case Default:
                return new DefaultPageTransformer();
            case Alpha:
                return new AlphaPageTransformer();
            case Rotate:
                return new RotatePageTransformer();
            case Cube:
                return new CubePageTransformer();
            case Flip:
                return new FlipPageTransformer();
            case Accordion:
                return new AccordionPageTransformer();
            case ZoomFade:
                return new ZoomFadePageTransformer();
            case Fade:
                return new FadePageTransformer();
            case ZoomCenter:
                return new ZoomCenterPageTransformer();
            case ZoomStack:
                return new ZoomStackPageTransformer();
            case Stack:
                return new StackPageTransformer();
            case Depth:
                return new DepthPageTransformer();
            case Zoom:
                return new ZoomPageTransformer();
            case InRightDown:
                return new InRightDownTransformer();
            case InRightUp:
                return new InRightUpTransformer();
            case SlowBackground:
                return new SlowBackgroundTransformer();
            default:
                return new DefaultPageTransformer();
        }
    }
}
