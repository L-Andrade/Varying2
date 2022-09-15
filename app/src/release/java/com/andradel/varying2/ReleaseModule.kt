package com.andradel.varying2

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class ReleaseModule {
    @Binds
    abstract fun bindsClickListener(clickListener: ReleaseClickListener): VariantClickListener
}