package fr.wildcodeschool.recylerviewjsonexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ExempleAdapter extends RecyclerView.Adapter<ExempleAdapter.ExampleViewHolder> {

    private Context mContext;
    private ArrayList<ExempleItem> mExampleList;

    public ExempleAdapter(Context context, ArrayList<ExempleItem> exampleList){
        mContext = context;
        mExampleList = exampleList;
    }
    public class ExampleViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImageView;
        public TextView mTextViewCreator;
        public TextView mTextViewLikes;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById((R.id.image_view));
            mTextViewCreator = itemView.findViewById(R.id.text_view_creator);
        }
    }

    @NonNull
    @Override
    public ExempleAdapter.ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.exemple_item, parent, false);
        return new ExampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ExempleAdapter.ExampleViewHolder holder, int position) {
        ExempleItem currentItem = mExampleList.get(position);

        String imageUrl = currentItem.getImageUrl();
        String creatorName = currentItem.getCreator();
        //int likeCount = currentItem.getLikeCount();

        holder.mTextViewCreator.setText(creatorName);
        // holder.mTextViewLikes.setText("Likes: " + likeCount);
        // TODO COMPLETER ICI SI CHARGE PAS 7:35
        Glide.with(mContext).load(imageUrl).into(holder.mImageView);

    }

    //retourner la list dans le Recycler
    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}
