(ns potter-kata.core-test
  (:require [clojure.test :refer :all]
            [potter-kata.core :refer :all]))

(deftest empty
  (testing "should return 0 when called with an empty basket"
    (is (= (calculateBasketPrice []) 0))))

(deftest one
  (testing "Should return 8 when called with a basket book 1"
    (is (= (calculateBasketPrice [1]) 8))))

(deftest two
  (testing "Should return 8 when called with a basket book 2"
    (is (= (calculateBasketPrice [2]) 8))))

(deftest three
  (testing "Should return 8 when called with a basket book 3"
    (is (= (calculateBasketPrice [3]) 8))))

(deftest four
  (testing "Should return 8 when called with a basket book 4"
    (is (= (calculateBasketPrice [4]) 8))))

(deftest five
  (testing "Should return 8 when called with a basket book 5"
    (is (= (calculateBasketPrice [5]) 8))))
