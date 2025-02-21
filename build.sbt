ThisBuild / useCoursier := true
val scala3Version = "3.6.3"
lazy val root = project
  .in(file("."))
  .settings(
    name := "part2pp",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    // libraryDependencies += "org.scalameta" %% "munit" % "2.0.0" % Test,
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
  resolvers += "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
enablePlugins(ScalafmtPlugin)
