package com.anyandroid.agecalculator.repository

import androidx.lifecycle.MutableLiveData
import com.anyandroid.agecalculator.model.Person

interface CalculateAgeRepository {


    fun calculateAge(name: String, age: String): MutableLiveData<Person>
}