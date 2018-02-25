package id.simplify.hikam_1202150029_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {
    private final LinkedList<String> name = new LinkedList<>();
    private final LinkedList<String> desq = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();

    private RecyclerView mRecyclerView;
    private RecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new RecyclerViewAdapter(this, name, desq, photos);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void dummiesData() {
        for (int i = 0; i < 10; i++) {//pengulangan untuk menghasilkan data yang banyak
            name.add("Aqua"); //untuk menambah merk minuman
            name.add("Amidis");
            name.add("Ades");
            name.add("Le Minerale");
            name.add("Cleo");
            name.add("Club");
            name.add("Equil");
            name.add("Evian");
            name.add("Nestle");
            name.add("Pristine");
            name.add("Vit");


            desq.add("Merek 1"); //untuk menambah deskripsi
            desq.add("Merek 2");
            desq.add("Merek 3");
            desq.add("Merek 4");
            desq.add("Merek 5");
            desq.add("Merek 6");
            desq.add("Merek 7");
            desq.add("Merek 8");
            desq.add("Merek 9");
            desq.add("Merek 10");
            desq.add("Merek 11");

            photos.add(R.drawable.aqua); //untuk menambahkan foto
            photos.add(R.drawable.amidis);
            photos.add(R.drawable.ades);
            photos.add(R.drawable.leminerale);
            photos.add(R.drawable.cleo);
            photos.add(R.drawable.club);
            photos.add(R.drawable.equil);
            photos.add(R.drawable.evian);
            photos.add(R.drawable.nestle);
            photos.add(R.drawable.pristine);
            photos.add(R.drawable.vit);
        }
    }
}
