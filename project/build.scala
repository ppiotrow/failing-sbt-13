import com.typesafe.sbt.SbtNativePackager._
import com.typesafe.sbt.packager.Keys._
import sbt._
import Keys._
import com.typesafe.sbt.packager.docker.Cmd
import sbtrelease.ReleasePlugin.autoImport.releaseCrossBuild


object Settings {


}

object Dependencies {
  val config = "com.typesafe" % "config" % "1.3.4"
}
