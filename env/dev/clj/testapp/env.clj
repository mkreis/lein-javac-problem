(ns testapp.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [testapp.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[testapp started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[testapp has shut down successfully]=-"))
   :middleware wrap-dev})
