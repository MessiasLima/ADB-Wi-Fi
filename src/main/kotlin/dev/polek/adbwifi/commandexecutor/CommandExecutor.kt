package dev.polek.adbwifi.commandexecutor

interface CommandExecutor {
    fun exec(command: String): Sequence<String>
}