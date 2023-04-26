(ns potter-kata.core
  (:gen-class))


(defn calculateBasketPrice 
  [books]
  (* 8 (count books)))