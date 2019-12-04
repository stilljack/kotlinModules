package com.example.codecollections.retrofit

import com.google.gson.Gson
import okhttp3.Call
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.concurrent.TimeUnit


interface RetroApi {
/*
    @GET("search/movie?language=en-US&page=1&include_adult=false")
    fun getMoviesSearch(@Query("query")query: String, @Query("api_key")api_key:String) : Call<Userz>
*/

    class Factory {
        companion object {
            val BASE_URL = "https://pokeapi.co/api/v2/"
            val gson = Gson()


            fun create(): RetroApi {

                val logger = HttpLoggingInterceptor()
             //   logger.level = HttpLoggingInterceptor.Level.BASIC
                logger.level = HttpLoggingInterceptor.Level.BODY
                val okHttpClient = OkHttpClient.Builder()
                    .addInterceptor(logger)
                    .retryOnConnectionFailure(false)
                    .readTimeout(10, TimeUnit.SECONDS)
                    .connectTimeout(15, TimeUnit.SECONDS)
                    .build()
                val retrofit = Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson)) //gson
                    .build()

                return retrofit.create(RetroApi::class.java)
            }
        }
    }

}