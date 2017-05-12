package me.jifengzhang.multprocesssample;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.util.Log;

import java.util.List;

/**
 * Author: Jifeng Zhang
 * Email : jifengzhang.barlow@gmail.com
 * Date  : 2017/5/12
 * Desc  :
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("MyApplication","curProcess = " + getProcessName(this,Process.myPid()));
    }

    public static String getProcessName(Context context, int pid) {
        ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> list = manager.getRunningAppProcesses();
        if (list!=null) {
            for (ActivityManager.RunningAppProcessInfo processInfo : list) {
                if (processInfo!=null && processInfo.pid==pid) {
                    return processInfo.processName;
                }
            }
        }
        return null;
    }
}
