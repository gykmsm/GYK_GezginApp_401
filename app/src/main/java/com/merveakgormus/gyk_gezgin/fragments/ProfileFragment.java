package com.merveakgormus.gyk_gezgin.fragments;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.merveakgormus.gyk_gezgin.R;

public class ProfileFragment extends Fragment {

    FirebaseUser firebaseUser;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        TextView tvUsermail = view.findViewById(R.id.tvUserMail);
        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        tvUsermail.setText(firebaseUser.getEmail());

        ImageView imgGoInstagram = view.findViewById(R.id.imgGoInstagram);
        imgGoInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoInstagram();
            }
        });

        return view;
    }

    public void GoInstagram(){

        Uri uri = Uri.parse("https://www.instagram.com/merve_akgormus/?hl=tr");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

        likeIng.setPackage("com.instagram.android");

        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.instagram.com/merve_akgormus/?hl=tr")));
        }
    }
}
