#!/bin/bash
set -e
GPP=$(command -v g++)
if [ -z "$GPP" ]; then
  echo "g++ not found. Please install g++ to run C++ tests."
  exit 1
fi

g++ -std=c++11 -o fibonacci_cpp fibonacci.cpp

declare -a cases=(
  "0 0"
  "1 1"
  "2 1"
  "5 5"
  "10 55"
  "20 6765"
  "30 832040"
)

fail=0
for case in "${cases[@]}"; do
  set -- $case
  n=$1
  expected=$2
  output=$(./fibonacci_cpp $n)
  if [ "$output" != "$expected" ]; then
    echo "Test failed: n=$n, expected $expected, got $output"
    fail=1
  fi
done

# Negative test
if ./fibonacci_cpp -1 2>&1 | grep -q "Negative input not allowed"; then
  echo "Negative input test passed"
else
  echo "Negative input test failed"
  fail=1
fi

if [ $fail -eq 0 ]; then
  echo "All tests passed."
  exit 0
else
  echo "Some tests failed."
  exit 1
fi
