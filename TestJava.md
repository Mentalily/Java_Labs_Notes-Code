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


### Concatenate two strings
Use method`concat()` or operator`+`

`concat()` only accepts one argument and its type must be string.

`+` can concatenate strings and numbers. It will transform the number(int, double etc) into String.


#### Differences between `==` and `equals()`
`==` actually compare the pointers(or its **address**)

`equals` only compare the contents;

Strings created without `new()` are in the **constant pool** and they are unique so `s1 == s2`.  
But Strings created through `new()` are stored in **heap memory**, so different instances have different addresses.

The following is explaination of ChatGPT:

> 在Java中，使用 `new` 关键字构造对象实例时，对象本身存储在堆内存中，而引用变量存储在栈内存中。让我们来详细解释一下：
>
> 1. **堆内存（Heap Memory）：**
>   - 堆内存用于存储对象的实例。每当使用 `new` 关键字创建一个新的对象时，Java 运行时系统就会在堆内存中为该对象分配内存空间。堆内存中的对象实例可以被多个引用变量所引用。
>   - 在堆内存中，对象的生命周期由 JVM 的垃圾回收机制管理。当没有任何引用指向一个对象时，该对象会成为垃圾，最终被垃圾回收器回收。
>
> 2. **栈内存（Stack Memory）：**
>   - 栈内存用于存储局部变量、方法参数和方法调用等信息。在执行 Java 方法时，每个方法都会创建一个栈帧，其中包含了方法的局部变量表。当一个方法被调用时，它的栈帧被推入栈顶，当方法执行完毕时，它的栈帧会被弹出栈。
>   - 在 Java 中，引用变量（包括对象引用）也被存储在栈内存中。当你声明一个引用变量时，实际上是在栈内存中创建了一个指向堆内存中对象的引用。
>
>因此，当你使用 `new` 关键字创建一个对象实例时，对象实例本身存储在堆内存中，而引用变量存储在栈内存中。对象实例的生命周期由它的引用变量决定，只有当没有任何引用指向对象时，对象才会被垃圾回收器回收。


*If you use the method `intern()`:*


>`intern()` 是一个 Java 中的方法，它是 `String` 类的一个方法。`intern()` 方法的作用是将字符串对象添加到字符串常量池中，并返回常量池中该字符串的引用。
>
>字符串常量池是 Java 中的一种特殊存储结构，它用于存储字符串常量的，是一块 JVM 内存区域。使用 `intern()` 方法可以将字符串对象添加到字符串常量池中，如果常量池中已经存在相同内容的字符串，则返回常量池中的引用，否则将该字符串添加到常量池中并返回引用。
>
>下面是一个简单的示例，演示了 `intern()` 方法的使用：
>
>```java
>public class Main {
>   public static void main(String[] args) {
>       String str1 = new String("Hello"); // 创建一个新的字符串对象
>       String str2 = "Hello"; // 从字符串常量池中获取字符串
>       String str3 = str1.intern(); // 将字符串添加到字符串常量池中，并返回引用
>
>       System.out.println(str1 == str2); // false，因为str1和str2引用的不是同一个对象
>       System.out.println(str2 == str3); // true，因为str2和str3引用的是同一个对象
>   }
>}
>```
>
>在这个例子中，`str1` 和 `str2` 引用的不是同一个字符串对象，因为`new String("Hello")`创建了一个新的对象，而 `"Hello"` 则是从字符串常量池中获取的。然后，调用 `intern()` 方法将 `str1` 所引用的字符串添加到字符串常量池中，并返回了常量池中的引用，因此 `str3` 和 `str2` 引用的是同一个字符串对象。
>
>需要注意的是，`intern()` 方法在实际应用中使用得相对较少，因为它可能会增加字符串常量池的负担。通常情况下，Java 的字符串对象使用常量池中的字符串就已经足够了。

### Some Common Methods
| Method | Description |
|--------|---|
| `int length()`| return the length of strings|
| `String toUpperCase()` | convert characters to uppercase|
| `String toLowerCase()` | convert characters to lowercase|
| `char charAt(int index)` | return the character at the index|
| `String subString(int st, int ed)` | return the substring of [st,ed)|
|`String substring(int st)`| return the substring from st to end |
|`int indexOf(String s)`| return the index when s first appear|
|`int indexOf(String s, int i)`| return the index when s first appear after the position of index `i`|
| `String trim()`| return a new string without leading or trailing spaces|
|`String replace(String target, String replacement)`| return a new string, repalcing target with replacement|

*Actually, the parameters of method `indexOf` are various, more than 2 as listed.*

# Array
## Basic Informations
- Its elements are of the **same type**.
- Its **length cannot be changed**.
## One-demisional Array
### Decalaration and Creation
#### Declaration
There are two ways:
1. `int[] arr;`
2. `int arr[];`

Although these two methods have the same function, we recommend the first one because it's more common and the second reflects the style of C/C++. 

What's more, `int[]` more clearly declares its type. That is an array of integer.

If you only declare an array without initialization, the array is only an "empty shell" and there is **no actual storage space allocated to it**.

#### Initialization
There are several methods:

1. Direct assignment
    ```java
    myArray = new int[]{1, 2, 3, 4, 5};//Directly assign values;
    ```
   
2.  Step-by-step assignment
    ```java
    myArray = new int[5]; //allocate the array length
    myArray[0] = 1;
    myArray[1] = 2;
    ```
3. Using loop
   ```java
   myArray = new int[5];
   for (int i = 0; i < myArray.length; i++){
        myArray[i] = i + 1;
   }
   ```

#### Declare while Initialize
1. Give length but don't give values
   ```java
   int[] myArray = new int[10];//The default value is 0;
   ```
2. Array Constant and `new`
   ```java
   int[] myArray = new int[] {1, 2, 3, 4, 5};
   ```
3. Array Constant // This can only be used in this way;
   ```java
   int[] myArray = {1, 2, 3, 4, 5};
   ```

#### Understand more deeply
> 是的，您理解得完全正确。
>
> 在Java中，变量（例如 `myArray`）本身的引用是存储在栈内存中的。而数组对象（即数组的内容）是存储在堆内存中的。当您创建一个数组时，实际上是在堆内存中分配了一块连续的内存空间来存储数组的元素。
>
> 对于数组常量（例如 `{1, 2, 3}`），它们会被存储在常量池中。当您使用数组常量初始化数组时，数组变量（例如 `myArray`）会持有一个指向常量池中数组常量的引用。这意味着数组变量 `myArray` 中存储的是常量池中数组常量的引用，而不是数组常量的实际内容。
>
> 总结起来，数组变量存储在栈内存中，数组对象存储在堆内存中，数组变量中存储的是对数组对象的引用，而数组对象中的内容是数组常量的引用。

### Access array elements
Use index of the array.

Also, accessing an array element beyond the index range will cause `ArrayIndexOutOfBoundsException`.

### Get the length of an array
Use the array's attribute `length`.

The length of a multidimensional array is the length of first dimension.

## Two-dimensional Array
### Decalaration and Creation
#### Declaration
1. `int[][] myArray;`//more common; recommend
2. `int myArray[][];`

#### Initialization
1. `int[][] myArray = {{1, 2, 3}, {4, 5, 6}};`
2. `int[][] myArray = new int[3][];`
3. `int[][] myArray = new int[3][3];`

> 不，`int[][] arr = new int[3][]` 这样的语句不会报错。这是因为在 Java 中，可以使用动态初始化来创建一个二维数组，并且可以只指定行数而不指定列数。在这种情况下，只有行数被固定，而列数可以在后续的初始化中确定。
>
> 这条语句创建了一个具有 3 行的二维数组，但是每一行的列数是未指定的。这意味着每一行可以有不同的列数。
>
> 例如，您可以这样初始化这个二维数组：
>
> ```java
> arr[0] = new int[]{1, 2, 3}; // 第一行有 3 列
> arr[1] = new int[]{4, 5};    // 第二行有 2 列
> arr[2] = new int[]{6, 7, 8}; // 第三行有 3 列
> ```
>
> 在这种情况下，每一行的列数是根据实际初始化的情况来确定的，而不是在声明数组时就确定的。


## Dynamical Array - ArrayList
```java
import java.util.ArrayList;
```

### Basic Information
> 动态数组（Dynamic Array）是一种数据结构，它在内存中分配了一段连续的内存空间，用于存储数据。与静态数组不同的是，动态数组的大小可以在运行时动态地增加或减少，因此它也被称为可变长度数组。
>
> 动态数组的主要优点是可以在运行时根据需要调整大小，而无需事先知道数组的最大容量。这使得它在需要频繁插入或删除元素的情况下比静态数组更灵活。
>
> 在许多编程语言中，动态数组通常由标准库提供支持，以便简化其使用。例如，在C++中，std::vector是动态数组的一种实现；在Python中，列表（list）就是动态数组的一种表示。
>
> 动态数组通常通过以下几种方式实现：
>
> 1. **重新分配内存**：当数组需要扩展时，会分配一个更大的内存块，并将原始数据复制到新的内存块中。这个过程可能会很耗时，因为需要遍历整个数组。
>
> 2. **增长因子（Growth Factor）**：为了减少重新分配的频率，动态数组通常会按照一定的增长因子来扩展。常见的增长因子有2倍、1.5倍等。例如，如果数组当前已满，那么扩展时可能会将数组大小增加为原来的2倍。
>
> 3. **缩小容量**：如果数组中的元素数量显著减少，一些实现会在适当的时机缩小数组的容量，以释放多余的内存空间。
>
> 使用动态数组时需要注意的一些问题包括：
>
> - **时间复杂度**：动态数组通常能够在均摊意义下提供常数时间的插入、删除操作，但在某些情况下可能会因为重新分配内存而导致较高的时间复杂度。
>
> - **空间复杂度**：由于动态数组需要预留一定的额外空间以应对可能的扩展，因此可能会存在一定程度的空间浪费。
>
> - **内存碎片**：频繁的内存重新分配可能导致内存碎片的产生，进而影响系统的性能。
>
> 总的来说，动态数组是一种常用的数据结构，能够提供灵活性和高效性的平衡，适用于大多数动态数据存储需求。

### Initialization
`ArrayList<E> myArray = new ArrayList<>();`  
`<E>` represents a generic type.  
`E` is a type parameter, representing any type.

```java
ArrayList<Integer> myArray = new ArrayList<>(); 
```

### Add and Insert
Use the method of ArrayList: `add()`

```java
myArray.add(10);
myArray.add(12);
myArray.add(1, 11);
```

### Get
Use the method of ArrayList: `get()`

```java
myArray.get(0);
```

### Remove
Use the method of ArrayList: `remove()`

`myArray.remove(index);`

`myArrat.remove(object);`

```java
myArray.remove(10);
```

### Get the size of ArrayList
Use the method of ArrayList: `size()`

```java
System.out.println(a.size());
```


# File I/O
## Stream
> 流（stream）：一组有顺序的、有起点和终点的字节集合，是对数据传输的总称。数据在两个对象之间的传输就称为流。可以将流理解为链接两个水桶的水管。
>
> 按照流的传输方法，可以分为**输入流**和**输出流**；按照流的处理对象，又可以分为**字节流**和**字符流**。
>
> 流的基本操作有读操作和写操作，从流中取得数据的操作称为读操作，向流中添加数据的操作称为写操作。对输入流只能进行读操作，对输出流只能进行写操作。
>
> Java中与IO流相关的共有40多个类...hhh
>
*Excerpted from PPT*

## `FileIO.java` Some Common Methods
You can read its source code and documentation for more information.

| Method | Description|
| --- | ----- |
|`void writeStringToFile(String str, String fileName)`|将一个字符串追加地写入指定文件|
|`char getCharFromFile(int posm String filename)`| 将读取指定文件的第pos个字符|
|`String getLineFromFile(int pos, Sting fileName)`| 读取文件的第pos行的字符串|
|`String[] getAllLinesFromFile(String fileName)`| 读取文件中所有行中的字符串，并按照顺序储存在String类型数组中返回|
