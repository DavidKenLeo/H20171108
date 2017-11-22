package com.dkl.auser.h20171108;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.id;

public class DetailActivity extends AppCompatActivity {

    private TextView tvTel;
    private TextView tvName;
    private TextView tvId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvId = (TextView)findViewById(R.id.textView);
        tvName = (TextView)findViewById(R.id.textView2);
        tvTel = (TextView) findViewById(R.id.textView3);
        Intent it = getIntent();
        it.getIntExtra("id",-1);

    }
public void clickBack(View v){finish();}
    public void clickDelete(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(DetailActivity.this);
        builder.setTitle("刪除確認");
        builder.setMessage("請確認刪除");
        builder.setPositiveButton("刪除", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
//                SQLiteDatabase db = SQLiteDatabase.openDatabase(DBInfo.DB_FILE, null, SQLiteDatabase.OPEN_READWRITE);
//                db.delete("phone", "id=?", new String[] {String.valueOf(id)});
//                finish();
            }
            });

        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

    }
    public  void clickEdit(View v){
        Intent it = new Intent(this, EditActivity.class);
        Log.d("DATA", "send out id:" + id);
        it.putExtra("id", id);
        startActivity(it);

    }
}

