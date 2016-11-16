(ns foo.a
  (:require foo.b))

(println "loading" (.name *ns*))

(defrecord Thing []
  foo.b/Protocol
  (method [this] :result))
