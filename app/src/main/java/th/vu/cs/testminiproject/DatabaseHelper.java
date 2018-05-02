package th.vu.cs.testminiproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Rasta on 14/2/2560.
 */

public class DatabaseHelper extends SQLiteOpenHelper{
    private static final String DB_NAME = "memberDB";
    private static final int DB_VERSION = 1;


    private static final  String DB_CREATE = ""+ "CREATE TABLE member " +
            "("+ "id INTEGER PRIMARY KEY,"+"name TEXT NOT NULL," +
            ""+"surname TEXT NOT NULL);";  // code create database

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);  // send to database
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { // pim loag for see wa me gan Upgrade Database

        Log.v(DatabaseHelper.class.getName(),"Upgread database version from version"+ oldVersion + "to"+ newVersion + ",which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS member"); // delete table member old ting    //EXISTS is same
        onCreate(db);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(DB_CREATE);


    }








}
