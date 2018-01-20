package com.example.syang.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button b1 = findViewById(R.id.button_1);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//                Toast.makeText(FirstActivity.this,
//                        "you click button 1", Toast.LENGTH_LONG)
//                        .show();
//                finish();

//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                startActivity(intent);
                Intent intent = new Intent("com.example.activitytest.ACTION_START");
                startActivity(intent);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "you can add", Toast.LENGTH_LONG)
                        .show();
            case R.id.remove_item:
                Toast.makeText(this, "you can remove", Toast.LENGTH_LONG)
                        .show();
            default:
        }

        return true;
    }


}
