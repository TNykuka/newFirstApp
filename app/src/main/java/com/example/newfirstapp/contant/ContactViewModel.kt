package com.example.newfirstapp.contant

import android.app.Activity
import android.app.Application
import android.content.Intent
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.newfirstapp.Database.User
import com.example.newfirstapp.Database.UserDatabaseDao
import com.example.newfirstapp.R
import kotlinx.coroutines.*

class ContactViewModel(
    val database: UserDatabaseDao,
    application: Application) : AndroidViewModel(application) {

    private var viewModelJob = Job()



}