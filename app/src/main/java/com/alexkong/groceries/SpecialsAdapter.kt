package com.alexkong.groceries

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SpecialsAdapter: RecyclerView.Adapter<SpecialsAdapter.ViewHolder>() {

    val specials: MutableList<ManagerSpecial> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class ViewHolder constructor(view: View): RecyclerView.ViewHolder(view) {
        fun bindView(special: ManagerSpecial) {

        }
    }
}