package com.example.shayari.models

data class Shayari(
    val count: Int,
    val lastItemIndex: Any,
    val page: Int,
    val results: List<Result>,
    val totalCount: Int,
    val totalPages: Int
)