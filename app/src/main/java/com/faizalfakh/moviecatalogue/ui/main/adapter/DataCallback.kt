package com.faizalfakh.moviecatalogue.ui.main.adapter

import com.faizalfakh.moviecatalogue.data.DataEntity

interface DataCallback {
    fun onItemClicked(data: DataEntity)
}