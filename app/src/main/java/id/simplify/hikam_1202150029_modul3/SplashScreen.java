package id.simplify.hikam_1202150029_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_DISPLAY_LENGTH = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getSupportActionBar().hide();
        setContentView(R.layout.activity_splash_screen);
        /*memperbolehkan menjalankan method setelah durasi SPLASH_DISPLAY_LENGTH habis*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(SplashScreen.this,MainActivity.class);
                SplashScreen.this.startActivity(mainIntent); //menjalankan intent ke aktivitas utama//
                SplashScreen.this.finish();

            }
        }, SPLASH_DISPLAY_LENGTH); //setting timer//

    }
}
