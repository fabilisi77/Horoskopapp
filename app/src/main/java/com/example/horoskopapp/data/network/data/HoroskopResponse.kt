package com.example.horoskopapp.data.network.data

import com.google.gson.annotations.SerializedName

data class HoroskopResponse(
    @SerializedName("current_date") val currentDay: String,
    @SerializedName("compatibility") val compatibility: String,
    @SerializedName("lucky_time") val luckyTime: String,
    @SerializedName("lucky_number") val luckyNumber: String,
    @SerializedName("color") val color: String,
    @SerializedName("date_range") val dateRange: String,
    @SerializedName("mood") val mood: String,
    @SerializedName("description") val description: String,
)
