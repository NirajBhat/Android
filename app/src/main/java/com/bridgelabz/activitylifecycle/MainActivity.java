package com.bridgelabz.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate invoked");
        Toast.makeText(MainActivity.this,"onCreate",Toast.LENGTH_LONG).show();
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d("lifecycle", "onStart invoked ");
        Toast.makeText(MainActivity.this,"onStart",Toast.LENGTH_LONG).show();
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d("lifcycle", "onResume invoked");
        Toast.makeText(MainActivity.this,"onResume",Toast.LENGTH_LONG).show();
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d("lifcycle", "onPause invoked");
        Toast.makeText(MainActivity.this,"onPause",Toast.LENGTH_LONG).show();
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d("lifcycle", "onStop invoked");
        Toast.makeText(MainActivity.this,"onStop",Toast.LENGTH_LONG).show();
    }
    @Override
    public void onRestart(){
        super.onRestart();
        Log.d("lifcycle", "onRestart invoked");
        Toast.makeText(MainActivity.this,"onRestart",Toast.LENGTH_LONG).show();
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("lifcycle", "onDestroy invoked");
        Toast.makeText(MainActivity.this,"onDestroy",Toast.LENGTH_LONG).show();
    }
}
