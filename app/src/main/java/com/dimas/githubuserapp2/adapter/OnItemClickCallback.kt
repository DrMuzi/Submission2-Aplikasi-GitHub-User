package com.dimas.githubuserapp2.adapter

import com.dimas.githubuserapp2.datasource.UserResponse

interface OnItemClickCallback {
    fun onItemClicked(user: UserResponse)
}