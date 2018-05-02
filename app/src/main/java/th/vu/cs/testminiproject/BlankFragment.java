package th.vu.cs.testminiproject;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View rootview = inflater.inflate(R.layout.fragment_blank, container,false);
        final Button btn1 = (Button) rootview.findViewById(R.id.button7);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newActivityReminder  = new Intent();
                newActivityReminder.setClass(getActivity(),Main2Activity.class);
                startActivity(newActivityReminder);
            }
        });


        return rootview;
    }

}
