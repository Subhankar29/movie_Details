package com.example.swiggy.model

import io.reactivex.functions.Function

interface Converter<T, R> : Function<T, R>
