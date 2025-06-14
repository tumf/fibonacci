#!/bin/sh
# Calculates the Nth Fibonacci number.
# Usage: ./fibonacci.sh N
# Returns -1 for negative input, error for non-integer input.

if [ $# -ne 1 ]; then
  echo "Usage: $0 N" >&2
  exit 1
fi

case $1 in
  ''|*[!0-9]*)
    if [ "$1" -lt 0 ] 2>/dev/null; then
      echo -1
      exit 0
    fi
    echo "Error: Input must be a non-negative integer" >&2
    exit 1
    ;;
  *)
    n=$1
    ;;
esac

if [ "$n" -lt 0 ]; then
  echo -1
  exit 0
elif [ "$n" -eq 0 ]; then
  echo 0
  exit 0
elif [ "$n" -eq 1 ]; then
  echo 1
  exit 0
fi

a=0
b=1
count=2
while [ $count -le $n ]; do
  fn=$((a + b))
  a=$b
  b=$fn
  count=$((count + 1))
done
echo $b
