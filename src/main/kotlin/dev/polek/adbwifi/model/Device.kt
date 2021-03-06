package dev.polek.adbwifi.model

data class Device(
    val id: String,
    val serialNumber: String,
    val name: String,
    val address: String?,
    val androidVersion: String,
    val apiLevel: String,
    val connectionType: ConnectionType,
    var isConnected: Boolean = false
) {
    val isUsbDevice = connectionType == ConnectionType.USB
    val isWifiDevice = connectionType == ConnectionType.WIFI

    val uniqueId: String = "$serialNumber-$id"

    enum class ConnectionType {
        USB, WIFI, NONE
    }
}
