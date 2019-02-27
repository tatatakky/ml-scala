val defaultSetting = Seq(
  organization := "com.github.tatatakky",
  scalaVersion := "2.12.7"
)

lazy val root = (project in file("."))
  .settings(
    name := "machine-learning",
    scalaVersion := "2.12.7"
  )
  .settings(defaultSetting)
