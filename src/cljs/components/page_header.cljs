(ns working-thursday.components
  (:require [om.core :as om :include-macros true]
            [om.dom :as dom :include-macros true]
            ))

(defn header-view [data owner]
  (om/component
    (dom/h1 nil
            (dom/i #js {:className "fa fa-gears fa-3x"})
            (str " " data))))


(defn paragraph-view [_ owner]
  (om/component
    (dom/p nil
           (dom/i #js {:className "fa fa-quote-left fa-2x pull-left fa-border"})
           (str "" "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum"))))

