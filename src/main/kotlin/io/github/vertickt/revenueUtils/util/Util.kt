package io.github.vertickt.revenueUtils.util

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.minimessage.MiniMessage

fun mm(input: String) : Component { return MiniMessage.miniMessage().deserialize(input) }
const val accent = "<color:#49c721>"