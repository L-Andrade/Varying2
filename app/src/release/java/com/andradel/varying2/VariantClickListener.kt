package com.andradel.varying2

import android.content.Context
import android.widget.Toast

object VariantClickListener {
    fun onClick(context: Context) {
        Toast.makeText(context, "This is a release toast!", Toast.LENGTH_LONG).show()
    }
}