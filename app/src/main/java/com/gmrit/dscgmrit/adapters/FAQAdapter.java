package com.gmrit.dscgmrit.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gmrit.dscgmrit.R;
import com.gmrit.dscgmrit.modals.FAQdata;

import java.util.List;

public class FAQAdapter extends RecyclerView.Adapter<FAQAdapter.ViewHolder> {

    Context context;
    List<FAQdata> data;

    public FAQAdapter(Context context, List<FAQdata> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View layout;
        layout = LayoutInflater.from(context).inflate(R.layout.faq_card,parent,false);
        return new ViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        //anim
        holder.imguser.setAnimation(AnimationUtils.loadAnimation(context,R.anim.faqpage_animation));
        holder.relativeLayout.setAnimation(AnimationUtils.loadAnimation(context,R.anim.faqpage_animation));


        holder.title.setText(data.get(position).getTitle());
        holder.content.setText(data.get(position).getContent());
        holder.date.setText(data.get(position).getDate());
        holder.imguser.setImageResource(data.get(position).getUserphoto());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView title,content,date;
        ImageView imguser;
        RelativeLayout relativeLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            content = itemView.findViewById(R.id.content);
            date = itemView.findViewById(R.id.date);
            imguser = itemView.findViewById(R.id.user);
            relativeLayout = itemView.findViewById(R.id.relativeLayout2);
        }
    }
}
