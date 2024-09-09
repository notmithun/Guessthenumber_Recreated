package me.notmithun.recreations.gtn_recreated.RViewIntergrated;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import me.notmithun.recreations.gtn_recreated.R;

public class version_histroy_items extends RecyclerView.Adapter<version_histroy_items.ViewHolder> {

    protected List<verList> verList;

    public version_histroy_items(List<verList> vL) {
        this.verList = vL;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.version_history_rview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        verList item = verList.get(position);
        holder.txtView.setText(item.getName());
    }


    @Override
    public int getItemCount() {
        return verList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        protected TextView txtView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtView = itemView.findViewById(R.id.textViewMonth);
        }
    }

}
