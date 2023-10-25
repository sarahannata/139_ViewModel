package com.example.pampraktikum4.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.pampraktikum4.data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel: ViewModel() {
    var namaUSr: String by mutableStateOf("")
        private set
    var noTlp: String by mutableStateOf("")
        private set
    var alamat: String by mutableStateOf("")
        private set
    var jenisKl: String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()

    fun insertData(nm: String, tlp: String, almt: String, jk: String){
        namaUSr = nm;
        noTlp = tlp;
        alamat = almt;
        jenisKl = jk;
    }

    fun setJenisK(pilijJK: String){
        _uiState.update { currentState -> currentState.copy(sex = pilijJK) }
    }
}