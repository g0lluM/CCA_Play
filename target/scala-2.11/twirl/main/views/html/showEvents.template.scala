
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
object showEvents extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Array[Array[String]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(events: Array[Array[String]]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/public/stylesheets/bootstrap.css"/>
    <title>Events lists</title>

</head>

 <body>
 <h3> Here is the list of the events:</h3>
 <div class="row">
  <div class="col-md-2">
   <p><strong>City</strong></p>
  </div>
  <div class="col-md-2">
   <p><strong>Details</strong></p>
  </div>
  <div class="col-md-2">
   <p><strong>Date</strong></p>
  </div>
  <div class="col-md-2">
   <p><strong>Abstract</strong></p>
  </div>
  <div class="col-md-2">
   <p><strong>Price</strong></p>
  </div>
  <div class="col-md-2">
   <p><strong>Speaker</strong></p>
  </div>
 </div>


 """),_display_(/*36.3*/for(i <- 0 until events.length) yield /*36.34*/ {_display_(Seq[Any](format.raw/*36.36*/("""
  """),format.raw/*37.3*/("""<div class="row">
   <div class="col-md-2">
    <p>"""),_display_(/*39.9*/events(i)/*39.18*/(0)),format.raw/*39.21*/("""</p>
   </div>
   <div class="col-md-2">
    <p>"""),_display_(/*42.9*/events(i)/*42.18*/(1)),format.raw/*42.21*/("""</p>
   </div>
   <div class="col-md-2">
    <p>"""),_display_(/*45.9*/events(i)/*45.18*/(2)),format.raw/*45.21*/("""</p>
   </div>
   <div class="col-md-2">
    <p>"""),_display_(/*48.9*/events(i)/*48.18*/(3)),format.raw/*48.21*/("""</p>
   </div>
   <div class="col-md-2">
    <p>"""),_display_(/*51.9*/events(i)/*51.18*/(4)),format.raw/*51.21*/("""</p>
   </div>
   <div class="col-md-2">
    <p>"""),_display_(/*54.9*/events(i)/*54.18*/(5)),format.raw/*54.21*/("""</p>
   </div>
  </div>
""")))}),format.raw/*57.2*/("""
 """),format.raw/*58.2*/("""</body>
</html>

"""))}
  }

  def render(events:Array[Array[String]]): play.twirl.api.HtmlFormat.Appendable = apply(events)

  def f:((Array[Array[String]]) => play.twirl.api.HtmlFormat.Appendable) = (events) => apply(events)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 27 18:37:39 BST 2016
                  SOURCE: /home/antonin/IdeaProjects/CCA_Play/app/views/showEvents.scala.html
                  HASH: 98979487a4f1a13f0d2d77d8852294b0ede8ae61
                  MATRIX: 524->1|642->31|670->33|1370->707|1417->738|1457->740|1487->743|1565->795|1583->804|1607->807|1682->856|1700->865|1724->868|1799->917|1817->926|1841->929|1916->978|1934->987|1958->990|2033->1039|2051->1048|2075->1051|2150->1100|2168->1109|2192->1112|2247->1137|2276->1139
                  LINES: 19->1|22->1|24->3|57->36|57->36|57->36|58->37|60->39|60->39|60->39|63->42|63->42|63->42|66->45|66->45|66->45|69->48|69->48|69->48|72->51|72->51|72->51|75->54|75->54|75->54|78->57|79->58
                  -- GENERATED --
              */
          