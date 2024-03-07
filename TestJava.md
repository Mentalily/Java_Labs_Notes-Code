# String

## Create a string
You can create a string in 4 ways:

1. Declare first and assign later
2. Assigned at declaration
3. Use keyword `new` to create a String instance
4. Use keyword `new` and character array

## Common operations on strings
### Get the length of a string
Use the method of string: `length()`(return `int`)

### Compare two strings(whether equal)

*Method 1*

    System.out.println(s1 == s2);

*Method 2*

    System.out.println(s1.equals(s2));

#### Differences between `==` and `equals()`
`==` actually compare the pointers(or its **address**)

`equals` only compare the contents;

Strings created without `new()` are in the **constant pool** and they are unique so `s1 == s2`.  
But Strings created through `new()` are stored in **heap memory**, so different instances have different addresses.