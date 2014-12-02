package com.yvo.plain_test;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;


public class MainActivity extends Activity {
    private FrameLayout mRelativeLayout;
    private int mMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRelativeLayout = (FrameLayout)findViewById(R.id.myLayout);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.myLayout, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

    public void onClickRed(View view)
    {
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.background_color_Red));
    }

    public void onClickRed(View view; int mMode)
    {
        switch (mMode)
        {
            case 1:
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.background_color_Red));
                break;
            case 2:
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.background_color_Yellow));
                break;
            case 3:
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.background_color_Green));
                break;
        }
    }

    public void onClickGreen(View view)
    {
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.background_color_Green));
    }

    public void onClickYellow(View view)
    {
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.background_color_Yellow));
    }
}
