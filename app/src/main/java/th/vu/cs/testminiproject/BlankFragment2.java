package th.vu.cs.testminiproject;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment2 extends Fragment {


    public BlankFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        //Button button = (Button)inflater.findViewById(R.id.button5);
        View rootview = inflater.inflate(R.layout.fragment_blank_fragment2, container,false);
        final Button btn1 = (Button) rootview.findViewById(R.id.button5);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivityReminder  = new Intent();
                newActivityReminder.setClass(getActivity(),MainActivity.class);
                startActivity(newActivityReminder);
            }
        });


        return rootview;
    }




    }

