package th.vu.cs.testminiproject;

/**
 * Created by Rasta on 13/2/2560.
 */

public class Data {

    private String mText1; // สำหรับเห็บ title
    private String mText2; // สำหรับเก็บ description
    private int mIcon;      // สำหรับเก็บ id icon

    public Data(String Text1,String Text2,int Icon){
        this.mIcon = Icon;
        this.mText1 = Text1;
        this.mText2 = Text2;
    }

    public String getmText1(){   // get คือเอาข้อมุลมาแสดง
        return  mText1;
    }

    public void setmText1(String mText1){   // เอาข้อมูลไปเก็บในตัวแปะ
        this.mText1 = mText1;
    }

    public String getmText2(){
        return mText2;
    }

    public void setmText2(String mText2){
        this.mText2 = mText2;
    }

    public int getmIcon(){
        return mIcon;
    }
    public void setmIcon(int mIcon){
        this.mIcon = mIcon;
    }












}
