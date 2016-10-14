package com.example.lenovo.fulicenter.views;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.example.lenovo.fulicenter.R;

import cn.ucai.fulicenter.R;

/**
 * Created by clawpo on 16/8/3.
 */
public class DisplayUtils {
    public static void initBack(final Activity activity){
        activity.findViewById(R.id.backClickArea).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.finish();
            }
        });
    }

    public static void initBackWithTitle(final Activity activity, final String title){
        initBack(activity);
        ((TextView)activity.findViewById(R.id.tv_common_title)).setText(title);
    }
}
