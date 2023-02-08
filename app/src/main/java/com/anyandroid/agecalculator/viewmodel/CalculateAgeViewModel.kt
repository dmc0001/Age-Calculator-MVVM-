package com.anyandroid.agecalculator.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.anyandroid.agecalculator.model.Person
import com.anyandroid.agecalculator.repository.CalculateAgeRepositoryImplementation

class CalculateAgeViewModel : ViewModel() {
    private val calculateAgeRepository = CalculateAgeRepositoryImplementation()
    fun calculateAge(name: String, age: String): LiveData<Person> {
        return calculateAgeRepository.calculateAge(name, age)

    }
}