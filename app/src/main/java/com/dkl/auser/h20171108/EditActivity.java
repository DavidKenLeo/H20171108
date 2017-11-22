package com.dkl.auser.h20171108;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity {

    private EditText ed4;
    private EditText ed3;
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        ed3 = (EditText)findViewById(R.id.editText3);
        ed4= (EditText)findViewById(R.id.editText4);
        Intent it = new Intent(this, EditActivity.class);
        Log.d("DATA", "send out id:" + id);
        it.getIntExtra("id", -1);
                        SQLiteDatabase db = SQLiteDatabase.openDatabase(DBInfo.DB_FILE, null, SQLiteDatabase.OPEN_READWRITE);
                Cursor c =  db.query("phone", new String[] {"id", "username", "tel"}, "id=?", new String[] {String.valueOf(id)}, null, null, null);

if(c.moveToFirst()){
    ed3.setText(c.getString(0));
    ed4.setText(c.getString(1));
}}
       public void clickUpdate(View v){
//           SQLiteDatabase db = SQLiteDatabase.openDatabase(DBInfo.DB_FILE, null, SQLiteDatabase.OPEN_READWRITE);
//           ContentValues cv = new ContentValues();
//           cv.put("username", ed3.getText().toString());
//           cv.put("tel", ed4.getText().toString());
//           db.update("phone", cv, "id=?", new String[] {String.valueOf(id)});
//           db.close();
           finish();


    }
    public void clickBack(View v)
    {
        finish();
    }

}

