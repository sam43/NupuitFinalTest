package com.example.looser43.nupuitfinal;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sam43 on 3/31/2017.
 */

public class AllContactsAdapter extends RecyclerView.Adapter<ContactViewHolder> {
    public ArrayList<ContactListItem> contactlist;
    public LayoutInflater inflater;


    public AllContactsAdapter(List<ContactListItem> contactlist, LayoutInflater inflater ){
        this.contactlist = (ArrayList<ContactListItem>) contactlist;
        this.inflater = inflater;
    }


    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ContactViewHolder(inflater.inflate(R.layout.contact_list_item,parent,false));
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {

        holder.setPerson_name(contactlist.get(position).ContactName);
        holder.setPerson_number(contactlist.get(position).ContactNumber);

    }

    @Override
    public int getItemCount() {
        return contactlist.size();
    }
    public void addData(ArrayList<ContactListItem> contact){
        this.contactlist.addAll(contact);
        notifyDataSetChanged();
    }
}