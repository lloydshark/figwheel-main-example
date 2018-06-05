Figwheel Main Example

clojure -m figwheel.main -b dev -r

Notes:

First time 

```clojure -m figwheel.main -b dev -r```

First Time...

cljs.user=> (ns-publics 'example.core)
{add-one #'example.core/add-one}
cljs.user=> :cljs/quit

Second Time...

```clojure -m figwheel.main -b dev -r```

cljs.user=> (ns-publics 'example.core)
{}
