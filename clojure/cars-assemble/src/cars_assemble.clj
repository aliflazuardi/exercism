(ns cars-assemble)

(def cars-per-hour 221)

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (cond (< speed 5) (* cars-per-hour speed)
        (< speed 9) (* (* cars-per-hour speed) 0.9)
        (= speed 9) (* (* cars-per-hour speed) 0.8)
        (= speed 10) (* (* cars-per-hour speed) 0.77)))

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
  (int (quot (production-rate speed) 60)))
