// @SOURCE:/home/antonin/IdeaProjects/CCA_Play/conf/routes
// @HASH:c6cf607f3c3b0ef03b98a31e1cec952d9aee1bf3
// @DATE:Fri Jul 22 10:49:01 BST 2016


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_Application_showEvents1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("showEvents"))))
private[this] lazy val controllers_Application_showEvents1_invoker = createInvoker(
controllers.Application.showEvents,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showEvents", Nil,"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """showEvents"""))
        

// @LINE:10
private[this] lazy val controllers_Assets_at2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at2_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """$file<.+>"""))
        

// @LINE:12
private[this] lazy val controllers_Application_submit3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("submit"))))
private[this] lazy val controllers_Application_submit3_invoker = createInvoker(
controllers.Application.submit,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "submit", Nil,"POST", """""", Routes.prefix + """submit"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """showEvents""","""controllers.Application.showEvents"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$file<.+>""","""controllers.Assets.at(path:String = "/", file:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """submit""","""controllers.Application.submit""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:9
case controllers_Application_showEvents1_route(params) => {
   call { 
        controllers_Application_showEvents1_invoker.call(controllers.Application.showEvents)
   }
}
        

// @LINE:10
case controllers_Assets_at2_route(params) => {
   call(Param[String]("path", Right("/")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at2_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:12
case controllers_Application_submit3_route(params) => {
   call { 
        controllers_Application_submit3_invoker.call(controllers.Application.submit)
   }
}
        
}

}
     