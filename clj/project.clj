(defproject opengl "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :source-paths ["src/clj"]
  :jvm-opts ["-Djava.library.path=./native/linux/x64"])
  :main opengl.core)
