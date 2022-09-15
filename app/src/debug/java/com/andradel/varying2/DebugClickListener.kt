package com.andradel.varying2

import android.content.Context
import android.content.Intent
import javax.inject.Inject

class DebugClickListener @Inject constructor() : VariantClickListener {
    override fun onClick(context: Context) {
        context.startActivity(Intent(context, DebugActivity::class.java))
    }
}