package th.vu.cs.testminiproject;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {

    Button Btch1,Btch2,Btch3,Btch4;
    ImageButton Btspeaker;
    ImageView Image;
    int questionCount = 10; //ใช้ในการนับ จำนวนคำถาม
    ArrayList<Integer> IDchoice = new ArrayList<Integer>(); // ใช้เก็บจำนวนข้อคำถาม สุ่มลำดับในการแสดงคำถาม
    String Answer; //แสดงคำตอบ
    int score = 0; // ใช้ในการเก็บคะแนน
    //MediaPlayer mPlayer;
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Btch1 = (Button)findViewById(R.id.button); // เชื่อมปุ่ม
        Btch2 = (Button)findViewById(R.id.button2);
        Btch3 = (Button)findViewById(R.id.button3);
        Btch4 = (Button)findViewById(R.id.button4);
        // Btspeaker = (ImageButton)findViewById(R.id.imageButton);
        Image = (ImageView)findViewById(R.id.imageView);



        for(int i = 1; i <= questionCount;i++)
            IDchoice.add(i);
            Collections.shuffle(IDchoice); // คำสั่งสุ่ม สัลบข้อ
            setQuestion(IDchoice.remove(0));

    }
    private void setQuestion(int IDchoice){


        if(IDchoice == 1){

            Answer = "หัวหอม";
            Image.setImageResource(R.drawable.test3);
            //mPlayer = MediaPlayer.create(this,R.raw.birds);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("หัวหอม");
            choice.add("หัวปลี");
            choice.add("หัวไซเท้า");
            choice.add("หัวผักกาด");
            Collections.shuffle(choice); // โค้ดสลับ ช้อย
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));



            //mPlayer.start();
        }

        if(IDchoice == 2){

            Answer = "ผักชี";
            Image.setImageResource(R.drawable.test6);
            //mPlayer = MediaPlayer.create(this,R.raw.bear);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ผักชี");
            choice.add("ผักคะน้า");
            choice.add("ผักบุ้ง");
            choice.add("ผักตำลึง");
            Collections.shuffle(choice); // โค้ดสลับ ช้อย
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
            // mPlayer.start();
        }
        if(IDchoice == 3){

            Answer = "ดอกทานตะวัน";
            Image.setImageResource(R.drawable.test19);
            // mPlayer = MediaPlayer.create(this,R.raw.cow);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ดอกทานตะวัน");
            choice.add("ดอกมะลิ");
            choice.add("ดอกเฟื่องฟ้า");
            choice.add("ดอกชมมะนาด");
            Collections.shuffle(choice); // โค้ดสลับ ช้อย
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
            // mPlayer.start();

        }

        if(IDchoice == 4){

            Answer = "ทุเรียน";
            Image.setImageResource(R.drawable.test8);
            //mPlayer = MediaPlayer.create(this,R.raw.cow);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ทุเรียน");
            choice.add("เงาะ");
            choice.add("ระกำ");
            choice.add("สละ");
            Collections.shuffle(choice); // โค้ดสลับ ช้อย
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
            // mPlayer.start();

        }
        if(IDchoice == 5){

            Answer = "เห็ด";
            Image.setImageResource(R.drawable.test20);
            //  mPlayer = MediaPlayer.create(this,R.raw.birds);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("เห็ด");
            choice.add("ใบบัว");
            choice.add("ตะไคร้");
            choice.add("กระเพรา");
            Collections.shuffle(choice); // โค้ดสลับ ช้อย
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
            // mPlayer.start();
        }
        if(IDchoice == 6){

            Answer = "น้อยหน่า";
            Image.setImageResource(R.drawable.test17);
            // mPlayer = MediaPlayer.create(this,R.raw.birds);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("น้อยหน่า");
            choice.add("แตงโม");
            choice.add("ส้มโอ");
            choice.add("ขนุน");
            Collections.shuffle(choice); // โค้ดสลับ ช้อย
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
            // mPlayer.start();
        }
        if(IDchoice == 7){

            Answer = "ต้นตาล";
            Image.setImageResource(R.drawable.test11);
            // mPlayer = MediaPlayer.create(this,R.raw.birds);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ต้นตาล");
            choice.add("ต้นกล้วย");
            choice.add("ต้นมะขาม");
            choice.add("ต้นมะม่วง");
            Collections.shuffle(choice); // โค้ดสลับ ช้อย
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
            //  mPlayer.start();
        }
        if(IDchoice == 8){

            Answer = "มะพร้าว";
            Image.setImageResource(R.drawable.test18);
            //  mPlayer = MediaPlayer.create(this,R.raw.birds);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("มะหร้าว");
            choice.add("มะเฟื่อง");
            choice.add("มะไฟ");
            choice.add("มะนาว");
            Collections.shuffle(choice); // โค้ดสลับ ช้อย
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
            //  mPlayer.start();
        }
        if(IDchoice == 9){

            Answer = "กุหลาบ";
            Image.setImageResource(R.drawable.test16);
            // mPlayer = MediaPlayer.create(this,R.raw.birds);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("กุหลาบ");
            choice.add("ดอกขจร");
            choice.add("ดาวเรือง");
            choice.add("กล้วยไม้");
            Collections.shuffle(choice); // โค้ดสลับ ช้อย
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
            //   mPlayer.start();
        }
        if(IDchoice == 10){

            Answer = "ดอกประดู่";
            Image.setImageResource(R.drawable.test15);
            //  mPlayer = MediaPlayer.create(this,R.raw.birds);
            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ดอกประดู่");
            choice.add("ดอกป๊อปปี้");
            choice.add("ดอกพุทธรักษา");
            choice.add("ดอกราชพฤกษ์");
            Collections.shuffle(choice); // โค้ดสลับ ช้อย
            Btch1.setText(choice.remove(0));
            Btch2.setText(choice.remove(0));
            Btch3.setText(choice.remove(0));
            Btch4.setText(choice.remove(0));
            //  mPlayer.start();
        }
    }

    public void choiceAns(View v){
        Button b = (Button) v;

        String buttonText = b.getText().toString();
        if(buttonText.equals(Answer)){
           //Toast myToast = Toast.makeText(getApplicationContext(),"eiei",Toast.LENGTH_SHORT);
           // myToast.show();
           /* AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //builder.setTitle("แจ้งเตือน");
            builder.setMessage("เก่งเหมือนกันนะเรา");
            builder.setCancelable(false);
            builder.setPositiveButton("ลุยต่อเบย", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });

            builder.show();*/

            score++;
        }
        if(IDchoice.isEmpty()){
            DialogBox();
        }
        else{
            setQuestion(IDchoice.remove(0));
        }

    }


    private void DialogBox(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("แจ้งเตือน");
        builder.setMessage("คุนได้คะแนน"+ score +"คะแนน")
                .setCancelable(false)
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {

                        finish();
                    }
                })
                .setNegativeButton("REPLAY", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {

                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);

                    }
                });



        AlertDialog alert = builder.create();
        alert.show();


    }



    // public  void playsound(View v ){

    //mPlayer.start();
    // }
}
