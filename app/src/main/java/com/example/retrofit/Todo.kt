package com.example.retrofit


/**
 * Created by Abhinay on 02/12/24.
 *
 *
 */
data class Todo (
    val completed: Boolean,
    var id: Int,
    val title: String,
    val userId: Int
)