# const vs var vs let

# var 

```
var is function scoped when it is declared within a function. This means that it is available and can be accessed only within that function.

var variables can be re-declared and updated

var a= "b"
var a= "c"

var a = "b"
a="c"

Hoisting

console.log (greeter);
var greeter = "say hello"
it is interpreted as this:

var greeter;
console.log(greeter); // greeter is undefined
greeter = "say hello"

Probleam

var greeter = "hey hi";
var times = 4;
if (times > 3) {
    var greeter = "say Hello instead"; 
}

console.log(greeter) // "say Hello instead"
```

# let

```
let is block scoped

let can be updated but not re-declared.
let greeting = "say Hi";
greeting = "say Hello instead";

Just like  var, let declarations are hoisted to the top. Unlike var which is initialized as undefined, the let keyword is not initialized. So if you try to use a let variable before declaration, you'll get a Reference Error.

This fact makes let a better choice than var. When using let, you don't have to bother if you have used a name for a variable before as a variable exists only within its scope.
```

## Const

```
const declarations are block scoped

const cannot be updated or re-declared

Just like let, const declarations are hoisted to the top but are not initialized.
```