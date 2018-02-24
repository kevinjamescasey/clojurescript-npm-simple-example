;; build.clj
(require '[cljs.build.api :as b])

(b/build "src"
         {:optimizations :none
          :source-map true
          :main 'example.core
          :npm-deps {:left-pad "1.1.3"} ;; NEW
          :install-deps true ;; NEW
          :output-to "main.js"}
  )
