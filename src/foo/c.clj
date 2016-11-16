(ns foo.c
  (:require foo.a foo.b))

(println "loading" (.name *ns*))

(println (foo.b/method (foo.a/->Thing)))

