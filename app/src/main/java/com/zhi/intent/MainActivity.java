package com.zhi.intent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    Button mBtnJump;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnJump = (Button) findViewById(R.id.btn_jump);
        mBtnJump.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_jump:
                jump();
                break;
        }
    }

    private void jump(){
        Intent intent  = new Intent();
        intent.setAction("com.zhi.meimei");
        intent.addCategory("com.zhi.yugong");
//        intent.setData(Uri.parse("zhi://www.zhi.com"));
        intent.setDataAndType(Uri.parse("zhi://www.zhi.com/zhi"), "image/png");
        startActivity(intent);
    }
}