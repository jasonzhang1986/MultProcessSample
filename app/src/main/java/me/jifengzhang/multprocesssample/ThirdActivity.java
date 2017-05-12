package me.jifengzhang.multprocesssample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

/**
 * Author: Jifeng Zhang
 * Email : jifengzhang.barlow@gmail.com
 * Date  : 2017/5/11
 * Desc  : public的多进程Activity
 */

public class ThirdActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        findViewById(R.id.btn).setOnClickListener(this);
        Log.i("ThirdActivity","DataModel msg = " + DataModel.msg);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn:
                startActivity(new Intent(ThirdActivity.this, SecondActivity.class));
                break;
        }
    }
}
