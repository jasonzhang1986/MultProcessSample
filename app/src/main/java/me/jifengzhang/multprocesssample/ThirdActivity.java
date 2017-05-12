package me.jifengzhang.multprocesssample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

/**
 * Author: Jifeng Zhang
 * Email : jifengzhang.barlow@gmail.com
 * Date  : 2017/5/11
 * Desc  : public的多进程Activity
 */

public class ThirdActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode==KeyEvent.KEYCODE_DPAD_CENTER) {
            startActivity(new Intent(this, SecondActivity.class));
        }
        return super.onKeyDown(keyCode, event);
    }
}
