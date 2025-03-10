package com.iamageo.wubbalubbadubdub

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform