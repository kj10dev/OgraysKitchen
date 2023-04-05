package com.example.ograyskitchen.data.stateholder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ograyskitchen.R

class CustomAdapterFood(private val mList: List<FoodItemsViewModel>): RecyclerView.Adapter<CustomAdapterFood.ViewHolder>() {

    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {
        val imageViewFoodItem: ImageView = itemView.findViewById(R.id.ivFootItem)
        val textItemName = itemView.findViewById<TextView>(R.id.tvItemName)
        val textItemPrice = itemView.findViewById<TextView>(R.id.tvPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //inflates the card_view_design
        //that is used to hold the list of items
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design_meal, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        //sets the image to the imageView from our itemsHolder class
        holder.imageViewFoodItem.setImageResource(ItemsViewModel.image)

        //sets the text to the to textName from our itemHolder class
        holder.textItemName.text = ItemsViewModel.textName

        //sets the price to the textPrice form our itemHolder class
        holder.textItemPrice.text = ItemsViewModel.textPrice
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}