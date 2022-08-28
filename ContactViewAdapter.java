package com.example.goodones;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
//Delete this comment

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactViewAdapter extends RecyclerView.Adapter<ContactViewAdapter.ViewHolder>{

    private ArrayList<Contacts> contacts = new ArrayList<>();

    public ContactViewAdapter() {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.requirements, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.RequirementsRecycler.setText(contacts.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public void setContacts(ArrayList<Contacts> contacts) {
        this.contacts = contacts;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView RequirementsRecycler;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            RequirementsRecycler = itemView.findViewById(R.id.RequirementsRecycler);
        }
    }
}
