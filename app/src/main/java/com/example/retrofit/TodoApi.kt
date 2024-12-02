package com.example.retrofit

import retrofit2.Response
import retrofit2.http.GET


/**
 * Created by Abhinay on 02/12/24.
 *
 *
 */
interface TodoApi {

    @GET("/todos")
    suspend fun getTodos(): Response<List<Todo>>
}