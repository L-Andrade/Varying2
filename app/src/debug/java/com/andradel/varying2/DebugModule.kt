package com.andradel.varying2

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DebugModule {
    @Binds
    abstract fun bindsClickListener(clickListener: DebugClickListener): VariantClickListener
}