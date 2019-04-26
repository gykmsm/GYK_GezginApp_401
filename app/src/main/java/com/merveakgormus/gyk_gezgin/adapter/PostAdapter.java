package com.merveakgormus.gyk_gezgin.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.merveakgormus.gyk_gezgin.R;
import com.merveakgormus.gyk_gezgin.model.Post;

import java.util.List;

public class PostAdapter extends BaseAdapter {

    LayoutInflater layoutInflater;
    List<Post> postList;

    public PostAdapter(LayoutInflater layoutInflater, List<Post> postList){
        this.layoutInflater = layoutInflater;
        this.postList = postList;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = layoutInflater.inflate(R.layout.list_item_view, null);

        ImageView imgPost = view.findViewById(R.id.postImg);
        TextView tvTitle = view.findViewById(R.id.tvTitle);
        TextView tvContent = view.findViewById(R.id.tvContent);

        Post post = postList.get(i);
        tvTitle.setText(post.getTitle());
        tvContent.setText(post.getContent());
        imgPost.setImageResource(post.getPicture());

        return view;
    }

    @Override
    public Object getItem(int i) {
        return postList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public int getCount() {
        return postList.size();
    }
}
