function maxSum(stack1, stack2,
    stack3, n1, n2, n3)
{
let sum1 = 0, sum2 = 0, sum3 = 0;

for(let i = 0; i < n1; i++)
sum1 += stack1[i];

for(let i = 0; i < n2; i++)
sum2 += stack2[i];

for(let i = 0; i < n3; i++)
sum3 += stack3[i];

let top1 = 0, top2 = 0, top3 = 0;
let ans = 0;

while (true)
{
if (top1 == n1 || top2 == n2 ||
top3 == n3)
return 0;
 
if (sum1 == sum2 && sum2 == sum3)
return sum1;

if (sum1 >= sum2 && sum1 >= sum3)
sum1 -= stack1[top1++];
else if (sum2 >= sum1 && sum2 >= sum3)
sum2 -= stack2[top2++];
else if (sum3 >= sum2 && sum3 >= sum1)
sum3 -= stack3[top3++];
}
}

let stack1 = [ 3, 2, 1, 1, 1 ];
let stack2 = [ 4, 3, 2 ];
let stack3 = [ 1, 1, 4, 1 ];

let n1 = stack1.length;
let n2 = stack2.length;
let n3 = stack3.length;

console.log(maxSum(stack1, stack2,
          stack3, n1, n2, n3));