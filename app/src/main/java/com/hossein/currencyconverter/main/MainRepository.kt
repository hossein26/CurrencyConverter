package com.hossein.currencyconverter.main

import com.hossein.currencyconverter.data.models.CurrencyResponse
import com.hossein.currencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates(base: String):Resource<CurrencyResponse>
}