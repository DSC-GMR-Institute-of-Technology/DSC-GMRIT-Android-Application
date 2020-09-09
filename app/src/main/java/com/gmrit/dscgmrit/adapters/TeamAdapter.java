package com.gmrit.dscgmrit.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gmrit.dscgmrit.R;
import com.gmrit.dscgmrit.activities.team.IndividualTeamDetailsActivity;
import com.gmrit.dscgmrit.modals.TeamData;

import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.ViewHolder> {

    Context context;
     List<TeamData> teamDataList;

    public TeamAdapter(Context context, List<TeamData> teamDataList) {
        this.context = context;
        this.teamDataList = teamDataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.team_horizontal_card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setBackgroundResource(teamDataList.get(position).getTeamPhoto());
        holder.txtTeamName.setText(teamDataList.get(position).getTeamName());

        holder.txtRoleName.setText(teamDataList.get(position).getRoleName());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, IndividualTeamDetailsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name",teamDataList.get(position).getTeamName());
                bundle.putInt("imageTeamPhoto",teamDataList.get(position).getTeamPhoto());
                bundle.putString("roleName",teamDataList.get(position).getRoleName());
                bundle.putString("interests", teamDataList.get(position).getInterests());
                bundle.putString("yearDept",teamDataList.get(position).getYearDept());
                bundle.putString("emailID",teamDataList.get(position).getEmailID());
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });

        if(teamDataList.get(position).getRoleName().equals("Android Developer")) {
            holder.txtRoleName.setBackgroundResource(R.drawable.green_bg_textview);
        } else if(teamDataList.get(position).getRoleName().equals("Web Developer")) {
            holder.txtRoleName.setBackgroundResource(R.drawable.blue_bg_textview);
        } else if (teamDataList.get(position).getRoleName().equals("Media & Creatives")) {
            holder.txtRoleName.setBackgroundResource(R.drawable.yellow_bg_textview);
        } else if(teamDataList.get(position).getRoleName().equals("Faculty Advisor")){
            holder.txtRoleName.setBackgroundResource(R.drawable.yellow_bg_textview);
        } else {
            holder.txtRoleName.setBackgroundResource(R.drawable.red_bg_textview);
        }
    }

    @Override
    public int getItemCount() {
        return teamDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        LinearLayout imageView;
        TextView txtTeamName,txtRoleName, txtViewMore;
        RelativeLayout relativeLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            txtTeamName = itemView.findViewById(R.id.txtName);
            txtRoleName  = itemView.findViewById(R.id.txtRoleName);
            txtViewMore =  itemView.findViewById(R.id.txtViewMore);

            relativeLayout = itemView.findViewById(R.id.relativeLayout);

        }
    }
}
