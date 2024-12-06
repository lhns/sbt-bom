package com.github.sbt.sbom.licenses

case class License(
                    id: String,
                    name: String,
                    references: Seq[String]
                  )
