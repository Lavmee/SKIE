package co.touchlab.skie.compilerinject.compilerplugin

import co.touchlab.skie.util.plugin.SkiePlugin
import org.jetbrains.kotlin.compiler.plugin.CompilerPluginRegistrar

abstract class BaseSkieComponentRegistrar : CompilerPluginRegistrar() {

    override val pluginId: String = SkiePlugin.id
}
