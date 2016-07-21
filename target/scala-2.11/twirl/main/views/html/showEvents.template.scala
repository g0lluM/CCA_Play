
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object showEvents extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Array[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(events: Array[String]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/public/stylesheets/bootstrap.css"/>
    <title>Events lists</title>

</head>

<body>
   <div class="container">
    <h3> Here is the list of events:</h3>
    <p><strong>City   Details   Date   Abstract   Price   Speaker</strong></p><br>
    """),_display_(/*16.6*/for(i <- 0 until events.length) yield /*16.37*/ {_display_(Seq[Any](format.raw/*16.39*/("""
      """),format.raw/*17.7*/("""<p>"""),_display_(/*17.11*/events(i)),format.raw/*17.20*/("""</p>
      """)))}),format.raw/*18.8*/("""
   """),format.raw/*19.4*/("""</div>
</body>
</html>

"""))}
  }

  def render(events:Array[String]): play.twirl.api.HtmlFormat.Appendable = apply(events)

  def f:((Array[String]) => play.twirl.api.HtmlFormat.Appendable) = (events) => apply(events)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jul 21 14:43:37 BST 2016
                  SOURCE: /home/antonin/IdeaProjects/CCA_Play/app/views/showEvents.scala.html
                  HASH: ed96ae7ae2c2e96eff404823eac745a9f55b9340
                  MATRIX: 517->1|628->24|656->26|1031->375|1078->406|1118->408|1152->415|1183->419|1213->428|1255->440|1286->444
                  LINES: 19->1|22->1|24->3|37->16|37->16|37->16|38->17|38->17|38->17|39->18|40->19
                  -- GENERATED --
              */
          