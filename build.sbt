val scala3Version = "3.2.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Password Checker",
    version := "0.0.1",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq("org.scalameta" %% "munit" % "0.7.29" % Test, "org.scalatest" %% "scalatest" % "3.2.14" % "test" )
    
      

  )
