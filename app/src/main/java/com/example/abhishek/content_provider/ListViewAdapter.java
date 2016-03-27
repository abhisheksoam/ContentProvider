package com.example.abhishek.content_provider;

import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by abhishek on 17-10-2015.
 */
public class ListViewAdapter extends ArrayAdapter {
    Context context;
    public ListViewAdapter(Context context, int resource, Object[] objects) {
        super(context, resource, objects);
        this.context=context;
    }
}
