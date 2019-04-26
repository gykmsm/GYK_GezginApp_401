package com.merveakgormus.gyk_gezgin.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.merveakgormus.gyk_gezgin.R;
import com.merveakgormus.gyk_gezgin.adapter.PostAdapter;
import com.merveakgormus.gyk_gezgin.model.Post;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    List<Post> postList = new ArrayList<>();
    ListView listView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        listView = view.findViewById(R.id.listView);

        postList.add(new Post(R.drawable.foto1, "Trabzonda 1 gün", "asdsad asdasa asdasd", "22-03-2019"));
        postList.add(new Post(R.drawable.foto2, "Mardinde 1 gün", "asda asdas sadsd", "22-03-2019"));
        postList.add(new Post(R.drawable.foto3, "Lorem Ipsum", "sadad asdsa asasd", "22-03-2019"));

        PostAdapter postAdapter = new PostAdapter(getLayoutInflater(), postList);

        listView.setAdapter(postAdapter);

        return view;
    }
}
