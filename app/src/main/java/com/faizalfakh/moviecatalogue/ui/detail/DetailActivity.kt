package com.faizalfakh.moviecatalogue.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.faizalfakh.moviecatalogue.R
import com.faizalfakh.moviecatalogue.data.DataEntity
import com.faizalfakh.moviecatalogue.databinding.ActivityDetailBinding
import com.faizalfakh.moviecatalogue.ui.main.content.movie.MovieFragment
import com.faizalfakh.moviecatalogue.ui.main.content.tvshow.TvShowFragment
import com.faizalfakh.moviecatalogue.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_DATA = "extra_data"
        const val EXTRA_TYPE = "extra_type"
    }

    private lateinit var detailBinding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val factory = ViewModelFactory.getInstance(applicationContext)
        val viewModel = ViewModelProvider(this,factory)[DetailViewModel::class.java]
        val id = intent.getIntExtra(EXTRA_DATA, 0)
        val type = intent.getStringExtra(EXTRA_TYPE)

        detailBinding.loadingProgress.visibility = View.VISIBLE

        if(type.equals(MovieFragment.TYPE_MOVIE, ignoreCase = true)){
            viewModel.getDetailMovie(id).observe(this, Observer {
                bind(it)
            })
        }else if(type.equals(TvShowFragment.TYPE_TVSHOW, ignoreCase = true)){
            viewModel.getDetailTvShow(id).observe(this, Observer {
                bind(it)
            })
        }

    }

    private fun bind(data: DataEntity){
        detailBinding.title.text = data.title
        detailBinding.genre.text = data.genres?.joinToString(", ")
        detailBinding.rating.text = data.rating.toString()
        detailBinding.ratingBar.rating = data.rating?.div(2)!!
        detailBinding.duration.text = resources.getString(R.string.duration, data.duration?.let { convertDuration(it) })
        detailBinding.description.text = data.description
        Glide.with(this).load("https://image.tmdb.org/t/p/w500" + data.image).into(detailBinding.ivPoster)
        detailBinding.fabFavorite.setOnClickListener {
            Toast.makeText(this, "Favorite", Toast.LENGTH_SHORT).show()
        }
        detailBinding.loadingProgress.visibility = View.INVISIBLE
    }

    private fun convertDuration( minute: Int): String{
        return (minute/60).toString() + "h " + (minute%60).toString() + "m"

    }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}