
// FILE: A.java
public class A {
    public void same(@kotlin.internal.ParameterName(name = "ok") String first, @kotlin.internal.ParameterName(name = "ok") String second) {
    }
}

// FILE: test.kt
fun main() {
    val test = A()
    test.same("hello", "world")
    test.same(ok = "hello", <!ARGUMENT_PASSED_TWICE!>ok<!> = <!UNRESOLVED_REFERENCE!>world<!><!NO_VALUE_FOR_PARAMETER!>)<!>
    test.same("hello", <!ARGUMENT_PASSED_TWICE!>ok<!> = "world"<!NO_VALUE_FOR_PARAMETER!>)<!>
}