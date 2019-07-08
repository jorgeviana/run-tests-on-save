(ns bowling.core-test
  (:require [clojure.test :refer :all]
            [bowling.core :refer :all]))

(defn roll-many [times rolls]
  (loop [t times accumulator ()]
    (if (= t 0)
      accumulator
      (recur (dec t) (cons rolls accumulator)))))

(deftest roll-many-test
  (testing "produces 0 rolls"
    (is (= 0 (count (roll-many 0 0)))))

  (testing "produces 1 roll"
    (is (= 1 (count (roll-many 1 0)))))

  (testing "produces 20 rolls"
    (is (= 20 (count (roll-many 20 0))))))


(deftest bowling-test
  (testing "a gutter game"
    (is (= 0 (score (roll-many 20 0))))))
