
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
    <title>Events lists</title>

</head>

<body>
    <p>
    """),_display_(/*13.6*/for(i <- 0 until events.length) yield /*13.37*/ {_display_(Seq[Any](format.raw/*13.39*/("""
      """),_display_(/*14.8*/events(i)),format.raw/*14.17*/("""<br>
      """)))}),format.raw/*15.8*/("""
    """),format.raw/*16.5*/("""</p>
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
                  DATE: Wed Jul 20 14:30:53 BST 2016
                  SOURCE: /home/antonin/IdeaProjects/CCA_Play/app/views/showEvents.scala.html
                  HASH: 5ab2bf704476e5c721af25af743b220596d7f178
                  MATRIX: 517->1|628->24|656->26|801->145|848->176|888->178|922->186|952->195|994->207|1026->212
                  LINES: 19->1|22->1|24->3|34->13|34->13|34->13|35->14|35->14|36->15|37->16
                  -- GENERATED --
              */
          