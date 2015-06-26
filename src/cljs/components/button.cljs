(ns components.button
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            [om-bootstrap.button :as b]
            [om-bootstrap.panel :as p]
            [om-tools.dom :as d :include-macros true]
            ))

(defn counter-view [_ owner]
  (reify
    om/IRender
    (render [_]
      (dom/p nil "A Counter!")
      (b/button {:bs-style "primary"} "Primary")
      (p/panel {:header (d/h3 "Panel title") :bs-style "primary"} )
      )))