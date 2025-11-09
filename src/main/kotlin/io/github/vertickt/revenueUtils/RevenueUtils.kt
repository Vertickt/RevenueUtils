package io.github.vertickt.revenueUtils

import io.github.vertickt.revenueUtils.command.SpawnCommand
import io.github.vertickt.revenueUtils.listener.PlayerJoinEvent
import io.papermc.paper.configuration.WorldConfiguration
import net.axay.kspigot.main.KSpigot

class RevenueUtils : KSpigot() {

    override fun startup() {
        //listener
        PlayerJoinEvent

        //command
        SpawnCommand()
    }

    override fun shutdown() {
        // Plugin shutdown logic
    }
}
