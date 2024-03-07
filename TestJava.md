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
>```json
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

### Concatenate two strings
Use method`concat()` or operator`+`

`concat()` only accepts one argument and its type must be string.

`+` can concatenate strings and numbers. It will transform the number(int, double etc) to String.