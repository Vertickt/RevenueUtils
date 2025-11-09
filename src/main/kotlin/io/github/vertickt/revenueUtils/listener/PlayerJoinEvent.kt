package io.github.vertickt.revenueUtils.listener

import io.github.vertickt.revenueUtils.util.accent
import io.github.vertickt.revenueUtils.util.mm
import io.github.vertickt.revenueUtils.util.spawnLocation
import net.axay.kspigot.event.listen
import net.axay.kspigot.runnables.task
import net.kyori.adventure.title.Title
import net.kyori.adventure.title.TitlePart
import org.bukkit.Sound
import org.bukkit.event.player.PlayerJoinEvent
import java.time.Duration

object PlayerJoinEvent {

    val onJoin = listen<PlayerJoinEvent> {
        val player = it.player
        it.joinMessage(null)
        player.teleportAsync(spawnLocation)
        player.isFlying = false

        task(delay = 5) {
            val times = Title.Times.times(ofSec(0), ofSec(3), ofSec(1))
            player.sendTitlePart(TitlePart.TIMES, times)
            player.sendTitlePart(TitlePart.SUBTITLE, mm("${accent}<b>REVENUE"))
            var letter = 0
            var text = "Welcome to"
            task(true, 5, 1, 11) {
                player.sendTitlePart(TitlePart.TITLE, mm("${accent}<b>${text.take(letter)}"))
                letter++
            }
            player.playSound(player.location, Sound.BLOCK_BEACON_ACTIVATE, 1f, 1f)
        }
    }

    private fun ofSec(time: Long): Duration {
        return Duration.ofSeconds(time)
    }
}