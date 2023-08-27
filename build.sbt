name := "echotest-scala"

version := "0.3"

scalaVersion := "3.2.1"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Yexplicit-nulls", "-Ysafe-init", "-language:strictEquality")

libraryDependencies ++= Seq(
  "com.novocode"      %  "junit-interface" % "0.11"    % Test,  // required only for plain JUnit testing
  "org.scalatest"     %% "scalatest"       % "3.2.16"   % Test,
  "org.scalacheck"    %% "scalacheck"      % "1.17.0"  % Test,
  "org.scalatestplus" %% "scalacheck-1-16" % "3.2.16.0" % Test
)
