lazy val taxYear = (project in file("."))
  .enablePlugins(SbtAutoBuildPlugin, SbtGitVersioning, SbtArtifactory)
  .settings(
    name := "tax-year",
    libraryDependencies ++= LibraryDependencies(),
    crossSbtVersions := List("0.13.18", "1.3.4"),
    crossScalaVersions := List("2.11.12", "2.12.8"),
    developers := List(
      Developer(
        "andy-gray",
        "Andrew Gray",
        "andrew.gray@digital.hmrc.gov.uk",
        new URL("http://www.hmrc.gov.uk")
      )
    )
  )
  .settings(majorVersion := 1)
  .settings(makePublicallyAvailableOnBintray := true)
  .settings(
    resolvers += Resolver.bintrayRepo("hmrc", "releases"),
    resolvers += "hmrc-releases" at "https://artefacts.tax.service.gov.uk/artifactory/hmrc-releases/"
  )
