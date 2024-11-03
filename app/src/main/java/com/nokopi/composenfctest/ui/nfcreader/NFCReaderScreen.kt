package com.nokopi.composenfctest.ui.nfcreader

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.nokopi.composenfctest.util.NfcBroadcastReceiver

@OptIn(ExperimentalStdlibApi::class)
@Composable
fun NFCReaderScreen(
    modifier: Modifier = Modifier
) {
    var nfcCardId by remember { mutableStateOf("") }

    Text(
        text = "nfcCardId: $nfcCardId",
        modifier = modifier
    )

    NfcBroadcastReceiver { tag ->
        nfcCardId = tag.id.toHexString()
    }

}