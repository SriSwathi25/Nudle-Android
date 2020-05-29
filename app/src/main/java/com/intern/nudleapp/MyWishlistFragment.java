package com.intern.nudleapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyWishlistFragment extends Fragment {

    public MyWishlistFragment() {
        // Required empty public constructor
    }

    private RecyclerView wishlistRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_wishlist,container,false);
        wishlistRecyclerView = view.findViewById(R.id.my_wishlist_recylcerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        wishlistRecyclerView.setLayoutManager(linearLayoutManager);

        List<WishlistModel> wishlistModelList = new ArrayList<>();
        wishlistModelList.add(new WishlistModel(R.drawable.googlepixel3a,"Pixel 2",1,"4",77,"RS 49999/-","Rs 59999/-","CashONDelivery"));
        wishlistModelList.add(new WishlistModel(R.drawable.googlepixel3a,"Pixel 2",0,"4",77,"RS 49999/-","Rs 59999/-","CashONDelivery"));
        wishlistModelList.add(new WishlistModel(R.drawable.googlepixel3a,"Pixel 2",2,"4",77,"RS 49999/-","Rs 59999/-","CashONDelivery"));
        wishlistModelList.add(new WishlistModel(R.drawable.googlepixel3a,"Pixel 2",4,"4",77,"RS 49999/-","Rs 59999/-","CashONDelivery"));
        wishlistModelList.add(new WishlistModel(R.drawable.googlepixel3a,"Pixel 2",1,"4",77,"RS 49999/-","Rs 59999/-","CashONDelivery"));


        WishlistAdapter wishlistAdapter = new WishlistAdapter(wishlistModelList);
        wishlistRecyclerView.setAdapter(wishlistAdapter);
        wishlistAdapter.notifyDataSetChanged();

        return view;
    }
}
