package id.simplify.hikam_1202150029_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by Haikal on 2/25/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MenuViewHolder> {
    private final LinkedList<String> mnamalist;
    private final LinkedList<String> mdeslist;
    private final LinkedList<Integer> mPhotoList;
    private LayoutInflater mInflater;

    public RecyclerViewAdapter(Context context, LinkedList<String> namalist, LinkedList<String> deslist, LinkedList<Integer> photoList) {
        mInflater = LayoutInflater.from(context);
        this.mnamalist = namalist;
        this.mdeslist = deslist;
        this.mPhotoList = photoList;
    }
    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.list_daftar, parent, false);
        return new MenuViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        String mCurrentnama = mnamalist.get(position);
        String mCurrentdes = mdeslist.get(position);
        Integer mCurrentPhoto = mPhotoList.get(position);
        holder.namaItemView.setText(mCurrentnama);
        holder.desItemView.setText(mCurrentdes);
        

    }

    @Override
    public int getItemCount() {
        return mnamalist.size();
    }

    class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView namaItemView;
        public final TextView desItemView;
        public final ImageView photoItemView;
        public final LinearLayout linearLayout;

        final RecyclerViewAdapter mAdapter;
        public MenuViewHolder(final View itemView, RecyclerViewAdapter adapter) {
            super(itemView);
            namaItemView = (TextView) itemView.findViewById(R.id.merk);
            desItemView = (TextView) itemView.findViewById(R.id.minidesc);
            photoItemView = (ImageView) itemView.findViewById(R.id.poto);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearlay);
            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Get the position of the item that was clicked.
                    int mPosition = getLayoutPosition();
                    // Use that to access the affected item in mWordList.
                    String namaa = mnamalist.get(mPosition);
                    String deski = mdeslist.get(mPosition);
                    Integer photo = mPhotoList.get(mPosition);
                    Intent intent = new Intent(itemView.getContext(), MenuLanjut.class);
                    intent.putExtra("nama", namaa);
                    intent.putExtra("desc", deski);
                    intent.putExtra("photo", photo);
                    itemView.getContext().startActivity(intent);
                }
            });
            this.mAdapter = adapter;
        }
        @Override
        public void onClick(View view) {

        }
    }
}
