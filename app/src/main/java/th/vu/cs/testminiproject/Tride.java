package th.vu.cs.testminiproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by Rasta on 15/2/2560.
 */

public class Tride extends Activity {
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tride);

        Button btn = (Button)findViewById(R.id.button8);
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
