package com.example.supachat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource

import io.getstream.chat.android.models.InitializationState
import io.getstream.chat.android.compose.ui.channels.ChannelsScreen
import io.getstream.chat.android.compose.ui.theme.ChatTheme
import io.getstream.chat.android.models.User

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val client = (application as SupaChatApp).chatClient

        // Example user — later replace with Firebase Auth user info
        val user = User(
            id = "manas",
            name = "Manas Kumar",
            image = "https://bit.ly/2TIt8NR"
        )

        client.connectUser(
            user = user,
            token = client.devToken(user.id) // use dev token for now
        ).enqueue()

        setContent {
            val initState by client.clientState.initializationState.collectAsState()

            ChatTheme {
                when (initState) {
                    InitializationState.COMPLETE -> {
                        ChannelsScreen(
                            title = stringResource(R.string.app_name),
                            onChannelClick = { channel ->
                                startActivity(ChannelActivity.getIntent(this, channel.cid))
                            },
                            onBackPressed = { finish() }
                        )
                    }
                    InitializationState.INITIALIZING -> Text("Initializing...")
                    InitializationState.NOT_INITIALIZED -> Text("Not Initialized")
                }
            }
        }
    }
}
