## length of array passed as formal parameter

```
*(&height+1)-height
```

# Convert character array to string

```
string s(c);
```

# Convert vector of char to string

```
string s(v.begin(),v.end())

for (char c: input) {
    s.push_back(c);
}
```

# Convert string into vector of chars

```
string s{"sai"};
vector<char> c(s.begin(),s.end())
```