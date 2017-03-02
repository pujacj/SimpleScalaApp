package com.hm.routes

import java.util

import com.hm.connector.MysqlClient
import spray.http.HttpCookie
import spray.http.MediaTypes.`text/html`
import spray.json.JsString
import spray.routing.HttpService
import spray.json._
import collection.JavaConversions._
import collection.JavaConverters

import scala.collection.mutable.{ArrayBuffer, ListBuffer}
/**
  * Created by pooja on 17/2/17.
  */
trait Routes extends HttpService
  with TodoHandler
{



  val route =

  path("") {

      get {
        respondWithMediaType(`text/html`) { // XML is marshalled to `text/xml` by default, so we simply override here
          complete {
            <html>
              <body>
                <h1>welcome to SimpleScalaApp :)</h1>
              </body>
            </html>
          }
        }
      }
    }












}
