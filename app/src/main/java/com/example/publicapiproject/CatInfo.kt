package com.example.publicapiproject

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CatInfo(
    var id : String,
    var timeCreated : String,
    var tags : List<String>,
    var url : String
) : Parcelable
