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

## Count Duplicates in a array

```
uniqueCount = ["a","b","c","d","d","e","a","b","c","f","g","h","h","h","e","a"];
var count = {};
uniqueCount.forEach(function(i) { count[i] = (count[i]||0) + 1;});
console.log(count);

var arr = ['a','b','c','d','d','e','a','b','c','f','g','h','h','h','e','a'];
var map = arr.reduce(function(prev, cur) {
  prev[cur] = (prev[cur] || 0) + 1;
  return prev;
}, {});
document.write(JSON.stringify(map));
```

```
[...Array(10).keys()]
Array.from({ length: s.length + 1 }, () => [false]);
```

```
var x=[1,2]
for(let i of x){
  console.log(i) -> 1,2
}
for(let i in x){
  console.log(i) -> 0,1
}
```

## last element of array

```
arr.slice(-1).pop()
```
