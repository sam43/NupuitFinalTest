package com.example.looser43.nupuitfinal;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by looser43 on 4/2/17.
 */

public class ContactViewHolder extends RecyclerView.ViewHolder {

    public TextView person_name;
    public TextView person_number;


    public ContactViewHolder(View itemView) {
        super(itemView);
        person_name = (TextView) itemView.findViewById(R.id.person_name);
        person_number = (TextView) itemView.findViewById(R.id.person_number);


    }

    void setPerson_name(String S){
        person_name.setText(S);
    }
    void setPerson_number(String S){
        person_number.setText(S);
    }

}
