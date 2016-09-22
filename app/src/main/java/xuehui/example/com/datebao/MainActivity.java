package xuehui.example.com.datebao;

import android.content.Context;
import android.content.Intent;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;


public class MainActivity extends AppCompatActivity {
    private final static String TAG = "CXH";
    private Context mContext;
    private boolean mInitialized = false;
    private Camera mCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            mContext = getApplicationContext();
            SpeechUtility.createUtility(mContext, SpeechConstant.APPID + "=57de1007");
            setContentView(R.layout.activity_main);

            findViewById(R.id.action_btn).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, BalloonActivity.class);
                    startActivity(intent);
                }
            });
        } catch (Exception e) {
            Log.e(TAG, "MainActivity exception:", e);
        }
    }

}
