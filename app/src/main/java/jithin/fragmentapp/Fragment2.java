package jithin.fragmentapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment2 extends Fragment {
    Button b1;
    Button b2;
    Button b3;
    View vw;
    MainActivity activity;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vw= inflater.inflate(R.layout.fragment_fragment2, container, false);
        b1=(Button)vw.findViewById(R.id.btn1);
        b2=(Button)vw.findViewById(R.id.btn2);
        b3=(Button)vw.findViewById(R.id.btn3);
        activity=(MainActivity)getActivity();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                activity.addZero();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.addValue();

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                activity.subValue();
            }
        });
        return vw;
    }



}
