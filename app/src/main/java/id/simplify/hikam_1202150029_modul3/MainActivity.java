package id.simplify.hikam_1202150029_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Untuk mengenali user
    EditText user,pass;
    //Untuk melakukan aksi login
    Button log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText) findViewById(R.id.inus);
        pass = (EditText) findViewById(R.id.inpw);
        log = (Button) findViewById(R.id.loginbutton);
    }

    public void cobalogin(View view) {
        user = (EditText) findViewById(R.id.inus);
        pass = (EditText) findViewById(R.id.inpw);
        String a = user.getText().toString();
        String b = pass.getText().toString();
        if (a.equals("EAD") && b.equals("MOBILE")){
            Intent c = new Intent(this,Menu.class);
            startActivity(c);
            Toast.makeText(this,"Login Berhasil",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,"Login Gagal",Toast.LENGTH_SHORT).show();
        }
    }
}
