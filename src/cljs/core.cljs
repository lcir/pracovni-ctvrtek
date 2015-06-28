(ns ^:figwheel-always working-thursday.core
  (:require [cljs.reader :as reader]
            [goog.events :as events]
            [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [working-thursday.components :as comp])
  (:import [goog.net XhrIo]
           goog.net.EventType
           [goog.events EventType]))

(enable-console-print!)

(def app-state (atom {:foo "bar"}))

(defn widget [data owner]
  (reify
    om/IRender
    (render [_]
      (dom/div nil
      (om/build comp/header-view "Work{ing Thurs}day")
      (om/build comp/paragraph-view {})))))

(om/root widget app-state
         {:target (.getElementById js/document "app")})