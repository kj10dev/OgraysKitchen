package com.example.ograyskitchen.data.stateholder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ograyskitchen.R

class CustomAdapterSettings(private val mList: List<SettingsViewModel>): RecyclerView.Adapter<CustomAdapterSettings.ViewHolder>() {

    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {
        val imageViewSettingsItem: ImageView = itemView.findViewById(R.id.ivSettingsImage)
        val textSettingsName = itemView.findViewById<TextView>(R.id.tvSettingsItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //inflates the card_view_design
        //that is used to hold the list of items
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design_settings, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val SettingsViewModel = mList[position]

        //sets the image to the imageView from our itemsHolder class
        holder.imageViewSettingsItem.setImageResource(SettingsViewModel.image)

        //sets the text to the to textName from our itemHolder class
        holder.textSettingsName.text = SettingsViewModel.settingsName

    }

    override fun getItemCount(): Int {
        return mList.size
    }
}