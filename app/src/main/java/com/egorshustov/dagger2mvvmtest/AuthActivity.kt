package com.egorshustov.dagger2mvvmtest

import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var injectedString: String

    @JvmField
    @Inject
    var isAppNull: Boolean? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        Log.d(TAG, "onCreate: $injectedString")
        Log.d(TAG, "onCreate: is app null? $isAppNull")
    }

    companion object {
        const val TAG = "Dagger2MVVMTest"
    }
}