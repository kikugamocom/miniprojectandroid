package th.vu.cs.testminiproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Main2Activity extends AppCompatActivity  implements AdapterView.OnItemClickListener {
    private List<Data> datas = new ArrayList<>();
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        datas.add(new Data("ต้นมะม่วง","",R.mipmap.test98));
        datas.add(new Data("ต้นมะยม","",R.mipmap.test99));
        datas.add(new Data("ต้นทับทิม","",R.mipmap.test97));
        datas.add(new Data("ต้นพุทรา","",R.mipmap.test96));
        datas.add(new Data("ต้นส้ม","",R.mipmap.test95));
        datas.add(new Data("ต้นมะขาม","",R.mipmap.test94));
        datas.add(new Data("ต้นขนุน","",R.mipmap.test93));
        datas.add(new Data("ต้นฝรั่ง","",R.mipmap.test92));
        datas.add(new Data("ต้นกล้วย","",R.mipmap.test91));



        MyAdapter adapter = new MyAdapter(this,datas);
        ListView lv = (ListView)findViewById(R.id.Listview);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);





    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(this,"YOU CLICK : "+"" + datas.get(position).getmText1(),Toast.LENGTH_LONG).show();

        switch (position){
            case 0:
                Intent intent1 = new Intent(getApplicationContext(), Main5Activity.class);
                startActivity(intent1);
                break;
            case 1:
                Intent intent2 = new Intent(getApplicationContext(), Main7Activity.class);
                startActivity(intent2);
                break;
            case 2:
                Intent intent3 = new Intent(getApplicationContext(), Main8Activity.class);
                startActivity(intent3);
                break;
            case 3:
                Intent intent4 = new Intent(getApplicationContext(), Main9Activity.class);
                startActivity(intent4);
                break;
            case 4:
                Intent intent5 = new Intent(getApplicationContext(), Main10Activity.class);
                startActivity(intent5);
                break;
            case 5:
                Intent intent6 = new Intent(getApplicationContext(), Main11Activity.class);
                startActivity(intent6);
                break;
            case 6:
                Intent intent7 = new Intent(getApplicationContext(), Main12Activity.class);
                startActivity(intent7);
                break;
            case 7:
                Intent intent8 = new Intent(getApplicationContext(), Main13Activity.class);
                startActivity(intent8);
                break;
            case 8:
                Intent intent9 = new Intent(getApplicationContext(), Main14Activity.class);
                startActivity(intent9);
                break;




        }

    }
}
