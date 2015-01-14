(defproject cljsbuild-data-reader "0.1.0"
  :dependencies [
    [org.clojure/clojure "1.6.0" :scope "provided"]
    [org.clojure/clojurescript "0.0-2665" :scope "provided"]
  ]
  
  :cljsbuild { 
    :builds [
      { :id "release"
        :source-paths ["src"]
        :compiler {
          :output-to     "release.js"
          :optimizations :advanced
        }}
  ]}
  :plugins [
    [lein-cljsbuild "1.0.4" :exclusions [org.clojure/clojure]]
  ]

  :clean-targets ^{:protect false} [ "target" "release.js"]
)
