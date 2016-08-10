(ns tiy-homework-fizz-buzz-clojure.core-test)


(defn fizz-buzz [start end accumulator]

  (if (<= start end)
    (cond
      (= (mod start 15) 0) (fizz-buzz (+ start 1) end (str accumulator "FizzBuzz" "\n"))
      (= (mod start 5) 0) (fizz-buzz (+ start 1) end (str accumulator "Buzz" "\n"))
      (= (mod start 3) 0) (fizz-buzz (+ start 1) end (str accumulator "Fizz" "\n"))
      :else (fizz-buzz (+ start 1) end (str accumulator start "\n")))

    (println accumulator)))


(defn -main[]
  (fizz-buzz 1 100 ""))

(-main)
