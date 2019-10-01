import com.typesafe.sbt.packager.archetypes.JavaAppPackaging
import com.typesafe.sbt.packager.docker.DockerPlugin


lazy val server = project
  .in(file("server"))
  .settings(
    name := "db-server",
    fork in run := true,
    javaOptions in run += "-Xmx6G"
  )
  .settings(libraryDependencies ++= {
    import Dependencies._
    Seq(
      config
    ) 
  })
  .enablePlugins(ReleasePlugin, JavaAppPackaging, DockerPlugin, GitVersioning, BuildInfoPlugin)

lazy val root = project
  .in(file("."))
  .settings(name := "myapp")
  .settings(releaseVersionBump := sbtrelease.Version.Bump.Bugfix)
  .settings(publish := {})
  .enablePlugins(ReleasePlugin)
  .aggregate(server)
