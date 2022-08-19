(ns testapp.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[testapp started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[testapp has shut down successfully]=-"))
   :middleware identity})
