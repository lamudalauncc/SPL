package stack

import validParentheses

fun main() {
    /* Below returns true as the stack matches*/
    println("((()))".validParentheses())
    /* Below returns false as the stack does not match*/
    println("((())".validParentheses())
}