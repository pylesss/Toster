package net.pyles.toster.android.di

import net.pyles.toster.android.GreetPresenter
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module


val androidModule = module {
    singleOf(::GreetPresenter)
}