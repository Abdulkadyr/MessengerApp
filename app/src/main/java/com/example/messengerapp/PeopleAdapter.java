package com.example.messengerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.messengerapp.models.User;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.Holder> {

    Context context;
    List<User> users;

    public PeopleAdapter(Context context, List<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.people_item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.peopleName.setText(users.get(position).getUserName());

        if (users.get(position).getImageUrl().equals("default")) {
            holder.imagePeople.setImageResource(R.mipmap.ic_launcher);
        } else {
            Picasso.get().load(users.get(position).getImageUrl()).into(holder.imagePeople);
        }
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public static class Holder extends RecyclerView.ViewHolder {

        ImageView imagePeople;
        TextView peopleName;

        public Holder(@NonNull View itemView) {
            super(itemView);
            peopleName = itemView.findViewById(R.id.namePeople);
            imagePeople = itemView.findViewById(R.id.imagePeople);
        }
    }
}
