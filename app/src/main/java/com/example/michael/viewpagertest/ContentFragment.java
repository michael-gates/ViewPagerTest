package com.example.michael.viewpagertest;

//import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by michael on 27.11.2017.
 */

public class ContentFragment extends Fragment {
    private static int count = 0;
    String fragmentName;


    public ContentFragment() {
        super();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState != null) {
            fragmentName = savedInstanceState.getString("fragmentName");
        } else {
            fragmentName = "Item " + count;
        }

        count++;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FrameLayout frameLayout = (FrameLayout) inflater.inflate(R.layout.content_layout, container, false);

        TextView textView = new TextView(getContext());
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30f);
        textView.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
        textView.setHeight(ViewGroup.LayoutParams.MATCH_PARENT);
        textView.setText(fragmentName);

        frameLayout.addView(textView);

        return frameLayout;
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("fragmentName", fragmentName);
    }
}


