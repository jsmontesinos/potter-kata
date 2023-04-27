(ns potter-kata.core-test
  (:require [clojure.test :refer :all]
            [potter-kata.core :refer :all]))

(deftest emptyBasket
  (testing "should return 0 when called with an empty basket"
    (is (= (calculateBasketPrice []) 0))))

(deftest oneBook
  (testing "Should return 8 when called with a basket with a book of some type"
    (are [bookType] (= (calculateBasketPrice [bookType]) 8)
      1
      2
      3
      4
      5)))

(deftest threeCopiesBook1
  (testing "Should return 8 * 3 when called with a basket of three copies of book 1"
    (is (= (calculateBasketPrice [1 1 1]) (* 8 3)))))