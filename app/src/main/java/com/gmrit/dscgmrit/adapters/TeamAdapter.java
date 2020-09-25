package com.gmrit.dscgmrit.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.gmrit.dscgmrit.R;
import com.gmrit.dscgmrit.activities.team.IndividualTeamDetailsActivity;
import com.gmrit.dscgmrit.modals.TeamData;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.ViewHolder> {

    Context context;
     List<TeamData.DataBean> teamDataList;

    public TeamAdapter(Context context, List<TeamData.DataBean> teamDataList) {
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

        //holder.imageView.setImageResource(teamDataList.get(position).getTeamPhoto());
        Glide.with(context).load(teamDataList.get(position).getMember_photo_url()).into(holder.imageView);
        //holder.imageView.setImageResource(teamDataList.get(position).getTeamPhoto());
        holder.txtTeamName.setText(teamDataList.get(position).getMember_name());

        holder.txtRoleName.setText(teamDataList.get(position).getMember_designation());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, IndividualTeamDetailsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name",teamDataList.get(position).getMember_name());
                bundle.putString("imageTeamPhoto",teamDataList.get(position).getMember_photo_url());
                bundle.putString("roleName",teamDataList.get(position).getMember_designation());
                bundle.putString("interests", teamDataList.get(position).getMember_interests());
                bundle.putString("yearDept",teamDataList.get(position).getMember_department());
                bundle.putString("emailID",teamDataList.get(position).getMember_email());
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });

        switch (teamDataList.get(position).getMember_designation()) {
            case "Android Developer":
                holder.txtRoleName.setBackgroundResource(R.drawable.green_bg_textview);
                holder.imageView.setBorderColor(context.getResources().getColor(R.color.colorGreen));
                break;
            case "Web Developer":
                holder.txtRoleName.setBackgroundResource(R.drawable.blue_bg_textview);
                holder.imageView.setBorderColor(context.getResources().getColor(R.color.colorBlue));
                break;
            case "Media & Creatives":
                holder.txtRoleName.setBackgroundResource(R.drawable.yellow_bg_textview);
                holder.imageView.setBorderColor(context.getResources().getColor(R.color.colorYellow));
                break;
            case "Faculty Advisor":
                holder.txtRoleName.setBackgroundResource(R.drawable.yellow_bg_textview);
                holder.imageView.setBorderColor(context.getResources().getColor(R.color.colorYellow));
                break;
            default:
                holder.txtRoleName.setBackgroundResource(R.drawable.red_bg_textview);
                holder.imageView.setBorderColor(context.getResources().getColor(R.color.colorRed));
                break;
        }
    }

    @Override
    public int getItemCount() {
        return teamDataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CircleImageView imageView;
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
