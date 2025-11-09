package io.github.vertickt.revenueUtils.util

import net.axay.kspigot.extensions.server
import org.bukkit.Location
import org.bukkit.World

fun w(world: String) : World? { return server.getWorld(world) }

val spawnLocation = Location(w("world"), 0.5, 101.0, 0.5, 0.0F, 0.0F)