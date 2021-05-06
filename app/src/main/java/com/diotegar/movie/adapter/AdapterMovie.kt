package com.diotegar.movie.adapter

import com.diotegar.movie.BuildConfig
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.diotegar.movie.R
import com.diotegar.movie.BuildConfig.BASE_URL_IMAGE
import com.diotegar.movie.model.Result
import kotlinx.android.synthetic.main.item_movie.view.*


class AdapterMovie(private val context: Context, private var resultTheMovieDb: ArrayList<Result>) : RecyclerView.Adapter<AdapterMovie.ViewHolderTheMovieDb>() {

    private val TAG = javaClass.simpleName

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderTheMovieDb =
        ViewHolderTheMovieDb(
            LayoutInflater
            .from(parent?.context)
            .inflate(R.layout.item_movie, parent, false)
        )

    override fun onBindViewHolder(holder: ViewHolderTheMovieDb, position: Int) {
        val resultItem = resultTheMovieDb[position]
        holder?.itemView?.image_view_poster_item_movie?.let {
            Glide
                .with(context)
                .load(BuildConfig.BASE_URL_IMAGE + resultItem.posterPath)
                .into(it)
        }
        holder
            ?.itemView
            ?.text_view_title_movie_item_movie
            ?.text = resultItem.originalTitle
        holder
            ?.itemView
            ?.text_view_vote_average_item_movie
            ?.text = resultItem.voteAverage.toString()
        holder
            ?.itemView
            ?.text_view_release_date_value_item_movie
            ?.text = resultItem.releaseDate
        holder
            ?.itemView
            ?.text_view_overview_value_item_movie
            ?.text = resultItem.overview
    }

    override fun getItemCount(): Int = resultTheMovieDb.size

    fun refreshAdapter(resultTheMovieDb: List<Result>) {
        this.resultTheMovieDb.addAll(resultTheMovieDb)
        notifyItemRangeChanged(0, this.resultTheMovieDb.size)
    }

    inner class ViewHolderTheMovieDb(itemView: View?) : RecyclerView.ViewHolder(itemView!!)

}