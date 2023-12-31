package com.kimganteng.myapplication;

import static com.kimganteng.myapplication.SettingsAlien.BackupBanner;
import static com.kimganteng.myapplication.SettingsAlien.BackupNatives;
import static com.kimganteng.myapplication.SettingsAlien.MainBanner;
import static com.kimganteng.myapplication.SettingsAlien.MainNatives;
import static com.kimganteng.myapplication.SettingsAlien.Select_Backup_Ads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.aliendroid.alienads.AliendroidBanner;
import com.aliendroid.alienads.AliendroidNative;
import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesAdmob;

public class NativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native);

        RelativeLayout layMediumAds = findViewById(R.id.layMediumNatives);
        AliendroidNative.MediumNativeAdmob(this, layMediumAds,Select_Backup_Ads,MainNatives,BackupNatives,
                "","","","","");
        AliendroidNative.onLoadMediumNativesAdmob = new OnLoadMediumNativesAdmob() {
            @Override
            public void onNativeAdLoaded() {
                Toast.makeText(NativeActivity.this,"Iklan Terload",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdFailedToLoad(String error) {
                Toast.makeText(NativeActivity.this,"Iklan Gagal Terload",
                        Toast.LENGTH_SHORT).show();
            }
        };

    }
}