package th.vu.cs.testminiproject;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class Main6Activity extends AppCompatActivity {


    private EditText txtName, txtSurname, txtAge;  // value listview
    private Button btnAdd;  // value listview
    private ListView listMember;   // value listview
    private int id;

    private ArrayList<Memberdata> listData = new ArrayList<Memberdata>(); // list geb data of Memberdata


    private DatabaseHelper databaseHelper;   // tua jud gan database
    private SQLiteDatabase database;
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        txtName = (EditText) findViewById(R.id.txtname);
        txtSurname = (EditText) findViewById(R.id.txtSurname);
       // txtAge = (EditText) findViewById(R.id.txtAge);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        listMember = (ListView) findViewById(R.id.Listview1);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addmember();
            }
        });


        databaseHelper = new DatabaseHelper(this);  // cre tua jud gan data
        database = databaseHelper.getWritableDatabase();  // tua jud gan database ma use


        showList();

    } // end of protected void onCreate

    private void addmember() {

        if (txtName.length() > 0 && txtSurname.length() > 0) {
            // ContentValues = databox     g9iup,` data pai nai table
            ContentValues values = new ContentValues();
            values.put("name", txtName.getText().toString());
            values.put("surname", txtSurname.getText().toString());
           // values.put("age", txtAge.getText().toString());

            database.insert("member", null, values); // tum gan gab data pai nai table

            Toast.makeText(this, "Add Data Complete", Toast.LENGTH_LONG).show();


            txtName.setText("");
            txtSurname.setText("");
            //txtAge.setText("");

            // listData.add(new MemberData("asdasd","asdasd"));
            showList();


        } else
            Toast.makeText(this, "Please Input Data", Toast.LENGTH_SHORT).show();
    } // end of  private void addmember()

    private void showList() {

        getMember();

        listMember.setAdapter(new MyAdapterListViewData(this, listData));
    }


    private void getMember() {

        Cursor mCursor = database.query(true, "member", new String[]{"id", "name", "surname"}, null, null, null, null, null, null); // Cursor mCursor = database.ravQuery("SELECT * FROM member", null);
        if (mCursor != null) {
            mCursor.moveToFirst();
            listData.clear();

            if (mCursor.getCount() > 0) { // if have data ja tum gan gab data sai List for num pai sadang
                do {
                    int id = mCursor.getInt(mCursor.getColumnIndex("id"));
                    String name = mCursor.getString(mCursor.getColumnIndex("name"));
                    String surname = mCursor.getString(mCursor.getColumnIndex("surname"));
                  //  int age = mCursor.getInt(mCursor.getColumnIndex("age"));

                    listData.add(new Memberdata(id,name,surname));

                } while (mCursor.moveToNext());


            }  // end of if(mCursor.getCount() > 0)
        } // end of if(mCursor != null)
    }  // end of private void getMember()


    public void editMember(int id, String name, String surname) { // method edit SQLite
        ContentValues values = new ContentValues(); // g9iup, value for tum gan edit  เตรียม
        values.put("id", id);
        values.put("name", name);
        values.put("surname", surname);
        //values.put("age", age);

        database.update("member", values, "id = ?", new String[]{"" + id}); // hai database tum gan edit data Tee id gumnod

        showList(); // sadang data lasood


    }

    public void deleteMember(int id) {
        database.delete("member", "id = " + id, null);
        Toast.makeText(this, "Delete Data Id " + id + "Complete", Toast.LENGTH_LONG).show();
        showList();

    }

    public void showEdit( int id,String name, String surname) {
        Intent i = new Intent(this, EditActivity.class);
        i.putExtra("keyId", id); // tum gan send value
        i.putExtra("keyName", name);
        i.putExtra("keySurname", surname);
       // i.putExtra("keyAge", age);

        startActivityForResult(i, 1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {

        // if gab ma nar MainActivity law Result gan tumwork somboon
        if (requestCode == 1 && resultCode == RESULT_OK) {
            // gab value Tee send gab ma sai tuapab
            int id = intent.getExtras().getInt("keyId");
            String name = intent.getExtras().getString("keyName");
            String surname = intent.getExtras().getString("keySurname");
           // int age = intent.getExtras().getInt("keyAge");  // nai gan send and rub value


            editMember(id, name, surname); // hai edit data member

        }
    }




    }

