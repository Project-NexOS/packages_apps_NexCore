package com.nex.nexcore.fragments.about;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

public class CircularImageView extends AppCompatImageView {
    public CircularImageView(Context context) {
        super(context);
    }

    public CircularImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CircularImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Path path = new Path();
        float radius = Math.min(getWidth(), getHeight()) / 2.0f;
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, radius, Path.Direction.CCW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }
}
