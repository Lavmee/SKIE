@file:Suppress("DEPRECATION")

package co.touchlab.skie.plugin.shim.impl

import co.touchlab.skie.plugin.SkieTarget
import co.touchlab.skie.plugin.util.withType
import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.dsl.KotlinNativeArtifact
import org.jetbrains.kotlin.gradle.targets.native.tasks.artifact.kotlinArtifactsExtension

internal fun initializeArtifactTargetsIfExist(project: Project, skieTargets: NamedDomainObjectContainer<SkieTarget>) {
    project.kotlinArtifactsExtension.artifacts.withType<KotlinNativeArtifact>().configureEach {
        val artifactTargets = ActualSkieArtifactTarget.createFromArtifact(this, project)

        skieTargets.addAll(artifactTargets)
    }
}
