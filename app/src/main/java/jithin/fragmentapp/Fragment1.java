package jithin.fragmentapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment1 extends Fragment implements FragListener {
    TextView tv;
    View v;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        v = inflater.inflate(R.layout.fragment_fragment1, container, false);
        tv = (TextView) v.findViewById(R.id.txtv);
        return v;

    }


    @Override
    public void addZero() {
        tv.setText("0");
    }

    @Override
    public void addValue() {

        int i = Integer.parseInt(tv.getText().toString());
        i++;
        tv.setText(String.valueOf(i));
    }

    @Override
    public void subValue() {

        int i = Integer.parseInt(tv.getText().toString());
        i--;
        tv.setText(String.valueOf(i));
    }
}
