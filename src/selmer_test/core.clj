(ns selmer-test.core
  (:gen-class)
  (:require [selmer.parser :as selmer]))

(defn render
  [f]
  (selmer/render-file (str f ".html") {}))
