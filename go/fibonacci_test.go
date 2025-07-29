package main

import "testing"

func TestFibonacci(t *testing.T) {
	cases := []struct {
		n     int
		expect int
	}{
		{0, 0},
		{1, 1},
		{2, 1},
		{3, 2},
		{5, 5},
		{10, 55},
		{20, 6765},
	}
	for _, c := range cases {
		if got := fibonacci(c.n); got != c.expect {
			t.Errorf("fibonacci(%d) = %d; want %d", c.n, got, c.expect)
		}
	}
}

func TestFibonacciNegative(t *testing.T) {
	if got := fibonacci(-1); got != 0 {
		t.Errorf("fibonacci(-1) = %d; want 0", got)
	}
}
