package com.example.hp.listviewwithviewholder;

import android.content.Context;
import android.nfc.Tag;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import static com.example.hp.listviewwithviewholder.R.drawable.omar;

public class CustomAdapter extends ArrayAdapter {
    private Context context;
    private ArrayList<UserInfo> list;
    private ViewHolder viewholder;
    private static final String TAG = "omarsaleem";

    public CustomAdapter(@NonNull Context context, ArrayList<UserInfo> list) {
        super(context, R.layout.listitems, list);
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        UserInfo u = (UserInfo) getItem(position);
        if (convertView == null) {
            Log.i(TAG, "omar");
            viewholder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.listitems, parent, false);
            viewholder.textview1 = (TextView) convertView.findViewById(R.id.textView);
            viewholder.textview2 = (TextView) convertView.findViewById(R.id.textView2);
            viewholder.image1 = (ImageView) convertView.findViewById(R.id.imageView1);
            convertView.setTag(viewholder);
        }else {
            Log.i(TAG, "omarsal");
            viewholder = (ViewHolder) convertView.getTag();
        }
        viewholder.textview1.setText(u.getName());
        viewholder.textview2.setText(u.getContact());
        viewholder.image1.setImageResource(omar);

        return convertView;
    }
}
