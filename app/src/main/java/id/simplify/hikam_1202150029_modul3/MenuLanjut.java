package id.simplify.hikam_1202150029_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MenuLanjut extends AppCompatActivity {
    ImageView imgview, imageView2;
    TextView tx1,tx2;

    public ArrayList<Integer> btr;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_lanjut);
        String nama = getIntent().getStringExtra("nama");
        String desc = getIntent().getStringExtra("desc");

        imgview = (ImageView)findViewById(R.id.potodari);
        tx1 =(TextView)findViewById(R.id.judul1);
        tx1.setText(nama.toString());
        tx2 =(TextView)findViewById(R.id.deskrip);
        tx2.setText(desc.toString());
        imageView2 = (ImageView)findViewById(R.id.for_card);


        btr = new ArrayList<>();
        btr.add(R.drawable.ic_battery_2);
        btr.add(R.drawable.ic_battery_3);
        btr.add(R.drawable.ic_battery_5);
        btr.add(R.drawable.ic_battery_6);
        btr.add(R.drawable.ic_battery_8);
        btr.add(R.drawable.ic_battery_9);
        btr.add(R.drawable.ic_battery_f);
        imageView2.setImageResource(btr.get(count));
    }

    public void add(View view) {
        if (count==6){
            Toast.makeText(this,"Air Sudah Penuh",Toast.LENGTH_SHORT).show();
        }else {
            count++;
            imageView2.setImageResource(btr.get(count));
        }
    }

    public void minus(View view) {
        if(count==0){
            Toast.makeText(this,"Air tinggal sedikit",Toast.LENGTH_SHORT).show();
        }
        else {
            count--;
            imageView2.setImageResource(btr.get(count));
        }
    }
    }

