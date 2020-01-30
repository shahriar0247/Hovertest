package com.shahriar.xen.hovertest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public TextView textView;
    public TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        askForSystemOverlayPermission();
        Intent svc = new Intent(this, OverlayShowingService.class);
        startService(svc);
        finish();
//

//
//      textView = findViewById(R.id.textView);
//      textView2 = findViewById(R.id.textView2);
//
//        findViewById(R.id.textView3).setOnHoverListener(new View.OnHoverListener() {
//            @Override
//            public boolean onHover(View v, MotionEvent event) {
//                int x1 = (int)event.getX();
//                int y1 = (int)event.getY();
//                textView2.setText("x: " + x1 + "y: " + y1);
//                return false;
//
//            }
//        });
//
  }
//
//
//    public boolean onTouchEvent(MotionEvent event)
//    {
//        int x = (int)event.getX();
//        int y = (int)event.getY();
//
//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//            case MotionEvent.ACTION_MOVE:
//            case MotionEvent.ACTION_UP:
//        }
//        textView.setText("x: " + x + "y: " + y);
//        return false;
//    }
    void askForSystemOverlayPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && !Settings.canDrawOverlays(this)) {

            //If the draw over permission is not available to open the settings screen
            //to grant the permission.
            Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                    Uri.parse("package:" + getPackageName()));

        }

}}
