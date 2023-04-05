package com.example.ograyskitchen.data.stateholder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ograyskitchen.R

class CustomAdapterCheckoutList(private val mList: List<CheckoutListViewModel>) : RecyclerView.Adapter<CustomAdapterCheckoutList.ViewHolder>() {

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageViewFoodItem: ImageView = itemView.findViewById(R.id.item_image)
        val textItemName = itemView.findViewById<TextView>(R.id.item_name)
        val textItemPrice = itemView.findViewById<TextView>(R.id.item_price)
        val textAmount = itemView.findViewById<TextView>(R.id.edtAmount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //inflates the card_view_design
        //that is used to hold the list of items
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_checkout_item, parent, false)

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

        //set the quantity
        holder.textAmount.text = ItemsViewModel.amount.toString()


    }
    override fun getItemCount(): Int {
        return mList.size
    }
}