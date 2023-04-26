(ns potter-kata.core-test
  (:require [clojure.test :refer :all]
            [potter-kata.core :refer :all]))

(deftest empty
  (testing "should return 0 when called with an empty basket"
    (is (= (calculateBasketPrice []) 0))))

(deftest one
  (testing "Should return 8 when called with a basket with 1 book"
    (is (= (calculateBasketPrice [1]) 8))))
