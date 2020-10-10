package com.example.nedtechnologies;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class AllFragment extends Fragment {

    private RecyclerView allRecycler;
    private RecyclerView recyclerViewCatTwo;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myview = inflater.inflate(R.layout.fragment_all, container, false);

        // Cat one Recycler ...

        allRecycler = myview.findViewById(R.id.recycler_all);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        layoutManager.setReverseLayout(true);
        layoutManager.setStackFromEnd(true);
        allRecycler.setHasFixedSize(true);
        allRecycler.setLayoutManager(layoutManager);


        // cat two recycler

        recyclerViewCatTwo = myview.findViewById(R.id.recycler_cattwo);

        LinearLayoutManager layoutManagerCatTwo = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);

        layoutManagerCatTwo.setReverseLayout(true);
        layoutManagerCatTwo.setStackFromEnd(true);

        recyclerViewCatTwo.setHasFixedSize(true);
        recyclerViewCatTwo.setLayoutManager(layoutManagerCatTwo);



        return  myview;
    }

    @Override
    public void onStart() {
        super.onStart();
    }
    public static class catoneViewHolder extends RecyclerView.ViewHolder{

        View  myView;

        public catoneViewHolder( View itemView) {
            super(itemView);

            myView=itemView;
        }
        public void setTitle(String title) {
            TextView mTitle = myView.findViewById(R.id.title);
            mTitle.setText(title);

        }

        public void setDescription (String description) {
            TextView mDescription = myView.findViewById(R.id.description);
            mDescription.setText(description);
        }

        public void setImage(final String image) {
            final ImageView mImage = myView.findViewById(R.id.imageView);

            Picasso.get().load(image).networkPolicy(NetworkPolicy.OFFLINE).into(mImage, new Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError(Exception e) {
                 Picasso.get().load(image).into(mImage);
                }
            });
        }
    }
}