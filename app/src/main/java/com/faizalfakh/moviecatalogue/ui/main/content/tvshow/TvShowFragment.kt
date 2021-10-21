package com.faizalfakh.moviecatalogue.ui.main.content.tvshow

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.faizalfakh.moviecatalogue.R
import com.faizalfakh.moviecatalogue.data.DataEntity
import com.faizalfakh.moviecatalogue.databinding.FragmentTvShowBinding
import com.faizalfakh.moviecatalogue.ui.detail.DetailActivity
import com.faizalfakh.moviecatalogue.ui.main.adapter.DataAdapter
import com.faizalfakh.moviecatalogue.ui.main.adapter.DataCallback
import com.faizalfakh.moviecatalogue.utils.Helper
import com.faizalfakh.moviecatalogue.viewmodel.ViewModelFactory

class TvShowFragment : Fragment(), DataCallback {

    companion object{
        const val TYPE_TVSHOW = "type_tvshow"
    }

    private lateinit var fragmentTvShowFragment: FragmentTvShowBinding
    private lateinit var helper: Helper

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        fragmentTvShowFragment = FragmentTvShowBinding.inflate(layoutInflater, container, false)
        return fragmentTvShowFragment.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if(activity != null){
            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[TvShowViewModel::class.java]
            val tvShowAdapter = DataAdapter(this@TvShowFragment)

            viewModel.getTvShow().observe(viewLifecycleOwner, { listTv ->
                tvShowAdapter.setMovies(listTv)
            })
            with(fragmentTvShowFragment.rvTvshow){
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = tvShowAdapter
            }
        }
    }

    override fun onItemClicked(data: DataEntity) {
        helper = Helper(requireActivity())
        if (helper.isInternetAvailable(requireActivity())){
            val intent = Intent(context, DetailActivity::class.java)
                    .putExtra(DetailActivity.EXTRA_DATA, data.id)
                    .putExtra(DetailActivity.EXTRA_TYPE, TYPE_TVSHOW)
            startActivity(intent)
        }else{
            Toast.makeText(context, resources.getString(R.string.no_internet_access), Toast.LENGTH_SHORT).show()
        }
    }
}