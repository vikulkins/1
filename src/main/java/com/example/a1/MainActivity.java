package com.example.a1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    Context context = MainActivity.this;
    int duration = Toast.LENGTH_SHORT;
    private final String TAG = this.getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(context, "onCreate", duration).show();
        Log.i(TAG, "onCreateLog");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(context, "onStart", duration).show();
        Log.e(TAG, "onStartLog");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(context, "onStop", duration).show();
        Log.w(TAG, "onStopLog");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(context, "onRestart", duration).show();
        Log.e(TAG, "onRestartLog");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(context, "onPause", duration).show();
        Log.v(TAG, "onPauseLog");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(context, "onDestroy", duration).show();
        Log.d(TAG, "onDestroyLog");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(context, "onResume", duration).show();
        Log.i(TAG, "onResumeLog");
    }
}