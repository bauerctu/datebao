package xuehui.example.com.datebao;

import android.content.Context;
import android.content.Intent;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;


public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private boolean mInitialized = false;
    private Camera mCamera ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        init();
        setContentView(R.layout.activity_main);

        findViewById(R.id.action_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BalloonActivity.class);
                startActivity(intent);
            }
        });
    }

//    private void init() {
//        if (mInitialized) return;
//        mContext = getApplicationContext();
//        SpeechUtility.createUtility(mContext, SpeechConstant.APPID + "=57de1007");
//        mInitialized = true;
//    }
//
//    private void openCamera(){
//        mCamera = Camera.open(Camera.CameraInfo.CAMERA_FACING_FRONT);
//        Camera.Parameters params = mCamera.getParameters();
//        params.setPreviewFormat(ImageFormat.NV21);
//        params.setPreviewSize(640,480);
//        mCamera.setParameters(params);
//    }
}
