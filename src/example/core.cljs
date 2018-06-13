(ns example.core
  (:require [clojure.core.async :refer [go]]))

(defn add-one [number]
  (+ number 1))

(defn bad-go []
      (go
          (throw (js/Error. "Bad Error"))))

