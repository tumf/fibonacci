#!/bin/sh
# fibonacci.sh - Print the first N Fibonacci numbers
# Usage: ./fibonacci.sh N
# Example: ./fibonacci.sh 10
# Output: 0 1 1 2 3 5 8 13 21 34

if [ $# -ne 1 ]; then
  echo "Usage: $0 N"
  exit 1
fi

N=$1
a=0
b=1

if [ "$N" -le 0 ]; then
  exit 0
fi

for i in $(seq 1 "$N"); do
  echo -n "$a "
  fn=$((a + b))
  a=$b
  b=$fn
done
echo