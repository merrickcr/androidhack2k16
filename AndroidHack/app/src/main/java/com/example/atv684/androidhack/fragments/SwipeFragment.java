package com.example.atv684.androidhack.fragments;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andtinder.model.CardModel;
import com.andtinder.view.CardContainer;
import com.andtinder.view.SimpleCardStackAdapter;
import com.example.atv684.androidhack.R;
import com.example.atv684.androidhack.objects.House;
import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.Query;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by atv684 on 8/27/16.
 */
public class SwipeFragment extends Fragment {

    private CardContainer mCardContainer;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.swipe_fragment_layout, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mCardContainer = (CardContainer) view.findViewById(R.id.cardContainer);

        SimpleCardStackAdapter adapter = new SimpleCardStackAdapter(getContext());
        adapter.add(new CardModel("Title1", "Description goes here", getResources().getDrawable(R.drawable.cats)));
        adapter.add(new CardModel("Title1", "Description goes here", getResources().getDrawable(R.drawable.camera)));
        adapter.add(new CardModel("Title1", "Description goes here", getResources().getDrawable(R.drawable.heart)));

        mCardContainer.setAdapter(adapter);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }





}