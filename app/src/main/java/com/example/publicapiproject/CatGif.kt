package com.example.publicapiproject

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CatGif {
    @GET("gif")
}