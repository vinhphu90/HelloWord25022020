package com.examplevinhphutvp.helloword25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //khai báo biến

    Button mBtnShowAlert ;
    TextView mTvTitle ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 2:ánh xạ

        mBtnShowAlert = findViewById( R.id.buttonShow);
        mTvTitle = findViewById(R.id.textviewTitle);

        // 3 :chạy code
        //In ra trên máy ảo thong báo
        //built in function
//        Toast.makeText(MainActivity.this,"Hello", Toast.LENGTH_SHORT).show();
        // Kiem tra du lieu trong he thong


//        Log.d("BBB",a);
        //ctrl + p :gợi ý tham số truyền vào
        mBtnShowAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
