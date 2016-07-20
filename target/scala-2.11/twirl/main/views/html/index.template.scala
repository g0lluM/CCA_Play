
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Events management</title>
</head>

<body>
<a href="/views/addEvent.scala.html">Add event</a>
<a href="/showEvents">Show event(s)</a>
</body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 20 14:22:59 BST 2016
                  SOURCE: /home/antonin/IdeaProjects/CCA_Play/app/views/index.scala.html
                  HASH: 9702cc2e9baa07cf2d3476403382d7645564e52f
                  MATRIX: 580->0
                  LINES: 22->1
                  -- GENERATED --
              */
          