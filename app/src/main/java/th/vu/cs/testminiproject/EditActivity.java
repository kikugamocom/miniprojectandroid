package th.vu.cs.testminiproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Rasta on 14/2/2560.
 */

public class EditActivity extends Activity{

    private EditText txtName,txtSurname,txtAge;
    private Button btnEdit;

    private int id;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        txtName = (EditText)findViewById(R.id.editname);
        txtSurname = (EditText)findViewById(R.id.editsurname);
        //txtAge = (EditText)findViewById(R.id.editage);
        btnEdit = (Button)findViewById(R.id.button22);

        // rub value jak MainActivity ma sadand data for tum gan edit
        this.id = getIntent().getExtras().getInt("keyId");
        txtName.setText(getIntent().getExtras().getString("keyName"));
        txtSurname.setText(getIntent().getExtras().getString("keySurname"));
        // txtAge.setText(""+getIntent().getExtras().getInt("keyAge"));


        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                //Intent i = new Intent(this,EditActivity.class);

                setResult(RESULT_OK,i); // setting result gan work wa RESULT_OK

                // send data back pai hai MainActivity tum gan edit data hai
                i.putExtra("keyId", id);
                i.putExtra("keyName", txtName.getText().toString());
                i.putExtra("keySurname", txtSurname.getText().toString());
                //i.putExtra("keyAge", Integer.parseInt(txtAge.getText().toString()));
                startActivityForResult(i,1);

                finish();
            }
        });









    }


}
