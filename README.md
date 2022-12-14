# Kotlin incremental compilation bug reproduce

Hi! This sample repo shows how one can reproduce a bug with kotlin `kotlin.incremental.useClasspathSnapshot=true` not working
when build directory is outside of a project and we are changing the resources in android project. This happens when you add
something like that in your build.gradle.kts file.
```kotlin
allprojects {
    buildDir = File(gradle.gradleUserHomeDir, "build/${rootProject.projectDir.path}/${project.name}")
}
```

## How to reproduce

You can run gradle profiler with scenario of changing id and string resources and observe difference in kotlin incremental compilation report
```bash
gradle-profiler --profile chrome-trace --scenario-file ./scenarios.conf --warmups 1
```

### Kotlin compilation report diff
- without changing buildDir
```
[ClasspathSnapshot] Changed set = ProgramSymbolSet(classes = [], classMembers = {io/github/mishkun/myapplication/R.id=[view_6fe430ef_4ec7_4518_9944_95fdfaf3d702_incremental_xml_change_7d72f64f_MEASURE_1, view_6fe430ef_4ec7_4518_9944_95fdfaf3d702_incremental_xml_change_7d72f64f_WARM_UP_1, <SAM-CONSTRUCTOR>], io/github/mishkun/myapplication/R.string=[new_resource_6fe430ef_4ec7_4518_9944_95fdfaf3d702_incremental_xml_change_7d72f64f_MEASURE_1, new_resource_6fe430ef_4ec7_4518_9944_95fdfaf3d702_incremental_xml_change_7d72f64f_WARM_UP_1, <SAM-CONSTRUCTOR>]}, packageMembers = {})
```
- with changing buildDir
```
[ClasspathSnapshot] Changed set = ProgramSymbolSet(classes = [io/github/mishkun/myapplication/R.id, io/github/mishkun/myapplication/R.string], classMembers = {}, packageMembers = {})
```
