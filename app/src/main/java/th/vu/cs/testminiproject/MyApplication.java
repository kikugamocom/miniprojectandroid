package th.vu.cs.testminiproject;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Rasta on 15/2/2560.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initFont();
    }
    private void initFont(){
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("WR Tish Smile.ttf").setFontAttrId(R.attr.fontPath).build());

    }

}
