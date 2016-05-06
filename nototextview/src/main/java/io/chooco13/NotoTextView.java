package io.chooco13;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

public class NotoTextView extends TextView {
    public NotoTextView(Context context) {
        super(context);
        setType(context);
    }

    public NotoTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setType(context, attrs);
    }

    public NotoTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setType(context, attrs);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public NotoTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setType(context, attrs);
    }

    private void setType(Context context) {
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "NotoSansKR-Regular-Hestia.otf"));
    }

    private void setType(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs, R.styleable.NotoTextView, 0, 0);

        int fontWeight = typedArray.getInteger(R.styleable.NotoTextView_fontWeight, 0);
        switch (fontWeight) {
            case 0:
                this.setTypeface(Typeface.createFromAsset(context.getAssets(), "NotoSansKR-Thin-Hestia.otf"));
                break;
            case 1:
                this.setTypeface(Typeface.createFromAsset(context.getAssets(), "NotoSansKR-Light-Hestia.otf"));
                break;
            case 2:
                this.setTypeface(Typeface.createFromAsset(context.getAssets(), "NotoSansKR-DemiLight-Hestia.otf"));
                break;
            case 3:
                this.setTypeface(Typeface.createFromAsset(context.getAssets(), "NotoSansKR-Regular-Hestia.otf"));
                break;
            case 4:
                this.setTypeface(Typeface.createFromAsset(context.getAssets(), "NotoSansKR-Medium-Hestia.otf"));
                break;
            case 5:
                this.setTypeface(Typeface.createFromAsset(context.getAssets(), "NotoSansKR-Bold-Hestia.otf"));
                break;
            case 6:
                this.setTypeface(Typeface.createFromAsset(context.getAssets(), "NotoSansKR-Black-Hestia.otf"));
                break;
        }
    }
}
