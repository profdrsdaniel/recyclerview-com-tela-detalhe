package com.example.recyclerview_menucontexto.di

import com.example.recyclerview_menucontexto.data.datasource.ProductLocalDataSource
import com.example.recyclerview_menucontexto.data.local.dao.ProductDao
import com.example.recyclerview_menucontexto.data.repository.ProductRepositoryImpl
import com.example.recyclerview_menucontexto.domain.repository.ProductRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun providesProductRepository(productLocalDataSource: ProductLocalDataSource): ProductRepository {
        return ProductRepositoryImpl(productLocalDataSource)
    }
}