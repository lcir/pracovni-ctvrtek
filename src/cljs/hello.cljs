(ns ^:figwheel-always hello-world.hello
  (:require [cljs.reader :as reader]
            [goog.events :as events]
            [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true])
  (:import [goog.net XhrIo]
           goog.net.EventType
           [goog.events EventType]))

(enable-console-print!)

(println "Hello world!!!")

(defn someName []
  (js/alert "Něco")
  )

(defn ss []
  (Math.log (10)))

