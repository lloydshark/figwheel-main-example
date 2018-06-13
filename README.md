Calling Broken Go Block hangs repl...

```clojure -m figwheel.main -b dev -r```

    ClojureScript 1.10.238
    cljs.user=> (example.core/bad-go)
    Eval timed out!
    No stacktrace available.
    cljs.user=> (+ 1 2)
    
And then you need to Ctrl-C to get out.


