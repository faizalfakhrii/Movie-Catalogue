package com.faizalfakh.moviecatalogue.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.faizalfakh.moviecatalogue.data.DataEntity
import com.faizalfakh.moviecatalogue.databinding.ItemListBinding


class DataAdapter(private val callback: DataCallback) : RecyclerView.Adapter<DataAdapter.DataViewHolder>(){

    private var listData = ArrayList<DataEntity>()

    fun setMovies(items: List<DataEntity>?) {
        if (items.isNullOrEmpty()) return
        this.listData.clear()
        this.listData.addAll(items)
        notifyDataSetChanged()
    }

    inner class DataViewHolder(private val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: DataEntity) {
            with(binding){
                tvTitle.text = data.title
                tvGenre.text = data.genres.toString()
                tvRating.text = data.rating.toString()
                ratingBar.rating = data.rating?.div(2)!!
                itemView.setOnClickListener {
                    callback.onItemClicked(data)
                }
                Glide.with(itemView.context).load("https://image.tmdb.org/t/p/w185"+ data.image).into(imgPoster)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val itemListBinding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DataViewHolder(itemListBinding)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        val item = listData[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = listData.size

}
