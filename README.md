# failing-sbt-13
Reproduction of failing sbt build

## Fail

To reproduce type twice
```
docker run -w /code -v $(pwd):/code \
-v $(pwd)/localsbtspace:/.sbt hseeberger/scala-sbt:8u222_1.3.2_2.12.10 \
sbt -Dsbt.global.base=.sbt/global -Dsbt.boot.directory=.sbt/boot/ clean
```
## Result
Second try will give
```
[info] Loading settings for project code-build from plugins.sbt ...
[info] Loading project definition from /code/project
[info] Compiling 1 Scala source to /code/project/target/scala-2.12/sbt-1.0/classes ...
[error] /code/project/build.scala:1:21: object sbt is not a member of package com.typesafe
[error] import com.typesafe.sbt.SbtNativePackager._
[error]                     ^
[error] /code/project/build.scala:2:21: object sbt is not a member of package com.typesafe
[error] import com.typesafe.sbt.packager.Keys._
[error]                     ^
[error] /code/project/build.scala:5:21: object sbt is not a member of package com.typesafe
[error] import com.typesafe.sbt.packager.docker.Cmd
[error]                     ^
[error] /code/project/build.scala:6:8: not found: object sbtrelease
[error] import sbtrelease.ReleasePlugin.autoImport.releaseCrossBuild
[error]        ^
[error] four errors found
[error] (Compile / compileIncremental) Compilation failed
Project loading failed: (r)etry, (q)uit, (l)ast, or (i)gnore?
```
