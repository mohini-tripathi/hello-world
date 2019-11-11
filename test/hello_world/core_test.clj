(ns hello-world.core-test
  (:require [clojure.test :refer :all]
            [hello-world.core :refer :all]))


(with-test
  (defn my-function [& args]
    (str "Hello, World!"))
  (is (= "Hello" (my-function)))
  (is (= "HELLO" (my-function)))
  (is (= "Hello, World!" (my-function)))
  (is (= "Hi" (my-function))))

(run-tests)