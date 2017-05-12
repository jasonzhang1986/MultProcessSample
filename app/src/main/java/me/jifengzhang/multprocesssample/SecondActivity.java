package me.jifengzhang.multprocesssample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

/**
 * Author: Jifeng Zhang
 * Email : jifengzhang.barlow@gmail.com
 * Date  : 2017/5/11
 * Desc  :私有的多进程Activity
 */

public class SecondActivity extends Activity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findViewById(R.id.btn).setOnClickListener(this);
        Log.i("SecondActivity","DataModel msg = " + DataModel.msg);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn:
                startActivity(new Intent(SecondActivity.this, ThirdActivity.class));
                break;
        }
    }
}
