#!/bin/bash
# Test script for fibonacci.cpp
set -e

g++ -o fibonacci_cpp fibonacci.cpp

declare -A tests
# Format: [input]=expected_output
tests=(
  [0]=0
  [1]=1
  [2]=1
  [5]=5
  [10]=55
  [20]=6765
  [30]=832040
  [-1]=-1
)

all_passed=1
for n in "${!tests[@]}"; do
  expected=${tests[$n]}
  output=$(./fibonacci_cpp $n)
  if [[ "$output" == "$expected" ]]; then
    echo "Test n=$n: PASS"
  else
    echo "Test n=$n: FAIL (got $output, expected $expected)"
    all_passed=0
  fi
done

exit $((1-all_passed))