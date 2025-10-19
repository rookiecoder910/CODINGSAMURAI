package com.example.supachat

import android.app.Application
import io.getstream.chat.android.client.ChatClient
import io.getstream.chat.android.client.logger.ChatLogLevel
import io.getstream.chat.android.offline.plugin.factory.StreamOfflinePluginFactory
import io.getstream.chat.android.state.plugin.config.StatePluginConfig
import io.getstream.chat.android.state.plugin.factory.StreamStatePluginFactory

class SupaChatApp : Application() {

    lateinit var chatClient: ChatClient

    override fun onCreate() {
        super.onCreate()

        val offlinePluginFactory = StreamOfflinePluginFactory(appContext = this)
        val statePluginFactory = StreamStatePluginFactory(
            config = StatePluginConfig(),
            appContext = this,
        )

        chatClient = ChatClient.Builder("n8m4uqd8u96t", this)
            .withPlugins(offlinePluginFactory, statePluginFactory)
            .logLevel(ChatLogLevel.ALL)
            .build()
    }
}

