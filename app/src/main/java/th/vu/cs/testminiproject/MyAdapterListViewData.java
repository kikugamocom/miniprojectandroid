package th.vu.cs.testminiproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rasta on 14/2/2560.
 */

public class MyAdapterListViewData extends BaseAdapter {
    private LayoutInflater mInflater;
    private Context context;
    private Main6Activity control;

    private ArrayList<Memberdata> listdata = new ArrayList<Memberdata>(); // list nai gan gab data of Memberdata

    public MyAdapterListViewData(Main6Activity control, ArrayList<Memberdata> listdata) {


        this.control = control;
        this.context = control.getBaseContext();
        this.mInflater = LayoutInflater.from(context);
        this.listdata = listdata;

    }

    public int getCount() {  // method doo wa me data yoo nai list taorai

        return listdata.size();  // send kanad of List Tee gab data yoo
    }

    public Object getItem(int position) {

        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        HolderListAdapter holderListAdapter; // gab `lj;oxitdv[ `of list tae la un   ส่วนประกอบ

        if (convertView == null) {

            convertView = mInflater.inflate(R.layout.adapter_listview, null);
            holderListAdapter = new HolderListAdapter();


            holderListAdapter.txtName = (TextView) convertView.findViewById(R.id.txtname99);
            holderListAdapter.txtSurname = (TextView) convertView.findViewById(R.id.txtSurname1);
            //  holderListAdapter.txtAge = (TextView) convertView.findViewById(R.id.txtAge);
            //holderListAdapter.btnEdit = (Button) convertView.findViewById(R.id.button44);
            holderListAdapter.btnDelete = (Button) convertView.findViewById(R.id.button3);

            convertView.setTag(holderListAdapter);

        } else
            holderListAdapter = (HolderListAdapter) convertView.getTag();


        final int id = listdata.get(position).getId();    // dung data jak listdata ma sadang Tee la position
        final String name = listdata.get(position).getName();
        final String surname = listdata.get(position).getSurname();
        //  final int age = listdata.get(position).getAge();


        holderListAdapter.txtName.setText("ชื่อ : " + name);
        holderListAdapter.txtSurname.setText("ข้อความ : " + surname);
        // holderListAdapter.txtAge.setText("age : " + age);

        holderListAdapter.btnDelete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                control.deleteMember(id);
            }

        });

      /*  holderListAdapter.btnEdit.setOnClickListener(new View.OnClickListener() {  // cre Event hai pum edit
            public void onClick(View v) {

                //control.showEdit(id,name,surname);
                control.showEdit(id,name,surname);

            }

        });*/

        return convertView;
    }


}
