# PageTransformer  [![](https://jitpack.io/v/miaoyongjun/PageTransformer.svg)](https://jitpack.io/#miaoyongjun/PageTransformer)


## Usage

#### Add it in your root build.gradle at the end of repositories:

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

#### Add the dependency:

```
	dependencies {
	        compile 'com.github.miaoyongjun:PageTransformer:1.0'
	}
```

#### java code:

```
viewPager.setPageTransformer(true, MagicTransformer.getPageTransformer(TransitionEffect.SlowBackground));
```

## Demo

![enter image description here](https://github.com/miaoyongjun/PageTransformer/blob/master/slow.gif?raw=true)
![enter image description here](https://github.com/miaoyongjun/PageTransformer/blob/master/zoom.gif?raw=true)

![enter image description here](https://github.com/miaoyongjun/PageTransformer/blob/master/cube.gif?raw=true)
![enter image description here](https://github.com/miaoyongjun/PageTransformer/blob/master/depth.gif?raw=true)


## Detail

```
public enum TransitionEffect {
    Default,
    //透明度变换
    Alpha,
    //旋转变换
    Rotate,
    //3D旋转
    Cube,
    Flip,
    //折叠变换
    Accordion,
    ZoomFade,
    Fade,
    ZoomCenter,
    ZoomStack,
    Stack,
    Depth,
    Zoom,
    InRightDown,
    InRightUp,
    //视觉差变换
    SlowBackground
}
```

### SlowBackground

add ImageView in your rootView

```
<FrameLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:scaleType="centerCrop"/>

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

    </RelativeLayout>


</FrameLayout>

```

## Thanks
[JazzyViewPager](https://github.com/jfeinstein10/JazzyViewPager)
[BGABanner-Android](https://github.com/bingoogolapple/BGABanner-Android)
