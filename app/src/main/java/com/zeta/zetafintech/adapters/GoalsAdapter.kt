package com.zeta.zetafintech.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zeta.zetafintech.R
import com.zeta.zetafintech.models.GoalsModel

class GoalsAdapter(private val goalModelList: List<GoalsModel>) :
    RecyclerView.Adapter<GoalsAdapter.Viewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        return Viewholder(
            LayoutInflater.from(parent.context).inflate(R.layout.activity_goals_card, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return goalModelList.size;
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {

    }

    inner class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView)
}
