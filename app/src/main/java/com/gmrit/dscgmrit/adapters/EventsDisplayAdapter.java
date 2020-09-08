package com.gmrit.dscgmrit.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.gmrit.dscgmrit.R;
import com.gmrit.dscgmrit.activities.EventDetailsActivity;
import com.gmrit.dscgmrit.activities.EventsActivity;
import com.gmrit.dscgmrit.modals.EventData;

import java.util.List;

public class EventsDisplayAdapter extends RecyclerView.Adapter<EventsDisplayAdapter.ViewHolder> {

    Context context;
    List<EventData> eventDataList;

    public EventsDisplayAdapter(Context context, List<EventData> eventDataList) {
        this.context = context;
        this.eventDataList = eventDataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.activity_events__card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        holder.txtLearnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, EventDetailsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("eventName",eventDataList.get(position).getEventName());
                bundle.putInt("eventImage", eventDataList.get(position).getImages());
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });

        holder.txtEventName.setText(eventDataList.get(position).getEventName());

        holder.relativeLayout.setBackgroundResource(eventDataList.get(position).getImages());

    }

    @Override
    public int getItemCount() {
        return eventDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        RelativeLayout relativeLayout;
        TextView txtEventName,txtLearnMore;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            relativeLayout = itemView.findViewById(R.id.relativeLayout);
            txtEventName = itemView.findViewById(R.id.txtEventName);
            txtLearnMore = itemView.findViewById(R.id.txtLearnMore);
        }
    }
}
