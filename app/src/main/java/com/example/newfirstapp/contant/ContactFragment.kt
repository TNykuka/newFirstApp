package com.example.newfirstapp.contant

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.newfirstapp.Database.UserDatabase
import com.example.newfirstapp.R
import com.example.newfirstapp.databinding.ContactFragmentBinding

class ContactFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Get a reference to the binding object and inflate the fragment views.
        val binding: ContactFragmentBinding = DataBindingUtil.inflate(
            inflater, R.layout.contact_fragment, container, false)

        val application = requireNotNull(this.activity).application

        val dataSource = UserDatabase.getInstance(application).userDatabaseDao

        val viewModelFactory = ContactViewModelFactory (dataSource, application)

        val userViewModel =
            ViewModelProvider(
                this, viewModelFactory).get(ContactViewModel::class.java)

        binding.setLifecycleOwner(this)

        binding.userViewModel = userViewModel


        return binding.root
    }
}
