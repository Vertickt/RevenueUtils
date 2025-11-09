package io.github.vertickt.revenueUtils.command

import io.github.vertickt.revenueUtils.util.accent
import io.github.vertickt.revenueUtils.util.mm
import io.github.vertickt.revenueUtils.util.spawnLocation
import net.axay.kspigot.commands.command
import net.axay.kspigot.commands.runs

class SpawnCommand {
    val spawnCommand = command("spawn") {
        runs {
            player.teleportAsync(spawnLocation)
            player.sendMessage(mm("${accent}Teleporting..."))
        }
    }
}