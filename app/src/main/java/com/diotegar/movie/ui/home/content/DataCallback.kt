package com.diotegar.movie.ui.home.content

import com.diotegar.movie.data.DataModel

interface DataCallback  {
    fun onItemClicked(data: DataModel)
}