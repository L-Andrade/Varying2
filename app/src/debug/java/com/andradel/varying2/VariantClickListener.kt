package com.andradel.varying2

import android.content.Context
import android.content.Intent

object VariantClickListener {
    fun onClick(context: Context) {
        context.startActivity(Intent(context, DebugActivity::class.java))
    }
}