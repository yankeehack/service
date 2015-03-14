name := """service"""

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.3",
  "com.typesafe.akka" %% "akka-contrib" % "2.3.3",
  "de.grundid.opendatalab" % "geojson-jackson" % "1.1",
  "org.webjars" % "bootstrap" % "3.0.0",
  "org.webjars" % "knockout" % "2.3.0",
  "org.webjars" % "requirejs" % "2.1.11-1",
  "org.webjars" % "leaflet" % "0.7.2",
  "org.webjars" % "rjs" % "2.1.11-1-trireme" % "test",
  "org.webjars" % "squirejs" % "0.1.0" % "test"
)

scalaVersion := "2.11.1"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

MochaKeys.requires += "SetupMocha.js"

pipelineStages := Seq(rjs, digest, gzip)



fork in run := true