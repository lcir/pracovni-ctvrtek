(ns ^:figwheel-always hello-world.hello
  (:require [cljs.reader :as reader]
            [goog.events :as events]
            [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [components.button :as but])
  (:import [goog.net XhrIo]
           goog.net.EventType
           [goog.events EventType]))

(enable-console-print!)

(def app-state (atom {:foo "bar"}))

(defn widget [data owner]
  (reify
    om/IRender
    (render [_]
      (om/build but/counter-view {})
      )))

(om/root widget app-state
         {:target (.getElementById js/document "app")})