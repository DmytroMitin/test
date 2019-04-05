val scalaTestVersion = "3.0.5"
val catsVersion = "1.6.0"

lazy val ShapelessGuide = (project in file(".")).
  settings(
    name := "test",
    version := "0.1",
    scalaVersion := "2.12.8",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % scalaTestVersion % Test,
      "org.typelevel" %% "cats-core" % catsVersion
    ),
    scalacOptions ++= Seq(
      "-language:higherKinds",
      "-deprecation",
      "-encoding", "UTF-8",
      "-Ypartial-unification",
      "-feature",
      "-language:_"
    )
  )