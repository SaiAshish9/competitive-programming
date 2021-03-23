## @JvmStatic

```
Kotlin represents package-level functions as static methods. Kotlin can also generate static methods for functions defined in named objects or companion objects if you annotate those functions as @JvmStatic. If you use this annotation, the compiler will generate both a static method in the enclosing class of the object and an instance method in the object itself.

class C {
    companion object {
        @JvmStatic fun callStatic() {}
        fun callNonStatic() {}
    }
}


C.callStatic(); // works fine
C.callNonStatic(); // error: not a static method
C.Companion.callStatic(); // instance method remains
C.Companion.callNonStatic(); 
```

## class vs object keyword

```
Whereas a class describes structures that can be instantiated as and when desired and allows for as many instances as needed, an object instead represents a single static instance, and can never have any more or any less than this one instance.
```