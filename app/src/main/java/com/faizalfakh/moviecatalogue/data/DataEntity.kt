package com.faizalfakh.moviecatalogue.data

data class DataEntity(
    val id: Int? = 0,
    val title: String?,
    val genres: List<String>?,
    val duration: Int?,
    val rating: Float?,
    val description: String?,
    val image: String?,
)