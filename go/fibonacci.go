package main

import (
	"fmt"
	"os"
	"strconv"
)

func fibonacci(n int) int {
	if n <= 1 {
		return n
	}
	return fibonacci(n-1) + fibonacci(n-2)
}

func main() {
	if len(os.Args) < 2 {
		fmt.Println("Usage: go run fibonacci.go <n>")
		return
	}
	n, err := strconv.Atoi(os.Args[1])
	if err != nil || n < 0 {
		fmt.Println("Please provide a non-negative integer.")
		return
	}
	fmt.Println(fibonacci(n))
}