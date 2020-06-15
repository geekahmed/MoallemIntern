package tech.geekahmed.moallemintern.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import tech.geekahmed.moallemintern.R;

public class SubjectsAdapter extends RecyclerView.Adapter<SubjectsAdapter.ViewHolder> {

    private ArrayList<String> mSubjectsNames; // Reference variable for subjects.
    // SubjectAdapter constructor that receives the array list of the subjects and assigning it to the member variable.
    public SubjectsAdapter(ArrayList<String> subjectsNames){
        this.mSubjectsNames = subjectsNames;
    }


    // Inflates the item layout.
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.subjectsrv_item, parent, false));
    }

    // Assigning data to the layout.
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.subjectNameTV.setText(mSubjectsNames.get(position));
    }

    // Getter for the array list of subject.
    @Override
    public int getItemCount() {
        return mSubjectsNames.size();
    }

    // View Holder class.
    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView subjectNameTV;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            subjectNameTV = itemView.findViewById(R.id.subjectNameTV);
        }
    }
}
