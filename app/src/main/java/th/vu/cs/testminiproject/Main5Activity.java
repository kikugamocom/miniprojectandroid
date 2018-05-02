package th.vu.cs.testminiproject;

import android.app.LocalActivityManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Main5Activity extends AppCompatActivity {
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    private TabHost myTabHost;
    private LocalActivityManager myLocalActivitManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        myTabHost = (TabHost) findViewById(R.id.Tabhost);

        myLocalActivitManager = new LocalActivityManager(this,false);
        myTabHost.setup(myLocalActivitManager);
        myLocalActivitManager.dispatchCreate(savedInstanceState);

        TabHost.TabSpec spec;

        Intent goFirst = new Intent().setClass(this,FirstActivity.class);
        spec = myTabHost.newTabSpec("รายละเอียด").setIndicator("รายละเอียด",getResources().getDrawable(R.drawable.test1)).setContent(goFirst);
        myTabHost.addTab(spec);

        Intent goSecon = new Intent().setClass(this,SecondActivity.class);
        spec = myTabHost.newTabSpec("สรรพคุณ").setIndicator("สรรพคุณ",getResources().getDrawable(R.drawable.test2)).setContent(goSecon);
        myTabHost.addTab(spec);

        Intent gotrid = new Intent().setClass(this,Tride.class);
        spec = myTabHost.newTabSpec("สถานที่จัดจำหน่าย").setIndicator("สถานที่จัดจำหน่าย",getResources().getDrawable(R.drawable.test2)).setContent(gotrid);
        myTabHost.addTab(spec);





    }

    @Override
    protected void onPause() {
        super.onPause();

        myLocalActivitManager.dispatchPause(isFinishing());
    }

    @Override
    protected void onResume() {
        super.onResume();

        myLocalActivitManager.dispatchResume();
    }
}
