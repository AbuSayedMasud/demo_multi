package com.leads.demo_project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform