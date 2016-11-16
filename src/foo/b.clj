(ns foo.b)

(println "loading" (.name *ns*))

(defprotocol Protocol
  (method [this]))

;; replace with this to prevent protocol from being redefined upon cljsbuild reload
#_
(defonce --workaround--
  (defprotocol Protocol
   (method [this])))

