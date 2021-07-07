## Vectoriation

```
Vectorization is a powerful ability within NumPy to express operations as occurring on entire arrays rather than their individual elements
```

# Iter Tuple's

```
The itertuples() function is used to iterate over DataFrame rows as namedtuples.

If True, return the index as the first element of the tuple.

df = pd.DataFrame({'num_legs': [4, 2], 'num_wings': [0, 2]},
                  index=['fox', 'eagle'])
df

num_legs	num_wings
fox	4	0
eagle	2	2

Pandas(Index='fox', num_legs=4, num_wings=0)
Pandas(Index='eagle', num_legs=2, num_wings=2)
```

## Iter Rows

```
The iterrows() function is used to iterate over DataFrame rows as (index, Series) pairs.

Iterates over the DataFrame columns, returning a tuple with the column name and the content as a Series.

int      2.0
float    2.5
Name: 0, dtype: float64
```

# math.floor and math.ceil alternative

```
3//2 -> 1
-(-3//2) -> 2
```