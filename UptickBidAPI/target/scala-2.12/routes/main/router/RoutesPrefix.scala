
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/engseng/Documents/Alicloud/play-scala-rest-api-example/play-scala-rest-api-example/conf/routes
// @DATE:Sun Feb 11 16:31:47 SGT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
