package com.mr.movieapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform