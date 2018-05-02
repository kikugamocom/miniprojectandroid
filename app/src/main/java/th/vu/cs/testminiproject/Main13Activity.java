package th.vu.cs.testminiproject;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Main13Activity extends AppCompatActivity {
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        TabHost tabHost = (TabHost) findViewById(R.id.TabHost13);
        tabHost.setup();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("รายละเอียด");
        tabSpec.setContent(R.id.tab1);
        tabSpec.setIndicator("รายละเอียด");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("สรรพคุณ");
        tabSpec.setContent(R.id.tab2);
        tabSpec.setIndicator("สรรพคุณ");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("สถานที่จัดจำหน่าย");
        tabSpec.setContent(R.id.tab3);
        tabSpec.setIndicator("สถานที่จัดจำหน่าย");
        tabHost.addTab(tabSpec);

        Button btn = (Button)findViewById(R.id.button11);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lat = "14.9298004" ;  // ละติจูดสมมุติ
                String lng = "101.9687575";  // ลองติจูดสมมุติ
                String strUri = "http://maps.google.com/maps?q=loc:"+ lat + "," + lng + "(ไม้ดอกไม้ประดับ)";
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));  // เรียกใช้ ACTION_VIEW แล้วก็ไปเปิด strUri
                intent.setClassName("com.google.android.apps.maps" , "com.google.android.maps.MapsActivity");   // setclass
                startActivity(intent);
            }
        });
    }
}
