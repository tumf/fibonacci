package main

import (
	"fmt"
	"os"
	"strconv"
)

func fibonacci(n int) int {
	if n < 0 {
		return 0
	}
	if n == 0 {
		return 0
	}
	if n == 1 {
		return 1
	}
	a, b := 0, 1
	for i := 2; i <= n; i++ {
		a, b = b, a+b
	}
	return b
}

func main() {
	if len(os.Args) != 2 {
		fmt.Println("Usage: go run fibonacci.go <n>")
		os.Exit(1)
	}
	n, err := strconv.Atoi(os.Args[1])
	if err != nil {
		fmt.Println("Invalid integer argument.")
		os.Exit(1)
	}
	fmt.Println(fibonacci(n))
}
