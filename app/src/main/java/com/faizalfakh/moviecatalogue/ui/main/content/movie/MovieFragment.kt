package com.faizalfakh.moviecatalogue.ui.main.content.movie

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.faizalfakh.moviecatalogue.R
import com.faizalfakh.moviecatalogue.data.DataEntity
import com.faizalfakh.moviecatalogue.databinding.FragmentMovieBinding
import com.faizalfakh.moviecatalogue.ui.detail.DetailActivity
import com.faizalfakh.moviecatalogue.ui.main.adapter.DataCallback
import com.faizalfakh.moviecatalogue.ui.main.adapter.DataAdapter
import com.faizalfakh.moviecatalogue.utils.Helper
import com.faizalfakh.moviecatalogue.viewmodel.ViewModelFactory


class MovieFragment : Fragment(), DataCallback {

    companion object{
        const val TYPE_MOVIE = "type_movie"
    }

    private lateinit var fragmentMovieBinding: FragmentMovieBinding
    private lateinit var helper: Helper

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragmentMovieBinding = FragmentMovieBinding.inflate(layoutInflater, container, false)
        return fragmentMovieBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if(activity != null){
            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this,factory)[MovieViewModel::class.java]
            val movieAdapter = DataAdapter(this@MovieFragment)
            viewModel.getMovies().observe(viewLifecycleOwner, { listTv ->
                movieAdapter.setMovies(listTv)
            })
            with(fragmentMovieBinding.rvMovies){
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = movieAdapter
            }
        }
    }

    override fun onItemClicked(data: DataEntity) {
        helper = Helper(requireActivity())
        if (helper.isInternetAvailable(requireActivity())){
            val intent = Intent(context, DetailActivity::class.java)
                    .putExtra(DetailActivity.EXTRA_DATA, data.id)
                    .putExtra(DetailActivity.EXTRA_TYPE, TYPE_MOVIE)
            startActivity(intent)
        }else{
            Toast.makeText(context, resources.getString(R.string.no_internet_access), Toast.LENGTH_SHORT).show()
        }
    }
}