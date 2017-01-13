package com.alex.tinkerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alex.tinkerdemo.tinker.util.Utils;
import com.tencent.tinker.lib.tinker.TinkerInstaller;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 加载补丁包
        TinkerInstaller.onReceiveUpgradePatch(getApplicationContext(), "/sdcard/mdtinker.apk");

        // 清除补丁包
        //Tinker.with(getApplicationContext()).cleanPatch();
    }

    /**
     * =====================Tinker 默认配置========================
     */

    protected void onResume() {
        super.onResume();
        Utils.setBackground(false);

    }

    @Override
    protected void onPause() {
        super.onPause();
        Utils.setBackground(true);
    }
}
