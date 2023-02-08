package com.anyandroid.agecalculator.repository

import com.anyandroid.agecalculator.model.Person
import androidx.lifecycle.MutableLiveData
import java.util.*


class CalculateAgeRepositoryImplementation : CalculateAgeRepository {
    override fun calculateAge(name: String, age: String): MutableLiveData<Person> {
        val infoMutableLiveData = MutableLiveData<Person>()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val age = currentYear - age.toInt()
        val person = Person(name, age)
        infoMutableLiveData.postValue(person)
        return infoMutableLiveData
    }


}